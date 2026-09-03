package p499o0o00o0O;

import android.view.View;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.StoreTopCardModel;
import com.yalla.yalla.ui.activity.store.PurchaseTopCardActivity;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O00O;
import p466o0Oooo0o.oo00o;
import p519o0o0O0oO.o000O;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00 extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ StoreTopCardModel.TopCard f49358OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ o00O0000 f49359OooO0oo;

    public o00(o00O0000 o00o0001, StoreTopCardModel.TopCard topCard) {
        this.f49359OooO0oo = o00o0001;
        this.f49358OooO0oO = topCard;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, o0o00o0O.o000O0O0] */
    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(View view) {
        final PurchaseTopCardActivity activity = this.f49359OooO0oo.f49382OooOoo0;
        int i = PurchaseTopCardActivity.f26998OooOoo0;
        activity.getClass();
        final StoreTopCardModel.TopCard topCard = this.f49358OooO0oO;
        long j = topCard.price;
        ?? onConfirmClick = new Function1() { // from class: o0o00o0O.o000O0O0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = PurchaseTopCardActivity.f26998OooOoo0;
                PurchaseTopCardActivity purchaseTopCardActivity = activity;
                purchaseTopCardActivity.getClass();
                String str = topCard.setTopId;
                long jLongValue = ((Long) obj).longValue();
                o000O00O o000o00o2 = p377o0OOoOo.o000O0O0.f44226OooO00o;
                o00oOoo o00oooo2 = new o00oOoo(purchaseTopCardActivity, purchaseTopCardActivity);
                o000o00o2.getClass();
                boolean z = App.f22703OooO0o0;
                LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
                linkedHashMapOooO00o.put("setTopId", str);
                linkedHashMapOooO00o.put("price", jLongValue + "");
                OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44138o000000o, linkedHashMapOooO00o, o00oooo2);
                return null;
            }
        };
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
        activity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(1182386404, true, new o000O(j, onConfirmClick)));
    }
}
