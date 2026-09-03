package p127o00O0oo;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o000OOo;
import p129o00O0ooo.o0000;
import p532o0o0Oo.o00000OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000oo implements o000OOo {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final o00000OO<Class<?>, byte[]> f36772OooOO0 = new o00000OO<>(50);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final p126o00O0oOo.o00000OO<?> f36773OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000 f36774OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000OOo f36775OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000OOo f36776OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f36777OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f36778OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Class<?> f36779OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o00000 f36780OooO0oo;

    public o0000oo(o0000 o0000Var, o000OOo o000ooo2, o000OOo o000ooo3, int i, int i2, p126o00O0oOo.o00000OO<?> o00000oo2, Class<?> cls, o00000 o00000Var) {
        this.f36774OooO0O0 = o0000Var;
        this.f36775OooO0OO = o000ooo2;
        this.f36776OooO0Oo = o000ooo3;
        this.f36778OooO0o0 = i;
        this.f36777OooO0o = i2;
        this.f36773OooO = o00000oo2;
        this.f36779OooO0oO = cls;
        this.f36780OooO0oo = o00000Var;
    }

    @Override // p126o00O0oOo.o000OOo
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        o0000 o0000Var = this.f36774OooO0O0;
        byte[] bArr = (byte[]) o0000Var.OooO0Oo();
        ByteBuffer.wrap(bArr).putInt(this.f36778OooO0o0).putInt(this.f36777OooO0o).array();
        this.f36776OooO0Oo.OooO00o(messageDigest);
        this.f36775OooO0OO.OooO00o(messageDigest);
        messageDigest.update(bArr);
        p126o00O0oOo.o00000OO<?> o00000oo2 = this.f36773OooO;
        if (o00000oo2 != null) {
            o00000oo2.OooO00o(messageDigest);
        }
        this.f36780OooO0oo.OooO00o(messageDigest);
        o00000OO<Class<?>, byte[]> o00000oo3 = f36772OooOO0;
        Class<?> cls = this.f36779OooO0oO;
        byte[] bArrOooO00o = o00000oo3.OooO00o(cls);
        if (bArrOooO00o == null) {
            bArrOooO00o = cls.getName().getBytes(o000OOo.f36731OooO00o);
            o00000oo3.OooO0Oo(cls, bArrOooO00o);
        }
        messageDigest.update(bArrOooO00o);
        o0000Var.put(bArr);
    }

    @Override // p126o00O0oOo.o000OOo
    public final boolean equals(Object obj) {
        if (!(obj instanceof o0000oo)) {
            return false;
        }
        o0000oo o0000ooVar = (o0000oo) obj;
        return this.f36777OooO0o == o0000ooVar.f36777OooO0o && this.f36778OooO0o0 == o0000ooVar.f36778OooO0o0 && p532o0o0Oo.o0000oo.OooO0O0(this.f36773OooO, o0000ooVar.f36773OooO) && this.f36779OooO0oO.equals(o0000ooVar.f36779OooO0oO) && this.f36775OooO0OO.equals(o0000ooVar.f36775OooO0OO) && this.f36776OooO0Oo.equals(o0000ooVar.f36776OooO0Oo) && this.f36780OooO0oo.equals(o0000ooVar.f36780OooO0oo);
    }

    @Override // p126o00O0oOo.o000OOo
    public final int hashCode() {
        int iHashCode = ((((this.f36776OooO0Oo.hashCode() + (this.f36775OooO0OO.hashCode() * 31)) * 31) + this.f36778OooO0o0) * 31) + this.f36777OooO0o;
        p126o00O0oOo.o00000OO<?> o00000oo2 = this.f36773OooO;
        if (o00000oo2 != null) {
            iHashCode = (iHashCode * 31) + o00000oo2.hashCode();
        }
        return this.f36780OooO0oo.hashCode() + ((this.f36779OooO0oO.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f36775OooO0OO + ", signature=" + this.f36776OooO0Oo + ", width=" + this.f36778OooO0o0 + ", height=" + this.f36777OooO0o + ", decodedResourceClass=" + this.f36779OooO0oO + ", transformation='" + this.f36773OooO + "', options=" + this.f36780OooO0oo + '}';
    }
}
