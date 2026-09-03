package p626o0ooO;

import android.support.v4.media.session.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo extends o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f57654OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f57655OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f57656OooO0OO;

    public o00Ooo(long j, long j2, long j3) {
        this.f57654OooO00o = j;
        this.f57655OooO0O0 = j2;
        this.f57656OooO0OO = j3;
    }

    @Override // p626o0ooO.o0O0O00
    public final long OooO00o() {
        return this.f57655OooO0O0;
    }

    @Override // p626o0ooO.o0O0O00
    public final long OooO0O0() {
        return this.f57654OooO00o;
    }

    @Override // p626o0ooO.o0O0O00
    public final long OooO0OO() {
        return this.f57656OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0O0O00)) {
            return false;
        }
        o0O0O00 o0o0o00 = (o0O0O00) obj;
        return this.f57654OooO00o == o0o0o00.OooO0O0() && this.f57655OooO0O0 == o0o0o00.OooO00o() && this.f57656OooO0OO == o0o0o00.OooO0OO();
    }

    public final int hashCode() {
        long j = this.f57654OooO00o;
        long j2 = this.f57655OooO0O0;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f57656OooO0OO;
        return i ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.f57654OooO00o);
        sb.append(", elapsedRealtime=");
        sb.append(this.f57655OooO0O0);
        sb.append(", uptimeMillis=");
        return OooO0OO.OooO0O0(sb, this.f57656OooO0OO, "}");
    }
}
