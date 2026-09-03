package p248o00oo0o0;

import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000Ooo extends o0000O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f40173OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f40174OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f40175OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f40176OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f40177OooO0o0;

    public o0000Ooo(long j, int i, int i2, long j2, int i3) {
        this.f40173OooO0O0 = j;
        this.f40174OooO0OO = i;
        this.f40175OooO0Oo = i2;
        this.f40177OooO0o0 = j2;
        this.f40176OooO0o = i3;
    }

    @Override // p248o00oo0o0.o0000O0
    public final int OooO00o() {
        return this.f40175OooO0Oo;
    }

    @Override // p248o00oo0o0.o0000O0
    public final long OooO0O0() {
        return this.f40177OooO0o0;
    }

    @Override // p248o00oo0o0.o0000O0
    public final int OooO0OO() {
        return this.f40174OooO0OO;
    }

    @Override // p248o00oo0o0.o0000O0
    public final int OooO0Oo() {
        return this.f40176OooO0o;
    }

    @Override // p248o00oo0o0.o0000O0
    public final long OooO0o0() {
        return this.f40173OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0000O0)) {
            return false;
        }
        o0000O0 o0000o1 = (o0000O0) obj;
        return this.f40173OooO0O0 == o0000o1.OooO0o0() && this.f40174OooO0OO == o0000o1.OooO0OO() && this.f40175OooO0Oo == o0000o1.OooO00o() && this.f40177OooO0o0 == o0000o1.OooO0O0() && this.f40176OooO0o == o0000o1.OooO0Oo();
    }

    public final int hashCode() {
        long j = this.f40173OooO0O0;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f40174OooO0OO) * 1000003) ^ this.f40175OooO0Oo) * 1000003;
        long j2 = this.f40177OooO0o0;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f40176OooO0o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f40173OooO0O0);
        sb.append(", loadBatchSize=");
        sb.append(this.f40174OooO0OO);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f40175OooO0Oo);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f40177OooO0o0);
        sb.append(", maxBlobByteSizePerRow=");
        return OooOO0.OooO00o(sb, this.f40176OooO0o, "}");
    }
}
