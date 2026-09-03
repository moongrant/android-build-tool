package p506o0o00oOo;

import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.view.UserPremiumView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOoOOO0 extends Lambda implements Function1<Pair<? extends Boolean, ? extends Integer>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f50547OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOoOOO0(PremiumActivity premiumActivity) {
        super(1);
        this.f50547OooO0Oo = premiumActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Boolean, ? extends Integer> pair) {
        Pair<? extends Boolean, ? extends Integer> pair2 = pair;
        PremiumLevel premiumLevelOf = PremiumLevel.INSTANCE.of(pair2.getSecond());
        PremiumActivity premiumActivity = this.f50547OooO0Oo;
        premiumActivity.f26683OooOoo = premiumLevelOf;
        UserPremiumView userPremiumView = premiumActivity.OooOooO().f43822OooO0o0;
        Intrinsics.checkNotNull(pair2);
        userPremiumView.setPremium(pair2);
        return Unit.INSTANCE;
    }
}
