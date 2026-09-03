package p052o00000o0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
public final class o0000O00 extends CharacterStyle {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f27101OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f27102OooO0O0;

    public o0000O00(boolean z, boolean z2) {
        this.f27101OooO00o = z;
        this.f27102OooO0O0 = z2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setUnderlineText(this.f27101OooO00o);
        textPaint.setStrikeThruText(this.f27102OooO0O0);
    }
}
