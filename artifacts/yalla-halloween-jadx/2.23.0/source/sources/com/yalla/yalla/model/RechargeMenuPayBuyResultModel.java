package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/model/RechargeMenuPayBuyResultModel;", "", "()V", "isAcknowledged", "", "()Z", "setAcknowledged", "(Z)V", "purchaseState", "", "getPurchaseState", "()I", "setPurchaseState", "(I)V", "purchaseToken", "", "getPurchaseToken", "()Ljava/lang/String;", "setPurchaseToken", "(Ljava/lang/String;)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RechargeMenuPayBuyResultModel {
    public static final int $stable = 8;
    private boolean isAcknowledged;
    private int purchaseState;

    @NotNull
    private String purchaseToken = "";

    public final int getPurchaseState() {
        return this.purchaseState;
    }

    @NotNull
    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    /* JADX INFO: renamed from: isAcknowledged, reason: from getter */
    public final boolean getIsAcknowledged() {
        return this.isAcknowledged;
    }

    public final void setAcknowledged(boolean z) {
        this.isAcknowledged = z;
    }

    public final void setPurchaseState(int i) {
        this.purchaseState = i;
    }

    public final void setPurchaseToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.purchaseToken = str;
    }
}
