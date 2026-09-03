package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/model/EventPushModel;", "Lcom/yalla/yalla/model/BasePushMessage;", ContributionFragment.ARG_1, "", "(J)V", "getRoomId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class EventPushModel extends BasePushMessage {
    public static final int $stable = 0;
    private final long roomId;

    public EventPushModel(long j) {
        super(0L, 1, null);
        this.roomId = j;
    }

    public static /* synthetic */ EventPushModel copy$default(EventPushModel eventPushModel, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = eventPushModel.roomId;
        }
        return eventPushModel.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getRoomId() {
        return this.roomId;
    }

    @NotNull
    public final EventPushModel copy(long roomId) {
        return new EventPushModel(roomId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EventPushModel) && this.roomId == ((EventPushModel) other).roomId;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public int hashCode() {
        long j = this.roomId;
        return (int) (j ^ (j >>> 32));
    }

    @NotNull
    public String toString() {
        return "EventPushModel(roomId=" + this.roomId + ")";
    }
}
