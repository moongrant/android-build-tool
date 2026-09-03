package p430o0OoOOO0;

import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.ui.activity.message.Oooo000;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p520o0o0O0oo.x6;

/* JADX INFO: loaded from: classes4.dex */
public final class o000Oo0 extends Lambda implements Function1<GiftPropModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0o f45794OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f45795OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ x6 f45796OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(o000O0o o000o0o2, x6 x6Var, Oooo000 oooo000) {
        super(1);
        this.f45794OooO0Oo = o000o0o2;
        this.f45796OooO0o0 = x6Var;
        this.f45795OooO0o = oooo000;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GiftPropModel giftPropModel) {
        GiftPropModel gift = giftPropModel;
        Intrinsics.checkNotNullParameter(gift, "gift");
        o000O0o o000o0o2 = this.f45794OooO0Oo;
        if (o000o0o2.f45774OooO0O0.sendFilter()) {
            x6 x6Var = this.f45796OooO0o0;
            o000o0o2.f45774OooO0O0.sendGiftMessage(gift, x6Var.f53383OooOOOo);
            o000o0o2.OooO00o(this.f45795OooO0o);
            x6Var.OooO0OO();
        }
        return Unit.INSTANCE;
    }
}
