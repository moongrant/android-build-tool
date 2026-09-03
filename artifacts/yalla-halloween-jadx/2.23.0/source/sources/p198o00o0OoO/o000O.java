package p198o00o0OoO;

import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O extends o00O0000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f39066OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f39067OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f39068OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f39069OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f39070OooO0o0;

    public o000O(long j, int i, int i2, long j2, int i3) {
        this.f39066OooO0O0 = j;
        this.f39067OooO0OO = i;
        this.f39068OooO0Oo = i2;
        this.f39070OooO0o0 = j2;
        this.f39069OooO0o = i3;
    }

    @Override // p198o00o0OoO.o00O0000
    public final int OooO00o() {
        return this.f39068OooO0Oo;
    }

    @Override // p198o00o0OoO.o00O0000
    public final long OooO0O0() {
        return this.f39070OooO0o0;
    }

    @Override // p198o00o0OoO.o00O0000
    public final int OooO0OO() {
        return this.f39067OooO0OO;
    }

    @Override // p198o00o0OoO.o00O0000
    public final int OooO0Oo() {
        return this.f39069OooO0o;
    }

    @Override // p198o00o0OoO.o00O0000
    public final long OooO0o0() {
        return this.f39066OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00O0000)) {
            return false;
        }
        o00O0000 o00o0001 = (o00O0000) obj;
        return this.f39066OooO0O0 == o00o0001.OooO0o0() && this.f39067OooO0OO == o00o0001.OooO0OO() && this.f39068OooO0Oo == o00o0001.OooO00o() && this.f39070OooO0o0 == o00o0001.OooO0O0() && this.f39069OooO0o == o00o0001.OooO0Oo();
    }

    public final int hashCode() {
        long j = this.f39066OooO0O0;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f39067OooO0OO) * 1000003) ^ this.f39068OooO0Oo) * 1000003;
        long j2 = this.f39070OooO0o0;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f39069OooO0o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f39066OooO0O0);
        sb.append(", loadBatchSize=");
        sb.append(this.f39067OooO0OO);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f39068OooO0Oo);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f39070OooO0o0);
        sb.append(", maxBlobByteSizePerRow=");
        return OooOO0.OooO0O0(sb, this.f39069OooO0o, "}");
    }
}
