package com.yalla.yalla.model.user;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.data.db.converter.BooleanTypeAdapter;
import com.yalla.yalla.data.db.table.UserInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000fR\u001e\u0010\u001b\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR\u001a\u0010\u001d\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001c\u0010\u001f\u001a\u00020\u000b8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\u001e\u0010\"\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001c\u0010%\u001a\u00020&8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010+\u001a\u00020&8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*¨\u0006."}, d2 = {"Lcom/yalla/yalla/model/user/MyUserInfoModel;", "Lcom/yalla/yalla/data/db/table/UserInfo;", "Ljava/io/Serializable;", "()V", "coin", "", "getCoin", "()J", "setCoin", "(J)V", "coinFrozen", "", "getCoinFrozen", "()Z", "setCoinFrozen", "(Z)V", "crystal", "getCrystal", "setCrystal", "debtAmount", "", "getDebtAmount", "()I", "setDebtAmount", "(I)V", "isBindPhone", "setBindPhone", "isNewUser", "setNewUser", "isWhiteCountry", "setWhiteCountry", "showWealthLevel", "getShowWealthLevel", "setShowWealthLevel", "timesTamp", "getTimesTamp", "setTimesTamp", "wealthMyInfoCardImg", "", "getWealthMyInfoCardImg", "()Ljava/lang/String;", "setWealthMyInfoCardImg", "(Ljava/lang/String;)V", "wealthMyInfoTextColour", "getWealthMyInfoTextColour", "setWealthMyInfoTextColour", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMyUserInfoModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyUserInfoModel.kt\ncom/yalla/yalla/model/user/MyUserInfoModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"})
public final class MyUserInfoModel extends UserInfo {
    public static final int $stable = 8;

    @SerializedName("coin")
    private long coin;
    private boolean coinFrozen;

    @SerializedName("crystal")
    private long crystal;
    private int debtAmount;
    private boolean isWhiteCountry;
    private boolean showWealthLevel;

    @SerializedName(alternate = {"timestamp"}, value = "timesTamp")
    private long timesTamp;
    private boolean isBindPhone = true;

    @SerializedName(alternate = {"isnewuser"}, value = "isNewUser")
    @JsonAdapter(BooleanTypeAdapter.class)
    private boolean isNewUser = true;

    @NotNull
    private String wealthMyInfoCardImg = "";

    @NotNull
    private String wealthMyInfoTextColour = "";

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

    public final boolean getShowWealthLevel() {
        boolean z = this.showWealthLevel;
        if (z) {
            return z;
        }
        UserInfo.WealthLevelModel wealthLv = getWealthLv();
        return wealthLv != null && wealthLv.getShowWealthLevel();
    }

    public final long getTimesTamp() {
        return this.timesTamp;
    }

    @NotNull
    public final String getWealthMyInfoCardImg() {
        String mainCardImg;
        String str = this.wealthMyInfoCardImg;
        if (!StringsKt.isBlank(str)) {
            return str;
        }
        UserInfo.WealthLevelModel wealthLv = getWealthLv();
        return (wealthLv == null || (mainCardImg = wealthLv.getMainCardImg()) == null) ? this.wealthMyInfoCardImg : mainCardImg;
    }

    @NotNull
    public final String getWealthMyInfoTextColour() {
        String mainTextColour;
        String str = this.wealthMyInfoTextColour;
        if (!StringsKt.isBlank(str)) {
            return str;
        }
        UserInfo.WealthLevelModel wealthLv = getWealthLv();
        return (wealthLv == null || (mainTextColour = wealthLv.getMainTextColour()) == null) ? this.wealthMyInfoTextColour : mainTextColour;
    }

    /* JADX INFO: renamed from: isBindPhone, reason: from getter */
    public final boolean getIsBindPhone() {
        return this.isBindPhone;
    }

    /* JADX INFO: renamed from: isNewUser, reason: from getter */
    public final boolean getIsNewUser() {
        return this.isNewUser;
    }

    /* JADX INFO: renamed from: isWhiteCountry, reason: from getter */
    public final boolean getIsWhiteCountry() {
        return this.isWhiteCountry;
    }

    public final void setBindPhone(boolean z) {
        this.isBindPhone = z;
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

    public final void setNewUser(boolean z) {
        this.isNewUser = z;
    }

    public final void setShowWealthLevel(boolean z) {
        this.showWealthLevel = z;
    }

    public final void setTimesTamp(long j) {
        this.timesTamp = j;
    }

    public final void setWealthMyInfoCardImg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wealthMyInfoCardImg = str;
    }

    public final void setWealthMyInfoTextColour(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wealthMyInfoTextColour = str;
    }

    public final void setWhiteCountry(boolean z) {
        this.isWhiteCountry = z;
    }
}
