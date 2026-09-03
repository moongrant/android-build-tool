package p287o0O0Oo0;

import o0O0OOOo.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO extends OooOO0O.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f42253OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f42254OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f42255OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f42256OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0o f42257OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f42258OooO0o0;

    public OooO0OO(String str, String str2, String str3, String str4, int i, OooO0o oooO0o) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f42253OooO00o = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f42254OooO0O0 = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f42255OooO0OO = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f42256OooO0Oo = str4;
        this.f42258OooO0o0 = i;
        if (oooO0o == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f42257OooO0o = oooO0o;
    }

    @Override // o0O0Oo0.OooOO0O.OooO00o
    public final String OooO00o() {
        return this.f42253OooO00o;
    }

    @Override // o0O0Oo0.OooOO0O.OooO00o
    public final int OooO0O0() {
        return this.f42258OooO0o0;
    }

    @Override // o0O0Oo0.OooOO0O.OooO00o
    public final OooO0o OooO0OO() {
        return this.f42257OooO0o;
    }

    @Override // o0O0Oo0.OooOO0O.OooO00o
    public final String OooO0Oo() {
        return this.f42256OooO0Oo;
    }

    @Override // o0O0Oo0.OooOO0O.OooO00o
    public final String OooO0o() {
        return this.f42255OooO0OO;
    }

    @Override // o0O0Oo0.OooOO0O.OooO00o
    public final String OooO0o0() {
        return this.f42254OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOO0O.OooO00o)) {
            return false;
        }
        OooOO0O.OooO00o oooO00o = (OooOO0O.OooO00o) obj;
        return this.f42253OooO00o.equals(oooO00o.OooO00o()) && this.f42254OooO0O0.equals(oooO00o.OooO0o0()) && this.f42255OooO0OO.equals(oooO00o.OooO0o()) && this.f42256OooO0Oo.equals(oooO00o.OooO0Oo()) && this.f42258OooO0o0 == oooO00o.OooO0O0() && this.f42257OooO0o.equals(oooO00o.OooO0OO());
    }

    public final int hashCode() {
        return ((((((((((this.f42253OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f42254OooO0O0.hashCode()) * 1000003) ^ this.f42255OooO0OO.hashCode()) * 1000003) ^ this.f42256OooO0Oo.hashCode()) * 1000003) ^ this.f42258OooO0o0) * 1000003) ^ this.f42257OooO0o.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f42253OooO00o + ", versionCode=" + this.f42254OooO0O0 + ", versionName=" + this.f42255OooO0OO + ", installUuid=" + this.f42256OooO0Oo + ", deliveryMechanism=" + this.f42258OooO0o0 + ", developmentPlatformProvider=" + this.f42257OooO0o + "}";
    }
}
