package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042Ooooo0o.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/yalla/yalla/model/PostSendGiftModel;", "", "coinBalance", "", "crystalsBalance", "propType", "", "totalPropValue", "props", "", "Lcom/yalla/yalla/model/GiftPropBlindSendResultModel;", "(JJIJLjava/util/List;)V", "getCoinBalance", "()J", "getCrystalsBalance", "getPropType", "()I", "getProps", "()Ljava/util/List;", "getTotalPropValue", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class PostSendGiftModel {
    public static final int $stable = 8;
    private final long coinBalance;
    private final long crystalsBalance;
    private final int propType;

    @NotNull
    private final List<GiftPropBlindSendResultModel> props;
    private final long totalPropValue;

    public PostSendGiftModel() {
        this(0L, 0L, 0, 0L, null, 31, null);
    }

    public PostSendGiftModel(long j, long j2, int i, long j3, @NotNull List<GiftPropBlindSendResultModel> props) {
        Intrinsics.checkNotNullParameter(props, "props");
        this.coinBalance = j;
        this.crystalsBalance = j2;
        this.propType = i;
        this.totalPropValue = j3;
        this.props = props;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCoinBalance() {
        return this.coinBalance;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCrystalsBalance() {
        return this.crystalsBalance;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPropType() {
        return this.propType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTotalPropValue() {
        return this.totalPropValue;
    }

    @NotNull
    public final List<GiftPropBlindSendResultModel> component5() {
        return this.props;
    }

    @NotNull
    public final PostSendGiftModel copy(long coinBalance, long crystalsBalance, int propType, long totalPropValue, @NotNull List<GiftPropBlindSendResultModel> props) {
        Intrinsics.checkNotNullParameter(props, "props");
        return new PostSendGiftModel(coinBalance, crystalsBalance, propType, totalPropValue, props);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostSendGiftModel)) {
            return false;
        }
        PostSendGiftModel postSendGiftModel = (PostSendGiftModel) other;
        return this.coinBalance == postSendGiftModel.coinBalance && this.crystalsBalance == postSendGiftModel.crystalsBalance && this.propType == postSendGiftModel.propType && this.totalPropValue == postSendGiftModel.totalPropValue && Intrinsics.areEqual(this.props, postSendGiftModel.props);
    }

    public final long getCoinBalance() {
        return this.coinBalance;
    }

    public final long getCrystalsBalance() {
        return this.crystalsBalance;
    }

    public final int getPropType() {
        return this.propType;
    }

    @NotNull
    public final List<GiftPropBlindSendResultModel> getProps() {
        return this.props;
    }

    public final long getTotalPropValue() {
        return this.totalPropValue;
    }

    public int hashCode() {
        long j = this.coinBalance;
        long j2 = this.crystalsBalance;
        int i = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.propType) * 31;
        long j3 = this.totalPropValue;
        return this.props.hashCode() + ((i + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("PostSendGiftModel(coinBalance=");
        sbOooO0o0.append(this.coinBalance);
        sbOooO0o0.append(", crystalsBalance=");
        sbOooO0o0.append(this.crystalsBalance);
        sbOooO0o0.append(", propType=");
        sbOooO0o0.append(this.propType);
        sbOooO0o0.append(", totalPropValue=");
        sbOooO0o0.append(this.totalPropValue);
        sbOooO0o0.append(", props=");
        return o000O0Oo.OooO00o(sbOooO0o0, this.props, ')');
    }

    public /* synthetic */ PostSendGiftModel(long j, long j2, int i, long j3, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) == 0 ? j3 : 0L, (i2 & 16) != 0 ? new ArrayList() : list);
    }
}
