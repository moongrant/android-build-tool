package com.app.base.model;

import OooO00o.OooO00o;
import com.app.base.bean.AbsJavaBean;
import com.app.base.mixedroom.model.RoomCommonModel;
import com.google.gson.annotations.SerializedName;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
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

        @Override // com.app.base.bean.AbsJavaBean
        public String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Micorder{micorder='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.micorder, '\'', ", url='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.url, '\'', ", user=");
            sbOooO0o0.append(this.user);
            sbOooO0o0.append(", userid='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.userid, '\'', ", reason='");
            return kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO00o(sbOooO0o0, this.reason, '\'', '}');
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

    @Override // com.app.base.model.CommonModel, com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("OnlineListModel{uid='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.uid, '\'', ", name='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.name, '\'', ", headphoto='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.headphoto, '\'', ", position='");
        sbOooO0o0.append(this.position);
        sbOooO0o0.append('\'');
        sbOooO0o0.append(", level='");
        sbOooO0o0.append(this.level);
        sbOooO0o0.append('\'');
        sbOooO0o0.append(", silenced='");
        sbOooO0o0.append(this.silenced);
        sbOooO0o0.append('\'');
        sbOooO0o0.append(", hasmic='");
        sbOooO0o0.append(this.hasmic);
        sbOooO0o0.append('\'');
        sbOooO0o0.append(", role=");
        sbOooO0o0.append(this.role);
        sbOooO0o0.append(", sex=");
        sbOooO0o0.append(this.sex);
        sbOooO0o0.append(", vip=");
        sbOooO0o0.append(this.vip);
        sbOooO0o0.append(", morder=");
        sbOooO0o0.append(this.morder);
        sbOooO0o0.append(", panda=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.panda, '}');
    }
}
