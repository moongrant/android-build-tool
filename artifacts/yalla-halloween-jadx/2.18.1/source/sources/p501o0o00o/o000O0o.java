package p501o0o00o;

import android.animation.Animator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.yalla.model.GiftPropModel;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0o extends Lambda implements Function1<Animator, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000 f41469Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(o000 o000Var) {
        super(1);
        this.f41469Oooo0o = o000Var;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.GiftPropModel>] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.GiftPropModel>] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.GiftPropModel>] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Animator animator) {
        o000 o000Var = this.f41469Oooo0o;
        o000Var.f41418OooOooo = false;
        o000Var.OooO0oO(true);
        o000 o000Var2 = this.f41469Oooo0o;
        GiftPropModel giftPropModel = o000Var2.f41420Oooo00O;
        if (giftPropModel != null) {
            o000Var2.f41417OooOooO.remove(giftPropModel);
        }
        if (this.f41469Oooo0o.f41417OooOooO.isEmpty()) {
            this.f41469Oooo0o.OooOo00().f50832OooO.setImageDrawable(null);
            ConstraintLayout constraintLayout = this.f41469Oooo0o.OooOo00().f50848OooOOo;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "mBinding.layoutSendGiftEffect");
            oOO00O.OooO0O0(constraintLayout);
        } else {
            o000 o000Var3 = this.f41469Oooo0o;
            o000Var3.OooOo0O((GiftPropModel) o000Var3.f41417OooOooO.get(0));
        }
        Objects.requireNonNull(this.f41469Oooo0o);
        return Unit.INSTANCE;
    }
}
