package p505o0o00oOO;

import android.view.View;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.StoreTopCardModel;
import com.yalla.yalla.ui.activity.store.PurchaseTopCardActivity;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import p205o00o0o0o.o000O;
import p384o0OOoo0O.Oooo0;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p426o0OoO0o0.OooOOOO;
import p473o0OoooOo.o0OOOO0o;
import p562o0oOo000.o000000;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOO0 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ StoreTopCardModel.TopCard f50339OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ oo0OOoo f50340OooO0oo;

    public o0O0OOO0(oo0OOoo oo0oooo, StoreTopCardModel.TopCard topCard) {
        this.f50340OooO0oo = oo0oooo;
        this.f50339OooO0oO = topCard;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(View view) {
        final PurchaseTopCardActivity purchaseTopCardActivity = this.f50340OooO0oo.f50380OooOoo0;
        int i = PurchaseTopCardActivity.f26533OooOoo0;
        purchaseTopCardActivity.getClass();
        final StoreTopCardModel.TopCard topCard = this.f50339OooO0oO;
        if (topCard == null) {
            return;
        }
        o000O o000o = new o000O(purchaseTopCardActivity);
        o000o.OooOo00(o0000O.OooO00o(o0000.OooO0OO(o000000.Store_TopCard_dialog_content), o0O0O0Oo.OooO0Oo(topCard.price + "")));
        o000o.OooOo(true);
        o000o.OooOo0(new Function0() { // from class: o0o00oOO.o0O0O0o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = PurchaseTopCardActivity.f26533OooOoo0;
                PurchaseTopCardActivity purchaseTopCardActivity2 = purchaseTopCardActivity;
                purchaseTopCardActivity2.getClass();
                String str = topCard.setTopId;
                o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
                o0O0o0 o0o0o0 = new o0O0o0(purchaseTopCardActivity2, purchaseTopCardActivity2);
                o00oo0o2.getClass();
                boolean z = App.f22233OooO0o0;
                LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
                linkedHashMapOooO00o.put("setTopId", str);
                OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43396o000000O, linkedHashMapOooO00o, o0o0o0);
                return null;
            }
        });
        o000o.OooOO0o();
    }
}
