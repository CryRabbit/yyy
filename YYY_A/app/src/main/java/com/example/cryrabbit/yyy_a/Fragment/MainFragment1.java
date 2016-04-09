package com.example.cryrabbit.yyy_a.Fragment;

import android.support.v4.app.Fragment;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.cryrabbit.yyy_a.R;

/**
 * Created by CryRabbit on 2016/4/6.
 */
public class MainFragment1 extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.main_fragment1,container,false);
        return view;
    }
}
