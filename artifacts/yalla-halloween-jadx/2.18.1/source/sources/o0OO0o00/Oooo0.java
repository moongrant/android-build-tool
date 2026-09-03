package o0OO0o00;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import o0OO0OoO.o00O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0<TResult> implements o00Ooo<TResult> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f37942OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    @Nullable
    public OnFailureListener f37943OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f37944OooO0o0 = new Object();

    public Oooo0(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        this.f37942OooO0Oo = executor;
        this.f37943OooO0o = onFailureListener;
    }

    @Override // o0OO0o00.o00Ooo
    public final void OooO00o(@NonNull Task<TResult> task) {
        if (task.isSuccessful() || task.isCanceled()) {
            return;
        }
        synchronized (this.f37944OooO0o0) {
            if (this.f37943OooO0o == null) {
                return;
            }
            this.f37942OooO0Oo.execute(new o00O0O0(this, task, 1));
        }
    }

    @Override // o0OO0o00.o00Ooo
    public final void zzc() {
        synchronized (this.f37944OooO0o0) {
            this.f37943OooO0o = null;
        }
    }
}
