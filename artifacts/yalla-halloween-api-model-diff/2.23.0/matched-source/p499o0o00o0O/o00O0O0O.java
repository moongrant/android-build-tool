package p499o0o00o0O;

import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.store.VehicleMineActivity;
import com.yalla.yalla.ui.fragment.MainExploreFragment;
import com.yalla.yalla.ui.vm.store.VehicleStoreVM;
import kotlin.jvm.internal.Intrinsics;
import p562o0oOo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00O0O0O implements o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49388OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49389OooO0o0;

    public /* synthetic */ o00O0O0O(Object obj, int i) {
        this.f49388OooO0Oo = i;
        this.f49389OooO0o0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        int i = this.f49388OooO0Oo;
        Object obj = this.f49389OooO0o0;
        switch (i) {
            case 0:
                VehicleMineActivity this$0 = (VehicleMineActivity) obj;
                int i2 = VehicleMineActivity.f27033OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                BaseActivityK.OooOo0o(this$0, null, 0L, 3);
                ((VehicleStoreVM) this$0.f27036OooOo00.getValue()).shopVehicleListMine().observe(this$0, new oo0oOO0(this$0));
                break;
            default:
                MainExploreFragment.initView$lambda$4((MainExploreFragment) obj);
                break;
        }
    }
}
