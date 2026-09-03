package p540o0o0Oo0;

import OooO00o.OooO00o;
import android.view.View;
import com.android.billingclient.api.o00000O;
import com.app.base.model.RoomItemInfoModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.LockShopModel;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import com.yalla.yalla.ui.activity.room.RoomSettingActivity;
import com.yalla.yalla.ui.fragment.ExploreCountryRoomListFragment;
import com.yalla.yalla.ui.view.MomentDetailForwardView;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p167o00OoOoo.o0O00O0o;
import p175o00OooOO.o0O00OOO;
import p187o00o00Oo.o0ooOOo;
import p256o00ooO0o.oo0oOO0;
import p500o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0o0Oo implements BaseQuickAdapter.OooOOOO, o0ooOOo, o0O00OOO.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f44079Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f44080OoooO00;

    public /* synthetic */ o0o0Oo(Object obj, int i) {
        this.f44079Oooo = i;
        this.f44080OoooO00 = obj;
    }

    @Override // o00OooOO.o0O00OOO.OooO00o
    public final void OooO00o() {
        MomentDetailForwardView this$0 = (MomentDetailForwardView) this.f44080OoooO00;
        int i = MomentDetailForwardView.f24899OoooO0O;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Objects.requireNonNull(this$0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.LockShopModel$LockShopModelItem>] */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOOO
    public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        switch (this.f44079Oooo) {
            case 0:
                PurchaseLockRoomActivity this$0 = (PurchaseLockRoomActivity) this.f44080OoooO00;
                PurchaseLockRoomActivity.OooO00o oooO00o = PurchaseLockRoomActivity.f22524Oooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0O00O0o o0o00o0oOooO0O0 = o00000O.OooO0O0();
                StringBuilder sbOooO0O0 = OooO00o.OooO0O0("HAS_ROOM");
                sbOooO0O0.append(OooOOO.f41235OooO00o.OooOo().getValue());
                if (o0o00o0oOooO0O0.OooO0Oo(sbOooO0O0.toString(), false)) {
                    LockShopModel.LockShopModelItem lockShopModelItem = (LockShopModel.LockShopModelItem) this$0.f22528Oooooo0.get(i);
                    oo0oOO0 oo0ooo0 = new oo0oOO0(this$0);
                    oo0ooo0.OooOo0(R.string.purchase_roomlock);
                    oo0ooo0.OooOoOO(true);
                    oo0ooo0.OooOo0o(new o0oOO(this$0, lockShopModelItem));
                    oo0ooo0.OooOOO0();
                    break;
                }
                break;
            default:
                RoomSettingActivity this$1 = (RoomSettingActivity) this.f44080OoooO00;
                RoomSettingActivity.OooO00o oooO00o2 = RoomSettingActivity.f22988oo000o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.Oooo000((RoomItemInfoModel) this$1.f22990OooooOO.get(i), i);
                break;
        }
    }

    @Override // p187o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        ExploreCountryRoomListFragment.m323initView$lambda0((ExploreCountryRoomListFragment) this.f44080OoooO00);
    }
}
