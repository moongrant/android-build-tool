package o00O00o0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.o00Oo0;
import o00O000o.o00O0O;
import p233o00oOoo.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends com.airbnb.lottie.model.layer.OooO00o {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final RectF f36401OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final float[] f36402OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final o0ooOOo f36403OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final Path f36404OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Layer f36405OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @Nullable
    public o00O0O f36406Oooo000;

    public OooO(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.f36401OooOoOO = new RectF();
        o0ooOOo o0ooooo = new o0ooOOo();
        this.f36403OooOoo0 = o0ooooo;
        this.f36402OooOoo = new float[8];
        this.f36404OooOooO = new Path();
        this.f36405OooOooo = layer;
        o0ooooo.setAlpha(0);
        o0ooooo.setStyle(Paint.Style.FILL);
        o0ooooo.setColor(layer.f8829OooOO0o);
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o, o00O000.OooO
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        super.OooO0o(rectF, matrix, z);
        RectF rectF2 = this.f36401OooOoOO;
        Layer layer = this.f36405OooOooo;
        rectF2.set(0.0f, 0.0f, layer.f8827OooOO0, layer.f8828OooOO0O);
        this.f8853OooOO0o.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o, oOO00O.OooO
    public final void OooO0o0(@Nullable o00O0O00.OooO0OO oooO0OO, Object obj) {
        super.OooO0o0(oooO0OO, obj);
        if (obj == o00Oo0.f8916Oooo0OO) {
            if (oooO0OO == null) {
                this.f36406Oooo000 = null;
            } else {
                this.f36406Oooo000 = new o00O0O(oooO0OO, null);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOO0O(Canvas canvas, Matrix matrix, int i) {
        Layer layer = this.f36405OooOooo;
        int iAlpha = Color.alpha(layer.f8829OooOO0o);
        if (iAlpha == 0) {
            return;
        }
        o00O000o.OooO00o<Integer, Integer> oooO00o = this.f8862OooOo0.f36324OooOO0;
        int iIntValue = (int) ((((iAlpha / 255.0f) * (oooO00o == null ? 100 : oooO00o.OooO0o().intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        o0ooOOo o0ooooo = this.f36403OooOoo0;
        o0ooooo.setAlpha(iIntValue);
        o00O0O o00o0o2 = this.f36406Oooo000;
        if (o00o0o2 != null) {
            o0ooooo.setColorFilter((ColorFilter) o00o0o2.OooO0o());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f36402OooOoo;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = layer.f8827OooOO0;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = layer.f8828OooOO0O;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.f36404OooOooO;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, o0ooooo);
        }
    }
}
