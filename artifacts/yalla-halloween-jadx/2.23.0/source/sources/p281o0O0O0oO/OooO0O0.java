package p281o0O0O0oO;

import android.support.v4.media.session.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f41941OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f41942OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f41943OooO0OO;

    public OooO0O0(long j, long j2, long j3) {
        this.f41941OooO00o = j;
        this.f41942OooO0O0 = j2;
        this.f41943OooO0OO = j3;
    }

    @Override // p281o0O0O0oO.OooOOO
    public final long OooO00o() {
        return this.f41942OooO0O0;
    }

    @Override // p281o0O0O0oO.OooOOO
    public final long OooO0O0() {
        return this.f41941OooO00o;
    }

    @Override // p281o0O0O0oO.OooOOO
    public final long OooO0OO() {
        return this.f41943OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOOO)) {
            return false;
        }
        OooOOO oooOOO = (OooOOO) obj;
        return this.f41941OooO00o == oooOOO.OooO0O0() && this.f41942OooO0O0 == oooOOO.OooO00o() && this.f41943OooO0OO == oooOOO.OooO0OO();
    }

    public final int hashCode() {
        long j = this.f41941OooO00o;
        long j2 = this.f41942OooO0O0;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f41943OooO0OO;
        return i ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f41941OooO00o);
        sb.append(", elapsedRealtime=");
        sb.append(this.f41942OooO0O0);
        sb.append(", uptimeMillis=");
        return OooO0o.OooO0O0(sb, this.f41943OooO0OO, "}");
    }
}
