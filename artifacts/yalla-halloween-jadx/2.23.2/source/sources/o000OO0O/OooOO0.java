package o000OO0O;

import android.animation.ValueAnimator;
import android.net.Uri;
import android.view.View;
import androidx.media3.extractor.Extractor;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooOO0 implements androidx.media3.exoplayer.drm.OooO0OO.OooO0O0, o000OOoO.o0OoOo0, com.google.android.material.internal.OooOOOO.OooO00o {
    @Override // o000OOoO.o0OoOo0
    public final Extractor[] OooO00o(Uri uri, Map map) {
        return OooO0O0();
    }

    public final Extractor[] OooO0O0() {
        return new Extractor[]{new androidx.media3.extractor.ts.OooO0OO()};
    }

    @Override // com.google.android.material.internal.OooOOOO.OooO00o
    public final void OooO0OO(ValueAnimator valueAnimator, View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @Override // androidx.media3.exoplayer.drm.OooO0OO.OooO0O0
    public final void release() {
    }
}
