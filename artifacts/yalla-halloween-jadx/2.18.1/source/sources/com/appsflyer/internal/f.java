package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public final Map<String, Object> AFInAppEventParameterName;

    @Nullable
    public Map<String, Object> AFInAppEventType;

    @Nullable
    public AppsFlyerRequestListener AFKeystoreWrapper;
    public String AFLogger$LogLevel;
    public String AFVersionDeclaration;
    public String AppsFlyer2dXConversionCallback;
    public byte[] getLevel;
    public String init;
    public int onAttributionFailureNative;
    private final boolean onDeepLinkingNative;
    public boolean onInstallConversionDataLoadedNative;
    public String onInstallConversionFailureNative;

    @Nullable
    public String valueOf;

    @Nullable
    public Application values;

    public f() {
        this(null, null, null, null);
    }

    public final boolean AFInAppEventType() {
        return this.onInstallConversionDataLoadedNative;
    }

    public f AFKeystoreWrapper(String str) {
        this.onInstallConversionFailureNative = str;
        return this;
    }

    public final boolean valueOf() {
        return this.onDeepLinkingNative;
    }

    public final byte[] values() {
        return this.getLevel;
    }

    public f(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Context context) {
        this.AFInAppEventParameterName = new HashMap();
        this.AFLogger$LogLevel = str;
        this.onInstallConversionFailureNative = str2;
        this.onDeepLinkingNative = bool != null ? bool.booleanValue() : true;
        if (context != null) {
            this.values = (Application) context.getApplicationContext();
        }
    }

    public final f AFInAppEventType(Map<String, ?> map) {
        this.AFInAppEventParameterName.putAll(map);
        return this;
    }

    public final Map<String, Object> AFKeystoreWrapper() {
        return this.AFInAppEventParameterName;
    }

    @NonNull
    public final String values(String str) {
        String strAFInAppEventType = ag.AFInAppEventType().AFInAppEventType(this.values);
        return strAFInAppEventType != null ? Uri.parse(str).buildUpon().appendQueryParameter("channel", strAFInAppEventType).build().toString() : str;
    }
}
