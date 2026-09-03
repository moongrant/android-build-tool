package p442o0OoOoO0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.SubscribeNotifyModel;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.vm.EventSquareViewModel;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p143o00Oo000.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEventSquarePage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventSquarePage.kt\ncom/yalla/yalla/module/event/ui/page/EventSquarePage$EventSquareList$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,404:1\n350#2,7:405\n*S KotlinDebug\n*F\n+ 1 EventSquarePage.kt\ncom/yalla/yalla/module/event/ui/page/EventSquarePage$EventSquareList$4\n*L\n115#1:405,7\n*E\n"})
public final class o00OOOOo implements Observer<SubscribeNotifyModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventSquareViewModel f46217OooO0Oo;

    public o00OOOOo(EventSquareViewModel eventSquareViewModel) {
        this.f46217OooO0Oo = eventSquareViewModel;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(SubscribeNotifyModel subscribeNotifyModel) {
        SubscribeNotifyModel it = subscribeNotifyModel;
        Intrinsics.checkNotNullParameter(it, "it");
        OooO0O0<EventModel> squareEventPager = this.f46217OooO0Oo.getSquareEventPager();
        Iterator<EventModel> it2 = squareEventPager.f37663OooO0Oo.iterator();
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
        EventModel eventModel = squareEventPager.f37663OooO0Oo.get(i);
        eventModel.setEventNumber(it.getSubscribeCount());
        eventModel.setHasSubscribe(it.getHasSubscribe());
    }
}
