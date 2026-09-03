package o0000O0;

import androidx.core.provider.FontsContractCompat$FontRequestCallback;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FontsContractCompat$FontRequestCallback f34049OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f34050OooO0o0;

    public OooO0O0(FontsContractCompat$FontRequestCallback fontsContractCompat$FontRequestCallback, int i) {
        this.f34049OooO0Oo = fontsContractCompat$FontRequestCallback;
        this.f34050OooO0o0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.core.content.res.OooO00o.OooO oooO = ((o00000oO.OooOOOO.OooO00o) this.f34049OooO0Oo).f33998OooO00o;
        if (oooO != null) {
            oooO.OooO0OO(this.f34050OooO0o0);
        }
    }
}
