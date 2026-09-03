package p052o00000o0;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p387o0OOoo0o.o00O0OOO;

/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
public final class o00000OO extends ReplacementSpan {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f27091Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final float f27092Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f27093Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final float f27094Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f27095OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int f27096OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final float f27097OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public Paint.FontMetricsInt f27098OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f27099OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f27100o000oOoO;

    public o00000OO(float f, int i, float f2, int i2, float f3, int i3) {
        this.f27092Oooo0o = f;
        this.f27093Oooo0oO = i;
        this.f27094Oooo0oo = f2;
        this.f27091Oooo = i2;
        this.f27097OoooO00 = f3;
        this.f27096OoooO0 = i3;
    }

    @NotNull
    public final Paint.FontMetricsInt OooO00o() {
        Paint.FontMetricsInt fontMetricsInt = this.f27098OoooO0O;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fontMetrics");
        return null;
    }

    public final int OooO0O0() {
        if (this.f27100o000oOoO) {
            return this.f27099OoooOO0;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    public final int OooO0OO() {
        if (this.f27100o000oOoO) {
            return this.f27095OoooO;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(@NotNull Canvas canvas, @Nullable CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public final int getSize(@NotNull Paint paint, @Nullable CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        float f;
        int iOooO0o0;
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f27100o000oOoO = true;
        float textSize = paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        Intrinsics.checkNotNullExpressionValue(fontMetricsInt2, "paint.fontMetricsInt");
        this.f27098OoooO0O = fontMetricsInt2;
        if (!(OooO00o().descent > OooO00o().ascent)) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
        }
        int i3 = this.f27093Oooo0oO;
        if (i3 == 0) {
            f = this.f27092Oooo0o * this.f27097OoooO00;
        } else {
            if (i3 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            f = this.f27092Oooo0o * textSize;
        }
        this.f27095OoooO = o00O0OOO.OooO0o0(f);
        int i4 = this.f27091Oooo;
        if (i4 == 0) {
            iOooO0o0 = o00O0OOO.OooO0o0(this.f27094Oooo0oo * this.f27097OoooO00);
        } else {
            if (i4 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            iOooO0o0 = o00O0OOO.OooO0o0(this.f27094Oooo0oo * textSize);
        }
        this.f27099OoooOO0 = iOooO0o0;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = OooO00o().ascent;
            fontMetricsInt.descent = OooO00o().descent;
            fontMetricsInt.leading = OooO00o().leading;
            switch (this.f27096OoooO0) {
                case 0:
                    if (fontMetricsInt.ascent > (-OooO0O0())) {
                        fontMetricsInt.ascent = -OooO0O0();
                    }
                    break;
                case 1:
                case 4:
                    if (OooO0O0() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = OooO0O0() + fontMetricsInt.ascent;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - OooO0O0()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - OooO0O0();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < OooO0O0()) {
                        int iOooO0O0 = fontMetricsInt.ascent - ((OooO0O0() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iOooO0O0;
                        fontMetricsInt.descent = OooO0O0() + iOooO0O0;
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Unknown verticalAlign.");
            }
            fontMetricsInt.top = Math.min(OooO00o().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(OooO00o().bottom, fontMetricsInt.descent);
        }
        return OooO0OO();
    }
}
