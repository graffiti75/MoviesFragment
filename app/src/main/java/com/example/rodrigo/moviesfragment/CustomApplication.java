package com.example.rodrigo.moviesfragment;

import android.app.Application;

import com.example.rodrigo.moviesfragment.manager.ContentManager;

/**
 * CustomApplication.java class.
 * 
 * @author Rodrigo Cericatto
 * @since 05/01/2014
 */
public class CustomApplication extends Application {
	
	//--------------------------------------------------
	// Application Life Cycle Methods
	//--------------------------------------------------
	
	@Override
	public void onCreate() {
		super.onCreate();
		// Initializing the content manager.
		ContentManager.getInstance().setContext(this);
	}
	
	@Override
	public void onLowMemory() {}
	
	@Override
	public void onTerminate() {}
}