package p243o00oo00O;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final double f34163OooO00o = 1.0d / Math.pow(10.0d, 6.0d);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f34164OooO0O0 = 0;

    public static double OooO00o(long j) {
        return (SystemClock.elapsedRealtimeNanos() - j) * f34163OooO00o;
    }
}
