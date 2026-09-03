package com.google.firebase.messaging;

import androidx.annotation.GuardedBy;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Executor f20295OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("this")
    public final p188o00o0O.OooOO0 f20296OooO0O0 = new p188o00o0O.OooOO0();

    public o00000O(ExecutorService executorService) {
        this.f20295OooO00o = executorService;
    }
}
