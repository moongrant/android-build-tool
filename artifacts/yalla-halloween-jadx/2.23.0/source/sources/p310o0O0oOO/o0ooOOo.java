package p310o0O0oOO;

import android.app.ActivityManager;
import android.content.Context;
import p307o0O0oO0.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Runtime f42525OooO00o = Runtime.getRuntime();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ActivityManager f42526OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ActivityManager.MemoryInfo f42527OooO0OO;

    static {
        OooOOO0.OooO0Oo();
    }

    public o0ooOOo(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f42526OooO0O0 = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f42527OooO0OO = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
