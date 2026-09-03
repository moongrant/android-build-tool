package com.yalla.yalla.common.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.view.pop.roomSharePop.RoomShareModel;
import com.facebook.internal.AnalyticsEvents;
import com.yalla.yalla.model.EventModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/common/model/ShareModel;", "", "type", "Lcom/yalla/yalla/common/model/ShareType;", "(Lcom/yalla/yalla/common/model/ShareType;)V", "event", "Lcom/yalla/yalla/model/EventModel;", "getEvent", "()Lcom/yalla/yalla/model/EventModel;", "setEvent", "(Lcom/yalla/yalla/model/EventModel;)V", "room", "Lcom/app/base/view/pop/roomSharePop/RoomShareModel;", "getRoom", "()Lcom/app/base/view/pop/roomSharePop/RoomShareModel;", "setRoom", "(Lcom/app/base/view/pop/roomSharePop/RoomShareModel;)V", "getType", "()Lcom/yalla/yalla/common/model/ShareType;", AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_WEB, "Lcom/yalla/yalla/common/model/ShareWebModel;", "getWeb", "()Lcom/yalla/yalla/common/model/ShareWebModel;", "setWeb", "(Lcom/yalla/yalla/common/model/ShareWebModel;)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ShareModel {
    public static final int $stable = 8;

    @Nullable
    private EventModel event;

    @Nullable
    private RoomShareModel room;

    @NotNull
    private final ShareType type;

    @Nullable
    private ShareWebModel web;

    public ShareModel(@NotNull ShareType type) {
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
    public final ShareType getType() {
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
