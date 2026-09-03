package p225o00oOOo;

import OooO00o.OooO00o;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.zego.zegoavkit2.ZegoConstants;
import o000OO0O.OooO0o;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class o00OO00O<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public T f33870OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public T f33871OooO0O0;

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        OooO0o oooO0o = (OooO0o) obj;
        F f = oooO0o.f28234OooO00o;
        Object obj2 = this.f33870OooO00o;
        if (!(f == obj2 || (f != 0 && f.equals(obj2)))) {
            return false;
        }
        S s = oooO0o.f28235OooO0O0;
        Object obj3 = this.f33871OooO0O0;
        return s == obj3 || (s != 0 && s.equals(obj3));
    }

    public final int hashCode() {
        T t = this.f33870OooO00o;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f33871OooO0O0;
        return iHashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Pair{");
        sbOooO0o0.append(this.f33870OooO00o);
        sbOooO0o0.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        sbOooO0o0.append(this.f33871OooO0O0);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
