package com.google.android.gms.common.util.concurrent;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class HandlerExecutor implements Executor {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final zzi f15793Oooo0o;

    @KeepForSdk
    public HandlerExecutor(@NonNull Looper looper) {
        this.f15793Oooo0o = new zzi(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f15793Oooo0o.post(runnable);
    }
}
