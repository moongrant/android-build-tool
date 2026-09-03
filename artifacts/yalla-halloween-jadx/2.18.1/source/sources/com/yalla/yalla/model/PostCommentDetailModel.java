package com.yalla.yalla.model;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.bean.AbsJavaBean;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import p388o0OOooO.o00000O0;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public class PostCommentDetailModel extends AbsJavaBean {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private String content;
    private long createTime;
    private String headurl;
    private long id;
    private boolean isAddedLocalList = false;
    private boolean isDel;
    private int isFeature;
    private boolean isPraise;
    private boolean isSendProp;
    public int kaVIPLv;
    private long localId;
    private boolean localMessageDiscolor;
    private String nickname;
    private int num;
    private long praiseNum;
    private long propNum;
    private int role;
    private int sex;
    private ArrayList<PostCommentSonModel> son;
    private String userid;

    @SerializedName("isVIP")
    private int vip;

    @SerializedName(alternate = {"nVipLv"}, value = "nVIPLv")
    private int vipLevel;

    public PostCommentDetailModel addLocalSendingCommentReplyModel(MomentSendCommentModel momentSendCommentModel) {
        if (this.son == null) {
            this.son = new ArrayList<>();
        }
        this.num++;
        if (this.son.size() == 0) {
            this.son.add(new PostCommentSonModel().setLocalPostCommentReplyModel(momentSendCommentModel));
        } else {
            this.son.add(0, new PostCommentSonModel().setLocalPostCommentReplyModel(momentSendCommentModel));
        }
        return this;
    }

    public MomentSendContentModel getContent() {
        return !TextUtils.isEmpty(this.content) ? (MomentSendContentModel) o0Oo0oo.OooO0OO(this.content, new o00000O0<MomentSendContentModel>() { // from class: com.yalla.yalla.model.PostCommentDetailModel.1
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

    public int getIsFeature() {
        return this.isFeature;
    }

    public long getLocalId() {
        return this.localId;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getNum() {
        return this.num;
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

    public List<PostCommentSonModel> getSon() {
        return this.son;
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

    public boolean isAddedLocalList() {
        return this.isAddedLocalList;
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

    public PostCommentDetailModel removeLocalSendingCommentReplyModel(MomentSendCommentModel momentSendCommentModel) {
        if (this.son == null) {
            this.son = new ArrayList<>();
        }
        int i = this.num;
        int i2 = 0;
        this.num = i + (-1) < 0 ? 0 : i - 1;
        for (int i3 = 0; i3 < this.son.size(); i3++) {
            PostCommentSonModel postCommentSonModel = this.son.get(i3);
            if (postCommentSonModel != null && postCommentSonModel.getLocalId() == momentSendCommentModel.getLocalId()) {
                i2 = i3;
                break;
            }
        }
        if (this.son.size() > i2) {
            this.son.remove(i2);
        }
        return this;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIsAddedLocalList(boolean z) {
        this.isAddedLocalList = z;
    }

    public void setLoadPostCommentDetailModel(long j, String str, String str2, String str3, String str4, long j2, boolean z) {
        this.localMessageDiscolor = z;
        this.id = j;
        this.userid = str;
        this.nickname = str2;
        this.headurl = str3;
        this.sex = this.sex;
        this.vip = this.vip;
        this.vipLevel = this.vipLevel;
        this.content = str4;
        this.num = this.num;
        this.createTime = j2;
        this.isDel = this.isDel;
        this.son = this.son;
        this.role = this.role;
        this.praiseNum = 0L;
        this.isFeature = 0;
        this.isPraise = false;
        this.propNum = 0L;
        this.isSendProp = false;
        this.kaVIPLv = 0;
    }

    public void setLocalMessageDiscolor(boolean z) {
        this.localMessageDiscolor = z;
    }

    public PostCommentDetailModel setLocalSendingCommentModel(MomentSendCommentModel momentSendCommentModel) {
        if (momentSendCommentModel != null) {
            this.localId = momentSendCommentModel.getLocalId();
            this.id = 0L;
            this.content = momentSendCommentModel.getContent().toJSONString();
            StringBuilder sb = new StringBuilder();
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            sb.append(oooOOO.OooOo().getValue());
            sb.append("");
            this.userid = sb.toString();
            this.nickname = oooOOO.OooOoO().getValue();
            this.headurl = oooOOO.OooO0oo().getValue();
            this.sex = oooOOO.OooOOOo().getValue().intValue();
            Pair<Boolean, Integer> value = oooOOO.OooOOO0().getValue();
            this.vip = value.getFirst().booleanValue() ? 1 : 0;
            this.vipLevel = value.getSecond().intValue();
            this.createTime = System.currentTimeMillis();
            this.num = 0;
            this.isDel = true;
            this.son = null;
            this.role = 0;
            this.localMessageDiscolor = false;
            this.praiseNum = 0L;
            this.isFeature = 0;
            this.isPraise = false;
            this.propNum = 0L;
            this.isSendProp = false;
            MutableLiveData<Pair<Integer, Integer>> mutableLiveDataOooO = oooOOO.OooO();
            if (mutableLiveDataOooO.getValue() != null) {
                this.kaVIPLv = mutableLiveDataOooO.getValue().getSecond().intValue();
            }
        }
        return this;
    }

    public void setLocalSendingCommentModelId(long j) {
        this.id = j;
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

    public void setSendProp(boolean z) {
        this.isSendProp = z;
    }

    @Override // com.app.base.bean.AbsJavaBean
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList<PostCommentSonModel> arrayList = this.son;
        if (arrayList != null) {
            Iterator<PostCommentSonModel> it = arrayList.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next().toString());
            }
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("PostCommentDetailModel{id=");
        sbOooO0o0.append(this.id);
        sbOooO0o0.append(", userid='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.userid, '\'', ", nickname='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.nickname, '\'', ", headurl='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.headurl, '\'', ", sex=");
        sbOooO0o0.append(this.sex);
        sbOooO0o0.append(", vip=");
        sbOooO0o0.append(this.vip);
        sbOooO0o0.append(", vipLevel=");
        sbOooO0o0.append(this.vipLevel);
        sbOooO0o0.append(", content='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.content, '\'', ", num=");
        sbOooO0o0.append(this.num);
        sbOooO0o0.append(", createTime=");
        sbOooO0o0.append(this.createTime);
        sbOooO0o0.append(", isDel=");
        sbOooO0o0.append(this.isDel);
        sbOooO0o0.append(", son=");
        sbOooO0o0.append((Object) stringBuffer);
        sbOooO0o0.append(", role=");
        sbOooO0o0.append(this.role);
        sbOooO0o0.append(", propNum=");
        sbOooO0o0.append(this.propNum);
        sbOooO0o0.append(", isSendProp=");
        sbOooO0o0.append(this.isSendProp);
        sbOooO0o0.append(", localMessageDiscolor=");
        sbOooO0o0.append(this.localMessageDiscolor);
        sbOooO0o0.append(", \n getContent=");
        sbOooO0o0.append(getContent());
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
