package p564o0oOo00;

import android.view.View;
import com.app.base.Function.OooO0OO;
import com.app.base.application.App;
import com.app.base.model.StoreTopCardModel;
import com.yalla.yalla.ui.activity.store.PurchaseTopCardActivity;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p043OooooO0.o00O0000;
import p139o00OOOo0.OooOo00;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.o0O0O00;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 extends p654o0ooo.o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ StoreTopCardModel.TopCard f45164Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f45165OoooO00;

    public o00Oo0(o00Ooo o00ooo2, StoreTopCardModel.TopCard topCard) {
        this.f45165OoooO00 = o00ooo2;
        this.f45164Oooo = topCard;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(View view) {
        final PurchaseTopCardActivity activity = this.f45165OoooO00.f45166OooO00o;
        final StoreTopCardModel.TopCard topCard = this.f45164Oooo;
        int i = PurchaseTopCardActivity.f23222Ooooooo;
        Objects.requireNonNull(activity);
        long j = topCard.price;
        Function1 onConfirmClick = new Function1() { // from class: o0oOo00.o000oOoO
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                PurchaseTopCardActivity purchaseTopCardActivity = activity;
                StoreTopCardModel.TopCard topCard2 = topCard;
                int i2 = PurchaseTopCardActivity.f23222Ooooooo;
                Objects.requireNonNull(purchaseTopCardActivity);
                String str = topCard2.setTopId;
                long jLongValue = ((Long) obj).longValue();
                o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
                o0O0O00 o0o0o00 = o00000OO.f32211OooO0o;
                o00oO0o o00oo0o3 = new o00oO0o(purchaseTopCardActivity, purchaseTopCardActivity);
                App app = App.f11458Oooo0oO;
                Map mapOooO00o = OooO0OO.OooO00o();
                mapOooO00o.put("setTopId", str);
                mapOooO00o.put("price", jLongValue + "");
                o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
                o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32286o00000OO, mapOooO00o, o00oo0o3);
                return null;
            }
        };
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
        activity.showDialog((String) null, o00O0000.OooO0O0(-1839467469, true, new OooOo00(j, onConfirmClick)));
    }
}
