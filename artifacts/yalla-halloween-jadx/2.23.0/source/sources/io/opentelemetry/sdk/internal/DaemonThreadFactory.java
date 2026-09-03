package io.opentelemetry.sdk.internal;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class DaemonThreadFactory implements ThreadFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f33204OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AtomicInteger f33205OooO0O0 = new AtomicInteger();

    public DaemonThreadFactory(String str) {
        this.f33204OooO00o = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
        try {
            threadNewThread.setDaemon(true);
            threadNewThread.setName(this.f33204OooO00o + "-" + this.f33205OooO0O0.incrementAndGet());
        } catch (SecurityException unused) {
        }
        return threadNewThread;
    }
}
