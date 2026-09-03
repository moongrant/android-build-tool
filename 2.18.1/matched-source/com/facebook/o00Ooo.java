package com.facebook;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import p381o0OOoOOO.o00O0OO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00Ooo implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f12887Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f12888Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f12889Oooo0oo;

    public /* synthetic */ o00Ooo(Object obj, Object obj2, int i) {
        this.f12887Oooo0o = i;
        this.f12888Oooo0oO = obj;
        this.f12889Oooo0oo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12887Oooo0o) {
            case 0:
                ProgressOutputStream.m105reportBatchProgress$lambda0((GraphRequestBatch.Callback) this.f12888Oooo0oO, (ProgressOutputStream) this.f12889Oooo0oo);
                break;
            default:
                o00O0OO o00o0oo2 = (o00O0OO) this.f12888Oooo0oO;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f12889Oooo0oo;
                Objects.requireNonNull(o00o0oo2);
                try {
                    taskCompletionSource.setResult(o00o0oo2.OooO00o());
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
                break;
        }
    }
}
