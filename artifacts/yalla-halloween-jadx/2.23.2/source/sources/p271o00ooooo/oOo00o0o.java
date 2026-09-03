package p271o00ooooo;

import androidx.annotation.WorkerThread;
import com.google.android.gms.measurement.internal.zzgd;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oOo00o0o extends oO00Oo00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f40789OooO0O0;

    public oOo00o0o(zzgd zzgdVar) {
        super(zzgdVar);
        this.f40788OooO00o.f15542OooOooo++;
    }

    @WorkerThread
    public void OooO00o() {
    }

    public abstract boolean OooO0O0();

    public final void zza() {
        if (!this.f40789OooO0O0) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzb() {
        if (this.f40789OooO0O0) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (OooO0O0()) {
            return;
        }
        this.f40788OooO00o.f15543Oooo000.incrementAndGet();
        this.f40789OooO0O0 = true;
    }

    public final void zzc() {
        if (this.f40789OooO0O0) {
            throw new IllegalStateException("Can't initialize twice");
        }
        OooO00o();
        this.f40788OooO00o.f15543Oooo000.incrementAndGet();
        this.f40789OooO0O0 = true;
    }
}
