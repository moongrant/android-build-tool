package p019OooOoo0;

import android.os.IBinder;
import p008OooOOOo.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0O0 f375OooO00o;

    public o00oO0o(OooO0O0 oooO0O0) {
        this.f375OooO00o = oooO0O0;
    }

    public final IBinder OooO00o() {
        return this.f375OooO00o.asBinder();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o00oO0o) {
            return ((o00oO0o) obj).OooO00o().equals(this.f375OooO00o.asBinder());
        }
        return false;
    }

    public final int hashCode() {
        return OooO00o().hashCode();
    }
}
