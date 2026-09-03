package p519o0o0O0oO;

import androidx.lifecycle.Observer;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.ui.dialog.RoomMoraGameListDialog;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class x1 implements Observer<List<Room.RoshamboModel>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomMoraGameListDialog f53205OooO0Oo;

    public x1(RoomMoraGameListDialog roomMoraGameListDialog) {
        this.f53205OooO0Oo = roomMoraGameListDialog;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(List<Room.RoshamboModel> list) {
        List<Room.RoshamboModel> list2 = list;
        if (list2 == null) {
            return;
        }
        RoomMoraGameListDialog roomMoraGameListDialog = this.f53205OooO0Oo;
        roomMoraGameListDialog.f27955OooOO0o.OooOoO0(list2);
        if (list2.isEmpty()) {
            roomMoraGameListDialog.dismiss();
        }
    }
}
