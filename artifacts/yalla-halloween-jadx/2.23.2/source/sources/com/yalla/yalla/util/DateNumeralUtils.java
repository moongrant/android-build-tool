package com.yalla.yalla.util;

import com.code.android.util.OooOo00;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class DateNumeralUtils {

    public enum DateType {
        m,
        h,
        d,
        M
    }

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32255OooO00o;

        static {
            int[] iArr = new int[DateType.values().length];
            f32255OooO00o = iArr;
            try {
                iArr[DateType.m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32255OooO00o[DateType.h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32255OooO00o[DateType.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32255OooO00o[DateType.M.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static int OooO00o(long j, DateType dateType) {
        if (OooOo00.OooO00o(dateType)) {
            return o000000.days;
        }
        int i = OooO00o.f32255OooO00o[dateType.ordinal()];
        if (i == 1) {
            return (p595o0oo00O.OooOo00.OooO0OO() != 0 || j <= 1) ? o000000.minute : o000000.minutes;
        }
        if (i == 2) {
            return (p595o0oo00O.OooOo00.OooO0OO() != 0 || j <= 1) ? o000000.hour : o000000.hours;
        }
        if (i == 3) {
            return (p595o0oo00O.OooOo00.OooO0OO() != 0 || j <= 1) ? o000000.day : o000000.days;
        }
        if (i != 4) {
            return o000000.days;
        }
        if (p595o0oo00O.OooOo00.OooO0OO() == 0 && j > 1) {
            return o000000.months;
        }
        if (p595o0oo00O.OooOo00.OooO0OO() == 1) {
            long j2 = j % 10;
            if (j2 >= 3 && j2 <= 9) {
                return o000000.months;
            }
        }
        return o000000.month;
    }
}
