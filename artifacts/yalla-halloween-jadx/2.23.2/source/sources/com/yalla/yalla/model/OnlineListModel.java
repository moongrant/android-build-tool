package com.yalla.yalla.model;

import androidx.compose.foundation.layout.OooO0O0;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.mixedroom.model.RoomCommonModel;
import com.yalla.yalla.model.bean.AbsJavaBean;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineListModel extends CommonModel {
    public static final int INMIC = 1;
    public static final int OUTMIC = 0;
    public int IsOfficial;
    public String carimg;
    public String carsvga;
    public int hasmic;

    @SerializedName("headframeurl")
    public String headFrameUrl;
    public String headphoto;

    @SerializedName("headweareURLNew")
    public String headweareURL;
    public int headweared;
    public int isprettyid;

    @SerializedName(alternate = {"kaVipLv"}, value = "kaviplv")
    public int kaVipLv;

    @SerializedName(alternate = {"kaVipState"}, value = "kavipstate")
    public int kaVipState;
    public int level;
    public String medal;
    public int morder;
    public String name;
    public int panda;
    public int position;
    public String prettyid;
    public long priority;
    public int rankday;
    public int rankweek;
    public int role = 0;
    public int sex;

    @SerializedName(alternate = {"showKAVIP"}, value = "showkavip")
    public int showKAVIP;
    public int showPremiumFirst;
    public int silenced;
    public String uid;
    public int vehicle;
    public long vehicleid;

    @SerializedName("isVIP")
    public int vip;

    @SerializedName(alternate = {"nVipLv"}, value = "nVIPLv")
    public int viplevel;
    public int voicecard;

    public static class Member extends AbsJavaBean {
        public String badgeLevelUrl;
        public boolean badgeState;
        public String badgeUrl;
        public String headurl;
        public boolean isTopRank;
        public int kaVIPLv;
        private long lasttime;
        public int memberLevel;
        public String nickname;
        public String positionid;
        public int role;
        public int sex;
        public String userid;
        public String userlevel;

        @SerializedName("isVIP")
        public int vip;

        @SerializedName(alternate = {"nVipLv"}, value = "nVIPLv")
        public int viplevel;
        private boolean setting = false;
        public boolean localIsSelected = false;

        public long getLasttime() {
            return this.lasttime;
        }

        public String getNickname() {
            return this.nickname;
        }

        public String getPositionid() {
            return this.positionid;
        }

        public int getSex() {
            return this.sex;
        }

        public String getUserid() {
            return this.userid;
        }

        public int getVip() {
            return this.vip;
        }

        public boolean isSetting() {
            return this.setting;
        }

        public void setPositionid(String str) {
            this.positionid = str;
        }

        public void setSetting(boolean z) {
            this.setting = z;
        }
    }

    public static class MemberApplication {
        public String headphoto;
        public String level;
        public String name;
        public String uid;
    }

    public static class Micorder extends RoomCommonModel {
        public long expire;
        public String micorder;
        public String reason;
        public String url;
        public OnlineListModel user;
        public String userid;

        @Override // com.yalla.yalla.model.bean.AbsJavaBean
        public String toString() {
            StringBuilder sb = new StringBuilder("Micorder{micorder='");
            sb.append(this.micorder);
            sb.append("', url='");
            sb.append(this.url);
            sb.append("', user=");
            sb.append(this.user);
            sb.append(", userid='");
            sb.append(this.userid);
            sb.append("', reason='");
            return o0oOO.OooO0O0(sb, this.reason, "'}");
        }
    }

    public static class WithWheat extends CommonModel {
        public OnlineListModel from;
        public int micorder;
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    @Override // com.yalla.yalla.model.CommonModel, com.yalla.yalla.model.bean.AbsJavaBean
    public String toString() {
        StringBuilder sb = new StringBuilder("OnlineListModel{uid='");
        sb.append(this.uid);
        sb.append("', name='");
        sb.append(this.name);
        sb.append("', headphoto='");
        sb.append(this.headphoto);
        sb.append("', position='");
        sb.append(this.position);
        sb.append("', level='");
        sb.append(this.level);
        sb.append("', silenced='");
        sb.append(this.silenced);
        sb.append("', hasmic='");
        sb.append(this.hasmic);
        sb.append("', role=");
        sb.append(this.role);
        sb.append(", sex=");
        sb.append(this.sex);
        sb.append(", vip=");
        sb.append(this.vip);
        sb.append(", morder=");
        sb.append(this.morder);
        sb.append(", panda=");
        return OooO0O0.OooO00o(sb, this.panda, '}');
    }
}
