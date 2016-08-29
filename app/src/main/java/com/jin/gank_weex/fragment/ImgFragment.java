package com.jin.gank_weex.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.taobao.weex.WXSDKInstance;

/**
 * Created by Administrator on 2015/8/25.
 */
public class ImgFragment extends SimpleFragment {
    private static final String TAG = "ImgFragment";
    private static String CURRENT_IP = "192.168.200.26"; // your_current_IP
    private static final String WEEX_INDEX_URL = "http://" + CURRENT_IP + "/static/javascripts/image.js";

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        container = (ViewGroup) super.onCreateView(inflater, container, savedInstanceState);
        renderPageByURL(WEEX_INDEX_URL);
        return container;
    }


    @Override
    public void onRenderSuccess(WXSDKInstance instance, int width, int height) {
    }

    @Override
    public void onException(WXSDKInstance instance, String errCode, String msg) {
        Log.e(TAG, "errCode======>" + errCode + "    msg=======>" + msg);
    }
}
