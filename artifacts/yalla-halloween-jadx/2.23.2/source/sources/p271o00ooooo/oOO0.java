package p271o00ooooo;

import com.google.android.gms.measurement.internal.zzik;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f40647OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzik f40648OooO0o0;

    public oOO0(zzik zzikVar, long j) {
        this.f40648OooO0o0 = zzikVar;
        this.f40647OooO0Oo = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.f40647OooO0Oo;
        zzik zzikVar = this.f40648OooO0o0;
        zzikVar.OooO0o(j, true);
        zzikVar.f40788OooO00o.zzt().zzu(new AtomicReference());
    }
}
