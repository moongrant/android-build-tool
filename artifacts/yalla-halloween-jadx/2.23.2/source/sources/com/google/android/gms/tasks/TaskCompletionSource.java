package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import o0O0000O.o0O0O00;
import o0O0000O.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
public class TaskCompletionSource<TResult> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0O00 f15685OooO00o = new o0O0O00();

    public TaskCompletionSource() {
    }

    @NonNull
    public Task<TResult> getTask() {
        return this.f15685OooO00o;
    }

    public void setException(@NonNull Exception exc) {
        this.f15685OooO00o.OooO00o(exc);
    }

    public void setResult(@Nullable TResult tresult) {
        this.f15685OooO00o.OooO0O0(tresult);
    }

    public boolean trySetException(@NonNull Exception exc) {
        o0O0O00 o0o0o00 = this.f15685OooO00o;
        o0o0o00.getClass();
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (o0o0o00.f40942OooO00o) {
            if (o0o0o00.f40944OooO0OO) {
                return false;
            }
            o0o0o00.f40944OooO0OO = true;
            o0o0o00.f40946OooO0o = exc;
            o0o0o00.f40943OooO0O0.OooO0O0(o0o0o00);
            return true;
        }
    }

    public boolean trySetResult(@Nullable TResult tresult) {
        o0O0O00 o0o0o00 = this.f15685OooO00o;
        synchronized (o0o0o00.f40942OooO00o) {
            if (o0o0o00.f40944OooO0OO) {
                return false;
            }
            o0o0o00.f40944OooO0OO = true;
            o0o0o00.f40947OooO0o0 = tresult;
            o0o0o00.f40943OooO0O0.OooO0O0(o0o0o00);
            return true;
        }
    }

    public TaskCompletionSource(@NonNull CancellationToken cancellationToken) {
        cancellationToken.onCanceledRequested(new o0OOO0o(this));
    }
}
