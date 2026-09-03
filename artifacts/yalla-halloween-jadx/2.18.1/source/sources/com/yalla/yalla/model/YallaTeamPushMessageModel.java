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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/model/YallaTeamPushMessageModel;", "Lcom/yalla/yalla/model/BasePushMessage;", "mid", "", "type", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "time", "", "(Ljava/lang/String;ILjava/lang/String;J)V", "getMessage", "()Ljava/lang/String;", "getMid", "getTime", "()J", "getType", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class YallaTeamPushMessageModel extends BasePushMessage {
    public static final int $stable = 0;

    @NotNull
    private final String message;

    @NotNull
    private final String mid;
    private final long time;
    private final int type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YallaTeamPushMessageModel(@NotNull String mid, int i, @NotNull String message, long j) {
        super(0L, 1, null);
        Intrinsics.checkNotNullParameter(mid, "mid");
        Intrinsics.checkNotNullParameter(message, "message");
        this.mid = mid;
        this.type = i;
        this.message = message;
        this.time = j;
    }

    public static /* synthetic */ YallaTeamPushMessageModel copy$default(YallaTeamPushMessageModel yallaTeamPushMessageModel, String str, int i, String str2, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = yallaTeamPushMessageModel.mid;
        }
        if ((i2 & 2) != 0) {
            i = yallaTeamPushMessageModel.type;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = yallaTeamPushMessageModel.message;
        }
        String str3 = str2;
        if ((i2 & 8) != 0) {
            j = yallaTeamPushMessageModel.time;
        }
        return yallaTeamPushMessageModel.copy(str, i3, str3, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMid() {
        return this.mid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final YallaTeamPushMessageModel copy(@NotNull String mid, int type, @NotNull String message, long time) {
        Intrinsics.checkNotNullParameter(mid, "mid");
        Intrinsics.checkNotNullParameter(message, "message");
        return new YallaTeamPushMessageModel(mid, type, message, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YallaTeamPushMessageModel)) {
            return false;
        }
        YallaTeamPushMessageModel yallaTeamPushMessageModel = (YallaTeamPushMessageModel) other;
        return Intrinsics.areEqual(this.mid, yallaTeamPushMessageModel.mid) && this.type == yallaTeamPushMessageModel.type && Intrinsics.areEqual(this.message, yallaTeamPushMessageModel.message) && this.time == yallaTeamPushMessageModel.time;
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

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iOooO00o = o0O0O00.OooO00o(this.message, ((this.mid.hashCode() * 31) + this.type) * 31, 31);
        long j = this.time;
        return iOooO00o + ((int) (j ^ (j >>> 32)));
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("YallaTeamPushMessageModel(mid=");
        sbOooO0o0.append(this.mid);
        sbOooO0o0.append(", type=");
        sbOooO0o0.append(this.type);
        sbOooO0o0.append(", message=");
        sbOooO0o0.append(this.message);
        sbOooO0o0.append(", time=");
        return o000O0.OooO0O0(sbOooO0o0, this.time, ')');
    }
}
