package org.cocos2dx.lib.out.event;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class YLGiftEventDispatch {
    private static final String TAG = "YLGiftEventDispatch";

    public static void dispatchGiftCallback() {
        Log.e("YLGiftQueue", TAG);
        YLGiftEventManager.getInstance().handleEvent(YLGiftEventManager.KEY_GIFT_EVENT, new Object[0]);
    }
}
