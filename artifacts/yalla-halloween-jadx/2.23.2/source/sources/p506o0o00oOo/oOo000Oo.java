package p506o0o00oOo;

import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.vm.main.PremiumVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p384o0OOoo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo000Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f50554OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PremiumShopModel.PremiumInfo f50555OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo000Oo(PremiumActivity premiumActivity, PremiumShopModel.PremiumInfo premiumInfo) {
        super(0);
        this.f50554OooO0Oo = premiumActivity;
        this.f50555OooO0o0 = premiumInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = PremiumActivity.f26673Oooo0oO;
        PremiumActivity premiumActivity = this.f50554OooO0Oo;
        PremiumVM premiumVM = (PremiumVM) premiumActivity.f26677OooOo00.getValue();
        PremiumShopModel.PremiumInfo premiumInfo = this.f50555OooO0o0;
        premiumVM.shopPurchase(premiumInfo.getShopid()).observe(premiumActivity, new o000oOoO(new oOo00OO0(premiumActivity, premiumInfo), null, null, false, 14));
        return Unit.INSTANCE;
    }
}
