package com.common.support.utils;

import android.util.TypedValue;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\u001a\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007\u001a\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007\"(\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u00018F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006\"(\u0010\u0002\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0000\u001a\u00020\u00078F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\b\"\u0004\b\u0005\u0010\t\"(\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u00018F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0004\"\u0004\b\f\u0010\u0006\"(\u0010\n\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0000\u001a\u00020\u00078F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\t¨\u0006\u0011"}, d2 = {"<anonymous parameter 0>", "", "DP", "getDP", "(F)F", "setDP", "(FF)V", "", "(I)I", "(II)V", "SP", "getSP", "setSP", "dp2px", "dpValue", "sp2px", "spValue", "utils_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class SizeUtilsKt {
    public static final int dp2px(int i) {
        return (int) ((i * Utils.INSTANCE.getApp().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final int getDP(int i) {
        return (int) TypedValue.applyDimension(1, i, Utils.INSTANCE.getApp().getResources().getDisplayMetrics());
    }

    public static final int getSP(int i) {
        return (int) TypedValue.applyDimension(2, i, Utils.INSTANCE.getApp().getResources().getDisplayMetrics());
    }

    private static final void setDP(float f, float f2) {
    }

    private static final void setSP(float f, float f2) {
    }

    public static final int sp2px(int i) {
        return (int) ((i * Utils.INSTANCE.getApp().getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    private static final void setDP(int i, int i2) {
    }

    private static final void setSP(int i, int i2) {
    }

    public static final float getDP(float f) {
        return TypedValue.applyDimension(1, f, Utils.INSTANCE.getApp().getResources().getDisplayMetrics());
    }

    public static final float getSP(float f) {
        return TypedValue.applyDimension(2, f, Utils.INSTANCE.getApp().getResources().getDisplayMetrics());
    }
}
