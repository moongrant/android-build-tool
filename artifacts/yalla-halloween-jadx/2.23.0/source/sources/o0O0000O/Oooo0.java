package o0O0000O;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo0 implements o00oO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f41617OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    @Nullable
    public OnCompleteListener f41618OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f41619OooO0o0 = new Object();

    public Oooo0(@NonNull Executor executor, @NonNull OnCompleteListener onCompleteListener) {
        this.f41617OooO0Oo = executor;
        this.f41618OooO0o = onCompleteListener;
    }

    @Override // o0O0000O.o00oO0o
    public final void OooO00o(@NonNull Task task) {
        synchronized (this.f41619OooO0o0) {
            if (this.f41618OooO0o == null) {
                return;
            }
            this.f41617OooO0Oo.execute(new Oooo000(this, task));
        }
    }

    @Override // o0O0000O.o00oO0o
    public final void zzc() {
        synchronized (this.f41619OooO0o0) {
            this.f41618OooO0o = null;
        }
    }
}
