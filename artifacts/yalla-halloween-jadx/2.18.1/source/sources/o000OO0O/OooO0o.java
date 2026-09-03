package o000OO0O;

import androidx.annotation.NonNull;
import com.zego.zegoavkit2.ZegoConstants;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o<F, S> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final F f28234OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final S f28235OooO0O0;

    public OooO0o(F f, S s) {
        this.f28234OooO00o = f;
        this.f28235OooO0O0 = s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        OooO0o oooO0o = (OooO0o) obj;
        return OooO0OO.OooO00o(oooO0o.f28234OooO00o, this.f28234OooO00o) && OooO0OO.OooO00o(oooO0o.f28235OooO0O0, this.f28235OooO0O0);
    }

    public final int hashCode() {
        F f = this.f28234OooO00o;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s = this.f28235OooO0O0;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    @NonNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Pair{");
        sbOooO0o0.append(this.f28234OooO00o);
        sbOooO0o0.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sbOooO0o0.append(this.f28235OooO0O0);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
