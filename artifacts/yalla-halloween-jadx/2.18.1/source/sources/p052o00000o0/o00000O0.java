package p052o00000o0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.annotation.IntRange;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
public final class o00000O0 implements LineHeightSpan {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final boolean f27079Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final float f27080Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f27081Oooo0oO = 0;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f27082Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f27083OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int f27084OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final boolean f27085OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f27086OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f27087OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f27088OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f27089OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f27090o000oOoO;

    public o00000O0(float f, int i, boolean z, boolean z2, @IntRange(from = ULong.MIN_VALUE, to = 100) int i2) {
        this.f27080Oooo0o = f;
        this.f27082Oooo0oo = i;
        this.f27079Oooo = z;
        this.f27085OoooO00 = z2;
        this.f27084OoooO0 = i2;
        if (!((i2 >= 0 && i2 < 101) || i2 == -1)) {
            throw new IllegalStateException("topRatio should be in [0..100] range or -1".toString());
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(@NotNull CharSequence text, int i, int i2, int i3, int i4, @NotNull Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fontMetricsInt, "fontMetricsInt");
        if (o00000O.OooO00o(fontMetricsInt) <= 0) {
            return;
        }
        boolean z = i == this.f27081Oooo0oO;
        boolean z2 = i2 == this.f27082Oooo0oo;
        if (z && z2 && this.f27079Oooo && this.f27085OoooO00) {
            return;
        }
        if (z) {
            int iOooO00o = o00000O.OooO00o(fontMetricsInt);
            int iCeil = (int) Math.ceil(this.f27080Oooo0o);
            int i5 = iCeil - iOooO00o;
            int iAbs = this.f27084OoooO0;
            if (iAbs == -1) {
                iAbs = (int) ((Math.abs(fontMetricsInt.ascent) / o00000O.OooO00o(fontMetricsInt)) * 100.0f);
            }
            double dCeil = i5 <= 0 ? Math.ceil((i5 * iAbs) / 100.0f) : Math.ceil(((100 - iAbs) * i5) / 100.0f);
            int i6 = fontMetricsInt.descent;
            int i7 = ((int) dCeil) + i6;
            this.f27087OoooOO0 = i7;
            int i8 = i7 - iCeil;
            this.f27083OoooO = i8;
            if (this.f27079Oooo) {
                i8 = fontMetricsInt.ascent;
            }
            this.f27086OoooO0O = i8;
            if (this.f27085OoooO00) {
                i7 = i6;
            }
            this.f27090o000oOoO = i7;
            this.f27088OoooOOO = fontMetricsInt.ascent - i8;
            this.f27089OoooOOo = i7 - i6;
        }
        fontMetricsInt.ascent = z ? this.f27086OoooO0O : this.f27083OoooO;
        fontMetricsInt.descent = z2 ? this.f27090o000oOoO : this.f27087OoooOO0;
    }
}
