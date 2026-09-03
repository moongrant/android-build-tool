package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cc extends cj {
    public cc(String str, Runnable runnable) {
        super(str, runnable);
    }

    public final void AFKeystoreWrapper(Context context, at<Map<String, Object>> atVar) {
        ag.AFInAppEventType();
        if (ag.AFInAppEventType(ag.AFInAppEventParameterName(context), "appsFlyerCount", false) > 0 || !atVar.AFInAppEventType()) {
            return;
        }
        new Thread(atVar.valueOf).start();
        valueOf();
    }
}
