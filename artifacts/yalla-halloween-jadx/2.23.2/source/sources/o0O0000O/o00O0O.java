package o0O0000O;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Task f40935OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f40936OooO0o0;

    public o00O0O(o00Oo0 o00oo1, Task task) {
        this.f40936OooO0o0 = o00oo1;
        this.f40935OooO0Oo = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f40936OooO0o0.f40939OooO0o0) {
            OnSuccessListener onSuccessListener = this.f40936OooO0o0.f40938OooO0o;
            if (onSuccessListener != null) {
                onSuccessListener.onSuccess(this.f40935OooO0Oo.getResult());
            }
        }
    }
}
