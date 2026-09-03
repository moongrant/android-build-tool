package com.yalla.yalla.common.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.common.db.table.UserInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\f8\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/common/model/RoomBanEnterUser;", "Lcom/yalla/yalla/common/db/table/UserInfo;", "()V", "exNickName", "", "getExNickName", "()Ljava/lang/String;", "exRole", "", "getExRole", "()I", "exTime", "", "getExTime", "()J", "exUserId", "getExUserId", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RoomBanEnterUser extends UserInfo {
    public static final int $stable = 0;

    @SerializedName("exNickName")
    @Nullable
    private final String exNickName;

    @SerializedName("exRole")
    private final int exRole;

    @SerializedName("exTime")
    private final long exTime;

    @SerializedName("exUserid")
    private final long exUserId;

    @Nullable
    public final String getExNickName() {
        return this.exNickName;
    }

    public final int getExRole() {
        return this.exRole;
    }

    public final long getExTime() {
        return this.exTime;
    }

    public final long getExUserId() {
        return this.exUserId;
    }
}
