package p176o00OoooO;

import com.app.base.protobuf.room.Room;
import com.app.base.view.dialog.RoomMoraGameListDialog;
import p248o00oo0o.o000000O;

/* JADX INFO: loaded from: classes.dex */
public final class oO0O0OoO extends o000000O<Room.RoshamboModel> {
    @Override // p248o00oo0o.o000000O
    public final int OooO00o(Room.RoshamboModel roshamboModel) {
        return (roshamboModel.getToUserId() > 0 ? RoomMoraGameListDialog.GuessType.ChallengeGuessing : RoomMoraGameListDialog.GuessType.PublicGuessing).getValue();
    }
}
