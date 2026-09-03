package p361o0OOOoOo;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Callable f38465Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f38466Oooo0oO;

    public class OooO00o implements Continuation<Object, Void> {
        public OooO00o() {
        }

        @Override // com.google.android.gms.tasks.Continuation
        public final Void then(@NonNull Task<Object> task) throws Exception {
            if (task.isSuccessful()) {
                o000O0o.this.f38466Oooo0oO.setResult(task.getResult());
                return null;
            }
            o000O0o.this.f38466Oooo0oO.setException(task.getException());
            return null;
        }
    }

    public o000O0o(Callable callable, TaskCompletionSource taskCompletionSource) {
        this.f38465Oooo0o = callable;
        this.f38466Oooo0oO = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ((Task) this.f38465Oooo0o.call()).continueWith(new OooO00o());
        } catch (Exception e) {
            this.f38466Oooo0oO.setException(e);
        }
    }
}
