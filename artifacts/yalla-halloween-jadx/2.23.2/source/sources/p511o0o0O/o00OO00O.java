package p511o0o0O;

import com.yalla.yalla.model.gift.GiftPropModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO00O extends Lambda implements Function1<GiftPropModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51051OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO00O(o00000OO o00000oo2) {
        super(1);
        this.f51051OooO0Oo = o00000oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GiftPropModel giftPropModel) {
        GiftPropModel it = giftPropModel;
        Intrinsics.checkNotNullParameter(it, "it");
        Function1<? super GiftPropModel, Unit> function1 = this.f51051OooO0Oo.f50962OooOO0O;
        if (function1 != null) {
            function1.invoke(it);
        }
        return Unit.INSTANCE;
    }
}
