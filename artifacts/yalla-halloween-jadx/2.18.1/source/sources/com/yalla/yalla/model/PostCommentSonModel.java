package com.yalla.yalla.model;

import android.text.TextUtils;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.bean.AbsJavaBean;
import com.google.gson.annotations.SerializedName;
import kotlin.Pair;
import p388o0OOooO.o00000O0;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public class PostCommentSonModel extends AbsJavaBean {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private String content;
    private long createTime;
    private String headurl;
    private long id;
    private boolean isDel;
    private boolean isPraise;
    private boolean isSendProp;
    public int kaVIPLv;
    private long localId;
    private boolean localMessageDiscolor;
    private String medal;
    private String nickname;
    private String parentUserId;
    private String parentUserName;
    private long praiseNum;
    private long propNum;
    private int role;
    private int sex;
    private long userid;

    @SerializedName("isVIP")
    private int vip;

    @SerializedName(alternate = {"nVipLv"}, value = "nVIPLv")
    private int vipLevel;

    public MomentSendContentModel getContent() {
        return !TextUtils.isEmpty(this.content) ? (MomentSendContentModel) o0Oo0oo.OooO0OO(this.content, new o00000O0<MomentSendContentModel>() { // from class: com.yalla.yalla.model.PostCommentSonModel.1
        }.getType()) : new MomentSendContentModel("");
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getHeadurl() {
        return this.headurl;
    }

    public long getId() {
        return this.id;
    }

    public long getLocalId() {
        return this.localId;
    }

    public String getMedal() {
        return this.medal;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getParentUserId() {
        return this.parentUserId;
    }

    public String getParentUserName() {
        return this.parentUserName;
    }

    public long getPraiseNum() {
        return this.praiseNum;
    }

    public long getPropNum() {
        return this.propNum;
    }

    public int getRole() {
        return this.role;
    }

    public int getSex() {
        return this.sex;
    }

    public long getUserid() {
        return this.userid;
    }

    public int getVip() {
        return this.vip;
    }

    public int getVipLevel() {
        return this.vipLevel;
    }

    public boolean isDel() {
        return this.isDel;
    }

    public boolean isLocalMessageDiscolor() {
        return this.localMessageDiscolor;
    }

    public boolean isPraise() {
        return this.isPraise;
    }

    public boolean isSendProp() {
        return this.isSendProp;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setLoadPostCommentSonModel(long j, long j2, String str, String str2, String str3, long j3, boolean z) {
        this.id = j;
        this.userid = j2;
        this.nickname = str;
        this.headurl = str2;
        this.content = str3;
        this.createTime = j3;
        this.localMessageDiscolor = z;
    }

    public void setLocalMessageDiscolor(boolean z) {
        this.localMessageDiscolor = z;
    }

    public PostCommentSonModel setLocalPostCommentReplyModel(MomentSendCommentModel momentSendCommentModel) {
        this.localId = momentSendCommentModel.getLocalId();
        this.id = 0L;
        this.parentUserId = momentSendCommentModel.getParentUserId();
        this.parentUserName = momentSendCommentModel.getParentUserName();
        this.content = momentSendCommentModel.getContent().toJSONString();
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        this.userid = oooOOO.OooOo().getValue().longValue();
        this.nickname = oooOOO.OooOoO().getValue();
        this.headurl = oooOOO.OooO0oo().getValue();
        this.sex = oooOOO.OooOOOo().getValue().intValue();
        Pair<Boolean, Integer> value = oooOOO.OooOOO0().getValue();
        this.vip = value.getFirst().booleanValue() ? 1 : 0;
        this.vipLevel = value.getSecond().intValue();
        this.propNum = 0L;
        this.isSendProp = false;
        this.isDel = false;
        this.createTime = System.currentTimeMillis();
        return this;
    }

    public void setLocalPostCommentReplyModelId(long j) {
        this.id = j;
    }

    public void setMedal(String str) {
        this.medal = str;
    }

    public void setPraise(boolean z) {
        this.isPraise = z;
    }

    public void setPraiseNum(long j) {
        this.praiseNum = j;
    }

    public void setPropNum(long j) {
        this.propNum = j;
    }

    public void setRole(int i) {
        this.role = i;
    }

    public void setSendProp(boolean z) {
        this.isSendProp = z;
    }

    @Override // com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("PostCommentSonModel{userid=");
        sbOooO0o0.append(this.userid);
        sbOooO0o0.append(", nickname='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.nickname, '\'', ", parentUserId='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.parentUserId, '\'', ", parentUserName='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.parentUserName, '\'', ", content='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.content, '\'', ", id=");
        sbOooO0o0.append(this.id);
        sbOooO0o0.append(", sex=");
        sbOooO0o0.append(this.sex);
        sbOooO0o0.append(", vip=");
        sbOooO0o0.append(this.vip);
        sbOooO0o0.append(", vipLevel=");
        sbOooO0o0.append(this.vipLevel);
        sbOooO0o0.append(", isDel=");
        sbOooO0o0.append(this.isDel);
        sbOooO0o0.append(", propNum=");
        sbOooO0o0.append(this.propNum);
        sbOooO0o0.append(", isSendProp=");
        sbOooO0o0.append(this.isSendProp);
        sbOooO0o0.append(", createTime=");
        sbOooO0o0.append(this.createTime);
        sbOooO0o0.append(", headurl='");
        return kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO00o(sbOooO0o0, this.headurl, '\'', '}');
    }
}
