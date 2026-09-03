package p271o00ooooo;

import com.google.android.gms.measurement.internal.zzfe;
import com.google.android.gms.measurement.internal.zzik;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f40649OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzik f40650OooO0o0;

    public oOO00(zzik zzikVar, long j) {
        this.f40650OooO0o0 = zzikVar;
        this.f40649OooO0Oo = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzik zzikVar = this.f40650OooO0o0;
        zzfe zzfeVar = zzikVar.f40788OooO00o.zzm().f40771OooOO0;
        long j = this.f40649OooO0Oo;
        zzfeVar.zzb(j);
        zzikVar.f40788OooO00o.zzaA().zzc().zzb("Session timeout duration set", Long.valueOf(j));
    }
}
