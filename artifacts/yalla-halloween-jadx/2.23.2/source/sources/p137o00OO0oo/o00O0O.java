package p137o00OO0oo;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.OooO00o;
import com.airbnb.lottie.model.layer.OooO0O0;
import java.util.ArrayList;
import java.util.Collections;
import o00OO.OooOOOO;
import o00OO0.OooO0o;
import p135o00OO0o0.o00oO0o;
import p136o00OO0oO.OooO0OO;
import p136o00OO0oO.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O extends OooO00o {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final OooO0o f37389OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooO0O0 f37390OooOoo0;

    public o00O0O(LottieDrawable lottieDrawable, Layer layer, OooO0O0 oooO0O0) {
        super(lottieDrawable, layer);
        this.f37390OooOoo0 = oooO0O0;
        OooO0o oooO0o = new OooO0o(lottieDrawable, this, new OooOo(layer.f11909OooO00o, "__container", false));
        this.f37389OooOoOO = oooO0o;
        oooO0o.OooO0OO(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o, o00OO0.OooO
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        super.OooO0o(rectF, matrix, z);
        this.f37389OooOoOO.OooO0o(rectF, this.f11943OooOO0o, z);
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOO0O(@NonNull Canvas canvas, Matrix matrix, int i) {
        this.f37389OooOoOO.OooO0oo(canvas, matrix, i);
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    @Nullable
    public final OooO0OO OooOO0o() {
        OooO0OO oooO0OO = this.f11944OooOOO.f11931OooOo0o;
        return oooO0OO != null ? oooO0OO : this.f37390OooOoo0.f11944OooOOO.f11931OooOo0o;
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    @Nullable
    public final OooOOOO OooOOO0() {
        OooOOOO oooOOOO = this.f11944OooOOO.f11927OooOo;
        return oooOOOO != null ? oooOOOO : this.f37390OooOoo0.f11944OooOOO.f11927OooOo;
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOOo0(o00oO0o o00oo0o2, int i, ArrayList arrayList, o00oO0o o00oo0o3) {
        this.f37389OooOoOO.OooO0o0(o00oo0o2, i, arrayList, o00oo0o3);
    }
}
