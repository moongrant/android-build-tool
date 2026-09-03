package p433o0OoOO0o;

import OooO00o.OooO00o;
import android.annotation.SuppressLint;
import android.content.Context;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p054o00000oo.o00O000;
import p058o0000OoO.OooO;
import p433o0OoOO0o.o0oO0Ooo;
import p440o0OoOOoO.o0OO000;
import p440o0OoOOoO.o0oOo0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oO0Ooo {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final o0 f39958OooO0oO = new o0();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static volatile o0oO0Ooo f39959OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f39960OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ThreadPoolExecutor f39961OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TwitterAuthConfig f39962OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0oOo0O0 f39963OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f39964OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0O000 f39965OooO0o0;

    public o0oO0Ooo(o0O00oO0 o0o00oo1) {
        Context context = o0o00oo1.f39940OooO00o;
        this.f39960OooO00o = context;
        this.f39963OooO0Oo = new o0oOo0O0(context);
        TwitterAuthConfig twitterAuthConfig = o0o00oo1.f39942OooO0OO;
        if (twitterAuthConfig == null) {
            this.f39962OooO0OO = new TwitterAuthConfig(o00O000.OooO00o(context, "com.twitter.sdk.android.CONSUMER_KEY"), o00O000.OooO00o(context, "com.twitter.sdk.android.CONSUMER_SECRET"));
        } else {
            this.f39962OooO0OO = twitterAuthConfig;
        }
        int i = o0OO000.f40187OooO00o;
        final AtomicLong atomicLong = new AtomicLong(1L);
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(o0OO000.f40187OooO00o, o0OO000.f40188OooO0O0, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: o0OoOOoO.o0O

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ String f40179OooO00o = "twitter-worker";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                String str = this.f40179OooO00o;
                AtomicLong atomicLong2 = atomicLong;
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0(str);
                sbOooO0o0.append(atomicLong2.getAndIncrement());
                threadNewThread.setName(sbOooO0o0.toString());
                return threadNewThread;
            }
        });
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() { // from class: o0OoOOoO.o0O0oo00

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ String f40182Oooo;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ long f40184Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ TimeUnit f40185Oooo0oo;

            {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                this.f40184Oooo0oO = 1L;
                this.f40185Oooo0oo = timeUnit;
                this.f40182Oooo = "twitter-worker";
            }

            @Override // java.lang.Runnable
            public final void run() {
                ExecutorService executorService = threadPoolExecutor;
                long j = this.f40184Oooo0oO;
                TimeUnit timeUnit = this.f40185Oooo0oo;
                String str = this.f40182Oooo;
                try {
                    executorService.shutdown();
                    if (executorService.awaitTermination(j, timeUnit)) {
                        return;
                    }
                    o0oO0Ooo.OooO0OO().OooO0OO("Twitter", str + " did not shutdown in the allocated time. Requesting immediate shutdown.");
                    executorService.shutdownNow();
                } catch (InterruptedException unused) {
                    o0oO0Ooo.OooO0OO().OooO0OO("Twitter", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", str));
                    executorService.shutdownNow();
                }
            }
        }, "Twitter Shutdown Hook for twitter-worker"));
        this.f39961OooO0O0 = threadPoolExecutor;
        o0O000 o0o001 = o0o00oo1.f39941OooO0O0;
        if (o0o001 == null) {
            this.f39965OooO0o0 = f39958OooO0oO;
        } else {
            this.f39965OooO0o0 = o0o001;
        }
        Boolean bool = o0o00oo1.f39943OooO0Oo;
        if (bool == null) {
            this.f39964OooO0o = false;
        } else {
            this.f39964OooO0o = bool.booleanValue();
        }
    }

    public static o0oO0Ooo OooO0O0() {
        if (f39959OooO0oo != null) {
            return f39959OooO0oo;
        }
        throw new IllegalStateException("Must initialize Twitter before using getInstance()");
    }

    public static o0O000 OooO0OO() {
        return f39959OooO0oo == null ? f39958OooO0oO : f39959OooO0oo.f39965OooO0o0;
    }

    public static void OooO0Oo(o0O00oO0 o0o00oo1) {
        synchronized (o0oO0Ooo.class) {
            if (f39959OooO0oo == null) {
                f39959OooO0oo = new o0oO0Ooo(o0o00oo1);
            }
        }
    }

    public final Context OooO00o(String str) {
        return new o0O0O0O(this.f39960OooO00o, str, OooO.OooO00o(OooO00o.OooO0o0(".TwitterKit"), File.separator, str));
    }
}
