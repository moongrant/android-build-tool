package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Ignore;
import com.app.base.protobuf.room.Room;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.common.ui.view.VipState;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p254o00ooO0O.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b*\b\u0017\u0018\u0000 j2\u00020\u00012\u00020\u0002:\u0003kjlB\u0007¢\u0006\u0004\bh\u0010iJ\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000R*\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038F@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R*\u0010\u0019\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038F@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR\"\u0010\u001c\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\"\u0010\u001f\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0011\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015R\"\u0010-\u001a\u00020,8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00103\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010\n\u001a\u0004\b3\u0010\f\"\u0004\b4\u0010\u000eR\"\u00105\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0011\u001a\u0004\b6\u0010\u0013\"\u0004\b7\u0010\u0015R\"\u00108\u001a\u00020,8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010.\u001a\u0004\b9\u00100\"\u0004\b:\u00102R\"\u0010;\u001a\u00020,8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010.\u001a\u0004\b<\u00100\"\u0004\b=\u00102R\"\u0010>\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\n\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010\u000eR\"\u0010@\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\n\u001a\u0004\bA\u0010\f\"\u0004\bB\u0010\u000eR$\u0010D\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010J\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010\n\u001a\u0004\bK\u0010\f\"\u0004\bL\u0010\u000eR\"\u0010M\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010\u0011\u001a\u0004\bN\u0010\u0013\"\u0004\bO\u0010\u0015R\"\u0010P\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010.\u001a\u0004\bQ\u00100\"\u0004\bR\u00102R\"\u0010S\u001a\u00020,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010.\u001a\u0004\bT\u00100\"\u0004\bU\u00102R\"\u0010V\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010\n\u001a\u0004\bV\u0010\f\"\u0004\bW\u0010\u000eR\"\u0010X\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010\n\u001a\u0004\bX\u0010\f\"\u0004\bY\u0010\u000eR\"\u0010Z\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010$\u001a\u0004\b[\u0010&\"\u0004\b\\\u0010(R\"\u0010]\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010\u0011\u001a\u0004\b^\u0010\u0013\"\u0004\b_\u0010\u0015R\"\u0010`\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010\n\u001a\u0004\b`\u0010\f\"\u0004\ba\u0010\u000eR\"\u0010b\u001a\u00020\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bb\u0010$\u001a\u0004\bc\u0010&\"\u0004\bd\u0010(R\"\u0010e\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010\u0011\u001a\u0004\bf\u0010\u0013\"\u0004\bg\u0010\u0015¨\u0006m"}, d2 = {"Lcom/yalla/yalla/model/RoomUserInfoModel;", "Lcom/yalla/yalla/common/model/UserInfoModel;", "Ljava/io/Serializable;", "", "needShowPremium", "userInfo", "", "updateInfo", AppMeasurementSdk.ConditionalUserProperty.VALUE, "hasMic", "Z", "getHasMic", "()Z", "setHasMic", "(Z)V", "", "micPosition", "I", "getMicPosition", "()I", "setMicPosition", "(I)V", "roomMemberType", "getRoomMemberType", "setRoomMemberType", "silenced", "getSilenced", "setSilenced", "rankWeek", "getRankWeek", "setRankWeek", "rankDay", "getRankDay", "setRankDay", "", "priority", "J", "getPriority", "()J", "setPriority", "(J)V", "headerCardId", "getHeaderCardId", "setHeaderCardId", "", "headerCardUrl", "Ljava/lang/String;", "getHeaderCardUrl", "()Ljava/lang/String;", "setHeaderCardUrl", "(Ljava/lang/String;)V", "isUnLoginUser", "setUnLoginUser", "vehicleId", "getVehicleId", "setVehicleId", "vehicleUrl", "getVehicleUrl", "setVehicleUrl", "vehicleSVGAUrl", "getVehicleSVGAUrl", "setVehicleSVGAUrl", "isSelectedForSendHats", "setSelectedForSendHats", "showPremiumFirst", "getShowPremiumFirst", "setShowPremiumFirst", "Lcom/yalla/yalla/model/RoomUserInfoModel$ChatBubbleInfo;", "bubbleInfo", "Lcom/yalla/yalla/model/RoomUserInfoModel$ChatBubbleInfo;", "getBubbleInfo", "()Lcom/yalla/yalla/model/RoomUserInfoModel$ChatBubbleInfo;", "setBubbleInfo", "(Lcom/yalla/yalla/model/RoomUserInfoModel$ChatBubbleInfo;)V", "badgeState", "getBadgeState", "setBadgeState", "memberLevel", "getMemberLevel", "setMemberLevel", "badgeUrl", "getBadgeUrl", "setBadgeUrl", "badgeLevelUrl", "getBadgeLevelUrl", "setBadgeLevelUrl", "isTopRank", "setTopRank", "isSelected", "setSelected", "lasttime", "getLasttime", "setLasttime", "headPhotoResId", "getHeadPhotoResId", "setHeadPhotoResId", "isSetting", "setSetting", "realUserId", "getRealUserId", "setRealUserId", "conveneNum", "getConveneNum", "setConveneNum", "<init>", "()V", "Companion", "ChatBubbleInfo", "RoomMemberType", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public class RoomUserInfoModel extends UserInfoModel {

    @Ignore
    @Nullable
    private transient o0O00OO<Boolean> _hasMic;

    @Ignore
    @Nullable
    private transient o0O00OO<Boolean> _silenced;

    @NotNull
    private String badgeLevelUrl;
    private boolean badgeState;

    @NotNull
    private String badgeUrl;

    @Nullable
    private ChatBubbleInfo bubbleInfo;
    private int conveneNum;

    @SerializedName("hasmic")
    private boolean hasMic;
    private int headPhotoResId;

    @SerializedName(alternate = {"headweared"}, value = "headerCardId")
    private int headerCardId;

    @SerializedName(alternate = {"headweareURLNew"}, value = "headerCardUrl")
    @NotNull
    private String headerCardUrl;
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

    @SerializedName("rankday")
    private int rankDay;

    @SerializedName("rankweek")
    private int rankWeek;

    @SerializedName("realuserid")
    private long realUserId;

    @SerializedName(alternate = {"positionid"}, value = "position")
    private int roomMemberType;
    private boolean showPremiumFirst;

    @SerializedName("silenced")
    private boolean silenced;

    @SerializedName(alternate = {"vehicle", "vehicleid"}, value = "vehicleId")
    private int vehicleId;

    @SerializedName(alternate = {"carsvga"}, value = "vehicleSVGAUrl")
    @NotNull
    private String vehicleSVGAUrl;

    @SerializedName(alternate = {"carimg", "vehicleStaticImg"}, value = "vehicleUrl")
    @NotNull
    private String vehicleUrl;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/model/RoomUserInfoModel$ChatBubbleInfo;", "Ljava/io/Serializable;", "()V", "bubbleColour", "", "getBubbleColour", "()Ljava/lang/String;", "setBubbleColour", "(Ljava/lang/String;)V", "bubbleReplyColour", "getBubbleReplyColour", "setBubbleReplyColour", "bubbleUrl", "getBubbleUrl", "setBubbleUrl", "isDefaultBubble", "", "()Z", "setDefaultBubble", "(Z)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/yalla/yalla/model/RoomUserInfoModel$Companion;", "", "()V", "of", "Lcom/yalla/yalla/model/RoomUserInfoModel;", "userModel", "Lcom/app/base/protobuf/room/Room$UserModel;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RoomUserInfoModel of(@NotNull Room.UserModel userModel) {
            Intrinsics.checkNotNullParameter(userModel, "userModel");
            RoomUserInfoModel roomUserInfoModel = new RoomUserInfoModel();
            roomUserInfoModel.setUserId(userModel.getUserId());
            String name = userModel.getName();
            Intrinsics.checkNotNullExpressionValue(name, "userModel.name");
            roomUserInfoModel.setUserName(name);
            roomUserInfoModel.setSex(userModel.getSex());
            String headphoto = userModel.getHeadphoto();
            Intrinsics.checkNotNullExpressionValue(headphoto, "userModel.headphoto");
            roomUserInfoModel.setUserHeader(headphoto);
            roomUserInfoModel.setUserHeaderFrame(userModel.getHeadframeurl());
            roomUserInfoModel.setHeaderCardId(userModel.getHeadweared());
            String headweareURLNew = userModel.getHeadweareURLNew();
            Intrinsics.checkNotNullExpressionValue(headweareURLNew, "userModel.headweareURLNew");
            roomUserInfoModel.setHeaderCardUrl(headweareURLNew);
            roomUserInfoModel.setRankWeek(userModel.getRankweek());
            roomUserInfoModel.setRankDay(userModel.getRankday());
            roomUserInfoModel.setVehicleId(userModel.getVehicleid());
            String carimg = userModel.getCarimg();
            Intrinsics.checkNotNullExpressionValue(carimg, "userModel.carimg");
            roomUserInfoModel.setVehicleUrl(carimg);
            String carsvga = userModel.getCarsvga();
            Intrinsics.checkNotNullExpressionValue(carsvga, "userModel.carsvga");
            roomUserInfoModel.setVehicleSVGAUrl(carsvga);
            roomUserInfoModel.setPriority(userModel.getPriority());
            roomUserInfoModel.setRoomMemberType(userModel.getPosition());
            roomUserInfoModel.setShowPremiumFirst(o000Oo0.OooO00o(Integer.valueOf(userModel.getShowPremiumFirst())));
            roomUserInfoModel.setPremium(o000Oo0.OooO00o(Integer.valueOf(userModel.getIsVIP())));
            roomUserInfoModel.setPremiumLevel(userModel.getNVipLv());
            roomUserInfoModel.setIdLevel(userModel.getIsprettypara());
            roomUserInfoModel.setUserIdx(String.valueOf(userModel.getPrettyid()));
            roomUserInfoModel.setUserLevel(userModel.getLevel());
            roomUserInfoModel.setMedal(userModel.getMedal());
            roomUserInfoModel.setSilenced(o000Oo0.OooO00o(Integer.valueOf(userModel.getSilenced())));
            roomUserInfoModel.setRole(userModel.getRole());
            roomUserInfoModel.setShowVIP(o000Oo0.OooO00o(Integer.valueOf(userModel.getShowKAVIP())));
            roomUserInfoModel.setVipState(userModel.getKaVipState());
            roomUserInfoModel.setVipLevel(userModel.getKaVipLv());
            roomUserInfoModel.setMemberLevel(userModel.getMemberLevel());
            roomUserInfoModel.setBadgeState(userModel.getBadgeState() == 1);
            String badgeUrl = userModel.getBadgeUrl();
            Intrinsics.checkNotNullExpressionValue(badgeUrl, "userModel.badgeUrl");
            roomUserInfoModel.setBadgeUrl(badgeUrl);
            String badgeLevelUrl = userModel.getBadgeLevelUrl();
            Intrinsics.checkNotNullExpressionValue(badgeLevelUrl, "userModel.badgeLevelUrl");
            roomUserInfoModel.setBadgeLevelUrl(badgeLevelUrl);
            roomUserInfoModel.setTopRank(userModel.getIsTopRank());
            roomUserInfoModel.setHasMic(o000Oo0.OooO00o(Integer.valueOf(userModel.getHasMic())));
            ChatBubbleInfo chatBubbleInfo = new ChatBubbleInfo();
            String bubbleUrl = userModel.getBubbleInfo().getBubbleUrl();
            Intrinsics.checkNotNullExpressionValue(bubbleUrl, "userModel.bubbleInfo.bubbleUrl");
            chatBubbleInfo.setBubbleUrl(bubbleUrl);
            String bubbleColour = userModel.getBubbleInfo().getBubbleColour();
            Intrinsics.checkNotNullExpressionValue(bubbleColour, "userModel.bubbleInfo.bubbleColour");
            chatBubbleInfo.setBubbleColour(bubbleColour);
            String bubbleReplyColour = userModel.getBubbleInfo().getBubbleReplyColour();
            Intrinsics.checkNotNullExpressionValue(bubbleReplyColour, "userModel.bubbleInfo.bubbleReplyColour");
            chatBubbleInfo.setBubbleReplyColour(bubbleReplyColour);
            roomUserInfoModel.setBubbleInfo(chatBubbleInfo);
            return roomUserInfoModel;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/model/RoomUserInfoModel$RoomMemberType;", "", "()V", "ROOM_ADMIN", "", "ROOM_GUEST", "ROOM_HOST", "ROOM_MEMBER", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class RoomMemberType {
        public static final int $stable = 0;

        @NotNull
        public static final RoomMemberType INSTANCE = new RoomMemberType();
        public static final int ROOM_ADMIN = 2;
        public static final int ROOM_GUEST = 0;
        public static final int ROOM_HOST = 1;
        public static final int ROOM_MEMBER = 3;

        private RoomMemberType() {
        }
    }

    public RoomUserInfoModel() {
        Boolean bool = Boolean.FALSE;
        this._hasMic = o0OOO00.OooO0Oo(bool);
        this._silenced = o0OOO00.OooO0Oo(bool);
        this.headerCardUrl = "";
        this.vehicleUrl = "";
        this.vehicleSVGAUrl = "";
        this.badgeUrl = "";
        this.badgeLevelUrl = "";
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

    public final boolean getHasMic() {
        if (this._hasMic == null) {
            this._hasMic = o0OOO00.OooO0Oo(Boolean.valueOf(this.hasMic));
        }
        boolean z = this.hasMic;
        o0O00OO<Boolean> o0o00oo2 = this._hasMic;
        Intrinsics.checkNotNull(o0o00oo2);
        if (z != o0o00oo2.getValue().booleanValue()) {
            o0O00OO<Boolean> o0o00oo3 = this._hasMic;
            Intrinsics.checkNotNull(o0o00oo3);
            o0o00oo3.setValue(Boolean.valueOf(this.hasMic));
        }
        o0O00OO<Boolean> o0o00oo4 = this._hasMic;
        Intrinsics.checkNotNull(o0o00oo4);
        return o0o00oo4.getValue().booleanValue();
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

    public final int getRankDay() {
        return this.rankDay;
    }

    public final int getRankWeek() {
        return this.rankWeek;
    }

    public final long getRealUserId() {
        return this.realUserId;
    }

    public final int getRoomMemberType() {
        return this.roomMemberType;
    }

    public final boolean getShowPremiumFirst() {
        return this.showPremiumFirst;
    }

    public final boolean getSilenced() {
        if (this._silenced == null) {
            this._silenced = o0OOO00.OooO0Oo(Boolean.valueOf(this.silenced));
        }
        boolean z = this.silenced;
        o0O00OO<Boolean> o0o00oo2 = this._silenced;
        Intrinsics.checkNotNull(o0o00oo2);
        if (z != o0o00oo2.getValue().booleanValue()) {
            o0O00OO<Boolean> o0o00oo3 = this._silenced;
            Intrinsics.checkNotNull(o0o00oo3);
            o0o00oo3.setValue(Boolean.valueOf(this.silenced));
        }
        o0O00OO<Boolean> o0o00oo4 = this._silenced;
        Intrinsics.checkNotNull(o0o00oo4);
        return o0o00oo4.getValue().booleanValue();
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

    public final boolean needShowPremium() {
        return (isPremium() && getVipState() == VipState.Vip.getValue() && (this.showPremiumFirst || !getShowVIP())) || (isPremium() && getVipState() != VipState.Vip.getValue());
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

    public final void setHasMic(boolean z) {
        this.hasMic = z;
        if (this._hasMic == null) {
            this._hasMic = o0OOO00.OooO0Oo(Boolean.valueOf(z));
        }
        o0O00OO<Boolean> o0o00oo2 = this._hasMic;
        Intrinsics.checkNotNull(o0o00oo2);
        o0o00oo2.setValue(Boolean.valueOf(z));
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

    public final void setRankDay(int i) {
        this.rankDay = i;
    }

    public final void setRankWeek(int i) {
        this.rankWeek = i;
    }

    public final void setRealUserId(long j) {
        this.realUserId = j;
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
        if (this._silenced == null) {
            this._silenced = o0OOO00.OooO0Oo(Boolean.valueOf(z));
        }
        o0O00OO<Boolean> o0o00oo2 = this._silenced;
        Intrinsics.checkNotNull(o0o00oo2);
        o0o00oo2.setValue(Boolean.valueOf(z));
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

    public final void updateInfo(@NotNull RoomUserInfoModel userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        super.updateInfo((UserInfoModel) userInfo);
        setHasMic(userInfo.getHasMic());
        this.micPosition = userInfo.micPosition;
        this.roomMemberType = userInfo.roomMemberType;
        setSilenced(userInfo.getSilenced());
        this.rankWeek = userInfo.rankWeek;
        this.rankDay = userInfo.rankDay;
        this.priority = userInfo.priority;
        this.headerCardId = userInfo.headerCardId;
        this.headerCardUrl = userInfo.headerCardUrl;
        this.vehicleId = userInfo.vehicleId;
        this.vehicleUrl = userInfo.vehicleUrl;
        this.vehicleSVGAUrl = userInfo.vehicleSVGAUrl;
        this.showPremiumFirst = userInfo.showPremiumFirst;
        this.bubbleInfo = userInfo.bubbleInfo;
        this.badgeState = userInfo.badgeState;
        this.memberLevel = userInfo.memberLevel;
        this.badgeUrl = userInfo.badgeUrl;
        this.badgeLevelUrl = userInfo.badgeLevelUrl;
        this.isTopRank = userInfo.isTopRank;
    }
}
