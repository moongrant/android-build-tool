package p450o0OoOoo;

import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.vm.RoomEventInfoViewModel;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.dialog.RoomMoraGameListDialog;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p188o00o00oO.o000;
import p425o0OoO0OO.o0000OO0;
import p565o0oOo000.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O000Oo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47451OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f47452OooO0o0;

    public /* synthetic */ o0O000Oo(Object obj, int i) {
        this.f47451OooO0Oo = i;
        this.f47452OooO0o0 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Object next;
        EventModel eventModel;
        List<EventModel> list;
        int i = this.f47451OooO0Oo;
        boolean z = true;
        Object obj2 = this.f47452OooO0o0;
        switch (i) {
            case 0:
                RoomEventInfoViewModel roomInfoVM = (RoomEventInfoViewModel) obj2;
                long jLongValue = ((Long) obj).longValue();
                Intrinsics.checkNotNullParameter(roomInfoVM, "$roomInfoVM");
                o000<EventModel> eventInfoPager = roomInfoVM.getEventInfoPager();
                Iterator<T> it = eventInfoPager.f38492OooO0Oo.iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                    } else {
                        next = null;
                    }
                    eventModel = (EventModel) next;
                    list = eventInfoPager.f38492OooO0Oo;
                    if (eventModel == null) {
                        list.remove(eventModel);
                        eventInfoPager.OooO0O0();
                        break;
                    }
                } while (!(((EventModel) next).getId() == jLongValue));
                eventModel = (EventModel) next;
                list = eventInfoPager.f38492OooO0Oo;
                if (eventModel == null) {
                    list.remove(eventModel);
                    eventInfoPager.OooO0O0();
                    break;
                }
                break;
            case 1:
                MomentSendActivity this$0 = (MomentSendActivity) obj2;
                int i2 = MomentSendActivity.f25728Oooo0OO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                MomentAdapterTag momentAdapterTag = this$0.OooOoO0().getMomentAdapterTag();
                if (momentAdapterTag != null) {
                    int i3 = MomentSendActivity.OooO0O0.$EnumSwitchMapping$0[momentAdapterTag.ordinal()];
                }
                String strOooO0OO = o0000OO0.OooO0OO(this$0, o000OOo.send_successfully);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                    }
                }
                this$0.finish();
                break;
            default:
                RoomMoraGameListDialog this$1 = (RoomMoraGameListDialog) obj2;
                int iIntValue = ((Integer) obj).intValue();
                int i4 = RoomMoraGameListDialog.f27497OooOOO0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.f27500OooOO0O.setText(o0000.OooO0OO(o000OOo.mora) + ": " + iIntValue);
                break;
        }
    }
}
