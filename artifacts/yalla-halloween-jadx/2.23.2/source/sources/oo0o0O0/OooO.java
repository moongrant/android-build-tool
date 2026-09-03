package oo0o0O0;

import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f60333OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f60334OooO0o0;

    public OooO(SystemForegroundService systemForegroundService, int i) {
        this.f60334OooO0o0 = systemForegroundService;
        this.f60333OooO0Oo = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f60334OooO0o0.f11573OooO0oO.cancel(this.f60333OooO0Oo);
    }
}
