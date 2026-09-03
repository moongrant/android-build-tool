package com.google.android.gms.tasks;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.tasks.zza;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o0O0000O.OooO;
import o0O0000O.OooO0O0;
import o0O0000O.OooO0OO;
import o0O0000O.OooO0o;
import o0O0000O.OooOO0;
import o0O0000O.o000OOo;
import o0O0000O.o0O0O00;
import o0O0000O.o0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
public final class Tasks {
    public static Object OooO00o(@NonNull Task task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    public static <TResult> TResult await(@NonNull Task<TResult> task) throws ExecutionException, InterruptedException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        if (task.isComplete()) {
            return (TResult) OooO00o(task);
        }
        OooO0o oooO0o = new OooO0o();
        o0Oo0oo o0oo0oo2 = TaskExecutors.f16158OooO00o;
        task.addOnSuccessListener(o0oo0oo2, oooO0o);
        task.addOnFailureListener(o0oo0oo2, oooO0o);
        task.addOnCanceledListener(o0oo0oo2, oooO0o);
        oooO0o.f41601OooO0Oo.await();
        return (TResult) OooO00o(task);
    }

    @NonNull
    @Deprecated
    public static <TResult> Task<TResult> call(@NonNull Callable<TResult> callable) {
        return call(TaskExecutors.MAIN_THREAD, callable);
    }

    @NonNull
    public static <TResult> Task<TResult> forCanceled() {
        o0O0O00 o0o0o00 = new o0O0O00();
        o0o0o00.OooO0OO();
        return o0o0o00;
    }

    @NonNull
    public static <TResult> Task<TResult> forException(@NonNull Exception exc) {
        o0O0O00 o0o0o00 = new o0O0O00();
        o0o0o00.OooO00o(exc);
        return o0o0o00;
    }

    @NonNull
    public static <TResult> Task<TResult> forResult(TResult tresult) {
        o0O0O00 o0o0o00 = new o0O0O00();
        o0o0o00.OooO0O0(tresult);
        return o0o0o00;
    }

    @NonNull
    public static Task<Void> whenAll(@Nullable Collection<? extends Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return forResult(null);
        }
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        o0O0O00 o0o0o00 = new o0O0O00();
        OooO oooO = new OooO(collection.size(), o0o0o00);
        for (Task<?> task : collection) {
            o0Oo0oo o0oo0oo2 = TaskExecutors.f16158OooO00o;
            task.addOnSuccessListener(o0oo0oo2, oooO);
            task.addOnFailureListener(o0oo0oo2, oooO);
            task.addOnCanceledListener(o0oo0oo2, oooO);
        }
        return o0o0o00;
    }

    @NonNull
    public static Task<List<Task<?>>> whenAllComplete(@Nullable Collection<? extends Task<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return forResult(Collections.emptyList());
        }
        return whenAll(collection).continueWithTask(TaskExecutors.MAIN_THREAD, new OooO0OO(collection));
    }

    @NonNull
    public static <TResult> Task<List<TResult>> whenAllSuccess(@Nullable Collection<? extends Task> collection) {
        if (collection == null || collection.isEmpty()) {
            return forResult(Collections.emptyList());
        }
        return (Task<List<TResult>>) whenAll((Collection<? extends Task<?>>) collection).continueWith(TaskExecutors.MAIN_THREAD, new OooO0O0(collection));
    }

    @NonNull
    public static <T> Task<T> withTimeout(@NonNull Task<T> task, long j, @NonNull TimeUnit timeUnit) {
        Preconditions.checkNotNull(task, "Task must not be null");
        Preconditions.checkArgument(j > 0, "Timeout must be positive");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        final OooOO0 oooOO1 = new OooOO0();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(oooOO1);
        final zza zzaVar = new zza(Looper.getMainLooper());
        zzaVar.postDelayed(new Runnable() { // from class: com.google.android.gms.tasks.zzx
            @Override // java.lang.Runnable
            public final void run() {
                taskCompletionSource.trySetException(new TimeoutException());
            }
        }, timeUnit.toMillis(j));
        task.addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.tasks.zzy
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zza zzaVar2 = zzaVar;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                OooOO0 oooOO2 = oooOO1;
                zzaVar2.removeCallbacksAndMessages(null);
                if (task2.isSuccessful()) {
                    taskCompletionSource2.trySetResult(task2.getResult());
                    return;
                }
                if (!task2.isCanceled()) {
                    Exception exception = task2.getException();
                    exception.getClass();
                    taskCompletionSource2.trySetException(exception);
                    return;
                }
                o0O0O00 o0o0o00 = oooOO2.f41602OooO00o;
                synchronized (o0o0o00.f41633OooO00o) {
                    if (o0o0o00.f41635OooO0OO) {
                        return;
                    }
                    o0o0o00.f41635OooO0OO = true;
                    o0o0o00.f41638OooO0o0 = null;
                    o0o0o00.f41634OooO0O0.OooO0O0(o0o0o00);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    @NonNull
    @Deprecated
    public static <TResult> Task<TResult> call(@NonNull Executor executor, @NonNull Callable<TResult> callable) {
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(callable, "Callback must not be null");
        o0O0O00 o0o0o00 = new o0O0O00();
        executor.execute(new o000OOo(o0o0o00, callable));
        return o0o0o00;
    }

    @NonNull
    public static Task<List<Task<?>>> whenAllComplete(@Nullable Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllComplete(Arrays.asList(taskArr));
        }
        return forResult(Collections.emptyList());
    }

    @NonNull
    public static <TResult> Task<List<TResult>> whenAllSuccess(@Nullable Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllSuccess(Arrays.asList(taskArr));
        }
        return forResult(Collections.emptyList());
    }

    public static <TResult> TResult await(@NonNull Task<TResult> task, long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            return (TResult) OooO00o(task);
        }
        OooO0o oooO0o = new OooO0o();
        o0Oo0oo o0oo0oo2 = TaskExecutors.f16158OooO00o;
        task.addOnSuccessListener(o0oo0oo2, oooO0o);
        task.addOnFailureListener(o0oo0oo2, oooO0o);
        task.addOnCanceledListener(o0oo0oo2, oooO0o);
        if (oooO0o.f41601OooO0Oo.await(j, timeUnit)) {
            return (TResult) OooO00o(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @NonNull
    public static Task<Void> whenAll(@Nullable Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAll(Arrays.asList(taskArr));
        }
        return forResult(null);
    }
}
