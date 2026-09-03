package p505o0o00oOO;

import android.content.Context;
import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.ShopSkillCardModel;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p590o0oOooo0.oOOO00;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0O0o extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PurchaseSkillCardActivity f50371OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0O0o(PurchaseSkillCardActivity purchaseSkillCardActivity, Context context) {
        super(context);
        this.f50371OooO0o0 = purchaseSkillCardActivity;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(String str) {
        ShopSkillCardModel shopSkillCardModel = (ShopSkillCardModel) oOOO00.OooO00o(str, ShopSkillCardModel.class);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0O00oO0.OooO0O0().postValue(Long.valueOf(o0OoOo0.OooO(0L, shopSkillCardModel.data.balance)));
        PurchaseSkillCardActivity purchaseSkillCardActivity = this.f50371OooO0o0;
        purchaseSkillCardActivity.f26524OooOOo0.setText(o0O0O0Oo.OooO0Oo(o0O00oO0.OooO0O0().getValue() + ""));
        String strOooO0OO = o0000.OooO0OO(o000000.Purchase_successful);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
        purchaseSkillCardActivity.OooOo0O();
    }
}
