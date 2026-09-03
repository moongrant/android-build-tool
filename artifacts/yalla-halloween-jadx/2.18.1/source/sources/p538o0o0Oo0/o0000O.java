package p538o0o0Oo0;

import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.view.SendMomentTipsView;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;
import p499o0o00OoO.o000000;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f43914Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(MomentSendActivity momentSendActivity) {
        super(0);
        this.f43914Oooo0o = momentSendActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        o000000 o000000VarOooO = OooOOO0.OooO();
        Objects.requireNonNull(o000000VarOooO);
        o000000VarOooO.OooO0o("isHideMomentEditTipsFirst" + OooOOO.f41216OooO00o.OooOo().getValue(), true);
        MomentSendActivity momentSendActivity = this.f43914Oooo0o;
        MomentSendActivity.OooO00o oooO00o = MomentSendActivity.f22367o00oO0o;
        SendMomentTipsView sendMomentTipsView = momentSendActivity.OooOooO().f48994OooOO0o;
        Intrinsics.checkNotNullExpressionValue(sendMomentTipsView, "binding.sendMomentTipsView");
        o00O0O.OooO00o(sendMomentTipsView);
        return Unit.INSTANCE;
    }
}
