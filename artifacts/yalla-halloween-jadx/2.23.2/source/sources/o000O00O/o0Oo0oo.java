package o000O00O;

import android.view.View;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Player;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.fragment.message.MessageListFragment;
import kotlin.jvm.internal.Intrinsics;
import p505o0o00oOO.o0OOOO0o;
import p505o0o00oOO.o0o0000;
import p650o0ooo.h5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0Oo0oo implements o000OoO.o00000O0.OooO00o, BaseQuickAdapter.OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f34144OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34145OooO0o0;

    public /* synthetic */ o0Oo0oo(Object obj, int i) {
        this.f34144OooO0Oo = i;
        this.f34145OooO0o0 = obj;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = this.f34144OooO0Oo;
        Object obj = this.f34145OooO0o0;
        switch (i2) {
            case 2:
                VehicleStoreActivity this$0 = (VehicleStoreActivity) obj;
                int i3 = VehicleStoreActivity.f26578OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0OOOO0o o0oooo0o2 = this$0.f26580OooOo0;
                if (o0oooo0o2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    o0oooo0o2 = null;
                }
                ShopVehicleListModel shopVehicleListModelOooOOO = o0oooo0o2.OooOOO(i);
                if (shopVehicleListModelOooOOO != null && !this$0.f26583OooOo0o) {
                    this$0.f26583OooOo0o = true;
                    h5 h5Var = new h5(this$0);
                    h5Var.OooO00o(new o0o0000(this$0));
                    h5Var.OooOO0(shopVehicleListModelOooOOO.getPicDynamic());
                    h5Var.OooO();
                    break;
                }
                break;
            default:
                MessageListFragment.initView$lambda$1((MessageListFragment) obj, baseQuickAdapter, view, i);
                break;
        }
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        int i = this.f34144OooO0Oo;
        Object obj2 = this.f34145OooO0o0;
        switch (i) {
            case 0:
                ((Player.OooO0OO) obj).onMediaMetadataChanged((MediaMetadata) obj2);
                return;
            default:
                ((androidx.media3.session.o000OO0O.OooO0OO) obj2).getClass();
                throw null;
        }
    }
}
