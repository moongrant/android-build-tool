package p191o00o0O0;

import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p189o00o00oo.o000O00O;
import p192o00o0O00.o000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00Oo0 f38589OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final o000O00O f38590OooO0o0;

    public o0OoOo0(@NotNull o00Oo0 task, @Nullable o000O00O o000o00o2) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.f38589OooO0Oo = task;
        this.f38590OooO0o0 = o000o00o2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00Oo0 launchTask = this.f38589OooO0Oo;
        launchTask.getClass();
        Process.setThreadPriority(10);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            ((CountDownLatch) launchTask.f38587OooO0OO.getValue()).await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        launchTask.run();
        long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
        StringBuilder sb = new StringBuilder();
        sb.append(launchTask.getClass().getSimpleName());
        sb.append("  wait ");
        sb.append(jCurrentTimeMillis2);
        sb.append("    run ");
        sb.append(jCurrentTimeMillis4);
        sb.append("   isMain ");
        sb.append(Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper()));
        sb.append("  needWait ");
        sb.append(launchTask.OooO0O0() || Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper()));
        sb.append("  ThreadId ");
        sb.append(Thread.currentThread().getId());
        sb.append("  ThreadName ");
        sb.append(Thread.currentThread().getName());
        sb.append("  Situation    dependsOn  ");
        AtomicInteger atomicInteger = o000.f38591OooO00o;
        sb.append(launchTask.f38586OooO0O0);
        Log.i("DispatchRunnable", sb.toString());
        o000.f38591OooO00o.getAndIncrement();
        if (this.f38590OooO0o0 != null) {
            Intrinsics.checkNotNullParameter(launchTask, "launchTask");
            ArrayList<o00Oo0> arrayList = o000O00O.f38529OooOOO0.get(launchTask.getClass());
            if (arrayList != null) {
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    ((CountDownLatch) ((o00Oo0) it.next()).f38587OooO0OO.getValue()).countDown();
                }
            }
            o000O00O.OooO0O0(launchTask);
        }
    }
}
