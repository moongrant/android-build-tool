package com.yalla.yalla.model.room;

import androidx.compose.foundation.layout.OooO0O0;
import com.app.base.protobuf.room.Room;
import com.facebook.appevents.AppEventsConstants;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.model.bean.AbsJavaBean;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class RoomUserInfo extends AbsJavaBean {
    public static final int ROLE_OFFICIAL = 2;
    public static final int VIP = 1;
    public String badgeLevelUrl;
    public boolean badgeState;
    public String badgeUrl;
    public BubbleInfo bubbleInfo;
    public String carimg;
    public String carsvga;
    public int hasmic;
    public int headPhotoResId;
    public String headframeurl;
    public String headphoto;

    @SerializedName("headweareURLNew")
    public String headweareURL;
    public int headweared;
    public boolean isTopRank;

    @SerializedName(alternate = {"isprettypara"}, value = "prettyIdFlag")
    public int isprettypara;

    @SerializedName(alternate = {"kaVipLv"}, value = "kaviplv")
    public int kaVipLv;

    @SerializedName(alternate = {"kaVipState"}, value = "kavipstate")
    public int kaVipState;
    public String level;
    public String medal;
    public int memberLevel;

    @Deprecated
    public int morder;
    public String name;
    public int position;
    public String prettyid;
    public long priority;
    public int rankday;
    public int rankweek;
    public int role;
    public int sex;

    @SerializedName(alternate = {"showKAVIP"}, value = "showkavip")
    public int showKAVIP;
    public int showPremiumFirst;
    public int silenced;
    public int touristmode;
    public int vehicle;
    public long vehicleid;

    @SerializedName("isVIP")
    public int vip;

    @SerializedName(alternate = {"nVipLv"}, value = "nVIPLv")
    public int viplevel;
    public String uid = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    public boolean isSelectedForSendHats = false;

    public static class BubbleInfo implements Serializable {
        public String bubbleColour = "#FFFFFF";
        public String bubbleReplyColour = "#FFFFFF";
        public String bubbleUrl = "";
    }

    public static RoomUserInfo of(Room.UserModel userModel) {
        RoomUserInfo roomUserInfo = new RoomUserInfo();
        roomUserInfo.uid = userModel.getUserId() + "";
        roomUserInfo.name = userModel.getName();
        roomUserInfo.sex = userModel.getSex();
        roomUserInfo.headphoto = userModel.getHeadphoto();
        roomUserInfo.headframeurl = userModel.getHeadframeurl();
        roomUserInfo.headweared = userModel.getHeadweared();
        roomUserInfo.headweareURL = userModel.getHeadweareURLNew();
        roomUserInfo.rankweek = userModel.getRankweek();
        roomUserInfo.rankday = userModel.getRankday();
        roomUserInfo.carimg = userModel.getCarimg();
        roomUserInfo.vehicleid = userModel.getVehicleid();
        roomUserInfo.position = userModel.getPosition();
        roomUserInfo.vip = userModel.getVip();
        roomUserInfo.viplevel = userModel.getNVipLv();
        roomUserInfo.hasmic = userModel.getHasMic();
        roomUserInfo.isprettypara = userModel.getIsprettypara();
        roomUserInfo.prettyid = userModel.getPrettyid() + "";
        roomUserInfo.level = userModel.getLevel() + "";
        roomUserInfo.medal = userModel.getMedal();
        roomUserInfo.silenced = userModel.getSilenced();
        roomUserInfo.role = userModel.getRole();
        roomUserInfo.showKAVIP = userModel.getShowKAVIP();
        roomUserInfo.kaVipState = userModel.getKaVipState();
        roomUserInfo.kaVipLv = userModel.getKaVipLv();
        roomUserInfo.memberLevel = userModel.getMemberLevel();
        roomUserInfo.badgeState = userModel.getBadgeState() == 1;
        roomUserInfo.badgeUrl = userModel.getBadgeUrl();
        roomUserInfo.badgeLevelUrl = userModel.getBadgeLevelUrl();
        roomUserInfo.isTopRank = userModel.getIsTopRank();
        roomUserInfo.isTopRank = userModel.getIsTopRank();
        BubbleInfo bubbleInfo = new BubbleInfo();
        bubbleInfo.bubbleUrl = userModel.getBubbleInfo().getBubbleUrl();
        bubbleInfo.bubbleColour = userModel.getBubbleInfo().getBubbleColour();
        bubbleInfo.bubbleReplyColour = userModel.getBubbleInfo().getBubbleReplyColour();
        roomUserInfo.bubbleInfo = bubbleInfo;
        return roomUserInfo;
    }

    public int getHasmic() {
        return this.hasmic;
    }

    public String getHeadFrameUrl() {
        return this.headframeurl;
    }

    public String getHeadphoto() {
        return this.headphoto;
    }

    public String getLevel() {
        return this.level;
    }

    public String getMedal() {
        return this.medal;
    }

    public int getMorder() {
        return this.morder;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    public String getPrettyid() {
        return this.prettyid;
    }

    public long getPriority() {
        return this.priority;
    }

    public int getRankday() {
        return this.rankday;
    }

    public int getRankweek() {
        return this.rankweek;
    }

    public int getSex() {
        return this.sex;
    }

    public int getSilenced() {
        return this.silenced;
    }

    public String getUid() {
        return this.uid;
    }

    public int getVip() {
        return this.vip;
    }

    public RoomUserInfo initGiftUser(String str, String str2, String str3) {
        this.uid = str;
        this.name = str2;
        this.headphoto = str3;
        return this;
    }

    public boolean isOfficialRole() {
        int i = this.role;
        return i == 2 || i == 4;
    }

    public void setHeadFrameUrl(String str) {
        this.headframeurl = str;
    }

    public void setMedal(String str) {
        this.medal = str;
    }

    @Override // com.yalla.yalla.model.bean.AbsJavaBean
    public String toString() {
        StringBuilder sb = new StringBuilder("UserModel{hasmic=");
        sb.append(this.hasmic);
        sb.append(", headphoto='");
        sb.append(this.headphoto);
        sb.append("', level='");
        sb.append(this.level);
        sb.append("', morder=");
        sb.append(this.morder);
        sb.append(", name='");
        sb.append(this.name);
        sb.append("', position=");
        sb.append(this.position);
        sb.append(", prettyid='");
        sb.append(this.prettyid);
        sb.append("', uid='");
        sb.append(this.uid);
        sb.append("', role=");
        sb.append(this.role);
        sb.append(", sex=");
        sb.append(this.sex);
        sb.append(", silenced=");
        sb.append(this.silenced);
        sb.append(", vehicle=");
        sb.append(this.vehicle);
        sb.append(", vip=");
        sb.append(this.vip);
        sb.append(", viplevel=");
        sb.append(this.viplevel);
        sb.append(", rankweek=");
        sb.append(this.rankweek);
        sb.append(", rankday=");
        sb.append(this.rankday);
        sb.append(", priority=");
        sb.append(this.priority);
        sb.append(", isprettypara=");
        sb.append(this.isprettypara);
        sb.append(", medal='");
        sb.append(this.medal);
        sb.append("', headweared=");
        sb.append(this.headweared);
        sb.append(", headweareURL='");
        sb.append(this.headweareURL);
        sb.append("', headframeurl='");
        sb.append(this.headframeurl);
        sb.append("', touristmode=");
        sb.append(this.touristmode);
        sb.append(", vehicleid=");
        sb.append(this.vehicleid);
        sb.append(", carsvga='");
        sb.append(this.carsvga);
        sb.append("', carimg='");
        sb.append(this.carimg);
        sb.append("', kaVipLv=");
        sb.append(this.kaVipLv);
        sb.append(", kaVipState=");
        sb.append(this.kaVipState);
        sb.append(", showKAVIP=");
        sb.append(this.showKAVIP);
        sb.append(", isSelectedForSendHats=");
        sb.append(this.isSelectedForSendHats);
        sb.append(", showPremiumFirst=");
        sb.append(this.showPremiumFirst);
        sb.append(", headPhotoResId=");
        return OooO0O0.OooO00o(sb, this.headPhotoResId, '}');
    }
}
