package o000O0;

import android.graphics.Typeface;
import androidx.core.provider.FontsContractCompat$FontRequestCallback;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ FontsContractCompat$FontRequestCallback f28042Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Typeface f28043Oooo0oO;

    public OooO00o(FontsContractCompat$FontRequestCallback fontsContractCompat$FontRequestCallback, Typeface typeface) {
        this.f28042Oooo0o = fontsContractCompat$FontRequestCallback;
        this.f28043Oooo0oO = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FontsContractCompat$FontRequestCallback fontsContractCompat$FontRequestCallback = this.f28042Oooo0o;
        Typeface typeface = this.f28043Oooo0oO;
        androidx.core.content.res.OooO00o.OooO oooO = ((o000O0o.OooOOO0.OooO00o) fontsContractCompat$FontRequestCallback).f28177OooO00o;
        if (oooO != null) {
            oooO.OooO0o0(typeface);
        }
    }
}
