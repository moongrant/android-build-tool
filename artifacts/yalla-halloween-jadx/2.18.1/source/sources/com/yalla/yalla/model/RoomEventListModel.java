package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/model/RoomEventListModel;", "Ljava/io/Serializable;", "()V", "eventList", "", "Lcom/yalla/yalla/model/EventModel;", "getEventList", "()Ljava/util/List;", "setEventList", "(Ljava/util/List;)V", "isCanCreate", "", "()Z", "setCanCreate", "(Z)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RoomEventListModel implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private List<EventModel> eventList;
    private boolean isCanCreate;

    @Nullable
    public final List<EventModel> getEventList() {
        return this.eventList;
    }

    /* JADX INFO: renamed from: isCanCreate, reason: from getter */
    public final boolean getIsCanCreate() {
        return this.isCanCreate;
    }

    public final void setCanCreate(boolean z) {
        this.isCanCreate = z;
    }

    public final void setEventList(@Nullable List<EventModel> list) {
        this.eventList = list;
    }
}
