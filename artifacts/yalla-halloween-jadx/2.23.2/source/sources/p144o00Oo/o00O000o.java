package p144o00Oo;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p154o00Oo0oo.o000000;
import p154o00Oo0oo.o0OOO0o;
import p154o00Oo0oo.oo0o0Oo;
import p156o00OoO00.OooO0o;
import p174o00OooOo.o00OO0O0;
import p174o00OooOo.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O000o implements o0OOO0o {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final oo0oOO0<Class<?>, byte[]> f37717OooOO0 = new oo0oOO0<>(50);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o000000<?> f37718OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0o f37719OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0OOO0o f37720OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OOO0o f37721OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f37722OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f37723OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Class<?> f37724OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final oo0o0Oo f37725OooO0oo;

    public o00O000o(OooO0o oooO0o, o0OOO0o o0ooo0o2, o0OOO0o o0ooo0o3, int i, int i2, o000000<?> o000000Var, Class<?> cls, oo0o0Oo oo0o0oo) {
        this.f37719OooO0O0 = oooO0o;
        this.f37720OooO0OO = o0ooo0o2;
        this.f37721OooO0Oo = o0ooo0o3;
        this.f37723OooO0o0 = i;
        this.f37722OooO0o = i2;
        this.f37718OooO = o000000Var;
        this.f37724OooO0oO = cls;
        this.f37725OooO0oo = oo0o0oo;
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final void OooO0O0(@NonNull MessageDigest messageDigest) {
        OooO0o oooO0o = this.f37719OooO0O0;
        byte[] bArr = (byte[]) oooO0o.OooO0Oo();
        ByteBuffer.wrap(bArr).putInt(this.f37723OooO0o0).putInt(this.f37722OooO0o).array();
        this.f37721OooO0Oo.OooO0O0(messageDigest);
        this.f37720OooO0OO.OooO0O0(messageDigest);
        messageDigest.update(bArr);
        o000000<?> o000000Var = this.f37718OooO;
        if (o000000Var != null) {
            o000000Var.OooO0O0(messageDigest);
        }
        this.f37725OooO0oo.OooO0O0(messageDigest);
        oo0oOO0<Class<?>, byte[]> oo0ooo0 = f37717OooOO0;
        Class<?> cls = this.f37724OooO0oO;
        byte[] bArrOooO00o = oo0ooo0.OooO00o(cls);
        if (bArrOooO00o == null) {
            bArrOooO00o = cls.getName().getBytes(o0OOO0o.f37833OooO00o);
            oo0ooo0.OooO0Oo(cls, bArrOooO00o);
        }
        messageDigest.update(bArrOooO00o);
        oooO0o.put(bArr);
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final boolean equals(Object obj) {
        if (!(obj instanceof o00O000o)) {
            return false;
        }
        o00O000o o00o000o2 = (o00O000o) obj;
        return this.f37722OooO0o == o00o000o2.f37722OooO0o && this.f37723OooO0o0 == o00o000o2.f37723OooO0o0 && o00OO0O0.OooO0O0(this.f37718OooO, o00o000o2.f37718OooO) && this.f37724OooO0oO.equals(o00o000o2.f37724OooO0oO) && this.f37720OooO0OO.equals(o00o000o2.f37720OooO0OO) && this.f37721OooO0Oo.equals(o00o000o2.f37721OooO0Oo) && this.f37725OooO0oo.equals(o00o000o2.f37725OooO0oo);
    }

    @Override // p154o00Oo0oo.o0OOO0o
    public final int hashCode() {
        int iHashCode = ((((this.f37721OooO0Oo.hashCode() + (this.f37720OooO0OO.hashCode() * 31)) * 31) + this.f37723OooO0o0) * 31) + this.f37722OooO0o;
        o000000<?> o000000Var = this.f37718OooO;
        if (o000000Var != null) {
            iHashCode = (iHashCode * 31) + o000000Var.hashCode();
        }
        return this.f37725OooO0oo.hashCode() + ((this.f37724OooO0oO.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f37720OooO0OO + ", signature=" + this.f37721OooO0Oo + ", width=" + this.f37723OooO0o0 + ", height=" + this.f37722OooO0o + ", decodedResourceClass=" + this.f37724OooO0oO + ", transformation='" + this.f37718OooO + "', options=" + this.f37725OooO0oo + '}';
    }
}
