package p291o0O0Oo0o;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo000 extends o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00Oo0.OooO00o f41637OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00Oo0.OooO0OO f41638OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00Oo0.OooO0O0 f41639OooO0OO;

    public Oooo000(Oooo0 oooo0, o0OoOo0 o0oooo1, o000oOoO o000oooo2) {
        this.f41637OooO00o = oooo0;
        this.f41638OooO0O0 = o0oooo1;
        this.f41639OooO0OO = o000oooo2;
    }

    @Override // p291o0O0Oo0o.o00Oo0
    public final o00Oo0.OooO00o OooO00o() {
        return this.f41637OooO00o;
    }

    @Override // p291o0O0Oo0o.o00Oo0
    public final o00Oo0.OooO0O0 OooO0O0() {
        return this.f41639OooO0OO;
    }

    @Override // p291o0O0Oo0o.o00Oo0
    public final o00Oo0.OooO0OO OooO0OO() {
        return this.f41638OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00Oo0)) {
            return false;
        }
        o00Oo0 o00oo1 = (o00Oo0) obj;
        return this.f41637OooO00o.equals(o00oo1.OooO00o()) && this.f41638OooO0O0.equals(o00oo1.OooO0OO()) && this.f41639OooO0OO.equals(o00oo1.OooO0O0());
    }

    public final int hashCode() {
        return ((((this.f41637OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f41638OooO0O0.hashCode()) * 1000003) ^ this.f41639OooO0OO.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f41637OooO00o + ", osData=" + this.f41638OooO0O0 + ", deviceData=" + this.f41639OooO0OO + "}";
    }
}
