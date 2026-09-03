package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.login.LoginLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    public DuplicateTaskCompletionException(String str, @Nullable Exception exc) {
        super(str, exc);
    }

    @NonNull
    public static IllegalStateException of(@NonNull Task<?> task) {
        String strConcat;
        if (!task.isComplete()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception exception = task.getException();
        if (exception != null) {
            strConcat = LoginLogger.EVENT_EXTRAS_FAILURE;
        } else if (task.isSuccessful()) {
            strConcat = "result ".concat(String.valueOf(task.getResult()));
        } else {
            strConcat = task.isCanceled() ? "cancellation" : "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(strConcat), exception);
    }
}
