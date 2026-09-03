package o0OO0OoO;

import androidx.annotation.WorkerThread;
import com.google.android.gms.measurement.internal.zzfy;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oo0o0Oo extends o00O0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f37902OooO0O0;

    public oo0o0Oo(zzfy zzfyVar) {
        super(zzfyVar);
        this.f37615OooO00o.f16222OooOooo++;
    }

    @WorkerThread
    public void OooO00o() {
    }

    public abstract boolean OooO0O0();

    public final void zza() {
        if (!this.f37902OooO0O0) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzb() {
        if (this.f37902OooO0O0) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (OooO0O0()) {
            return;
        }
        this.f37615OooO00o.OooO00o();
        this.f37902OooO0O0 = true;
    }

    public final void zzc() {
        if (this.f37902OooO0O0) {
            throw new IllegalStateException("Can't initialize twice");
        }
        OooO00o();
        this.f37615OooO00o.OooO00o();
        this.f37902OooO0O0 = true;
    }
}
