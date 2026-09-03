package com.yalla.yalla.ui.dialog;

import com.app.base.protobuf.room.Room;
import p670oOooo0o.o0000Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class o000oOoO extends o0000Ooo<Room.RoshamboModel> {
    @Override // p670oOooo0o.o0000Ooo
    public final int OooO00o(Room.RoshamboModel roshamboModel) {
        return (roshamboModel.getToUserId() > 0 ? RoomMoraGameListDialog.GuessType.ChallengeGuessing : RoomMoraGameListDialog.GuessType.PublicGuessing).getValue();
    }
}
