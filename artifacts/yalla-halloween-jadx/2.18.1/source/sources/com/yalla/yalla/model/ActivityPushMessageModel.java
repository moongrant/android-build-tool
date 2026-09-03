package com.yalla.yalla.model;

import Oooo000.o000O0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p086o000OooO.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/model/ActivityPushMessageModel;", "Lcom/yalla/yalla/model/BasePushMessage;", "mid", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "time", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getMessage", "()Ljava/lang/String;", "getMid", "getTime", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ActivityPushMessageModel extends BasePushMessage {
    public static final int $stable = 0;

    @NotNull
    private final String message;

    @NotNull
    private final String mid;
    private final long time;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityPushMessageModel(@NotNull String mid, @NotNull String message, long j) {
        super(0L, 1, null);
        Intrinsics.checkNotNullParameter(mid, "mid");
        Intrinsics.checkNotNullParameter(message, "message");
        this.mid = mid;
        this.message = message;
        this.time = j;
    }

    public static /* synthetic */ ActivityPushMessageModel copy$default(ActivityPushMessageModel activityPushMessageModel, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityPushMessageModel.mid;
        }
        if ((i & 2) != 0) {
            str2 = activityPushMessageModel.message;
        }
        if ((i & 4) != 0) {
            j = activityPushMessageModel.time;
        }
        return activityPushMessageModel.copy(str, str2, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMid() {
        return this.mid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final ActivityPushMessageModel copy(@NotNull String mid, @NotNull String message, long time) {
        Intrinsics.checkNotNullParameter(mid, "mid");
        Intrinsics.checkNotNullParameter(message, "message");
        return new ActivityPushMessageModel(mid, message, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityPushMessageModel)) {
            return false;
        }
        ActivityPushMessageModel activityPushMessageModel = (ActivityPushMessageModel) other;
        return Intrinsics.areEqual(this.mid, activityPushMessageModel.mid) && Intrinsics.areEqual(this.message, activityPushMessageModel.message) && this.time == activityPushMessageModel.time;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getMid() {
        return this.mid;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        int iOooO00o = o0O0O00.OooO00o(this.message, this.mid.hashCode() * 31, 31);
        long j = this.time;
        return iOooO00o + ((int) (j ^ (j >>> 32)));
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ActivityPushMessageModel(mid=");
        sbOooO0o0.append(this.mid);
        sbOooO0o0.append(", message=");
        sbOooO0o0.append(this.message);
        sbOooO0o0.append(", time=");
        return o000O0.OooO0O0(sbOooO0o0, this.time, ')');
    }
}
