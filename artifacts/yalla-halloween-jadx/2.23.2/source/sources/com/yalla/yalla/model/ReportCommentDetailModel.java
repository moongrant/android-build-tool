package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b4\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001e\u0010\u0019\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\"\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\"\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\"\u0010!\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR \u0010$\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\r\"\u0004\b&\u0010\u000fR\"\u0010'\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR \u0010*\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u000fR\"\u0010-\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\"\u00100\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR \u00103\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\r\"\u0004\b5\u0010\u000fR\"\u00106\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\"\u00109\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\"\u0010<\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\"\u0010?\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\"\u0010B\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\b¨\u0006E"}, d2 = {"Lcom/yalla/yalla/model/ReportCommentDetailModel;", "", "()V", "comHot", "", "getComHot", "()Ljava/lang/Integer;", "setComHot", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "createTime", "", "getCreateTime", "()J", "setCreateTime", "(J)V", "headurl", "getHeadurl", "setHeadurl", "id", "getId", "setId", "isVIP", "setVIP", "kaVIPLv", "getKaVIPLv", "setKaVIPLv", "kaVipState", "getKaVipState", "setKaVipState", "medal", "getMedal", "setMedal", "nVIPLv", "getNVIPLv", "setNVIPLv", "nickname", "getNickname", "setNickname", "num", "getNum", "setNum", "parentUserId", "getParentUserId", "setParentUserId", "parentUserName", "getParentUserName", "setParentUserName", "praiseNum", "getPraiseNum", "setPraiseNum", "propNum", "getPropNum", "setPropNum", "role", "getRole", "setRole", "sex", "getSex", "setSex", "userid", "getUserid", "setUserid", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReportCommentDetailModel {
    public static final int $stable = 8;

    @SerializedName("comHot")
    @Nullable
    private Integer comHot;

    @SerializedName("content")
    @Nullable
    private String content;

    @SerializedName("createTime")
    private long createTime;

    @SerializedName("headurl")
    @Nullable
    private String headurl;

    @SerializedName("id")
    private long id;

    @SerializedName("isVIP")
    @Nullable
    private Integer isVIP;

    @SerializedName("kaVIPLv")
    @Nullable
    private Integer kaVIPLv;

    @SerializedName("kaVipState")
    @Nullable
    private Integer kaVipState;

    @SerializedName("medal")
    @Nullable
    private String medal;

    @SerializedName("nVIPLv")
    @Nullable
    private Integer nVIPLv;

    @SerializedName("nickname")
    @Nullable
    private String nickname;

    @SerializedName("num")
    @Nullable
    private Integer num;

    @SerializedName("parentUserId")
    @Nullable
    private Integer parentUserId;

    @SerializedName("parentUserName")
    @Nullable
    private String parentUserName;

    @SerializedName("praiseNum")
    @Nullable
    private Integer praiseNum;

    @SerializedName("propNum")
    @Nullable
    private Integer propNum;

    @SerializedName("role")
    @Nullable
    private Integer role;

    @SerializedName("sex")
    @Nullable
    private Integer sex;

    @SerializedName("userid")
    @Nullable
    private Integer userid;

    @Nullable
    public final Integer getComHot() {
        return this.comHot;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final String getHeadurl() {
        return this.headurl;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final Integer getKaVIPLv() {
        return this.kaVIPLv;
    }

    @Nullable
    public final Integer getKaVipState() {
        return this.kaVipState;
    }

    @Nullable
    public final String getMedal() {
        return this.medal;
    }

    @Nullable
    public final Integer getNVIPLv() {
        return this.nVIPLv;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final Integer getNum() {
        return this.num;
    }

    @Nullable
    public final Integer getParentUserId() {
        return this.parentUserId;
    }

    @Nullable
    public final String getParentUserName() {
        return this.parentUserName;
    }

    @Nullable
    public final Integer getPraiseNum() {
        return this.praiseNum;
    }

    @Nullable
    public final Integer getPropNum() {
        return this.propNum;
    }

    @Nullable
    public final Integer getRole() {
        return this.role;
    }

    @Nullable
    public final Integer getSex() {
        return this.sex;
    }

    @Nullable
    public final Integer getUserid() {
        return this.userid;
    }

    @Nullable
    /* JADX INFO: renamed from: isVIP, reason: from getter */
    public final Integer getIsVIP() {
        return this.isVIP;
    }

    public final void setComHot(@Nullable Integer num) {
        this.comHot = num;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setHeadurl(@Nullable String str) {
        this.headurl = str;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setKaVIPLv(@Nullable Integer num) {
        this.kaVIPLv = num;
    }

    public final void setKaVipState(@Nullable Integer num) {
        this.kaVipState = num;
    }

    public final void setMedal(@Nullable String str) {
        this.medal = str;
    }

    public final void setNVIPLv(@Nullable Integer num) {
        this.nVIPLv = num;
    }

    public final void setNickname(@Nullable String str) {
        this.nickname = str;
    }

    public final void setNum(@Nullable Integer num) {
        this.num = num;
    }

    public final void setParentUserId(@Nullable Integer num) {
        this.parentUserId = num;
    }

    public final void setParentUserName(@Nullable String str) {
        this.parentUserName = str;
    }

    public final void setPraiseNum(@Nullable Integer num) {
        this.praiseNum = num;
    }

    public final void setPropNum(@Nullable Integer num) {
        this.propNum = num;
    }

    public final void setRole(@Nullable Integer num) {
        this.role = num;
    }

    public final void setSex(@Nullable Integer num) {
        this.sex = num;
    }

    public final void setUserid(@Nullable Integer num) {
        this.userid = num;
    }

    public final void setVIP(@Nullable Integer num) {
        this.isVIP = num;
    }
}
