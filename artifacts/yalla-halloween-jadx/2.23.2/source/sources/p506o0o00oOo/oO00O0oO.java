package p506o0o00oOo;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
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
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPremiumActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PremiumActivity.kt\ncom/yalla/yalla/ui/activity/user/PremiumActivity$confirmRechargeOrder$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,990:1\n1855#2,2:991\n*S KotlinDebug\n*F\n+ 1 PremiumActivity.kt\ncom/yalla/yalla/ui/activity/user/PremiumActivity$confirmRechargeOrder$1\n*L\n702#1:991,2\n*E\n"})
public final class oO00O0oO extends Lambda implements Function1<RechargeMenuConfirmOrderResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f50446OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f50447OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PayOrder f50448OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0oO(PremiumActivity premiumActivity, PayOrder payOrder, Ref.BooleanRef booleanRef) {
        super(1);
        this.f50446OooO0Oo = premiumActivity;
        this.f50448OooO0o0 = payOrder;
        this.f50447OooO0o = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel) {
        LiveEventBus.get("ConfirmRechargeOrder_Success").post(Boolean.TRUE);
        int i = PremiumActivity.f26673Oooo0oO;
        PremiumActivity premiumActivity = this.f50446OooO0Oo;
        WalletCoinVM walletCoinVMOooo0O0 = premiumActivity.Oooo0O0();
        PayOrder payOrder = this.f50448OooO0o0;
        walletCoinVMOooo0O0.deleteOrderToDB(payOrder.getOrderId());
        String strOooO0OO = o0000.OooO0OO(o000000.purchase_succ);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
        this.f50447OooO0o.element = true;
        ArrayList arrayList = new ArrayList();
        for (PremiumShopModel.PremiumInfo premiumInfo : premiumActivity.f26675OooOo) {
            if (premiumInfo.getGooglePaySkuDetail() != null) {
                RechargeMenuType rechargeMenuType = new RechargeMenuType();
                rechargeMenuType.setSku(premiumInfo.getSku());
                rechargeMenuType.setAmount(premiumInfo.getAmount());
                arrayList.add(rechargeMenuType);
            }
        }
        premiumActivity.Oooo0O0().onConfirmOrderSuccessUploadLog(payOrder.getAmount(), payOrder.getSku(), arrayList);
        return Unit.INSTANCE;
    }
}
