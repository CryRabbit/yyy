package com.example.cryrabbit.yyy_a;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import com.example.cryrabbit.yyy_a.Fragment.MainFragment1;
import com.example.cryrabbit.yyy_a.Fragment.MainFragment2;
import com.example.cryrabbit.yyy_a.Fragment.MainFragment3;
import com.example.cryrabbit.yyy_a.Fragment.MainFragment4;

/**
 * Created by CryRabbit on 2016/4/7.
 */
public class MyFragmentAdapter extends FragmentPagerAdapter{
    private final int PAGER_COUNT=4;
    private MainFragment1 mainFragment1=null;
    private MainFragment2 mainFragment2=null;
    private MainFragment3 mainFragment3=null;
    private MainFragment4 mainFragment4=null;
    public MyFragmentAdapter(FragmentManager fm) {
        super(fm);
        mainFragment1=new MainFragment1();
        mainFragment2=new MainFragment2();
        mainFragment3=new MainFragment3();
        mainFragment4=new MainFragment4();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position){
            case 0:
                fragment=mainFragment1;
                break;
            case 1:
                fragment=mainFragment2;
                break;
            case 2:
                fragment=mainFragment3;
                break;
            case 3:
                fragment=mainFragment4;
                break;
        }
        return fragment;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }

    @Override
    public int getCount() {
        return PAGER_COUNT;
    }
}
