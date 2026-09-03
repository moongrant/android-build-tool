package com.app.base.model;

import OooO00o.OooO00o;
import Oooo000.o000O0;
import com.app.base.bean.AbsJavaBean;
import com.facebook.appevents.AppEventsConstants;
import com.google.gson.annotations.SerializedName;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public class BarInfoModel extends CommonModel {
    public String channelkey;
    private CountryModel country;
    public String countryid;
    public SilenceInfo from;
    public String maxline;
    public int messagesnum;
    public Mic micfive;
    public Mic micfour;
    public Mic micone;
    public Mic micthree;
    public Mic mictwo;
    public int roomlevel;
    private CategoryModel tag;
    public SilenceInfo to;
    public int vehicle;
    public int vip;
    public int isencrypt = 0;
    public int dues = 0;
    public int membernum = 0;
    public int own = 0;
    public String barid = "";
    public String baridx = "";
    public String barlevel = "";
    public String barname = "";
    public String introduce = "";
    public String barimage = "";
    public String isfollow = "";
    public String experience = "";
    public String experiencePercent = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    public String notice = "";
    public String yesterdaywage = "";
    public int labelid = 0;
    public String hot = "";
    public String barType = "1";
    public int silence = -1;
    public long coin = 0;
    public long diamonds = 0;
    public int guestlive = 0;
    public int locked = 0;
    public int role = 0;
    public String online = "";
    public String position = "";
    public String level = "";
    public String ispwdroom = AppEventsConstants.EVENT_PARAM_VALUE_NO;
    public int panda = 0;

    public static class Mic {
        public static final int MIC_BUSY = 2;
        public static final int MIC_FREE = 3;
        public static final int MIC_LEVEL_LIMIT = 4;
        public static final int MIC_LOCK = 1;
        public int state = 0;
        public int state2 = 3;
        public String url;
        public OnlineListModel user;

        public String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Mic{url='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.url, '\'', ", user=");
            sbOooO0o0.append(this.user);
            sbOooO0o0.append(", state=");
            return o0O0ooO.OooO00o(sbOooO0o0, this.state, '}');
        }
    }

    public static class MicLockResult {

        /* JADX INFO: renamed from: code, reason: collision with root package name */
        public String f11857code;
        public int order;
    }

    public static class Radio {
        public long balance = -1;
        public long barid;
        public long baridx;
        public OnlineListModel from;
        public giftClass gift;
        public String lang;
        public String message;
        public int num;
        public RoomInfo roominfo;
        public int roomtype;
        public OnlineListModel to;
        public int type;
    }

    public static class RadioMessage extends AbsJavaBean {

        /* JADX INFO: renamed from: code, reason: collision with root package name */
        public int f11858code;
        public Radio data;
        public String lang = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        public String msg;
    }

    public static class RoomInfo extends AbsJavaBean {
        private long id;
        private long idx;
        private String ip;
        private int level;
        private String name;
        private int type;

        public long getId() {
            return this.id;
        }

        public String getIp() {
            return this.ip;
        }

        public int getLevel() {
            return this.level;
        }

        public String getName() {
            return this.name;
        }

        public int getType() {
            return this.type;
        }

        @Override // com.app.base.bean.AbsJavaBean
        public String toString() {
            return o000O0.OooO0O0(OooO00o.OooO0o0("giftClass{id="), this.id, '}');
        }
    }

    public static class SilenceInfo {
        public String name;
        public String uid;
    }

    public static class giftClass {

        @SerializedName("giftisaudio")
        private boolean giftIsAudio;

        @SerializedName("giftmedia")
        private String giftMedia;
        private int id;
        private String image;
        private String name;
        private long price;
        private int type;

        public String getGiftMedia() {
            return this.giftMedia;
        }

        public int getId() {
            return this.id;
        }

        public String getImage() {
            return this.image;
        }

        public String getName() {
            return this.name;
        }

        public long getPrice() {
            return this.price;
        }

        public int getType() {
            return this.type;
        }

        public boolean isGiftIsAudio() {
            return this.giftIsAudio;
        }

        public String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("giftClass{id=");
            sbOooO0o0.append(this.id);
            sbOooO0o0.append(", image='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.image, '\'', ", giftMedia='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.giftMedia, '\'', ", giftIsAudio='");
            sbOooO0o0.append(this.giftIsAudio);
            sbOooO0o0.append('\'');
            sbOooO0o0.append(", name='");
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.name, '\'', ", price=");
            sbOooO0o0.append(this.price);
            sbOooO0o0.append(", type=");
            return o0O0ooO.OooO00o(sbOooO0o0, this.type, '}');
        }
    }

    public CountryModel getCountry() {
        return this.country;
    }

    public CategoryModel getTag() {
        return this.tag;
    }

    public BarInfoModel setCountry(CountryModel countryModel) {
        this.country = countryModel;
        return this;
    }

    public BarInfoModel setTag(CategoryModel categoryModel) {
        this.tag = categoryModel;
        return this;
    }

    @Override // com.app.base.model.CommonModel, com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("BarInfoModel{barid='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.barid, '\'', ", baridx='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.baridx, '\'', ", barlevel='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.barlevel, '\'', ", barname='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.barname, '\'', ", introduce='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.introduce, '\'', ", barimage='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.barimage, '\'', ", isfollow='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.isfollow, '\'', ", experience='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.experience, '\'', ", experiencePercent='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.experiencePercent, '\'', ", notice='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.notice, '\'', ", yesterdaywage='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.yesterdaywage, '\'', ", labelid=");
        sbOooO0o0.append(this.labelid);
        sbOooO0o0.append(", hot='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.hot, '\'', ", barType='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.barType, '\'', ", silence=");
        sbOooO0o0.append(this.silence);
        sbOooO0o0.append(", coin=");
        sbOooO0o0.append(this.coin);
        sbOooO0o0.append(", diamonds=");
        sbOooO0o0.append(this.diamonds);
        sbOooO0o0.append(", guestlive=");
        sbOooO0o0.append(this.guestlive);
        sbOooO0o0.append(", locked=");
        sbOooO0o0.append(this.locked);
        sbOooO0o0.append(", role=");
        sbOooO0o0.append(this.role);
        sbOooO0o0.append(", online='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.online, '\'', ", position='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.position, '\'', ", level='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.level, '\'', ", ispwdroom='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.ispwdroom, '\'', ", channelkey='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.channelkey, '\'', ", vip=");
        sbOooO0o0.append(this.vip);
        sbOooO0o0.append(", micone=");
        sbOooO0o0.append(this.micone);
        sbOooO0o0.append(", mictwo=");
        sbOooO0o0.append(this.mictwo);
        sbOooO0o0.append(", micthree=");
        sbOooO0o0.append(this.micthree);
        sbOooO0o0.append(", micfour=");
        sbOooO0o0.append(this.micfour);
        sbOooO0o0.append(", micfive=");
        sbOooO0o0.append(this.micfive);
        sbOooO0o0.append(", from=");
        sbOooO0o0.append(this.from);
        sbOooO0o0.append(", to=");
        sbOooO0o0.append(this.to);
        sbOooO0o0.append(", panda=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.panda, '}');
    }
}
