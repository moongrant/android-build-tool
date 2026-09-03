package p287o0O0Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0O.OooO00o f42250OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0O.OooO0OO f42251OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOO0O.OooO0O0 f42252OooO0OO;

    public OooO0O0(OooO0OO oooO0OO, OooO oooO, OooO0o oooO0o) {
        this.f42250OooO00o = oooO0OO;
        this.f42251OooO0O0 = oooO;
        this.f42252OooO0OO = oooO0o;
    }

    @Override // p287o0O0Oo0.OooOO0O
    public final OooOO0O.OooO00o OooO00o() {
        return this.f42250OooO00o;
    }

    @Override // p287o0O0Oo0.OooOO0O
    public final OooOO0O.OooO0O0 OooO0O0() {
        return this.f42252OooO0OO;
    }

    @Override // p287o0O0Oo0.OooOO0O
    public final OooOO0O.OooO0OO OooO0OO() {
        return this.f42251OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOO0O)) {
            return false;
        }
        OooOO0O oooOO0O = (OooOO0O) obj;
        return this.f42250OooO00o.equals(oooOO0O.OooO00o()) && this.f42251OooO0O0.equals(oooOO0O.OooO0OO()) && this.f42252OooO0OO.equals(oooOO0O.OooO0O0());
    }

    public final int hashCode() {
        return ((((this.f42250OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f42251OooO0O0.hashCode()) * 1000003) ^ this.f42252OooO0OO.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f42250OooO00o + ", osData=" + this.f42251OooO0O0 + ", deviceData=" + this.f42252OooO0OO + "}";
    }
}
