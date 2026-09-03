package p505o0o00oOO;

import android.view.View;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.StoreTopCardModel;
import com.yalla.yalla.ui.activity.store.PurchaseTopCardActivity;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p384o0OOoo0O.Oooo0;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p426o0OoO0o0.OooOOOO;
import p473o0OoooOo.o0OOOO0o;
import p650o0ooo.o000O000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOOo extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ StoreTopCardModel.TopCard f50341OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ oo0OOoo f50342OooO0oo;

    public o0O0OOOo(oo0OOoo oo0oooo, StoreTopCardModel.TopCard topCard) {
        this.f50342OooO0oo = oo0oooo;
        this.f50341OooO0oO = topCard;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, o0o00oOO.o0O0O0Oo] */
    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(View view) {
        final PurchaseTopCardActivity activity = this.f50342OooO0oo.f50380OooOoo0;
        int i = PurchaseTopCardActivity.f26533OooOoo0;
        activity.getClass();
        final StoreTopCardModel.TopCard topCard = this.f50341OooO0oO;
        long j = topCard.price;
        ?? onConfirmClick = new Function1() { // from class: o0o00oOO.o0O0O0Oo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = PurchaseTopCardActivity.f26533OooOoo0;
                PurchaseTopCardActivity purchaseTopCardActivity = activity;
                purchaseTopCardActivity.getClass();
                String str = topCard.setTopId;
                long jLongValue = ((Long) obj).longValue();
                o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
                o0O0o00O o0o0o00o = new o0O0o00O(purchaseTopCardActivity, purchaseTopCardActivity);
                o00oo0o2.getClass();
                boolean z = App.f22233OooO0o0;
                LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
                linkedHashMapOooO00o.put("setTopId", str);
                linkedHashMapOooO00o.put("price", jLongValue + "");
                OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43397o000000o, linkedHashMapOooO00o, o0o0o00o);
                return null;
            }
        };
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onConfirmClick, "onConfirmClick");
        activity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(1182386404, true, new o000O000(j, onConfirmClick)));
    }
}
