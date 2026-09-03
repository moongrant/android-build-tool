package com.facebook.appevents.internal;

import com.facebook.internal.FeatureManager;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO0o implements FeatureManager.Callback {
    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        ActivityLifecycleTracker.m4096startTracking$lambda0(z);
    }
}
