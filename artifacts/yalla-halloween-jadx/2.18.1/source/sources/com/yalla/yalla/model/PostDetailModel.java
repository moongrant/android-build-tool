package com.yalla.yalla.model;

import android.text.TextUtils;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.adapter.imageView9Grid.ImageView9GridModel;
import com.app.base.bean.AbsJavaBean;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p168o00Ooo0.o00Oo0;
import p388o0OOooO.o00000O0;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class PostDetailModel extends AbsJavaBean {
    public MomentAdDataModel adData;
    private String address;
    private boolean circleDisbanded;
    private MomentCommentModel comment;
    private long commentNum;
    private String content;
    private long createTime;
    private int deleteType;
    private String forwardConent;
    private String headurl;

    @SerializedName(alternate = {"dyid"}, value = "id")
    private long id;
    private boolean isDel;
    private boolean isFeatured;
    private String isFollow;
    private boolean isForward;
    private boolean isFrind;

    @SerializedName("isInRoom")
    private boolean isInRoom;
    private boolean isPraise;

    @SerializedName(alternate = {"isTopForUserPostList"}, value = "istop")
    public boolean isTop;
    private int isWaterMark;

    @SerializedName("isblack")
    public int isblack;
    public int kaVIPLv;
    private ArrayList<ImageView9GridModel> listImageInfo;
    private String medal;
    private String nickname;
    private String pFname;
    private String pNumber;

    @SerializedName("positionid")
    public int positionid;
    private int power;
    private long praiseNum;

    @SerializedName("region")
    public int region;
    private int role;
    private MomentSendModel sendPostModel;

    @SerializedName(alternate = {"sessionid"}, value = "sessionId")
    private String sessionid;
    private int sex;
    private String size;
    private int sourcesId;
    private long totalPropValue;
    private int type;
    private String userIdx;
    private String userid;

    @SerializedName("isVIP")
    private int vip;

    @SerializedName(alternate = {"nVipLv"}, value = "nVIPLv")
    private int vipLevel;
    public List<PostDetailModel> forward = new ArrayList();
    private int isInHeBlack = -1;
    private boolean isRecommend = false;

    public String getAddress() {
        return this.address;
    }

    public MomentCommentModel getComment() {
        return this.comment;
    }

    public long getCommentNum() {
        return this.commentNum;
    }

    public MomentSendContentModel getContent() {
        return !TextUtils.isEmpty(this.content) ? (MomentSendContentModel) o0Oo0oo.OooO0OO(this.content, new o00000O0<MomentSendContentModel>() { // from class: com.yalla.yalla.model.PostDetailModel.1
        }.getType()) : new MomentSendContentModel("");
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public int getDeleteType() {
        return this.deleteType;
    }

    public MomentForwardContent getForwardContent() {
        if (TextUtils.isEmpty(this.forwardConent)) {
            return null;
        }
        return (MomentForwardContent) o0Oo0oo.OooO0OO(this.forwardConent, new o00000O0<MomentForwardContent>() { // from class: com.yalla.yalla.model.PostDetailModel.3
        }.getType());
    }

    public String getHeadurl() {
        return this.headurl;
    }

    public long getId() {
        return this.id;
    }

    public ArrayList<ImageView9GridModel> getImageInfoList() {
        ArrayList<ImageView9GridModel> arrayList = this.listImageInfo;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList<ImageView9GridModel> arrayListOooO00o = o00Oo0.OooO00o(this.pFname, this.pNumber, this.size);
        this.listImageInfo = arrayListOooO00o;
        return arrayListOooO00o;
    }

    public long getIsFollow() {
        Long lValueOf = 0L;
        try {
            lValueOf = Long.valueOf(this.isFollow);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lValueOf.longValue();
    }

    public boolean getIsInRoom() {
        return this.isInRoom;
    }

    public String getMedal() {
        return this.medal;
    }

    public MomentPoll getMomentPoll() {
        if (TextUtils.isEmpty(this.forwardConent)) {
            return null;
        }
        return (MomentPoll) o0Oo0oo.OooO0OO(this.forwardConent, new o00000O0<MomentPoll>() { // from class: com.yalla.yalla.model.PostDetailModel.2
        }.getType());
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getPower() {
        return this.power;
    }

    public long getPraiseNum() {
        return this.praiseNum;
    }

    public int getRole() {
        return this.role;
    }

    public MomentSendModel getSendPostModel() {
        return this.sendPostModel;
    }

    public String getSessionid() {
        return this.sessionid;
    }

    public int getSex() {
        return this.sex;
    }

    public String getSize() {
        return this.size;
    }

    public int getSourcesId() {
        return this.sourcesId;
    }

    public long getTotalPropValue() {
        return this.totalPropValue;
    }

    public int getType() {
        return this.type;
    }

    public String getUserIdx() {
        return this.userIdx;
    }

    public String getUserid() {
        return this.userid;
    }

    public int getVip() {
        return this.vip;
    }

    public int getVipLevel() {
        return this.vipLevel;
    }

    public String getpFname() {
        return this.pFname;
    }

    public String getpNumber() {
        return this.pNumber;
    }

    public boolean isCircleDisbanded() {
        return this.circleDisbanded;
    }

    public boolean isDel() {
        return this.isDel;
    }

    public boolean isFeatured() {
        return this.isFeatured;
    }

    public boolean isForward() {
        return this.isForward;
    }

    public boolean isFrind() {
        return this.isFrind;
    }

    public int isInHeBlack() {
        return this.isInHeBlack;
    }

    public boolean isPraise() {
        return this.isPraise;
    }

    public boolean isRecommend() {
        return this.isRecommend;
    }

    public boolean isWaterMark() {
        return this.isWaterMark == 1;
    }

    public void setCircleDisbanded(boolean z) {
        this.circleDisbanded = z;
    }

    public void setCommentNum(long j) {
        this.commentNum = j;
    }

    public void setDeleteType(int i) {
        this.deleteType = i;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIsFollow(long j) {
        this.isFollow = j + "";
    }

    public void setIsInHeBlack(int i) {
        this.isInHeBlack = i;
    }

    public void setIsInRoom(boolean z) {
        this.isInRoom = z;
    }

    public void setMomentPoll(String str) {
        this.forwardConent = str;
    }

    public void setPraise(boolean z) {
        this.isPraise = z;
    }

    public void setPraiseNum(long j) {
        this.praiseNum = j;
    }

    public void setRecommend(boolean z) {
        this.isRecommend = z;
    }

    public void setSendPostModel(MomentSendModel momentSendModel) {
        this.sendPostModel = momentSendModel;
        this.userid = OooOOO.f41216OooO00o.OooOo().getValue() + "";
    }

    public void setSessionId(String str) {
        this.sessionid = str;
    }

    public void setTotalPropValue(long j) {
        this.totalPropValue = j;
    }

    @Override // com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Model{\n id=");
        sbOooO0o0.append(this.id);
        sbOooO0o0.append("\n type=");
        sbOooO0o0.append(this.type);
        sbOooO0o0.append("\n deleteType=");
        sbOooO0o0.append(this.deleteType);
        sbOooO0o0.append("\n userid='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.userid, '\'', "\n nickname='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.nickname, '\'', "\n headurl='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.headurl, '\'', "\n sex=");
        sbOooO0o0.append(this.sex);
        sbOooO0o0.append("\n vip=");
        sbOooO0o0.append(this.vip);
        sbOooO0o0.append("\n isInRoom=");
        sbOooO0o0.append(this.isInRoom);
        sbOooO0o0.append("\n vipLevel=");
        sbOooO0o0.append(this.vipLevel);
        sbOooO0o0.append("\n content='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.content, '\'', "\n address='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.address, '\'', "\n createTime=");
        sbOooO0o0.append(this.createTime);
        sbOooO0o0.append("\n sourcesId=");
        sbOooO0o0.append(this.sourcesId);
        sbOooO0o0.append("\n praiseNum=");
        sbOooO0o0.append(this.praiseNum);
        sbOooO0o0.append("\n commentNum=");
        sbOooO0o0.append(this.commentNum);
        sbOooO0o0.append("\n isForward=");
        sbOooO0o0.append(this.isForward);
        sbOooO0o0.append("\n isFrind=");
        sbOooO0o0.append(this.isFrind);
        sbOooO0o0.append("\n isInHeBlack=");
        sbOooO0o0.append(this.isInHeBlack);
        sbOooO0o0.append("\n power=");
        sbOooO0o0.append(this.power);
        sbOooO0o0.append("\n isDel=");
        sbOooO0o0.append(this.isDel);
        sbOooO0o0.append("\n isPraise=");
        sbOooO0o0.append(this.isPraise);
        sbOooO0o0.append("\n pFname='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.pFname, '\'', "\n pNumber='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.pNumber, '\'', "\n size='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.size, '\'', "\n forwardConent='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.forwardConent, '\'', "\n isFeatured=");
        sbOooO0o0.append(this.isFeatured);
        sbOooO0o0.append("\n medal='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.medal, '\'', "\n role=");
        sbOooO0o0.append(this.role);
        sbOooO0o0.append("\n isWaterMark=");
        sbOooO0o0.append(this.isWaterMark);
        sbOooO0o0.append("\n userIdx='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.userIdx, '\'', "\n totalPropValue=");
        sbOooO0o0.append(this.totalPropValue);
        sbOooO0o0.append("\n comment=");
        sbOooO0o0.append(this.comment);
        sbOooO0o0.append("\n kaVIPLv=");
        sbOooO0o0.append(this.kaVIPLv);
        sbOooO0o0.append("\n sessionid='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.sessionid, '\'', "\n isRecommend=");
        sbOooO0o0.append(this.isRecommend);
        sbOooO0o0.append("\n adData=");
        sbOooO0o0.append(this.adData);
        sbOooO0o0.append("\n forward=");
        sbOooO0o0.append(this.forward);
        sbOooO0o0.append("\n listImageInfo=");
        sbOooO0o0.append(this.listImageInfo);
        sbOooO0o0.append("\n isFollow='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.isFollow, '\'', "\n circleDisbanded=");
        sbOooO0o0.append(this.circleDisbanded);
        sbOooO0o0.append("\n region=");
        sbOooO0o0.append(this.region);
        sbOooO0o0.append("\n isblack=");
        sbOooO0o0.append(this.isblack);
        sbOooO0o0.append("\n positionid=");
        sbOooO0o0.append(this.positionid);
        sbOooO0o0.append("\n isTop=");
        sbOooO0o0.append(this.isTop);
        sbOooO0o0.append("\n sendPostModel=");
        sbOooO0o0.append(this.sendPostModel);
        sbOooO0o0.append("\n\t getContent ='");
        sbOooO0o0.append(getContent());
        sbOooO0o0.append('\'');
        sbOooO0o0.append("\n\t getForwardConent = ");
        sbOooO0o0.append(getForwardContent());
        sbOooO0o0.append("\n\t getMomentPoll = ");
        sbOooO0o0.append(getMomentPoll());
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
