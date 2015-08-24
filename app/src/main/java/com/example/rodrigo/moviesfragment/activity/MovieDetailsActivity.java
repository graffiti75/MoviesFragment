package com.example.rodrigo.moviesfragment.activity;

import android.app.Activity;
import android.os.Bundle;

import com.example.rodrigo.moviesfragment.R;
import com.example.rodrigo.moviesfragment.fragments.MovieDetailsFragment;
import com.example.rodrigo.moviesfragment.fragments.MovieListFragment;
import com.example.rodrigo.moviesfragment.utils.FragmentUtils;
import com.example.rodrigo.moviesfragment.utils.OrientationUtils;

/**
 * MovieDetailsActivity.java class.
 * 
 * @author Rodrigo Cericatto
 * @since 04/01/2014
 */
public class MovieDetailsActivity extends Activity {

	//--------------------------------------------------
	// Fragment Life Cycle
	//--------------------------------------------------
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.movie_details_activity);
		
		// Inserts only at the first time, because the FragmentTransaction
		// persists among the change of orientation.
		if (savedInstanceState == null) {
			// Does nothing because MovieDetailsFragment does everything.
			FragmentUtils.switchFragment(this, new MovieDetailsFragment(),
				R.id.id_movie_details_activity_linear_layout);
		} else {
			// If the orientation is horizontal, changes layouts of fragments.
			if (OrientationUtils.isHorizontal(this)) {
				updatesFragmentsLayout();
			}
		}
	}

	//--------------------------------------------------
	// Methods
	//--------------------------------------------------
	
	/**
	 * If the orientation is horizontal, updates fragments layout.
	 */
	public void updatesFragmentsLayout() {
		// Changes linear layouts fragments.
		FragmentUtils.switchFragment(this, new MovieListFragment(),
			R.id.id_movie_list_activity_linear_layout, false);
		FragmentUtils.switchFragment(this, new MovieDetailsFragment(),
			R.id.id_movie_list_activity_right_linear_layout);
	}
}