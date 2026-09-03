package p145o00Oo0O;

import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import o00Oo00.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p146o00Oo0O0.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o000oOoO f37682OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final OooO0O0 f37683OooO0o0;

    public Oooo000(@NotNull o000oOoO task, @Nullable OooO0O0 oooO0O0) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.f37682OooO0Oo = task;
        this.f37683OooO0o0 = oooO0O0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o000oOoO launchTask = this.f37682OooO0Oo;
        launchTask.getClass();
        Process.setThreadPriority(10);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            ((CountDownLatch) launchTask.f37686OooO0OO.getValue()).await();
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
        AtomicInteger atomicInteger = o00000O0.f37688OooO00o;
        sb.append(launchTask.f37685OooO0O0);
        Log.i("DispatchRunnable", sb.toString());
        o00000O0.f37688OooO00o.getAndIncrement();
        if (this.f37683OooO0o0 != null) {
            Intrinsics.checkNotNullParameter(launchTask, "launchTask");
            ArrayList<o000oOoO> arrayList = OooO0O0.f37656OooOOO0.get(launchTask.getClass());
            if (arrayList != null) {
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    ((CountDownLatch) ((o000oOoO) it.next()).f37686OooO0OO.getValue()).countDown();
                }
            }
            OooO0O0.OooO0O0(launchTask);
        }
    }
}
