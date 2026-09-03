package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class bv extends f {
    public boolean onAppOpenAttribution;
    private final boolean onAppOpenAttributionNative;
    private final boolean onDeepLinkingNative;

    public bv() {
        this(null, null, null, null, null, null);
    }

    public final String AFLogger$LogLevel() {
        return n.AFKeystoreWrapper(AFKeystoreWrapper()).toString();
    }

    public final boolean AFVersionDeclaration() {
        return this.onAppOpenAttribution;
    }

    public final boolean AppsFlyer2dXConversionCallback() {
        return this.onDeepLinkingNative;
    }

    public final boolean getLevel() {
        return this.onAppOpenAttributionNative;
    }

    public bv(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Context context) {
        super(str, str2, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false), context);
        this.onDeepLinkingNative = bool != null ? bool.booleanValue() : true;
        this.onAppOpenAttributionNative = bool2 != null ? bool2.booleanValue() : true;
    }
}
