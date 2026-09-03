package com.yalla.yalla.ui.dialog;

import com.app.base.protobuf.room.Room;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo0 extends p180o00o000.OooO0O0<Room.RoshamboModel> {
    @Override // p180o00o000.OooO0O0
    public final int OooO00o(Room.RoshamboModel roshamboModel) {
        return (roshamboModel.getToUserId() > 0 ? RoomMoraGameListDialog.GuessType.ChallengeGuessing : RoomMoraGameListDialog.GuessType.PublicGuessing).getValue();
    }
}
