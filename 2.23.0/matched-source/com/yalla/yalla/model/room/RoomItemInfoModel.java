package com.yalla.yalla.model.room;

import androidx.compose.compiler.plugins.kotlin.OooO0o;
import androidx.compose.material.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.model.ProfileLimitModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010:\u001a\u00020\u0003H\u0016R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u001c\u0010,\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u000b\"\u0004\b3\u0010\rR\u001a\u00104\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u000b\"\u0004\b6\u0010\rR\u001c\u00107\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u000b\"\u0004\b9\u0010\r¨\u0006;"}, d2 = {"Lcom/yalla/yalla/model/room/RoomItemInfoModel;", "", "titleTemp", "", "isBelowTemp", "", "tagTemp", "Lcom/yalla/yalla/model/room/RoomItemInfoModelTag;", "(Ljava/lang/String;ZLcom/yalla/yalla/model/room/RoomItemInfoModelTag;)V", "barIdx", "getBarIdx", "()Ljava/lang/String;", "setBarIdx", "(Ljava/lang/String;)V", "content", "getContent", "setContent", "headUrl", "getHeadUrl", "setHeadUrl", "isBelow", "()Z", "setBelow", "(Z)V", "isTurnOnSwitch", "()Ljava/lang/Boolean;", "setTurnOnSwitch", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "membershipFee", "", "getMembershipFee", "()I", "setMembershipFee", "(I)V", "profileLimitModel", "Lcom/yalla/yalla/model/ProfileLimitModel;", "getProfileLimitModel", "()Lcom/yalla/yalla/model/ProfileLimitModel;", "setProfileLimitModel", "(Lcom/yalla/yalla/model/ProfileLimitModel;)V", "showRedPoint", "getShowRedPoint", "setShowRedPoint", ViewHierarchyConstants.TAG_KEY, "getTag", "()Lcom/yalla/yalla/model/room/RoomItemInfoModelTag;", "setTag", "(Lcom/yalla/yalla/model/room/RoomItemInfoModelTag;)V", ShareConstants.WEB_DIALOG_PARAM_TITLE, "getTitle", "setTitle", "titleBottom", "getTitleBottom", "setTitleBottom", "wageText", "getWageText", "setWageText", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RoomItemInfoModel {
    public static final int $stable = 8;

    @SerializedName("baridx")
    @Nullable
    private String barIdx;

    @Nullable
    private String content;

    @Nullable
    private String headUrl;
    private boolean isBelow;

    @Nullable
    private Boolean isTurnOnSwitch;
    private int membershipFee;

    @Nullable
    private ProfileLimitModel profileLimitModel;
    private boolean showRedPoint;

    @Nullable
    private RoomItemInfoModelTag tag;

    @Nullable
    private String title;

    @NotNull
    private String titleBottom;

    @Nullable
    private String wageText;

    public RoomItemInfoModel(@NotNull String titleTemp, boolean z, @NotNull RoomItemInfoModelTag tagTemp) {
        Intrinsics.checkNotNullParameter(titleTemp, "titleTemp");
        Intrinsics.checkNotNullParameter(tagTemp, "tagTemp");
        this.titleBottom = "";
        this.title = titleTemp;
        this.isBelow = z;
        this.tag = tagTemp;
    }

    @Nullable
    public final String getBarIdx() {
        return this.barIdx;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getHeadUrl() {
        return this.headUrl;
    }

    public final int getMembershipFee() {
        return this.membershipFee;
    }

    @Nullable
    public final ProfileLimitModel getProfileLimitModel() {
        return this.profileLimitModel;
    }

    public final boolean getShowRedPoint() {
        return this.showRedPoint;
    }

    @Nullable
    public final RoomItemInfoModelTag getTag() {
        return this.tag;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getTitleBottom() {
        return this.titleBottom;
    }

    @Nullable
    public final String getWageText() {
        return this.wageText;
    }

    /* JADX INFO: renamed from: isBelow, reason: from getter */
    public final boolean getIsBelow() {
        return this.isBelow;
    }

    @Nullable
    /* JADX INFO: renamed from: isTurnOnSwitch, reason: from getter */
    public final Boolean getIsTurnOnSwitch() {
        return this.isTurnOnSwitch;
    }

    public final void setBarIdx(@Nullable String str) {
        this.barIdx = str;
    }

    public final void setBelow(boolean z) {
        this.isBelow = z;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setHeadUrl(@Nullable String str) {
        this.headUrl = str;
    }

    public final void setMembershipFee(int i) {
        this.membershipFee = i;
    }

    public final void setProfileLimitModel(@Nullable ProfileLimitModel profileLimitModel) {
        this.profileLimitModel = profileLimitModel;
    }

    public final void setShowRedPoint(boolean z) {
        this.showRedPoint = z;
    }

    public final void setTag(@Nullable RoomItemInfoModelTag roomItemInfoModelTag) {
        this.tag = roomItemInfoModelTag;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTitleBottom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.titleBottom = str;
    }

    public final void setTurnOnSwitch(@Nullable Boolean bool) {
        this.isTurnOnSwitch = bool;
    }

    public final void setWageText(@Nullable String str) {
        this.wageText = str;
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.headUrl;
        String str3 = this.content;
        int i = this.membershipFee;
        String str4 = this.wageText;
        boolean z = this.isBelow;
        RoomItemInfoModelTag roomItemInfoModelTag = this.tag;
        boolean z2 = this.showRedPoint;
        Boolean bool = this.isTurnOnSwitch;
        ProfileLimitModel profileLimitModel = this.profileLimitModel;
        String str5 = this.barIdx;
        String str6 = this.titleBottom;
        StringBuilder sbOooO0OO = OooO0o.OooO0OO("RoomItemInfoModel(title=", str, ", headUrl=", str2, ", content=");
        sbOooO0OO.append(str3);
        sbOooO0OO.append(", membershipFee=");
        sbOooO0OO.append(i);
        sbOooO0OO.append(", wageText=");
        sbOooO0OO.append(str4);
        sbOooO0OO.append(", isBelow=");
        sbOooO0OO.append(z);
        sbOooO0OO.append(", tag=");
        sbOooO0OO.append(roomItemInfoModelTag);
        sbOooO0OO.append(", showRedPoint=");
        sbOooO0OO.append(z2);
        sbOooO0OO.append(", isTurnOnSwitch=");
        sbOooO0OO.append(bool);
        sbOooO0OO.append(", profileLimitModel=");
        sbOooO0OO.append(profileLimitModel);
        sbOooO0OO.append(", barIdx=");
        return OooO00o.OooO0O0(sbOooO0OO, str5, ", titleBottom='", str6, "')");
    }

    public /* synthetic */ RoomItemInfoModel(String str, boolean z, RoomItemInfoModelTag roomItemInfoModelTag, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, roomItemInfoModelTag);
    }
}
