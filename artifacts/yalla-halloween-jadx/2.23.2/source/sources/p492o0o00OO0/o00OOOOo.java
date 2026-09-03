package p492o0o00OO0;

import com.code.android.util.o000O;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.view.moment.SendMomentTipsView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p414o0Oo0oO.oO00O0o0;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f49193OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOOo(MomentSendActivity momentSendActivity) {
        super(0);
        this.f49193OooO0Oo = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        oO00O0o0 oo00o0o0OooO = o00Ooo.OooO();
        oo00o0o0OooO.getClass();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        oo00o0o0OooO.OooO0o("isHideMomentEditTipsFirst" + o0O00oO0.OooOOo0().getValue(), true);
        int i = MomentSendActivity.f25726Oooo0OO;
        SendMomentTipsView sendMomentTipsView = this.f49193OooO0Oo.OooOo().f44315OooO;
        Intrinsics.checkNotNullExpressionValue(sendMomentTipsView, "sendMomentTipsView");
        o000O.OooO0O0(sendMomentTipsView);
        return Unit.INSTANCE;
    }
}
