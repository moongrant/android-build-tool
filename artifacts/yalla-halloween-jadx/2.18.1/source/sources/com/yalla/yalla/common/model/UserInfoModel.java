package com.yalla.yalla.common.model;

import OooO00o.OooO00o;
import Oooo000.Oooo0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.model.ProfileLimitModel;
import com.app.base.model.UserInfoApiModel;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.common.db.converter.BooleanTypeAdapter;
import com.yalla.yalla.common.db.table.UserInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0002JKB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010D\u001a\u00020EH\u0016J\b\u0010F\u001a\u000202H\u0016J\u000e\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u0000R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001e\u0010\u001c\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001e\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\u001e\u0010\"\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001a\u0010%\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\r\"\u0004\b&\u0010\u000fR\u001e\u0010'\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010\u000fR\u001e\u0010)\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000fR\u001e\u0010+\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u000fR\u001e\u0010-\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\r\"\u0004\b.\u0010\u000fR\u001e\u0010/\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\r\"\u0004\b0\u0010\u000fR\u001e\u00101\u001a\u0002028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00107\u001a\b\u0012\u0004\u0012\u000209088\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010>\u001a\u00020?8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006L"}, d2 = {"Lcom/yalla/yalla/common/model/UserInfoModel;", "Lcom/yalla/yalla/common/db/table/UserInfo;", "Ljava/io/Serializable;", "()V", "coin", "", "getCoin", "()J", "setCoin", "(J)V", "coinFrozen", "", "getCoinFrozen", "()Z", "setCoinFrozen", "(Z)V", "crystal", "getCrystal", "setCrystal", "debtAmount", "", "getDebtAmount", "()I", "setDebtAmount", "(I)V", "eventSubscribeTime", "getEventSubscribeTime", "setEventSubscribeTime", "friendTime", "getFriendTime", "setFriendTime", "inHeBlack", "getInHeBlack", "setInHeBlack", "inRoom", "getInRoom", "setInRoom", "isBindPhone", "setBindPhone", "isBlack", "setBlack", "isFollow", "setFollow", "isFriend", "setFriend", "isNewUser", "setNewUser", "isShowMomentPostDialog", "setShowMomentPostDialog", "memoName", "", "getMemoName", "()Ljava/lang/String;", "setMemoName", "(Ljava/lang/String;)V", "profileLimit", "", "Lcom/app/base/model/ProfileLimitModel;", "getProfileLimit", "()Ljava/util/List;", "setProfileLimit", "(Ljava/util/List;)V", "purview", "Lcom/yalla/yalla/common/model/UserInfoModel$Purview;", "getPurview", "()Lcom/yalla/yalla/common/model/UserInfoModel$Purview;", "setPurview", "(Lcom/yalla/yalla/common/model/UserInfoModel$Purview;)V", "toOldModel", "Lcom/app/base/model/UserInfoApiModel;", "toString", "updateInfo", "", "userInfo", "Companion", "Purview", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class UserInfoModel extends UserInfo {
    public static final int ROLE_OFFICIAL = 2;
    public static final int ROLE_ORDINARY = 0;
    public static final int ROLE_SUPERADMIN = 1;

    @SerializedName("coin")
    private long coin;
    private boolean coinFrozen;

    @SerializedName("crystal")
    private long crystal;
    private int debtAmount;

    @SerializedName("createTime")
    private long eventSubscribeTime;

    @SerializedName(alternate = {"createtime"}, value = "friendTime")
    private long friendTime;

    @SerializedName(alternate = {"hePullBlack"}, value = "inHeBlack")
    @JsonAdapter(BooleanTypeAdapter.class)
    private boolean inHeBlack;

    @SerializedName(alternate = {"inroom"}, value = "isInRoom")
    private long inRoom;

    @SerializedName(alternate = {"pullblack"}, value = "isBlack")
    @JsonAdapter(BooleanTypeAdapter.class)
    private boolean isBlack;

    @SerializedName(alternate = {"isfollow"}, value = "isFollow")
    @JsonAdapter(BooleanTypeAdapter.class)
    private boolean isFollow;

    @SerializedName(alternate = {"isfriend"}, value = "isFriend")
    @JsonAdapter(BooleanTypeAdapter.class)
    private boolean isFriend;

    @SerializedName("isShopPop")
    private boolean isShowMomentPostDialog;
    public static final int $stable = 8;

    @SerializedName(alternate = {"remark"}, value = "memoName")
    @NotNull
    private String memoName = "";

    @SerializedName("profileLimit")
    @NotNull
    private List<ProfileLimitModel> profileLimit = new ArrayList();

    @SerializedName(alternate = {"power"}, value = "purview")
    @NotNull
    private Purview purview = new Purview();

    @SerializedName(alternate = {"isnewuser"}, value = "isNewUser")
    @JsonAdapter(BooleanTypeAdapter.class)
    private boolean isNewUser = true;
    private boolean isBindPhone = true;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/common/model/UserInfoModel$Purview;", "Ljava/io/Serializable;", "()V", "isVerify", "", "()Z", "setVerify", "(Z)V", "isWaterMark", "setWaterMark", "seeInRoom", "", "getSeeInRoom", "()I", "setSeeInRoom", "(I)V", "seeRoom", "getSeeRoom", "setSeeRoom", "toString", "", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Purview implements Serializable {
        public static final int $stable = 8;

        @SerializedName(alternate = {"isverify"}, value = "isVerify")
        @JsonAdapter(BooleanTypeAdapter.class)
        private boolean isVerify = true;

        @SerializedName("isWaterMark")
        @JsonAdapter(BooleanTypeAdapter.class)
        private boolean isWaterMark;

        @SerializedName(alternate = {"seeinroom"}, value = "seeInRoom")
        private int seeInRoom;

        @SerializedName(alternate = {"seeroom"}, value = "seeRoom")
        private int seeRoom;

        public final int getSeeInRoom() {
            return this.seeInRoom;
        }

        public final int getSeeRoom() {
            return this.seeRoom;
        }

        /* JADX INFO: renamed from: isVerify, reason: from getter */
        public final boolean getIsVerify() {
            return this.isVerify;
        }

        /* JADX INFO: renamed from: isWaterMark, reason: from getter */
        public final boolean getIsWaterMark() {
            return this.isWaterMark;
        }

        public final void setSeeInRoom(int i) {
            this.seeInRoom = i;
        }

        public final void setSeeRoom(int i) {
            this.seeRoom = i;
        }

        public final void setVerify(boolean z) {
            this.isVerify = z;
        }

        public final void setWaterMark(boolean z) {
            this.isWaterMark = z;
        }

        @NotNull
        public String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Purview(isVerify=");
            sbOooO0o0.append(this.isVerify);
            sbOooO0o0.append(", seeInRoom=");
            sbOooO0o0.append(this.seeInRoom);
            sbOooO0o0.append(", seeRoom=");
            sbOooO0o0.append(this.seeRoom);
            sbOooO0o0.append(", isWaterMark=");
            return Oooo0.OooO0O0(sbOooO0o0, this.isWaterMark, ')');
        }
    }

    public final long getCoin() {
        return this.coin;
    }

    public final boolean getCoinFrozen() {
        return this.coinFrozen;
    }

    public final long getCrystal() {
        return this.crystal;
    }

    public final int getDebtAmount() {
        return this.debtAmount;
    }

    public final long getEventSubscribeTime() {
        return this.eventSubscribeTime;
    }

    public final long getFriendTime() {
        return this.friendTime;
    }

    public final boolean getInHeBlack() {
        return this.inHeBlack;
    }

    public final long getInRoom() {
        return this.inRoom;
    }

    @NotNull
    public final String getMemoName() {
        return this.memoName;
    }

    @NotNull
    public final List<ProfileLimitModel> getProfileLimit() {
        return this.profileLimit;
    }

    @NotNull
    public final Purview getPurview() {
        return this.purview;
    }

    /* JADX INFO: renamed from: isBindPhone, reason: from getter */
    public final boolean getIsBindPhone() {
        return this.isBindPhone;
    }

    /* JADX INFO: renamed from: isBlack, reason: from getter */
    public final boolean getIsBlack() {
        return this.isBlack;
    }

    /* JADX INFO: renamed from: isFollow, reason: from getter */
    public final boolean getIsFollow() {
        return this.isFollow;
    }

    /* JADX INFO: renamed from: isFriend, reason: from getter */
    public final boolean getIsFriend() {
        return this.isFriend;
    }

    /* JADX INFO: renamed from: isNewUser, reason: from getter */
    public final boolean getIsNewUser() {
        return this.isNewUser;
    }

    /* JADX INFO: renamed from: isShowMomentPostDialog, reason: from getter */
    public final boolean getIsShowMomentPostDialog() {
        return this.isShowMomentPostDialog;
    }

    public final void setBindPhone(boolean z) {
        this.isBindPhone = z;
    }

    public final void setBlack(boolean z) {
        this.isBlack = z;
    }

    public final void setCoin(long j) {
        this.coin = j;
    }

    public final void setCoinFrozen(boolean z) {
        this.coinFrozen = z;
    }

    public final void setCrystal(long j) {
        this.crystal = j;
    }

    public final void setDebtAmount(int i) {
        this.debtAmount = i;
    }

    public final void setEventSubscribeTime(long j) {
        this.eventSubscribeTime = j;
    }

    public final void setFollow(boolean z) {
        this.isFollow = z;
    }

    public final void setFriend(boolean z) {
        this.isFriend = z;
    }

    public final void setFriendTime(long j) {
        this.friendTime = j;
    }

    public final void setInHeBlack(boolean z) {
        this.inHeBlack = z;
    }

    public final void setInRoom(long j) {
        this.inRoom = j;
    }

    public final void setMemoName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.memoName = str;
    }

    public final void setNewUser(boolean z) {
        this.isNewUser = z;
    }

    public final void setProfileLimit(@NotNull List<ProfileLimitModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.profileLimit = list;
    }

    public final void setPurview(@NotNull Purview purview) {
        Intrinsics.checkNotNullParameter(purview, "<set-?>");
        this.purview = purview;
    }

    public final void setShowMomentPostDialog(boolean z) {
        this.isShowMomentPostDialog = z;
    }

    @Override // com.yalla.yalla.common.db.table.UserInfo
    @NotNull
    public UserInfoApiModel toOldModel() {
        UserInfoApiModel oldModel = super.toOldModel();
        oldModel.setCoin(this.coin);
        oldModel.setCrystal(this.crystal);
        oldModel.setIsfollow(this.isFollow ? 1 : 0);
        oldModel.setIsfriend(this.isFriend ? 1 : 0);
        oldModel.setPullblack(this.isBlack ? 1 : 0);
        oldModel.setHePullBlack(this.inHeBlack ? 1 : 0);
        oldModel.setMemoName(this.memoName);
        oldModel.setInroom(this.inRoom);
        Collection arrayList = this.profileLimit;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        oldModel.setProfileLimit(new ArrayList<>(arrayList));
        oldModel.setIsnewuser(this.isNewUser ? 1 : 0);
        oldModel.setCoinFrozen(this.coinFrozen);
        oldModel.setDebtAmount(this.debtAmount);
        UserInfoApiModel.PowerBean powerBean = new UserInfoApiModel.PowerBean();
        powerBean.setWaterMark(this.purview.getIsWaterMark() ? 1 : 0);
        powerBean.setIsverify(this.purview.getIsVerify() ? 1 : 0);
        powerBean.setSeeinroom(this.purview.getSeeInRoom());
        powerBean.setSeeroom(this.purview.getSeeRoom());
        oldModel.setPower(powerBean);
        return oldModel;
    }

    @Override // com.yalla.yalla.common.db.table.UserInfo
    @NotNull
    public String toString() {
        String string = super.toString();
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("UserInfoModel(inRoom=");
        sbOooO0o0.append(this.inRoom);
        sbOooO0o0.append(", coin=");
        sbOooO0o0.append(this.coin);
        sbOooO0o0.append(", crystal=");
        sbOooO0o0.append(this.crystal);
        sbOooO0o0.append(", isFollow=");
        sbOooO0o0.append(this.isFollow);
        sbOooO0o0.append(", isFriend=");
        sbOooO0o0.append(this.isFriend);
        sbOooO0o0.append(", isBlack=");
        sbOooO0o0.append(this.isBlack);
        sbOooO0o0.append(", inHeBlack=");
        sbOooO0o0.append(this.inHeBlack);
        sbOooO0o0.append(", remark='");
        sbOooO0o0.append(this.memoName);
        sbOooO0o0.append("', profileLimit=");
        sbOooO0o0.append(this.profileLimit);
        sbOooO0o0.append(", purview=");
        sbOooO0o0.append(this.purview);
        sbOooO0o0.append(")，");
        sbOooO0o0.append(string);
        sbOooO0o0.append("coinFrozen=");
        sbOooO0o0.append(this.coinFrozen);
        sbOooO0o0.append(",debtAmount=");
        sbOooO0o0.append(this.debtAmount);
        return sbOooO0o0.toString();
    }

    public final void updateInfo(@NotNull UserInfoModel userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        super.updateInfo((UserInfo) userInfo);
        this.isFollow = userInfo.isFollow;
        this.isFriend = userInfo.isFriend;
    }
}
