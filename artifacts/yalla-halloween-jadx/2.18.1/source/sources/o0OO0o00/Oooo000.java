package o0OO0o00;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import o0OO0OoO.o00O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000<TResult> implements o00Ooo<TResult> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f37945OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    @Nullable
    public OnCompleteListener<TResult> f37946OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Object f37947OooO0o0 = new Object();

    public Oooo000(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.f37945OooO0Oo = executor;
        this.f37946OooO0o = onCompleteListener;
    }

    @Override // o0OO0o00.o00Ooo
    public final void OooO00o(@NonNull Task<TResult> task) {
        synchronized (this.f37947OooO0o0) {
            if (this.f37946OooO0o == null) {
                return;
            }
            this.f37945OooO0Oo.execute(new o00O0O00(this, task, 1));
        }
    }

    @Override // o0OO0o00.o00Ooo
    public final void zzc() {
        synchronized (this.f37947OooO0o0) {
            this.f37946OooO0o = null;
        }
    }
}
