package p520o0o0O0oo;

import com.yalla.yalla.model.gift.GiftPropModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class w8 extends Lambda implements Function1<List<GiftPropModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53372OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(x6 x6Var) {
        super(1);
        this.f53372OooO0Oo = x6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<GiftPropModel> list) {
        List<GiftPropModel> data = list;
        Intrinsics.checkNotNullParameter(data, "data");
        boolean zIsEmpty = data.isEmpty();
        x6 x6Var = this.f53372OooO0Oo;
        if (zIsEmpty) {
            x6Var.OooOOo().f58224OooO0oo.setEnabled(false);
            x6Var.OooOOo().f58224OooO0oo.setClickable(false);
            x6Var.OooOOo().f58235OooOo.setEnabled(false);
            x6Var.OooOOo().f58235OooOo.setClickable(false);
        } else {
            x6Var.OooOOo().f58224OooO0oo.setEnabled(true);
            x6Var.OooOOo().f58224OooO0oo.setClickable(true);
            x6Var.OooOOo().f58235OooOo.setEnabled(true);
            x6Var.OooOOo().f58235OooOo.setClickable(true);
        }
        return Unit.INSTANCE;
    }
}
