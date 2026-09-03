package o00;

import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f26560Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f26561Oooo0oO;

    public OooO0o(SystemForegroundService systemForegroundService, int i) {
        this.f26561Oooo0oO = systemForegroundService;
        this.f26560Oooo0o = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26561Oooo0oO.f9836Oooo.cancel(this.f26560Oooo0o);
    }
}
