package o0O0000O;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOo0 implements o00oO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f40950OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    @Nullable
    public OnFailureListener f40951OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f40952OooO0o0 = new Object();

    public o0OoOo0(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        this.f40950OooO0Oo = executor;
        this.f40951OooO0o = onFailureListener;
    }

    @Override // o0O0000O.o00oO0o
    public final void OooO00o(@NonNull Task task) {
        if (task.isSuccessful() || task.isCanceled()) {
            return;
        }
        synchronized (this.f40952OooO0o0) {
            if (this.f40951OooO0o == null) {
                return;
            }
            this.f40950OooO0Oo.execute(new o000oOoO(this, task));
        }
    }

    @Override // o0O0000O.o00oO0o
    public final void zzc() {
        synchronized (this.f40952OooO0o0) {
            this.f40951OooO0o = null;
        }
    }
}
