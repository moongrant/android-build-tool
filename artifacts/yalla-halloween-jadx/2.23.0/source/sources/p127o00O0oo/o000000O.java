package p127o00O0oo;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Map;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o00000OO;
import p126o00O0oOo.o000OOo;
import p532o0o0Oo.o0000O00;
import p532o0o0Oo.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000O implements o000OOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00000 f36739OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f36740OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f36741OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f36742OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Class<?> f36743OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Class<?> f36744OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000OOo f36745OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Map<Class<?>, o00000OO<?>> f36746OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f36747OooOO0;

    public o000000O(Object obj, o000OOo o000ooo2, int i, int i2, o0O0O00 o0o0o00, Class cls, Class cls2, o00000 o00000Var) {
        o0000O00.OooO0O0(obj);
        this.f36740OooO0O0 = obj;
        if (o000ooo2 == null) {
            throw new NullPointerException("Signature must not be null");
        }
        this.f36745OooO0oO = o000ooo2;
        this.f36741OooO0OO = i;
        this.f36742OooO0Oo = i2;
        o0000O00.OooO0O0(o0o0o00);
        this.f36746OooO0oo = o0o0o00;
        if (cls == null) {
            throw new NullPointerException("Resource class must not be null");
        }
        this.f36744OooO0o0 = cls;
        if (cls2 == null) {
            throw new NullPointerException("Transcode class must not be null");
        }
        this.f36743OooO0o = cls2;
        o0000O00.OooO0O0(o00000Var);
        this.f36739OooO = o00000Var;
    }

    @Override // p126o00O0oOo.o000OOo
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p126o00O0oOo.o000OOo
    public final boolean equals(Object obj) {
        if (!(obj instanceof o000000O)) {
            return false;
        }
        o000000O o000000o2 = (o000000O) obj;
        return this.f36740OooO0O0.equals(o000000o2.f36740OooO0O0) && this.f36745OooO0oO.equals(o000000o2.f36745OooO0oO) && this.f36742OooO0Oo == o000000o2.f36742OooO0Oo && this.f36741OooO0OO == o000000o2.f36741OooO0OO && this.f36746OooO0oo.equals(o000000o2.f36746OooO0oo) && this.f36744OooO0o0.equals(o000000o2.f36744OooO0o0) && this.f36743OooO0o.equals(o000000o2.f36743OooO0o) && this.f36739OooO.equals(o000000o2.f36739OooO);
    }

    @Override // p126o00O0oOo.o000OOo
    public final int hashCode() {
        if (this.f36747OooOO0 == 0) {
            int iHashCode = this.f36740OooO0O0.hashCode();
            this.f36747OooOO0 = iHashCode;
            int iHashCode2 = ((((this.f36745OooO0oO.hashCode() + (iHashCode * 31)) * 31) + this.f36741OooO0OO) * 31) + this.f36742OooO0Oo;
            this.f36747OooOO0 = iHashCode2;
            int iHashCode3 = this.f36746OooO0oo.hashCode() + (iHashCode2 * 31);
            this.f36747OooOO0 = iHashCode3;
            int iHashCode4 = this.f36744OooO0o0.hashCode() + (iHashCode3 * 31);
            this.f36747OooOO0 = iHashCode4;
            int iHashCode5 = this.f36743OooO0o.hashCode() + (iHashCode4 * 31);
            this.f36747OooOO0 = iHashCode5;
            this.f36747OooOO0 = this.f36739OooO.hashCode() + (iHashCode5 * 31);
        }
        return this.f36747OooOO0;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f36740OooO0O0 + ", width=" + this.f36741OooO0OO + ", height=" + this.f36742OooO0Oo + ", resourceClass=" + this.f36744OooO0o0 + ", transcodeClass=" + this.f36743OooO0o + ", signature=" + this.f36745OooO0oO + ", hashCode=" + this.f36747OooOO0 + ", transformations=" + this.f36746OooO0oo + ", options=" + this.f36739OooO + '}';
    }
}
