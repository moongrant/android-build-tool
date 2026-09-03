package o0OO0o00;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0<TResult> implements o00Ooo<TResult> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f37964OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    @Nullable
    public OnSuccessListener<? super TResult> f37965OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f37966OooO0o0 = new Object();

    public o0OoOo0(@NonNull Executor executor, @NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        this.f37964OooO0Oo = executor;
        this.f37965OooO0o = onSuccessListener;
    }

    @Override // o0OO0o00.o00Ooo
    public final void OooO00o(@NonNull Task<TResult> task) {
        if (task.isSuccessful()) {
            synchronized (this.f37966OooO0o0) {
                if (this.f37965OooO0o == null) {
                    return;
                }
                this.f37964OooO0Oo.execute(new o000oOoO(this, task));
            }
        }
    }

    @Override // o0OO0o00.o00Ooo
    public final void zzc() {
        synchronized (this.f37966OooO0o0) {
            this.f37965OooO0o = null;
        }
    }
}
