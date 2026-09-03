package o0O0000O;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo implements o00oO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f41613OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    @Nullable
    public OnCanceledListener f41614OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f41615OooO0o0 = new Object();

    public OooOo(@NonNull Executor executor, @NonNull OnCanceledListener onCanceledListener) {
        this.f41613OooO0Oo = executor;
        this.f41614OooO0o = onCanceledListener;
    }

    @Override // o0O0000O.o00oO0o
    public final void OooO00o(@NonNull Task task) {
        if (task.isCanceled()) {
            synchronized (this.f41615OooO0o0) {
                if (this.f41614OooO0o == null) {
                    return;
                }
                this.f41613OooO0Oo.execute(new OooOo00(this));
            }
        }
    }

    @Override // o0O0000O.o00oO0o
    public final void zzc() {
        synchronized (this.f41615OooO0o0) {
            this.f41614OooO0o = null;
        }
    }
}
