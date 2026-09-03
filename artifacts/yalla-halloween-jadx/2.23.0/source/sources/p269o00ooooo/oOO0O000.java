package p269o00ooooo;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzej;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzjz;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0O000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzej f41451OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzjy f41452OooO0o0;

    public oOO0O000(zzjy zzjyVar, zzej zzejVar) {
        this.f41452OooO0o0 = zzjyVar;
        this.f41451OooO0Oo = zzejVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f41452OooO0o0) {
            this.f41452OooO0o0.f16059OooO00o = false;
            if (!this.f41452OooO0o0.f16061OooO0OO.zzL()) {
                this.f41452OooO0o0.f16061OooO0OO.f41276OooO00o.zzaA().zzc().zza("Connected to remote service");
                zzjz zzjzVar = this.f41452OooO0o0.f16061OooO0OO;
                zzej zzejVar = this.f41451OooO0Oo;
                zzjzVar.zzg();
                Preconditions.checkNotNull(zzejVar);
                zzjzVar.f16064OooO0Oo = zzejVar;
                zzjzVar.OooO();
                zzjzVar.OooO0oo();
            }
        }
    }
}
