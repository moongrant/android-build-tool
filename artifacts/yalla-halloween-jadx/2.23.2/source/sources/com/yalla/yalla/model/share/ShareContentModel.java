package com.yalla.yalla.model.share;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.AnalyticsEvents;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.ui.view.pop.roomSharePop.RoomShareModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/model/share/ShareContentModel;", "", "type", "Lcom/yalla/yalla/model/share/ShareContentType;", "(Lcom/yalla/yalla/model/share/ShareContentType;)V", "event", "Lcom/yalla/yalla/model/event/EventModel;", "getEvent", "()Lcom/yalla/yalla/model/event/EventModel;", "setEvent", "(Lcom/yalla/yalla/model/event/EventModel;)V", "room", "Lcom/yalla/yalla/ui/view/pop/roomSharePop/RoomShareModel;", "getRoom", "()Lcom/yalla/yalla/ui/view/pop/roomSharePop/RoomShareModel;", "setRoom", "(Lcom/yalla/yalla/ui/view/pop/roomSharePop/RoomShareModel;)V", "getType", "()Lcom/yalla/yalla/model/share/ShareContentType;", AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_WEB, "Lcom/yalla/yalla/model/share/ShareWebModel;", "getWeb", "()Lcom/yalla/yalla/model/share/ShareWebModel;", "setWeb", "(Lcom/yalla/yalla/model/share/ShareWebModel;)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ShareContentModel {
    public static final int $stable = 8;

    @Nullable
    private EventModel event;

    @Nullable
    private RoomShareModel room;

    @NotNull
    private final ShareContentType type;

    @Nullable
    private ShareWebModel web;

    public ShareContentModel(@NotNull ShareContentType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
    }

    @Nullable
    public final EventModel getEvent() {
        return this.event;
    }

    @Nullable
    public final RoomShareModel getRoom() {
        return this.room;
    }

    @NotNull
    public final ShareContentType getType() {
        return this.type;
    }

    @Nullable
    public final ShareWebModel getWeb() {
        return this.web;
    }

    public final void setEvent(@Nullable EventModel eventModel) {
        this.event = eventModel;
    }

    public final void setRoom(@Nullable RoomShareModel roomShareModel) {
        this.room = roomShareModel;
    }

    public final void setWeb(@Nullable ShareWebModel shareWebModel) {
        this.web = shareWebModel;
    }
}
