package o0O0OOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f35634OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f35635OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f35636OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f35637OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f35638OooO0o0;

    public OooO00o(long j, int i, int i2, long j2, int i3) {
        this.f35634OooO0O0 = j;
        this.f35635OooO0OO = i;
        this.f35636OooO0Oo = i2;
        this.f35638OooO0o0 = j2;
        this.f35637OooO0o = i3;
    }

    @Override // o0O0OOOo.OooO
    public final int OooO00o() {
        return this.f35636OooO0Oo;
    }

    @Override // o0O0OOOo.OooO
    public final long OooO0O0() {
        return this.f35638OooO0o0;
    }

    @Override // o0O0OOOo.OooO
    public final int OooO0OO() {
        return this.f35635OooO0OO;
    }

    @Override // o0O0OOOo.OooO
    public final int OooO0Oo() {
        return this.f35637OooO0o;
    }

    @Override // o0O0OOOo.OooO
    public final long OooO0o0() {
        return this.f35634OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooO)) {
            return false;
        }
        OooO oooO = (OooO) obj;
        return this.f35634OooO0O0 == oooO.OooO0o0() && this.f35635OooO0OO == oooO.OooO0OO() && this.f35636OooO0Oo == oooO.OooO00o() && this.f35638OooO0o0 == oooO.OooO0O0() && this.f35637OooO0o == oooO.OooO0Oo();
    }

    public final int hashCode() {
        long j = this.f35634OooO0O0;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f35635OooO0OO) * 1000003) ^ this.f35636OooO0Oo) * 1000003;
        long j2 = this.f35638OooO0o0;
        return this.f35637OooO0o ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("EventStoreConfig{maxStorageSizeInBytes=");
        sbOooO0o0.append(this.f35634OooO0O0);
        sbOooO0o0.append(", loadBatchSize=");
        sbOooO0o0.append(this.f35635OooO0OO);
        sbOooO0o0.append(", criticalSectionEnterTimeoutMs=");
        sbOooO0o0.append(this.f35636OooO0Oo);
        sbOooO0o0.append(", eventCleanUpAge=");
        sbOooO0o0.append(this.f35638OooO0o0);
        sbOooO0o0.append(", maxBlobByteSizePerRow=");
        return o0O0O00.o0ooOOo.OooO00o(sbOooO0o0, this.f35637OooO0o, "}");
    }
}
