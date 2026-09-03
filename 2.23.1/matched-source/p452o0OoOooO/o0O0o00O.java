package p452o0OoOooO;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.module.event.vm.EventRoomPreviewPageViewModel;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p188o00o00oO.o000;
import p506o0o00oO0.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O0o00O implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47549OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47550OooO0o0;

    public /* synthetic */ o0O0o00O(Object obj, int i) {
        this.f47549OooO0Oo = i;
        this.f47550OooO0o0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        o0OO000 o0oo000;
        o0OO000 o0oo001;
        EventModel eventModel;
        List<EventModel> list;
        int i = this.f47549OooO0Oo;
        o0OO000 o0oo002 = null;
        Object obj2 = null;
        Object obj3 = this.f47550OooO0o0;
        switch (i) {
            case 0:
                EventRoomPreviewPageViewModel previewPageVM = (EventRoomPreviewPageViewModel) obj3;
                long jLongValue = ((Long) obj).longValue();
                Intrinsics.checkNotNullParameter(previewPageVM, "$previewPageVM");
                o000<EventModel> eventRoomPreviewPager = previewPageVM.getEventRoomPreviewPager();
                for (Object obj4 : eventRoomPreviewPager.f38492OooO0Oo) {
                    if (((EventModel) obj4).getId() == jLongValue) {
                        obj2 = obj4;
                        eventModel = (EventModel) obj2;
                        list = eventRoomPreviewPager.f38492OooO0Oo;
                        if (eventModel == null) {
                            list.remove(eventModel);
                            previewPageVM.updateTimeDivision(eventRoomPreviewPager.f38492OooO0Oo);
                            eventRoomPreviewPager.OooO0O0();
                            break;
                        }
                    }
                }
                eventModel = (EventModel) obj2;
                list = eventRoomPreviewPager.f38492OooO0Oo;
                if (eventModel == null) {
                    list.remove(eventModel);
                    previewPageVM.updateTimeDivision(eventRoomPreviewPager.f38492OooO0Oo);
                    eventRoomPreviewPager.OooO0O0();
                    break;
                }
                break;
            default:
                VehicleStoreActivity this$0 = (VehicleStoreActivity) obj3;
                Response response = (Response) obj;
                int i2 = VehicleStoreActivity.f26579OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!response.getIsSuccess() || response.getData() == null) {
                    o0oo000 = this$0.f26581OooOo0;
                    if (o0oo000 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        o0oo000 = null;
                    }
                    o0oo000.OooOoO0(null);
                    o0oo001 = this$0.f26581OooOo0;
                    if (o0oo001 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                    } else {
                        o0oo002 = o0oo001;
                    }
                    o0oo002.Oooo00o();
                } else {
                    Object data = response.getData();
                    Intrinsics.checkNotNull(data);
                    if (((List) data).size() > 0) {
                        o0OO000 o0oo003 = this$0.f26581OooOo0;
                        if (o0oo003 != null) {
                            Object data2 = response.getData();
                            Intrinsics.checkNotNull(data2);
                            o0oo003.OooOoO0((List) data2);
                        }
                    } else {
                        o0oo000 = this$0.f26581OooOo0;
                        if (o0oo000 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                            o0oo000 = null;
                        }
                        o0oo000.OooOoO0(null);
                        o0oo001 = this$0.f26581OooOo0;
                        if (o0oo001 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
                        } else {
                            o0oo002 = o0oo001;
                        }
                        o0oo002.Oooo00o();
                    }
                }
                this$0.OooOoO().f43778OooO0Oo.OooOooo(true, response.getIsSuccess(), response.getNoMoreData());
                this$0.OooOo0();
                break;
        }
    }
}
