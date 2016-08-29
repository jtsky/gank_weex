package com.jin.gank_weex;

import android.app.Application;

import com.jin.gank_weex.module.GetPageIndexModule;
import com.jin.gank_weex.module.MyModule;
import com.jin.gank_weex.module.URLHelperModule;
import com.taobao.weex.InitConfig;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

/**
 * 注意要在Manifest中启用
 * 参考manifest，否则会抛出ExceptionInInitializerError
 * 要实现ImageAdapter 否则图片不能下载
 * gradle 中一定要添加一些依赖，否则初始化会失败。
 * compile 'com.android.support:recyclerview-v7:23.1.1'
 * compile 'com.android.support:support-v4:23.1.1'
 * compile 'com.android.support:appcompat-v7:23.1.1'
 * compile 'com.alibaba:fastjson:1.1.45'
 */
public class WXApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        InitConfig config = new InitConfig.Builder()
                .setImgAdapter(new ImageAdapter())
                .build();
        WXSDKEngine.initialize(this, config);
        try {
            WXSDKEngine.registerModule("myModule", MyModule.class);
            WXSDKEngine.registerModule("myURL", URLHelperModule.class);
            WXSDKEngine.registerModule("indexModule", GetPageIndexModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }

        initDebugEnvironment(true, "192.168.200.26");

    }

    private void initDebugEnvironment(boolean enable, String host) {
        WXEnvironment.sRemoteDebugMode = enable;
        WXEnvironment.sRemoteDebugProxyUrl = "ws://" + host + ":8088/debugProxy/native";
    }
}
