package androidx.compose.ui.graphics.colorspace;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.ui.activity.store.VehicleMineActivity;
import com.yalla.yalla.ui.fragment.MainSearchRoomFragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p389o0OOoooO.oo0o0O0;
import p499o0o00o0O.o00O;
import p499o0o00o0O.o00O0OOO;
import p519o0o0O0oO.g5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements DoubleFunction, BaseQuickAdapter.OooO0o, oo0o0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f4163OooO0Oo;

    public /* synthetic */ OooO0o(Object obj) {
        this.f4163OooO0Oo = obj;
    }

    @Override // p389o0OOoooO.oo0o0O0
    public final void OooO00o(o0OO0o.OooOOO0 oooOOO0) {
        MainSearchRoomFragment.initView$lambda$0((MainSearchRoomFragment) this.f4163OooO0Oo, oooOOO0);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        VehicleMineActivity this$0 = (VehicleMineActivity) this.f4163OooO0Oo;
        int i2 = VehicleMineActivity.f27033OooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o00O0OOO o00o0ooo2 = this$0.f27035OooOo0;
        if (o00o0ooo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            o00o0ooo2 = null;
        }
        ShopVehicleListModel shopVehicleListModelOooOOO = o00o0ooo2.OooOOO(i);
        if (shopVehicleListModelOooOOO == null || this$0.f27038OooOo0o) {
            return;
        }
        this$0.f27038OooOo0o = true;
        g5 g5Var = new g5(this$0);
        g5Var.OooO00o(new o00O(this$0));
        g5Var.OooOO0(shopVehicleListModelOooOOO.getPicDynamic());
        g5Var.OooO();
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb._init_$lambda$4((Function1) this.f4163OooO0Oo, d);
    }
}
