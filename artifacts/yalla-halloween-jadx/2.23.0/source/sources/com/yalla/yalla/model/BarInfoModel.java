package com.yalla.yalla.model;

import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.layout.OooO0O0;
import com.facebook.appevents.AppEventsConstants;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.model.bean.AbsJavaBean;

/* JADX INFO: loaded from: classes4.dex */
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
            StringBuilder sb = new StringBuilder("Mic{url='");
            sb.append(this.url);
            sb.append("', user=");
            sb.append(this.user);
            sb.append(", state=");
            return OooO0O0.OooO00o(sb, this.state, '}');
        }
    }

    public static class RoomInfoOld extends AbsJavaBean {
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

        @Override // com.yalla.yalla.model.bean.AbsJavaBean
        public String toString() {
            return Oooo000.OooO0OO(new StringBuilder("giftClass{id="), this.id, '}');
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
            StringBuilder sb = new StringBuilder("giftClass{id=");
            sb.append(this.id);
            sb.append(", image='");
            sb.append(this.image);
            sb.append("', giftMedia='");
            sb.append(this.giftMedia);
            sb.append("', giftIsAudio='");
            sb.append(this.giftIsAudio);
            sb.append("', name='");
            sb.append(this.name);
            sb.append("', price=");
            sb.append(this.price);
            sb.append(", type=");
            return OooO0O0.OooO00o(sb, this.type, '}');
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

    @Override // com.yalla.yalla.model.CommonModel, com.yalla.yalla.model.bean.AbsJavaBean
    public String toString() {
        StringBuilder sb = new StringBuilder("BarInfoModel{barid='");
        sb.append(this.barid);
        sb.append("', baridx='");
        sb.append(this.baridx);
        sb.append("', barlevel='");
        sb.append(this.barlevel);
        sb.append("', barname='");
        sb.append(this.barname);
        sb.append("', introduce='");
        sb.append(this.introduce);
        sb.append("', barimage='");
        sb.append(this.barimage);
        sb.append("', isfollow='");
        sb.append(this.isfollow);
        sb.append("', experience='");
        sb.append(this.experience);
        sb.append("', experiencePercent='");
        sb.append(this.experiencePercent);
        sb.append("', notice='");
        sb.append(this.notice);
        sb.append("', yesterdaywage='");
        sb.append(this.yesterdaywage);
        sb.append("', labelid=");
        sb.append(this.labelid);
        sb.append(", hot='");
        sb.append(this.hot);
        sb.append("', barType='");
        sb.append(this.barType);
        sb.append("', silence=");
        sb.append(this.silence);
        sb.append(", coin=");
        sb.append(this.coin);
        sb.append(", diamonds=");
        sb.append(this.diamonds);
        sb.append(", guestlive=");
        sb.append(this.guestlive);
        sb.append(", locked=");
        sb.append(this.locked);
        sb.append(", role=");
        sb.append(this.role);
        sb.append(", online='");
        sb.append(this.online);
        sb.append("', position='");
        sb.append(this.position);
        sb.append("', level='");
        sb.append(this.level);
        sb.append("', ispwdroom='");
        sb.append(this.ispwdroom);
        sb.append("', channelkey='");
        sb.append(this.channelkey);
        sb.append("', vip=");
        sb.append(this.vip);
        sb.append(", micone=");
        sb.append(this.micone);
        sb.append(", mictwo=");
        sb.append(this.mictwo);
        sb.append(", micthree=");
        sb.append(this.micthree);
        sb.append(", micfour=");
        sb.append(this.micfour);
        sb.append(", micfive=");
        sb.append(this.micfive);
        sb.append(", from=");
        sb.append(this.from);
        sb.append(", to=");
        sb.append(this.to);
        sb.append(", panda=");
        return OooO0O0.OooO00o(sb, this.panda, '}');
    }
}
