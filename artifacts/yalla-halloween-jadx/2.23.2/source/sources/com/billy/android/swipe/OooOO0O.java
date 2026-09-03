package com.billy.android.swipe;

import p148o00Oo0O.o00000O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f12887OooO00o;

    public OooOO0O(OooOOO0 oooOOO0) {
        this.f12887OooO00o = oooOOO0;
    }

    @Override // p148o00Oo0O.o00000O, p148o00Oo0O.o00000OO
    public final void OooO0o0(int i) {
        OooOOO0 oooOOO0 = this.f12887OooO00o;
        oooOOO0.f12900OooOOO = (~i) & oooOOO0.f12900OooOOO;
        oooOOO0.f12905OooOOo0.remove(this);
    }
}
