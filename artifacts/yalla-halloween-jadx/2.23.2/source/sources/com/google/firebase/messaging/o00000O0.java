package com.google.firebase.messaging;

import androidx.annotation.GuardedBy;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Executor f19835OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("this")
    public final p190o00o0O.OooO f19836OooO0O0 = new p190o00o0O.OooO();

    public o00000O0(ExecutorService executorService) {
        this.f19835OooO00o = executorService;
    }
}
