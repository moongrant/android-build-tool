package p269o00ooooo;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzga;

/* JADX INFO: loaded from: classes3.dex */
public final class o0o0000 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f41238OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ zzga f41239OooO0O0;

    public o0o0000(zzga zzgaVar, String str) {
        this.f41239OooO0O0 = zzgaVar;
        Preconditions.checkNotNull(str);
        this.f41238OooO00o = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f41239OooO0O0.f41276OooO00o.zzaA().zzd().zzb(this.f41238OooO00o, th);
    }
}
