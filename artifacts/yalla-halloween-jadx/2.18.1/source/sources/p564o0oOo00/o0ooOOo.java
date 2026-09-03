package p564o0oOo00;

import android.content.Context;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.SetTopCardModel;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.ui.activity.store.PurchaseTopCardActivity;
import p160o00OoOO0.o00OO0O0;
import p254o00ooO0O.o000O0O0;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0ooOOo extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PurchaseTopCardActivity f45173OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(PurchaseTopCardActivity purchaseTopCardActivity, Context context) {
        super(context);
        this.f45173OooO00o = purchaseTopCardActivity;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onError(String str, String str2) {
        super.onError(str, str2);
        if (OooO0OO.OooO0O0(str) && "2024".equals(str)) {
            PurchaseTopCardActivity purchaseTopCardActivity = this.f45173OooO00o;
            int i = PurchaseTopCardActivity.f23222Ooooooo;
            purchaseTopCardActivity.OooOoO();
        }
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(String str) {
        super.onFinish(str);
        SetTopCardModel setTopCardModel = (SetTopCardModel) o0Oo0oo.OooO0O0(str, SetTopCardModel.class);
        ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Store_Top_purchase_successful));
        if (setTopCardModel == null || setTopCardModel.data == null) {
            return;
        }
        OooOOO.f41216OooO00o.OooO0OO().postValue(Long.valueOf(setTopCardModel.data.balance));
        PurchaseTopCardActivity purchaseTopCardActivity = this.f45173OooO00o;
        int i = PurchaseTopCardActivity.f23222Ooooooo;
        purchaseTopCardActivity.OooOoOO();
        this.f45173OooO00o.OooOoO();
    }
}
