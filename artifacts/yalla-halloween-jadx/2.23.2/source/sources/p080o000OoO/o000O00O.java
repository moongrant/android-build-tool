package p080o000OoO;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.source.o00Ooo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00O implements o000000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("messagePool")
    public static final ArrayList f34965OooO0O0 = new ArrayList(50);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Handler f34966OooO00o;

    public static final class OooO00o implements o000000.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public Message f34967OooO00o;

        public final void OooO00o() {
            Message message = this.f34967OooO00o;
            message.getClass();
            message.sendToTarget();
            this.f34967OooO00o = null;
            ArrayList arrayList = o000O00O.f34965OooO0O0;
            synchronized (arrayList) {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            }
        }
    }

    public o000O00O(Handler handler) {
        this.f34966OooO00o = handler;
    }

    public static OooO00o OooOOO0() {
        OooO00o oooO00o;
        ArrayList arrayList = f34965OooO0O0;
        synchronized (arrayList) {
            oooO00o = arrayList.isEmpty() ? new OooO00o() : (OooO00o) arrayList.remove(arrayList.size() - 1);
        }
        return oooO00o;
    }

    @Override // p080o000OoO.o000000
    public final boolean OooO(Runnable runnable) {
        return this.f34966OooO00o.post(runnable);
    }

    @Override // p080o000OoO.o000000
    public final boolean OooO00o() {
        return this.f34966OooO00o.hasMessages(0);
    }

    @Override // p080o000OoO.o000000
    public final OooO00o OooO0O0(int i) {
        OooO00o oooO00oOooOOO0 = OooOOO0();
        oooO00oOooOOO0.f34967OooO00o = this.f34966OooO00o.obtainMessage(i);
        return oooO00oOooOOO0;
    }

    @Override // p080o000OoO.o000000
    public final void OooO0OO() {
        this.f34966OooO00o.removeCallbacksAndMessages(null);
    }

    @Override // p080o000OoO.o000000
    public final boolean OooO0Oo(o000000.OooO00o oooO00o) {
        OooO00o oooO00o2 = (OooO00o) oooO00o;
        Message message = oooO00o2.f34967OooO00o;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = this.f34966OooO00o.sendMessageAtFrontOfQueue(message);
        oooO00o2.f34967OooO00o = null;
        ArrayList arrayList = f34965OooO0O0;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(oooO00o2);
            }
        }
        return zSendMessageAtFrontOfQueue;
    }

    @Override // p080o000OoO.o000000
    public final Looper OooO0o() {
        return this.f34966OooO00o.getLooper();
    }

    @Override // p080o000OoO.o000000
    public final OooO00o OooO0o0(int i, @Nullable Object obj) {
        OooO00o oooO00oOooOOO0 = OooOOO0();
        oooO00oOooOOO0.f34967OooO00o = this.f34966OooO00o.obtainMessage(i, obj);
        return oooO00oOooOOO0;
    }

    @Override // p080o000OoO.o000000
    public final OooO00o OooO0oO(int i, @Nullable o00Ooo o00ooo2) {
        OooO00o oooO00oOooOOO0 = OooOOO0();
        oooO00oOooOOO0.f34967OooO00o = this.f34966OooO00o.obtainMessage(20, 0, i, o00ooo2);
        return oooO00oOooOOO0;
    }

    @Override // p080o000OoO.o000000
    public final OooO00o OooO0oo(int i, int i2, int i3) {
        OooO00o oooO00oOooOOO0 = OooOOO0();
        oooO00oOooOOO0.f34967OooO00o = this.f34966OooO00o.obtainMessage(i, i2, i3);
        return oooO00oOooOOO0;
    }

    @Override // p080o000OoO.o000000
    public final boolean OooOO0(long j) {
        return this.f34966OooO00o.sendEmptyMessageAtTime(2, j);
    }

    @Override // p080o000OoO.o000000
    public final boolean OooOO0O(int i) {
        return this.f34966OooO00o.sendEmptyMessage(i);
    }

    @Override // p080o000OoO.o000000
    public final void OooOO0o(int i) {
        this.f34966OooO00o.removeMessages(i);
    }
}
