package o0O0000O;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Task f40933OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f40934OooO0o0;

    public o000oOoO(o0OoOo0 o0oooo1, Task task) {
        this.f40934OooO0o0 = o0oooo1;
        this.f40933OooO0Oo = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f40934OooO0o0.f40952OooO0o0) {
            OnFailureListener onFailureListener = this.f40934OooO0o0.f40951OooO0o;
            if (onFailureListener != null) {
                onFailureListener.onFailure((Exception) Preconditions.checkNotNull(this.f40933OooO0Oo.getException()));
            }
        }
    }
}
