package o0O0000O;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Task f41620OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f41621OooO0o0;

    public Oooo000(Oooo0 oooo0, Task task) {
        this.f41621OooO0o0 = oooo0;
        this.f41620OooO0Oo = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f41621OooO0o0.f41619OooO0o0) {
            OnCompleteListener onCompleteListener = this.f41621OooO0o0.f41618OooO0o;
            if (onCompleteListener != null) {
                onCompleteListener.onComplete(this.f41620OooO0Oo);
            }
        }
    }
}
