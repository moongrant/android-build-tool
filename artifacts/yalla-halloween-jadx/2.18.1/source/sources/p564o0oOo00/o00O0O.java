package p564o0oOo00;

import android.view.View;
import com.app.base.Function.OooO0OO;
import com.app.base.application.App;
import com.app.base.model.StoreTopCardModel;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.ui.activity.store.PurchaseTopCardActivity;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p168o00Ooo0.o0O0O00;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ StoreTopCardModel.TopCard f45162Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f45163OoooO00;

    public o00O0O(o00Ooo o00ooo2, StoreTopCardModel.TopCard topCard) {
        this.f45163OoooO00 = o00ooo2;
        this.f45162Oooo = topCard;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(View view) {
        final PurchaseTopCardActivity purchaseTopCardActivity = this.f45163OoooO00.f45166OooO00o;
        final StoreTopCardModel.TopCard topCard = this.f45162Oooo;
        int i = PurchaseTopCardActivity.f23222Ooooooo;
        Objects.requireNonNull(purchaseTopCardActivity);
        if (topCard == null) {
            return;
        }
        oo0oOO0 oo0ooo0 = new oo0oOO0(purchaseTopCardActivity);
        oo0ooo0.OooOo0O(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.Store_TopCard_dialog_content), o0O0O00.OooO0Oo(topCard.price + "")));
        oo0ooo0.OooOoO();
        oo0ooo0.OooOo0o(new Function0() { // from class: o0oOo00.Oooo0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PurchaseTopCardActivity purchaseTopCardActivity2 = purchaseTopCardActivity;
                StoreTopCardModel.TopCard topCard2 = topCard;
                int i2 = PurchaseTopCardActivity.f23222Ooooooo;
                Objects.requireNonNull(purchaseTopCardActivity2);
                String str = topCard2.setTopId;
                o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
                p153o00Oo0oO.o0O0O00 o0o0o00 = o00000OO.f32211OooO0o;
                o0ooOOo o0ooooo2 = new o0ooOOo(purchaseTopCardActivity2, purchaseTopCardActivity2);
                App app = App.f11458Oooo0oO;
                Map mapOooO00o = OooO0OO.OooO00o();
                mapOooO00o.put("setTopId", str);
                o0ooOOo o0ooooo3 = o0ooOOo.f32218OooO00o;
                o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32284o00000O, mapOooO00o, o0ooooo2);
                return null;
            }
        });
        oo0ooo0.OooOOO0();
    }
}
