package com.facebook.appevents;

import com.facebook.internal.NativeProtocol;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final /* synthetic */ OooOO0O f12716Oooo0oO = new OooOO0O(0);

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final /* synthetic */ OooOO0O f12717Oooo0oo = new OooOO0O(1);

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f12718Oooo0o;

    public /* synthetic */ OooOO0O(int i) {
        this.f12718Oooo0o = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12718Oooo0o) {
            case 0:
                AppEventQueue.m114flushRunnable$lambda0();
                break;
            default:
                NativeProtocol.m190updateAllAvailableProtocolVersionsAsync$lambda1();
                break;
        }
    }
}
