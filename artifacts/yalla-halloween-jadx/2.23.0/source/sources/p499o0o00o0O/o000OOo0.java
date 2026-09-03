package p499o0o00o0O;

import android.view.View;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.StoreTopCardModel;
import com.yalla.yalla.ui.activity.store.PurchaseTopCardActivity;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import p157o00OoOO0.o0OO00O;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p466o0Oooo0o.oo00o;
import p584o0oOooO0.oO00OOo0;
import p590o0oo0.OooOOOO;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OOo0 extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ StoreTopCardModel.TopCard f49374OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o00O0000 f49375OooO0oo;

    public o000OOo0(o00O0000 o00o0001, StoreTopCardModel.TopCard topCard) {
        this.f49375OooO0oo = o00o0001;
        this.f49374OooO0oO = topCard;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(View view) {
        final PurchaseTopCardActivity purchaseTopCardActivity = this.f49375OooO0oo.f49382OooOoo0;
        int i = PurchaseTopCardActivity.f26998OooOoo0;
        purchaseTopCardActivity.getClass();
        final StoreTopCardModel.TopCard topCard = this.f49374OooO0oO;
        if (topCard == null) {
            return;
        }
        o0OO00O o0oo00o2 = new o0OO00O(purchaseTopCardActivity);
        o0oo00o2.OooOo00(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Store_TopCard_dialog_content), OooOOOO.OooO0Oo(topCard.price + "")));
        o0oo00o2.OooOo(true);
        o0oo00o2.OooOo0(new Function0() { // from class: o0o00o0O.o000O
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = PurchaseTopCardActivity.f26998OooOoo0;
                PurchaseTopCardActivity purchaseTopCardActivity2 = purchaseTopCardActivity;
                purchaseTopCardActivity2.getClass();
                String str = topCard.setTopId;
                o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
                o00O000 o00o001 = new o00O000(purchaseTopCardActivity2, purchaseTopCardActivity2);
                o000o00o2.getClass();
                boolean z = App.f22703OooO0o0;
                LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
                linkedHashMapOooO00o.put("setTopId", str);
                OooO0OO.OooO0O0(null, p377o0OOoOo.o0000O.f44100OooOoo, p377o0OOoOo.o0000O.f44137o000000O, linkedHashMapOooO00o, o00o001);
                return null;
            }
        });
        o0oo00o2.OooOO0o();
    }
}
