package p448o0OoOoo;

import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.model.SubscribeNotifyModel;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.module.event.vm.RoomEventInfoViewModel;
import com.yalla.yalla.ui.activity.store.VehicleMineActivity;
import com.yalla.yalla.ui.dialog.RoomMoraGameListDialog;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p188o00o00oO.o000;
import p505o0o00oOO.o0OO0oO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O000o0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47456OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47457OooO0o0;

    public /* synthetic */ o0O000o0(Object obj, int i) {
        this.f47456OooO0Oo = i;
        this.f47457OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        List<ShopVehicleListModel> list;
        int i = this.f47456OooO0Oo;
        Object obj2 = this.f47457OooO0o0;
        switch (i) {
            case 0:
                RoomEventInfoViewModel roomInfoVM = (RoomEventInfoViewModel) obj2;
                SubscribeNotifyModel it = (SubscribeNotifyModel) obj;
                Intrinsics.checkNotNullParameter(roomInfoVM, "$roomInfoVM");
                Intrinsics.checkNotNullParameter(it, "it");
                o000<EventModel> eventInfoPager = roomInfoVM.getEventInfoPager();
                Iterator<EventModel> it2 = eventInfoPager.f38497OooO0Oo.iterator();
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                    } else if (!(it2.next().getId() == it.getEventId())) {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    EventModel eventModel = eventInfoPager.f38497OooO0Oo.get(i2);
                    eventModel.setEventNumber(it.getSubscribeCount());
                    eventModel.setHasSubscribe(it.getHasSubscribe());
                    eventInfoPager.f38497OooO0Oo.set(i2, eventModel.clone());
                    eventInfoPager.OooO0O0();
                    break;
                }
                break;
            case 1:
                VehicleMineActivity this$0 = (VehicleMineActivity) obj2;
                Response response = (Response) obj;
                int i3 = VehicleMineActivity.f26568OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o0OO0oO0 o0oo0oo1 = null;
                if (response.getIsSuccess() && (list = (List) response.getData()) != null) {
                    for (ShopVehicleListModel shopVehicleListModel : list) {
                        if (shopVehicleListModel.isSelected()) {
                            this$0.f26572OooOo0O = shopVehicleListModel.getShopId();
                        }
                    }
                    o0OO0oO0 o0oo0oo2 = this$0.f26570OooOo0;
                    if (o0oo0oo2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        o0oo0oo2 = null;
                    }
                    o0oo0oo2.OooOoO0(list);
                }
                o0OO0oO0 o0oo0oo3 = this$0.f26570OooOo0;
                if (o0oo0oo3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                } else {
                    o0oo0oo1 = o0oo0oo3;
                }
                o0oo0oo1.Oooo00o();
                this$0.OooOo().f43738OooO0OO.OooOooo(true, response.getIsSuccess(), response.getNoMoreData());
                this$0.OooOo0();
                break;
            default:
                RoomMoraGameListDialog this$1 = (RoomMoraGameListDialog) obj2;
                int iIntValue = ((Integer) obj).intValue();
                int i4 = RoomMoraGameListDialog.f27488OooOOO0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.f27491OooOO0O.setText(o0000.OooO0OO(o000000.mora) + ": " + iIntValue);
                break;
        }
    }
}
