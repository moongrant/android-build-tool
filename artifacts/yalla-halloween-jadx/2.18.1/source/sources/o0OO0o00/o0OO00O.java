package o0OO0o00;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O<TResult> extends Task<TResult> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f37956OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo000o<TResult> f37957OooO0O0 = new oo000o<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("mLock")
    public boolean f37958OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile boolean f37959OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    public Exception f37960OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public TResult f37961OooO0o0;

    public final void OooO00o(@NonNull Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.f37956OooO00o) {
            if (this.f37958OooO0OO) {
                throw DuplicateTaskCompletionException.of(this);
            }
            this.f37958OooO0OO = true;
            this.f37960OooO0o = exc;
        }
        this.f37957OooO0O0.OooO0O0(this);
    }

    public final void OooO0O0(@Nullable TResult tresult) {
        synchronized (this.f37956OooO00o) {
            if (this.f37958OooO0OO) {
                throw DuplicateTaskCompletionException.of(this);
            }
            this.f37958OooO0OO = true;
            this.f37961OooO0o0 = tresult;
        }
        this.f37957OooO0O0.OooO0O0(this);
    }

    public final boolean OooO0OO() {
        synchronized (this.f37956OooO00o) {
            if (this.f37958OooO0OO) {
                return false;
            }
            this.f37958OooO0OO = true;
            this.f37959OooO0Oo = true;
            this.f37957OooO0O0.OooO0O0(this);
            return true;
        }
    }

    public final boolean OooO0Oo(@Nullable TResult tresult) {
        synchronized (this.f37956OooO00o) {
            if (this.f37958OooO0OO) {
                return false;
            }
            this.f37958OooO0OO = true;
            this.f37961OooO0o0 = tresult;
            this.f37957OooO0O0.OooO0O0(this);
            return true;
        }
    }

    public final void OooO0o0() {
        synchronized (this.f37956OooO00o) {
            if (this.f37958OooO0OO) {
                this.f37957OooO0O0.OooO0O0(this);
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCanceledListener(@NonNull Activity activity, @NonNull OnCanceledListener onCanceledListener) {
        OooOo oooOo = new OooOo(TaskExecutors.MAIN_THREAD, onCanceledListener);
        this.f37957OooO0O0.OooO00o(oooOo);
        o0Oo0oo.OooO0O0(activity).OooO0OO(oooOo);
        OooO0o0();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCompleteListener(@NonNull Activity activity, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        Oooo000 oooo000 = new Oooo000(TaskExecutors.MAIN_THREAD, onCompleteListener);
        this.f37957OooO0O0.OooO00o(oooo000);
        o0Oo0oo.OooO0O0(activity).OooO0OO(oooo000);
        OooO0o0();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnFailureListener(@NonNull Activity activity, @NonNull OnFailureListener onFailureListener) {
        Oooo0 oooo0 = new Oooo0(TaskExecutors.MAIN_THREAD, onFailureListener);
        this.f37957OooO0O0.OooO00o(oooo0);
        o0Oo0oo.OooO0O0(activity).OooO0OO(oooo0);
        OooO0o0();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnSuccessListener(@NonNull Activity activity, @NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        o0OoOo0 o0oooo1 = new o0OoOo0(TaskExecutors.MAIN_THREAD, onSuccessListener);
        this.f37957OooO0O0.OooO00o(o0oooo1);
        o0Oo0oo.OooO0O0(activity).OooO0OO(o0oooo1);
        OooO0o0();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@NonNull Continuation<TResult, TContinuationResult> continuation) {
        return continueWith(TaskExecutors.MAIN_THREAD, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@NonNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        return continueWithTask(TaskExecutors.MAIN_THREAD, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    @Nullable
    public final Exception getException() {
        Exception exc;
        synchronized (this.f37956OooO00o) {
            exc = this.f37960OooO0o;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final TResult getResult() {
        TResult tresult;
        synchronized (this.f37956OooO00o) {
            Preconditions.checkState(this.f37958OooO0OO, "Task is not yet complete");
            if (this.f37959OooO0Oo) {
                throw new CancellationException("Task is already canceled.");
            }
            Exception exc = this.f37960OooO0o;
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            tresult = this.f37961OooO0o0;
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return this.f37959OooO0Oo;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        boolean z;
        synchronized (this.f37956OooO00o) {
            z = this.f37958OooO0OO;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z;
        synchronized (this.f37956OooO00o) {
            z = false;
            if (this.f37958OooO0OO && !this.f37959OooO0Oo && this.f37960OooO0o == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(@NonNull SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        Executor executor = TaskExecutors.MAIN_THREAD;
        o0OO00O o0oo00o2 = new o0OO00O();
        this.f37957OooO0O0.OooO00o(new o00Oo0(executor, successContinuation, o0oo00o2));
        OooO0o0();
        return o0oo00o2;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@NonNull Executor executor, @NonNull Continuation<TResult, TContinuationResult> continuation) {
        o0OO00O o0oo00o2 = new o0OO00O();
        this.f37957OooO0O0.OooO00o(new OooOOO(executor, continuation, o0oo00o2));
        OooO0o0();
        return o0oo00o2;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@NonNull Executor executor, @NonNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        o0OO00O o0oo00o2 = new o0OO00O();
        this.f37957OooO0O0.OooO00o(new OooOOOO(executor, continuation, o0oo00o2));
        OooO0o0();
        return o0oo00o2;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCanceledListener(@NonNull OnCanceledListener onCanceledListener) {
        addOnCanceledListener(TaskExecutors.MAIN_THREAD, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCompleteListener(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.f37957OooO0O0.OooO00o(new Oooo000(TaskExecutors.MAIN_THREAD, onCompleteListener));
        OooO0o0();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnFailureListener(@NonNull OnFailureListener onFailureListener) {
        addOnFailureListener(TaskExecutors.MAIN_THREAD, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnSuccessListener(@NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        addOnSuccessListener(TaskExecutors.MAIN_THREAD, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        o0OO00O o0oo00o2 = new o0OO00O();
        this.f37957OooO0O0.OooO00o(new o00Oo0(executor, successContinuation, o0oo00o2));
        OooO0o0();
        return o0oo00o2;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCanceledListener(@NonNull Executor executor, @NonNull OnCanceledListener onCanceledListener) {
        this.f37957OooO0O0.OooO00o(new OooOo(executor, onCanceledListener));
        OooO0o0();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnFailureListener(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        this.f37957OooO0O0.OooO00o(new Oooo0(executor, onFailureListener));
        OooO0o0();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnSuccessListener(@NonNull Executor executor, @NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        this.f37957OooO0O0.OooO00o(new o0OoOo0(executor, onSuccessListener));
        OooO0o0();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCompleteListener(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.f37957OooO0O0.OooO00o(new Oooo000(executor, onCompleteListener));
        OooO0o0();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <X extends Throwable> TResult getResult(@NonNull Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f37956OooO00o) {
            Preconditions.checkState(this.f37958OooO0OO, "Task is not yet complete");
            if (!this.f37959OooO0Oo) {
                if (!cls.isInstance(this.f37960OooO0o)) {
                    Exception exc = this.f37960OooO0o;
                    if (exc == null) {
                        tresult = this.f37961OooO0o0;
                    } else {
                        throw new RuntimeExecutionException(exc);
                    }
                } else {
                    throw cls.cast(this.f37960OooO0o);
                }
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return tresult;
    }
}
