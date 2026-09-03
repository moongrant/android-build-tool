package com.app.base.Function;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f11338Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f11339Oooo0oO;

    public OooO00o(OooO0O0 oooO0O0, int i) {
        this.f11339Oooo0oO = oooO0O0;
        this.f11338Oooo0o = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OooO0O0.InterfaceC0074OooO0O0 interfaceC0074OooO0O0;
        OooO0O0 oooO0O0 = this.f11339Oooo0oO;
        boolean z = oooO0O0.f11348OooO0oo;
        if (z) {
            if (z) {
                oooO0O0.f11340OooO = 2;
                oooO0O0.f11349OooOO0 = this.f11338Oooo0o;
                return;
            }
            return;
        }
        oooO0O0.f11347OooO0oO = false;
        if (this.f11338Oooo0o == 0 && (interfaceC0074OooO0O0 = oooO0O0.f11342OooO0O0) != null) {
            interfaceC0074OooO0O0.OooO0O0();
        }
        OooO0O0 oooO0O1 = this.f11339Oooo0oO;
        oooO0O1.f11343OooO0OO.setBackgroundResource(oooO0O1.f11344OooO0Oo[this.f11338Oooo0o]);
        int i = this.f11338Oooo0o;
        OooO0O0 oooO0O2 = this.f11339Oooo0oO;
        if (i != oooO0O2.f11345OooO0o) {
            oooO0O2.f11343OooO0OO.postDelayed(new OooO00o(oooO0O2, i + 1), oooO0O2.f11346OooO0o0);
            return;
        }
        OooO0O0.InterfaceC0074OooO0O0 interfaceC0074OooO0O1 = oooO0O2.f11342OooO0O0;
        if (interfaceC0074OooO0O1 != null) {
            interfaceC0074OooO0O1.OooO0OO();
        }
        OooO0O0 oooO0O3 = this.f11339Oooo0oO;
        oooO0O3.f11347OooO0oO = true;
        oooO0O3.f11343OooO0OO.postDelayed(new OooO00o(oooO0O3, 0), oooO0O3.f11346OooO0o0);
    }
}
