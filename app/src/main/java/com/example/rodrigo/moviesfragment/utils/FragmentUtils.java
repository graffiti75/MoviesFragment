package com.example.rodrigo.moviesfragment.utils;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;

/**
 * FragmentUtils.java class.
 * 
 * @author Rodrigo Cericatto
 * @since 04/01/2014
 */
public class FragmentUtils extends Activity {
	
	/**
	 * Switch current fragment for an other fragment.
	 * 
	 * @param activity The activity context.
	 * @param fragment The new fragment.
	 * @param layoutId The layout id of the new fragment.
	 */
	public static void switchFragment(Activity activity, Fragment fragment, Integer layoutId) {
		switchFragment(activity, fragment, layoutId, true);
	}
	
	/**
	 * Switch current fragment for an other fragment.
	 * 
	 * @param activity The activity context.
	 * @param fragment The new fragment.
	 * @param layoutId The layout id of the new fragment.
	 * @param addFragment The boolean option to be filtered between add
	 * 					  or replace a fragment. If true, it will be chosen
	 * 					  the 'add' option. Otherwise, the 'replace' option.
	 */
	public static void switchFragment(Activity activity, Fragment fragment,
		Integer layoutId, Boolean addFragment) {
		FragmentTransaction transaction = activity.getFragmentManager().beginTransaction();

		// Changes current fragment for our fragment.
		if (addFragment) {
			transaction.add(layoutId, fragment);
		} else {
			transaction.replace(layoutId, fragment);
		}
		transaction.commit();
	}
}