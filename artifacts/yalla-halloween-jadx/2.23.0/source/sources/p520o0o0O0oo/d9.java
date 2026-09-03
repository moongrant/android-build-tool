package p520o0o0O0oo;

import com.yalla.yalla.model.gift.GiftPropModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class d9 extends Lambda implements Function1<GiftPropModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53273OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(x6 x6Var) {
        super(1);
        this.f53273OooO0Oo = x6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GiftPropModel giftPropModel) {
        GiftPropModel it = giftPropModel;
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<? super GiftPropModel, Unit> function1 = this.f53273OooO0Oo.f53378OooOO0O;
        if (function1 != null) {
            function1.invoke(it);
        }
        return Unit.INSTANCE;
    }
}
