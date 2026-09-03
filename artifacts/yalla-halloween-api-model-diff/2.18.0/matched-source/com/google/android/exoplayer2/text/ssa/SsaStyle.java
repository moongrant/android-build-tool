package com.google.android.exoplayer2.text.ssa;

import android.graphics.PointF;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p319o0O0oOo.o00;

/* JADX INFO: loaded from: classes2.dex */
public final class SsaStyle {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f14672OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f14673OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f14674OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f14675OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f14676OooO0OO;

        public OooO00o(int i, int i2, int i3) {
            this.f14674OooO00o = i;
            this.f14675OooO0O0 = i2;
            this.f14676OooO0OO = i3;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Pattern f14677OooO00o = Pattern.compile("\\{([^}]*)\\}");

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final Pattern f14678OooO0O0 = Pattern.compile(o00.OooOO0O("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final Pattern f14679OooO0OO = Pattern.compile(o00.OooOO0O("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Pattern f14680OooO0Oo = Pattern.compile("\\\\an(\\d+)");

        @Nullable
        public static PointF OooO00o(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = f14678OooO0O0.matcher(str);
            Matcher matcher2 = f14679OooO0OO.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    StringBuilder sb = new StringBuilder(str.length() + 82);
                    sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb.append(str);
                    sb.append("'");
                    Log.i("SsaStyle.Overrides", sb.toString());
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
            Objects.requireNonNull(strGroup);
            float f = Float.parseFloat(strGroup.trim());
            Objects.requireNonNull(strGroup2);
            return new PointF(f, Float.parseFloat(strGroup2.trim()));
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SsaAlignment {
    }

    public SsaStyle(String str, int i) {
        this.f14672OooO00o = str;
        this.f14673OooO0O0 = i;
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
        String strValueOf = String.valueOf(str);
        Log.w("SsaStyle", strValueOf.length() != 0 ? "Ignoring unknown alignment: ".concat(strValueOf) : new String("Ignoring unknown alignment: "));
        return -1;
    }
}
