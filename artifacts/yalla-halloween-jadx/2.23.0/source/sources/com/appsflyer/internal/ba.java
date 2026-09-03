package com.appsflyer.internal;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public final class ba implements az {
    private final SharedPreferences AFKeystoreWrapper;

    public ba(SharedPreferences sharedPreferences) {
        this.AFKeystoreWrapper = sharedPreferences;
    }

    @Override // com.appsflyer.internal.az
    public final boolean AFInAppEventType(String str) {
        return this.AFKeystoreWrapper.getBoolean(str, false);
    }

    @Override // com.appsflyer.internal.az
    public final void AFKeystoreWrapper(String str) {
        this.AFKeystoreWrapper.edit().putBoolean(str, true).apply();
    }
}
