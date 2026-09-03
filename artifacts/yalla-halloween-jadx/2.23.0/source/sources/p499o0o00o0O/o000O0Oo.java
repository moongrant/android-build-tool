package p499o0o00o0O;

import android.content.Context;
import android.os.Looper;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.ShopSkillCardModel;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p464o0Oooo.o000000O;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00OOo0;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0Oo extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PurchaseSkillCardActivity f49370OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(PurchaseSkillCardActivity purchaseSkillCardActivity, Context context) {
        super(context);
        this.f49370OooO0o0 = purchaseSkillCardActivity;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(String str) {
        ShopSkillCardModel shopSkillCardModel = (ShopSkillCardModel) oOo00OO0.OooO00o(str, ShopSkillCardModel.class);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooO0O0().postValue(Long.valueOf(o0OoOo0.OooO(0L, shopSkillCardModel.data.balance)));
        PurchaseSkillCardActivity purchaseSkillCardActivity = this.f49370OooO0o0;
        purchaseSkillCardActivity.f26989OooOOo0.setText(OooOOOO.OooO0Oo(o000000O.OooO0O0().getValue() + ""));
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.Purchase_successful);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
        purchaseSkillCardActivity.OooOo0O();
    }
}
