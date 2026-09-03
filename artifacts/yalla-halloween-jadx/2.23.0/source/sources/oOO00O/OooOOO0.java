package oOO00O;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.zego.zegoavkit2.ZegoConstants;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class OooOOO0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public T f60849OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public T f60850OooO0O0;

    public final boolean equals(Object obj) {
        if (!(obj instanceof o000OO.OooO0o)) {
            return false;
        }
        o000OO.OooO0o oooO0o = (o000OO.OooO0o) obj;
        F f = oooO0o.f34865OooO00o;
        Object obj2 = this.f60849OooO00o;
        if (!(f == obj2 || (f != 0 && f.equals(obj2)))) {
            return false;
        }
        Object obj3 = this.f60850OooO0O0;
        S s = oooO0o.f34866OooO0O0;
        return s == obj3 || (s != 0 && s.equals(obj3));
    }

    public final int hashCode() {
        T t = this.f60849OooO00o;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f60850OooO0O0;
        return iHashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.f60849OooO00o + ZegoConstants.ZegoVideoDataAuxPublishingStream + this.f60850OooO0O0 + "}";
    }
}
