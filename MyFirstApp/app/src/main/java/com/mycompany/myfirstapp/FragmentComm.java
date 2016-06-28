package com.mycompany.myfirstapp;

import android.app.ListFragment;

/**
 * Created by colin on 6/28/16.
 */
public class HeadlinesFragment extends ListFragment {
    OnHeadlineSelectedListener mCallback;

    //Container Activity must implement this interface
    public interface OnHeadlineSelected(int position)
}

@Override
public  void onAttach(Activity activity){
    super.onAttach(activity);
    //This makes sure the container activity has implemneted
    //the callback interface. If not, it throws an exception
    try{
        mCallback = (OnHeadlineSelectedListener) activity;
    } catch (ClassCastException e){
        throw new ClassCastException(activity.toString)+ "must implement OnHeadLineSelectedListener");
    }
}

