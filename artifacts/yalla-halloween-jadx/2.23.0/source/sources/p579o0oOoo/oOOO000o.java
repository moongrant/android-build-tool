package p579o0oOoo;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes5.dex */
public final class oOOO000o extends CountDownTimer {
    public oOOO000o() {
        super(60000L, 1000L);
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        oOOO00.f56669OooO0O0 = null;
        oOOO00.OooO00o oooO00o = oOOO00.f56670OooO0OO;
        if (oooO00o != null) {
            oooO00o.OooO00o();
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        oOOO00.OooO00o oooO00o = oOOO00.f56670OooO0OO;
        if (oooO00o != null) {
            oooO00o.OooO0O0(j, oOOO00.f56669OooO0O0);
        }
    }
}
