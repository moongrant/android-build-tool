package com.facebook.login;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooOOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f12872Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f12873Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f12874Oooo0oo;

    public /* synthetic */ OooOOO0(Object obj, Object obj2, int i) {
        this.f12872Oooo0o = i;
        this.f12873Oooo0oO = obj;
        this.f12874Oooo0oo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12872Oooo0o) {
            case 0:
                LoginLogger.m228logHeartbeatEvent$lambda0((LoginLogger) this.f12873Oooo0oO, (Bundle) this.f12874Oooo0oo);
                break;
            default:
                com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o c0097OooO00o = (com.google.android.exoplayer2.drm.OooO00o.C0097OooO00o) this.f12873Oooo0oO;
                ((com.google.android.exoplayer2.drm.OooO00o) this.f12874Oooo0oo).OooOOOo(c0097OooO00o.f13720OooO00o, c0097OooO00o.f13721OooO0O0);
                break;
        }
    }
}
