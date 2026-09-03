package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001a\u0010 \u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u001a\u0010,\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001a\u0010/\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\b¨\u00062"}, d2 = {"Lcom/yalla/yalla/model/VoteModel;", "", "()V", "createTime", "", "getCreateTime", "()J", "setCreateTime", "(J)V", "currentTime", "getCurrentTime", "setCurrentTime", "endTime", "getEndTime", "setEndTime", "isUnLimit", "", "()Z", "setUnLimit", "(Z)V", "nickName", "", "getNickName", "()Ljava/lang/String;", "setNickName", "(Ljava/lang/String;)V", "preEndTime", "getPreEndTime", "setPreEndTime", ContributionFragment.ARG_1, "getRoomId", "setRoomId", "startTime", "getStartTime", "setStartTime", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, "", "getStatus", "()I", "setStatus", "(I)V", ShareConstants.WEB_DIALOG_PARAM_TITLE, "getTitle", "setTitle", "userId", "getUserId", "setUserId", "voteId", "getVoteId", "setVoteId", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VoteModel {
    public static final int $stable = 8;
    private long createTime;
    private long currentTime;
    private long endTime;
    private boolean isUnLimit;
    private long preEndTime;
    private long roomId;
    private long startTime;
    private int status;
    private long userId;
    private long voteId;

    @NotNull
    private String title = "";

    @NotNull
    private String nickName = "";

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getCurrentTime() {
        return this.currentTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    public final long getPreEndTime() {
        return this.preEndTime;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final long getVoteId() {
        return this.voteId;
    }

    /* JADX INFO: renamed from: isUnLimit, reason: from getter */
    public final boolean getIsUnLimit() {
        return this.isUnLimit;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setCurrentTime(long j) {
        this.currentTime = j;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setNickName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nickName = str;
    }

    public final void setPreEndTime(long j) {
        this.preEndTime = j;
    }

    public final void setRoomId(long j) {
        this.roomId = j;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void setUnLimit(boolean z) {
        this.isUnLimit = z;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }

    public final void setVoteId(long j) {
        this.voteId = j;
    }
}
