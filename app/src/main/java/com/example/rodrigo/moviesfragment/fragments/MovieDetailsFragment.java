package com.example.rodrigo.moviesfragment.fragments;

import android.app.Fragment;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

import com.example.rodrigo.moviesfragment.R;
import com.example.rodrigo.moviesfragment.data.ListItems;
import com.example.rodrigo.moviesfragment.manager.ContentManager;
import com.example.rodrigo.moviesfragment.model.Movie;

/**
 * MovieDetailsFragment.java class.
 * 
 * @author Rodrigo Cericatto
 * @since 04/01/2014
 */
public class MovieDetailsFragment extends Fragment {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------	

	private TextView mTextView;
	
	//--------------------------------------------------
	// Fragment Life Cycle
	//--------------------------------------------------
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// Updates the view layout.
		View view = inflater.inflate(R.layout.movie_details_fragment, null);
		mTextView = (TextView)view.findViewById(R.id.id_movie_details_fragment_text_view);
		view.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
		
		return view;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		// Updates the MovieDetailsFragment.
		Integer position = ContentManager.getInstance().getCachedPosition();
		Movie movie = new Movie(ListItems.NAME[position], ListItems.YEAR[position]);
		mTextView.setText(movie.toString());
	}
}