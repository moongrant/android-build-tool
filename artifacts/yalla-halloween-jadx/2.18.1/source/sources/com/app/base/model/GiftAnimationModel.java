package com.app.base.model;

import com.app.base.bean.AbsJavaBean;
import com.yalla.support.common.util.OooO0OO;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class GiftAnimationModel extends AbsJavaBean {
    public String fromUserHead;
    public String fromUserId;
    public String fromUserName;
    public Integer giftId;
    public boolean giftIsAudio;
    public int giftNum;
    public int giftType;
    public String giftUrl;
    public String giftVideoUrl;
    public long luckyflag;
    public ArrayList<LuckyInstancesModel> luckyinstances;
    public long luckymoney;
    public long luckymultiple;
    public Long toUserId;
    public String toUserName;
    public int type;
    public int giftUserType = 0;
    private boolean hasFirstLuckyLevel = false;

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

    public boolean isLuckyflag() {
        return this.luckyflag == 1;
    }

    public void setDataFromGiftRoomModel(GiftRoomModel giftRoomModel) {
        this.fromUserHead = giftRoomModel.from.getUserHeader();
        this.fromUserName = giftRoomModel.from.getUserName();
        this.toUserName = giftRoomModel.to.getUserName();
        this.toUserId = Long.valueOf(giftRoomModel.to.getUserId());
        this.giftId = Integer.valueOf(giftRoomModel.giftid);
        this.giftUrl = giftRoomModel.giftUrl;
        this.giftVideoUrl = giftRoomModel.giftVideoUrl;
        this.giftIsAudio = giftRoomModel.giftIsAudio;
        this.giftNum = giftRoomModel.number;
        this.luckyflag = giftRoomModel.luckyflag;
        this.fromUserId = giftRoomModel.from.getUserId() + "";
        this.luckymoney = giftRoomModel.luckymoney;
        this.luckymultiple = giftRoomModel.luckymultiple;
        this.luckyinstances = giftRoomModel.luckyinstances;
        this.type = giftRoomModel.type;
        this.giftUserType = giftRoomModel.giftUserType;
        this.giftType = giftRoomModel.giftType;
    }
}
