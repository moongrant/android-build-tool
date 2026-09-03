package p412o0Oo0o00;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p413o0Oo0o0O.o000000;
import p413o0Oo0o0O.o000OOo;
import p414o0Oo0o0o.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O00 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o0000O00 f39276OooO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f39277OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f39278OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LinkedList<o0000> f39279OooO0OO = new LinkedList<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ThreadPoolExecutor f39280OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f39281OooO0o0;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00ac A[LOOP:3: B:48:0x00aa->B:49:0x00ac, LOOP_END] */
        @Override // java.lang.Runnable
        public final void run() {
            int i;
            int size;
            long j;
            long j2;
            o0000O00 o0000o00 = o0000O00.this;
            do {
                synchronized (o0000o00) {
                    i = 0;
                    if (!o0000o00.f39279OooO0OO.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        long jNanoTime = System.nanoTime();
                        long jMin = o0000o00.f39278OooO0O0;
                        LinkedList<o0000> linkedList = o0000o00.f39279OooO0OO;
                        ListIterator<o0000> listIterator = linkedList.listIterator(linkedList.size());
                        int i2 = 0;
                        while (listIterator.hasPrevious()) {
                            o0000 o0000VarPrevious = listIterator.previous();
                            o00000O0 o00000o1 = o0000VarPrevious.f39206OooO0o;
                            if (o00000o1 == null) {
                                j2 = o0000VarPrevious.f39209OooO0oo;
                            } else {
                                synchronized (o00000o1) {
                                    j = o00000o1.f39442OoooOO0;
                                }
                                j2 = j;
                            }
                            long j3 = (j2 + o0000o00.f39278OooO0O0) - jNanoTime;
                            if (j3 <= 0 || !o0000VarPrevious.OooO0O0()) {
                                listIterator.remove();
                                arrayList.add(o0000VarPrevious);
                            } else if (o0000VarPrevious.OooO0Oo()) {
                                i2++;
                                jMin = Math.min(jMin, j3);
                            }
                        }
                        LinkedList<o0000> linkedList2 = o0000o00.f39279OooO0OO;
                        ListIterator<o0000> listIterator2 = linkedList2.listIterator(linkedList2.size());
                        while (listIterator2.hasPrevious() && i2 > o0000o00.f39277OooO00o) {
                            o0000 o0000VarPrevious2 = listIterator2.previous();
                            if (o0000VarPrevious2.OooO0Oo()) {
                                arrayList.add(o0000VarPrevious2);
                                listIterator2.remove();
                                i2--;
                            }
                        }
                        if (arrayList.isEmpty()) {
                            try {
                                long j4 = jMin / 1000000;
                                Long.signum(j4);
                                o0000o00.wait(j4, (int) (jMin - (1000000 * j4)));
                            } catch (InterruptedException unused) {
                                size = arrayList.size();
                                while (i < size) {
                                    o000000.OooO0Oo(((o0000) arrayList.get(i)).f39204OooO0OO);
                                    i++;
                                }
                            }
                        } else {
                            size = arrayList.size();
                            while (i < size) {
                                o000000.OooO0Oo(((o0000) arrayList.get(i)).f39204OooO0OO);
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
            f39276OooO0o = new o0000O00(0, j);
        } else if (property3 != null) {
            f39276OooO0o = new o0000O00(Integer.parseInt(property3), j);
        } else {
            f39276OooO0o = new o0000O00(5, j);
        }
    }

    public o0000O00(int i, long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        byte[] bArr = o000000.f39346OooO00o;
        this.f39280OooO0Oo = new ThreadPoolExecutor(0, 1, 60L, timeUnit, linkedBlockingQueue, new o000OOo("OkHttp ConnectionPool"));
        this.f39281OooO0o0 = new OooO00o();
        this.f39277OooO00o = i;
        this.f39278OooO0O0 = j * 1000 * 1000;
    }

    public final void OooO00o(o0000 o0000Var) {
        boolean zIsEmpty = this.f39279OooO0OO.isEmpty();
        this.f39279OooO0OO.addFirst(o0000Var);
        if (zIsEmpty) {
            this.f39280OooO0Oo.execute(this.f39281OooO0o0);
        } else {
            notifyAll();
        }
    }
}
