package p496o0o00o;

import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.view.UserPremiumView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO extends Lambda implements Function1<Pair<? extends Boolean, ? extends Integer>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f49023OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO(PremiumActivity premiumActivity) {
        super(1);
        this.f49023OooO0Oo = premiumActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Boolean, ? extends Integer> pair) {
        Pair<? extends Boolean, ? extends Integer> it = pair;
        PremiumLevel premiumLevelOf = PremiumLevel.INSTANCE.of(it.getSecond());
        PremiumActivity premiumActivity = this.f49023OooO0Oo;
        premiumActivity.f27150OooOoo = premiumLevelOf;
        UserPremiumView userPremiumView = premiumActivity.OooOooo().f58620OooO0o0;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        userPremiumView.setPremium(it);
        return Unit.INSTANCE;
    }
}
