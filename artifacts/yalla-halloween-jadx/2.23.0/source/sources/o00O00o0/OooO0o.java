package o00O00o0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.Collections;
import p113o00O00Oo.o000oOoO;
import p113o00O00Oo.o0Oo0oo;
import p115o00O00oO.o0000Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends com.airbnb.lottie.model.layer.OooO00o {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final o00O000.OooO0o f36413OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.OooO0O0 f36414OooOoo0;

    public OooO0o(LottieDrawable lottieDrawable, Layer layer, com.airbnb.lottie.model.layer.OooO0O0 oooO0O0) {
        super(lottieDrawable, layer);
        this.f36414OooOoo0 = oooO0O0;
        o00O000.OooO0o oooO0o = new o00O000.OooO0o(lottieDrawable, this, new o0Oo0oo(layer.f8819OooO00o, "__container", false));
        this.f36413OooOoOO = oooO0o;
        oooO0o.OooO0OO(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o, o00O000.OooO
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        super.OooO0o(rectF, matrix, z);
        this.f36413OooOoOO.OooO0o(rectF, this.f8853OooOO0o, z);
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOO0O(@NonNull Canvas canvas, Matrix matrix, int i) {
        this.f36413OooOoOO.OooO0oo(canvas, matrix, i);
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    @Nullable
    public final o000oOoO OooOO0o() {
        o000oOoO o000oooo2 = this.f8854OooOOO.f8841OooOo0o;
        return o000oooo2 != null ? o000oooo2 : this.f36414OooOoo0.f8854OooOOO.f8841OooOo0o;
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    @Nullable
    public final o0000Ooo OooOOO0() {
        o0000Ooo o0000ooo = this.f8854OooOOO.f8837OooOo;
        return o0000ooo != null ? o0000ooo : this.f36414OooOoo0.f8854OooOOO.f8837OooOo;
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOOo0(oOO00O.OooO0o oooO0o, int i, ArrayList arrayList, oOO00O.OooO0o oooO0o2) {
        this.f36413OooOoOO.OooO0Oo(oooO0o, i, arrayList, oooO0o2);
    }
}
