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
    public final Executor f40922OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    @Nullable
    public OnCanceledListener f40923OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f40924OooO0o0 = new Object();

    public OooOo(@NonNull Executor executor, @NonNull OnCanceledListener onCanceledListener) {
        this.f40922OooO0Oo = executor;
        this.f40923OooO0o = onCanceledListener;
    }

    @Override // o0O0000O.o00oO0o
    public final void OooO00o(@NonNull Task task) {
        if (task.isCanceled()) {
            synchronized (this.f40924OooO0o0) {
                if (this.f40923OooO0o == null) {
                    return;
                }
                this.f40922OooO0Oo.execute(new OooOo00(this));
            }
        }
    }

    @Override // o0O0000O.o00oO0o
    public final void zzc() {
        synchronized (this.f40924OooO0o0) {
            this.f40923OooO0o = null;
        }
    }
}
