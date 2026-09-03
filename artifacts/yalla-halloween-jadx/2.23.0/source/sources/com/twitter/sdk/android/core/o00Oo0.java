package com.twitter.sdk.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import com.twitter.sdk.android.core.o00Oo0;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO0OO f22207OooO0oO = new OooO0OO();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static volatile o00Oo0 f22208OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f22209OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ThreadPoolExecutor f22210OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TwitterAuthConfig f22211OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OOOOO.OooO0O0 f22212OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f22213OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOO0O f22214OooO0o0;

    public o00Oo0(oo000o oo000oVar) {
        Context context = oo000oVar.f22231OooO00o;
        this.f22209OooO00o = context;
        this.f22212OooO0Oo = new o0OOOOO.OooO0O0(context);
        TwitterAuthConfig twitterAuthConfig = oo000oVar.f22233OooO0OO;
        if (twitterAuthConfig == null) {
            this.f22211OooO0OO = new TwitterAuthConfig(o0OOOOO.OooO0OO.OooO00o(context, "com.twitter.sdk.android.CONSUMER_KEY"), o0OOOOO.OooO0OO.OooO00o(context, "com.twitter.sdk.android.CONSUMER_SECRET"));
        } else {
            this.f22211OooO0OO = twitterAuthConfig;
        }
        int i = o0OOOOO.OooOO0.f43631OooO00o;
        final AtomicLong atomicLong = new AtomicLong(1L);
        ThreadFactory threadFactory = new ThreadFactory() { // from class: o0OOOOO.OooO0o

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ String f43629OooO00o = "twitter-worker";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                threadNewThread.setName(this.f43629OooO00o + atomicLong.getAndIncrement());
                return threadNewThread;
            }
        };
        int i2 = o0OOOOO.OooOO0.f43631OooO00o;
        int i3 = o0OOOOO.OooOO0.f43632OooO0O0;
        final TimeUnit timeUnit = TimeUnit.SECONDS;
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i3, 1L, timeUnit, new LinkedBlockingQueue(), threadFactory);
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() { // from class: o0OOOOO.OooO

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ long f43623OooO0o0 = 1;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ String f43624OooO0oO = "twitter-worker";

            @Override // java.lang.Runnable
            public final void run() {
                ExecutorService executorService = threadPoolExecutor;
                long j = this.f43623OooO0o0;
                TimeUnit timeUnit2 = timeUnit;
                String str = this.f43624OooO0oO;
                try {
                    executorService.shutdown();
                    if (executorService.awaitTermination(j, timeUnit2)) {
                        return;
                    }
                    o00Oo0.OooO0OO().OooO0O0("Twitter", str + " did not shutdown in the allocated time. Requesting immediate shutdown.");
                    executorService.shutdownNow();
                } catch (InterruptedException unused) {
                    o00Oo0.OooO0OO().OooO0O0("Twitter", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", str));
                    executorService.shutdownNow();
                }
            }
        }, "Twitter Shutdown Hook for twitter-worker"));
        this.f22210OooO0O0 = threadPoolExecutor;
        OooOO0O oooOO0O = oo000oVar.f22232OooO0O0;
        if (oooOO0O == null) {
            this.f22214OooO0o0 = f22207OooO0oO;
        } else {
            this.f22214OooO0o0 = oooOO0O;
        }
        Boolean bool = oo000oVar.f22234OooO0Oo;
        if (bool == null) {
            this.f22213OooO0o = false;
        } else {
            this.f22213OooO0o = bool.booleanValue();
        }
    }

    public static o00Oo0 OooO0O0() {
        if (f22208OooO0oo != null) {
            return f22208OooO0oo;
        }
        throw new IllegalStateException("Must initialize Twitter before using getInstance()");
    }

    public static OooOO0O OooO0OO() {
        return f22208OooO0oo == null ? f22207OooO0oO : f22208OooO0oo.f22214OooO0o0;
    }

    public final o00oO0o OooO00o(String str) {
        return new o00oO0o(this.f22209OooO00o, str, o0O00o0.OooO0O0(new StringBuilder(".TwitterKit"), File.separator, str));
    }
}
