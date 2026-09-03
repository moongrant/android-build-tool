package com.yalla.yalla.model;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Ignore;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R&\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\n\"\u0004\b'\u0010\fR\u001a\u0010(\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\n\"\u0004\b*\u0010\fR\u001a\u0010+\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\n\"\u0004\b-\u0010\fR\u001e\u0010.\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\n\"\u0004\b0\u0010\fR\u001a\u00101\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0010\"\u0004\b3\u0010\u0012R&\u00104\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0015\"\u0004\b6\u0010\u0017R\u001a\u00107\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0010\"\u0004\b9\u0010\u0012R\u001a\u0010:\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0010\"\u0004\b<\u0010\u0012R\u001a\u0010=\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0010\"\u0004\b?\u0010\u0012R\u001a\u0010@\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0010\"\u0004\bB\u0010\u0012¨\u0006C"}, d2 = {"Lcom/yalla/yalla/model/PersonalVipModel;", "", "()V", "_expiringPoint", "Landroidx/compose/runtime/MutableState;", "", "_pointBalance", "currentExperience", "", "getCurrentExperience", "()I", "setCurrentExperience", "(I)V", "doPopUp", "", "getDoPopUp", "()Z", "setDoPopUp", "(Z)V", "expireTimeStamp", "getExpireTimeStamp", "()J", "setExpireTimeStamp", "(J)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "expiringPoint", "getExpiringPoint", "setExpiringPoint", "frozenTimeStamp", "getFrozenTimeStamp", "setFrozenTimeStamp", "kaServeAddr", "", "getKaServeAddr", "()Ljava/lang/String;", "setKaServeAddr", "(Ljava/lang/String;)V", "kaVIPLv", "getKaVIPLv", "setKaVIPLv", "kaVIPState", "getKaVIPState", "setKaVIPState", "leftDayNum", "getLeftDayNum", "setLeftDayNum", "leftExperience", "getLeftExperience", "setLeftExperience", "onceBeenVIP", "getOnceBeenVIP", "setOnceBeenVIP", "pointBalance", "getPointBalance", "setPointBalance", "pointFrozen", "getPointFrozen", "setPointFrozen", "showKAVIP", "getShowKAVIP", "setShowKAVIP", "showPremiumFirst", "getShowPremiumFirst", "setShowPremiumFirst", "stealthVisit", "getStealthVisit", "setStealthVisit", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PersonalVipModel {
    public static final int $stable = 8;

    @SerializedName("currExpe")
    private int currentExperience;
    private boolean doPopUp;
    private long expireTimeStamp;
    private long expiringPoint;
    private long frozenTimeStamp;
    private int kaVIPLv;
    private int kaVIPState;
    private int leftDayNum;

    @SerializedName("leftExpe")
    private int leftExperience;
    private long pointBalance;
    private boolean pointFrozen;
    private boolean showKAVIP;
    private boolean showPremiumFirst;
    private boolean stealthVisit;

    @NotNull
    private String kaServeAddr = "";

    @Ignore
    @Nullable
    private transient MutableState<Long> _pointBalance = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);

    @Ignore
    @Nullable
    private transient MutableState<Long> _expiringPoint = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
    private boolean onceBeenVIP = true;

    public final int getCurrentExperience() {
        return this.currentExperience;
    }

    public final boolean getDoPopUp() {
        return this.doPopUp;
    }

    public final long getExpireTimeStamp() {
        return this.expireTimeStamp;
    }

    public final long getExpiringPoint() {
        if (this._expiringPoint == null) {
            this._expiringPoint = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(this.expiringPoint), null, 2, null);
        }
        long j = this.expiringPoint;
        MutableState<Long> mutableState = this._expiringPoint;
        Intrinsics.checkNotNull(mutableState);
        if (j != mutableState.getValue().longValue()) {
            MutableState<Long> mutableState2 = this._expiringPoint;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Long.valueOf(this.expiringPoint));
        }
        MutableState<Long> mutableState3 = this._expiringPoint;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().longValue();
    }

    public final long getFrozenTimeStamp() {
        return this.frozenTimeStamp;
    }

    @NotNull
    public final String getKaServeAddr() {
        return this.kaServeAddr;
    }

    public final int getKaVIPLv() {
        return this.kaVIPLv;
    }

    public final int getKaVIPState() {
        return this.kaVIPState;
    }

    public final int getLeftDayNum() {
        return this.leftDayNum;
    }

    public final int getLeftExperience() {
        return this.leftExperience;
    }

    public final boolean getOnceBeenVIP() {
        return this.onceBeenVIP;
    }

    public final long getPointBalance() {
        if (this._pointBalance == null) {
            this._pointBalance = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(this.pointBalance), null, 2, null);
        }
        long j = this.pointBalance;
        MutableState<Long> mutableState = this._pointBalance;
        Intrinsics.checkNotNull(mutableState);
        if (j != mutableState.getValue().longValue()) {
            MutableState<Long> mutableState2 = this._pointBalance;
            Intrinsics.checkNotNull(mutableState2);
            mutableState2.setValue(Long.valueOf(this.pointBalance));
        }
        MutableState<Long> mutableState3 = this._pointBalance;
        Intrinsics.checkNotNull(mutableState3);
        return mutableState3.getValue().longValue();
    }

    public final boolean getPointFrozen() {
        return this.pointFrozen;
    }

    public final boolean getShowKAVIP() {
        return this.showKAVIP;
    }

    public final boolean getShowPremiumFirst() {
        return this.showPremiumFirst;
    }

    public final boolean getStealthVisit() {
        return this.stealthVisit;
    }

    public final void setCurrentExperience(int i) {
        this.currentExperience = i;
    }

    public final void setDoPopUp(boolean z) {
        this.doPopUp = z;
    }

    public final void setExpireTimeStamp(long j) {
        this.expireTimeStamp = j;
    }

    public final void setExpiringPoint(long j) {
        this.expiringPoint = j;
        if (this._expiringPoint == null) {
            this._expiringPoint = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j), null, 2, null);
        }
        MutableState<Long> mutableState = this._expiringPoint;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Long.valueOf(j));
    }

    public final void setFrozenTimeStamp(long j) {
        this.frozenTimeStamp = j;
    }

    public final void setKaServeAddr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.kaServeAddr = str;
    }

    public final void setKaVIPLv(int i) {
        this.kaVIPLv = i;
    }

    public final void setKaVIPState(int i) {
        this.kaVIPState = i;
    }

    public final void setLeftDayNum(int i) {
        this.leftDayNum = i;
    }

    public final void setLeftExperience(int i) {
        this.leftExperience = i;
    }

    public final void setOnceBeenVIP(boolean z) {
        this.onceBeenVIP = z;
    }

    public final void setPointBalance(long j) {
        this.pointBalance = j;
        if (this._pointBalance == null) {
            this._pointBalance = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.valueOf(j), null, 2, null);
        }
        MutableState<Long> mutableState = this._pointBalance;
        Intrinsics.checkNotNull(mutableState);
        mutableState.setValue(Long.valueOf(j));
    }

    public final void setPointFrozen(boolean z) {
        this.pointFrozen = z;
    }

    public final void setShowKAVIP(boolean z) {
        this.showKAVIP = z;
    }

    public final void setShowPremiumFirst(boolean z) {
        this.showPremiumFirst = z;
    }

    public final void setStealthVisit(boolean z) {
        this.stealthVisit = z;
    }
}
