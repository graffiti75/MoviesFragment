package com.example.rodrigo.moviesfragment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.rodrigo.moviesfragment.R;
import com.example.rodrigo.moviesfragment.model.Movie;

import java.util.List;

/**
 * MovieAdapter.java class.
 * 
 * @author Rodrigo Cericatto
 * @since 04/01/2014
 */
public class MovieAdapter extends BaseAdapter {
	
	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	
	private Context mContext;
	private List<Movie> mList;

	//--------------------------------------------------
	// Constructor
	//--------------------------------------------------
	
	public MovieAdapter(Context context, List<Movie> list) {
		this.mContext = context;
		this.mList = list;
	}
	
	//--------------------------------------------------
	// ViewHolder
	//--------------------------------------------------
	
	static class ViewHolder {
		private TextView mTextView;
	}
	
	//--------------------------------------------------
	// Adapter
	//--------------------------------------------------
	
	public int getCount() {
		return mList.size();
	}
	
	public Object getItem(int posicao) {
		Movie movie = mList.get(posicao);
		return movie;
	}
	
	public long getItemId(int posicao) {
		return posicao;
	}
	
	public View getView(int posicao, View convertView, ViewGroup parent) {
		Movie movie = (Movie) getItem(posicao);
		ViewHolder viewHolder;
		View currentView = convertView;
		if (currentView == null) {
			LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			currentView = inflater.inflate(R.layout.row_layout, null);
			viewHolder = new ViewHolder();
			viewHolder.mTextView = (TextView)currentView.findViewById(R.id.id_row_layout_text_view);
			currentView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) currentView.getTag(); 
		}
		// Updates the value of the TextView.
		viewHolder.mTextView.setText(movie.getName());

		return currentView;
	}
}