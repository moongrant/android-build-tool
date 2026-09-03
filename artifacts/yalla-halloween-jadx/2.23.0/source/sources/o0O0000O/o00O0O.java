package o0O0000O;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Task f41626OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f41627OooO0o0;

    public o00O0O(o00Oo0 o00oo1, Task task) {
        this.f41627OooO0o0 = o00oo1;
        this.f41626OooO0Oo = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f41627OooO0o0.f41630OooO0o0) {
            OnSuccessListener onSuccessListener = this.f41627OooO0o0.f41629OooO0o;
            if (onSuccessListener != null) {
                onSuccessListener.onSuccess(this.f41626OooO0Oo.getResult());
            }
        }
    }
}
