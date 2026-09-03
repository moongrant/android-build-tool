package com.squareup.picasso;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f21818OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o f21819OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f21820OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f21821OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f21822OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f21823OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f21824OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f21825OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f21826OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f21827OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f21828OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f21829OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f21830OooOOO0;

    public static class OooO00o extends Handler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0OOO0o f21831OooO00o;

        /* JADX INFO: renamed from: com.squareup.picasso.o0OOO0o$OooO00o$OooO00o, reason: collision with other inner class name */
        public class RunnableC0280OooO00o implements Runnable {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Message f21832OooO0Oo;

            public RunnableC0280OooO00o(Message message) {
                this.f21832OooO0Oo = message;
            }

            @Override // java.lang.Runnable
            public final void run() {
                throw new AssertionError("Unhandled stats message." + this.f21832OooO0Oo.what);
            }
        }

        public OooO00o(Looper looper, o0OOO0o o0ooo0o2) {
            super(looper);
            this.f21831OooO00o = o0ooo0o2;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            o0OOO0o o0ooo0o2 = this.f21831OooO00o;
            if (i == 0) {
                o0ooo0o2.f21821OooO0OO++;
                return;
            }
            if (i == 1) {
                o0ooo0o2.f21822OooO0Oo++;
                return;
            }
            if (i == 2) {
                long j = message.arg1;
                int i2 = o0ooo0o2.f21829OooOO0o + 1;
                o0ooo0o2.f21829OooOO0o = i2;
                long j2 = o0ooo0o2.f21823OooO0o + j;
                o0ooo0o2.f21823OooO0o = j2;
                o0ooo0o2.f21818OooO = j2 / ((long) i2);
                return;
            }
            if (i == 3) {
                long j3 = message.arg1;
                o0ooo0o2.f21830OooOOO0++;
                long j4 = o0ooo0o2.f21825OooO0oO + j3;
                o0ooo0o2.f21825OooO0oO = j4;
                o0ooo0o2.f21827OooOO0 = j4 / ((long) o0ooo0o2.f21829OooOO0o);
                return;
            }
            if (i != 4) {
                Picasso.f21751OooOOO0.post(new RunnableC0280OooO00o(message));
                return;
            }
            Long l = (Long) message.obj;
            o0ooo0o2.f21828OooOO0O++;
            long jLongValue = l.longValue() + o0ooo0o2.f21824OooO0o0;
            o0ooo0o2.f21824OooO0o0 = jLongValue;
            o0ooo0o2.f21826OooO0oo = jLongValue / ((long) o0ooo0o2.f21828OooOO0O);
        }
    }

    public o0OOO0o(OooO0o oooO0o) {
        this.f21819OooO00o = oooO0o;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb = o000000O.f21773OooO00o;
        o000000 o000000Var = new o000000(looper);
        o000000Var.sendMessageDelayed(o000000Var.obtainMessage(), 1000L);
        this.f21820OooO0O0 = new OooO00o(handlerThread.getLooper(), this);
    }

    public final o0Oo0oo OooO00o() {
        int i;
        OooOo oooOo = (OooOo) this.f21819OooO00o;
        synchronized (oooOo) {
            i = oooOo.f21741OooO0O0;
        }
        return new o0Oo0oo(i, ((OooOo) this.f21819OooO00o).OooO0O0(), this.f21821OooO0OO, this.f21822OooO0Oo, this.f21824OooO0o0, this.f21823OooO0o, this.f21825OooO0oO, this.f21826OooO0oo, this.f21818OooO, this.f21827OooOO0, this.f21828OooOO0O, this.f21829OooOO0o, this.f21830OooOOO0, System.currentTimeMillis());
    }
}
