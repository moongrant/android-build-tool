package com.google.android.gms.common.util.concurrent;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzi;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class HandlerExecutor implements Executor {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final zzi f14810OooO0Oo;

    @KeepForSdk
    public HandlerExecutor(@NonNull Looper looper) {
        this.f14810OooO0Oo = new zzi(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f14810OooO0Oo.post(runnable);
    }
}
