package p530o0o0OOOO;

import android.os.CountDownTimer;
import android.widget.LinearLayout;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O;
import kotlin.jvm.internal.Intrinsics;
import p562o0oOo000.o000000;
import p606o0oo0O0o.o0O0O0o0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00OO extends CountDownTimer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O00oO0 f53440OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00OO(o0O00oO0 o0o00oo1, long j) {
        super(j, 1000L);
        this.f53440OooO00o = o0o00oo1;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        LinearLayout bottomLayout = this.f53440OooO00o.OooOO0o().f44839OooO0O0;
        Intrinsics.checkNotNullExpressionValue(bottomLayout, "bottomLayout");
        o000O.OooO0O0(bottomLayout);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.f53440OooO00o.OooOO0o().f44840OooO0OO.setText(o0000O.OooO00o(o0000.OooO0OO(o000000.room_member_convene_tick_xxx), o0O0O0o0.OooO00o(j)));
    }
}
