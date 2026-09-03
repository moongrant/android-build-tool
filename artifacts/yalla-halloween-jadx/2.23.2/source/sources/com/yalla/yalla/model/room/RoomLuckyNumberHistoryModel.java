package com.yalla.yalla.model.room;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/model/room/RoomLuckyNumberHistoryModel;", "Ljava/io/Serializable;", "()V", "cTime", "", "getCTime", "()J", "setCTime", "(J)V", "headUrl", "", "getHeadUrl", "()Ljava/lang/String;", "setHeadUrl", "(Ljava/lang/String;)V", "id", "getId", "setId", "luckNum", "getLuckNum", "setLuckNum", "nickName", "getNickName", "setNickName", ContributionFragment.ARG_1, "getRoomId", "setRoomId", "userId", "getUserId", "setUserId", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class RoomLuckyNumberHistoryModel implements Serializable {
    public static final int $stable = 8;

    @SerializedName("cTime")
    private long cTime;

    @SerializedName("id")
    private long id;

    @SerializedName("luckNum")
    private long luckNum;

    @SerializedName(ContributionFragment.ARG_1)
    private long roomId;

    @SerializedName("userId")
    private long userId;

    @SerializedName("nickName")
    @NotNull
    private String nickName = "";

    @SerializedName("headUrl")
    @NotNull
    private String headUrl = "";

    public final long getCTime() {
        return this.cTime;
    }

    @NotNull
    public final String getHeadUrl() {
        return this.headUrl;
    }

    public final long getId() {
        return this.id;
    }

    public final long getLuckNum() {
        return this.luckNum;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final void setCTime(long j) {
        this.cTime = j;
    }

    public final void setHeadUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.headUrl = str;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setLuckNum(long j) {
        this.luckNum = j;
    }

    public final void setNickName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nickName = str;
    }

    public final void setRoomId(long j) {
        this.roomId = j;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }
}
