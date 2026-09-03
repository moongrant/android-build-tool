package com.amazonaws.event;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public class ProgressListenerCallbackExecutor {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ExecutorService f12156OooO0O0 = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.amazonaws.event.ProgressListenerCallbackExecutor.3
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("android-sdk-progress-listener-callback-thread");
            thread.setDaemon(true);
            return thread;
        }
    });

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ProgressListener f12157OooO00o;

    public ProgressListenerCallbackExecutor(ProgressListener progressListener) {
        this.f12157OooO00o = progressListener;
    }

    public final void OooO00o(final ProgressEvent progressEvent) {
        if (this.f12157OooO00o == null) {
            return;
        }
        f12156OooO0O0.submit(new Runnable() { // from class: com.amazonaws.event.ProgressListenerCallbackExecutor.2
            @Override // java.lang.Runnable
            public final void run() {
                ProgressListenerCallbackExecutor.this.f12157OooO00o.OooO00o(progressEvent);
            }
        });
    }
}
