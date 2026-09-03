package p499o0o00o0O;

import android.os.Looper;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.SetTopCardModel;
import com.yalla.yalla.ui.activity.store.PurchaseTopCardActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p464o0Oooo.o000000O;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 extends OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PurchaseTopCardActivity f49381OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(PurchaseTopCardActivity purchaseTopCardActivity, PurchaseTopCardActivity purchaseTopCardActivity2) {
        super(purchaseTopCardActivity2);
        this.f49381OooO0o0 = purchaseTopCardActivity;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0O0(String str, String str2) {
        super.OooO0O0(str, str2);
        if (OooOo00.OooO0O0(str) && "2024".equals(str)) {
            int i = PurchaseTopCardActivity.f26998OooOoo0;
            this.f49381OooO0o0.OooOo0();
        }
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(String str) {
        SetTopCardModel setTopCardModel = (SetTopCardModel) oOo00OO0.OooO00o(str, SetTopCardModel.class);
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.Store_Top_purchase_successful);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
        if (setTopCardModel == null || setTopCardModel.data == null) {
            return;
        }
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooO0O0().postValue(Long.valueOf(setTopCardModel.data.balance));
        int i = PurchaseTopCardActivity.f26998OooOoo0;
        PurchaseTopCardActivity purchaseTopCardActivity = this.f49381OooO0o0;
        purchaseTopCardActivity.OooOo0O();
        purchaseTopCardActivity.OooOo0();
    }
}
