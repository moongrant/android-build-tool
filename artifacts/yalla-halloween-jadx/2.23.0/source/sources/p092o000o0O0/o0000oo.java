package p092o000o0O0;

import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f35302OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f35303OooO0o0;

    public o0000oo(SystemForegroundService systemForegroundService, int i) {
        this.f35303OooO0o0 = systemForegroundService;
        this.f35302OooO0Oo = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35303OooO0o0.f8482OooO0oO.cancel(this.f35302OooO0Oo);
    }
}
