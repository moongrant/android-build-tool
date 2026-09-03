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
import p407o0Oo0Oo.o00O0OO0;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;
import p485o0o000oO.o000O0o;
import p583o0oOoo00.o0O0O00;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooO0OO implements OooO00o {
    @Override // com.yalla.yalla.service.room.processor.OooO00o
    @NotNull
    public final String OooO00o() {
        return OooO00o.C0318OooO00o.OooO00o(this);
    }

    public final void OooO0O0(int i, @Nullable Object obj) {
        OooO00o.C0318OooO00o.OooO0O0(this, i, obj);
        switch (i) {
            case 1000800:
                Room.EventChange from = Room.EventChange.parseFrom((byte[]) obj);
                if (from != null) {
                    o0000O00.OooO0OO("RoomEventMsgProcessor", "what = " + i + "  data = " + from);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000O0o(from, null), 3, null);
                }
                break;
            case 1000801:
                Room.EventInfoNotify from2 = Room.EventInfoNotify.parseFrom((byte[]) obj);
                if (from2 != null) {
                    o0000O00.OooO0OO("RoomEventMsgProcessor", "what = " + i + "  data = " + from2);
                    long id = from2.getId();
                    StringBuilder sb = new StringBuilder("hideEvent hasEvent ");
                    sb.append(id);
                    o0000O00.OooO0O0(sb.toString());
                    long id2 = from2.getId();
                    o00O0OO0 o00o0oo0OooOo0o = o00Oo0.OooO00o().OooOo0o();
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    if (!(o00o0oo0OooOo0o.OooO0O0(3, ((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), String.valueOf(id2)) != null)) {
                        int fState = from2.getFState();
                        EventModel.State.Companion companion = EventModel.State.INSTANCE;
                        if (fState == companion.getNotStarted()) {
                            LinkedHashSet<Long> linkedHashSet = o0O0O00.f56689OooO00o;
                            if (!linkedHashSet.contains(Long.valueOf(from2.getId()))) {
                                linkedHashSet.add(Long.valueOf(from2.getId()));
                            }
                        } else if (from2.getFState() == companion.getInProgress()) {
                            LinkedHashSet<Long> linkedHashSet2 = o0O0O00.f56690OooO0O0;
                            if (!linkedHashSet2.contains(Long.valueOf(from2.getId()))) {
                                linkedHashSet2.add(Long.valueOf(from2.getId()));
                            }
                        }
                        EventModel eventModel = new EventModel();
                        eventModel.setId(from2.getId());
                        eventModel.setRegion(from2.getRegion());
                        String eventName = from2.getEventName();
                        Intrinsics.checkNotNullExpressionValue(eventName, "getEventName(...)");
                        eventModel.setEventName(eventName);
                        eventModel.setCreatorUserId(from2.getUserId());
                        eventModel.setEventTagId(from2.getKeyWord());
                        String keyWordText = from2.getKeyWordText();
                        Intrinsics.checkNotNullExpressionValue(keyWordText, "getKeyWordText(...)");
                        eventModel.setEventTag(keyWordText);
                        String keyWordIcon = from2.getKeyWordIcon();
                        Intrinsics.checkNotNullExpressionValue(keyWordIcon, "getKeyWordIcon(...)");
                        eventModel.setEventTagIcon(keyWordIcon);
                        String pic = from2.getPic();
                        Intrinsics.checkNotNullExpressionValue(pic, "getPic(...)");
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
