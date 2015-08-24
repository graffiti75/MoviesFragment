package com.example.rodrigo.moviesfragment.fragments;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.example.rodrigo.moviesfragment.R;
import com.example.rodrigo.moviesfragment.activity.MovieDetailsActivity;
import com.example.rodrigo.moviesfragment.adapter.MovieAdapter;
import com.example.rodrigo.moviesfragment.data.ListItems;
import com.example.rodrigo.moviesfragment.manager.ContentManager;
import com.example.rodrigo.moviesfragment.model.Movie;
import com.example.rodrigo.moviesfragment.utils.FragmentUtils;

import java.util.ArrayList;

/**
 * MovieListFragment.java class.
 * 
 * @author Rodrigo Cericatto
 * @since 04/01/2014
 */
public class MovieListFragment extends Fragment implements OnItemClickListener {

	//--------------------------------------------------
	// Attributes 
	//--------------------------------------------------

	private ListView mListView;
	
	//--------------------------------------------------
	// Fragment Life Cycle
	//--------------------------------------------------
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// Updates the view layout.
		View view = inflater.inflate(R.layout.movie_list_fragment, null);
		view.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
		
		// Sets the list view adapter.
		setAdapter(view);
		
		return view;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		if (savedInstanceState != null) {
			showDetails();
		}
	}
	
	//--------------------------------------------------
	// Listeners
	//--------------------------------------------------
	
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		ContentManager.getInstance().setCachedPosition(position);
		showDetails();
	}
	
	//--------------------------------------------------
	// Methods
	//--------------------------------------------------
	
	/**
	 * Sets the fragment list view adapter.
	 * 
	 * @param view The fragment view.
	 */
	public void setAdapter(View view) {
		mListView = (ListView)view.findViewById(R.id.id_movie_list_fragment_list_view);
		mListView.setOnItemClickListener(this);
		ArrayList<Movie> list = new ArrayList<Movie>();
		for (int i = 0; i < ListItems.NAME.length; i++) {
			list.add(new Movie(ListItems.NAME[i], ListItems.YEAR[i]));
		}
		mListView.setAdapter(new MovieAdapter(getActivity(), list));
	}
	
	/**
	 * Show MovieDetails fragment or activity.  
	 */
	public void showDetails() {
		// Checks the right linear layout.
		View rightLinearLayout = getActivity().findViewById(R.id.id_movie_list_activity_right_linear_layout);
		if (rightLinearLayout != null) {
			// If right linear layout is null, refreshes the right layout fragment.
			FragmentUtils.switchFragment(getActivity(), new MovieDetailsFragment(),
				R.id.id_movie_list_activity_right_linear_layout, false);
		} else {
			// Else, starts a new activity. Only goes for the next activity if some
			// movie was selected.
			Intent intent = new Intent(getActivity(), MovieDetailsActivity.class);
			intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(intent);
		}
	}
}