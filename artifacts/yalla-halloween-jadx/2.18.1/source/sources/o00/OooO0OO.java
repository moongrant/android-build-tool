package o00;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f26557Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Notification f26558Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f26559Oooo0oo;

    public OooO0OO(SystemForegroundService systemForegroundService, int i, Notification notification) {
        this.f26559Oooo0oo = systemForegroundService;
        this.f26557Oooo0o = i;
        this.f26558Oooo0oO = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26559Oooo0oo.f9836Oooo.notify(this.f26557Oooo0o, this.f26558Oooo0oO);
    }
}
