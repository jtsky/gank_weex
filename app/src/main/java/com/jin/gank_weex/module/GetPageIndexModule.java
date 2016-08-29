package com.jin.gank_weex.module;

import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;

/**
 * Created by wlw-97 on 2016/8/10.
 */

public class GetPageIndexModule extends WXModule {
    private static final String TAG = "GetPageIndexModule";


    @WXModuleAnno
    public void getIndex(JSCallback callback) {
        callback.invoke("");
    }
}
