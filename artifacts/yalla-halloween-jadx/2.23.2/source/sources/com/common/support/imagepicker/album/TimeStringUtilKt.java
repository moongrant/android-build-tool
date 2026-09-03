package com.common.support.imagepicker.album;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"formatDurationTime", "", "", "album_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TimeStringUtilKt {
    @NotNull
    public static final String formatDurationTime(long j) {
        if (j < 0) {
            return "-";
        }
        long j2 = j / ((long) 1000);
        long j3 = 60;
        long j4 = j2 % j3;
        long j5 = (j2 / j3) % j3;
        long j6 = j2 / ((long) 3600);
        if (j6 > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j6), Long.valueOf(j5), Long.valueOf(j4)}, 3));
            Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
            return str;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5), Long.valueOf(j4)}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(locale, format, *args)");
        return str2;
    }
}
