package com.app.base.util;

import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import p168o00Ooo0.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class DateNumeralUtils {

    public enum DateType {
        m,
        h,
        d,
        M
    }

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f11933OooO00o;

        static {
            int[] iArr = new int[DateType.values().length];
            f11933OooO00o = iArr;
            try {
                iArr[DateType.m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11933OooO00o[DateType.h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11933OooO00o[DateType.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11933OooO00o[DateType.M.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static int OooO00o(long j, DateType dateType) {
        if (OooO0OO.OooO00o(dateType)) {
            return R.string.days;
        }
        int i = OooO00o.f11933OooO00o[dateType.ordinal()];
        if (i == 1) {
            return (oo000o.OooO0O0() != 0 || j <= 1) ? R.string.minute : R.string.minutes;
        }
        if (i == 2) {
            return (oo000o.OooO0O0() != 0 || j <= 1) ? R.string.hour : R.string.hours;
        }
        if (i == 3) {
            return (oo000o.OooO0O0() != 0 || j <= 1) ? R.string.day : R.string.days;
        }
        if (i != 4) {
            return R.string.days;
        }
        if (oo000o.OooO0O0() == 0 && j > 1) {
            return R.string.months;
        }
        if (oo000o.OooO0O0() != 1) {
            return R.string.month;
        }
        long j2 = j % 10;
        return (j2 < 3 || j2 > 9) ? R.string.month : R.string.months;
    }
}
