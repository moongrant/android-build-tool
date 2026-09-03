package com.squareup.okhttp;

import androidx.compose.animation.core.AnimationKt;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p340o0OO0ooO.o000OOo;
import p340o0OO0ooO.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooOOOO f21094OooO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f21095OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f21096OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LinkedList<OooOOO> f21097OooO0OO = new LinkedList<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ThreadPoolExecutor f21098OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f21099OooO0o0;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00a0 A[LOOP:3: B:38:0x009e->B:39:0x00a0, LOOP_END] */
        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int size;
            OooOOOO oooOOOO = OooOOOO.this;
            do {
                synchronized (oooOOOO) {
                    i = 0;
                    if (!oooOOOO.f21097OooO0OO.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        long jNanoTime = System.nanoTime();
                        long jMin = oooOOOO.f21096OooO0O0;
                        LinkedList<OooOOO> linkedList = oooOOOO.f21097OooO0OO;
                        ListIterator<OooOOO> listIterator = linkedList.listIterator(linkedList.size());
                        int i2 = 0;
                        while (listIterator.hasPrevious()) {
                            OooOOO oooOOOPrevious = listIterator.previous();
                            long jOooO0OO = (oooOOOPrevious.OooO0OO() + oooOOOO.f21096OooO0O0) - jNanoTime;
                            if (jOooO0OO <= 0 || !oooOOOPrevious.OooO0Oo()) {
                                listIterator.remove();
                                arrayList.add(oooOOOPrevious);
                            } else if (oooOOOPrevious.OooO0o()) {
                                i2++;
                                jMin = Math.min(jMin, jOooO0OO);
                            }
                        }
                        LinkedList<OooOOO> linkedList2 = oooOOOO.f21097OooO0OO;
                        ListIterator<OooOOO> listIterator2 = linkedList2.listIterator(linkedList2.size());
                        while (listIterator2.hasPrevious() && i2 > oooOOOO.f21095OooO00o) {
                            OooOOO oooOOOPrevious2 = listIterator2.previous();
                            if (oooOOOPrevious2.OooO0o()) {
                                arrayList.add(oooOOOPrevious2);
                                listIterator2.remove();
                                i2--;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            try {
                                long j = jMin / AnimationKt.MillisToNanos;
                                Long.signum(j);
                                oooOOOO.wait(j, (int) (jMin - (AnimationKt.MillisToNanos * j)));
                            } catch (InterruptedException unused) {
                                size = arrayList.size();
                                while (i < size) {
                                    o000OOo.OooO0OO(((OooOOO) arrayList.get(i)).f21084OooO0OO);
                                    i++;
                                }
                            }
                        } else {
                            size = arrayList.size();
                            while (i < size) {
                                o000OOo.OooO0OO(((OooOOO) arrayList.get(i)).f21084OooO0OO);
                                i++;
                            }
                        }
                        i = 1;
                    }
                }
            } while (i != 0);
        }
    }

    static {
        String property = System.getProperty("http.keepAlive");
        String property2 = System.getProperty("http.keepAliveDuration");
        String property3 = System.getProperty("http.maxConnections");
        long j = property2 != null ? Long.parseLong(property2) : 300000L;
        if (property != null && !Boolean.parseBoolean(property)) {
            f21094OooO0o = new OooOOOO(0, j);
        } else if (property3 != null) {
            f21094OooO0o = new OooOOOO(Integer.parseInt(property3), j);
        } else {
            f21094OooO0o = new OooOOOO(5, j);
        }
    }

    public OooOOOO(int i, long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        byte[] bArr = o000OOo.f42529OooO00o;
        this.f21098OooO0Oo = new ThreadPoolExecutor(0, 1, 60L, timeUnit, linkedBlockingQueue, new o0O0O00("OkHttp ConnectionPool"));
        this.f21099OooO0o0 = new OooO00o();
        this.f21095OooO00o = i;
        this.f21096OooO0O0 = j * 1000 * 1000;
    }

    public final void OooO00o(OooOOO oooOOO) {
        if (!oooOOO.OooO0o0()) {
            throw new IllegalArgumentException();
        }
        if (oooOOO.OooO0Oo()) {
            synchronized (this) {
                LinkedList<OooOOO> linkedList = this.f21097OooO0OO;
                boolean zIsEmpty = linkedList.isEmpty();
                linkedList.addFirst(oooOOO);
                if (zIsEmpty) {
                    this.f21098OooO0Oo.execute(this.f21099OooO0o0);
                } else {
                    notifyAll();
                }
            }
        }
    }
}
