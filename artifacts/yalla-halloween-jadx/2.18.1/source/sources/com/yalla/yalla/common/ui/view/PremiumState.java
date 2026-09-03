package com.yalla.yalla.common.ui.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/common/ui/view/PremiumState;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "Not", "Opened", "Protection", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public enum PremiumState {
    Not(0),
    Opened(1),
    Protection(2);

    private final int value;

    PremiumState(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
