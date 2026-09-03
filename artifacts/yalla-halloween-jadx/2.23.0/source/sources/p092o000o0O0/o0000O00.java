package p092o000o0O0;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f35299OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f35300OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Notification f35301OooO0o0;

    public o0000O00(SystemForegroundService systemForegroundService, int i, Notification notification) {
        this.f35300OooO0o = systemForegroundService;
        this.f35299OooO0Oo = i;
        this.f35301OooO0o0 = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35300OooO0o.f8482OooO0oO.notify(this.f35299OooO0Oo, this.f35301OooO0o0);
    }
}
