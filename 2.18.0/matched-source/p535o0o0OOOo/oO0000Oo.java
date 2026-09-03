package p535o0o0OOOo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.model.ChatModel;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.model.EventModel;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p160o00OoOO.o000O00O;
import p516o0o0O0.OooOO0;
import p517o0o0O00.o00O00;
import p532o0o0OOO.o00OO000;
import p532o0o0OOO.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oO0000Oo implements o {
    @Override // p535o0o0OOOo.o
    @NotNull
    public final String OooO00o() {
        return o.OooO00o.OooO00o(this);
    }

    public final void OooO0O0(int i, @Nullable byte[] bArr) {
        o.OooO00o.OooO0O0(this, i, bArr);
        switch (i) {
            case 1000800:
                Room.EventChange from = Room.EventChange.parseFrom(bArr);
                if (from != null) {
                    o00O00.OooO0OO("RoomEventMsgProcessor", "what = " + i + "  data = " + from);
                    o00OO000 o00oo001 = o00OO000.f43171OooO00o;
                    o00OO000.f43218OoooOOo.setValue(Integer.valueOf(from.getCount()));
                    o00OO0O0.f43338OooooOo.OooO00o().f43395OooooOO.postValue(Boolean.valueOf(from.getIsStart() == 1));
                }
                break;
            case 1000801:
                Room.EventInfoNotify from2 = Room.EventInfoNotify.parseFrom(bArr);
                if (from2 != null) {
                    o00O00.OooO0OO("RoomEventMsgProcessor", "what = " + i + "  data = " + from2);
                    int fState = from2.getFState();
                    EventModel.State.Companion companion = EventModel.State.INSTANCE;
                    if (fState == companion.getNotStarted()) {
                        OooOO0 oooOO1 = OooOO0.f42079OooO00o;
                        LinkedHashSet<Long> linkedHashSet = OooOO0.f42080OooO0O0;
                        if (!linkedHashSet.contains(Long.valueOf(from2.getId()))) {
                            linkedHashSet.add(Long.valueOf(from2.getId()));
                        }
                    } else if (from2.getFState() == companion.getInProgress()) {
                        OooOO0 oooOO2 = OooOO0.f42079OooO00o;
                        LinkedHashSet<Long> linkedHashSet2 = OooOO0.f42081OooO0OO;
                        if (!linkedHashSet2.contains(Long.valueOf(from2.getId()))) {
                            linkedHashSet2.add(Long.valueOf(from2.getId()));
                        }
                    }
                    EventModel eventModel = new EventModel();
                    eventModel.setId(from2.getId());
                    eventModel.setRegion(from2.getRegion());
                    String eventName = from2.getEventName();
                    Intrinsics.checkNotNullExpressionValue(eventName, "it.eventName");
                    eventModel.setEventName(eventName);
                    eventModel.setCreatorUserId(from2.getUserId());
                    eventModel.setEventTagId(from2.getKeyWord());
                    String keyWordText = from2.getKeyWordText();
                    Intrinsics.checkNotNullExpressionValue(keyWordText, "it.keyWordText");
                    eventModel.setEventTag(keyWordText);
                    String keyWordIcon = from2.getKeyWordIcon();
                    Intrinsics.checkNotNullExpressionValue(keyWordIcon, "it.keyWordIcon");
                    eventModel.setEventTagIcon(keyWordIcon);
                    String pic = from2.getPic();
                    Intrinsics.checkNotNullExpressionValue(pic, "it.pic");
                    eventModel.setEventImage(pic);
                    eventModel.setEventStartTime(from2.getStartTime());
                    eventModel.setEventEndTime(from2.getEndTime());
                    eventModel.setEventState(from2.getFState());
                    ChatModel chatModel = new ChatModel();
                    chatModel.eventModel = eventModel;
                    chatModel.type = 26;
                    o000O00O.OooO().OooO00o(chatModel);
                }
                break;
        }
    }
}
