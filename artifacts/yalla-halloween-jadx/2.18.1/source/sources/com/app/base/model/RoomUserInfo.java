package com.app.base.model;

import OooO00o.OooO00o;
import com.app.base.bean.AbsJavaBean;
import com.app.base.protobuf.room.Room;
import com.facebook.appevents.AppEventsConstants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
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

    @Override // com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("UserModel{hasmic=");
        sbOooO0o0.append(this.hasmic);
        sbOooO0o0.append(", headphoto='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.headphoto, '\'', ", level='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.level, '\'', ", morder=");
        sbOooO0o0.append(this.morder);
        sbOooO0o0.append(", name='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.name, '\'', ", position=");
        sbOooO0o0.append(this.position);
        sbOooO0o0.append(", prettyid='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.prettyid, '\'', ", uid='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.uid, '\'', ", role=");
        sbOooO0o0.append(this.role);
        sbOooO0o0.append(", sex=");
        sbOooO0o0.append(this.sex);
        sbOooO0o0.append(", silenced=");
        sbOooO0o0.append(this.silenced);
        sbOooO0o0.append(", vehicle=");
        sbOooO0o0.append(this.vehicle);
        sbOooO0o0.append(", vip=");
        sbOooO0o0.append(this.vip);
        sbOooO0o0.append(", viplevel=");
        sbOooO0o0.append(this.viplevel);
        sbOooO0o0.append(", rankweek=");
        sbOooO0o0.append(this.rankweek);
        sbOooO0o0.append(", rankday=");
        sbOooO0o0.append(this.rankday);
        sbOooO0o0.append(", priority=");
        sbOooO0o0.append(this.priority);
        sbOooO0o0.append(", isprettypara=");
        sbOooO0o0.append(this.isprettypara);
        sbOooO0o0.append(", medal='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.medal, '\'', ", headweared=");
        sbOooO0o0.append(this.headweared);
        sbOooO0o0.append(", headweareURL='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.headweareURL, '\'', ", headframeurl='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.headframeurl, '\'', ", touristmode=");
        sbOooO0o0.append(this.touristmode);
        sbOooO0o0.append(", vehicleid=");
        sbOooO0o0.append(this.vehicleid);
        sbOooO0o0.append(", carsvga='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.carsvga, '\'', ", carimg='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.carimg, '\'', ", kaVipLv=");
        sbOooO0o0.append(this.kaVipLv);
        sbOooO0o0.append(", kaVipState=");
        sbOooO0o0.append(this.kaVipState);
        sbOooO0o0.append(", showKAVIP=");
        sbOooO0o0.append(this.showKAVIP);
        sbOooO0o0.append(", isSelectedForSendHats=");
        sbOooO0o0.append(this.isSelectedForSendHats);
        sbOooO0o0.append(", showPremiumFirst=");
        sbOooO0o0.append(this.showPremiumFirst);
        sbOooO0o0.append(", headPhotoResId=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.headPhotoResId, '}');
    }
}
