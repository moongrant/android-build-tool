package com.squareup.picasso;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 extends ThreadPoolExecutor {

    public static final class OooO00o extends FutureTask<OooO0OO> implements Comparable<OooO00o> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final OooO0OO f19789Oooo0o;

        public OooO00o(OooO0OO oooO0OO) {
            super(oooO0OO, null);
            this.f19789Oooo0o = oooO0OO;
        }

        @Override // java.lang.Comparable
        public final int compareTo(OooO00o oooO00o) {
            OooO0OO oooO0OO = this.f19789Oooo0o;
            Picasso.Priority priority = oooO0OO.f19725OooooOO;
            OooO0OO oooO0OO2 = oooO00o.f19789Oooo0o;
            Picasso.Priority priority2 = oooO0OO2.f19725OooooOO;
            return priority == priority2 ? oooO0OO.f19709Oooo0o - oooO0OO2.f19709Oooo0o : priority2.ordinal() - priority.ordinal();
        }
    }

    public Oooo000() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new o00oO0o.OooO0O0());
    }

    public final void OooO00o(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        OooO00o oooO00o = new OooO00o((OooO0OO) runnable);
        execute(oooO00o);
        return oooO00o;
    }
}
