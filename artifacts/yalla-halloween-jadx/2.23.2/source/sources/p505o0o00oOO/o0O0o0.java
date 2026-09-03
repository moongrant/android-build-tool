package p505o0o00oOO;

import android.os.Looper;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.SetTopCardModel;
import com.yalla.yalla.ui.activity.store.PurchaseTopCardActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o0 extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PurchaseTopCardActivity f50343OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o0(PurchaseTopCardActivity purchaseTopCardActivity, PurchaseTopCardActivity purchaseTopCardActivity2) {
        super(purchaseTopCardActivity2);
        this.f50343OooO0o0 = purchaseTopCardActivity;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0O0(String str, String str2) {
        super.OooO0O0(str, str2);
        if (OooOo00.OooO0O0(str) && "2024".equals(str)) {
            int i = PurchaseTopCardActivity.f26533OooOoo0;
            this.f50343OooO0o0.OooOo0();
        }
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(String str) {
        SetTopCardModel setTopCardModel = (SetTopCardModel) oOOO00.OooO00o(str, SetTopCardModel.class);
        String strOooO0OO = o0000.OooO0OO(o000000.Store_Top_purchase_successful);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
        if (setTopCardModel == null || setTopCardModel.data == null) {
            return;
        }
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0O00oO0.OooO0O0().postValue(Long.valueOf(setTopCardModel.data.balance));
        int i = PurchaseTopCardActivity.f26533OooOoo0;
        PurchaseTopCardActivity purchaseTopCardActivity = this.f50343OooO0o0;
        purchaseTopCardActivity.OooOo0O();
        purchaseTopCardActivity.OooOo0();
    }
}
