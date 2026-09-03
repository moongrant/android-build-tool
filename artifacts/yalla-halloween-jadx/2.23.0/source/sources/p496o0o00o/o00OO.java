package p496o0o00o;

import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.vm.main.PremiumVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p377o0OOoOo.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f49026OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PremiumShopModel.PremiumInfo f49027OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO(PremiumActivity premiumActivity, PremiumShopModel.PremiumInfo premiumInfo) {
        super(0);
        this.f49026OooO0Oo = premiumActivity;
        this.f49027OooO0o0 = premiumInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = PremiumActivity.f27140Oooo0oO;
        PremiumActivity premiumActivity = this.f49026OooO0Oo;
        PremiumVM premiumVM = (PremiumVM) premiumActivity.f27144OooOo00.getValue();
        PremiumShopModel.PremiumInfo premiumInfo = this.f49027OooO0o0;
        premiumVM.shopPurchase(premiumInfo.getShopid()).observe(premiumActivity, new o0000OO0(new oOO00O(premiumActivity, premiumInfo), null, null, false, 14));
        return Unit.INSTANCE;
    }
}
