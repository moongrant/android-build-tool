package p450o0OoOooO;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.module.event.vm.EventRoomPreviewPageViewModel;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.adapter.Oooo000;
import com.yalla.yalla.ui.adapter.message.MessageModelHeadType;
import com.yalla.yalla.ui.dialog.RoomMoraGameListDialog;
import com.yalla.yalla.ui.fragment.message.MessageBoxFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p188o00o00oO.o000;
import p505o0o00oOO.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oo0OOoo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47559OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47560OooO0o0;

    public /* synthetic */ oo0OOoo(Object obj, int i) {
        this.f47559OooO0Oo = i;
        this.f47560OooO0o0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        EventModel eventModel;
        List<EventModel> list;
        o0OOOO0o o0oooo0o2;
        o0OOOO0o o0oooo0o3;
        int i = this.f47559OooO0Oo;
        Oooo000 oooo000 = null;
        o0OOOO0o o0oooo0o4 = null;
        Object obj2 = null;
        Object obj3 = this.f47560OooO0o0;
        switch (i) {
            case 0:
                EventRoomPreviewPageViewModel previewPageVM = (EventRoomPreviewPageViewModel) obj3;
                long jLongValue = ((Long) obj).longValue();
                Intrinsics.checkNotNullParameter(previewPageVM, "$previewPageVM");
                o000<EventModel> eventRoomPreviewPager = previewPageVM.getEventRoomPreviewPager();
                for (Object obj4 : eventRoomPreviewPager.f38497OooO0Oo) {
                    if ((((EventModel) obj4).getId() == jLongValue) != false) {
                        obj2 = obj4;
                        eventModel = (EventModel) obj2;
                        list = eventRoomPreviewPager.f38497OooO0Oo;
                        if (eventModel == null) {
                            list.remove(eventModel);
                            previewPageVM.updateTimeDivision(eventRoomPreviewPager.f38497OooO0Oo);
                            eventRoomPreviewPager.OooO0O0();
                            break;
                        }
                    }
                }
                eventModel = (EventModel) obj2;
                list = eventRoomPreviewPager.f38497OooO0Oo;
                if (eventModel == null) {
                    list.remove(eventModel);
                    previewPageVM.updateTimeDivision(eventRoomPreviewPager.f38497OooO0Oo);
                    eventRoomPreviewPager.OooO0O0();
                    break;
                }
                break;
            case 1:
                VehicleStoreActivity this$0 = (VehicleStoreActivity) obj3;
                Response response = (Response) obj;
                int i2 = VehicleStoreActivity.f26578OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!response.getIsSuccess() || response.getData() == null) {
                    o0oooo0o2 = this$0.f26580OooOo0;
                    if (o0oooo0o2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        o0oooo0o2 = null;
                    }
                    o0oooo0o2.OooOoO0(null);
                    o0oooo0o3 = this$0.f26580OooOo0;
                    if (o0oooo0o3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    } else {
                        o0oooo0o4 = o0oooo0o3;
                    }
                    o0oooo0o4.Oooo00o();
                } else {
                    Object data = response.getData();
                    Intrinsics.checkNotNull(data);
                    if (((List) data).size() > 0) {
                        o0OOOO0o o0oooo0o5 = this$0.f26580OooOo0;
                        if (o0oooo0o5 != null) {
                            Object data2 = response.getData();
                            Intrinsics.checkNotNull(data2);
                            o0oooo0o5.OooOoO0((List) data2);
                        }
                    } else {
                        o0oooo0o2 = this$0.f26580OooOo0;
                        if (o0oooo0o2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                            o0oooo0o2 = null;
                        }
                        o0oooo0o2.OooOoO0(null);
                        o0oooo0o3 = this$0.f26580OooOo0;
                        if (o0oooo0o3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        } else {
                            o0oooo0o4 = o0oooo0o3;
                        }
                        o0oooo0o4.Oooo00o();
                    }
                }
                this$0.OooOoO().f43760OooO0Oo.OooOooo(true, response.getIsSuccess(), response.getNoMoreData());
                this$0.OooOo0();
                break;
            case 2:
                RoomMoraGameListDialog this$1 = (RoomMoraGameListDialog) obj3;
                List it = (List) obj;
                int i3 = RoomMoraGameListDialog.f27488OooOOO0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (!it.isEmpty()) {
                    this$1.f27492OooOO0o.notifyDataSetChanged();
                }
                break;
            default:
                MessageBoxFragment this$2 = (MessageBoxFragment) obj3;
                Integer num = (Integer) obj;
                int i4 = MessageBoxFragment.f27995OooOo00;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                Oooo000 oooo001 = this$2.f27997OooOOOo;
                if (oooo001 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
                } else {
                    oooo000 = oooo001;
                }
                oooo000.Oooo0o(MessageModelHeadType.TypeSystem, num != null ? num.intValue() : 0);
                break;
        }
    }
}
