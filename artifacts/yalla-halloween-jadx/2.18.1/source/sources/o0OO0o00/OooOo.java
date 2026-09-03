package o0OO0o00;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo<TResult> implements o00Ooo<TResult> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f37938OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    @Nullable
    public OnCanceledListener f37939OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f37940OooO0o0 = new Object();

    public OooOo(@NonNull Executor executor, @NonNull OnCanceledListener onCanceledListener) {
        this.f37938OooO0Oo = executor;
        this.f37939OooO0o = onCanceledListener;
    }

    @Override // o0OO0o00.o00Ooo
    public final void OooO00o(@NonNull Task<TResult> task) {
        if (task.isCanceled()) {
            synchronized (this.f37940OooO0o0) {
                if (this.f37939OooO0o == null) {
                    return;
                }
                this.f37938OooO0Oo.execute(new OooOo00(this));
            }
        }
    }

    @Override // o0OO0o00.o00Ooo
    public final void zzc() {
        synchronized (this.f37940OooO0o0) {
            this.f37939OooO0o = null;
        }
    }
}
