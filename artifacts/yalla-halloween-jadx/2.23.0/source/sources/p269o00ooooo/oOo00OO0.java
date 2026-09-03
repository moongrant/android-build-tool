package p269o00ooooo;

import com.google.android.gms.measurement.internal.zzfe;
import com.google.android.gms.measurement.internal.zzik;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo00OO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f41503OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzik f41504OooO0o0;

    public oOo00OO0(zzik zzikVar, long j) {
        this.f41504OooO0o0 = zzikVar;
        this.f41503OooO0Oo = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzik zzikVar = this.f41504OooO0o0;
        zzfe zzfeVar = zzikVar.f41276OooO00o.zzm().f41215OooOO0;
        long j = this.f41503OooO0Oo;
        zzfeVar.zzb(j);
        zzikVar.f41276OooO00o.zzaA().zzc().zzb("Session timeout duration set", Long.valueOf(j));
    }
}
