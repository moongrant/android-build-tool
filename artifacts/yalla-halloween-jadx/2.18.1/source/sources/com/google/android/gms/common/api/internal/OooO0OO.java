package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.base.zaq;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements BackgroundDetector.BackgroundStateChangeListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ GoogleApiManager f15287OooO00o;

    public OooO0OO(GoogleApiManager googleApiManager) {
        this.f15287OooO00o = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        zaq zaqVar = this.f15287OooO00o.f15244OoooOoO;
        zaqVar.sendMessage(zaqVar.obtainMessage(1, Boolean.valueOf(z)));
    }
}
