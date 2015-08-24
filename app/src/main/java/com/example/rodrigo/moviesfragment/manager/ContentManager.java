package com.example.rodrigo.moviesfragment.manager;

/**
 * ContentManager.java class.
 * 
 * @author Rodrigo Cericatto
 * @since 05/01/2014
 */
public class ContentManager {

	//----------------------------------------------
	// Statics
	//----------------------------------------------
	
	// The singleton instance.
	private static ContentManager sInstance = null;
	
	//----------------------------------------------
	// Attributes
	//----------------------------------------------

	// The fragment position.
	private Integer mPosition = 0;
	
	//----------------------------------------------
	// Constructor
	//----------------------------------------------
	
	/**
	 * Private constructor.
	 */
	private ContentManager() {}
	
	/**
	 * @return The singleton instance of ContentManager.
	 */
	public static ContentManager getInstance() {
		if (sInstance == null) {
			sInstance = new ContentManager();
		}
		return sInstance;
	}

	//----------------------------------------------
	// Position
	//----------------------------------------------

	/**
	 * Sets the position.
	 * 
	 * @return
	 */
	public void setCachedPosition(Integer position) {
		mPosition = position;
	}
	
	/**
	 * Gets the cached position.
	 * 
	 * @return
	 */
	public Integer getCachedPosition() {
		return mPosition;
	}
}