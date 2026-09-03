package o000OO;

import androidx.annotation.NonNull;
import com.zego.zegoavkit2.ZegoConstants;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o<F, S> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final F f34374OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final S f34375OooO0O0;

    public OooO0o(F f, S s) {
        this.f34374OooO00o = f;
        this.f34375OooO0O0 = s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        OooO0o oooO0o = (OooO0o) obj;
        return OooO0OO.OooO00o(oooO0o.f34374OooO00o, this.f34374OooO00o) && OooO0OO.OooO00o(oooO0o.f34375OooO0O0, this.f34375OooO0O0);
    }

    public final int hashCode() {
        F f = this.f34374OooO00o;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s = this.f34375OooO0O0;
        return (s != null ? s.hashCode() : 0) ^ iHashCode;
    }

    @NonNull
    public final String toString() {
        return "Pair{" + this.f34374OooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream + this.f34375OooO0O0 + "}";
    }
}
