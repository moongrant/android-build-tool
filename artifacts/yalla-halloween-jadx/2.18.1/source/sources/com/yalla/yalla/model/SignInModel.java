package com.yalla.yalla.model;

import Oooo000.o00oO0o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.AppEventsConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/yalla/yalla/model/SignInModel;", "", "changeCoin", "", "balance", "changeCrystal", "crystalBalance", "isPopup", "", "(JJJJLjava/lang/String;)V", "getBalance", "()J", "setBalance", "(J)V", "getChangeCoin", "setChangeCoin", "getChangeCrystal", "setChangeCrystal", "getCrystalBalance", "setCrystalBalance", "()Ljava/lang/String;", "setPopup", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class SignInModel {
    public static final int $stable = 8;
    private long balance;

    @SerializedName("changecoin")
    private long changeCoin;
    private long changeCrystal;
    private long crystalBalance;

    @SerializedName("ispopup")
    @NotNull
    private String isPopup;

    public SignInModel() {
        this(0L, 0L, 0L, 0L, null, 31, null);
    }

    public SignInModel(long j, long j2, long j3, long j4, @NotNull String isPopup) {
        Intrinsics.checkNotNullParameter(isPopup, "isPopup");
        this.changeCoin = j;
        this.balance = j2;
        this.changeCrystal = j3;
        this.crystalBalance = j4;
        this.isPopup = isPopup;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getChangeCoin() {
        return this.changeCoin;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getBalance() {
        return this.balance;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getChangeCrystal() {
        return this.changeCrystal;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCrystalBalance() {
        return this.crystalBalance;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIsPopup() {
        return this.isPopup;
    }

    @NotNull
    public final SignInModel copy(long changeCoin, long balance, long changeCrystal, long crystalBalance, @NotNull String isPopup) {
        Intrinsics.checkNotNullParameter(isPopup, "isPopup");
        return new SignInModel(changeCoin, balance, changeCrystal, crystalBalance, isPopup);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignInModel)) {
            return false;
        }
        SignInModel signInModel = (SignInModel) other;
        return this.changeCoin == signInModel.changeCoin && this.balance == signInModel.balance && this.changeCrystal == signInModel.changeCrystal && this.crystalBalance == signInModel.crystalBalance && Intrinsics.areEqual(this.isPopup, signInModel.isPopup);
    }

    public final long getBalance() {
        return this.balance;
    }

    public final long getChangeCoin() {
        return this.changeCoin;
    }

    public final long getChangeCrystal() {
        return this.changeCrystal;
    }

    public final long getCrystalBalance() {
        return this.crystalBalance;
    }

    public int hashCode() {
        long j = this.changeCoin;
        long j2 = this.balance;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.changeCrystal;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.crystalBalance;
        return this.isPopup.hashCode() + ((i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31);
    }

    @NotNull
    public final String isPopup() {
        return this.isPopup;
    }

    public final void setBalance(long j) {
        this.balance = j;
    }

    public final void setChangeCoin(long j) {
        this.changeCoin = j;
    }

    public final void setChangeCrystal(long j) {
        this.changeCrystal = j;
    }

    public final void setCrystalBalance(long j) {
        this.crystalBalance = j;
    }

    public final void setPopup(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isPopup = str;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("SignInModel(changeCoin=");
        sbOooO0o0.append(this.changeCoin);
        sbOooO0o0.append(", balance=");
        sbOooO0o0.append(this.balance);
        sbOooO0o0.append(", changeCrystal=");
        sbOooO0o0.append(this.changeCrystal);
        sbOooO0o0.append(", crystalBalance=");
        sbOooO0o0.append(this.crystalBalance);
        sbOooO0o0.append(", isPopup=");
        return o00oO0o.OooO0O0(sbOooO0o0, this.isPopup, ')');
    }

    public /* synthetic */ SignInModel(long j, long j2, long j3, long j4, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, (i & 8) == 0 ? j4 : 0L, (i & 16) != 0 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : str);
    }
}
