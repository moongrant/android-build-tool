package com.google.protobuf.util;

import androidx.compose.animation.core.AnimationKt;
import com.google.common.base.o000oOoO;
import com.google.common.math.OooO0O0;
import com.google.common.math.OooO0OO;
import com.google.common.math.OooO0o;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompileTimeConstant;
import com.google.protobuf.Duration;
import com.squareup.wire.internal.MathMethodsKt;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class Durations {
    private static final long SECONDS_PER_DAY = 86400;
    private static final long SECONDS_PER_HOUR = 3600;
    private static final long SECONDS_PER_MINUTE = 60;
    static final long DURATION_SECONDS_MIN = -315576000000L;
    public static final Duration MIN_VALUE = Duration.newBuilder().setSeconds(DURATION_SECONDS_MIN).setNanos(-999999999).build();
    static final long DURATION_SECONDS_MAX = 315576000000L;
    public static final Duration MAX_VALUE = Duration.newBuilder().setSeconds(DURATION_SECONDS_MAX).setNanos(999999999).build();
    public static final Duration ZERO = Duration.newBuilder().setSeconds(0).setNanos(0).build();

    public enum DurationComparator implements Comparator<Duration>, Serializable {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(Duration duration, Duration duration2) {
            Durations.checkValid(duration);
            Durations.checkValid(duration2);
            int iCompare = Long.compare(duration.getSeconds(), duration2.getSeconds());
            return iCompare != 0 ? iCompare : Integer.compare(duration.getNanos(), duration2.getNanos());
        }
    }

    private Durations() {
    }

    public static Duration add(Duration duration, Duration duration2) {
        checkValid(duration);
        checkValid(duration2);
        long jOooO00o = OooO0OO.OooO00o(duration.getSeconds(), duration2.getSeconds());
        int nanos = duration.getNanos();
        int nanos2 = duration2.getNanos();
        long j = ((long) nanos) + ((long) nanos2);
        int i = (int) j;
        OooO0o.OooO0O0("checkedAdd", nanos, nanos2, j == ((long) i));
        return normalizedDuration(jOooO00o, i);
    }

    @CanIgnoreReturnValue
    public static Duration checkNotNegative(Duration duration) {
        o000oOoO.OooO0o(!isNegative(duration), "duration (%s) must not be negative", toString(duration));
        return duration;
    }

    @CanIgnoreReturnValue
    public static Duration checkPositive(Duration duration) {
        o000oOoO.OooO0o(isPositive(duration), "duration (%s) must be positive", toString(duration));
        return duration;
    }

    @CanIgnoreReturnValue
    public static Duration checkValid(Duration duration) {
        long seconds = duration.getSeconds();
        int nanos = duration.getNanos();
        if (isValid(seconds, nanos)) {
            return duration;
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(seconds), Integer.valueOf(nanos)));
    }

    public static Comparator<Duration> comparator() {
        return DurationComparator.INSTANCE;
    }

    public static int compare(Duration duration, Duration duration2) {
        return DurationComparator.INSTANCE.compare(duration, duration2);
    }

    public static Duration fromDays(long j) {
        return Duration.newBuilder().setSeconds(OooO0OO.OooO0O0(j, SECONDS_PER_DAY)).setNanos(0).build();
    }

    public static Duration fromHours(long j) {
        return Duration.newBuilder().setSeconds(OooO0OO.OooO0O0(j, SECONDS_PER_HOUR)).setNanos(0).build();
    }

    public static Duration fromMicros(long j) {
        return normalizedDuration(j / AnimationKt.MillisToNanos, (int) ((j % AnimationKt.MillisToNanos) * 1000));
    }

    public static Duration fromMillis(long j) {
        return normalizedDuration(j / 1000, (int) ((j % 1000) * AnimationKt.MillisToNanos));
    }

    public static Duration fromMinutes(long j) {
        return Duration.newBuilder().setSeconds(OooO0OO.OooO0O0(j, SECONDS_PER_MINUTE)).setNanos(0).build();
    }

    public static Duration fromNanos(long j) {
        return normalizedDuration(j / MathMethodsKt.NANOS_PER_SECOND, (int) (j % MathMethodsKt.NANOS_PER_SECOND));
    }

    public static Duration fromSeconds(long j) {
        return normalizedDuration(j, 0);
    }

    public static boolean isNegative(Duration duration) {
        checkValid(duration);
        if (duration.getSeconds() == 0) {
            if (duration.getNanos() < 0) {
                return true;
            }
        } else if (duration.getSeconds() < 0) {
            return true;
        }
        return false;
    }

    public static boolean isPositive(Duration duration) {
        checkValid(duration);
        return (isNegative(duration) || duration.equals(ZERO)) ? false : true;
    }

    public static boolean isValid(long j, int i) {
        if (j >= DURATION_SECONDS_MIN && j <= DURATION_SECONDS_MAX) {
            long j2 = i;
            if (j2 >= -999999999 && j2 < MathMethodsKt.NANOS_PER_SECOND) {
                if (j >= 0 && i >= 0) {
                    return true;
                }
                if (j <= 0 && i <= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Duration normalizedDuration(long j, int i) {
        long j2 = i;
        if (j2 <= -1000000000 || j2 >= MathMethodsKt.NANOS_PER_SECOND) {
            j = OooO0OO.OooO00o(j, j2 / MathMethodsKt.NANOS_PER_SECOND);
            i = (int) (j2 % MathMethodsKt.NANOS_PER_SECOND);
        }
        if (j > 0 && i < 0) {
            i = (int) (((long) i) + MathMethodsKt.NANOS_PER_SECOND);
            j--;
        }
        if (j < 0 && i > 0) {
            i = (int) (((long) i) - MathMethodsKt.NANOS_PER_SECOND);
            j++;
        }
        return checkValid(Duration.newBuilder().setSeconds(j).setNanos(i).build());
    }

    public static Duration parse(String str) throws ParseException {
        boolean z;
        String strSubstring;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z = true;
        } else {
            z = false;
        }
        String strSubstring2 = str.substring(0, str.length() - 1);
        int iIndexOf = strSubstring2.indexOf(46);
        if (iIndexOf != -1) {
            strSubstring = strSubstring2.substring(iIndexOf + 1);
            strSubstring2 = strSubstring2.substring(0, iIndexOf);
        } else {
            strSubstring = "";
        }
        long j = Long.parseLong(strSubstring2);
        int nanos = strSubstring.isEmpty() ? 0 : Timestamps.parseNanos(strSubstring);
        if (j < 0) {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (z) {
            j = -j;
            nanos = -nanos;
        }
        try {
            return normalizedDuration(j, nanos);
        } catch (IllegalArgumentException unused) {
            throw new ParseException("Duration value is out of range.", 0);
        }
    }

    public static Duration parseUnchecked(@CompileTimeConstant String str) {
        try {
            return parse(str);
        } catch (ParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Duration subtract(Duration duration, Duration duration2) {
        checkValid(duration);
        checkValid(duration2);
        return normalizedDuration(OooO0OO.OooO0OO(duration.getSeconds(), duration2.getSeconds()), OooO0O0.OooO00o(duration.getNanos(), duration2.getNanos()));
    }

    public static long toDays(Duration duration) {
        return checkValid(duration).getSeconds() / SECONDS_PER_DAY;
    }

    public static long toHours(Duration duration) {
        return checkValid(duration).getSeconds() / SECONDS_PER_HOUR;
    }

    public static long toMicros(Duration duration) {
        checkValid(duration);
        return OooO0OO.OooO00o(OooO0OO.OooO0O0(duration.getSeconds(), AnimationKt.MillisToNanos), ((long) duration.getNanos()) / 1000);
    }

    public static long toMillis(Duration duration) {
        checkValid(duration);
        return OooO0OO.OooO00o(OooO0OO.OooO0O0(duration.getSeconds(), 1000L), ((long) duration.getNanos()) / AnimationKt.MillisToNanos);
    }

    public static long toMinutes(Duration duration) {
        return checkValid(duration).getSeconds() / SECONDS_PER_MINUTE;
    }

    public static long toNanos(Duration duration) {
        checkValid(duration);
        return OooO0OO.OooO00o(OooO0OO.OooO0O0(duration.getSeconds(), MathMethodsKt.NANOS_PER_SECOND), duration.getNanos());
    }

    public static long toSeconds(Duration duration) {
        return checkValid(duration).getSeconds();
    }

    public static double toSecondsAsDouble(Duration duration) {
        checkValid(duration);
        return (((double) duration.getNanos()) / 1.0E9d) + duration.getSeconds();
    }

    public static String toString(Duration duration) {
        checkValid(duration);
        long seconds = duration.getSeconds();
        int nanos = duration.getNanos();
        StringBuilder sb = new StringBuilder();
        if (seconds < 0 || nanos < 0) {
            sb.append("-");
            seconds = -seconds;
            nanos = -nanos;
        }
        sb.append(seconds);
        if (nanos != 0) {
            sb.append(".");
            sb.append(Timestamps.formatNanos(nanos));
        }
        sb.append("s");
        return sb.toString();
    }

    public static boolean isValid(Duration duration) {
        return isValid(duration.getSeconds(), duration.getNanos());
    }

    public static Duration checkValid(Duration.Builder builder) {
        return checkValid(builder.build());
    }
}
