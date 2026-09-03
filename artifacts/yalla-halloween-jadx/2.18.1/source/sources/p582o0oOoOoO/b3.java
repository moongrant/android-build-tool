package p582o0oOoOoO;

import android.os.CountDownTimer;
import android.widget.LinearLayout;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.ui.fragment.RoomMemberConveneListDialog;
import kotlin.jvm.internal.Intrinsics;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
public final class b3 extends CountDownTimer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ RoomMemberConveneListDialog f46843OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(RoomMemberConveneListDialog roomMemberConveneListDialog, long j) {
        super(j, 1000L);
        this.f46843OooO00o = roomMemberConveneListDialog;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        LinearLayout linearLayout = this.f46843OooO00o.OooOOO().f49170OooO0O0;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.bottomLayout");
        oOO00O.OooO00o(linearLayout);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.f46843OooO00o.OooOOO().f49171OooO0OO.setText(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.room_member_convene_tick_xxx), o00O0.OooO00o(j)));
    }
}
