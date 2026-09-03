package com.google.android.exoplayer2.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Log;
import com.google.common.primitives.OooO0o;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p200o00o0o.o000O00;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class SsaStyle {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f13444OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f13445OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f13446OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    @ColorInt
    public final Integer f13447OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    @ColorInt
    public final Integer f13448OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f13449OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f13450OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f13451OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f13452OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f13453OooOO0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final int f13454OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f13455OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f13456OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f13457OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f13458OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f13459OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f13460OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f13461OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f13462OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final int f13463OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final int f13464OooOO0O;

        public OooO00o(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f13455OooO00o = i;
            this.f13456OooO0O0 = i2;
            this.f13457OooO0OO = i3;
            this.f13458OooO0Oo = i4;
            this.f13460OooO0o0 = i5;
            this.f13459OooO0o = i6;
            this.f13461OooO0oO = i7;
            this.f13462OooO0oo = i8;
            this.f13454OooO = i9;
            this.f13463OooOO0 = i10;
            this.f13464OooOO0O = i11;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Pattern f13465OooO00o = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final Pattern f13466OooO0O0 = Pattern.compile(o0O00.OooOO0o("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final Pattern f13467OooO0OO = Pattern.compile(o0O00.OooOO0o("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Pattern f13468OooO0Oo = Pattern.compile("\\\\an(\\d+)");

        @Nullable
        public static PointF OooO00o(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f13466OooO0O0.matcher(str);
            Matcher matcher2 = f13467OooO0OO.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    Log.OooO0o0("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            strGroup.getClass();
            float f = Float.parseFloat(strGroup.trim());
            strGroup2.getClass();
            return new PointF(f, Float.parseFloat(strGroup2.trim()));
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SsaAlignment {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SsaBorderStyle {
    }

    public SsaStyle(String str, int i, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f13445OooO00o = str;
        this.f13446OooO0O0 = i;
        this.f13447OooO0OO = num;
        this.f13448OooO0Oo = num2;
        this.f13450OooO0o0 = f;
        this.f13449OooO0o = z;
        this.f13451OooO0oO = z2;
        this.f13452OooO0oo = z3;
        this.f13444OooO = z4;
        this.f13453OooOO0 = i2;
    }

    public static int OooO00o(String str) {
        boolean z;
        try {
            int i = Integer.parseInt(str.trim());
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        o000O00.OooO00o("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean OooO0O0(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            Log.OooO0oO("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    @Nullable
    @ColorInt
    public static Integer OooO0OO(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            o00O000o.OooO00o(j <= 4294967295L);
            return Integer.valueOf(Color.argb(OooO0o.OooO00o(((j >> 24) & 255) ^ 255), OooO0o.OooO00o(j & 255), OooO0o.OooO00o((j >> 8) & 255), OooO0o.OooO00o((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            Log.OooO0oO("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }
}
