package com.example.rodrigo.moviesfragment.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;

/**
 * OrientationUtils.java class.
 * 
 * @author Rodrigo Cericatto
 * @since 04/01/2014
 */
public class OrientationUtils {

	/**
	 * Gets the activity orientation.
	 * v
	 * @param context The activity context.
	 * @return The activity orientation.
	 */
	public static int getOrientation(Context context) {
		int orientation = context.getResources().getConfiguration().orientation;
		return orientation;
	}
	
	/**
	 * Checks if the activity is vertical.
	 * 
	 * @param context The activity context.
	 * @return True if the activity orientation is vertical.
	 */
	public static boolean isVertical(Context context) {
		int orientation = context.getResources().getConfiguration().orientation;
		boolean vertical = orientation == Configuration.ORIENTATION_PORTRAIT;
		return vertical;
	}

	/**
	 * Checks if the activity is horizontal.
	 * 
	 * @param context The activity context.
	 * @return True if the activity orientation is horizontal.
	 */
	public static boolean isHorizontal(Context context) {
		int orientation = context.getResources().getConfiguration().orientation;
		boolean horizontal = orientation == Configuration.ORIENTATION_LANDSCAPE;
		return horizontal;
	}
	
	/**
	 * Sets the activity orientation to vertical.
	 * 
	 * @param context The activity.
	 */
	public static void setVerticalOrientation(Activity context) {
		context.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	}

	/**
	 * Sets the activity orientation to horizontal.
	 * 
	 * @param context The activity.
	 */
	public static void setHorizontalOrientation(Activity context) {
		context.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
	}
}