package p269o00ooooo;

import com.google.android.gms.measurement.internal.zzik;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00OOOo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f41296OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzik f41297OooO0o0;

    public oO00OOOo(zzik zzikVar, long j) {
        this.f41297OooO0o0 = zzikVar;
        this.f41296OooO0Oo = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.f41296OooO0Oo;
        zzik zzikVar = this.f41297OooO0o0;
        zzikVar.OooO0o(j, true);
        zzikVar.f41276OooO00o.zzt().zzu(new AtomicReference());
    }
}
