package o0000O0;

import androidx.core.provider.FontsContractCompat$FontRequestCallback;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FontsContractCompat$FontRequestCallback f33537OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f33538OooO0o0;

    public OooO0O0(FontsContractCompat$FontRequestCallback fontsContractCompat$FontRequestCallback, int i) {
        this.f33537OooO0Oo = fontsContractCompat$FontRequestCallback;
        this.f33538OooO0o0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.core.content.res.OooO00o.OooO oooO = ((o00000oO.OooOOOO.OooO00o) this.f33537OooO0Oo).f33486OooO00o;
        if (oooO != null) {
            oooO.OooO0OO(this.f33538OooO0o0);
        }
    }
}
