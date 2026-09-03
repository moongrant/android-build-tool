package p271o00ooooo;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzej;
import com.google.android.gms.measurement.internal.zzjy;
import com.google.android.gms.measurement.internal.zzjz;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzej f40841OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzjy f40842OooO0o0;

    public t(zzjy zzjyVar, zzej zzejVar) {
        this.f40842OooO0o0 = zzjyVar;
        this.f40841OooO0Oo = zzejVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f40842OooO0o0) {
            this.f40842OooO0o0.f15583OooO00o = false;
            if (!this.f40842OooO0o0.f15585OooO0OO.zzL()) {
                this.f40842OooO0o0.f15585OooO0OO.f40788OooO00o.zzaA().zzc().zza("Connected to remote service");
                zzjz zzjzVar = this.f40842OooO0o0.f15585OooO0OO;
                zzej zzejVar = this.f40841OooO0Oo;
                zzjzVar.zzg();
                Preconditions.checkNotNull(zzejVar);
                zzjzVar.f15588OooO0Oo = zzejVar;
                zzjzVar.OooO();
                zzjzVar.OooO0oo();
            }
        }
    }
}
