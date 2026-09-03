package com.squareup.wire.internal;

import androidx.compose.animation.core.AnimationKt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.wire.OooOOO;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.time.DurationKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0014\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\t"}, d2 = {"Lcom/squareup/wire/internal/DurationJsonFormatter;", "Lcom/squareup/wire/internal/JsonFormatter;", "Ljava/time/Duration;", "Lcom/squareup/wire/Duration;", "()V", "fromString", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toStringOrNumber", "wire-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DurationJsonFormatter implements JsonFormatter<Duration> {

    @NotNull
    public static final DurationJsonFormatter INSTANCE = new DurationJsonFormatter();

    private DurationJsonFormatter() {
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    public /* bridge */ /* synthetic */ Object toStringOrNumber(Duration duration) {
        return toStringOrNumber2(OooOOO.OooO0O0(duration));
    }

    @Override // com.squareup.wire.internal.JsonFormatter
    @NotNull
    public Duration fromString(@NotNull String value) {
        int i;
        Intrinsics.checkNotNullParameter(value, "value");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) value, 's', 0, false, 6, (Object) null);
        if (iIndexOf$default != value.length() - 1) {
            throw new NumberFormatException();
        }
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) value, '.', 0, false, 6, (Object) null);
        if (iIndexOf$default2 == -1) {
            String strSubstring = value.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Duration durationOfSeconds = Duration.ofSeconds(Long.parseLong(strSubstring));
            Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(seconds)");
            return durationOfSeconds;
        }
        String strSubstring2 = value.substring(0, iIndexOf$default2);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        long j = Long.parseLong(strSubstring2);
        int i2 = iIndexOf$default2 + 1;
        String strSubstring3 = value.substring(i2, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
        long j2 = Long.parseLong(strSubstring3);
        if (StringsKt__StringsJVMKt.startsWith$default(value, "-", false, 2, null)) {
            j2 = -j2;
        }
        int i3 = iIndexOf$default - i2;
        int i4 = i3;
        while (true) {
            i = 9;
            if (i4 >= 9) {
                break;
            }
            i4++;
            j2 *= (long) 10;
        }
        while (i < i3) {
            i++;
            j2 /= (long) 10;
        }
        Duration durationOfSeconds2 = Duration.ofSeconds(j, j2);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds2, "ofSeconds(seconds, nanos)");
        return durationOfSeconds2;
    }

    @NotNull
    /* JADX INFO: renamed from: toStringOrNumber, reason: avoid collision after fix types in other method */
    public String toStringOrNumber2(@NotNull Duration value) {
        String str;
        Intrinsics.checkNotNullParameter(value, "value");
        long seconds = value.getSeconds();
        int nano = value.getNano();
        if (seconds < 0) {
            if (seconds == Long.MIN_VALUE) {
                str = "-922337203685477580";
                seconds = 8;
            } else {
                seconds = -seconds;
                str = "-";
            }
            if (nano != 0) {
                seconds--;
                nano = 1000000000 - nano;
            }
        } else {
            str = "";
        }
        if (nano == 0) {
            return OooO0O0.OooO0O0.OooO00o(new Object[]{str, Long.valueOf(seconds)}, 2, "%s%ds", "format(this, *args)");
        }
        if (nano % DurationKt.NANOS_IN_MILLIS == 0) {
            return OooO0O0.OooO0O0.OooO00o(new Object[]{str, Long.valueOf(seconds), Long.valueOf(((long) nano) / AnimationKt.MillisToNanos)}, 3, "%s%d.%03ds", "format(this, *args)");
        }
        return nano % 1000 == 0 ? OooO0O0.OooO0O0.OooO00o(new Object[]{str, Long.valueOf(seconds), Long.valueOf(((long) nano) / 1000)}, 3, "%s%d.%06ds", "format(this, *args)") : OooO0O0.OooO0O0.OooO00o(new Object[]{str, Long.valueOf(seconds), Long.valueOf(((long) nano) / 1)}, 3, "%s%d.%09ds", "format(this, *args)");
    }
}
