package com.yalla.yalla.service.room.processor;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.room.RoomTreasureBox;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.mixedroom.model.TreasureBoxProgressModel;
import com.yalla.yalla.model.chat.ChatModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOo00 implements OooO00o {
    @Override // com.yalla.yalla.service.room.processor.OooO00o
    @NotNull
    public final String OooO00o() {
        return OooO00o.C0318OooO00o.OooO00o(this);
    }

    public final void OooO0O0(int i, @Nullable Object obj) {
        OooO00o.C0318OooO00o.OooO0O0(this, i, obj);
        switch (i) {
            case 1000200:
                RoomTreasureBox.TreasureBoxNotify from = RoomTreasureBox.TreasureBoxNotify.parseFrom((byte[]) obj);
                if (from != null) {
                    p597o0oo00O.OooOOOO.OooO0OO(OooO00o.C0318OooO00o.OooO00o(this), "type = " + i + "  data = " + from);
                    com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO;
                    Long value = oooO00o.OooO00o().f24547OooO0Oo.getValue();
                    long roomId = from.getRoomId();
                    if (value != null && value.longValue() == roomId) {
                        TreasureBoxProgressModel treasureBoxProgressModel = new TreasureBoxProgressModel(from.getRoomboxTimeId(), from.getRoomboxPercent(), from.getRoomboxLevel());
                        if (!(from.getRoomboxIsOpen() == 1)) {
                            treasureBoxProgressModel.setTimeId(0L);
                        }
                        oooO00o.OooO00o().f24584Oooo0oo.postValue(treasureBoxProgressModel);
                    }
                }
                break;
            case 1000201:
                RoomTreasureBox.TreasureBoxDrawNotify box = RoomTreasureBox.TreasureBoxDrawNotify.parseFrom((byte[]) obj);
                if (box != null) {
                    p597o0oo00O.OooOOOO.OooO0OO(OooO00o.C0318OooO00o.OooO00o(this), "type = " + i + "  data = " + box);
                    LiveEventBus.get("ROOM_TREASURE_BOX_OPEN").post(box);
                    Intrinsics.checkNotNullParameter(box, "box");
                    ChatModel chatModel = new ChatModel();
                    chatModel.setType(24);
                    ChatModel.TreasureBoxShow treasureBoxShow = new ChatModel.TreasureBoxShow();
                    treasureBoxShow.setTreasureBox(box.getAwardUsersList());
                    treasureBoxShow.setLevel(box.getRoomboxLevel());
                    chatModel.setTreasureBoxInfo(treasureBoxShow);
                    MixedRoomDataSource.OooO0o0().OooO00o(chatModel);
                }
                break;
        }
    }
}
