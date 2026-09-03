package o0OO0OoO;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfv;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f37543OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ zzfv f37544OooO0O0;

    public o00000O0(zzfv zzfvVar, String str) {
        this.f37544OooO0O0 = zzfvVar;
        Preconditions.checkNotNull(str);
        this.f37543OooO00o = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f37544OooO0O0.f37615OooO00o.zzay().zzd().zzb(this.f37543OooO00o, th);
    }
}
