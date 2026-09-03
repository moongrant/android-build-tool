package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yalla/yalla/model/ArrearsModel;", "", "()V", "debtAmount", "", "getDebtAmount", "()I", "setDebtAmount", "(I)V", "debtDetail", "", "Lcom/yalla/yalla/model/ArrearsDetailModel;", "getDebtDetail", "()Ljava/util/List;", "setDebtDetail", "(Ljava/util/List;)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ArrearsModel {
    public static final int $stable = 8;
    private int debtAmount;

    @Nullable
    private List<ArrearsDetailModel> debtDetail;

    public final int getDebtAmount() {
        return this.debtAmount;
    }

    @Nullable
    public final List<ArrearsDetailModel> getDebtDetail() {
        return this.debtDetail;
    }

    public final void setDebtAmount(int i) {
        this.debtAmount = i;
    }

    public final void setDebtDetail(@Nullable List<ArrearsDetailModel> list) {
        this.debtDetail = list;
    }
}
