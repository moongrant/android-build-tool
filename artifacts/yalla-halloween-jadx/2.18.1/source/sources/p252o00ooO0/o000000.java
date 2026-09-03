package p252o00ooO0;

import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import o0O0o.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p253o00ooO00.Oooo000;

/* JADX INFO: loaded from: classes.dex */
public final class o000000 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public o000000O f34225Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public OooO0O0 f34226Oooo0oO;

    public o000000(@NotNull o000000O task, @Nullable OooO0O0 oooO0O0) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.f34225Oooo0o = task;
        this.f34226Oooo0oO = oooO0O0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Objects.requireNonNull(this.f34225Oooo0o);
        Process.setThreadPriority(10);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Objects.requireNonNull(this.f34225Oooo0o);
        o000000O o000000o2 = this.f34225Oooo0o;
        Objects.requireNonNull(o000000o2);
        try {
            o000000o2.f34228OooO0O0.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        Objects.requireNonNull(this.f34225Oooo0o);
        this.f34225Oooo0o.OooO0OO();
        Objects.requireNonNull(this.f34225Oooo0o);
        Objects.requireNonNull(this.f34225Oooo0o);
        long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f34225Oooo0o.getClass().getSimpleName());
        sb.append("  wait ");
        sb.append(jCurrentTimeMillis2);
        sb.append("    run ");
        sb.append(jCurrentTimeMillis4);
        sb.append("   isMain ");
        sb.append(Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper()));
        sb.append("  needWait ");
        sb.append(this.f34225Oooo0o.OooO0O0() || Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper()));
        sb.append("  ThreadId ");
        sb.append(Thread.currentThread().getId());
        sb.append("  ThreadName ");
        sb.append((Object) Thread.currentThread().getName());
        sb.append("  Situation  ");
        Oooo000 oooo000 = Oooo000.f34229OooO00o;
        sb.append("");
        Log.i("DispatchRunnable", sb.toString());
        Oooo000.f34230OooO0O0.getAndIncrement();
        Objects.requireNonNull(this.f34225Oooo0o);
        OooO0O0 oooO0O0 = this.f34226Oooo0oO;
        if (oooO0O0 == null) {
            return;
        }
        o000000O launchTask = this.f34225Oooo0o;
        Intrinsics.checkNotNullParameter(launchTask, "launchTask");
        ArrayList<o000000O> arrayList = OooO0O0.f36065OooOOO0.get(launchTask.getClass());
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                ((o000000O) it.next()).f34228OooO0O0.countDown();
            }
        }
        oooO0O0.OooO0O0(this.f34225Oooo0o);
    }
}
