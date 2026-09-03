package com.facebook.login;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooOOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f12888Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f12889OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f12890OoooO00;

    public /* synthetic */ OooOOO0(Object obj, Object obj2, int i) {
        this.f12888Oooo = i;
        this.f12890OoooO00 = obj;
        this.f12889OoooO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12888Oooo) {
            case 0:
                LoginLogger.m228logHeartbeatEvent$lambda0((LoginLogger) this.f12890OoooO00, (Bundle) this.f12889OoooO0);
                break;
            default:
                com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o c0097OooO00o = (com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o) this.f12890OoooO00;
                ((com.google.android.exoplayer2.drm.OooO00o) this.f12889OoooO0).OooOOOo(c0097OooO00o.f13738OooO00o, c0097OooO00o.f13739OooO0O0);
                break;
        }
    }
}
