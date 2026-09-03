package p168o00Ooo0;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo extends CountDownTimer {
    public o0Oo0oo() {
        super(60000L, 1000L);
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        o0OO00O.f32654OooO0O0 = null;
        o0OO00O.OooO00o oooO00o = o0OO00O.f32655OooO0OO;
        if (oooO00o != null) {
            oooO00o.OooO0O0();
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        o0OO00O.OooO00o oooO00o = o0OO00O.f32655OooO0OO;
        if (oooO00o != null) {
            oooO00o.OooO00o(j, o0OO00O.f32654OooO0O0);
        }
    }
}
