package com.app.base.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/app/base/model/LiveRoomMemberUserRankModel;", "", "()V", "currUserData", "Lcom/app/base/model/LiveRoomMemberUserRankModel$RankDataDTO;", "getCurrUserData", "()Lcom/app/base/model/LiveRoomMemberUserRankModel$RankDataDTO;", "setCurrUserData", "(Lcom/app/base/model/LiveRoomMemberUserRankModel$RankDataDTO;)V", "rankData", "", "getRankData", "()Ljava/util/List;", "setRankData", "(Ljava/util/List;)V", "RankDataDTO", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LiveRoomMemberUserRankModel {
    public static final int $stable = 8;

    @SerializedName("currUserData")
    @Nullable
    private RankDataDTO currUserData;

    @SerializedName("rankData")
    @Nullable
    private List<RankDataDTO> rankData;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00102\u001a\u00020\u0017R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR \u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\"\u0010&\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!R\"\u0010)\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010!R\"\u0010,\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b-\u0010\u001f\"\u0004\b.\u0010!R\"\u0010/\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010!¨\u00063"}, d2 = {"Lcom/app/base/model/LiveRoomMemberUserRankModel$RankDataDTO;", "", "()V", "badgeUrl", "", "getBadgeUrl", "()Ljava/lang/String;", "setBadgeUrl", "(Ljava/lang/String;)V", "friendShip", "", "getFriendShip", "()Ljava/lang/Long;", "setFriendShip", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "friendShipUTime", "getFriendShipUTime", "setFriendShipUTime", "headUrl", "getHeadUrl", "setHeadUrl", "isTopRank", "", "()Ljava/lang/Boolean;", "setTopRank", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "memberLv", "", "getMemberLv", "()Ljava/lang/Integer;", "setMemberLv", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "nickName", "getNickName", "setNickName", "rank", "getRank", "setRank", "totalRank", "getTotalRank", "setTotalRank", "userId", "getUserId", "setUserId", "weekRank", "getWeekRank", "setWeekRank", "notInRankAndFriendShipIsZero", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class RankDataDTO {
        public static final int $stable = 8;

        @SerializedName("badgeUrl")
        @Nullable
        private String badgeUrl;

        @SerializedName("friendShip")
        @Nullable
        private Long friendShip;

        @SerializedName("friendShipUTime")
        @Nullable
        private String friendShipUTime;

        @SerializedName("headUrl")
        @Nullable
        private String headUrl;

        @SerializedName("isTopRank")
        @Nullable
        private Boolean isTopRank;

        @SerializedName("memberLv")
        @Nullable
        private Integer memberLv;

        @SerializedName("nickName")
        @Nullable
        private String nickName;

        @SerializedName("rank")
        @Nullable
        private Integer rank;

        @SerializedName("totalRank")
        @Nullable
        private Integer totalRank;

        @SerializedName("userId")
        @Nullable
        private Integer userId;

        @SerializedName("weekRank")
        @Nullable
        private Integer weekRank;

        @Nullable
        public final String getBadgeUrl() {
            return this.badgeUrl;
        }

        @Nullable
        public final Long getFriendShip() {
            return this.friendShip;
        }

        @Nullable
        public final String getFriendShipUTime() {
            return this.friendShipUTime;
        }

        @Nullable
        public final String getHeadUrl() {
            return this.headUrl;
        }

        @Nullable
        public final Integer getMemberLv() {
            return this.memberLv;
        }

        @Nullable
        public final String getNickName() {
            return this.nickName;
        }

        @Nullable
        public final Integer getRank() {
            return this.rank;
        }

        @Nullable
        public final Integer getTotalRank() {
            return this.totalRank;
        }

        @Nullable
        public final Integer getUserId() {
            return this.userId;
        }

        @Nullable
        public final Integer getWeekRank() {
            return this.weekRank;
        }

        @Nullable
        /* JADX INFO: renamed from: isTopRank, reason: from getter */
        public final Boolean getIsTopRank() {
            return this.isTopRank;
        }

        public final boolean notInRankAndFriendShipIsZero() {
            Long l;
            Integer num = this.userId;
            return (num != null && num.intValue() == 0) || ((l = this.friendShip) != null && l.longValue() == 0);
        }

        public final void setBadgeUrl(@Nullable String str) {
            this.badgeUrl = str;
        }

        public final void setFriendShip(@Nullable Long l) {
            this.friendShip = l;
        }

        public final void setFriendShipUTime(@Nullable String str) {
            this.friendShipUTime = str;
        }

        public final void setHeadUrl(@Nullable String str) {
            this.headUrl = str;
        }

        public final void setMemberLv(@Nullable Integer num) {
            this.memberLv = num;
        }

        public final void setNickName(@Nullable String str) {
            this.nickName = str;
        }

        public final void setRank(@Nullable Integer num) {
            this.rank = num;
        }

        public final void setTopRank(@Nullable Boolean bool) {
            this.isTopRank = bool;
        }

        public final void setTotalRank(@Nullable Integer num) {
            this.totalRank = num;
        }

        public final void setUserId(@Nullable Integer num) {
            this.userId = num;
        }

        public final void setWeekRank(@Nullable Integer num) {
            this.weekRank = num;
        }
    }

    @Nullable
    public final RankDataDTO getCurrUserData() {
        return this.currUserData;
    }

    @Nullable
    public final List<RankDataDTO> getRankData() {
        return this.rankData;
    }

    public final void setCurrUserData(@Nullable RankDataDTO rankDataDTO) {
        this.currUserData = rankDataDTO;
    }

    public final void setRankData(@Nullable List<RankDataDTO> list) {
        this.rankData = list;
    }
}
