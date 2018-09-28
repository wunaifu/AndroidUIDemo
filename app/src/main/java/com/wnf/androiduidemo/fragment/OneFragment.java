package com.wnf.androiduidemo.fragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.wnf.androiduidemo.R;


/**
 * Created by wunaifu on 2017/4/28.
 */
public class OneFragment extends Fragment{

    private View view = null;
    private LinearLayout ll_finish;
    private LinearLayout ll_updatepsw;
    private LinearLayout ll_logout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=new View(getActivity());
        view = inflater.inflate(R.layout.fragment_one, container, false);
        Log.d("activityID", "这个是SettingsFragment ----- : " + this.toString());

        return view;
    }


}
