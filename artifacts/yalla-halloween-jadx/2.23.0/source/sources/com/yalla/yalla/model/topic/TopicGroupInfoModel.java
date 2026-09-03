package com.yalla.yalla.model.topic;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001:B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001e\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001a\u0010\"\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR\u001a\u0010%\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u000eR\u001a\u0010(\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010\u001dR\u001a\u0010+\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\f\"\u0004\b-\u0010\u000eR\u001a\u0010.\u001a\u00020/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001b\"\u0004\b6\u0010\u001dR\u001a\u00107\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\f\"\u0004\b9\u0010\u000e¨\u0006;"}, d2 = {"Lcom/yalla/yalla/model/topic/TopicGroupInfoModel;", "Ljava/io/Serializable;", "()V", "circleUserIsCancel", "", "getCircleUserIsCancel", "()Z", "setCircleUserIsCancel", "(Z)V", "createDay", "", "getCreateDay", "()I", "setCreateDay", "(I)V", "createDayMin", "getCreateDayMin", "setCreateDayMin", "followedCount", "getFollowedCount", "setFollowedCount", "followedCountMin", "getFollowedCountMin", "setFollowedCountMin", "groupOpenId", "", "getGroupOpenId", "()Ljava/lang/String;", "setGroupOpenId", "(Ljava/lang/String;)V", "isDisbanded", "setDisbanded", "isFollowed", "setFollowed", "localBindChatGroupCreateType", "getLocalBindChatGroupCreateType", "setLocalBindChatGroupCreateType", "localBindChatGroupJoinType", "getLocalBindChatGroupJoinType", "setLocalBindChatGroupJoinType", "localCredentialCode", "getLocalCredentialCode", "setLocalCredentialCode", "localPosition", "getLocalPosition", "setLocalPosition", "localTopicId", "", "getLocalTopicId", "()J", "setLocalTopicId", "(J)V", "localTopicName", "getLocalTopicName", "setLocalTopicName", "type", "getType", "setType", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TopicGroupInfoModel implements Serializable {
    public static final int PositionHost = 1;
    public static final int PositionManage = 3;
    public static final int PositionMember = 2;
    public static final int PositionTourist = 0;
    public static final int TypeCanCreate = 1;
    public static final int TypeCannotCreate = 0;
    public static final int TypeCreated = 2;
    private boolean circleUserIsCancel;
    private int createDay;
    private int createDayMin;
    private int followedCount;
    private int followedCountMin;
    private boolean isDisbanded;

    @SerializedName(alternate = {"isFollowed"}, value = "IsFollowed")
    private boolean isFollowed;
    private int localBindChatGroupCreateType;
    private int localBindChatGroupJoinType;
    private int localPosition;
    private long localTopicId;
    private int type;
    public static final int $stable = 8;

    @NotNull
    private String localTopicName = "";

    @NotNull
    private String localCredentialCode = "";

    @NotNull
    private String groupOpenId = "";

    public final boolean getCircleUserIsCancel() {
        return this.circleUserIsCancel;
    }

    public final int getCreateDay() {
        return this.createDay;
    }

    public final int getCreateDayMin() {
        return this.createDayMin;
    }

    public final int getFollowedCount() {
        return this.followedCount;
    }

    public final int getFollowedCountMin() {
        return this.followedCountMin;
    }

    @NotNull
    public final String getGroupOpenId() {
        return this.groupOpenId;
    }

    public final int getLocalBindChatGroupCreateType() {
        return this.localBindChatGroupCreateType;
    }

    public final int getLocalBindChatGroupJoinType() {
        return this.localBindChatGroupJoinType;
    }

    @NotNull
    public final String getLocalCredentialCode() {
        return this.localCredentialCode;
    }

    public final int getLocalPosition() {
        return this.localPosition;
    }

    public final long getLocalTopicId() {
        return this.localTopicId;
    }

    @NotNull
    public final String getLocalTopicName() {
        return this.localTopicName;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: isDisbanded, reason: from getter */
    public final boolean getIsDisbanded() {
        return this.isDisbanded;
    }

    /* JADX INFO: renamed from: isFollowed, reason: from getter */
    public final boolean getIsFollowed() {
        return this.isFollowed;
    }

    public final void setCircleUserIsCancel(boolean z) {
        this.circleUserIsCancel = z;
    }

    public final void setCreateDay(int i) {
        this.createDay = i;
    }

    public final void setCreateDayMin(int i) {
        this.createDayMin = i;
    }

    public final void setDisbanded(boolean z) {
        this.isDisbanded = z;
    }

    public final void setFollowed(boolean z) {
        this.isFollowed = z;
    }

    public final void setFollowedCount(int i) {
        this.followedCount = i;
    }

    public final void setFollowedCountMin(int i) {
        this.followedCountMin = i;
    }

    public final void setGroupOpenId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.groupOpenId = str;
    }

    public final void setLocalBindChatGroupCreateType(int i) {
        this.localBindChatGroupCreateType = i;
    }

    public final void setLocalBindChatGroupJoinType(int i) {
        this.localBindChatGroupJoinType = i;
    }

    public final void setLocalCredentialCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.localCredentialCode = str;
    }

    public final void setLocalPosition(int i) {
        this.localPosition = i;
    }

    public final void setLocalTopicId(long j) {
        this.localTopicId = j;
    }

    public final void setLocalTopicName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.localTopicName = str;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
