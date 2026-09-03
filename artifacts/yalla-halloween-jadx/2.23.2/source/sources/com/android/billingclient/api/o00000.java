package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 implements ThreadFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ThreadFactory f12801OooO00o = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicInteger f12802OooO0O0 = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f12801OooO00o.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + this.f12802OooO0O0.getAndIncrement());
        return threadNewThread;
    }
}
