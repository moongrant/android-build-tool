package o0O0000O;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 implements o00oO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f41628OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    @Nullable
    public OnSuccessListener f41629OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f41630OooO0o0 = new Object();

    public o00Oo0(@NonNull Executor executor, @NonNull OnSuccessListener onSuccessListener) {
        this.f41628OooO0Oo = executor;
        this.f41629OooO0o = onSuccessListener;
    }

    @Override // o0O0000O.o00oO0o
    public final void OooO00o(@NonNull Task task) {
        if (task.isSuccessful()) {
            synchronized (this.f41630OooO0o0) {
                if (this.f41629OooO0o == null) {
                    return;
                }
                this.f41628OooO0Oo.execute(new o00O0O(this, task));
            }
        }
    }

    @Override // o0O0000O.o00oO0o
    public final void zzc() {
        synchronized (this.f41630OooO0o0) {
            this.f41629OooO0o = null;
        }
    }
}
