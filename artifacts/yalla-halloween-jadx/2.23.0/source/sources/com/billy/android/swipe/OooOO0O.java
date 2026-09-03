package com.billy.android.swipe;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends p122o00O0o0O.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f9796OooO00o;

    public OooOO0O(OooOOO0 oooOOO0) {
        this.f9796OooO00o = oooOOO0;
    }

    @Override // p122o00O0o0O.OooO0O0, p122o00O0o0O.OooO0OO
    public final void OooO0o0(int i) {
        OooOOO0 oooOOO0 = this.f9796OooO00o;
        oooOOO0.f9809OooOOO = (~i) & oooOOO0.f9809OooOOO;
        oooOOO0.f9814OooOOo0.remove(this);
    }
}
