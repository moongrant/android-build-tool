package com.bumptech.glide.manager;

import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f13149OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00O0O.OooO0o.OooO00o f13150OooO0o0;

    public o00Ooo(o00O0O.OooO0o.OooO00o oooO00o, boolean z) {
        this.f13150OooO0o0 = oooO00o;
        this.f13149OooO0Oo = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00O0O.OooO0o.OooO00o oooO00o = this.f13150OooO0o0;
        oooO00o.getClass();
        o00OO0O0.OooO00o();
        o00O0O.OooO0o oooO0o = o00O0O.OooO0o.this;
        boolean z = oooO0o.f13144OooO00o;
        boolean z2 = this.f13149OooO0Oo;
        oooO0o.f13144OooO00o = z2;
        if (z != z2) {
            oooO0o.f13145OooO0O0.OooO00o(z2);
        }
    }
}
