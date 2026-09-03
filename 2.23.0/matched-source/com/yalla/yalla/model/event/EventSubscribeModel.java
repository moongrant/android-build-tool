package com.yalla.yalla.model.event;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/model/event/EventSubscribeModel;", "", "()V", "eventId", "", "getEventId", "()J", "setEventId", "(J)V", "eventName", "", "getEventName", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "eventStartTime", "getEventStartTime", "setEventStartTime", "id", "getId", "setId", "region", "", "getRegion", "()I", "setRegion", "(I)V", "subCount", "getSubCount", "setSubCount", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EventSubscribeModel {
    public static final int $stable = 8;
    private long eventId;

    @NotNull
    private String eventName = "";

    @SerializedName("eventstarttime")
    private long eventStartTime;
    private long id;
    private int region;
    private int subCount;

    public final long getEventId() {
        return this.eventId;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    public final long getEventStartTime() {
        return this.eventStartTime;
    }

    public final long getId() {
        return this.id;
    }

    public final int getRegion() {
        return this.region;
    }

    public final int getSubCount() {
        return this.subCount;
    }

    public final void setEventId(long j) {
        this.eventId = j;
    }

    public final void setEventName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.eventName = str;
    }

    public final void setEventStartTime(long j) {
        this.eventStartTime = j;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setRegion(int i) {
        this.region = i;
    }

    public final void setSubCount(int i) {
        this.subCount = i;
    }
}
