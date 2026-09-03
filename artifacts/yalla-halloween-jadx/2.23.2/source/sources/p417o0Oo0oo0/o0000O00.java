package p417o0Oo0oo0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.SubscribeNotifyModel;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.vm.EventRoomPreviewPageViewModel;
import com.yalla.yalla.ui.dialog.RoomMoraGameListDialog;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p188o00o00oO.o000;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000O00 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f46551OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f46552OooO0o0;

    public /* synthetic */ o0000O00(Object obj, int i) {
        this.f46551OooO0Oo = i;
        this.f46552OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f46551OooO0Oo;
        Object obj2 = this.f46552OooO0o0;
        switch (i) {
            case 1:
                EventRoomPreviewPageViewModel previewPageVM = (EventRoomPreviewPageViewModel) obj2;
                SubscribeNotifyModel it = (SubscribeNotifyModel) obj;
                Intrinsics.checkNotNullParameter(previewPageVM, "$previewPageVM");
                Intrinsics.checkNotNullParameter(it, "it");
                o000<EventModel> eventRoomPreviewPager = previewPageVM.getEventRoomPreviewPager();
                Iterator<EventModel> it2 = eventRoomPreviewPager.f38497OooO0Oo.iterator();
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                    } else if (!(it2.next().getId() == it.getEventId())) {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    EventModel eventModel = eventRoomPreviewPager.f38497OooO0Oo.get(i2);
                    eventModel.setEventNumber(it.getSubscribeCount());
                    eventModel.setHasSubscribe(it.getHasSubscribe());
                    eventRoomPreviewPager.f38497OooO0Oo.set(i2, eventModel.clone());
                    previewPageVM.updateTimeDivision(eventRoomPreviewPager.f38497OooO0Oo);
                    eventRoomPreviewPager.OooO0O0();
                    break;
                }
                break;
            default:
                RoomMoraGameListDialog this$0 = (RoomMoraGameListDialog) obj2;
                List list = (List) obj;
                int i3 = RoomMoraGameListDialog.f27488OooOOO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (list != null) {
                    this$0.f27492OooOO0o.OooOoO0(list);
                    if (list.isEmpty()) {
                        this$0.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
