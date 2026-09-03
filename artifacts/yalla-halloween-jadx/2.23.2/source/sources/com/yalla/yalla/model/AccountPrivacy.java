package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import o000O0Oo.OooOOO0;
import org.jetbrains.annotations.NotNull;
import p041Ooooo0o.o00000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0014\u0010\n\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0016\u0010\r\u001a\u00020\b8\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u0016\u0010\u000f\u001a\u00020\b8\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/model/AccountPrivacy;", "", "()V", "isOpenProtection", "", "()Z", "isShowProtection", "isVerify", "", "()I", "isWaterMark", "seeInRoom", "getSeeInRoom", "seePost", "getSeePost", "seeRoom", "getSeeRoom", "toString", "", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AccountPrivacy {
    public static final int $stable = 0;
    private final boolean isOpenProtection;
    private final boolean isShowProtection = true;

    @SerializedName("isverify")
    private final int isVerify;
    private final int isWaterMark;

    @SerializedName("seeinroom")
    private final int seeInRoom;

    @SerializedName("seepost")
    private final int seePost;

    @SerializedName("seeroom")
    private final int seeRoom;

    public final int getSeeInRoom() {
        return this.seeInRoom;
    }

    public final int getSeePost() {
        return this.seePost;
    }

    public final int getSeeRoom() {
        return this.seeRoom;
    }

    /* JADX INFO: renamed from: isOpenProtection, reason: from getter */
    public final boolean getIsOpenProtection() {
        return this.isOpenProtection;
    }

    /* JADX INFO: renamed from: isShowProtection, reason: from getter */
    public final boolean getIsShowProtection() {
        return this.isShowProtection;
    }

    /* JADX INFO: renamed from: isVerify, reason: from getter */
    public final int getIsVerify() {
        return this.isVerify;
    }

    /* JADX INFO: renamed from: isWaterMark, reason: from getter */
    public final int getIsWaterMark() {
        return this.isWaterMark;
    }

    @NotNull
    public String toString() {
        int i = this.isVerify;
        int i2 = this.seePost;
        int i3 = this.seeInRoom;
        int i4 = this.isWaterMark;
        int i5 = this.seeRoom;
        boolean z = this.isOpenProtection;
        boolean z2 = this.isShowProtection;
        StringBuilder sbOooO00o = o00000.OooO00o("isverify：", i, ",seepost：", i2, ",seeInRoom：");
        OooOOO0.OooO00o(sbOooO00o, i3, "isWaterMark：", i4, ",seeRoom：");
        sbOooO00o.append(i5);
        sbOooO00o.append(",isOpenProtection:");
        sbOooO00o.append(z);
        sbOooO00o.append(",isShowProtection:");
        sbOooO00o.append(z2);
        return sbOooO00o.toString();
    }
}
