package p052o00000o0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
public final class o0000Ooo extends CharacterStyle {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f27103OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f27104OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f27105OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f27106OooO0Oo;

    public o0000Ooo(int i, float f, float f2, float f3) {
        this.f27103OooO00o = i;
        this.f27104OooO0O0 = f;
        this.f27105OooO0OO = f2;
        this.f27106OooO0Oo = f3;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(@NotNull TextPaint tp) {
        Intrinsics.checkNotNullParameter(tp, "tp");
        tp.setShadowLayer(this.f27106OooO0Oo, this.f27104OooO0O0, this.f27105OooO0OO, this.f27103OooO00o);
    }
}
