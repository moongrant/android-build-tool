package com.umeng.umzid;

import OooO00o.OooO00o;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static volatile ScheduledThreadPoolExecutor a;
    public static ThreadFactory b = new a();

    public static class a implements ThreadFactory {
        public AtomicInteger a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ZIDThreadPoolExecutor");
            sbOooO0o0.append(this.a.addAndGet(1));
            thread.setName(sbOooO0o0.toString());
            return thread;
        }
    }

    public static ScheduledThreadPoolExecutor a() {
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors() * 4, b);
                }
            }
        }
        return a;
    }

    public static void a(Runnable runnable) {
        try {
            a().execute(runnable);
        } catch (Throwable unused) {
            Log.e("com.umeng.umzid.b", "UmengThreadPoolExecutorFactory execute exception");
        }
    }
}
