package p235o00oOooO;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class o00O0OO implements o00OOO0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f40241OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f40242OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f40243OooO0Oo;

    public o00O0OO(long j, long j2) {
        this.f40241OooO0O0 = j;
        this.f40242OooO0OO = j2;
        this.f40243OooO0Oo = j - 1;
    }

    @Override // p235o00oOooO.o00OOO0O
    public final boolean next() {
        long j = this.f40243OooO0Oo + 1;
        this.f40243OooO0Oo = j;
        return !(j > this.f40242OooO0OO);
    }
}
