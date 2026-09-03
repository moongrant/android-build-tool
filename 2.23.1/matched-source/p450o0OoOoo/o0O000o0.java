package p450o0OoOoo;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.model.SubscribeNotifyModel;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.module.event.vm.RoomEventInfoViewModel;
import com.yalla.yalla.ui.activity.store.VehicleMineActivity;
import com.yalla.yalla.ui.dialog.RoomMoraGameListDialog;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p188o00o00oO.o000;
import p483o0o000O0.o00Oo0;
import p506o0o00oO0.o0O0o000;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O000o0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47453OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47454OooO0o0;

    public /* synthetic */ o0O000o0(Object obj, int i) {
        this.f47453OooO0Oo = i;
        this.f47454OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        List<ShopVehicleListModel> list;
        int i = this.f47453OooO0Oo;
        boolean z = false;
        Object obj2 = this.f47454OooO0o0;
        switch (i) {
            case 0:
                RoomEventInfoViewModel roomInfoVM = (RoomEventInfoViewModel) obj2;
                SubscribeNotifyModel it = (SubscribeNotifyModel) obj;
                Intrinsics.checkNotNullParameter(roomInfoVM, "$roomInfoVM");
                Intrinsics.checkNotNullParameter(it, "it");
                o000<EventModel> eventInfoPager = roomInfoVM.getEventInfoPager();
                Iterator<EventModel> it2 = eventInfoPager.f38492OooO0Oo.iterator();
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                    } else if (!(it2.next().getId() == it.getEventId())) {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    EventModel eventModel = eventInfoPager.f38492OooO0Oo.get(i2);
                    eventModel.setEventNumber(it.getSubscribeCount());
                    eventModel.setHasSubscribe(it.getHasSubscribe());
                    eventInfoPager.f38492OooO0Oo.set(i2, eventModel.clone());
                    eventInfoPager.OooO0O0();
                    break;
                }
                break;
            case 1:
                VehicleMineActivity this$0 = (VehicleMineActivity) obj2;
                Response response = (Response) obj;
                int i3 = VehicleMineActivity.f26569OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0O0o000 o0o0o000 = null;
                if (response.getIsSuccess() && (list = (List) response.getData()) != null) {
                    for (ShopVehicleListModel shopVehicleListModel : list) {
                        if (shopVehicleListModel.isSelected()) {
                            this$0.f26573OooOo0O = shopVehicleListModel.getShopId();
                        }
                    }
                    o0O0o000 o0o0o001 = this$0.f26571OooOo0;
                    if (o0o0o001 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        o0o0o001 = null;
                    }
                    o0o0o001.OooOoO0(list);
                }
                o0O0o000 o0o0o002 = this$0.f26571OooOo0;
                if (o0o0o002 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                } else {
                    o0o0o000 = o0o0o002;
                }
                o0o0o000.Oooo00o();
                this$0.OooOo().f43756OooO0OO.OooOooo(true, response.getIsSuccess(), response.getNoMoreData());
                this$0.OooOo0();
                break;
            case 2:
                RoomMoraGameListDialog this$1 = (RoomMoraGameListDialog) obj2;
                o00Oo0 it3 = (o00Oo0) obj;
                int i4 = RoomMoraGameListDialog.f27497OooOOO0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(it3, "it");
                XRefreshLayout xRefreshLayout = this$1.f27499OooOO0;
                boolean z2 = it3.f48628OooO0O0;
                if (!z2 && it3.f48629OooO0OO) {
                    z = true;
                }
                xRefreshLayout.OooOooo(z2, true, z);
                break;
            default:
                MainRoomRecommendFragment.onLazyInit$lambda$1((MainRoomRecommendFragment) obj2, (Boolean) obj);
                break;
        }
    }
}
