package p566o0oOo00O;

import android.os.Looper;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.db.table.PayOrder;
import com.yalla.yalla.common.model.RechargeMenuConfirmOrderResultModel;
import com.yalla.yalla.common.model.RechargeMenuType;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0O0 extends Lambda implements Function1<RechargeMenuConfirmOrderResultModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f45215Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ PayOrder f45216Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f45217Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(PremiumActivity premiumActivity, PayOrder payOrder, Ref.BooleanRef booleanRef) {
        super(1);
        this.f45215Oooo0o = premiumActivity;
        this.f45216Oooo0oO = payOrder;
        this.f45217Oooo0oo = booleanRef;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.PremiumShopModel$PremiumInfo>] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel) {
        PremiumActivity premiumActivity = this.f45215Oooo0o;
        PremiumActivity.OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
        premiumActivity.Oooo0oO().deleteOrderToDB(this.f45216Oooo0oO.getOrderId());
        String strOooO0OO = OooOOO.OooO0OO(R.string.purchase_succ);
        ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O0.run();
            } else {
                o00O000 o00o001 = o00O000.f34346OooO00o;
                o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
            }
        }
        this.f45217Oooo0oo.element = true;
        ArrayList arrayList = new ArrayList();
        for (PremiumShopModel.PremiumInfo premiumInfo : this.f45215Oooo0o.f23366OooooOo) {
            if (premiumInfo.getGooglePaySkuDetail() != null) {
                RechargeMenuType rechargeMenuType = new RechargeMenuType();
                rechargeMenuType.setSku(premiumInfo.getSku());
                rechargeMenuType.setAmount(premiumInfo.getAmount());
                arrayList.add(rechargeMenuType);
            }
        }
        this.f45215Oooo0o.Oooo0oO().onConfirmOrderSuccessUploadLog(this.f45216Oooo0oO.getAmount(), this.f45216Oooo0oO.getSku(), arrayList);
        return Unit.INSTANCE;
    }
}
