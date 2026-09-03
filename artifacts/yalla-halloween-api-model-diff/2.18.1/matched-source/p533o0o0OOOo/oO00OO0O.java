package p533o0o0OOOo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.mixedroom.model.TreasureBoxProgressModel;
import com.app.base.model.ChatModel;
import com.app.base.protobuf.room.Room;
import com.jeremyliao.liveeventbus.LiveEventBus;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159o00OoOO.o000O00O;
import p515o0o0O00.o00O00;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oO00OO0O implements oO00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public oO00000o f43499OooO00o;

    @Override // p533o0o0OOOo.oO00000
    @NotNull
    public final String OooO00o() {
        return oO00000.OooO00o.OooO00o(this);
    }

    public final void OooO0O0(int i, @Nullable byte[] bArr) {
        oO00000.OooO00o.OooO0O0(this, i, bArr);
        switch (i) {
            case 1000200:
                Room.TreasureBoxNotify from = Room.TreasureBoxNotify.parseFrom(bArr);
                if (from != null) {
                    o00O00.OooO0OO(oO00000.OooO00o.OooO00o(this), "type = " + i + "  data = " + from);
                    o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
                    Long value = oooO00o.OooO00o().f43319OooO0Oo.getValue();
                    long roomId = from.getRoomId();
                    if (value != null && value.longValue() == roomId) {
                        TreasureBoxProgressModel treasureBoxProgressModel = new TreasureBoxProgressModel(from.getRoomboxTimeId(), from.getRoomboxPercent(), from.getRoomboxLevel());
                        if (!(from.getRoomboxIsOpen() == 1)) {
                            treasureBoxProgressModel.setTimeId(0L);
                        }
                        oooO00o.OooO00o().f43363OoooOOo.postValue(treasureBoxProgressModel);
                    }
                }
                break;
            case 1000201:
                Room.TreasureBoxDrawNotify box = Room.TreasureBoxDrawNotify.parseFrom(bArr);
                if (box != null) {
                    o00O00.OooO0OO(oO00000.OooO00o.OooO00o(this), "type = " + i + "  data = " + box);
                    LiveEventBus.get("ROOM_TREASURE_BOX_OPEN").post(box);
                    oO00000o oo00000o = this.f43499OooO00o;
                    if (oo00000o == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("chatMsgProcessor");
                        oo00000o = null;
                    }
                    Objects.requireNonNull(oo00000o);
                    Intrinsics.checkNotNullParameter(box, "box");
                    ChatModel chatModel = new ChatModel();
                    chatModel.type = 24;
                    ChatModel.TreasureBoxShow treasureBoxShow = new ChatModel.TreasureBoxShow();
                    treasureBoxShow.treasureBox = box.getAwardUsersList();
                    treasureBoxShow.level = box.getRoomboxLevel();
                    chatModel.treasureBoxInfo = treasureBoxShow;
                    o000O00O.OooO().OooO00o(chatModel);
                }
                break;
        }
    }
}
