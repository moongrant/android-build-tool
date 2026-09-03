package p485o0o00O0;

import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.view.moment.SendMomentTipsView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o00000O0;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f47892OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00o0(MomentSendActivity momentSendActivity) {
        super(0);
        this.f47892OooO0Oo = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00000O0 o00000o0OooO = o00Oo0.OooO();
        o00000o0OooO.getClass();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o00000o0OooO.OooO0o("isHideMomentEditTipsFirst" + o000000O.OooOOo0().getValue(), true);
        int i = MomentSendActivity.f26175Oooo0OO;
        SendMomentTipsView sendMomentTipsView = this.f47892OooO0Oo.OooOo().f58553OooO;
        Intrinsics.checkNotNullExpressionValue(sendMomentTipsView, "binding.sendMomentTipsView");
        o000OO00.OooO0O0(sendMomentTipsView);
        return Unit.INSTANCE;
    }
}
