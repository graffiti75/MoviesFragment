package com.example.rodrigo.moviesfragment.activity;

import android.app.Activity;
import android.os.Bundle;

import com.example.rodrigo.moviesfragment.R;
import com.example.rodrigo.moviesfragment.fragments.MovieListFragment;
import com.example.rodrigo.moviesfragment.utils.FragmentUtils;

/**
 * FragmentUtils.java class.
 * 
 * @author Rodrigo Cericatto
 * @since 04/01/2014
 */
public class MovieListActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.movie_list_activity);

		// Does nothing because MovieListFragment does everything.
		if (savedInstanceState == null) {
			// Inserts only at the first time, because the FragmentTransaction
			// persists among the change of orientation.
			FragmentUtils.switchFragment(this, new MovieListFragment(),
				R.id.id_movie_list_activity_linear_layout);
		}
	}
}