package com.yalla.yalla.service.room.processor;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.event.EventModel;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402o0Oo0OOO.o000OO00;
import p403o0Oo0OOo.o0OO00o0;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooO0OO implements OooO00o {
    @Override // com.yalla.yalla.service.room.processor.OooO00o
    @NotNull
    public final String OooO00o() {
        return OooO00o.C0319OooO00o.OooO00o(this);
    }

    public final void OooO0O0(int i, @Nullable Object obj) {
        OooO00o.C0319OooO00o.OooO0O0(this, i, obj);
        switch (i) {
            case 1000800:
                Room.EventChange from = Room.EventChange.parseFrom((byte[]) obj);
                if (from != null) {
                    p592o0oo00O.OooOOO0.OooO0OO("RoomEventMsgProcessor", "what = " + i + "  data = " + from);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p477o0o000O.OooOO0O(from, null), 3, null);
                }
                break;
            case 1000801:
                Room.EventInfoNotify from2 = Room.EventInfoNotify.parseFrom((byte[]) obj);
                if (from2 != null) {
                    p592o0oo00O.OooOOO0.OooO0OO("RoomEventMsgProcessor", "what = " + i + "  data = " + from2);
                    long id = from2.getId();
                    StringBuilder sb = new StringBuilder("hideEvent hasEvent ");
                    sb.append(id);
                    p592o0oo00O.OooOOO0.OooO0O0(sb.toString());
                    long id2 = from2.getId();
                    o0OO00o0 o0oo00o0OooOo0O = o000OOo.OooO00o().OooOo0O();
                    o000000O o000000o2 = o000000O.f46674OooO00o;
                    if (!(o0oo00o0OooOo0O.OooO0O0(3, ((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue(), String.valueOf(id2)) != null)) {
                        int fState = from2.getFState();
                        EventModel.State.Companion companion = EventModel.State.INSTANCE;
                        if (fState == companion.getNotStarted()) {
                            LinkedHashSet<Long> linkedHashSet = o000OO00.f44464OooO00o;
                            if (!linkedHashSet.contains(Long.valueOf(from2.getId()))) {
                                linkedHashSet.add(Long.valueOf(from2.getId()));
                            }
                        } else if (from2.getFState() == companion.getInProgress()) {
                            LinkedHashSet<Long> linkedHashSet2 = o000OO00.f44465OooO0O0;
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
                        chatModel.setEventModel(eventModel);
                        chatModel.setType(26);
                        MixedRoomDataSource.OooO0o0().OooO00o(chatModel);
                    }
                }
                break;
        }
    }
}
