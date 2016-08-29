package com.jin.gank_weex.module;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;

/**
 * Created by wlw-97 on 2016/8/10.
 */

public class URLHelperModule extends WXModule {
    private static final String TAG = "URLHelperModule";
    private static final String WEEX_CATEGORY = "com.taobao.android.intent.category.WEEX";

    @WXModuleAnno
    public void openURL(String url) {
        if (TextUtils.isEmpty(url)) {
            return;
        }
        StringBuilder builder = new StringBuilder("http:");
        builder.append(url);
        Uri uri = Uri.parse(builder.toString());
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.addCategory(WEEX_CATEGORY);
        mWXSDKInstance.getContext().startActivity(intent);
    }
}
