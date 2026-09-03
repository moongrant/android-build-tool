package p092o000o0O0;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f35292OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f35293OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Notification f35294OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f35295OooO0oO;

    public o0000(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.f35295OooO0oO = systemForegroundService;
        this.f35292OooO0Oo = i;
        this.f35294OooO0o0 = notification;
        this.f35293OooO0o = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = Build.VERSION.SDK_INT;
        Notification notification = this.f35294OooO0o0;
        int i2 = this.f35292OooO0Oo;
        SystemForegroundService systemForegroundService = this.f35295OooO0oO;
        if (i >= 29) {
            systemForegroundService.startForeground(i2, notification, this.f35293OooO0o);
        } else {
            systemForegroundService.startForeground(i2, notification);
        }
    }
}
