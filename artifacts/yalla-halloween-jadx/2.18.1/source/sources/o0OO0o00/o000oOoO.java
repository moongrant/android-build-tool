package o0OO0o00;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Task f37948Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f37949Oooo0oO;

    public o000oOoO(o0OoOo0 o0oooo1, Task task) {
        this.f37949Oooo0oO = o0oooo1;
        this.f37948Oooo0o = task;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f37949Oooo0oO.f37966OooO0o0) {
            OnSuccessListener<? super TResult> onSuccessListener = this.f37949Oooo0oO.f37965OooO0o;
            if (onSuccessListener != 0) {
                onSuccessListener.onSuccess((Object) this.f37948Oooo0o.getResult());
            }
        }
    }
}
