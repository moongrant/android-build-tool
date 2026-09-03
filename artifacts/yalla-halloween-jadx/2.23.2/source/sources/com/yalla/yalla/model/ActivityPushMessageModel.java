package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/model/ActivityPushMessageModel;", "Lcom/yalla/yalla/model/BasePushMessage;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "time", "", "(Ljava/lang/String;J)V", "getMessage", "()Ljava/lang/String;", "getTime", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ActivityPushMessageModel extends BasePushMessage {
    public static final int $stable = 0;

    @NotNull
    private final String message;
    private final long time;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityPushMessageModel(@NotNull String message, long j) {
        super(0L, 1, null);
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
        this.time = j;
    }

    public static /* synthetic */ ActivityPushMessageModel copy$default(ActivityPushMessageModel activityPushMessageModel, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityPushMessageModel.message;
        }
        if ((i & 2) != 0) {
            j = activityPushMessageModel.time;
        }
        return activityPushMessageModel.copy(str, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final ActivityPushMessageModel copy(@NotNull String message, long time) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new ActivityPushMessageModel(message, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityPushMessageModel)) {
            return false;
        }
        ActivityPushMessageModel activityPushMessageModel = (ActivityPushMessageModel) other;
        return Intrinsics.areEqual(this.message, activityPushMessageModel.message) && this.time == activityPushMessageModel.time;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        int iHashCode = this.message.hashCode() * 31;
        long j = this.time;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    @NotNull
    public String toString() {
        return "ActivityPushMessageModel(message=" + this.message + ", time=" + this.time + ")";
    }
}
