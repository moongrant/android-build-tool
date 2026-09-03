package p524o0o0OO0o;

import android.os.CountDownTimer;
import android.widget.LinearLayout;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000OO00;
import kotlin.jvm.internal.Intrinsics;
import p584o0oOooO0.oO00OOo0;
import p601o0oo0O0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOo0O0 extends CountDownTimer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0O00 f53522OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOo0O0(o0O00 o0o01, long j) {
        super(j, 1000L);
        this.f53522OooO00o = o0o01;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        LinearLayout linearLayout = this.f53522OooO00o.OooOO0o().f58258OooO0O0;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.bottomLayout");
        o000OO00.OooO0O0(linearLayout);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.f53522OooO00o.OooOO0o().f58259OooO0OO.setText(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.room_member_convene_tick_xxx), o0000oo.OooO00o(j)));
    }
}
