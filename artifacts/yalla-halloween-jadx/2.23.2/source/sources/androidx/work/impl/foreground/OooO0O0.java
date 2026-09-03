package androidx.work.impl.foreground;

import android.app.Notification;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f11565OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f11566OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Notification f11567OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f11568OooO0oO;

    public OooO0O0(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.f11568OooO0oO = systemForegroundService;
        this.f11565OooO0Oo = i;
        this.f11567OooO0o0 = notification;
        this.f11566OooO0o = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = Build.VERSION.SDK_INT;
        int i2 = this.f11566OooO0o;
        Notification notification = this.f11567OooO0o0;
        int i3 = this.f11565OooO0Oo;
        SystemForegroundService systemForegroundService = this.f11568OooO0oO;
        if (i >= 31) {
            SystemForegroundService.OooO0O0.OooO00o(systemForegroundService, i3, notification, i2);
        } else if (i >= 29) {
            SystemForegroundService.OooO00o.OooO00o(systemForegroundService, i3, notification, i2);
        } else {
            systemForegroundService.startForeground(i3, notification);
        }
    }
}
