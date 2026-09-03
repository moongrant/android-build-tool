package com.squareup.picasso;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f21345OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o f21346OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f21347OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f21348OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f21349OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f21350OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f21351OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f21352OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f21353OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f21354OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f21355OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f21356OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f21357OooOOO0;

    public static class OooO00o extends Handler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0OOO0o f21358OooO00o;

        /* JADX INFO: renamed from: com.squareup.picasso.o0OOO0o$OooO00o$OooO00o, reason: collision with other inner class name */
        public class RunnableC0279OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Message f21359OooO0Oo;

            public RunnableC0279OooO00o(Message message) {
                this.f21359OooO0Oo = message;
            }

            @Override // java.lang.Runnable
            public final void run() {
                throw new AssertionError("Unhandled stats message." + this.f21359OooO0Oo.what);
            }
        }

        public OooO00o(Looper looper, o0OOO0o o0ooo0o2) {
            super(looper);
            this.f21358OooO00o = o0ooo0o2;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            o0OOO0o o0ooo0o2 = this.f21358OooO00o;
            if (i == 0) {
                o0ooo0o2.f21348OooO0OO++;
                return;
            }
            if (i == 1) {
                o0ooo0o2.f21349OooO0Oo++;
                return;
            }
            if (i == 2) {
                long j = message.arg1;
                int i2 = o0ooo0o2.f21356OooOO0o + 1;
                o0ooo0o2.f21356OooOO0o = i2;
                long j2 = o0ooo0o2.f21350OooO0o + j;
                o0ooo0o2.f21350OooO0o = j2;
                o0ooo0o2.f21345OooO = j2 / ((long) i2);
                return;
            }
            if (i == 3) {
                long j3 = message.arg1;
                o0ooo0o2.f21357OooOOO0++;
                long j4 = o0ooo0o2.f21352OooO0oO + j3;
                o0ooo0o2.f21352OooO0oO = j4;
                o0ooo0o2.f21354OooOO0 = j4 / ((long) o0ooo0o2.f21356OooOO0o);
                return;
            }
            if (i != 4) {
                Picasso.f21278OooOOO0.post(new RunnableC0279OooO00o(message));
                return;
            }
            Long l = (Long) message.obj;
            o0ooo0o2.f21355OooOO0O++;
            long jLongValue = l.longValue() + o0ooo0o2.f21351OooO0o0;
            o0ooo0o2.f21351OooO0o0 = jLongValue;
            o0ooo0o2.f21353OooO0oo = jLongValue / ((long) o0ooo0o2.f21355OooOO0O);
        }
    }

    public o0OOO0o(OooO0o oooO0o) {
        this.f21346OooO00o = oooO0o;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb = o000000O.f21300OooO00o;
        o000000 o000000Var = new o000000(looper);
        o000000Var.sendMessageDelayed(o000000Var.obtainMessage(), 1000L);
        this.f21347OooO0O0 = new OooO00o(handlerThread.getLooper(), this);
    }

    public final o0Oo0oo OooO00o() {
        int i;
        OooOo oooOo = (OooOo) this.f21346OooO00o;
        synchronized (oooOo) {
            i = oooOo.f21268OooO0O0;
        }
        return new o0Oo0oo(i, ((OooOo) this.f21346OooO00o).OooO0O0(), this.f21348OooO0OO, this.f21349OooO0Oo, this.f21351OooO0o0, this.f21350OooO0o, this.f21352OooO0oO, this.f21353OooO0oo, this.f21345OooO, this.f21354OooOO0, this.f21355OooOO0O, this.f21356OooOO0o, this.f21357OooOOO0, System.currentTimeMillis());
    }
}
