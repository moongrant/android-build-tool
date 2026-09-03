package p511o0o0O;

import android.animation.Animator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.util.o000O;
import com.yalla.yalla.model.gift.GiftPropModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000 extends Lambda implements Function1<Animator, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f50945OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000(o00000OO o00000oo2) {
        super(1);
        this.f50945OooO0Oo = o00000oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Animator animator) {
        o00000OO o00000oo2 = this.f50945OooO0Oo;
        o00000oo2.f50983Oooo000 = false;
        o00000oo2.OooO0o(true);
        GiftPropModel giftPropModel = o00000oo2.f50985Oooo00o;
        ArrayList arrayList = o00000oo2.f50982OooOooo;
        if (giftPropModel != null) {
            arrayList.remove(giftPropModel);
        }
        if (arrayList.isEmpty()) {
            o00000oo2.OooOOo0().f44507OooO0oO.setImageDrawable(null);
            ConstraintLayout layoutSendGiftEffect = o00000oo2.OooOOo0().f44515OooOOOo;
            Intrinsics.checkNotNullExpressionValue(layoutSendGiftEffect, "layoutSendGiftEffect");
            o000O.OooO0OO(layoutSendGiftEffect);
        } else {
            o00000oo2.OooOo00((GiftPropModel) arrayList.get(0));
        }
        return Unit.INSTANCE;
    }
}
