package p022Oooo00O;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oo00oO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f903OooO0O0 = false;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final o0oOOo f902OooO00o = new o0oOOo();

    public oo00oO(@NonNull o0Oo0oo o0oo0oo2) {
    }

    public final void OooO00o(boolean z) {
        if (z == this.f903OooO0O0) {
            return;
        }
        this.f903OooO0O0 = z;
        if (z) {
            return;
        }
        o0oOOo o0oooo = this.f902OooO00o;
        synchronized (o0oooo.f884OooO00o) {
            o0oooo.f885OooO0O0 = 0;
        }
    }
}
