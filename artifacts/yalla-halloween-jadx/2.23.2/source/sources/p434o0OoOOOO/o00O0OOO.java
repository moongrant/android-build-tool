package p434o0OoOOOO;

import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.ui.activity.message.Oooo000;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p511o0o0O.o00000OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OOO extends Lambda implements Function1<GiftPropModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0OO f46932OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f46933OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00000OO f46934OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OOO(o00O0OO o00o0oo2, o00000OO o00000oo2, Oooo000 oooo000) {
        super(1);
        this.f46932OooO0Oo = o00o0oo2;
        this.f46934OooO0o0 = o00000oo2;
        this.f46933OooO0o = oooo000;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GiftPropModel giftPropModel) {
        GiftPropModel gift = giftPropModel;
        Intrinsics.checkNotNullParameter(gift, "gift");
        o00O0OO o00o0oo2 = this.f46932OooO0Oo;
        if (o00o0oo2.f46927OooO0O0.sendFilter()) {
            o00000OO o00000oo2 = this.f46934OooO0o0;
            o00o0oo2.f46927OooO0O0.sendGiftMessage(gift, o00000oo2.f50967OooOOOo);
            o00o0oo2.OooO00o(this.f46933OooO0o);
            o00000oo2.OooO0OO();
        }
        return Unit.INSTANCE;
    }
}
