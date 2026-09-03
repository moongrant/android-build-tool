package p269o00ooooo;

import com.google.android.gms.measurement.internal.zzgd;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oO000Oo extends oO000Oo0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f41275OooO0O0;

    public oO000Oo(zzgd zzgdVar) {
        super(zzgdVar);
        this.f41276OooO00o.f16018OooOooo++;
    }

    public void OooO00o() {
    }

    public abstract boolean OooO0O0();

    public final void OooO0OO() {
        if (!this.f41275OooO0O0) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzw() {
        if (this.f41275OooO0O0) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (OooO0O0()) {
            return;
        }
        this.f41276OooO00o.f16019Oooo000.incrementAndGet();
        this.f41275OooO0O0 = true;
    }

    public final void zzx() {
        if (this.f41275OooO0O0) {
            throw new IllegalStateException("Can't initialize twice");
        }
        OooO00o();
        this.f41276OooO00o.f16019Oooo000.incrementAndGet();
        this.f41275OooO0O0 = true;
    }
}
