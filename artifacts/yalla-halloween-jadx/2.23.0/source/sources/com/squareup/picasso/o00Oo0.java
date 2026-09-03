package com.squareup.picasso;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo0 extends ThreadPoolExecutor {

    public static final class OooO00o extends FutureTask<OooO0OO> implements Comparable<OooO00o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0OO f21788OooO0Oo;

        public OooO00o(OooO0OO oooO0OO) {
            super(oooO0OO, null);
            this.f21788OooO0Oo = oooO0OO;
        }

        @Override // java.lang.Comparable
        public final int compareTo(OooO00o oooO00o) {
            OooO0OO oooO0OO = this.f21788OooO0Oo;
            Picasso.Priority priority = oooO0OO.f21712OooOo0O;
            OooO0OO oooO0OO2 = oooO00o.f21788OooO0Oo;
            Picasso.Priority priority2 = oooO0OO2.f21712OooOo0O;
            return priority == priority2 ? oooO0OO.f21695OooO0Oo - oooO0OO2.f21695OooO0Oo : priority2.ordinal() - priority.ordinal();
        }
    }

    public o00Oo0() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new o000000O.OooO0O0());
    }

    public final void OooO0O0(int i) {
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
