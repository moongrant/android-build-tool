package p566o0oOo00O;

import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0o0000.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00o0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f45255Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ PremiumShopModel.PremiumInfo f45256Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00o0(PremiumActivity premiumActivity, PremiumShopModel.PremiumInfo premiumInfo) {
        super(0);
        this.f45255Oooo0o = premiumActivity;
        this.f45256Oooo0oO = premiumInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PremiumActivity premiumActivity = this.f45255Oooo0o;
        PremiumShopModel.PremiumInfo premiumInfo = this.f45256Oooo0oO;
        PremiumActivity.OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
        premiumActivity.Oooo0oo().shopPurchase(premiumInfo.getShopid()).observe(premiumActivity, new OooOo(new o000OO0O(premiumActivity, premiumInfo), null, null, false, 14));
        return Unit.INSTANCE;
    }
}
