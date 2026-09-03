package p287o0O0Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends OooOO0O.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f42247OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f42248OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f42249OooO0OO;

    public OooO(String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f42247OooO00o = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f42248OooO0O0 = str2;
        this.f42249OooO0OO = z;
    }

    @Override // o0O0Oo0.OooOO0O.OooO0OO
    public final boolean OooO00o() {
        return this.f42249OooO0OO;
    }

    @Override // o0O0Oo0.OooOO0O.OooO0OO
    public final String OooO0O0() {
        return this.f42248OooO0O0;
    }

    @Override // o0O0Oo0.OooOO0O.OooO0OO
    public final String OooO0OO() {
        return this.f42247OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOO0O.OooO0OO)) {
            return false;
        }
        OooOO0O.OooO0OO oooO0OO = (OooOO0O.OooO0OO) obj;
        return this.f42247OooO00o.equals(oooO0OO.OooO0OO()) && this.f42248OooO0O0.equals(oooO0OO.OooO0O0()) && this.f42249OooO0OO == oooO0OO.OooO00o();
    }

    public final int hashCode() {
        return ((((this.f42247OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f42248OooO0O0.hashCode()) * 1000003) ^ (this.f42249OooO0OO ? 1231 : 1237);
    }

    public final String toString() {
        return "OsData{osRelease=" + this.f42247OooO00o + ", osCodeName=" + this.f42248OooO0O0 + ", isRooted=" + this.f42249OooO0OO + "}";
    }
}
