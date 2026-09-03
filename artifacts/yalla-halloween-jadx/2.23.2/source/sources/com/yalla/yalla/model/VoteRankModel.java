package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u001a\u0010$\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 ¨\u0006'"}, d2 = {"Lcom/yalla/yalla/model/VoteRankModel;", "", "()V", "fCount", "", "getFCount", "()I", "setFCount", "(I)V", "giftId", "getGiftId", "setGiftId", "giftImg", "", "getGiftImg", "()Ljava/lang/String;", "setGiftImg", "(Ljava/lang/String;)V", "giftUserType", "getGiftUserType", "setGiftUserType", "headImg", "getHeadImg", "setHeadImg", "nickName", "getNickName", "setNickName", ContributionFragment.ARG_1, "", "getRoomId", "()J", "setRoomId", "(J)V", "userId", "getUserId", "setUserId", "voteId", "getVoteId", "setVoteId", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VoteRankModel {
    public static final int $stable = 8;
    private int fCount;
    private int giftId;
    private int giftUserType;
    private long roomId;
    private long userId;
    private long voteId;

    @NotNull
    private String nickName = "";

    @NotNull
    private String headImg = "";

    @NotNull
    private String giftImg = "";

    public final int getFCount() {
        return this.fCount;
    }

    public final int getGiftId() {
        return this.giftId;
    }

    @NotNull
    public final String getGiftImg() {
        return this.giftImg;
    }

    public final int getGiftUserType() {
        return this.giftUserType;
    }

    @NotNull
    public final String getHeadImg() {
        return this.headImg;
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

    public final long getVoteId() {
        return this.voteId;
    }

    public final void setFCount(int i) {
        this.fCount = i;
    }

    public final void setGiftId(int i) {
        this.giftId = i;
    }

    public final void setGiftImg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.giftImg = str;
    }

    public final void setGiftUserType(int i) {
        this.giftUserType = i;
    }

    public final void setHeadImg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.headImg = str;
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

    public final void setVoteId(long j) {
        this.voteId = j;
    }
}
