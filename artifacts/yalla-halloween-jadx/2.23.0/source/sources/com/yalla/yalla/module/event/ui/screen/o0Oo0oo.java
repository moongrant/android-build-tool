package com.yalla.yalla.module.event.ui.screen;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.vm.EventRoomPreviewPageViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEventRoomPreviewScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventRoomPreviewScreen.kt\ncom/yalla/yalla/module/event/ui/screen/EventRoomPreviewScreen$Content$3$1$2$1$1$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n1#2:373\n*E\n"})
public final class o0Oo0oo implements Observer<Long> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventRoomPreviewPageViewModel f23975OooO0Oo;

    public o0Oo0oo(EventRoomPreviewPageViewModel eventRoomPreviewPageViewModel) {
        this.f23975OooO0Oo = eventRoomPreviewPageViewModel;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Long l) {
        Object next;
        long jLongValue = l.longValue();
        EventRoomPreviewPageViewModel eventRoomPreviewPageViewModel = this.f23975OooO0Oo;
        p143o00Oo000.OooO0O0<EventModel> eventRoomPreviewPager = eventRoomPreviewPageViewModel.getEventRoomPreviewPager();
        Iterator<T> it = eventRoomPreviewPager.f37663OooO0Oo.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((EventModel) next).getId() == jLongValue));
        EventModel eventModel = (EventModel) next;
        List<EventModel> list = eventRoomPreviewPager.f37663OooO0Oo;
        if (eventModel == null) {
            return;
        }
        list.remove(eventModel);
        eventRoomPreviewPageViewModel.updateTimeDivision(eventRoomPreviewPager.f37663OooO0Oo);
        eventRoomPreviewPager.OooO0O0();
    }
}
