package p535o0o0OOOo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.mixedroom.model.TreasureBoxProgressModel;
import com.app.base.model.ChatModel;
import com.app.base.protobuf.room.Room;
import com.jeremyliao.liveeventbus.LiveEventBus;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p160o00OoOO.o000O00O;
import p517o0o0O00.o00O00;
import p532o0o0OOO.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oO00O0oO implements o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public oO00000 f43504OooO00o;

    @Override // p535o0o0OOOo.o
    @NotNull
    public final String OooO00o() {
        return o.OooO00o.OooO00o(this);
    }

    public final void OooO0O0(int i, @Nullable byte[] bArr) {
        o.OooO00o.OooO0O0(this, i, bArr);
        switch (i) {
            case 1000200:
                Room.TreasureBoxNotify from = Room.TreasureBoxNotify.parseFrom(bArr);
                if (from != null) {
                    o00O00.OooO0OO(o.OooO00o.OooO00o(this), "type = " + i + "  data = " + from);
                    o00OO0O0.OooO00o oooO00o = o00OO0O0.f43338OooooOo;
                    Long value = oooO00o.OooO00o().f43344OooO0Oo.getValue();
                    long roomId = from.getRoomId();
                    if (value != null && value.longValue() == roomId) {
                        TreasureBoxProgressModel treasureBoxProgressModel = new TreasureBoxProgressModel(from.getRoomboxTimeId(), from.getRoomboxPercent(), from.getRoomboxLevel());
                        if (!(from.getRoomboxIsOpen() == 1)) {
                            treasureBoxProgressModel.setTimeId(0L);
                        }
                        oooO00o.OooO00o().f43388OoooOOo.postValue(treasureBoxProgressModel);
                    }
                }
                break;
            case 1000201:
                Room.TreasureBoxDrawNotify box = Room.TreasureBoxDrawNotify.parseFrom(bArr);
                if (box != null) {
                    o00O00.OooO0OO(o.OooO00o.OooO00o(this), "type = " + i + "  data = " + box);
                    LiveEventBus.get("ROOM_TREASURE_BOX_OPEN").post(box);
                    oO00000 oo00000 = this.f43504OooO00o;
                    if (oo00000 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("chatMsgProcessor");
                        oo00000 = null;
                    }
                    Objects.requireNonNull(oo00000);
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
