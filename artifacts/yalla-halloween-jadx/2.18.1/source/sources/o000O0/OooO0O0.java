package o000O0;

import androidx.core.provider.FontsContractCompat$FontRequestCallback;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ FontsContractCompat$FontRequestCallback f28044Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f28045Oooo0oO;

    public OooO0O0(FontsContractCompat$FontRequestCallback fontsContractCompat$FontRequestCallback, int i) {
        this.f28044Oooo0o = fontsContractCompat$FontRequestCallback;
        this.f28045Oooo0oO = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FontsContractCompat$FontRequestCallback fontsContractCompat$FontRequestCallback = this.f28044Oooo0o;
        int i = this.f28045Oooo0oO;
        androidx.core.content.res.OooO00o.OooO oooO = ((o000O0o.OooOOO0.OooO00o) fontsContractCompat$FontRequestCallback).f28177OooO00o;
        if (oooO != null) {
            oooO.OooO0Oo(i);
        }
    }
}
