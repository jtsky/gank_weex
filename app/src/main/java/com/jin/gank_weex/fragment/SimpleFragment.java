package com.jin.gank_weex.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.alibaba.weex.commons.AbstractWeexFragment;
import com.jin.gank_weex.R;
import com.taobao.weex.WXSDKInstance;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2015/8/25.
 */
public class SimpleFragment extends AbstractWeexFragment {
    @Bind(R.id.container)
    FrameLayout mContainer;

    public String[] getmCategoryArray() {
        return mCategoryArray;
    }

    private String[] mCategoryArray;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCategoryArray = getResources().getStringArray(R.array.category_list);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        container = (ViewGroup) inflater.inflate(R.layout.fragment_index, null, false);
        ButterKnife.bind(this, container);
        setContainer(mContainer);

        return container;
    }

    @Override
    public void onRenderSuccess(WXSDKInstance instance, int width, int height) {

    }

    @Override
    public void onException(WXSDKInstance instance, String errCode, String msg) {

    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
