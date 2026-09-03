package androidx.compose.ui.graphics.colorspace;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p499o0o00o0O.o00OO;
import p499o0o00o0O.o00OOO0;
import p519o0o0O0oO.g5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOO0O implements DoubleFunction, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f4165OooO0Oo;

    public /* synthetic */ OooOO0O(Object obj) {
        this.f4165OooO0Oo = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        VehicleStoreActivity this$0 = (VehicleStoreActivity) this.f4165OooO0Oo;
        int i2 = VehicleStoreActivity.f27043OooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o00OO o00oo2 = this$0.f27045OooOo0;
        if (o00oo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o00oo2 = null;
        }
        ShopVehicleListModel shopVehicleListModelOooOOO = o00oo2.OooOOO(i);
        if (shopVehicleListModelOooOOO == null || this$0.f27048OooOo0o) {
            return;
        }
        this$0.f27048OooOo0o = true;
        g5 g5Var = new g5(this$0);
        g5Var.OooO00o(new o00OOO0(this$0));
        g5Var.OooOO0(shopVehicleListModelOooOOO.getPicDynamic());
        g5Var.OooO();
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb._init_$lambda$3((Function1) this.f4165OooO0Oo, d);
    }
}
