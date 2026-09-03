package p238o00oOooo;

import p233o00oOoOO.o0O000Oo;
import p233o00oOoOO.o0O000o0;
import p233o00oOoOO.o0OoOoOo;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0OOoo extends oo0ooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OO00OO f40044OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f40045OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O000Oo<?> f40046OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0O000o0<?, byte[]> f40047OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0OoOoOo f40048OooO0o0;

    public oo0OOoo(o0OO00OO o0oo00oo2, String str, o0O000Oo o0o000oo2, o0O000o0 o0o000o1, o0OoOoOo o0oooooo) {
        this.f40044OooO00o = o0oo00oo2;
        this.f40045OooO0O0 = str;
        this.f40046OooO0OO = o0o000oo2;
        this.f40047OooO0Oo = o0o000o1;
        this.f40048OooO0o0 = o0oooooo;
    }

    @Override // p238o00oOooo.oo0ooO
    public final o0OoOoOo OooO00o() {
        return this.f40048OooO0o0;
    }

    @Override // p238o00oOooo.oo0ooO
    public final o0O000Oo<?> OooO0O0() {
        return this.f40046OooO0OO;
    }

    @Override // p238o00oOooo.oo0ooO
    public final o0O000o0<?, byte[]> OooO0OO() {
        return this.f40047OooO0Oo;
    }

    @Override // p238o00oOooo.oo0ooO
    public final o0OO00OO OooO0Oo() {
        return this.f40044OooO00o;
    }

    @Override // p238o00oOooo.oo0ooO
    public final String OooO0o0() {
        return this.f40045OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oo0ooO)) {
            return false;
        }
        oo0ooO oo0ooo = (oo0ooO) obj;
        return this.f40044OooO00o.equals(oo0ooo.OooO0Oo()) && this.f40045OooO0O0.equals(oo0ooo.OooO0o0()) && this.f40046OooO0OO.equals(oo0ooo.OooO0O0()) && this.f40047OooO0Oo.equals(oo0ooo.OooO0OO()) && this.f40048OooO0o0.equals(oo0ooo.OooO00o());
    }

    public final int hashCode() {
        return ((((((((this.f40044OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f40045OooO0O0.hashCode()) * 1000003) ^ this.f40046OooO0OO.hashCode()) * 1000003) ^ this.f40047OooO0Oo.hashCode()) * 1000003) ^ this.f40048OooO0o0.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.f40044OooO00o + ", transportName=" + this.f40045OooO0O0 + ", event=" + this.f40046OooO0OO + ", transformer=" + this.f40047OooO0Oo + ", encoding=" + this.f40048OooO0o0 + "}";
    }
}
