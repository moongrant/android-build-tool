package o0000O0;

import android.graphics.Typeface;
import androidx.core.provider.FontsContractCompat$FontRequestCallback;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FontsContractCompat$FontRequestCallback f33535OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Typeface f33536OooO0o0;

    public OooO00o(FontsContractCompat$FontRequestCallback fontsContractCompat$FontRequestCallback, Typeface typeface) {
        this.f33535OooO0Oo = fontsContractCompat$FontRequestCallback;
        this.f33536OooO0o0 = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.core.content.res.OooO00o.OooO oooO = ((o00000oO.OooOOOO.OooO00o) this.f33535OooO0Oo).f33486OooO00o;
        if (oooO != null) {
            oooO.OooO0Oo(this.f33536OooO0o0);
        }
    }
}
