package p314o0O0oOOO;

import android.app.ActivityManager;
import android.content.Context;
import p311o0O0oO0o.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Runtime f41862OooO00o = Runtime.getRuntime();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ActivityManager f41863OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ActivityManager.MemoryInfo f41864OooO0OO;

    static {
        o0O0O00.OooO0Oo();
    }

    public o000O0(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f41863OooO0O0 = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f41864OooO0OO = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
