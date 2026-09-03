package p564o0oOo00;

import android.content.Context;
import android.os.Looper;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.model.ShopSkillCardModel;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p160o00OoOO0.o00OO0O0;
import p168o00Ooo0.o0O0O00;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PurchaseSkillCardActivity f45125OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(PurchaseSkillCardActivity purchaseSkillCardActivity, Context context) {
        super(context);
        this.f45125OooO00o = purchaseSkillCardActivity;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(String str) {
        super.onFinish(str);
        ShopSkillCardModel shopSkillCardModel = (ShopSkillCardModel) o0Oo0oo.OooO0O0(str, ShopSkillCardModel.class);
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        oooOOO.OooO0OO().postValue(Long.valueOf(OooO.OooO0o(shopSkillCardModel.data.balance)));
        this.f45125OooO00o.f23212OoooOo0.setText(o0O0O00.OooO0Oo(oooOOO.OooO0OO().getValue() + ""));
        String strOooO0OO = o000O0O0.OooO0OO(R.string.Purchase_successful);
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
        this.f45125OooO00o.OooOoO();
    }
}
