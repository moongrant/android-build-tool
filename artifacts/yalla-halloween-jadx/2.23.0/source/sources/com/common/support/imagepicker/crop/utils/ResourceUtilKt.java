package com.common.support.imagepicker.crop.utils;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u001a\b\u0010\u0007\u001a\u00020\bH\u0000\"(\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u00018@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous parameter 0>", "", "dp", "getDp", "(I)I", "setDp", "(II)V", "isRtlLayout", "", "crop_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ResourceUtilKt {
    public static final int getDp(int i) {
        return (int) TypedValue.applyDimension(1, i, Resources.getSystem().getDisplayMetrics());
    }

    public static final boolean isRtlLayout() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static final void setDp(int i, int i2) {
    }
}
