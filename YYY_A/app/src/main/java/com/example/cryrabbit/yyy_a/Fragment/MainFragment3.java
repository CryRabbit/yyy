package com.example.cryrabbit.yyy_a.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cryrabbit.yyy_a.R;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;

import java.io.FileInputStream;

/**
 * Created by CryRabbit on 2016/4/6.
 */
public class MainFragment3 extends Fragment{
    @ViewInject(R.id.main_fragment_text_test)
    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.main_fragment_test,container,false);
        ViewUtils.inject(this, view);
        textView.setText("33333333333333");
        return view;
    }
}
