package com.facebook.appevents.internal;

import android.database.Cursor;
import com.facebook.internal.FeatureManager;
import o0O0OOOo.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements FeatureManager.Callback, oo0o0Oo.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ OooO00o f12747OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ OooO00o f12748OooO0o0 = new OooO00o();

    @Override // o0O0OOOo.oo0o0Oo.OooO00o
    public final Object apply(Object obj) {
        o0O0O0Oo.OooO0O0 oooO0O0 = oo0o0Oo.f35695OoooO0;
        return Boolean.valueOf(((Cursor) obj).getCount() > 0);
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public final void onCompleted(boolean z) {
        ActivityLifecycleTracker.m149startTracking$lambda0(z);
    }
}
