package p291o0O0Oo0o;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOo0 extends o00Oo0.OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f41650OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f41651OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f41652OooO0OO;

    public o0OoOo0(String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f41650OooO00o = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f41651OooO0O0 = str2;
        this.f41652OooO0OO = z;
    }

    @Override // o0O0Oo0o.o00Oo0.OooO0OO
    public final boolean OooO00o() {
        return this.f41652OooO0OO;
    }

    @Override // o0O0Oo0o.o00Oo0.OooO0OO
    public final String OooO0O0() {
        return this.f41651OooO0O0;
    }

    @Override // o0O0Oo0o.o00Oo0.OooO0OO
    public final String OooO0OO() {
        return this.f41650OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00Oo0.OooO0OO)) {
            return false;
        }
        o00Oo0.OooO0OO oooO0OO = (o00Oo0.OooO0OO) obj;
        return this.f41650OooO00o.equals(oooO0OO.OooO0OO()) && this.f41651OooO0O0.equals(oooO0OO.OooO0O0()) && this.f41652OooO0OO == oooO0OO.OooO00o();
    }

    public final int hashCode() {
        return ((((this.f41650OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f41651OooO0O0.hashCode()) * 1000003) ^ (this.f41652OooO0OO ? 1231 : 1237);
    }

    public final String toString() {
        return "OsData{osRelease=" + this.f41650OooO00o + ", osCodeName=" + this.f41651OooO0O0 + ", isRooted=" + this.f41652OooO0OO + "}";
    }
}
