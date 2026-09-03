package p245o00oo0o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.o00Ooo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0 implements o00O0OOO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("messagePool")
    public static final ArrayList f40540OooO0O0 = new ArrayList(50);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Handler f40541OooO00o;

    public static final class OooO00o implements o00O0OOO.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public Message f40542OooO00o;

        public final void OooO00o() {
            Message message = this.f40542OooO00o;
            message.getClass();
            message.sendToTarget();
            this.f40542OooO00o = null;
            ArrayList arrayList = o0.f40540OooO0O0;
            synchronized (arrayList) {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            }
        }
    }

    public o0(Handler handler) {
        this.f40541OooO00o = handler;
    }

    public static OooO00o OooOOO0() {
        OooO00o oooO00o;
        ArrayList arrayList = f40540OooO0O0;
        synchronized (arrayList) {
            oooO00o = arrayList.isEmpty() ? new OooO00o() : (OooO00o) arrayList.remove(arrayList.size() - 1);
        }
        return oooO00o;
    }

    @Override // p245o00oo0o.o00O0OOO
    public final boolean OooO(long j) {
        return this.f40541OooO00o.sendEmptyMessageAtTime(2, j);
    }

    @Override // p245o00oo0o.o00O0OOO
    public final boolean OooO00o() {
        return this.f40541OooO00o.hasMessages(0);
    }

    @Override // p245o00oo0o.o00O0OOO
    public final OooO00o OooO0O0(int i) {
        OooO00o oooO00oOooOOO0 = OooOOO0();
        oooO00oOooOOO0.f40542OooO00o = this.f40541OooO00o.obtainMessage(i);
        return oooO00oOooOOO0;
    }

    @Override // p245o00oo0o.o00O0OOO
    public final void OooO0OO() {
        this.f40541OooO00o.removeCallbacksAndMessages(null);
    }

    @Override // p245o00oo0o.o00O0OOO
    public final boolean OooO0Oo(o00O0OOO.OooO00o oooO00o) {
        OooO00o oooO00o2 = (OooO00o) oooO00o;
        Message message = oooO00o2.f40542OooO00o;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = this.f40541OooO00o.sendMessageAtFrontOfQueue(message);
        oooO00o2.f40542OooO00o = null;
        ArrayList arrayList = f40540OooO0O0;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(oooO00o2);
            }
        }
        return zSendMessageAtFrontOfQueue;
    }

    @Override // p245o00oo0o.o00O0OOO
    public final Looper OooO0o() {
        return this.f40541OooO00o.getLooper();
    }

    @Override // p245o00oo0o.o00O0OOO
    public final OooO00o OooO0o0(int i, @Nullable Object obj) {
        OooO00o oooO00oOooOOO0 = OooOOO0();
        oooO00oOooOOO0.f40542OooO00o = this.f40541OooO00o.obtainMessage(i, obj);
        return oooO00oOooOOO0;
    }

    @Override // p245o00oo0o.o00O0OOO
    public final OooO00o OooO0oO(int i, int i2, int i3) {
        OooO00o oooO00oOooOOO0 = OooOOO0();
        oooO00oOooOOO0.f40542OooO00o = this.f40541OooO00o.obtainMessage(i, i2, i3);
        return oooO00oOooOOO0;
    }

    @Override // p245o00oo0o.o00O0OOO
    public final boolean OooO0oo(Runnable runnable) {
        return this.f40541OooO00o.post(runnable);
    }

    @Override // p245o00oo0o.o00O0OOO
    public final OooO00o OooOO0(int i, @Nullable o00Ooo o00ooo2) {
        OooO00o oooO00oOooOOO0 = OooOOO0();
        oooO00oOooOOO0.f40542OooO00o = this.f40541OooO00o.obtainMessage(20, 0, i, o00ooo2);
        return oooO00oOooOOO0;
    }

    @Override // p245o00oo0o.o00O0OOO
    public final boolean OooOO0O(int i) {
        return this.f40541OooO00o.sendEmptyMessage(i);
    }

    @Override // p245o00oo0o.o00O0OOO
    public final void OooOO0o(int i) {
        this.f40541OooO00o.removeMessages(i);
    }
}
