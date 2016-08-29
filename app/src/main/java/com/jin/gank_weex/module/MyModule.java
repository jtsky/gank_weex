package com.jin.gank_weex.module;

import android.widget.Toast;

import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;

/**
 * Created by wlw-97 on 2016/8/10.
 */

public class MyModule extends WXModule {

    @WXModuleAnno(runOnUIThread = true)
    public void printLog(String msg) {
        Toast.makeText(mWXSDKInstance.getContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
