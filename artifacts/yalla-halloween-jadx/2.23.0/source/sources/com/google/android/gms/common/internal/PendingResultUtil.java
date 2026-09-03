package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p255o00ooOOo.oo00oO;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class PendingResultUtil {

    @KeepForSdk
    public interface ResultConverter<R extends Result, T> {
        @Nullable
        @KeepForSdk
        T convert(@NonNull R r);
    }

    static {
        new oo00oO();
    }

    @NonNull
    @KeepForSdk
    public static <R extends Result, T extends Response<R>> Task<T> toResponseTask(@NonNull PendingResult<R> pendingResult, @NonNull T t) {
        return toTask(pendingResult, new OooO0o(t));
    }

    @NonNull
    @KeepForSdk
    public static <R extends Result, T> Task<T> toTask(@NonNull PendingResult<R> pendingResult, @NonNull ResultConverter<R, T> resultConverter) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        pendingResult.addStatusListener(new OooO0OO(pendingResult, taskCompletionSource, resultConverter));
        return taskCompletionSource.getTask();
    }

    @NonNull
    @KeepForSdk
    public static <R extends Result> Task<Void> toVoidTask(@NonNull PendingResult<R> pendingResult) {
        return toTask(pendingResult, new OooO());
    }
}
