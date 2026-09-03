package androidx.camera.core.impl;

import androidx.lifecycle.ComputableLiveData;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f3668OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f3669OooO0o0;

    public /* synthetic */ o0000O0(Object obj, int i) {
        this.f3668OooO0Oo = i;
        this.f3669OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3668OooO0Oo;
        Object obj = this.f3669OooO0o0;
        switch (i) {
            case 0:
                ((com.google.common.util.concurrent.OooO00o) obj).cancel(true);
                break;
            default:
                ComputableLiveData.invalidationRunnable$lambda$1((ComputableLiveData) obj);
                break;
        }
    }
}
