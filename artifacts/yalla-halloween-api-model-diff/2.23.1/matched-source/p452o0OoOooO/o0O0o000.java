package p452o0OoOooO;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.SubscribeNotifyModel;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.vm.EventRoomPreviewPageViewModel;
import com.yalla.yalla.ui.adapter.Oooo000;
import com.yalla.yalla.ui.adapter.message.MessageModelHeadType;
import com.yalla.yalla.ui.dialog.RoomMoraGameListDialog;
import com.yalla.yalla.ui.fragment.message.MessageBoxFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p188o00o00oO.o000;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O0o000 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47547OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47548OooO0o0;

    public /* synthetic */ o0O0o000(Object obj, int i) {
        this.f47547OooO0Oo = i;
        this.f47548OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f47547OooO0Oo;
        Object obj2 = this.f47548OooO0o0;
        switch (i) {
            case 0:
                EventRoomPreviewPageViewModel previewPageVM = (EventRoomPreviewPageViewModel) obj2;
                SubscribeNotifyModel it = (SubscribeNotifyModel) obj;
                Intrinsics.checkNotNullParameter(previewPageVM, "$previewPageVM");
                Intrinsics.checkNotNullParameter(it, "it");
                o000<EventModel> eventRoomPreviewPager = previewPageVM.getEventRoomPreviewPager();
                Iterator<EventModel> it2 = eventRoomPreviewPager.f38492OooO0Oo.iterator();
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                    } else if (!(it2.next().getId() == it.getEventId())) {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    EventModel eventModel = eventRoomPreviewPager.f38492OooO0Oo.get(i2);
                    eventModel.setEventNumber(it.getSubscribeCount());
                    eventModel.setHasSubscribe(it.getHasSubscribe());
                    eventRoomPreviewPager.f38492OooO0Oo.set(i2, eventModel.clone());
                    previewPageVM.updateTimeDivision(eventRoomPreviewPager.f38492OooO0Oo);
                    eventRoomPreviewPager.OooO0O0();
                    break;
                }
                break;
            case 1:
                RoomMoraGameListDialog this$0 = (RoomMoraGameListDialog) obj2;
                List it3 = (List) obj;
                int i3 = RoomMoraGameListDialog.f27497OooOOO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it3, "it");
                if (!it3.isEmpty()) {
                    this$0.f27501OooOO0o.notifyDataSetChanged();
                }
                break;
            default:
                MessageBoxFragment this$1 = (MessageBoxFragment) obj2;
                Integer num = (Integer) obj;
                int i4 = MessageBoxFragment.f28004OooOo00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Oooo000 oooo000 = this$1.f28006OooOOOo;
                if (oooo000 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
                    oooo000 = null;
                }
                oooo000.Oooo0o(MessageModelHeadType.TypeSystem, num != null ? num.intValue() : 0);
                break;
        }
    }
}
