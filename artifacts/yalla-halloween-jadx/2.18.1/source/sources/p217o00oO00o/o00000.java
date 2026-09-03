package p217o00oO00o;

import OooO00o.OooO00o;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;
import p021OooOooo.Oooo0;
import p243o00oo00O.o0000;

/* JADX INFO: loaded from: classes.dex */
public final class o00000 implements o000000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Oooo0<o000000O<?>, Object> f33630OooO0O0 = new o0000();

    @Override // p217o00oO00o.o000000
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            Oooo0<o000000O<?>, Object> oooo0 = this.f33630OooO0O0;
            if (i >= oooo0.f421Oooo0oo) {
                return;
            }
            o000000O<?> o000000oOooO = oooo0.OooO(i);
            Object objOooOOO0 = this.f33630OooO0O0.OooOOO0(i);
            o000000O.OooO0O0<?> oooO0O0 = o000000oOooO.f33634OooO0O0;
            if (o000000oOooO.f33636OooO0Oo == null) {
                o000000oOooO.f33636OooO0Oo = o000000oOooO.f33635OooO0OO.getBytes(o000000.f33631OooO00o);
            }
            oooO0O0.OooO00o(o000000oOooO.f33636OooO0Oo, objOooOOO0, messageDigest);
            i++;
        }
    }

    @Nullable
    public final <T> T OooO0OO(@NonNull o000000O<T> o000000o2) {
        return this.f33630OooO0O0.containsKey(o000000o2) ? (T) this.f33630OooO0O0.getOrDefault(o000000o2, null) : o000000o2.f33633OooO00o;
    }

    public final void OooO0Oo(@NonNull o00000 o00000Var) {
        this.f33630OooO0O0.OooOO0(o00000Var.f33630OooO0O0);
    }

    @Override // p217o00oO00o.o000000
    public final boolean equals(Object obj) {
        if (obj instanceof o00000) {
            return this.f33630OooO0O0.equals(((o00000) obj).f33630OooO0O0);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [OooOooo.Oooo0<o00oO00o.o000000O<?>, java.lang.Object>, o00oo00O.o0000] */
    @Override // p217o00oO00o.o000000
    public final int hashCode() {
        return this.f33630OooO0O0.hashCode();
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Options{values=");
        sbOooO0o0.append(this.f33630OooO0O0);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
