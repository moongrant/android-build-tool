package p052o00000o0;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p389o0OOoo0o.o00O0OOO;

/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
public final class o00000OO extends ReplacementSpan {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final float f27110Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final float f27111OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final float f27112OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f27113OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final int f27114OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final int f27115OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f27116OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f27117OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f27118OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public Paint.FontMetricsInt f27119o000oOoO;

    public o00000OO(float f, int i, float f2, int i2, float f3, int i3) {
        this.f27110Oooo = f;
        this.f27113OoooO00 = i;
        this.f27112OoooO0 = f2;
        this.f27114OoooO0O = i2;
        this.f27111OoooO = f3;
        this.f27115OoooOO0 = i3;
    }

    @NotNull
    public final Paint.FontMetricsInt OooO00o() {
        Paint.FontMetricsInt fontMetricsInt = this.f27119o000oOoO;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fontMetrics");
        return null;
    }

    public final int OooO0O0() {
        if (this.f27118OoooOo0) {
            return this.f27117OoooOOo;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    public final int OooO0OO() {
        if (this.f27118OoooOo0) {
            return this.f27116OoooOOO;
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
        this.f27118OoooOo0 = true;
        float textSize = paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        Intrinsics.checkNotNullExpressionValue(fontMetricsInt2, "paint.fontMetricsInt");
        this.f27119o000oOoO = fontMetricsInt2;
        if (!(OooO00o().descent > OooO00o().ascent)) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
        }
        int i3 = this.f27113OoooO00;
        if (i3 == 0) {
            f = this.f27110Oooo * this.f27111OoooO;
        } else {
            if (i3 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            f = this.f27110Oooo * textSize;
        }
        this.f27116OoooOOO = o00O0OOO.OooO0o0(f);
        int i4 = this.f27114OoooO0O;
        if (i4 == 0) {
            iOooO0o0 = o00O0OOO.OooO0o0(this.f27112OoooO0 * this.f27111OoooO);
        } else {
            if (i4 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            iOooO0o0 = o00O0OOO.OooO0o0(this.f27112OoooO0 * textSize);
        }
        this.f27117OoooOOo = iOooO0o0;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = OooO00o().ascent;
            fontMetricsInt.descent = OooO00o().descent;
            fontMetricsInt.leading = OooO00o().leading;
            switch (this.f27115OoooOO0) {
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
