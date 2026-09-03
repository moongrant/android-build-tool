package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;
import o0OO0o00.o00oO0o;
import o0OO0o00.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
public class TaskCompletionSource<TResult> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OO00O<TResult> f16362OooO00o = new o0OO00O<>();

    public TaskCompletionSource() {
    }

    public TaskCompletionSource(@NonNull CancellationToken cancellationToken) {
        cancellationToken.onCanceledRequested(new o00oO0o(this));
    }

    @NonNull
    public Task<TResult> getTask() {
        return this.f16362OooO00o;
    }

    public void setException(@NonNull Exception exc) {
        this.f16362OooO00o.OooO00o(exc);
    }

    public void setResult(@Nullable TResult tresult) {
        this.f16362OooO00o.OooO0O0(tresult);
    }

    public boolean trySetException(@NonNull Exception exc) {
        o0OO00O<TResult> o0oo00o2 = this.f16362OooO00o;
        Objects.requireNonNull(o0oo00o2);
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (o0oo00o2.f37956OooO00o) {
            if (o0oo00o2.f37958OooO0OO) {
                return false;
            }
            o0oo00o2.f37958OooO0OO = true;
            o0oo00o2.f37960OooO0o = exc;
            o0oo00o2.f37957OooO0O0.OooO0O0(o0oo00o2);
            return true;
        }
    }

    public boolean trySetResult(@Nullable TResult tresult) {
        return this.f16362OooO00o.OooO0Oo(tresult);
    }
}
