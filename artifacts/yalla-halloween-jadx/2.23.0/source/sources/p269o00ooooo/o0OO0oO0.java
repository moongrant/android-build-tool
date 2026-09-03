package p269o00ooooo;

import androidx.annotation.WorkerThread;
import com.google.android.gms.measurement.internal.zzgd;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0OO0oO0 extends oo0ooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f41206OooO0O0;

    public o0OO0oO0(zzgd zzgdVar) {
        super(zzgdVar);
        this.f41276OooO00o.f16018OooOooo++;
    }

    @WorkerThread
    public void OooO00o() {
    }

    public abstract boolean OooO0O0();

    public final void zza() {
        if (!this.f41206OooO0O0) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzb() {
        if (this.f41206OooO0O0) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (OooO0O0()) {
            return;
        }
        this.f41276OooO00o.f16019Oooo000.incrementAndGet();
        this.f41206OooO0O0 = true;
    }

    public final void zzc() {
        if (this.f41206OooO0O0) {
            throw new IllegalStateException("Can't initialize twice");
        }
        OooO00o();
        this.f41276OooO00o.f16019Oooo000.incrementAndGet();
        this.f41206OooO0O0 = true;
    }
}
