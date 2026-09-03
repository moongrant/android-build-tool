package oo0o0O0;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f60337OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f60338OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Notification f60339OooO0o0;

    public OooO0o(SystemForegroundService systemForegroundService, int i, Notification notification) {
        this.f60338OooO0o = systemForegroundService;
        this.f60337OooO0Oo = i;
        this.f60339OooO0o0 = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f60338OooO0o.f11573OooO0oO.notify(this.f60337OooO0Oo, this.f60339OooO0o0);
    }
}
