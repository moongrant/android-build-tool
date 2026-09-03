package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class TransferThreadPool {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Log f10525OooO00o = LogFactory.OooO00o(TransferService.class);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static ThreadPoolExecutor f10526OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static ThreadPoolExecutor f10527OooO0OO;

    public static ExecutorService OooO00o(int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static <T> Future<T> OooO0O0(Callable<T> callable) {
        int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() + 1) * 2;
        synchronized (TransferThreadPool.class) {
            f10525OooO00o.OooO00o("Initializing the thread pool of size: " + iAvailableProcessors);
            int iMax = Math.max((int) Math.ceil(((double) iAvailableProcessors) / 2.0d), 1);
            if (f10526OooO0O0 == null) {
                f10526OooO0O0 = (ThreadPoolExecutor) OooO00o(iMax);
            }
            if (f10527OooO0OO == null) {
                f10527OooO0OO = (ThreadPoolExecutor) OooO00o(iMax);
            }
        }
        return callable instanceof UploadPartTask ? f10527OooO0OO.submit(callable) : f10526OooO0O0.submit(callable);
    }
}
