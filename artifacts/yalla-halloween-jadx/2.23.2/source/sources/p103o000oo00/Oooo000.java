package p103o000oo00;

import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ts.OooO00o;
import com.google.android.material.internal.OooOOOO;
import java.util.Map;
import kotlinx.coroutines.DebugKt;
import o000OOoO.o0OoOo0;
import p315o0O0oOo.o000OO;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Oooo000 implements o0OoOo0, OooOOOO.OooO00o, o000OO.OooO00o {
    @Override // o000OOoO.o0OoOo0
    public Extractor[] OooO00o(Uri uri, Map map) {
        return OooO0Oo();
    }

    @Override // o0O0oOo.o000OO.OooO00o
    public String OooO0O0(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
        }
        return (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
    }

    @Override // com.google.android.material.internal.OooOOOO.OooO00o
    public void OooO0OO(ValueAnimator valueAnimator, View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public Extractor[] OooO0Oo() {
        return new Extractor[]{new OooO00o()};
    }
}
