package p442o0OoOoO0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.vm.EventSquareViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import p143o00Oo000.OooO0O0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nEventSquarePage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventSquarePage.kt\ncom/yalla/yalla/module/event/ui/page/EventSquarePage$EventSquareList$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,404:1\n1#2:405\n*E\n"})
public final class o00OOOO0 implements Observer<Long> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventSquareViewModel f46216OooO0Oo;

    public o00OOOO0(EventSquareViewModel eventSquareViewModel) {
        this.f46216OooO0Oo = eventSquareViewModel;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Long l) {
        Object next;
        long jLongValue = l.longValue();
        OooO0O0<EventModel> squareEventPager = this.f46216OooO0Oo.getSquareEventPager();
        Iterator<T> it = squareEventPager.f37663OooO0Oo.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((EventModel) next).getId() == jLongValue));
        EventModel eventModel = (EventModel) next;
        List<EventModel> list = squareEventPager.f37663OooO0Oo;
        if (eventModel == null) {
            return;
        }
        list.remove(eventModel);
        squareEventPager.OooO0O0();
    }
}
