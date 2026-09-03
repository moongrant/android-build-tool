package com.facebook.appevents;

import com.facebook.internal.NativeProtocol;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f12734Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static final /* synthetic */ OooOO0O f12733OoooO00 = new OooOO0O(0);

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final /* synthetic */ OooOO0O f12732OoooO0 = new OooOO0O(1);

    public /* synthetic */ OooOO0O(int i) {
        this.f12734Oooo = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12734Oooo) {
            case 0:
                AppEventQueue.m114flushRunnable$lambda0();
                break;
            default:
                NativeProtocol.m190updateAllAvailableProtocolVersionsAsync$lambda1();
                break;
        }
    }
}
