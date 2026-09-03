package p214o00oO0;

import OooO00o.OooO00o;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Map;
import java.util.Objects;
import p217o00oO00o.o00000;
import p217o00oO00o.o000000;
import p217o00oO00o.o00000OO;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO0OO implements o000000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00000 f33499OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f33500OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f33501OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f33502OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Class<?> f33503OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Class<?> f33504OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000000 f33505OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Map<Class<?>, o00000OO<?>> f33506OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f33507OooOO0;

    public o00OO0OO(Object obj, o000000 o000000Var, int i, int i2, Map<Class<?>, o00000OO<?>> map, Class<?> cls, Class<?> cls2, o00000 o00000Var) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.f33500OooO0O0 = obj;
        Objects.requireNonNull(o000000Var, "Signature must not be null");
        this.f33505OooO0oO = o000000Var;
        this.f33501OooO0OO = i;
        this.f33502OooO0Oo = i2;
        Objects.requireNonNull(map, "Argument must not be null");
        this.f33506OooO0oo = map;
        Objects.requireNonNull(cls, "Resource class must not be null");
        this.f33504OooO0o0 = cls;
        Objects.requireNonNull(cls2, "Transcode class must not be null");
        this.f33503OooO0o = cls2;
        Objects.requireNonNull(o00000Var, "Argument must not be null");
        this.f33499OooO = o00000Var;
    }

    @Override // p217o00oO00o.o000000
    public final void OooO00o(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p217o00oO00o.o000000
    public final boolean equals(Object obj) {
        if (!(obj instanceof o00OO0OO)) {
            return false;
        }
        o00OO0OO o00oo0oo = (o00OO0OO) obj;
        return this.f33500OooO0O0.equals(o00oo0oo.f33500OooO0O0) && this.f33505OooO0oO.equals(o00oo0oo.f33505OooO0oO) && this.f33502OooO0Oo == o00oo0oo.f33502OooO0Oo && this.f33501OooO0OO == o00oo0oo.f33501OooO0OO && this.f33506OooO0oo.equals(o00oo0oo.f33506OooO0oo) && this.f33504OooO0o0.equals(o00oo0oo.f33504OooO0o0) && this.f33503OooO0o.equals(o00oo0oo.f33503OooO0o) && this.f33499OooO.equals(o00oo0oo.f33499OooO);
    }

    @Override // p217o00oO00o.o000000
    public final int hashCode() {
        if (this.f33507OooOO0 == 0) {
            int iHashCode = this.f33500OooO0O0.hashCode();
            this.f33507OooOO0 = iHashCode;
            int iHashCode2 = ((((this.f33505OooO0oO.hashCode() + (iHashCode * 31)) * 31) + this.f33501OooO0OO) * 31) + this.f33502OooO0Oo;
            this.f33507OooOO0 = iHashCode2;
            int iHashCode3 = this.f33506OooO0oo.hashCode() + (iHashCode2 * 31);
            this.f33507OooOO0 = iHashCode3;
            int iHashCode4 = this.f33504OooO0o0.hashCode() + (iHashCode3 * 31);
            this.f33507OooOO0 = iHashCode4;
            int iHashCode5 = this.f33503OooO0o.hashCode() + (iHashCode4 * 31);
            this.f33507OooOO0 = iHashCode5;
            this.f33507OooOO0 = this.f33499OooO.hashCode() + (iHashCode5 * 31);
        }
        return this.f33507OooOO0;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("EngineKey{model=");
        sbOooO0o0.append(this.f33500OooO0O0);
        sbOooO0o0.append(", width=");
        sbOooO0o0.append(this.f33501OooO0OO);
        sbOooO0o0.append(", height=");
        sbOooO0o0.append(this.f33502OooO0Oo);
        sbOooO0o0.append(", resourceClass=");
        sbOooO0o0.append(this.f33504OooO0o0);
        sbOooO0o0.append(", transcodeClass=");
        sbOooO0o0.append(this.f33503OooO0o);
        sbOooO0o0.append(", signature=");
        sbOooO0o0.append(this.f33505OooO0oO);
        sbOooO0o0.append(", hashCode=");
        sbOooO0o0.append(this.f33507OooOO0);
        sbOooO0o0.append(", transformations=");
        sbOooO0o0.append(this.f33506OooO0oo);
        sbOooO0o0.append(", options=");
        sbOooO0o0.append(this.f33499OooO);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
