package p520o0o0O0oo;

import android.animation.Animator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.gift.GiftPropModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class z6 extends Lambda implements Function1<Animator, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53419OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(x6 x6Var) {
        super(1);
        this.f53419OooO0Oo = x6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Animator animator) {
        x6 x6Var = this.f53419OooO0Oo;
        x6Var.f53399Oooo000 = false;
        x6Var.OooO0o(true);
        GiftPropModel giftPropModel = x6Var.f53401Oooo00o;
        ArrayList arrayList = x6Var.f53398OooOooo;
        if (giftPropModel != null) {
            arrayList.remove(giftPropModel);
        }
        if (arrayList.isEmpty()) {
            x6Var.OooOOo().f58223OooO0oO.setImageDrawable(null);
            ConstraintLayout constraintLayout = x6Var.OooOOo().f58231OooOOOo;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "mBinding.layoutSendGiftEffect");
            o000OO00.OooO0OO(constraintLayout);
        } else {
            x6Var.OooOo0((GiftPropModel) arrayList.get(0));
        }
        return Unit.INSTANCE;
    }
}
