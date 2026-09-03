package p271o00ooooo;

import com.google.android.gms.measurement.internal.zzgd;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oO extends oOo00o00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f40534OooO0O0;

    public oO(zzgd zzgdVar) {
        super(zzgdVar);
        this.f40788OooO00o.f15542OooOooo++;
    }

    public void OooO00o() {
    }

    public abstract boolean OooO0O0();

    public final void OooO0OO() {
        if (!this.f40534OooO0O0) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzw() {
        if (this.f40534OooO0O0) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (OooO0O0()) {
            return;
        }
        this.f40788OooO00o.f15543Oooo000.incrementAndGet();
        this.f40534OooO0O0 = true;
    }

    public final void zzx() {
        if (this.f40534OooO0O0) {
            throw new IllegalStateException("Can't initialize twice");
        }
        OooO00o();
        this.f40788OooO00o.f15543Oooo000.incrementAndGet();
        this.f40534OooO0O0 = true;
    }
}
