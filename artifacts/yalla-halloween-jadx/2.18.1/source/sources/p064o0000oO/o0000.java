package p064o0000oO;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145o00Oo0.o000O;

/* JADX INFO: loaded from: classes.dex */
public final class o0000 extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o000O f27913Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public OooOo00 f27914Oooo0oO;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@Nullable TextPaint textPaint) {
        OooOo00 oooOo00;
        if (textPaint == null || (oooOo00 = this.f27914Oooo0oO) == null) {
            return;
        }
        textPaint.setShader(this.f27913Oooo0o.OooO0O0(oooOo00.f30419OooO00o));
    }
}
