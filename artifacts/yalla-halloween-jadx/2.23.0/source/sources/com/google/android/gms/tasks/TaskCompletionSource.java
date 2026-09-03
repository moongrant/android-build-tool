package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import o0O0000O.o0O0O00;
import o0O0000O.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
public class TaskCompletionSource<TResult> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0O00 f16157OooO00o = new o0O0O00();

    public TaskCompletionSource() {
    }

    @NonNull
    public Task<TResult> getTask() {
        return this.f16157OooO00o;
    }

    public void setException(@NonNull Exception exc) {
        this.f16157OooO00o.OooO00o(exc);
    }

    public void setResult(@Nullable TResult tresult) {
        this.f16157OooO00o.OooO0O0(tresult);
    }

    public boolean trySetException(@NonNull Exception exc) {
        o0O0O00 o0o0o00 = this.f16157OooO00o;
        o0o0o00.getClass();
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (o0o0o00.f41633OooO00o) {
            if (o0o0o00.f41635OooO0OO) {
                return false;
            }
            o0o0o00.f41635OooO0OO = true;
            o0o0o00.f41637OooO0o = exc;
            o0o0o00.f41634OooO0O0.OooO0O0(o0o0o00);
            return true;
        }
    }

    public boolean trySetResult(@Nullable TResult tresult) {
        o0O0O00 o0o0o00 = this.f16157OooO00o;
        synchronized (o0o0o00.f41633OooO00o) {
            if (o0o0o00.f41635OooO0OO) {
                return false;
            }
            o0o0o00.f41635OooO0OO = true;
            o0o0o00.f41638OooO0o0 = tresult;
            o0o0o00.f41634OooO0O0.OooO0O0(o0o0o00);
            return true;
        }
    }

    public TaskCompletionSource(@NonNull CancellationToken cancellationToken) {
        cancellationToken.onCanceledRequested(new o0OOO0o(this));
    }
}
