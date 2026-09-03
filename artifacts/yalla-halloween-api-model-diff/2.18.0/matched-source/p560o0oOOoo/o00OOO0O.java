package p560o0oOOoo;

import androidx.lifecycle.Observer;
import androidx.paging.compose.OooO0OO;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.protobuf.room.Room;
import com.app.base.view.dialog.RoomMoraGameListDialog;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.SubscribeNotifyModel;
import com.yalla.yalla.ui.vm.event.EventMineViewModel;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import p100o000oOoO.o0O00O;
import p581o0oOoOOo.x;
import p632o0ooO00.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00OOO0O implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ int f44746OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Object f44747OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Object f44748OooO0OO;

    public /* synthetic */ o00OOO0O(Object obj, Object obj2, int i) {
        this.f44746OooO00o = i;
        this.f44747OooO0O0 = obj;
        this.f44748OooO0OO = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<T>] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList, java.util.List<T>] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Object next;
        EventModel eventModel;
        ?? r9;
        switch (this.f44746OooO00o) {
            case 0:
                MixedRoomActivity mixedRoomActivity = (MixedRoomActivity) this.f44747OooO0O0;
                o0O00O moraGameListDialog$delegate = (o0O00O) this.f44748OooO0OO;
                Room.MoraStartPkRequestReply moraStartPkRequestReply = (Room.MoraStartPkRequestReply) obj;
                Intrinsics.checkNotNullParameter(moraGameListDialog$delegate, "$moraGameListDialog$delegate");
                if (mixedRoomActivity != null) {
                    Intrinsics.checkNotNull(moraStartPkRequestReply, "null cannot be cast to non-null type com.app.base.protobuf.room.Room.MoraStartPkRequestReply");
                    new x(mixedRoomActivity, moraStartPkRequestReply).show();
                    RoomMoraGameListDialog roomMoraGameListDialog = (RoomMoraGameListDialog) moraGameListDialog$delegate.getValue();
                    if (roomMoraGameListDialog != null && roomMoraGameListDialog.isShowing()) {
                        roomMoraGameListDialog.dismiss();
                        break;
                    }
                }
                break;
            default:
                OooO0OO lazyPagingItems = (OooO0OO) this.f44747OooO0O0;
                EventMineViewModel mineVM = (EventMineViewModel) this.f44748OooO0OO;
                SubscribeNotifyModel subscribeNotifyModel = (SubscribeNotifyModel) obj;
                Intrinsics.checkNotNullParameter(lazyPagingItems, "$lazyPagingItems");
                Intrinsics.checkNotNullParameter(mineVM, "$mineVM");
                if (!subscribeNotifyModel.getHasSubscribe()) {
                    o000O0Oo<EventModel> mineEventPager = mineVM.getMineEventPager();
                    Iterator it = mineEventPager.f48702OooO0Oo.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        eventModel = (EventModel) next;
                        r9 = mineEventPager.f48702OooO0Oo;
                        if (eventModel == null) {
                            r9.remove(eventModel);
                            mineEventPager.OooO0O0();
                            break;
                        }
                    } while (!(((EventModel) next).getId() == subscribeNotifyModel.getEventId()));
                    eventModel = (EventModel) next;
                    r9 = mineEventPager.f48702OooO0Oo;
                    if (eventModel == null) {
                        r9.remove(eventModel);
                        mineEventPager.OooO0O0();
                        break;
                    }
                } else {
                    lazyPagingItems.OooO0o();
                    break;
                }
                break;
        }
    }
}
