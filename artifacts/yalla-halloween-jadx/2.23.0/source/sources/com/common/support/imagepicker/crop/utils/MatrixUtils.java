package com.common.support.imagepicker.crop.utils;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/common/support/imagepicker/crop/utils/MatrixUtils;", "", "()V", "getRotate", "", "matrix", "", "getScale", AppMeasurementSdk.ConditionalUserProperty.VALUE, "crop_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MatrixUtils {

    @NotNull
    public static final MatrixUtils INSTANCE = new MatrixUtils();

    private MatrixUtils() {
    }

    public final float getRotate(@NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        return (float) (((double) (-((float) Math.atan2(matrix[1], matrix[0])))) * 57.29577951308232d);
    }

    public final float getScale(@NotNull float[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (float) Math.hypot(value[0], value[3]);
    }
}
