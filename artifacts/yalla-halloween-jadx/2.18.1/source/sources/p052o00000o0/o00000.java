package p052o00000o0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
public final class o00000 implements LineHeightSpan {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final float f27076Oooo0o;

    public o00000(float f) {
        this.f27076Oooo0o = f;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(@NotNull CharSequence text, int i, int i2, int i3, int i4, @NotNull Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fontMetricsInt, "fontMetricsInt");
        int iOooO00o = o00000O.OooO00o(fontMetricsInt);
        if (iOooO00o <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(this.f27076Oooo0o);
        int iCeil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((iCeil * 1.0f) / iOooO00o)));
        fontMetricsInt.descent = iCeil2;
        fontMetricsInt.ascent = iCeil2 - iCeil;
    }
}
