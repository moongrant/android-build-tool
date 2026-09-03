package o0O0000O;

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

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O00<TResult> extends Task<TResult> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f41633OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0ooOOo f41634OooO0O0 = new o0ooOOo();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("mLock")
    public boolean f41635OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile boolean f41636OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("mLock")
    public Exception f41637OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    @GuardedBy("mLock")
    public Object f41638OooO0o0;

    public final void OooO00o(@NonNull Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.f41633OooO00o) {
            if (this.f41635OooO0OO) {
                throw DuplicateTaskCompletionException.of(this);
            }
            this.f41635OooO0OO = true;
            this.f41637OooO0o = exc;
        }
        this.f41634OooO0O0.OooO0O0(this);
    }

    public final void OooO0O0(@Nullable Object obj) {
        synchronized (this.f41633OooO00o) {
            if (this.f41635OooO0OO) {
                throw DuplicateTaskCompletionException.of(this);
            }
            this.f41635OooO0OO = true;
            this.f41638OooO0o0 = obj;
        }
        this.f41634OooO0O0.OooO0O0(this);
    }

    public final void OooO0OO() {
        synchronized (this.f41633OooO00o) {
            if (this.f41635OooO0OO) {
                return;
            }
            this.f41635OooO0OO = true;
            this.f41636OooO0Oo = true;
            this.f41634OooO0O0.OooO0O0(this);
        }
    }

    public final void OooO0Oo() {
        synchronized (this.f41633OooO00o) {
            if (this.f41635OooO0OO) {
                this.f41634OooO0O0.OooO0O0(this);
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCanceledListener(@NonNull Activity activity, @NonNull OnCanceledListener onCanceledListener) {
        OooOo oooOo = new OooOo(TaskExecutors.MAIN_THREAD, onCanceledListener);
        this.f41634OooO0O0.OooO00o(oooOo);
        oo0o0Oo.OooO0O0(activity).OooO0OO(oooOo);
        OooO0Oo();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCompleteListener(@NonNull Activity activity, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        Oooo0 oooo0 = new Oooo0(TaskExecutors.MAIN_THREAD, onCompleteListener);
        this.f41634OooO0O0.OooO00o(oooo0);
        oo0o0Oo.OooO0O0(activity).OooO0OO(oooo0);
        OooO0Oo();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnFailureListener(@NonNull Activity activity, @NonNull OnFailureListener onFailureListener) {
        o0OoOo0 o0oooo0 = new o0OoOo0(TaskExecutors.MAIN_THREAD, onFailureListener);
        this.f41634OooO0O0.OooO00o(o0oooo0);
        oo0o0Oo.OooO0O0(activity).OooO0OO(o0oooo0);
        OooO0Oo();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnSuccessListener(@NonNull Activity activity, @NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        o00Oo0 o00oo1 = new o00Oo0(TaskExecutors.MAIN_THREAD, onSuccessListener);
        this.f41634OooO0O0.OooO00o(o00oo1);
        oo0o0Oo.OooO0O0(activity).OooO0OO(o00oo1);
        OooO0Oo();
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
        synchronized (this.f41633OooO00o) {
            exc = this.f41637OooO0o;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final TResult getResult() {
        TResult tresult;
        synchronized (this.f41633OooO00o) {
            Preconditions.checkState(this.f41635OooO0OO, "Task is not yet complete");
            if (this.f41636OooO0Oo) {
                throw new CancellationException("Task is already canceled.");
            }
            Exception exc = this.f41637OooO0o;
            if (exc != null) {
                throw new RuntimeExecutionException(exc);
            }
            tresult = (TResult) this.f41638OooO0o0;
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isCanceled() {
        return this.f41636OooO0Oo;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isComplete() {
        boolean z;
        synchronized (this.f41633OooO00o) {
            z = this.f41635OooO0OO;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean isSuccessful() {
        boolean z;
        synchronized (this.f41633OooO00o) {
            z = false;
            if (this.f41635OooO0OO && !this.f41636OooO0Oo && this.f41637OooO0o == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> onSuccessTask(@NonNull SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        Executor executor = TaskExecutors.MAIN_THREAD;
        o0O0O00 o0o0o00 = new o0O0O00();
        this.f41634OooO0O0.OooO00o(new oo000o(executor, successContinuation, o0o0o00));
        OooO0Oo();
        return o0o0o00;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> continueWith(@NonNull Executor executor, @NonNull Continuation<TResult, TContinuationResult> continuation) {
        o0O0O00 o0o0o00 = new o0O0O00();
        this.f41634OooO0O0.OooO00o(new OooOOO0(executor, continuation, o0o0o00));
        OooO0Oo();
        return o0o0o00;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final <TContinuationResult> Task<TContinuationResult> continueWithTask(@NonNull Executor executor, @NonNull Continuation<TResult, Task<TContinuationResult>> continuation) {
        o0O0O00 o0o0o00 = new o0O0O00();
        this.f41634OooO0O0.OooO00o(new OooOOOO(executor, continuation, o0o0o00));
        OooO0Oo();
        return o0o0o00;
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
        this.f41634OooO0O0.OooO00o(new Oooo0(TaskExecutors.MAIN_THREAD, onCompleteListener));
        OooO0Oo();
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
        o0O0O00 o0o0o00 = new o0O0O00();
        this.f41634OooO0O0.OooO00o(new oo000o(executor, successContinuation, o0o0o00));
        OooO0Oo();
        return o0o0o00;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCanceledListener(@NonNull Executor executor, @NonNull OnCanceledListener onCanceledListener) {
        this.f41634OooO0O0.OooO00o(new OooOo(executor, onCanceledListener));
        OooO0Oo();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnFailureListener(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener) {
        this.f41634OooO0O0.OooO00o(new o0OoOo0(executor, onFailureListener));
        OooO0Oo();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnSuccessListener(@NonNull Executor executor, @NonNull OnSuccessListener<? super TResult> onSuccessListener) {
        this.f41634OooO0O0.OooO00o(new o00Oo0(executor, onSuccessListener));
        OooO0Oo();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @NonNull
    public final Task<TResult> addOnCompleteListener(@NonNull Executor executor, @NonNull OnCompleteListener<TResult> onCompleteListener) {
        this.f41634OooO0O0.OooO00o(new Oooo0(executor, onCompleteListener));
        OooO0Oo();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <X extends Throwable> TResult getResult(@NonNull Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.f41633OooO00o) {
            Preconditions.checkState(this.f41635OooO0OO, "Task is not yet complete");
            if (!this.f41636OooO0Oo) {
                if (!cls.isInstance(this.f41637OooO0o)) {
                    Exception exc = this.f41637OooO0o;
                    if (exc == null) {
                        tresult = (TResult) this.f41638OooO0o0;
                    } else {
                        throw new RuntimeExecutionException(exc);
                    }
                } else {
                    throw cls.cast(this.f41637OooO0o);
                }
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return tresult;
    }
}
