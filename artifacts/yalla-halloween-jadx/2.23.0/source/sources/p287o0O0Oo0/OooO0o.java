package p287o0O0Oo0;

import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends OooOO0O.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final String f42259OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f42260OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f42261OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f42262OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f42263OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f42264OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f42265OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f42266OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f42267OooO0oo;

    public OooO0o(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f42260OooO00o = i;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f42261OooO0O0 = str;
        this.f42262OooO0OO = i2;
        this.f42263OooO0Oo = j;
        this.f42265OooO0o0 = j2;
        this.f42264OooO0o = z;
        this.f42266OooO0oO = i3;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f42267OooO0oo = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f42259OooO = str3;
    }

    @Override // o0O0Oo0.OooOO0O.OooO0O0
    public final long OooO() {
        return this.f42263OooO0Oo;
    }

    @Override // o0O0Oo0.OooOO0O.OooO0O0
    public final int OooO00o() {
        return this.f42260OooO00o;
    }

    @Override // o0O0Oo0.OooOO0O.OooO0O0
    public final int OooO0O0() {
        return this.f42262OooO0OO;
    }

    @Override // o0O0Oo0.OooOO0O.OooO0O0
    public final long OooO0OO() {
        return this.f42265OooO0o0;
    }

    @Override // o0O0Oo0.OooOO0O.OooO0O0
    public final boolean OooO0Oo() {
        return this.f42264OooO0o;
    }

    @Override // o0O0Oo0.OooOO0O.OooO0O0
    public final String OooO0o() {
        return this.f42261OooO0O0;
    }

    @Override // o0O0Oo0.OooOO0O.OooO0O0
    public final String OooO0o0() {
        return this.f42267OooO0oo;
    }

    @Override // o0O0Oo0.OooOO0O.OooO0O0
    public final String OooO0oO() {
        return this.f42259OooO;
    }

    @Override // o0O0Oo0.OooOO0O.OooO0O0
    public final int OooO0oo() {
        return this.f42266OooO0oO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOO0O.OooO0O0)) {
            return false;
        }
        OooOO0O.OooO0O0 oooO0O0 = (OooOO0O.OooO0O0) obj;
        return this.f42260OooO00o == oooO0O0.OooO00o() && this.f42261OooO0O0.equals(oooO0O0.OooO0o()) && this.f42262OooO0OO == oooO0O0.OooO0O0() && this.f42263OooO0Oo == oooO0O0.OooO() && this.f42265OooO0o0 == oooO0O0.OooO0OO() && this.f42264OooO0o == oooO0O0.OooO0Oo() && this.f42266OooO0oO == oooO0O0.OooO0oo() && this.f42267OooO0oo.equals(oooO0O0.OooO0o0()) && this.f42259OooO.equals(oooO0O0.OooO0oO());
    }

    public final int hashCode() {
        int iHashCode = (((((this.f42260OooO00o ^ 1000003) * 1000003) ^ this.f42261OooO0O0.hashCode()) * 1000003) ^ this.f42262OooO0OO) * 1000003;
        long j = this.f42263OooO0Oo;
        int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f42265OooO0o0;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f42264OooO0o ? 1231 : 1237)) * 1000003) ^ this.f42266OooO0oO) * 1000003) ^ this.f42267OooO0oo.hashCode()) * 1000003) ^ this.f42259OooO.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.f42260OooO00o);
        sb.append(", model=");
        sb.append(this.f42261OooO0O0);
        sb.append(", availableProcessors=");
        sb.append(this.f42262OooO0OO);
        sb.append(", totalRam=");
        sb.append(this.f42263OooO0Oo);
        sb.append(", diskSpace=");
        sb.append(this.f42265OooO0o0);
        sb.append(", isEmulator=");
        sb.append(this.f42264OooO0o);
        sb.append(", state=");
        sb.append(this.f42266OooO0oO);
        sb.append(", manufacturer=");
        sb.append(this.f42267OooO0oo);
        sb.append(", modelClass=");
        return o0O00o0.OooO0O0(sb, this.f42259OooO, "}");
    }
}
