package o0000O0;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.provider.FontsContractCompat$FontRequestCallback;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FontsContractCompat$FontRequestCallback f34051OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Handler f34052OooO0O0;

    public OooO0OO(@NonNull o00000oO.OooOOOO.OooO00o oooO00o, @NonNull Handler handler) {
        this.f34051OooO00o = oooO00o;
        this.f34052OooO0O0 = handler;
    }

    public final void OooO00o(@NonNull OooOo00.OooO00o oooO00o) {
        int i = oooO00o.f34076OooO0O0;
        boolean z = i == 0;
        Handler handler = this.f34052OooO0O0;
        FontsContractCompat$FontRequestCallback fontsContractCompat$FontRequestCallback = this.f34051OooO00o;
        if (z) {
            handler.post(new OooO00o(fontsContractCompat$FontRequestCallback, oooO00o.f34075OooO00o));
        } else {
            handler.post(new OooO0O0(fontsContractCompat$FontRequestCallback, i));
        }
    }
}
