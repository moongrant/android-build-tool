package p590o0oOooo0;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends CountDownTimer {
    public r0() {
        super(60000L, 1000L);
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        s0.f57274OooO0O0 = null;
        s0.OooO00o oooO00o = s0.f57275OooO0OO;
        if (oooO00o != null) {
            oooO00o.OooO00o();
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        s0.OooO00o oooO00o = s0.f57275OooO0OO;
        if (oooO00o != null) {
            oooO00o.OooO0O0(j, s0.f57274OooO0O0);
        }
    }
}
