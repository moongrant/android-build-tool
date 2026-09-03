package com.app.base.app.appConfig.apiDataModela;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p058o0000OoO.OooO;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010;\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR\u001c\u0010 \u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u000eR\u001c\u0010,\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010\u000eR\u001c\u0010/\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\f\"\u0004\b1\u0010\u000eR\u001c\u00102\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\f\"\u0004\b4\u0010\u000eR\u001c\u00105\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\f\"\u0004\b7\u0010\u000eR\u001c\u00108\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\f\"\u0004\b:\u0010\u000e¨\u0006<"}, d2 = {"Lcom/app/base/app/appConfig/apiDataModela/FriendsModel;", "", "()V", "createtime", "", "getCreatetime", "()J", "setCreatetime", "(J)V", "headframeurl", "", "getHeadframeurl", "()Ljava/lang/String;", "setHeadframeurl", "(Ljava/lang/String;)V", "headurl", "getHeadurl", "setHeadurl", "imageurl", "getImageurl", "setImageurl", "isChecked", "", "()Z", "setChecked", "(Z)V", "memoName", "getMemoName", "setMemoName", "nickname", "getNickname", "setNickname", "prettyid", "getPrettyid", "setPrettyid", "role", "", "getRole", "()I", "setRole", "(I)V", "sex", "getSex", "setSex", "sign", "getSign", "setSign", "userid", "getUserid", "setUserid", "userlevel", "getUserlevel", "setUserlevel", "vip", "getVip", "setVip", "viplevel", "getViplevel", "setViplevel", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FriendsModel {
    public static final int $stable = 8;
    private long createtime;

    @Nullable
    private String headframeurl;

    @Nullable
    private String headurl;

    @Nullable
    private String imageurl;
    private boolean isChecked = true;

    @NotNull
    private String memoName = "";

    @Nullable
    private String nickname;

    @Nullable
    private String prettyid;
    private int role;

    @Nullable
    private String sex;

    @Nullable
    private String sign;

    @Nullable
    private String userid;

    @Nullable
    private String userlevel;

    @Nullable
    private String vip;

    @Nullable
    private String viplevel;

    public final long getCreatetime() {
        return this.createtime;
    }

    @Nullable
    public final String getHeadframeurl() {
        return this.headframeurl;
    }

    @Nullable
    public final String getHeadurl() {
        return this.headurl;
    }

    @Nullable
    public final String getImageurl() {
        return this.imageurl;
    }

    @NotNull
    public final String getMemoName() {
        return this.memoName;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final String getPrettyid() {
        return this.prettyid;
    }

    public final int getRole() {
        return this.role;
    }

    @Nullable
    public final String getSex() {
        return this.sex;
    }

    @Nullable
    public final String getSign() {
        return this.sign;
    }

    @Nullable
    public final String getUserid() {
        return this.userid;
    }

    @Nullable
    public final String getUserlevel() {
        return this.userlevel;
    }

    @Nullable
    public final String getVip() {
        return this.vip;
    }

    @Nullable
    public final String getViplevel() {
        return this.viplevel;
    }

    /* JADX INFO: renamed from: isChecked, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    public final void setChecked(boolean z) {
        this.isChecked = z;
    }

    public final void setCreatetime(long j) {
        this.createtime = j;
    }

    public final void setHeadframeurl(@Nullable String str) {
        this.headframeurl = str;
    }

    public final void setHeadurl(@Nullable String str) {
        this.headurl = str;
    }

    public final void setImageurl(@Nullable String str) {
        this.imageurl = str;
    }

    public final void setMemoName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.memoName = str;
    }

    public final void setNickname(@Nullable String str) {
        this.nickname = str;
    }

    public final void setPrettyid(@Nullable String str) {
        this.prettyid = str;
    }

    public final void setRole(int i) {
        this.role = i;
    }

    public final void setSex(@Nullable String str) {
        this.sex = str;
    }

    public final void setSign(@Nullable String str) {
        this.sign = str;
    }

    public final void setUserid(@Nullable String str) {
        this.userid = str;
    }

    public final void setUserlevel(@Nullable String str) {
        this.userlevel = str;
    }

    public final void setVip(@Nullable String str) {
        this.vip = str;
    }

    public final void setViplevel(@Nullable String str) {
        this.viplevel = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("FriendsModel(userid=");
        sbOooO0o0.append(this.userid);
        sbOooO0o0.append(", imageurl=");
        sbOooO0o0.append(this.imageurl);
        sbOooO0o0.append(", headurl=");
        sbOooO0o0.append(this.headurl);
        sbOooO0o0.append(", nickname=");
        sbOooO0o0.append(this.nickname);
        sbOooO0o0.append(", userlevel=");
        sbOooO0o0.append(this.userlevel);
        sbOooO0o0.append(", sex=");
        sbOooO0o0.append(this.sex);
        sbOooO0o0.append(", vip=");
        sbOooO0o0.append(this.vip);
        sbOooO0o0.append(", viplevel=");
        sbOooO0o0.append(this.viplevel);
        sbOooO0o0.append(", prettyid=");
        sbOooO0o0.append(this.prettyid);
        sbOooO0o0.append(", createtime=");
        sbOooO0o0.append(this.createtime);
        sbOooO0o0.append(", role=");
        sbOooO0o0.append(this.role);
        sbOooO0o0.append(", isChecked=");
        sbOooO0o0.append(this.isChecked);
        sbOooO0o0.append(", sign=");
        sbOooO0o0.append(this.sign);
        sbOooO0o0.append(", headframeurl=");
        sbOooO0o0.append(this.headframeurl);
        sbOooO0o0.append(", memoName='");
        return OooO.OooO00o(sbOooO0o0, this.memoName, "')");
    }
}
