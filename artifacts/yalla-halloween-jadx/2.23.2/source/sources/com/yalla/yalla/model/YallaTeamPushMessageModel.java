package com.yalla.yalla.model;

import android.support.v4.media.session.OooO0OO;
import androidx.compose.animation.OooO0O0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/model/YallaTeamPushMessageModel;", "Lcom/yalla/yalla/model/BasePushMessage;", "type", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "time", "", "(ILjava/lang/String;J)V", "getMessage", "()Ljava/lang/String;", "getTime", "()J", "getType", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class YallaTeamPushMessageModel extends BasePushMessage {
    public static final int $stable = 0;

    @NotNull
    private final String message;
    private final long time;
    private final int type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YallaTeamPushMessageModel(int i, @NotNull String message, long j) {
        super(0L, 1, null);
        Intrinsics.checkNotNullParameter(message, "message");
        this.type = i;
        this.message = message;
        this.time = j;
    }

    public static /* synthetic */ YallaTeamPushMessageModel copy$default(YallaTeamPushMessageModel yallaTeamPushMessageModel, int i, String str, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = yallaTeamPushMessageModel.type;
        }
        if ((i2 & 2) != 0) {
            str = yallaTeamPushMessageModel.message;
        }
        if ((i2 & 4) != 0) {
            j = yallaTeamPushMessageModel.time;
        }
        return yallaTeamPushMessageModel.copy(i, str, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
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
    public final YallaTeamPushMessageModel copy(int type, @NotNull String message, long time) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new YallaTeamPushMessageModel(type, message, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YallaTeamPushMessageModel)) {
            return false;
        }
        YallaTeamPushMessageModel yallaTeamPushMessageModel = (YallaTeamPushMessageModel) other;
        return this.type == yallaTeamPushMessageModel.type && Intrinsics.areEqual(this.message, yallaTeamPushMessageModel.message) && this.time == yallaTeamPushMessageModel.time;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iOooO00o = OooO0O0.OooO00o(this.message, this.type * 31, 31);
        long j = this.time;
        return iOooO00o + ((int) (j ^ (j >>> 32)));
    }

    @NotNull
    public String toString() {
        int i = this.type;
        String str = this.message;
        return OooO0OO.OooO0O0(oo0o0O0.OooO0O0.OooO00o("YallaTeamPushMessageModel(type=", i, ", message=", str, ", time="), this.time, ")");
    }
}
