package p103o000oo00;

import android.animation.ValueAnimator;
import android.net.Uri;
import android.view.View;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ts.AdtsExtractor;
import com.google.android.material.internal.OooOOOO;
import java.util.Map;
import o000OOoO.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Oooo0 implements o0OoOo0, OooOOOO.OooO00o {
    @Override // o000OOoO.o0OoOo0
    public final Extractor[] OooO00o(Uri uri, Map map) {
        return OooO0O0();
    }

    public final Extractor[] OooO0O0() {
        return new Extractor[]{new AdtsExtractor()};
    }

    @Override // com.google.android.material.internal.OooOOOO.OooO00o
    public final void OooO0OO(ValueAnimator valueAnimator, View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
