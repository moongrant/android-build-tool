package o00000OO;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p052o00000o0.o00000O0;
import p052o00000o0.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f27060OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Layout f27061OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f27062OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f27063OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f27064OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f27065OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f27066OooO0oO;

    /* JADX WARN: Code duplicated, block: B:55:0x0172  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f3  */
    public o00O0O(CharSequence text, float f, TextPaint paint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, OooO0OO layoutIntrinsics) {
        String str;
        String str2;
        Layout layoutOooO00o;
        boolean z2;
        int iMax;
        Pair<Integer, Integer> pair;
        o00000O0[] lineHeightStyleSpans;
        Intrinsics.checkNotNullParameter(text, "charSequence");
        Intrinsics.checkNotNullParameter(paint, "textPaint");
        Intrinsics.checkNotNullParameter(layoutIntrinsics, "layoutIntrinsics");
        int length = text.length();
        TextDirectionHeuristic textDir = o00Oo0.OooO00o(i2);
        o000oOoO o000oooo2 = o000oOoO.f27057OooO00o;
        Layout.Alignment alignment = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : o000oOoO.f27059OooO0OO : o000oOoO.f27058OooO0O0 : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z3 = (text instanceof Spanned) && ((Spanned) text).nextSpanTransition(-1, length, o0O0O00.class) < length;
        BoringLayout.Metrics metrics = (BoringLayout.Metrics) layoutIntrinsics.f27020OooO00o.getValue();
        double d = f;
        int iCeil = (int) Math.ceil(d);
        if (metrics == null || ((Number) layoutIntrinsics.f27022OooO0OO.getValue()).floatValue() > f || z3) {
            this.f27064OooO0o = false;
            OooOo00 oooOo00 = OooOo00.f27034OooO00o;
            int length2 = text.length();
            int iCeil2 = (int) Math.ceil(d);
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(paint, "paint");
            Intrinsics.checkNotNullParameter(textDir, "textDir");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            OooOo oooOo = OooOo00.f27035OooO0O0;
            str = "paint";
            str2 = ViewHierarchyConstants.TEXT_KEY;
            layoutOooO00o = oooOo.OooO00o(new Oooo0(text, length2, paint, iCeil, textDir, alignment, i3, truncateAt, iCeil2, 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, i4, z, true, 0, 0, null, null));
        } else {
            this.f27064OooO0o = true;
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(paint, "paint");
            Intrinsics.checkNotNullParameter(metrics, "metrics");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            if (!(iCeil >= 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(iCeil >= 0)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            layoutOooO00o = truncateAt == null ? new BoringLayout(text, paint, iCeil, alignment, 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, metrics, z) : new BoringLayout(text, paint, iCeil, alignment, 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, metrics, z, truncateAt, iCeil);
            str = "paint";
            str2 = ViewHierarchyConstants.TEXT_KEY;
        }
        this.f27061OooO0O0 = layoutOooO00o;
        int iMin = Math.min(layoutOooO00o.getLineCount(), i3);
        this.f27062OooO0OO = iMin;
        if (iMin < i3) {
            z2 = false;
        } else {
            int i5 = iMin - 1;
            if (layoutOooO00o.getEllipsisCount(i5) > 0 || layoutOooO00o.getLineEnd(i5) != text.length()) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.f27060OooO00o = z2;
        if (z) {
            iMax = 0;
            pair = new Pair<>(0, 0);
        } else if (!this.f27064OooO0o && Build.VERSION.SDK_INT >= 28) {
            iMax = 0;
            pair = new Pair<>(0, 0);
        } else {
            TextPaint paint2 = layoutOooO00o.getPaint();
            CharSequence text2 = layoutOooO00o.getText();
            Intrinsics.checkNotNullExpressionValue(paint2, str);
            Intrinsics.checkNotNullExpressionValue(text2, str2);
            iMax = 0;
            Rect rectOooO00o = OooOO0.OooO00o(paint2, text2, layoutOooO00o.getLineStart(0), layoutOooO00o.getLineEnd(0));
            int lineAscent = layoutOooO00o.getLineAscent(0);
            int i6 = rectOooO00o.top;
            int topPadding = i6 < lineAscent ? lineAscent - i6 : layoutOooO00o.getTopPadding();
            if (iMin != 1) {
                int lineCount = layoutOooO00o.getLineCount() - 1;
                rectOooO00o = OooOO0.OooO00o(paint2, text2, layoutOooO00o.getLineStart(lineCount), layoutOooO00o.getLineEnd(lineCount));
            }
            int lineDescent = layoutOooO00o.getLineDescent(layoutOooO00o.getLineCount() - 1);
            int i7 = rectOooO00o.bottom;
            int bottomPadding = i7 > lineDescent ? i7 - lineDescent : layoutOooO00o.getBottomPadding();
            pair = (topPadding == 0 && bottomPadding == 0) ? o00Oo0.f27067OooO00o : new Pair<>(Integer.valueOf(topPadding), Integer.valueOf(bottomPadding));
        }
        if (OooO0oo() instanceof Spanned) {
            lineHeightStyleSpans = (o00000O0[]) ((Spanned) OooO0oo()).getSpans(iMax, OooO0oo().length(), o00000O0.class);
            Intrinsics.checkNotNullExpressionValue(lineHeightStyleSpans, "lineHeightStyleSpans");
            if (lineHeightStyleSpans.length == 0) {
                lineHeightStyleSpans = new o00000O0[iMax];
            }
        } else {
            lineHeightStyleSpans = new o00000O0[iMax];
        }
        int iMax2 = 0;
        for (o00000O0 o00000o1 : lineHeightStyleSpans) {
            int i8 = o00000o1.f27088OoooOOO;
            iMax = i8 < 0 ? Math.max(iMax, Math.abs(i8)) : iMax;
            int i9 = o00000o1.f27089OoooOOo;
            if (i9 < 0) {
                iMax2 = Math.max(iMax, Math.abs(i9));
            }
        }
        Pair<Integer, Integer> pair2 = (iMax == 0 && iMax2 == 0) ? o00Oo0.f27067OooO00o : new Pair<>(Integer.valueOf(iMax), Integer.valueOf(iMax2));
        this.f27063OooO0Oo = Math.max(pair.getFirst().intValue(), pair2.getFirst().intValue());
        this.f27065OooO0o0 = Math.max(pair.getSecond().intValue(), pair2.getSecond().intValue());
        this.f27066OooO0oO = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new o0OoOo0(this));
    }

    public static float OooO0oO(o00O0O o00o0o2, int i) {
        return ((OooO0O0) o00o0o2.f27066OooO0oO.getValue()).OooO0O0(i, true, false);
    }

    public final void OooO(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i = this.f27063OooO0Oo;
        if (i != 0) {
            canvas.translate(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, i);
        }
        this.f27061OooO0O0.draw(canvas);
        int i2 = this.f27063OooO0Oo;
        if (i2 != 0) {
            canvas.translate(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (-1) * i2);
        }
    }

    public final int OooO00o() {
        return (this.f27060OooO00o ? this.f27061OooO0O0.getLineBottom(this.f27062OooO0OO - 1) : this.f27061OooO0O0.getHeight()) + this.f27063OooO0Oo + this.f27065OooO0o0;
    }

    public final float OooO0O0(int i) {
        return this.f27063OooO0Oo + this.f27061OooO0O0.getLineBaseline(i);
    }

    public final float OooO0OO(int i) {
        return this.f27063OooO0Oo + this.f27061OooO0O0.getLineBottom(i) + (i == this.f27062OooO0OO + (-1) ? this.f27065OooO0o0 : 0);
    }

    public final int OooO0Oo(int i) {
        return this.f27061OooO0O0.getEllipsisStart(i) == 0 ? this.f27061OooO0O0.getLineEnd(i) : this.f27061OooO0O0.getText().length();
    }

    public final float OooO0o(int i) {
        return this.f27061OooO0O0.getLineTop(i) + (i == 0 ? 0 : this.f27063OooO0Oo);
    }

    public final int OooO0o0(int i) {
        return this.f27061OooO0O0.getLineForOffset(i);
    }

    @NotNull
    public final CharSequence OooO0oo() {
        CharSequence text = this.f27061OooO0O0.getText();
        Intrinsics.checkNotNullExpressionValue(text, "layout.text");
        return text;
    }
}
