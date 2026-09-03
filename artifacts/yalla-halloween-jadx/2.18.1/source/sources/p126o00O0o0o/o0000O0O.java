package p126o00O0o0o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.OooO00o;
import com.airbnb.lottie.model.layer.OooO0O0;
import java.util.Collections;
import java.util.List;
import p118o00O0Oo.OooOO0O;
import p125o00O0o0O.o0000Ooo;
import p125o00O0o0O.oo0o0Oo;
import p127o00O0oO.o00000O0;
import p225o00oOOo.o00O0OOO;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0O extends OooO00o {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final OooO0O0 f31050OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooOO0O f31051OooOoo0;

    public o0000O0O(LottieDrawable lottieDrawable, Layer layer, OooO0O0 oooO0O0) {
        super(lottieDrawable, layer);
        this.f31050OooOoo = oooO0O0;
        OooOO0O oooOO0O = new OooOO0O(lottieDrawable, this, new o0000Ooo("__container", layer.f10140OooO00o, false));
        this.f31051OooOoo0 = oooOO0O;
        oooOO0O.OooO0OO(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o, p118o00O0Oo.OooOOO0
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        super.OooO0o(rectF, matrix, z);
        this.f31051OooOoo0.OooO0o(rectF, this.f10176OooOOO0, z);
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOO0O(@NonNull Canvas canvas, Matrix matrix, int i) {
        this.f31051OooOoo0.OooO0oo(canvas, matrix, i);
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    @Nullable
    public final oo0o0Oo OooOO0o() {
        oo0o0Oo oo0o0oo = this.f10177OooOOOO.f10162OooOo0o;
        return oo0o0oo != null ? oo0o0oo : this.f31050OooOoo.f10177OooOOOO.f10162OooOo0o;
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    @Nullable
    public final o00000O0 OooOOO() {
        o00000O0 o00000o1 = this.f10177OooOOOO.f10158OooOo;
        return o00000o1 != null ? o00000o1 : this.f31050OooOoo.f10177OooOOOO.f10158OooOo;
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOOoo(o00O0OOO o00o0ooo2, int i, List<o00O0OOO> list, o00O0OOO o00o0ooo3) {
        this.f31051OooOoo0.OooO0Oo(o00o0ooo2, i, list, o00o0ooo3);
    }
}
