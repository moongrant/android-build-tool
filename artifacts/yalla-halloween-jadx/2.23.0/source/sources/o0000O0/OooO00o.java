package o0000O0;

import android.graphics.Typeface;
import androidx.core.provider.FontsContractCompat$FontRequestCallback;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FontsContractCompat$FontRequestCallback f34047OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Typeface f34048OooO0o0;

    public OooO00o(FontsContractCompat$FontRequestCallback fontsContractCompat$FontRequestCallback, Typeface typeface) {
        this.f34047OooO0Oo = fontsContractCompat$FontRequestCallback;
        this.f34048OooO0o0 = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.core.content.res.OooO00o.OooO oooO = ((o00000oO.OooOOOO.OooO00o) this.f34047OooO0Oo).f33998OooO00o;
        if (oooO != null) {
            oooO.OooO0Oo(this.f34048OooO0o0);
        }
    }
}
