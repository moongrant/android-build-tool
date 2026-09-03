package p271o00ooooo;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzga;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O000o implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f40603OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ zzga f40604OooO0O0;

    public oO0O000o(zzga zzgaVar, String str) {
        this.f40604OooO0O0 = zzgaVar;
        Preconditions.checkNotNull(str);
        this.f40603OooO00o = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f40604OooO0O0.f40788OooO00o.zzaA().zzd().zzb(this.f40603OooO00o, th);
    }
}
