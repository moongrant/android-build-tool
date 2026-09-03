package o000OO;

import androidx.annotation.NonNull;
import com.zego.zegoavkit2.ZegoConstants;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o<F, S> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final F f34865OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final S f34866OooO0O0;

    public OooO0o(F f, S s) {
        this.f34865OooO00o = f;
        this.f34866OooO0O0 = s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        OooO0o oooO0o = (OooO0o) obj;
        return OooO0OO.OooO00o(oooO0o.f34865OooO00o, this.f34865OooO00o) && OooO0OO.OooO00o(oooO0o.f34866OooO0O0, this.f34866OooO0O0);
    }

    public final int hashCode() {
        F f = this.f34865OooO00o;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s = this.f34866OooO0O0;
        return (s != null ? s.hashCode() : 0) ^ iHashCode;
    }

    @NonNull
    public final String toString() {
        return "Pair{" + this.f34865OooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream + this.f34866OooO0O0 + "}";
    }
}
