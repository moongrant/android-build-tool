package p137o00OO0oo;

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
import com.airbnb.lottie.model.layer.OooO00o;
import o00OO0O0.o00O0O;
import o00OOO0O.OooO0OO;
import p133o00OO00o.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 extends OooO00o {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final RectF f37391OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final float[] f37392OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final o0ooOOo f37393OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final Path f37394OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Layer f37395OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @Nullable
    public o00O0O f37396Oooo000;

    public o00Oo0(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.f37391OooOoOO = new RectF();
        o0ooOOo o0ooooo = new o0ooOOo();
        this.f37393OooOoo0 = o0ooooo;
        this.f37392OooOoo = new float[8];
        this.f37394OooOooO = new Path();
        this.f37395OooOooo = layer;
        o0ooooo.setAlpha(0);
        o0ooooo.setStyle(Paint.Style.FILL);
        o0ooooo.setColor(layer.f11919OooOO0o);
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o, p135o00OO0o0.o0ooOOo
    public final void OooO0Oo(@Nullable OooO0OO oooO0OO, Object obj) {
        super.OooO0Oo(oooO0OO, obj);
        if (obj == com.airbnb.lottie.o00Oo0.f12006Oooo0OO) {
            if (oooO0OO == null) {
                this.f37396Oooo000 = null;
            } else {
                this.f37396Oooo000 = new o00O0O(oooO0OO, null);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o, o00OO0.OooO
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        super.OooO0o(rectF, matrix, z);
        RectF rectF2 = this.f37391OooOoOO;
        Layer layer = this.f37395OooOooo;
        rectF2.set(0.0f, 0.0f, layer.f11917OooOO0, layer.f11918OooOO0O);
        this.f11943OooOO0o.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOO0O(Canvas canvas, Matrix matrix, int i) {
        Layer layer = this.f37395OooOooo;
        int iAlpha = Color.alpha(layer.f11919OooOO0o);
        if (iAlpha == 0) {
            return;
        }
        o00OO0O0.OooO00o<Integer, Integer> oooO00o = this.f11952OooOo0.f37289OooOO0;
        int iIntValue = (int) ((((iAlpha / 255.0f) * (oooO00o == null ? 100 : oooO00o.OooO0o().intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        o0ooOOo o0ooooo = this.f37393OooOoo0;
        o0ooooo.setAlpha(iIntValue);
        o00O0O o00o0o2 = this.f37396Oooo000;
        if (o00o0o2 != null) {
            o0ooooo.setColorFilter((ColorFilter) o00o0o2.OooO0o());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f37392OooOoo;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = layer.f11917OooOO0;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = layer.f11918OooOO0O;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.f37394OooOooO;
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
