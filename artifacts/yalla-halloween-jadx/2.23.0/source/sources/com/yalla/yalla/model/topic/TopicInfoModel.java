package com.yalla.yalla.model.topic;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.model.bean.AbsJavaBean;
import com.yalla.yalla.model.moment.MomentDetailModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b+\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010g\u001a\u00020$J\u0006\u0010h\u001a\u00020$R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\u001a\u0010*\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R\u001e\u0010,\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u000f\"\u0004\b.\u0010\u0011R\u001e\u0010/\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000f\"\u0004\b1\u0010\u0011R\u001e\u00102\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u000f\"\u0004\b4\u0010\u0011R\u001e\u00105\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR\u001e\u00108\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR2\u0010;\u001a\u0016\u0012\u0004\u0012\u00020=\u0018\u00010<j\n\u0012\u0004\u0012\u00020=\u0018\u0001`>8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001e\u0010C\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u000f\"\u0004\bE\u0010\u0011R \u0010F\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0006\"\u0004\bH\u0010\bR\u001e\u0010I\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u001b\"\u0004\bK\u0010\u001dR\u001e\u0010L\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u000f\"\u0004\bN\u0010\u0011R\u001e\u0010O\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u000f\"\u0004\bQ\u0010\u0011R\u001e\u0010R\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0006\"\u0004\bT\u0010\bR\u001e\u0010U\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u000f\"\u0004\bW\u0010\u0011R\u001e\u0010X\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u000f\"\u0004\bZ\u0010\u0011R\u001e\u0010[\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u001b\"\u0004\b]\u0010\u001dR\u001e\u0010^\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u001b\"\u0004\b`\u0010\u001dR\u001e\u0010a\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u000f\"\u0004\bc\u0010\u0011R\u001e\u0010d\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u000f\"\u0004\bf\u0010\u0011¨\u0006i"}, d2 = {"Lcom/yalla/yalla/model/topic/TopicInfoModel;", "Lcom/yalla/yalla/model/bean/AbsJavaBean;", "()V", "createTime", "", "getCreateTime", "()Ljava/lang/String;", "setCreateTime", "(Ljava/lang/String;)V", "describe", "getDescribe", "setDescribe", "dyNum", "", "getDyNum", "()I", "setDyNum", "(I)V", "dyType", "getDyType", "setDyType", "headUrl", "getHeadUrl", "setHeadUrl", "id", "", "getId", "()J", "setId", "(J)V", "image", "getImage", "setImage", "isJoin", "setJoin", "isRecentlyLocal", "", "()Z", "setRecentlyLocal", "(Z)V", "isTitleLocal", "setTitleLocal", "isUpLocal", "setUpLocal", "joinNum", "getJoinNum", "setJoinNum", "kaVIPLv", "getKaVIPLv", "setKaVIPLv", "maxAdminCount", "getMaxAdminCount", "setMaxAdminCount", "name", "getName", "setName", "nickName", "getNickName", "setNickName", "notice", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/model/moment/MomentDetailModel;", "Lkotlin/collections/ArrayList;", "getNotice", "()Ljava/util/ArrayList;", "setNotice", "(Ljava/util/ArrayList;)V", "positionid", "getPositionid", "setPositionid", "postContent", "getPostContent", "setPostContent", "prettyid", "getPrettyid", "setPrettyid", "propPriceTotal", "getPropPriceTotal", "setPropPriceTotal", "region", "getRegion", "setRegion", "rule", "getRule", "setRule", "sex", "getSex", "setSex", "state", "getState", "setState", "topDyId", "getTopDyId", "setTopDyId", "userId", "getUserId", "setUserId", "vip", "getVip", "setVip", "vipLevel", "getVipLevel", "setVipLevel", "isManager", "isOwner", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TopicInfoModel extends AbsJavaBean {
    public static final int $stable = 8;

    @SerializedName("dyNum")
    private int dyNum;

    @SerializedName("dytype")
    private int dyType;

    @SerializedName("id")
    private long id;

    @SerializedName("isjoin")
    private int isJoin;
    private boolean isRecentlyLocal;
    private boolean isTitleLocal;
    private boolean isUpLocal;

    @SerializedName("joinNum")
    private int joinNum;

    @SerializedName(alternate = {"kaViPLv"}, value = "kaVIPLv")
    private int kaVIPLv;

    @SerializedName("maxAdminCount")
    private int maxAdminCount;

    @SerializedName("notice")
    @Nullable
    private ArrayList<MomentDetailModel> notice;

    @SerializedName("positionid")
    private int positionid;

    @SerializedName("prettyid")
    private long prettyid;

    @SerializedName("propPriceTotal")
    private int propPriceTotal;

    @SerializedName("region")
    private int region;

    @SerializedName("sex")
    private int sex;

    @SerializedName("state")
    private int state;

    @SerializedName("topdyid")
    private long topDyId;

    @SerializedName("userid")
    private long userId;

    @SerializedName("isVIP")
    private int vip;

    @SerializedName(alternate = {"nVipLv"}, value = "nVIPLv")
    private int vipLevel;

    @SerializedName("name")
    @NotNull
    private String name = "";

    @SerializedName("image")
    @NotNull
    private String image = "";

    @SerializedName("createTime")
    @NotNull
    private String createTime = "";

    @SerializedName("describe")
    @NotNull
    private String describe = "";

    @SerializedName("rule")
    @NotNull
    private String rule = "";

    @SerializedName("headurl")
    @NotNull
    private String headUrl = "";

    @SerializedName("nickname")
    @NotNull
    private String nickName = "";

    @SerializedName("content")
    @Nullable
    private String postContent = "";

    @NotNull
    public final String getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final String getDescribe() {
        return this.describe;
    }

    public final int getDyNum() {
        return this.dyNum;
    }

    public final int getDyType() {
        return this.dyType;
    }

    @NotNull
    public final String getHeadUrl() {
        return this.headUrl;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final int getJoinNum() {
        return this.joinNum;
    }

    public final int getKaVIPLv() {
        return this.kaVIPLv;
    }

    public final int getMaxAdminCount() {
        return this.maxAdminCount;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final ArrayList<MomentDetailModel> getNotice() {
        return this.notice;
    }

    public final int getPositionid() {
        return this.positionid;
    }

    @Nullable
    public final String getPostContent() {
        return this.postContent;
    }

    public final long getPrettyid() {
        return this.prettyid;
    }

    public final int getPropPriceTotal() {
        return this.propPriceTotal;
    }

    public final int getRegion() {
        return this.region;
    }

    @NotNull
    public final String getRule() {
        return this.rule;
    }

    public final int getSex() {
        return this.sex;
    }

    public final int getState() {
        return this.state;
    }

    public final long getTopDyId() {
        return this.topDyId;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final int getVip() {
        return this.vip;
    }

    public final int getVipLevel() {
        return this.vipLevel;
    }

    /* JADX INFO: renamed from: isJoin, reason: from getter */
    public final int getIsJoin() {
        return this.isJoin;
    }

    public final boolean isManager() {
        return this.positionid == 3;
    }

    public final boolean isOwner() {
        return this.positionid == 1;
    }

    /* JADX INFO: renamed from: isRecentlyLocal, reason: from getter */
    public final boolean getIsRecentlyLocal() {
        return this.isRecentlyLocal;
    }

    /* JADX INFO: renamed from: isTitleLocal, reason: from getter */
    public final boolean getIsTitleLocal() {
        return this.isTitleLocal;
    }

    /* JADX INFO: renamed from: isUpLocal, reason: from getter */
    public final boolean getIsUpLocal() {
        return this.isUpLocal;
    }

    public final void setCreateTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.createTime = str;
    }

    public final void setDescribe(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.describe = str;
    }

    public final void setDyNum(int i) {
        this.dyNum = i;
    }

    public final void setDyType(int i) {
        this.dyType = i;
    }

    public final void setHeadUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.headUrl = str;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.image = str;
    }

    public final void setJoin(int i) {
        this.isJoin = i;
    }

    public final void setJoinNum(int i) {
        this.joinNum = i;
    }

    public final void setKaVIPLv(int i) {
        this.kaVIPLv = i;
    }

    public final void setMaxAdminCount(int i) {
        this.maxAdminCount = i;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setNickName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nickName = str;
    }

    public final void setNotice(@Nullable ArrayList<MomentDetailModel> arrayList) {
        this.notice = arrayList;
    }

    public final void setPositionid(int i) {
        this.positionid = i;
    }

    public final void setPostContent(@Nullable String str) {
        this.postContent = str;
    }

    public final void setPrettyid(long j) {
        this.prettyid = j;
    }

    public final void setPropPriceTotal(int i) {
        this.propPriceTotal = i;
    }

    public final void setRecentlyLocal(boolean z) {
        this.isRecentlyLocal = z;
    }

    public final void setRegion(int i) {
        this.region = i;
    }

    public final void setRule(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rule = str;
    }

    public final void setSex(int i) {
        this.sex = i;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final void setTitleLocal(boolean z) {
        this.isTitleLocal = z;
    }

    public final void setTopDyId(long j) {
        this.topDyId = j;
    }

    public final void setUpLocal(boolean z) {
        this.isUpLocal = z;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }

    public final void setVip(int i) {
        this.vip = i;
    }

    public final void setVipLevel(int i) {
        this.vipLevel = i;
    }
}
