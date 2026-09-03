package p291o0O0Oo0o;

import p286o0O0OOoO.o0ooOOo;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo0 extends o00Oo0.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f41631OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f41632OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f41633OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f41634OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0ooOOo f41635OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f41636OooO0o0;

    public Oooo0(String str, String str2, String str3, String str4, int i, o0ooOOo o0ooooo) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f41631OooO00o = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f41632OooO0O0 = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f41633OooO0OO = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f41634OooO0Oo = str4;
        this.f41636OooO0o0 = i;
        if (o0ooooo == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f41635OooO0o = o0ooooo;
    }

    @Override // o0O0Oo0o.o00Oo0.OooO00o
    public final String OooO00o() {
        return this.f41631OooO00o;
    }

    @Override // o0O0Oo0o.o00Oo0.OooO00o
    public final int OooO0O0() {
        return this.f41636OooO0o0;
    }

    @Override // o0O0Oo0o.o00Oo0.OooO00o
    public final o0ooOOo OooO0OO() {
        return this.f41635OooO0o;
    }

    @Override // o0O0Oo0o.o00Oo0.OooO00o
    public final String OooO0Oo() {
        return this.f41634OooO0Oo;
    }

    @Override // o0O0Oo0o.o00Oo0.OooO00o
    public final String OooO0o() {
        return this.f41633OooO0OO;
    }

    @Override // o0O0Oo0o.o00Oo0.OooO00o
    public final String OooO0o0() {
        return this.f41632OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00Oo0.OooO00o)) {
            return false;
        }
        o00Oo0.OooO00o oooO00o = (o00Oo0.OooO00o) obj;
        return this.f41631OooO00o.equals(oooO00o.OooO00o()) && this.f41632OooO0O0.equals(oooO00o.OooO0o0()) && this.f41633OooO0OO.equals(oooO00o.OooO0o()) && this.f41634OooO0Oo.equals(oooO00o.OooO0Oo()) && this.f41636OooO0o0 == oooO00o.OooO0O0() && this.f41635OooO0o.equals(oooO00o.OooO0OO());
    }

    public final int hashCode() {
        return ((((((((((this.f41631OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f41632OooO0O0.hashCode()) * 1000003) ^ this.f41633OooO0OO.hashCode()) * 1000003) ^ this.f41634OooO0Oo.hashCode()) * 1000003) ^ this.f41636OooO0o0) * 1000003) ^ this.f41635OooO0o.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f41631OooO00o + ", versionCode=" + this.f41632OooO0O0 + ", versionName=" + this.f41633OooO0OO + ", installUuid=" + this.f41634OooO0Oo + ", deliveryMechanism=" + this.f41636OooO0o0 + ", developmentPlatformProvider=" + this.f41635OooO0o + "}";
    }
}
