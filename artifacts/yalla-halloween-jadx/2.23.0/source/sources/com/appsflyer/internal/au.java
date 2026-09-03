package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class au {
    public final SharedPreferences AFInAppEventParameterName;
    public final Application AFInAppEventType;
    public final Map<String, Object> AFKeystoreWrapper = new ConcurrentHashMap();

    public au(Context context) {
        Application application = (Application) context.getApplicationContext();
        this.AFInAppEventType = application;
        this.AFInAppEventParameterName = ag.AFInAppEventParameterName(application);
    }

    public final boolean AFInAppEventType() {
        ag.AFInAppEventType();
        return ag.AFInAppEventType(this.AFInAppEventParameterName, "appsFlyerCount", false) == 0;
    }
}
