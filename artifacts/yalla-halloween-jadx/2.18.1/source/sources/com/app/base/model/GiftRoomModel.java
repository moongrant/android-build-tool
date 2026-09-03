package com.app.base.model;

import android.graphics.Bitmap;
import com.app.base.bean.AbsJavaBean;
import com.google.gson.annotations.SerializedName;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class GiftRoomModel extends AbsJavaBean {
    public static final int ALL_GIFT_ANSWER = 71;
    public static final int ALL_GIFT_IN_MIC = 8;
    public static final int ALL_GIFT_OTHER = 72;
    public static final int ALL_GIFT_RECEIVER = 7;
    public static final int GIFT_Blind = 81;
    public static final int GIFT_CUSTOM_MADE = 92;
    public static final int ONE_GIFT_ANSWER = 61;
    public static final int ONE_GIFT_OTHER = 62;
    public static final int ONE_GIFT_RECEIVER = 6;
    public long coin;
    public long crystal;
    public int envelopflag;
    public RoomUserInfoModel from;

    @SerializedName(alternate = {"giftisaudio"}, value = "giftsaudio")
    public boolean giftIsAudio;

    @SerializedName("gifturl")
    public String giftUrl;

    @SerializedName("giftmedia")
    public String giftVideoUrl;
    public int giftid;
    public long luckyflag;
    public ArrayList<LuckyInstancesModel> luckyinstances;
    public long luckymoney;
    public long luckymultiple;
    public long luckynum;
    public int number;
    public BarInfoModel.RoomInfo roominfo;
    public RoomUserInfoModel to;
    public int type;

    @SerializedName("fromboxid")
    public int fromboxid = 0;
    public String uuid = "";

    @SerializedName("giftusertype")
    public int giftUserType = 0;

    @SerializedName("gifttype")
    public int giftType = 0;

    @SerializedName("customGiftInfo")
    public CustomGiftInfo customGiftInfo = null;
    public long morajuid = 0;
    private boolean hasFirstLuckyLevel = false;

    public class CustomGiftInfo {

        @SerializedName("customHideInfo")
        public List<String> customHideInfo;

        @SerializedName("customShowAvatarInfo")
        public List<CustomShowAvatarInfoDTO> customShowAvatarInfo;

        @SerializedName("customSkinUrl")
        public String customSkinUrl;

        public class CustomShowAvatarInfoDTO {

            @SerializedName("headPhoto")
            public String headPhoto;
            public Bitmap headPhotoBitmap;

            @SerializedName("position")
            public String position;

            public CustomShowAvatarInfoDTO() {
            }
        }

        public CustomGiftInfo() {
        }
    }

    public boolean hasFirstLuckyLevel() {
        if (this.hasFirstLuckyLevel || OooO0OO.OooO00o(this.luckyinstances)) {
            return this.hasFirstLuckyLevel;
        }
        Iterator<LuckyInstancesModel> it = this.luckyinstances.iterator();
        while (it.hasNext()) {
            if (it.next().getLlevel() == 1) {
                this.hasFirstLuckyLevel = true;
                break;
            }
        }
        return this.hasFirstLuckyLevel;
    }

    public boolean isAddGiftRunway() {
        return (this.from == null || this.type == 81) ? false : true;
    }

    public boolean isLuckyflag() {
        return this.luckyflag == 1;
    }
}
