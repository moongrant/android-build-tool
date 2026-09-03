package com.app.base.mixedroom.model;

import OooO00o.OooO00o;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.model.MemberBadgeInfo;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.io.Serializable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public class RoomLoginInformation extends RoomCommonModel {
    public static final int MIC_OFF = 0;
    public static final int MIC_ON = 1;

    @SerializedName("autograbbonus")
    private int autoGrabBonus;
    private String channelkey;
    private int coin;
    public MemberBadgeInfo memberInfo;
    private MIC miceight;
    private MIC micfive;
    private MIC micfour;
    private MIC micnine;
    private MIC micone;
    private MIC micseven;
    private MIC micsix;
    private MIC micten;
    private MIC micthree;
    private MIC mictwo;
    private int morder;
    public boolean noisereduce;
    private int position;
    private RoomBean room;

    public static class MIC extends RoomCommonModel {
        public static final int MIC_BUSY = 2;
        public static final int MIC_DEFAULT = 0;
        public static final int MIC_FREE = 3;
        public static final int MIC_LEVEL_LIMIT = 4;
        public static final int MIC_LOCK = 1;
        private int micorder;
        private int order;
        private int reason;
        public RoomUserInfoModel user;
        private long userid;
        private int voicecard;
        private boolean isMuteSound = false;
        public boolean isSelectedForSendHats = false;
        private int state = 0;

        public int getMicorder() {
            return this.micorder;
        }

        public int getOrder() {
            return this.order;
        }

        public int getReason() {
            return this.reason;
        }

        public int getState() {
            return this.state;
        }

        public long getUserid() {
            return this.userid;
        }

        public int getVoicecard() {
            return this.voicecard;
        }

        public boolean isMuteSound() {
            return this.isMuteSound;
        }

        public void setMicorder(int i) {
            this.micorder = i;
        }

        public void setMuteSound(boolean z) {
            this.isMuteSound = z;
        }

        public void setOrder(int i) {
            this.order = i;
        }

        public void setReason(int i) {
            this.reason = i;
        }

        public MIC setState(int i) {
            this.state = i;
            return this;
        }

        public void setUserid(long j) {
            this.userid = j;
        }

        public void setVoicecard(int i) {
            this.voicecard = i;
        }

        @Override // com.app.base.bean.AbsJavaBean
        public String toString() {
            return o0O0ooO.OooO00o(OooO00o.OooO0o0("MIC{state="), this.state, '}');
        }
    }

    public static class RoomBean implements Serializable {
        public static final int AUDIO_TYPE_AGORA = 0;
        public static final int AUDIO_TYPE_ZEGO = 1;
        public static final int MIC_TYPE_FIVE = 0;
        public static final int MIC_TYPE_TEN = 1;
        private static final long serialVersionUID = 1;
        public int applylistlen;
        private String background;
        private String backgroundvideo;
        private int dues;
        private long id;
        private long idx;
        private String image;
        private String ip;
        private String ips;
        private int level;
        public boolean micapplyopen;
        private int mictype;
        private String name;
        private String notice;
        private int region;
        public String topinapplylist;
        private int type;
        private int vediotype;
        private int lucknummode = 0;
        private int lucknumcost = 0;
        private int lucknumset = 0;
        private long luckNum = -1;
        private boolean luckNumAdmin = false;

        public static long getSerialVersionUID() {
            return 1L;
        }

        public String getBackground() {
            return this.background;
        }

        public String getBackgroundvideo() {
            return this.backgroundvideo;
        }

        public int getDues() {
            return this.dues;
        }

        public long getId() {
            return this.id;
        }

        public long getIdx() {
            return this.idx;
        }

        public String getImage() {
            return this.image;
        }

        public String getIp() {
            return this.ip;
        }

        public String getIps() {
            return this.ips;
        }

        public int getLevel() {
            return this.level;
        }

        public long getLuckNum() {
            return this.luckNum;
        }

        public int getLucknumcost() {
            return this.lucknumcost;
        }

        public int getLucknummode() {
            return this.lucknummode;
        }

        public int getLucknumset() {
            return this.lucknumset;
        }

        public int getMictype() {
            return this.mictype;
        }

        public String getName() {
            return this.name;
        }

        public String getNotice() {
            return this.notice;
        }

        public int getRegion() {
            return this.region;
        }

        public int getType() {
            return this.type;
        }

        public int getVediotype() {
            return this.vediotype;
        }

        public boolean isLuckNumAdmin() {
            return this.luckNumAdmin;
        }

        public void setBackground(String str) {
            this.background = str;
        }

        public void setBackgroundvideo(String str) {
            this.backgroundvideo = str;
        }

        public void setDues(int i) {
            this.dues = i;
        }

        public void setId(long j) {
            this.id = j;
        }

        public void setIdx(long j) {
            this.idx = j;
        }

        public void setImage(String str) {
            this.image = str;
        }

        public void setIp(String str) {
            this.ip = str;
        }

        public void setIps(String str) {
            this.ips = str;
        }

        public void setLevel(int i) {
            this.level = i;
        }

        public void setLuckNum(long j) {
            this.luckNum = j;
        }

        public void setLuckNumAdmin(boolean z) {
            this.luckNumAdmin = z;
        }

        public void setLucknumcost(int i) {
            this.lucknumcost = i;
        }

        public void setLucknummode(int i) {
            this.lucknummode = i;
        }

        public void setLucknumset(int i) {
            this.lucknumset = i;
        }

        public void setMictype(int i) {
            this.mictype = i;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setNotice(String str) {
            this.notice = str;
        }

        public void setRegion(int i) {
            this.region = i;
        }

        public void setType(int i) {
            this.type = i;
        }

        public void setVediotype(int i) {
            this.vediotype = i;
        }

        public String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("RoomBean{dues=");
            sbOooO0o0.append(this.dues);
            sbOooO0o0.append(", idx=");
            sbOooO0o0.append(this.idx);
            sbOooO0o0.append(", id=");
            sbOooO0o0.append(this.id);
            sbOooO0o0.append(", ip='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.ip, '\'', ", image='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.image, '\'', ", name='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.name, '\'', ", level=");
            sbOooO0o0.append(this.level);
            sbOooO0o0.append(", type=");
            sbOooO0o0.append(this.type);
            sbOooO0o0.append(", region=");
            sbOooO0o0.append(this.region);
            sbOooO0o0.append(", notice='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.notice, '\'', ", mictype=");
            sbOooO0o0.append(this.mictype);
            sbOooO0o0.append(", vediotype=");
            sbOooO0o0.append(this.vediotype);
            sbOooO0o0.append(", ips='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.ips, '\'', ", lucknummode=");
            sbOooO0o0.append(this.lucknummode);
            sbOooO0o0.append(", lucknumcost=");
            sbOooO0o0.append(this.lucknumcost);
            sbOooO0o0.append(", lucknumset=");
            sbOooO0o0.append(this.lucknumset);
            sbOooO0o0.append(", background='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.background, '\'', ", backgroundvideo='");
            return kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO00o(sbOooO0o0, this.backgroundvideo, '\'', '}');
        }
    }

    public int getAutoGrabBonus() {
        return this.autoGrabBonus;
    }

    public String getChannelkey() {
        return this.channelkey;
    }

    public int getCoin() {
        return this.coin;
    }

    public MIC getMiceight() {
        return this.miceight;
    }

    public MIC getMicfive() {
        return this.micfive;
    }

    public MIC getMicfour() {
        return this.micfour;
    }

    public MIC getMicnine() {
        return this.micnine;
    }

    public MIC getMicone() {
        return this.micone;
    }

    public MIC getMicseven() {
        return this.micseven;
    }

    public MIC getMicsix() {
        return this.micsix;
    }

    public MIC getMicten() {
        return this.micten;
    }

    public MIC getMicthree() {
        return this.micthree;
    }

    public MIC getMictwo() {
        return this.mictwo;
    }

    public int getMorder() {
        return this.morder;
    }

    public int getPosition() {
        return this.position;
    }

    public RoomBean getRoom() {
        return this.room;
    }

    public void setAutoGrabBonus(int i) {
        this.autoGrabBonus = i;
    }

    public void setChannelkey(String str) {
        this.channelkey = str;
    }

    public void setCoin(int i) {
        this.coin = i;
    }

    public void setMiceight(MIC mic) {
        this.miceight = mic;
    }

    public void setMicfive(MIC mic) {
        this.micfive = mic;
    }

    public void setMicfour(MIC mic) {
        this.micfour = mic;
    }

    public void setMicnine(MIC mic) {
        this.micnine = mic;
    }

    public void setMicone(MIC mic) {
        this.micone = mic;
    }

    public void setMicseven(MIC mic) {
        this.micseven = mic;
    }

    public void setMicsix(MIC mic) {
        this.micsix = mic;
    }

    public void setMicten(MIC mic) {
        this.micten = mic;
    }

    public void setMicthree(MIC mic) {
        this.micthree = mic;
    }

    public void setMictwo(MIC mic) {
        this.mictwo = mic;
    }

    public void setMorder(int i) {
        this.morder = i;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setRoom(RoomBean roomBean) {
        this.room = roomBean;
    }

    @Override // com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("RoomLoginInformation{channelkey='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.channelkey, '\'', ", coin=");
        sbOooO0o0.append(this.coin);
        sbOooO0o0.append(", micfive=");
        sbOooO0o0.append(this.micfive);
        sbOooO0o0.append(", micfour=");
        sbOooO0o0.append(this.micfour);
        sbOooO0o0.append(", micone=");
        sbOooO0o0.append(this.micone);
        sbOooO0o0.append(", micthree=");
        sbOooO0o0.append(this.micthree);
        sbOooO0o0.append(", mictwo=");
        sbOooO0o0.append(this.mictwo);
        sbOooO0o0.append(", micsix=");
        sbOooO0o0.append(this.micsix);
        sbOooO0o0.append(", micseven=");
        sbOooO0o0.append(this.micseven);
        sbOooO0o0.append(", miceight=");
        sbOooO0o0.append(this.miceight);
        sbOooO0o0.append(", micnine=");
        sbOooO0o0.append(this.micnine);
        sbOooO0o0.append(", micten=");
        sbOooO0o0.append(this.micten);
        sbOooO0o0.append(", morder=");
        sbOooO0o0.append(this.morder);
        sbOooO0o0.append(", position=");
        sbOooO0o0.append(this.position);
        sbOooO0o0.append(", room=");
        sbOooO0o0.append(this.room);
        sbOooO0o0.append(", autoGrabBonus=");
        sbOooO0o0.append(this.autoGrabBonus);
        sbOooO0o0.append(", code=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.f11840code, '}');
    }
}
