package androidx.media3.extractor.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import com.google.common.primitives.OooO0OO;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o000Oo0.o0OoOo0;
import p080o000OoO.o000OO00;
import p080o000OoO.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class SsaStyle {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f8799OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f8800OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f8801OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    @ColorInt
    public final Integer f8802OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    @ColorInt
    public final Integer f8803OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f8804OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f8805OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f8806OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f8807OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f8808OooOO0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final int f8809OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f8810OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f8811OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f8812OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f8813OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f8814OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f8815OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f8816OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f8817OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final int f8818OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final int f8819OooOO0O;

        public OooO00o(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f8810OooO00o = i;
            this.f8811OooO0O0 = i2;
            this.f8812OooO0OO = i3;
            this.f8813OooO0Oo = i4;
            this.f8815OooO0o0 = i5;
            this.f8814OooO0o = i6;
            this.f8816OooO0oO = i7;
            this.f8817OooO0oo = i8;
            this.f8809OooO = i9;
            this.f8818OooOO0 = i10;
            this.f8819OooOO0O = i11;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Pattern f8820OooO00o = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final Pattern f8821OooO0O0 = Pattern.compile(o000OO00.OooOOO("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final Pattern f8822OooO0OO = Pattern.compile(o000OO00.OooOOO("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Pattern f8823OooO0Oo = Pattern.compile("\\\\an(\\d+)");

        @Nullable
        public static PointF OooO00o(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f8821OooO0O0.matcher(str);
            Matcher matcher2 = f8822OooO0OO.matcher(str);
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
        this.f8800OooO00o = str;
        this.f8801OooO0O0 = i;
        this.f8802OooO0OO = num;
        this.f8803OooO0Oo = num2;
        this.f8805OooO0o0 = f;
        this.f8804OooO0o = z;
        this.f8806OooO0oO = z2;
        this.f8807OooO0oo = z3;
        this.f8799OooO = z4;
        this.f8808OooOO0 = i2;
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
        o0OoOo0.OooO00o("Ignoring unknown alignment: ", str, "SsaStyle");
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
            o00O0O.OooO00o(j <= 4294967295L);
            return Integer.valueOf(Color.argb(OooO0OO.OooO00o(((j >> 24) & 255) ^ 255), OooO0OO.OooO00o(j & 255), OooO0OO.OooO00o((j >> 8) & 255), OooO0OO.OooO00o((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            Log.OooO0oO("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }
}
