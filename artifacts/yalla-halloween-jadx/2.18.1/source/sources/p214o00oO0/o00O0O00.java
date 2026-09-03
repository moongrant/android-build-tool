package p214o00oO0;

import OooO00o.OooO00o;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p217o00oO00o.o000000;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O00 implements o000000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000000 f33413OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000000 f33414OooO0OO;

    public o00O0O00(o000000 o000000Var, o000000 o000000Var2) {
        this.f33413OooO0O0 = o000000Var;
        this.f33414OooO0OO = o000000Var2;
    }

    @Override // p217o00oO00o.o000000
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        this.f33413OooO0O0.OooO00o(messageDigest);
        this.f33414OooO0OO.OooO00o(messageDigest);
    }

    @Override // p217o00oO00o.o000000
    public final boolean equals(Object obj) {
        if (!(obj instanceof o00O0O00)) {
            return false;
        }
        o00O0O00 o00o0o01 = (o00O0O00) obj;
        return this.f33413OooO0O0.equals(o00o0o01.f33413OooO0O0) && this.f33414OooO0OO.equals(o00o0o01.f33414OooO0OO);
    }

    @Override // p217o00oO00o.o000000
    public final int hashCode() {
        return this.f33414OooO0OO.hashCode() + (this.f33413OooO0O0.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("DataCacheKey{sourceKey=");
        sbOooO0o0.append(this.f33413OooO0O0);
        sbOooO0o0.append(", signature=");
        sbOooO0o0.append(this.f33414OooO0OO);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
