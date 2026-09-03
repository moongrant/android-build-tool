package p028Oooo0oO;

import androidx.camera.core.SurfaceRequest;
import androidx.lifecycle.ProcessLifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00OOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1146OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1147OooO0o0;

    public /* synthetic */ o00OOO0(Object obj, int i) {
        this.f1146OooO0Oo = i;
        this.f1147OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1146OooO0Oo;
        Object obj = this.f1147OooO0o0;
        switch (i) {
            case 0:
                ((SurfaceRequest) obj).f3506OooO0o.cancel(true);
                break;
            default:
                ProcessLifecycleOwner.delayedPauseRunnable$lambda$0((ProcessLifecycleOwner) obj);
                break;
        }
    }
}
