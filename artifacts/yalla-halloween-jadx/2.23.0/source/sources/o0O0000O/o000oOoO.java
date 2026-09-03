package o0O0000O;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Task f41624OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f41625OooO0o0;

    public o000oOoO(o0OoOo0 o0oooo0, Task task) {
        this.f41625OooO0o0 = o0oooo0;
        this.f41624OooO0Oo = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f41625OooO0o0.f41643OooO0o0) {
            OnFailureListener onFailureListener = this.f41625OooO0o0.f41642OooO0o;
            if (onFailureListener != null) {
                onFailureListener.onFailure((Exception) Preconditions.checkNotNull(this.f41624OooO0Oo.getException()));
            }
        }
    }
}
