package com.app.base.model.roomBroadcastModel;

import OooO00o.OooO00o;
import com.app.base.bean.AbsJavaBean;
import com.app.base.mixedroom.model.RoomBroadcastOpenNobleDataModel;
import com.app.base.model.BarInfoModel;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.model.RoomUserInfoModel;

/* JADX INFO: loaded from: classes.dex */
public class RoomBroadcastModel extends AbsJavaBean {
    private Integer balance;
    private long barid;
    private long baridx;
    public int envelopflag;
    private RoomUserInfoModel from;
    private BarInfoModel.giftClass gift;
    private String lang;
    private long luckymoney;
    private long luckymultiple;
    private String message;
    public int moraflag;
    public long morajuid;
    private int num;
    private RoomBroadcastOpenNobleDataModel roomBroadcastOpenNobleDataModel;
    private BarInfoModel.RoomInfo roominfo;
    private int roomtype;
    private RoomUserInfoModel to;
    private int type;
    public String username;
    public int wincoinnum;
    private int showeffectflag = 0;

    @SerializedName("fromblindboxid")
    private long fromBlindBoxId = 0;

    public Integer getBalance() {
        return this.balance;
    }

    public long getBarid() {
        return this.barid;
    }

    public long getBaridx() {
        return this.baridx;
    }

    public RoomUserInfoModel getFrom() {
        return this.from;
    }

    public long getFromBlindBoxId() {
        return this.fromBlindBoxId;
    }

    public BarInfoModel.giftClass getGift() {
        return this.gift;
    }

    public String getLang() {
        return this.lang;
    }

    public long getLuckymoney() {
        return this.luckymoney;
    }

    public long getLuckymultiple() {
        return this.luckymultiple;
    }

    public String getMessage() {
        return this.message;
    }

    public int getNum() {
        return this.num;
    }

    public RoomBroadcastOpenNobleDataModel getRoomBroadcastOpenNobleDataModel() {
        return this.roomBroadcastOpenNobleDataModel;
    }

    public BarInfoModel.RoomInfo getRoominfo() {
        return this.roominfo;
    }

    public int getRoomtype() {
        return this.roomtype;
    }

    public int getShoweffectflag() {
        return this.showeffectflag;
    }

    public RoomUserInfoModel getTo() {
        return this.to;
    }

    public int getType() {
        return this.type;
    }

    public boolean isBlindGift() {
        return this.fromBlindBoxId > 0;
    }

    public void setNobleData(int i, RoomBroadcastOpenNobleDataModel roomBroadcastOpenNobleDataModel) {
        this.type = i;
        this.roomBroadcastOpenNobleDataModel = roomBroadcastOpenNobleDataModel;
    }

    public void setTextData(int i, String str) {
        this.type = i;
        this.message = str;
        this.lang = "en";
    }

    @Override // com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("RoomBroadcastModel{from=");
        sbOooO0o0.append(this.from);
        sbOooO0o0.append(", to=");
        sbOooO0o0.append(this.to);
        sbOooO0o0.append(", gift=");
        sbOooO0o0.append(this.gift);
        sbOooO0o0.append(", roominfo=");
        sbOooO0o0.append(this.roominfo);
        sbOooO0o0.append(", type=");
        sbOooO0o0.append(this.type);
        sbOooO0o0.append(", showeffectflag=");
        sbOooO0o0.append(this.showeffectflag);
        sbOooO0o0.append(", barid=");
        sbOooO0o0.append(this.barid);
        sbOooO0o0.append(", baridx=");
        sbOooO0o0.append(this.baridx);
        sbOooO0o0.append(", balance=");
        sbOooO0o0.append(this.balance);
        sbOooO0o0.append(", message='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.message, '\'', ", username='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.username, '\'', ", num=");
        sbOooO0o0.append(this.num);
        sbOooO0o0.append(", roomtype=");
        sbOooO0o0.append(this.roomtype);
        sbOooO0o0.append(", lang='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.lang, '\'', ", luckymultiple=");
        sbOooO0o0.append(this.luckymultiple);
        sbOooO0o0.append(", luckymoney=");
        sbOooO0o0.append(this.luckymoney);
        sbOooO0o0.append(", moraflag=");
        sbOooO0o0.append(this.moraflag);
        sbOooO0o0.append(", morajuid=");
        sbOooO0o0.append(this.morajuid);
        sbOooO0o0.append(", envelopflag=");
        sbOooO0o0.append(this.envelopflag);
        sbOooO0o0.append(", wincoinnum=");
        sbOooO0o0.append(this.wincoinnum);
        sbOooO0o0.append(", roomBroadcastOpenNobleDataModel=");
        sbOooO0o0.append(this.roomBroadcastOpenNobleDataModel);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
