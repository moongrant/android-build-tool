package p448o0OoOoo;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.vm.EventMineViewModel;
import com.yalla.yalla.ui.dialog.RoomGameBoxDialog;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p188o00o00oO.o000;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o00oOoo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47443OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47444OooO0o0;

    public /* synthetic */ o00oOoo(Object obj, int i) {
        this.f47443OooO0Oo = i;
        this.f47444OooO0o0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Object next;
        EventModel eventModel;
        List<EventModel> list;
        int i = this.f47443OooO0Oo;
        Object obj2 = this.f47444OooO0o0;
        switch (i) {
            case 0:
                EventMineViewModel mineVM = (EventMineViewModel) obj2;
                long jLongValue = ((Long) obj).longValue();
                Intrinsics.checkNotNullParameter(mineVM, "$mineVM");
                o000<EventModel> mineEventPager = mineVM.getMineEventPager();
                Iterator<T> it = mineEventPager.f38497OooO0Oo.iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                    } else {
                        next = null;
                    }
                    eventModel = (EventModel) next;
                    list = mineEventPager.f38497OooO0Oo;
                    if (eventModel == null) {
                        list.remove(eventModel);
                        mineEventPager.OooO0O0();
                        break;
                    }
                } while (!(((EventModel) next).getId() == jLongValue));
                eventModel = (EventModel) next;
                list = mineEventPager.f38497OooO0Oo;
                if (eventModel == null) {
                    list.remove(eventModel);
                    mineEventPager.OooO0O0();
                    break;
                }
                break;
            default:
                RoomGameBoxDialog this$0 = (RoomGameBoxDialog) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOOO0(true, RoomGameBoxDialog.GameType.GameMora);
                break;
        }
    }
}
