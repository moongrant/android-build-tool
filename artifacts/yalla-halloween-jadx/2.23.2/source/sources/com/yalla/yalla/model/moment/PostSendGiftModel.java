package com.yalla.yalla.model.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.gift.GiftPropBlindSendResultModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001a\u0010\"\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\b¨\u0006%"}, d2 = {"Lcom/yalla/yalla/model/moment/PostSendGiftModel;", "Ljava/io/Serializable;", "()V", "coinBalance", "", "getCoinBalance", "()J", "setCoinBalance", "(J)V", "crystalsBalance", "getCrystalsBalance", "setCrystalsBalance", "localGiftId", "getLocalGiftId", "setLocalGiftId", "minExpirationTime", "getMinExpirationTime", "setMinExpirationTime", "propType", "", "getPropType", "()I", "setPropType", "(I)V", "props", "", "Lcom/yalla/yalla/model/gift/GiftPropBlindSendResultModel;", "getProps", "()Ljava/util/List;", "setProps", "(Ljava/util/List;)V", "remainingNum", "getRemainingNum", "setRemainingNum", "totalPropValue", "getTotalPropValue", "setTotalPropValue", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PostSendGiftModel implements Serializable {
    public static final int $stable = 8;
    private long coinBalance;
    private long crystalsBalance;
    private long localGiftId;
    private long minExpirationTime;
    private int propType;

    @NotNull
    private List<GiftPropBlindSendResultModel> props = new ArrayList();
    private int remainingNum;
    private long totalPropValue;

    public final long getCoinBalance() {
        return this.coinBalance;
    }

    public final long getCrystalsBalance() {
        return this.crystalsBalance;
    }

    public final long getLocalGiftId() {
        return this.localGiftId;
    }

    public final long getMinExpirationTime() {
        return this.minExpirationTime;
    }

    public final int getPropType() {
        return this.propType;
    }

    @NotNull
    public final List<GiftPropBlindSendResultModel> getProps() {
        return this.props;
    }

    public final int getRemainingNum() {
        return this.remainingNum;
    }

    public final long getTotalPropValue() {
        return this.totalPropValue;
    }

    public final void setCoinBalance(long j) {
        this.coinBalance = j;
    }

    public final void setCrystalsBalance(long j) {
        this.crystalsBalance = j;
    }

    public final void setLocalGiftId(long j) {
        this.localGiftId = j;
    }

    public final void setMinExpirationTime(long j) {
        this.minExpirationTime = j;
    }

    public final void setPropType(int i) {
        this.propType = i;
    }

    public final void setProps(@NotNull List<GiftPropBlindSendResultModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.props = list;
    }

    public final void setRemainingNum(int i) {
        this.remainingNum = i;
    }

    public final void setTotalPropValue(long j) {
        this.totalPropValue = j;
    }
}
