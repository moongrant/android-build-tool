package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.base.zaq;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO implements BackgroundDetector.BackgroundStateChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ GoogleApiManager f14310OooO00o;

    public OooO0OO(GoogleApiManager googleApiManager) {
        this.f14310OooO00o = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        zaq zaqVar = this.f14310OooO00o.f14269OooOOo0;
        zaqVar.sendMessage(zaqVar.obtainMessage(1, Boolean.valueOf(z)));
    }
}
