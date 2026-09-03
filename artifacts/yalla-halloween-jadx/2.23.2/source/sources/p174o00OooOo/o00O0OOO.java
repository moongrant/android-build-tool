package p174o00OooOo;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final double f38346OooO00o = 1.0d / Math.pow(10.0d, 6.0d);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f38347OooO0O0 = 0;

    public static double OooO00o(long j) {
        return (SystemClock.elapsedRealtimeNanos() - j) * f38346OooO00o;
    }
}
