package com.weex.sample;

import android.text.TextUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.adapter.IWXImgLoaderAdapter;
import com.taobao.weex.common.WXImageStrategy;
import com.taobao.weex.dom.WXImageQuality;

/**
 * Created by lixinke on 16/6/1.
 */
public class ImageAdapter implements IWXImgLoaderAdapter {


    @Override
    public void setImage(String url, ImageView view, WXImageQuality quality, WXImageStrategy strategy) {
        WXSDKManager.getInstance().postOnUiThread(() -> {
            if (view == null || view.getLayoutParams() == null) {
                return;
            }
            if (TextUtils.isEmpty(url)) {
                view.setImageBitmap(null);
                return;
            }
            String temp = url;
            if (url.startsWith("//")) {
                temp = "http:" + url;
            }
            if (view.getLayoutParams().width <= 0 || view.getLayoutParams().height <= 0) {
                return;
            }
            Glide.with(WXEnvironment.getApplication())
                    .load(temp)
                    .into(view);
        }, 0);
    }
}
