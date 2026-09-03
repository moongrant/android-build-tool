package com.yalla.yalla.util;

import com.code.android.util.OooOo00;
import p584o0oOooO0.oO00OOo0;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes5.dex */
public final class DateNumeralUtils {

    public enum DateType {
        m,
        h,
        d,
        M
    }

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f32791OooO00o;

        static {
            int[] iArr = new int[DateType.values().length];
            f32791OooO00o = iArr;
            try {
                iArr[DateType.m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32791OooO00o[DateType.h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32791OooO00o[DateType.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32791OooO00o[DateType.M.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static int OooO00o(long j, DateType dateType) {
        if (OooOo00.OooO00o(dateType)) {
            return oO00OOo0.days;
        }
        int i = OooO00o.f32791OooO00o[dateType.ordinal()];
        if (i == 1) {
            return (OooO.OooO0OO() != 0 || j <= 1) ? oO00OOo0.minute : oO00OOo0.minutes;
        }
        if (i == 2) {
            return (OooO.OooO0OO() != 0 || j <= 1) ? oO00OOo0.hour : oO00OOo0.hours;
        }
        if (i == 3) {
            return (OooO.OooO0OO() != 0 || j <= 1) ? oO00OOo0.day : oO00OOo0.days;
        }
        if (i != 4) {
            return oO00OOo0.days;
        }
        if (OooO.OooO0OO() == 0 && j > 1) {
            return oO00OOo0.months;
        }
        if (OooO.OooO0OO() == 1) {
            long j2 = j % 10;
            if (j2 >= 3 && j2 <= 9) {
                return oO00OOo0.months;
            }
        }
        return oO00OOo0.month;
    }
}
