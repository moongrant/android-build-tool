package com.common.support.imagepicker.preview.component.image.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0002\u001a\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001\u001a\b\u0010\f\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"ARGB_8888_MEMORY_BYTE", "", "MAX_BITMAP_SIZE", "", "UNSET", "computeSize", "srcWidth", "srcHeight", "getMaxImageSize", "", "imageWidth", "imageHeight", "getTotalMemory", "preview_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class BitmapUtilsKt {
    public static final int ARGB_8888_MEMORY_BYTE = 4;
    public static final long MAX_BITMAP_SIZE = 104857600;
    public static final int UNSET = -1;

    private static final int computeSize(int i, int i2) {
        if (i % 2 == 1) {
            i++;
        }
        if (i2 % 2 == 1) {
            i2++;
        }
        int iMax = Math.max(i, i2);
        float fMin = Math.min(i, i2) / iMax;
        if (fMin <= 1.0f && fMin > 0.5625d) {
            if (iMax < 1664) {
                return 1;
            }
            if (iMax < 4990) {
                return 2;
            }
            if (4991 <= iMax && iMax < 10240) {
                return 4;
            }
            return iMax / 1280;
        }
        double d = fMin;
        if (d > 0.5625d || d <= 0.5d) {
            return (int) Math.ceil(((double) iMax) / (1280.0d / d));
        }
        int i3 = iMax / 1280;
        if (i3 == 0) {
            return 1;
        }
        return i3;
    }

    @NotNull
    public static final int[] getMaxImageSize(int i, int i2) {
        int i3 = -1;
        if (i == 0 && i2 == 0) {
            return new int[]{-1, -1};
        }
        int iComputeSize = computeSize(i, i2);
        long totalMemory = getTotalMemory();
        boolean z = false;
        int i4 = iComputeSize;
        int i5 = -1;
        while (!z) {
            i3 = i / i4;
            i5 = i2 / i4;
            if (i3 * i5 * 4 > totalMemory) {
                i4 *= 2;
            } else {
                z = true;
            }
        }
        return new int[]{i3, i5};
    }

    private static final long getTotalMemory() {
        long j = Runtime.getRuntime().totalMemory();
        return j > MAX_BITMAP_SIZE ? MAX_BITMAP_SIZE : j;
    }
}
