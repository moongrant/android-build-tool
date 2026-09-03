package p068o0000oo;

import android.os.Build;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import o0000.OooO0o;
import o0000.OooOOO0;
import o0000O0O.OooO;
import o0000O0O.o00O0O;
import o0000O0O.o00Ooo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o00000OO;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO {
    public static final float OooO00o(long j, float f, OooO oooO) {
        long jOooO0O0 = o00O0O.OooO0O0(j);
        if (o00Ooo.OooO00o(jOooO0O0, 4294967296L)) {
            return oooO.oo000o(j);
        }
        if (o00Ooo.OooO00o(jOooO0O0, 8589934592L)) {
            return o00O0O.OooO0OO(j) * f;
        }
        return Float.NaN;
    }

    public static final void OooO0O0(@NotNull Spannable setBackground, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(setBackground, "$this$setBackground");
        o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
        if (j != o00000O0.f32062OooO) {
            OooO0o(setBackground, new BackgroundColorSpan(o00000OO.OooO0oO(j)), i, i2);
        }
    }

    public static final void OooO0OO(@NotNull Spannable setColor, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(setColor, "$this$setColor");
        o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
        if (j != o00000O0.f32062OooO) {
            OooO0o(setColor, new ForegroundColorSpan(o00000OO.OooO0oO(j)), i, i2);
        }
    }

    public static final void OooO0Oo(@NotNull Spannable setFontSize, long j, @NotNull OooO density, int i, int i2) {
        Intrinsics.checkNotNullParameter(setFontSize, "$this$setFontSize");
        Intrinsics.checkNotNullParameter(density, "density");
        long jOooO0O0 = o00O0O.OooO0O0(j);
        if (o00Ooo.OooO00o(jOooO0O0, 4294967296L)) {
            OooO0o(setFontSize, new AbsoluteSizeSpan(MathKt.roundToInt(density.oo000o(j)), false), i, i2);
        } else if (o00Ooo.OooO00o(jOooO0O0, 8589934592L)) {
            OooO0o(setFontSize, new RelativeSizeSpan(o00O0O.OooO0OO(j)), i, i2);
        }
    }

    public static final void OooO0o(@NotNull Spannable spannable, @NotNull Object span, int i, int i2) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(span, "span");
        spannable.setSpan(span, i, i2, 33);
    }

    public static final void OooO0o0(@NotNull Spannable spannable, @Nullable o0000.OooO oooO, int i, int i2) {
        Object localeSpan;
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        if (oooO != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                localeSpan = o0000oo.f27951OooO00o.OooO00o(oooO);
            } else {
                localeSpan = new LocaleSpan(o0000O00.OooO00o(oooO.isEmpty() ? new OooO0o(OooOOO0.f26569OooO00o.OooO00o().get(0)) : oooO.OooO00o()));
            }
            OooO0o(spannable, localeSpan, i, i2);
        }
    }
}
