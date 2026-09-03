package p496o0o00o;

import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.model.RechargeMenuConfirmOrderResultModel;
import com.yalla.yalla.model.RechargeMenuType;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.vm.WalletCoinVM;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPremiumActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PremiumActivity.kt\ncom/yalla/yalla/ui/activity/user/PremiumActivity$confirmRechargeOrder$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,990:1\n1855#2,2:991\n*S KotlinDebug\n*F\n+ 1 PremiumActivity.kt\ncom/yalla/yalla/ui/activity/user/PremiumActivity$confirmRechargeOrder$1\n*L\n702#1:991,2\n*E\n"})
public final class o00O00OO extends Lambda implements Function1<RechargeMenuConfirmOrderResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f49014OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f49015OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PayOrder f49016OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00OO(PremiumActivity premiumActivity, PayOrder payOrder, Ref.BooleanRef booleanRef) {
        super(1);
        this.f49014OooO0Oo = premiumActivity;
        this.f49016OooO0o0 = payOrder;
        this.f49015OooO0o = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel) {
        LiveEventBus.get("ConfirmRechargeOrder_Success").post(Boolean.TRUE);
        int i = PremiumActivity.f27140Oooo0oO;
        PremiumActivity premiumActivity = this.f49014OooO0Oo;
        WalletCoinVM walletCoinVMOooo0OO = premiumActivity.Oooo0OO();
        PayOrder payOrder = this.f49016OooO0o0;
        walletCoinVMOooo0OO.deleteOrderToDB(payOrder.getOrderId());
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.purchase_succ);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
        this.f49015OooO0o.element = true;
        ArrayList arrayList = new ArrayList();
        for (PremiumShopModel.PremiumInfo premiumInfo : premiumActivity.f27142OooOo) {
            if (premiumInfo.getGooglePaySkuDetail() != null) {
                RechargeMenuType rechargeMenuType = new RechargeMenuType();
                rechargeMenuType.setSku(premiumInfo.getSku());
                rechargeMenuType.setAmount(premiumInfo.getAmount());
                arrayList.add(rechargeMenuType);
            }
        }
        premiumActivity.Oooo0OO().onConfirmOrderSuccessUploadLog(payOrder.getAmount(), payOrder.getSku(), arrayList);
        return Unit.INSTANCE;
    }
}
