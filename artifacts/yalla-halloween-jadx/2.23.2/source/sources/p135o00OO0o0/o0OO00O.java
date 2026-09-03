package p135o00OO0o0;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.zego.zegoavkit2.ZegoConstants;
import o000OO.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class o0OO00O<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public T f37329OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public T f37330OooO0O0;

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        OooO0o oooO0o = (OooO0o) obj;
        F f = oooO0o.f34374OooO00o;
        Object obj2 = this.f37329OooO00o;
        if (!(f == obj2 || (f != 0 && f.equals(obj2)))) {
            return false;
        }
        Object obj3 = this.f37330OooO0O0;
        S s = oooO0o.f34375OooO0O0;
        return s == obj3 || (s != 0 && s.equals(obj3));
    }

    public final int hashCode() {
        T t = this.f37329OooO00o;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f37330OooO0O0;
        return iHashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.f37329OooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream + this.f37330OooO0O0 + "}";
    }
}
