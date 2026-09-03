package com.app.base.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.fragment.ContributionFragment;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR&\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/app/base/model/LiveRoomMemberRoomRankModel;", "", "()V", "awardData", "Lcom/app/base/model/LiveRoomMemberRoomRankModel$AwardDataDTO;", "getAwardData", "()Lcom/app/base/model/LiveRoomMemberRoomRankModel$AwardDataDTO;", "setAwardData", "(Lcom/app/base/model/LiveRoomMemberRoomRankModel$AwardDataDTO;)V", "currRoomFriendShip", "", "getCurrRoomFriendShip", "()Ljava/lang/Long;", "setCurrRoomFriendShip", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "endOfDistance", "getEndOfDistance", "setEndOfDistance", "rankData", "", "Lcom/app/base/model/LiveRoomMemberRoomRankModel$RankDataDTO;", "getRankData", "()Ljava/util/List;", "setRankData", "(Ljava/util/List;)V", "AwardDataDTO", "RankDataDTO", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LiveRoomMemberRoomRankModel {
    public static final int $stable = 8;

    @SerializedName("awardData")
    @Nullable
    private AwardDataDTO awardData;

    @SerializedName("currRoomFriendShip")
    @Nullable
    private Long currRoomFriendShip;

    @SerializedName("endOfDistance")
    @Nullable
    private Long endOfDistance;

    @SerializedName("rankData")
    @Nullable
    private List<RankDataDTO> rankData;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/app/base/model/LiveRoomMemberRoomRankModel$AwardDataDTO;", "", "()V", "awardUrl", "", "getAwardUrl", "()Ljava/lang/String;", "setAwardUrl", "(Ljava/lang/String;)V", "showAwardArea", "", "getShowAwardArea", "()Ljava/lang/Boolean;", "setShowAwardArea", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AwardDataDTO {
        public static final int $stable = 8;

        @SerializedName("awardUrl")
        @Nullable
        private String awardUrl;

        @SerializedName("showAwardArea")
        @Nullable
        private Boolean showAwardArea;

        @Nullable
        public final String getAwardUrl() {
            return this.awardUrl;
        }

        @Nullable
        public final Boolean getShowAwardArea() {
            return this.showAwardArea;
        }

        public final void setAwardUrl(@Nullable String str) {
            this.awardUrl = str;
        }

        public final void setShowAwardArea(@Nullable Boolean bool) {
            this.showAwardArea = bool;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\"\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR \u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R \u0010 \u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016¨\u0006#"}, d2 = {"Lcom/app/base/model/LiveRoomMemberRoomRankModel$RankDataDTO;", "", "()V", "friendShip", "", "getFriendShip", "()Ljava/lang/Long;", "setFriendShip", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "rank", "", "getRank", "()Ljava/lang/Integer;", "setRank", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "roomAddr", "", "getRoomAddr", "()Ljava/lang/String;", "setRoomAddr", "(Ljava/lang/String;)V", ContributionFragment.ARG_1, "getRoomId", "setRoomId", "roomIdx", "getRoomIdx", "setRoomIdx", "roomImg", "getRoomImg", "setRoomImg", "roomName", "getRoomName", "setRoomName", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class RankDataDTO {
        public static final int $stable = 8;

        @SerializedName("friendShip")
        @Nullable
        private Long friendShip;

        @SerializedName("rank")
        @Nullable
        private Integer rank;

        @SerializedName("roomAddr")
        @Nullable
        private String roomAddr;

        @SerializedName(ContributionFragment.ARG_1)
        @Nullable
        private Long roomId;

        @SerializedName("roomIdx")
        @Nullable
        private Long roomIdx;

        @SerializedName("roomImg")
        @Nullable
        private String roomImg;

        @SerializedName("roomName")
        @Nullable
        private String roomName;

        @Nullable
        public final Long getFriendShip() {
            return this.friendShip;
        }

        @Nullable
        public final Integer getRank() {
            return this.rank;
        }

        @Nullable
        public final String getRoomAddr() {
            return this.roomAddr;
        }

        @Nullable
        public final Long getRoomId() {
            return this.roomId;
        }

        @Nullable
        public final Long getRoomIdx() {
            return this.roomIdx;
        }

        @Nullable
        public final String getRoomImg() {
            return this.roomImg;
        }

        @Nullable
        public final String getRoomName() {
            return this.roomName;
        }

        public final void setFriendShip(@Nullable Long l) {
            this.friendShip = l;
        }

        public final void setRank(@Nullable Integer num) {
            this.rank = num;
        }

        public final void setRoomAddr(@Nullable String str) {
            this.roomAddr = str;
        }

        public final void setRoomId(@Nullable Long l) {
            this.roomId = l;
        }

        public final void setRoomIdx(@Nullable Long l) {
            this.roomIdx = l;
        }

        public final void setRoomImg(@Nullable String str) {
            this.roomImg = str;
        }

        public final void setRoomName(@Nullable String str) {
            this.roomName = str;
        }
    }

    @Nullable
    public final AwardDataDTO getAwardData() {
        return this.awardData;
    }

    @Nullable
    public final Long getCurrRoomFriendShip() {
        return this.currRoomFriendShip;
    }

    @Nullable
    public final Long getEndOfDistance() {
        return this.endOfDistance;
    }

    @Nullable
    public final List<RankDataDTO> getRankData() {
        return this.rankData;
    }

    public final void setAwardData(@Nullable AwardDataDTO awardDataDTO) {
        this.awardData = awardDataDTO;
    }

    public final void setCurrRoomFriendShip(@Nullable Long l) {
        this.currRoomFriendShip = l;
    }

    public final void setEndOfDistance(@Nullable Long l) {
        this.endOfDistance = l;
    }

    public final void setRankData(@Nullable List<RankDataDTO> list) {
        this.rankData = list;
    }
}
