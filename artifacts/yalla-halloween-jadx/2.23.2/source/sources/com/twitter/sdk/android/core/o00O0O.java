package com.twitter.sdk.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import com.twitter.sdk.android.core.o00O0O;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO0OO f21736OooO0oO = new OooO0OO();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static volatile o00O0O f21737OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f21738OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ThreadPoolExecutor f21739OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TwitterAuthConfig f21740OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OOOOOO.OooO0O0 f21741OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f21742OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOO0 f21743OooO0o0;

    public o00O0O(o00Ooo o00ooo2) {
        Context context = o00ooo2.f21746OooO00o;
        this.f21738OooO00o = context;
        this.f21741OooO0Oo = new o0OOOOOO.OooO0O0(context);
        TwitterAuthConfig twitterAuthConfig = o00ooo2.f21748OooO0OO;
        if (twitterAuthConfig == null) {
            this.f21740OooO0OO = new TwitterAuthConfig(p139o00OOOo0.OooO0OO.OooO00o(context, "com.twitter.sdk.android.CONSUMER_KEY"), p139o00OOOo0.OooO0OO.OooO00o(context, "com.twitter.sdk.android.CONSUMER_SECRET"));
        } else {
            this.f21740OooO0OO = twitterAuthConfig;
        }
        int i = o0OOOOOO.OooO.f42819OooO00o;
        final AtomicLong atomicLong = new AtomicLong(1L);
        ThreadFactory threadFactory = new ThreadFactory() { // from class: o0OOOOOO.OooO0OO

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ String f42825OooO00o = "twitter-worker";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                threadNewThread.setName(this.f42825OooO00o + atomicLong.getAndIncrement());
                return threadNewThread;
            }
        };
        int i2 = o0OOOOOO.OooO.f42819OooO00o;
        int i3 = o0OOOOOO.OooO.f42820OooO0O0;
        final TimeUnit timeUnit = TimeUnit.SECONDS;
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i3, 1L, timeUnit, new LinkedBlockingQueue(), threadFactory);
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() { // from class: o0OOOOOO.OooO0o

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ long f42829OooO0o0 = 1;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ String f42830OooO0oO = "twitter-worker";

            @Override // java.lang.Runnable
            public final void run() {
                ExecutorService executorService = threadPoolExecutor;
                long j = this.f42829OooO0o0;
                TimeUnit timeUnit2 = timeUnit;
                String str = this.f42830OooO0oO;
                try {
                    executorService.shutdown();
                    if (executorService.awaitTermination(j, timeUnit2)) {
                        return;
                    }
                    o00O0O.OooO0OO().OooO0O0("Twitter", str + " did not shutdown in the allocated time. Requesting immediate shutdown.");
                    executorService.shutdownNow();
                } catch (InterruptedException unused) {
                    o00O0O.OooO0OO().OooO0O0("Twitter", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", str));
                    executorService.shutdownNow();
                }
            }
        }, "Twitter Shutdown Hook for twitter-worker"));
        this.f21739OooO0O0 = threadPoolExecutor;
        OooOO0 oooOO1 = o00ooo2.f21747OooO0O0;
        if (oooOO1 == null) {
            this.f21743OooO0o0 = f21736OooO0oO;
        } else {
            this.f21743OooO0o0 = oooOO1;
        }
        Boolean bool = o00ooo2.f21749OooO0Oo;
        if (bool == null) {
            this.f21742OooO0o = false;
        } else {
            this.f21742OooO0o = bool.booleanValue();
        }
    }

    public static o00O0O OooO0O0() {
        if (f21737OooO0oo != null) {
            return f21737OooO0oo;
        }
        throw new IllegalStateException("Must initialize Twitter before using getInstance()");
    }

    public static OooOO0 OooO0OO() {
        return f21737OooO0oo == null ? f21736OooO0oO : f21737OooO0oo.f21743OooO0o0;
    }

    public final oo000o OooO00o(String str) {
        return new oo000o(this.f21738OooO00o, str, o0oOO.OooO0O0(new StringBuilder(".TwitterKit"), File.separator, str));
    }
}
