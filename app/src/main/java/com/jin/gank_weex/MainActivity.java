package com.jin.gank_weex;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.jin.gank_weex.fragment.ImgFragment;
import com.jin.gank_weex.fragment.MyFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";
    @Bind(R.id.smartTabLayout)
    SmartTabLayout mSmartTabLayout;
    @Bind(R.id.viewpager)
    ViewPager mViewpager;


    @Override
    protected int provideContentViewId() {
        return R.layout.activity_main;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add(getmCategoryArray()[0], ImgFragment.class)
                .add(getmCategoryArray()[1], MyFragment.class)
                .add(getmCategoryArray()[2], MyFragment.class)
                .add(getmCategoryArray()[3], MyFragment.class)
                .add(getmCategoryArray()[4], MyFragment.class)
                .add(getmCategoryArray()[5], MyFragment.class)
                .add(getmCategoryArray()[6], MyFragment.class)
                .create());
        mViewpager.setAdapter(adapter);
        mViewpager.setOffscreenPageLimit(adapter.getCount());//设置ViewPager缓存个数
        mSmartTabLayout.setViewPager(mViewpager);
    }







}
