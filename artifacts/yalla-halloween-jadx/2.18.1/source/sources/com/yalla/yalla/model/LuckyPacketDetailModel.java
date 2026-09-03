package com.yalla.yalla.model;

import Oooo000.o00oO0o;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\rJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003Ja\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u00020\bHÖ\u0001J\u0019\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017¨\u00069"}, d2 = {"Lcom/yalla/yalla/model/LuckyPacketDetailModel;", "Landroid/os/Parcelable;", "bonusid", "", "userid", "", "bonustype", "giftimg", "", "bonusinfo", "bonuscount", "username", "userheadphoto", "(IJILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getBonuscount", "()I", "setBonuscount", "(I)V", "getBonusid", "setBonusid", "getBonusinfo", "()Ljava/lang/String;", "setBonusinfo", "(Ljava/lang/String;)V", "getBonustype", "setBonustype", "getGiftimg", "setGiftimg", "getUserheadphoto", "setUserheadphoto", "getUserid", "()J", "setUserid", "(J)V", "getUsername", "setUsername", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class LuckyPacketDetailModel implements Parcelable {
    private int bonuscount;
    private int bonusid;

    @Nullable
    private String bonusinfo;
    private int bonustype;

    @Nullable
    private String giftimg;

    @Nullable
    private String userheadphoto;
    private long userid;

    @Nullable
    private String username;

    @NotNull
    public static final Parcelable.Creator<LuckyPacketDetailModel> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LuckyPacketDetailModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LuckyPacketDetailModel createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LuckyPacketDetailModel(parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final LuckyPacketDetailModel[] newArray(int i) {
            return new LuckyPacketDetailModel[i];
        }
    }

    public LuckyPacketDetailModel(int i, long j, int i2, @Nullable String str, @Nullable String str2, int i3, @Nullable String str3, @Nullable String str4) {
        this.bonusid = i;
        this.userid = j;
        this.bonustype = i2;
        this.giftimg = str;
        this.bonusinfo = str2;
        this.bonuscount = i3;
        this.username = str3;
        this.userheadphoto = str4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBonusid() {
        return this.bonusid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getUserid() {
        return this.userid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getBonustype() {
        return this.bonustype;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGiftimg() {
        return this.giftimg;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBonusinfo() {
        return this.bonusinfo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getBonuscount() {
        return this.bonuscount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUserheadphoto() {
        return this.userheadphoto;
    }

    @NotNull
    public final LuckyPacketDetailModel copy(int bonusid, long userid, int bonustype, @Nullable String giftimg, @Nullable String bonusinfo, int bonuscount, @Nullable String username, @Nullable String userheadphoto) {
        return new LuckyPacketDetailModel(bonusid, userid, bonustype, giftimg, bonusinfo, bonuscount, username, userheadphoto);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LuckyPacketDetailModel)) {
            return false;
        }
        LuckyPacketDetailModel luckyPacketDetailModel = (LuckyPacketDetailModel) other;
        return this.bonusid == luckyPacketDetailModel.bonusid && this.userid == luckyPacketDetailModel.userid && this.bonustype == luckyPacketDetailModel.bonustype && Intrinsics.areEqual(this.giftimg, luckyPacketDetailModel.giftimg) && Intrinsics.areEqual(this.bonusinfo, luckyPacketDetailModel.bonusinfo) && this.bonuscount == luckyPacketDetailModel.bonuscount && Intrinsics.areEqual(this.username, luckyPacketDetailModel.username) && Intrinsics.areEqual(this.userheadphoto, luckyPacketDetailModel.userheadphoto);
    }

    public final int getBonuscount() {
        return this.bonuscount;
    }

    public final int getBonusid() {
        return this.bonusid;
    }

    @Nullable
    public final String getBonusinfo() {
        return this.bonusinfo;
    }

    public final int getBonustype() {
        return this.bonustype;
    }

    @Nullable
    public final String getGiftimg() {
        return this.giftimg;
    }

    @Nullable
    public final String getUserheadphoto() {
        return this.userheadphoto;
    }

    public final long getUserid() {
        return this.userid;
    }

    @Nullable
    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int i = this.bonusid * 31;
        long j = this.userid;
        int i2 = (((i + ((int) (j ^ (j >>> 32)))) * 31) + this.bonustype) * 31;
        String str = this.giftimg;
        int iHashCode = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bonusinfo;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.bonuscount) * 31;
        String str3 = this.username;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.userheadphoto;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setBonuscount(int i) {
        this.bonuscount = i;
    }

    public final void setBonusid(int i) {
        this.bonusid = i;
    }

    public final void setBonusinfo(@Nullable String str) {
        this.bonusinfo = str;
    }

    public final void setBonustype(int i) {
        this.bonustype = i;
    }

    public final void setGiftimg(@Nullable String str) {
        this.giftimg = str;
    }

    public final void setUserheadphoto(@Nullable String str) {
        this.userheadphoto = str;
    }

    public final void setUserid(long j) {
        this.userid = j;
    }

    public final void setUsername(@Nullable String str) {
        this.username = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("LuckyPacketDetailModel(bonusid=");
        sbOooO0o0.append(this.bonusid);
        sbOooO0o0.append(", userid=");
        sbOooO0o0.append(this.userid);
        sbOooO0o0.append(", bonustype=");
        sbOooO0o0.append(this.bonustype);
        sbOooO0o0.append(", giftimg=");
        sbOooO0o0.append(this.giftimg);
        sbOooO0o0.append(", bonusinfo=");
        sbOooO0o0.append(this.bonusinfo);
        sbOooO0o0.append(", bonuscount=");
        sbOooO0o0.append(this.bonuscount);
        sbOooO0o0.append(", username=");
        sbOooO0o0.append(this.username);
        sbOooO0o0.append(", userheadphoto=");
        return o00oO0o.OooO0O0(sbOooO0o0, this.userheadphoto, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.bonusid);
        parcel.writeLong(this.userid);
        parcel.writeInt(this.bonustype);
        parcel.writeString(this.giftimg);
        parcel.writeString(this.bonusinfo);
        parcel.writeInt(this.bonuscount);
        parcel.writeString(this.username);
        parcel.writeString(this.userheadphoto);
    }
}
