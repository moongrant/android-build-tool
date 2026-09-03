package com.yalla.yalla.model.room;

import androidx.compose.compiler.plugins.kotlin.OooO0OO;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.user.UserInfoModel;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\bW\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0004stuvB\u0005¢\u0006\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010\u000fR\u001a\u0010(\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u001e\u0010+\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR\u001e\u0010.\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\tR\u001c\u00101\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u0010\tR\u001e\u00104\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\r\"\u0004\b5\u0010\u000fR\u001a\u00106\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\r\"\u0004\b7\u0010\u000fR\u001a\u00108\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\r\"\u0004\b9\u0010\u000fR\u001a\u0010:\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\r\"\u0004\b;\u0010\u000fR\u001a\u0010<\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\r\"\u0004\b=\u0010\u000fR\u001e\u0010>\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\r\"\u0004\b?\u0010\u000fR\u001a\u0010@\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\"\"\u0004\bB\u0010$R\u001a\u0010C\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001c\"\u0004\bE\u0010\u001eR\u001e\u0010F\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u001c\"\u0004\bH\u0010\u001eR\u001e\u0010I\u001a\u00020 8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\"\"\u0004\bK\u0010$R\u001c\u0010L\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0007\"\u0004\bN\u0010\tR\u001e\u0010O\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u001c\"\u0004\bQ\u0010\u001eR\u001e\u0010R\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u001c\"\u0004\bT\u0010\u001eR\u001e\u0010U\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u001c\"\u0004\bW\u0010\u001eR\u001a\u0010X\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\r\"\u0004\bZ\u0010\u000fR\u001e\u0010[\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\r\"\u0004\b]\u0010\u000fR\u001e\u0010^\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u001c\"\u0004\b`\u0010\u001eR\u001e\u0010a\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0007\"\u0004\bc\u0010\tR\u001e\u0010d\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0007\"\u0004\bf\u0010\tR\u001a\u0010g\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u001c\"\u0004\bi\u0010\u001eR\u001c\u0010j\u001a\u00020\u00058FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u0007\"\u0004\bl\u0010\tR\u001c\u0010m\u001a\u00020\u00058FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\u0007\"\u0004\bo\u0010\tR\u001a\u0010p\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\"\"\u0004\br\u0010$¨\u0006w"}, d2 = {"Lcom/yalla/yalla/model/room/RoomUserInfoDTO;", "Lcom/yalla/yalla/model/user/UserInfoModel;", "Ljava/io/Serializable;", "()V", "badgeLevelUrl", "", "getBadgeLevelUrl", "()Ljava/lang/String;", "setBadgeLevelUrl", "(Ljava/lang/String;)V", "badgeState", "", "getBadgeState", "()Z", "setBadgeState", "(Z)V", "badgeUrl", "getBadgeUrl", "setBadgeUrl", "bubbleInfo", "Lcom/yalla/yalla/model/room/RoomUserInfoDTO$ChatBubbleInfo;", "getBubbleInfo", "()Lcom/yalla/yalla/model/room/RoomUserInfoDTO$ChatBubbleInfo;", "setBubbleInfo", "(Lcom/yalla/yalla/model/room/RoomUserInfoDTO$ChatBubbleInfo;)V", "conveneNum", "", "getConveneNum", "()I", "setConveneNum", "(I)V", "dayContributeNum", "", "getDayContributeNum", "()J", "setDayContributeNum", "(J)V", "hasMic", "getHasMic", "setHasMic", "headPhotoResId", "getHeadPhotoResId", "setHeadPhotoResId", "headerCardId", "getHeaderCardId", "setHeaderCardId", "headerCardUrl", "getHeaderCardUrl", "setHeaderCardUrl", "inRoomEffectsInfo", "getInRoomEffectsInfo", "setInRoomEffectsInfo", "isInRoom", "setInRoom", "isSelected", "setSelected", "isSelectedForSendHats", "setSelectedForSendHats", "isSetting", "setSetting", "isTopRank", "setTopRank", "isUnLoginUser", "setUnLoginUser", "lasttime", "getLasttime", "setLasttime", "memberLevel", "getMemberLevel", "setMemberLevel", "micPosition", "getMicPosition", "setMicPosition", "priority", "getPriority", "setPriority", "profileCardInfo", "getProfileCardInfo", "setProfileCardInfo", "rankDay", "getRankDay", "setRankDay", "rankWeek", "getRankWeek", "setRankWeek", "roomMemberType", "getRoomMemberType", "setRoomMemberType", "showPremiumFirst", "getShowPremiumFirst", "setShowPremiumFirst", "silenced", "getSilenced", "setSilenced", "vehicleId", "getVehicleId", "setVehicleId", "vehicleSVGAUrl", "getVehicleSVGAUrl", "setVehicleSVGAUrl", "vehicleUrl", "getVehicleUrl", "setVehicleUrl", "voiceChangerId", "getVoiceChangerId", "setVoiceChangerId", "wealthBadge", "getWealthBadge", "setWealthBadge", "wealthProfileCardImg", "getWealthProfileCardImg", "setWealthProfileCardImg", "weekContributeNum", "getWeekContributeNum", "setWeekContributeNum", "ChatBubbleInfo", "InRoomEffectsInfo", "ProfileCardInfo", "WealthInfo", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRoomUserInfoDTO.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomUserInfoDTO.kt\ncom/yalla/yalla/model/room/RoomUserInfoDTO\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
public class RoomUserInfoDTO extends UserInfoModel {
    public static final int $stable = 8;
    private boolean badgeState;

    @Nullable
    private ChatBubbleInfo bubbleInfo;
    private int conveneNum;
    private long dayContributeNum;

    @SerializedName("hasmic")
    private boolean hasMic;
    private int headPhotoResId;

    @SerializedName(alternate = {"headweared"}, value = "headerCardId")
    private int headerCardId;

    @Nullable
    private String inRoomEffectsInfo;

    @SerializedName("isInRoom")
    private boolean isInRoom;
    private boolean isSelected;
    private boolean isSelectedForSendHats;
    private boolean isSetting;
    private boolean isTopRank;

    @SerializedName(alternate = {"touristmode"}, value = "isNotLoggedIn")
    private boolean isUnLoginUser;
    private long lasttime;
    private int memberLevel;

    @SerializedName("morder")
    private int micPosition;

    @SerializedName("priority")
    private long priority;

    @Nullable
    private String profileCardInfo;

    @SerializedName("rankday")
    private int rankDay;

    @SerializedName("rankweek")
    private int rankWeek;

    @SerializedName(alternate = {"positionid"}, value = "position")
    private int roomMemberType;
    private boolean showPremiumFirst;

    @SerializedName("silenced")
    private boolean silenced;

    @SerializedName(alternate = {"vehicle", "vehicleid"}, value = "vehicleId")
    private int vehicleId;
    private int voiceChangerId;
    private long weekContributeNum;

    @SerializedName(alternate = {"headweareURLNew"}, value = "headerCardUrl")
    @NotNull
    private String headerCardUrl = "";

    @SerializedName(alternate = {"carimg", "vehicleStaticImg"}, value = "vehicleUrl")
    @NotNull
    private String vehicleUrl = "";

    @SerializedName(alternate = {"carsvga"}, value = "vehicleSVGAUrl")
    @NotNull
    private String vehicleSVGAUrl = "";

    @NotNull
    private String badgeUrl = "";

    @NotNull
    private String badgeLevelUrl = "";

    @NotNull
    private String wealthBadge = "";

    @NotNull
    private String wealthProfileCardImg = "";

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/model/room/RoomUserInfoDTO$ChatBubbleInfo;", "Ljava/io/Serializable;", "()V", "bubbleColour", "", "getBubbleColour", "()Ljava/lang/String;", "setBubbleColour", "(Ljava/lang/String;)V", "bubbleReplyColour", "getBubbleReplyColour", "setBubbleReplyColour", "bubbleUrl", "getBubbleUrl", "setBubbleUrl", "isDefaultBubble", "", "()Z", "setDefaultBubble", "(Z)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ChatBubbleInfo implements Serializable {
        public static final int $stable = 8;

        @NotNull
        private String bubbleColour = "#FFFFFF";

        @NotNull
        private String bubbleReplyColour = "#FFFFFF";

        @NotNull
        private String bubbleUrl = "";
        private boolean isDefaultBubble = true;

        @NotNull
        public final String getBubbleColour() {
            return this.bubbleColour;
        }

        @NotNull
        public final String getBubbleReplyColour() {
            return this.bubbleReplyColour;
        }

        @NotNull
        public final String getBubbleUrl() {
            return this.bubbleUrl;
        }

        /* JADX INFO: renamed from: isDefaultBubble, reason: from getter */
        public final boolean getIsDefaultBubble() {
            return this.isDefaultBubble;
        }

        public final void setBubbleColour(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.bubbleColour = str;
        }

        public final void setBubbleReplyColour(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.bubbleReplyColour = str;
        }

        public final void setBubbleUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.bubbleUrl = str;
        }

        public final void setDefaultBubble(boolean z) {
            this.isDefaultBubble = z;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/model/room/RoomUserInfoDTO$InRoomEffectsInfo;", "Ljava/io/Serializable;", "()V", "backgroundUrl", "", "getBackgroundUrl", "()Ljava/lang/String;", "setBackgroundUrl", "(Ljava/lang/String;)V", "badgeUrl", "getBadgeUrl", "setBadgeUrl", "effectsIndex1", "", "getEffectsIndex1", "()I", "setEffectsIndex1", "(I)V", "effectsIndex2", "getEffectsIndex2", "setEffectsIndex2", "effectsUrl1", "getEffectsUrl1", "setEffectsUrl1", "effectsUrl2", "getEffectsUrl2", "setEffectsUrl2", "textColor", "getTextColor", "setTextColor", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InRoomEffectsInfo implements Serializable {
        public static final int $stable = 8;
        private int effectsIndex1;
        private int effectsIndex2;

        @NotNull
        private String backgroundUrl = "";

        @NotNull
        private String badgeUrl = "";

        @NotNull
        private String effectsUrl1 = "";

        @NotNull
        private String effectsUrl2 = "";

        @NotNull
        private String textColor = "";

        @NotNull
        public final String getBackgroundUrl() {
            return this.backgroundUrl;
        }

        @NotNull
        public final String getBadgeUrl() {
            return this.badgeUrl;
        }

        public final int getEffectsIndex1() {
            return this.effectsIndex1;
        }

        public final int getEffectsIndex2() {
            return this.effectsIndex2;
        }

        @NotNull
        public final String getEffectsUrl1() {
            return this.effectsUrl1;
        }

        @NotNull
        public final String getEffectsUrl2() {
            return this.effectsUrl2;
        }

        @NotNull
        public final String getTextColor() {
            return this.textColor;
        }

        public final void setBackgroundUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.backgroundUrl = str;
        }

        public final void setBadgeUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.badgeUrl = str;
        }

        public final void setEffectsIndex1(int i) {
            this.effectsIndex1 = i;
        }

        public final void setEffectsIndex2(int i) {
            this.effectsIndex2 = i;
        }

        public final void setEffectsUrl1(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.effectsUrl1 = str;
        }

        public final void setEffectsUrl2(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.effectsUrl2 = str;
        }

        public final void setTextColor(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.textColor = str;
        }

        @NotNull
        public String toString() {
            String str = this.backgroundUrl;
            String str2 = this.badgeUrl;
            String str3 = this.effectsUrl1;
            int i = this.effectsIndex1;
            String str4 = this.effectsUrl2;
            int i2 = this.effectsIndex2;
            String str5 = this.textColor;
            StringBuilder sbOooO00o = OooO0OO.OooO00o("InRoomEffectsInfo(backgroundUrl='", str, "', badgeUrl='", str2, "', effectsUrl1='");
            sbOooO00o.append(str3);
            sbOooO00o.append("', effectsIndex1=");
            sbOooO00o.append(i);
            sbOooO00o.append(", effectsUrl2='");
            sbOooO00o.append(str4);
            sbOooO00o.append("', effectsIndex2=");
            sbOooO00o.append(i2);
            sbOooO00o.append(", textColor='");
            return o0oOO.OooO0O0(sbOooO00o, str5, "')");
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/room/RoomUserInfoDTO$ProfileCardInfo;", "Ljava/io/Serializable;", "()V", "avatarBorder", "", "getAvatarBorder", "()Ljava/lang/String;", "setAvatarBorder", "(Ljava/lang/String;)V", "backgroundEffectsUrl", "getBackgroundEffectsUrl", "setBackgroundEffectsUrl", "backgroundUrl", "getBackgroundUrl", "setBackgroundUrl", "darkBackgroundUrl", "getDarkBackgroundUrl", "setDarkBackgroundUrl", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ProfileCardInfo implements Serializable {
        public static final int $stable = 8;

        @NotNull
        private String backgroundEffectsUrl = "";

        @NotNull
        private String darkBackgroundUrl = "";

        @NotNull
        private String backgroundUrl = "";

        @NotNull
        private String avatarBorder = "";

        @NotNull
        public final String getAvatarBorder() {
            return this.avatarBorder;
        }

        @NotNull
        public final String getBackgroundEffectsUrl() {
            return this.backgroundEffectsUrl;
        }

        @NotNull
        public final String getBackgroundUrl() {
            return this.backgroundUrl;
        }

        @NotNull
        public final String getDarkBackgroundUrl() {
            return this.darkBackgroundUrl;
        }

        public final void setAvatarBorder(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.avatarBorder = str;
        }

        public final void setBackgroundEffectsUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.backgroundEffectsUrl = str;
        }

        public final void setBackgroundUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.backgroundUrl = str;
        }

        public final void setDarkBackgroundUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.darkBackgroundUrl = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/yalla/yalla/model/room/RoomUserInfoDTO$WealthInfo;", "Ljava/io/Serializable;", "()V", "badgeRoundedImg", "", "getBadgeRoundedImg", "()Ljava/lang/String;", "setBadgeRoundedImg", "(Ljava/lang/String;)V", "profileCardImg", "getProfileCardImg", "setProfileCardImg", "wealthBadgeLevel", "", "getWealthBadgeLevel", "()I", "setWealthBadgeLevel", "(I)V", "wealthBadgeUrl", "getWealthBadgeUrl", "setWealthBadgeUrl", "wealthLevel", "getWealthLevel", "setWealthLevel", "wealthShow", "", "getWealthShow", "()Z", "setWealthShow", "(Z)V", "wealthValue", "", "getWealthValue", "()J", "setWealthValue", "(J)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WealthInfo implements Serializable {
        public static final int $stable = 8;
        private int wealthBadgeLevel;
        private int wealthLevel;
        private boolean wealthShow;
        private long wealthValue;

        @NotNull
        private String wealthBadgeUrl = "";

        @NotNull
        private String profileCardImg = "";

        @NotNull
        private String badgeRoundedImg = "";

        @NotNull
        public final String getBadgeRoundedImg() {
            return this.badgeRoundedImg;
        }

        @NotNull
        public final String getProfileCardImg() {
            return this.profileCardImg;
        }

        public final int getWealthBadgeLevel() {
            return this.wealthBadgeLevel;
        }

        @NotNull
        public final String getWealthBadgeUrl() {
            return this.wealthBadgeUrl;
        }

        public final int getWealthLevel() {
            return this.wealthLevel;
        }

        public final boolean getWealthShow() {
            return this.wealthShow;
        }

        public final long getWealthValue() {
            return this.wealthValue;
        }

        public final void setBadgeRoundedImg(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.badgeRoundedImg = str;
        }

        public final void setProfileCardImg(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.profileCardImg = str;
        }

        public final void setWealthBadgeLevel(int i) {
            this.wealthBadgeLevel = i;
        }

        public final void setWealthBadgeUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.wealthBadgeUrl = str;
        }

        public final void setWealthLevel(int i) {
            this.wealthLevel = i;
        }

        public final void setWealthShow(boolean z) {
            this.wealthShow = z;
        }

        public final void setWealthValue(long j) {
            this.wealthValue = j;
        }
    }

    @NotNull
    public final String getBadgeLevelUrl() {
        return this.badgeLevelUrl;
    }

    public final boolean getBadgeState() {
        return this.badgeState;
    }

    @NotNull
    public final String getBadgeUrl() {
        return this.badgeUrl;
    }

    @Nullable
    public final ChatBubbleInfo getBubbleInfo() {
        return this.bubbleInfo;
    }

    public final int getConveneNum() {
        return this.conveneNum;
    }

    public final long getDayContributeNum() {
        return this.dayContributeNum;
    }

    public final boolean getHasMic() {
        return this.hasMic;
    }

    public final int getHeadPhotoResId() {
        return this.headPhotoResId;
    }

    public final int getHeaderCardId() {
        return this.headerCardId;
    }

    @NotNull
    public final String getHeaderCardUrl() {
        return this.headerCardUrl;
    }

    @Nullable
    public final String getInRoomEffectsInfo() {
        return this.inRoomEffectsInfo;
    }

    public final long getLasttime() {
        return this.lasttime;
    }

    public final int getMemberLevel() {
        return this.memberLevel;
    }

    public final int getMicPosition() {
        return this.micPosition;
    }

    public final long getPriority() {
        return this.priority;
    }

    @Nullable
    public final String getProfileCardInfo() {
        return this.profileCardInfo;
    }

    public final int getRankDay() {
        return this.rankDay;
    }

    public final int getRankWeek() {
        return this.rankWeek;
    }

    public final int getRoomMemberType() {
        return this.roomMemberType;
    }

    public final boolean getShowPremiumFirst() {
        return this.showPremiumFirst;
    }

    public final boolean getSilenced() {
        return this.silenced;
    }

    public final int getVehicleId() {
        return this.vehicleId;
    }

    @NotNull
    public final String getVehicleSVGAUrl() {
        return this.vehicleSVGAUrl;
    }

    @NotNull
    public final String getVehicleUrl() {
        return this.vehicleUrl;
    }

    public final int getVoiceChangerId() {
        return this.voiceChangerId;
    }

    @NotNull
    public final String getWealthBadge() {
        String currBadgeImg;
        String str = this.wealthBadge;
        if (!StringsKt.isBlank(str)) {
            return str;
        }
        UserInfo.WealthLevelModel wealthLv = getWealthLv();
        return (wealthLv == null || (currBadgeImg = wealthLv.getCurrBadgeImg()) == null) ? this.wealthBadge : currBadgeImg;
    }

    @NotNull
    public final String getWealthProfileCardImg() {
        String wealthProfileCardImg;
        String str = this.wealthProfileCardImg;
        if (!StringsKt.isBlank(str)) {
            return str;
        }
        UserInfo.WealthLevelModel wealthLv = getWealthLv();
        return (wealthLv == null || (wealthProfileCardImg = wealthLv.getWealthProfileCardImg()) == null) ? this.wealthProfileCardImg : wealthProfileCardImg;
    }

    public final long getWeekContributeNum() {
        return this.weekContributeNum;
    }

    /* JADX INFO: renamed from: isInRoom, reason: from getter */
    public final boolean getIsInRoom() {
        return this.isInRoom;
    }

    /* JADX INFO: renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: isSelectedForSendHats, reason: from getter */
    public final boolean getIsSelectedForSendHats() {
        return this.isSelectedForSendHats;
    }

    /* JADX INFO: renamed from: isSetting, reason: from getter */
    public final boolean getIsSetting() {
        return this.isSetting;
    }

    /* JADX INFO: renamed from: isTopRank, reason: from getter */
    public final boolean getIsTopRank() {
        return this.isTopRank;
    }

    /* JADX INFO: renamed from: isUnLoginUser, reason: from getter */
    public final boolean getIsUnLoginUser() {
        return this.isUnLoginUser;
    }

    public final void setBadgeLevelUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.badgeLevelUrl = str;
    }

    public final void setBadgeState(boolean z) {
        this.badgeState = z;
    }

    public final void setBadgeUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.badgeUrl = str;
    }

    public final void setBubbleInfo(@Nullable ChatBubbleInfo chatBubbleInfo) {
        this.bubbleInfo = chatBubbleInfo;
    }

    public final void setConveneNum(int i) {
        this.conveneNum = i;
    }

    public final void setDayContributeNum(long j) {
        this.dayContributeNum = j;
    }

    public final void setHasMic(boolean z) {
        this.hasMic = z;
    }

    public final void setHeadPhotoResId(int i) {
        this.headPhotoResId = i;
    }

    public final void setHeaderCardId(int i) {
        this.headerCardId = i;
    }

    public final void setHeaderCardUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.headerCardUrl = str;
    }

    public final void setInRoom(boolean z) {
        this.isInRoom = z;
    }

    public final void setInRoomEffectsInfo(@Nullable String str) {
        this.inRoomEffectsInfo = str;
    }

    public final void setLasttime(long j) {
        this.lasttime = j;
    }

    public final void setMemberLevel(int i) {
        this.memberLevel = i;
    }

    public final void setMicPosition(int i) {
        this.micPosition = i;
    }

    public final void setPriority(long j) {
        this.priority = j;
    }

    public final void setProfileCardInfo(@Nullable String str) {
        this.profileCardInfo = str;
    }

    public final void setRankDay(int i) {
        this.rankDay = i;
    }

    public final void setRankWeek(int i) {
        this.rankWeek = i;
    }

    public final void setRoomMemberType(int i) {
        this.roomMemberType = i;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setSelectedForSendHats(boolean z) {
        this.isSelectedForSendHats = z;
    }

    public final void setSetting(boolean z) {
        this.isSetting = z;
    }

    public final void setShowPremiumFirst(boolean z) {
        this.showPremiumFirst = z;
    }

    public final void setSilenced(boolean z) {
        this.silenced = z;
    }

    public final void setTopRank(boolean z) {
        this.isTopRank = z;
    }

    public final void setUnLoginUser(boolean z) {
        this.isUnLoginUser = z;
    }

    public final void setVehicleId(int i) {
        this.vehicleId = i;
    }

    public final void setVehicleSVGAUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vehicleSVGAUrl = str;
    }

    public final void setVehicleUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.vehicleUrl = str;
    }

    public final void setVoiceChangerId(int i) {
        this.voiceChangerId = i;
    }

    public final void setWealthBadge(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wealthBadge = str;
    }

    public final void setWealthProfileCardImg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wealthProfileCardImg = str;
    }

    public final void setWeekContributeNum(long j) {
        this.weekContributeNum = j;
    }
}
