package o000O0;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.provider.FontsContractCompat$FontRequestCallback;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FontsContractCompat$FontRequestCallback f28046OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Handler f28047OooO0O0;

    public OooO0OO(@NonNull FontsContractCompat$FontRequestCallback fontsContractCompat$FontRequestCallback, @NonNull Handler handler) {
        this.f28046OooO00o = fontsContractCompat$FontRequestCallback;
        this.f28047OooO0O0 = handler;
    }

    public final void OooO00o(@NonNull OooOo00.OooO00o oooO00o) {
        int i = oooO00o.f28071OooO0O0;
        if (!(i == 0)) {
            this.f28047OooO0O0.post(new OooO0O0(this.f28046OooO00o, i));
        } else {
            this.f28047OooO0O0.post(new OooO00o(this.f28046OooO00o, oooO00o.f28070OooO00o));
        }
    }
}
