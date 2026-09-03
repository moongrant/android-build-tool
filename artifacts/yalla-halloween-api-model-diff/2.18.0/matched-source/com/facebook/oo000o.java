package com.facebook;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import p383o0OOoOOO.o00O0OO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo000o implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f12909Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f12910OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f12911OoooO00;

    public /* synthetic */ oo000o(Object obj, Object obj2, int i) {
        this.f12909Oooo = i;
        this.f12911OoooO00 = obj;
        this.f12910OoooO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12909Oooo) {
            case 0:
                ProgressOutputStream.m105reportBatchProgress$lambda0((GraphRequestBatch.Callback) this.f12911OoooO00, (ProgressOutputStream) this.f12910OoooO0);
                break;
            default:
                o00O0OO o00o0oo2 = (o00O0OO) this.f12911OoooO00;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f12910OoooO0;
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
