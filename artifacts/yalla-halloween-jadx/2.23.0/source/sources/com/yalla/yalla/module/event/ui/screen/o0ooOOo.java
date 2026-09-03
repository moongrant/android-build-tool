package com.yalla.yalla.module.event.ui.screen;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.SubscribeNotifyModel;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.vm.EventRoomPreviewPageViewModel;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEventRoomPreviewScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventRoomPreviewScreen.kt\ncom/yalla/yalla/module/event/ui/screen/EventRoomPreviewScreen$Content$3$1$2$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,372:1\n350#2,7:373\n*S KotlinDebug\n*F\n+ 1 EventRoomPreviewScreen.kt\ncom/yalla/yalla/module/event/ui/screen/EventRoomPreviewScreen$Content$3$1$2$1$1$1\n*L\n151#1:373,7\n*E\n"})
public final class o0ooOOo implements Observer<SubscribeNotifyModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventRoomPreviewPageViewModel f23980OooO0Oo;

    public o0ooOOo(EventRoomPreviewPageViewModel eventRoomPreviewPageViewModel) {
        this.f23980OooO0Oo = eventRoomPreviewPageViewModel;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(SubscribeNotifyModel subscribeNotifyModel) {
        SubscribeNotifyModel it = subscribeNotifyModel;
        Intrinsics.checkNotNullParameter(it, "it");
        EventRoomPreviewPageViewModel eventRoomPreviewPageViewModel = this.f23980OooO0Oo;
        p143o00Oo000.OooO0O0<EventModel> eventRoomPreviewPager = eventRoomPreviewPageViewModel.getEventRoomPreviewPager();
        Iterator<EventModel> it2 = eventRoomPreviewPager.f37663OooO0Oo.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else {
                if (it2.next().getId() == it.getEventId()) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (i < 0) {
            return;
        }
        EventModel eventModel = eventRoomPreviewPager.f37663OooO0Oo.get(i);
        eventModel.setEventNumber(it.getSubscribeCount());
        eventModel.setHasSubscribe(it.getHasSubscribe());
        eventRoomPreviewPager.f37663OooO0Oo.set(i, eventModel.clone());
        eventRoomPreviewPageViewModel.updateTimeDivision(eventRoomPreviewPager.f37663OooO0Oo);
        eventRoomPreviewPager.OooO0O0();
    }
}
