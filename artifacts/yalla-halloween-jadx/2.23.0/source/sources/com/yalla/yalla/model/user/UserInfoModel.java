package com.yalla.yalla.model.user;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.data.db.converter.BooleanTypeAdapter;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.ProfileLimitModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000 72\u00020\u00012\u00020\u0002:\u000278B\u0005¢\u0006\u0002\u0010\u0003J\b\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020\u001fH\u0016J\u000e\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0000R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001e\u0010\u0016\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\u001e\u0010\u0018\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R\u001e\u0010\u001a\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R\u001e\u0010\u001c\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u0012R\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020,8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00069"}, d2 = {"Lcom/yalla/yalla/model/user/UserInfoModel;", "Lcom/yalla/yalla/data/db/table/UserInfo;", "Ljava/io/Serializable;", "()V", "eventSubscribeTime", "", "getEventSubscribeTime", "()J", "setEventSubscribeTime", "(J)V", "friendTime", "getFriendTime", "setFriendTime", "inHeBlack", "", "getInHeBlack", "()Z", "setInHeBlack", "(Z)V", "inRoomId", "getInRoomId", "setInRoomId", "isBlack", "setBlack", "isFollow", "setFollow", "isFriend", "setFriend", "isShowMomentPostDialog", "setShowMomentPostDialog", "memoName", "", "getMemoName", "()Ljava/lang/String;", "setMemoName", "(Ljava/lang/String;)V", "profileLimit", "", "Lcom/yalla/yalla/model/ProfileLimitModel;", "getProfileLimit", "()Ljava/util/List;", "setProfileLimit", "(Ljava/util/List;)V", "purview", "Lcom/yalla/yalla/model/user/UserInfoModel$Purview;", "getPurview", "()Lcom/yalla/yalla/model/user/UserInfoModel$Purview;", "setPurview", "(Lcom/yalla/yalla/model/user/UserInfoModel$Purview;)V", "toOldModel", "Lcom/yalla/yalla/model/user/UserInfoApiModel;", "toString", "updateInfo", "", "userInfo", "Companion", "Purview", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class UserInfoModel extends UserInfo {
    public static final int ROLE_OFFICIAL = 2;
    public static final int ROLE_ORDINARY = 0;
    public static final int ROLE_SUPERADMIN = 1;

    @SerializedName("createTime")
    private long eventSubscribeTime;

    @SerializedName(alternate = {"createtime"}, value = "friendTime")
    private long friendTime;

    @SerializedName(alternate = {"hePullBlack"}, value = "inHeBlack")
    @JsonAdapter(BooleanTypeAdapter.class)
    private boolean inHeBlack;

    @SerializedName("inroom")
    private long inRoomId;

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

    @SerializedName(alternate = {"remark"}, value = "memoName")
    @NotNull
    private String memoName = "";

    @SerializedName("profileLimit")
    @NotNull
    private List<ProfileLimitModel> profileLimit = new ArrayList();

    @SerializedName(alternate = {"power"}, value = "purview")
    @NotNull
    private Purview purview = new Purview();
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/model/user/UserInfoModel$Purview;", "Ljava/io/Serializable;", "()V", "isVerify", "", "()Z", "setVerify", "(Z)V", "isWaterMark", "setWaterMark", "seeInRoom", "", "getSeeInRoom", "()I", "setSeeInRoom", "(I)V", "seeRoom", "getSeeRoom", "setSeeRoom", "toString", "", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
            return "Purview(isVerify=" + this.isVerify + ", seeInRoom=" + this.seeInRoom + ", seeRoom=" + this.seeRoom + ", isWaterMark=" + this.isWaterMark + ")";
        }
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

    public final long getInRoomId() {
        return this.inRoomId;
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

    /* JADX INFO: renamed from: isShowMomentPostDialog, reason: from getter */
    public final boolean getIsShowMomentPostDialog() {
        return this.isShowMomentPostDialog;
    }

    public final void setBlack(boolean z) {
        this.isBlack = z;
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

    public final void setInRoomId(long j) {
        this.inRoomId = j;
    }

    public final void setMemoName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.memoName = str;
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

    @Override // com.yalla.yalla.data.db.table.UserInfo
    @NotNull
    public UserInfoApiModel toOldModel() {
        UserInfoApiModel oldModel = super.toOldModel();
        oldModel.setIsfollow(this.isFollow ? 1 : 0);
        oldModel.setIsfriend(this.isFriend ? 1 : 0);
        oldModel.setPullblack(this.isBlack ? 1 : 0);
        oldModel.setBlackUser(getIsBlackUser() ? 1 : 0);
        oldModel.setHePullBlack(this.inHeBlack ? 1 : 0);
        oldModel.setMemoName(this.memoName);
        oldModel.setInroom(this.inRoomId);
        Collection arrayList = this.profileLimit;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        oldModel.setProfileLimit(new ArrayList<>(arrayList));
        UserInfoApiModel.PowerBean powerBean = new UserInfoApiModel.PowerBean();
        powerBean.setWaterMark(this.purview.getIsWaterMark() ? 1 : 0);
        powerBean.setIsverify(this.purview.getIsVerify() ? 1 : 0);
        powerBean.setSeeinroom(this.purview.getSeeInRoom());
        powerBean.setSeeroom(this.purview.getSeeRoom());
        oldModel.setPower(powerBean);
        return oldModel;
    }

    @Override // com.yalla.yalla.data.db.table.UserInfo
    @NotNull
    public String toString() {
        String string = super.toString();
        long j = this.inRoomId;
        boolean z = this.isFollow;
        boolean z2 = this.isFriend;
        boolean z3 = this.isBlack;
        boolean z4 = this.inHeBlack;
        String str = this.memoName;
        List<ProfileLimitModel> list = this.profileLimit;
        Purview purview = this.purview;
        StringBuilder sb = new StringBuilder("UserInfoModel(inRoom=");
        sb.append(j);
        sb.append(", isFollow=");
        sb.append(z);
        sb.append(", isFriend=");
        sb.append(z2);
        sb.append(", isBlack=");
        sb.append(z3);
        sb.append(", inHeBlack=");
        sb.append(z4);
        sb.append(", remark='");
        sb.append(str);
        sb.append("', profileLimit=");
        sb.append(list);
        sb.append(", purview=");
        sb.append(purview);
        return o0O00o0.OooO0O0(sb, ")，", string);
    }

    public final void updateInfo(@NotNull UserInfoModel userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        super.updateInfo((UserInfo) userInfo);
        this.isFollow = userInfo.isFollow;
        this.isFriend = userInfo.isFriend;
    }
}
