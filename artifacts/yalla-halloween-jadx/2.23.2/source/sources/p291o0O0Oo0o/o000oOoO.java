package p291o0O0Oo0o;

import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO extends o00Oo0.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f41640OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f41641OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f41642OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f41643OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f41644OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f41645OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f41646OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f41647OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f41648OooO0oo;

    public o000oOoO(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f41641OooO00o = i;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f41642OooO0O0 = str;
        this.f41643OooO0OO = i2;
        this.f41644OooO0Oo = j;
        this.f41646OooO0o0 = j2;
        this.f41645OooO0o = z;
        this.f41647OooO0oO = i3;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f41648OooO0oo = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f41640OooO = str3;
    }

    @Override // o0O0Oo0o.o00Oo0.OooO0O0
    public final long OooO() {
        return this.f41644OooO0Oo;
    }

    @Override // o0O0Oo0o.o00Oo0.OooO0O0
    public final int OooO00o() {
        return this.f41641OooO00o;
    }

    @Override // o0O0Oo0o.o00Oo0.OooO0O0
    public final int OooO0O0() {
        return this.f41643OooO0OO;
    }

    @Override // o0O0Oo0o.o00Oo0.OooO0O0
    public final long OooO0OO() {
        return this.f41646OooO0o0;
    }

    @Override // o0O0Oo0o.o00Oo0.OooO0O0
    public final boolean OooO0Oo() {
        return this.f41645OooO0o;
    }

    @Override // o0O0Oo0o.o00Oo0.OooO0O0
    public final String OooO0o() {
        return this.f41642OooO0O0;
    }

    @Override // o0O0Oo0o.o00Oo0.OooO0O0
    public final String OooO0o0() {
        return this.f41648OooO0oo;
    }

    @Override // o0O0Oo0o.o00Oo0.OooO0O0
    public final String OooO0oO() {
        return this.f41640OooO;
    }

    @Override // o0O0Oo0o.o00Oo0.OooO0O0
    public final int OooO0oo() {
        return this.f41647OooO0oO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00Oo0.OooO0O0)) {
            return false;
        }
        o00Oo0.OooO0O0 oooO0O0 = (o00Oo0.OooO0O0) obj;
        return this.f41641OooO00o == oooO0O0.OooO00o() && this.f41642OooO0O0.equals(oooO0O0.OooO0o()) && this.f41643OooO0OO == oooO0O0.OooO0O0() && this.f41644OooO0Oo == oooO0O0.OooO() && this.f41646OooO0o0 == oooO0O0.OooO0OO() && this.f41645OooO0o == oooO0O0.OooO0Oo() && this.f41647OooO0oO == oooO0O0.OooO0oo() && this.f41648OooO0oo.equals(oooO0O0.OooO0o0()) && this.f41640OooO.equals(oooO0O0.OooO0oO());
    }

    public final int hashCode() {
        int iHashCode = (((((this.f41641OooO00o ^ 1000003) * 1000003) ^ this.f41642OooO0O0.hashCode()) * 1000003) ^ this.f41643OooO0OO) * 1000003;
        long j = this.f41644OooO0Oo;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f41646OooO0o0;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f41645OooO0o ? 1231 : 1237)) * 1000003) ^ this.f41647OooO0oO) * 1000003) ^ this.f41648OooO0oo.hashCode()) * 1000003) ^ this.f41640OooO.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.f41641OooO00o);
        sb.append(", model=");
        sb.append(this.f41642OooO0O0);
        sb.append(", availableProcessors=");
        sb.append(this.f41643OooO0OO);
        sb.append(", totalRam=");
        sb.append(this.f41644OooO0Oo);
        sb.append(", diskSpace=");
        sb.append(this.f41646OooO0o0);
        sb.append(", isEmulator=");
        sb.append(this.f41645OooO0o);
        sb.append(", state=");
        sb.append(this.f41647OooO0oO);
        sb.append(", manufacturer=");
        sb.append(this.f41648OooO0oo);
        sb.append(", modelClass=");
        return o0oOO.OooO0O0(sb, this.f41640OooO, "}");
    }
}
