package p420o0Oo0ooO;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00o00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f39774OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oO00OOo0 f39775OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f39776OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f39777OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f39778OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f39779OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f39780OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f39781OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f39782OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f39783OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f39784OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f39785OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f39786OooOOO0;

    public static class OooO00o extends Handler {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oO00o00 f39787OooO00o;

        /* JADX INFO: renamed from: o0Oo0ooO.oO00o00$OooO00o$OooO00o, reason: collision with other inner class name */
        public class RunnableC0384OooO00o implements Runnable {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Message f39788Oooo0o;

            public RunnableC0384OooO00o(Message message) {
                this.f39788Oooo0o = message;
            }

            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Unhandled stats message.");
                sbOooO0o0.append(this.f39788Oooo0o.what);
                throw new AssertionError(sbOooO0o0.toString());
            }
        }

        public OooO00o(Looper looper, oO00o00 oo00o00) {
            super(looper);
            this.f39787OooO00o = oo00o00;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f39787OooO00o.f39777OooO0OO++;
                return;
            }
            if (i == 1) {
                this.f39787OooO00o.f39778OooO0Oo++;
                return;
            }
            if (i == 2) {
                oO00o00 oo00o00 = this.f39787OooO00o;
                long j = message.arg1;
                int i2 = oo00o00.f39785OooOO0o + 1;
                oo00o00.f39785OooOO0o = i2;
                long j2 = oo00o00.f39779OooO0o + j;
                oo00o00.f39779OooO0o = j2;
                oo00o00.f39774OooO = j2 / ((long) i2);
                return;
            }
            if (i == 3) {
                oO00o00 oo00o01 = this.f39787OooO00o;
                long j3 = message.arg1;
                oo00o01.f39786OooOOO0++;
                long j4 = oo00o01.f39781OooO0oO + j3;
                oo00o01.f39781OooO0oO = j4;
                oo00o01.f39783OooOO0 = j4 / ((long) oo00o01.f39785OooOO0o);
                return;
            }
            if (i != 4) {
                Picasso.f19790OooOOO.post(new RunnableC0384OooO00o(message));
                return;
            }
            oO00o00 oo00o02 = this.f39787OooO00o;
            Long l = (Long) message.obj;
            oo00o02.f39784OooOO0O++;
            long jLongValue = l.longValue() + oo00o02.f39780OooO0o0;
            oo00o02.f39780OooO0o0 = jLongValue;
            oo00o02.f39782OooO0oo = jLongValue / ((long) oo00o02.f39784OooOO0O);
        }
    }

    public oO00o00(oO00OOo0 oo00ooo0) {
        this.f39775OooO00o = oo00ooo0;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb = o00oO0o.f19821OooO00o;
        oO00o0 oo00o0 = new oO00o0(looper);
        oo00o0.sendMessageDelayed(oo00o0.obtainMessage(), 1000L);
        this.f39776OooO0O0 = new OooO00o(handlerThread.getLooper(), this);
    }

    public final oO0OOO00 OooO00o() {
        int i;
        int i2;
        oOOoOOO0 ooooooo0 = (oOOoOOO0) this.f39775OooO00o;
        synchronized (ooooooo0) {
            i = ooooooo0.f39809OooO0O0;
        }
        oOOoOOO0 ooooooo1 = (oOOoOOO0) this.f39775OooO00o;
        synchronized (ooooooo1) {
            i2 = ooooooo1.f39810OooO0OO;
        }
        return new oO0OOO00(i, i2, this.f39777OooO0OO, this.f39778OooO0Oo, this.f39780OooO0o0, this.f39779OooO0o, this.f39781OooO0oO, this.f39782OooO0oo, this.f39774OooO, this.f39783OooOO0, this.f39784OooOO0O, this.f39785OooOO0o, this.f39786OooOOO0, System.currentTimeMillis());
    }
}
