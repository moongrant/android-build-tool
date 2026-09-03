package p203o00o0o0o;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import com.google.android.exoplayer2.OooO;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.o0Oo0oo;
import com.google.android.exoplayer2.o0ooOOo;
import com.google.android.material.internal.OooOOOO;
import java.lang.reflect.Constructor;
import p209o00o0oo0.oo00o;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O00OOO implements OooO.OooO00o, oo00o.OooO00o.InterfaceC0444OooO00o, OooOOOO.OooO00o {
    @Override // o00o0oo0.oo00o.OooO00o.InterfaceC0444OooO00o
    public final Constructor OooO00o() {
        int[] iArr = oo00o.f39569OooO0o0;
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(Extractor.class).getConstructor(new Class[0]);
    }

    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public final OooO OooO0O0(Bundle bundle) {
        o00O000o.OooO00o(bundle.getInt(o0ooOOo.f12867OooO0Oo, -1) == 2);
        int i = bundle.getInt(o0Oo0oo.f12850OooO0oo, 5);
        float f = bundle.getFloat(o0Oo0oo.f12849OooO, -1.0f);
        return f == -1.0f ? new o0Oo0oo(i) : new o0Oo0oo(i, f);
    }

    @Override // com.google.android.material.internal.OooOOOO.OooO00o
    public final void OooO0OO(ValueAnimator valueAnimator, View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
