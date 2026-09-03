package p214o00oO0;

import OooO00o.OooO00o;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p217o00oO00o.o00000;
import p217o00oO00o.o000000;
import p217o00oO00o.o00000OO;
import p219o00oO0O0.o0O00o0;
import p243o00oo00O.o000O000;
import p243o00oo00O.o000OO;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo00 implements o000000 {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final o000OO<Class<?>, byte[]> f33523OooOO0 = new o000OO<>(50);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00000OO<?> f33524OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O00o0 f33525OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000000 f33526OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000000 f33527OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f33528OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f33529OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Class<?> f33530OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00000 f33531OooO0oo;

    public o00Oo00(o0O00o0 o0o00o1, o000000 o000000Var, o000000 o000000Var2, int i, int i2, o00000OO<?> o00000oo2, Class<?> cls, o00000 o00000Var) {
        this.f33525OooO0O0 = o0o00o1;
        this.f33526OooO0OO = o000000Var;
        this.f33527OooO0Oo = o000000Var2;
        this.f33529OooO0o0 = i;
        this.f33528OooO0o = i2;
        this.f33524OooO = o00000oo2;
        this.f33530OooO0oO = cls;
        this.f33531OooO0oo = o00000Var;
    }

    @Override // p217o00oO00o.o000000
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f33525OooO0O0.OooO0oo();
        ByteBuffer.wrap(bArr).putInt(this.f33529OooO0o0).putInt(this.f33528OooO0o).array();
        this.f33527OooO0Oo.OooO00o(messageDigest);
        this.f33526OooO0OO.OooO00o(messageDigest);
        messageDigest.update(bArr);
        o00000OO<?> o00000oo2 = this.f33524OooO;
        if (o00000oo2 != null) {
            o00000oo2.OooO00o(messageDigest);
        }
        this.f33531OooO0oo.OooO00o(messageDigest);
        o000OO<Class<?>, byte[]> o000oo2 = f33523OooOO0;
        byte[] bArrOooO00o = o000oo2.OooO00o(this.f33530OooO0oO);
        if (bArrOooO00o == null) {
            bArrOooO00o = this.f33530OooO0oO.getName().getBytes(o000000.f33631OooO00o);
            o000oo2.OooO0Oo(this.f33530OooO0oO, bArrOooO00o);
        }
        messageDigest.update(bArrOooO00o);
        this.f33525OooO0O0.OooO0o(bArr);
    }

    @Override // p217o00oO00o.o000000
    public final boolean equals(Object obj) {
        if (!(obj instanceof o00Oo00)) {
            return false;
        }
        o00Oo00 o00oo00 = (o00Oo00) obj;
        return this.f33528OooO0o == o00oo00.f33528OooO0o && this.f33529OooO0o0 == o00oo00.f33529OooO0o0 && o000O000.OooO0O0(this.f33524OooO, o00oo00.f33524OooO) && this.f33530OooO0oO.equals(o00oo00.f33530OooO0oO) && this.f33526OooO0OO.equals(o00oo00.f33526OooO0OO) && this.f33527OooO0Oo.equals(o00oo00.f33527OooO0Oo) && this.f33531OooO0oo.equals(o00oo00.f33531OooO0oo);
    }

    @Override // p217o00oO00o.o000000
    public final int hashCode() {
        int iHashCode = ((((this.f33527OooO0Oo.hashCode() + (this.f33526OooO0OO.hashCode() * 31)) * 31) + this.f33529OooO0o0) * 31) + this.f33528OooO0o;
        o00000OO<?> o00000oo2 = this.f33524OooO;
        if (o00000oo2 != null) {
            iHashCode = (iHashCode * 31) + o00000oo2.hashCode();
        }
        return this.f33531OooO0oo.hashCode() + ((this.f33530OooO0oO.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ResourceCacheKey{sourceKey=");
        sbOooO0o0.append(this.f33526OooO0OO);
        sbOooO0o0.append(", signature=");
        sbOooO0o0.append(this.f33527OooO0Oo);
        sbOooO0o0.append(", width=");
        sbOooO0o0.append(this.f33529OooO0o0);
        sbOooO0o0.append(", height=");
        sbOooO0o0.append(this.f33528OooO0o);
        sbOooO0o0.append(", decodedResourceClass=");
        sbOooO0o0.append(this.f33530OooO0oO);
        sbOooO0o0.append(", transformation='");
        sbOooO0o0.append(this.f33524OooO);
        sbOooO0o0.append('\'');
        sbOooO0o0.append(", options=");
        sbOooO0o0.append(this.f33531OooO0oo);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
