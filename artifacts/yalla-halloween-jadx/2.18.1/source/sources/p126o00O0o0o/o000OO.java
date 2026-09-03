package p126o00O0o0o;

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
import com.airbnb.lottie.o000oOoO;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p120o00O0OoO.OooOO0O;
import p120o00O0OoO.o0OOO0o;
import p131o00O0oo0.o000000O;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO extends OooO00o {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final oo0oOO0.OooO00o f31057OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final RectF f31058OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final float[] f31059OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Path f31060OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final Layer f31061Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @Nullable
    public OooOO0O<ColorFilter, ColorFilter> f31062Oooo00O;

    public o000OO(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.f31058OooOoo0 = new RectF();
        oo0oOO0.OooO00o oooO00o = new oo0oOO0.OooO00o();
        this.f31057OooOoo = oooO00o;
        this.f31059OooOooO = new float[8];
        this.f31060OooOooo = new Path();
        this.f31061Oooo000 = layer;
        oooO00o.setAlpha(0);
        oooO00o.setStyle(Paint.Style.FILL);
        oooO00o.setColor(layer.f10150OooOO0o);
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o, p118o00O0Oo.OooOOO0
    public final void OooO0o(RectF rectF, Matrix matrix, boolean z) {
        super.OooO0o(rectF, matrix, z);
        RectF rectF2 = this.f31058OooOoo0;
        Layer layer = this.f31061Oooo000;
        rectF2.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, layer.f10148OooOO0, layer.f10149OooOO0O);
        this.f10176OooOOO0.mapRect(this.f31058OooOoo0);
        rectF.set(this.f31058OooOoo0);
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o, p225o00oOOo.oo0oOO0
    public final <T> void OooO0o0(T t, @Nullable o000000O<T> o000000o2) {
        super.OooO0o0(t, o000000o2);
        if (t == o000oOoO.f10234Oooo0OO) {
            if (o000000o2 == null) {
                this.f31062Oooo00O = null;
            } else {
                this.f31062Oooo00O = new o0OOO0o(o000000o2, null);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.OooO00o
    public final void OooOO0O(Canvas canvas, Matrix matrix, int i) {
        int iAlpha = Color.alpha(this.f31061Oooo000.f10150OooOO0o);
        if (iAlpha == 0) {
            return;
        }
        OooOO0O<Integer, Integer> oooOO0O = this.f10185OooOo0O.f30811OooOO0;
        int iIntValue = (int) ((((iAlpha / 255.0f) * (oooOO0O == null ? 100 : oooOO0O.OooO0o().intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        this.f31057OooOoo.setAlpha(iIntValue);
        OooOO0O<ColorFilter, ColorFilter> oooOO0O2 = this.f31062Oooo00O;
        if (oooOO0O2 != null) {
            this.f31057OooOoo.setColorFilter(oooOO0O2.OooO0o());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f31059OooOooO;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            Layer layer = this.f31061Oooo000;
            float f = layer.f10148OooOO0;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = layer.f10149OooOO0O;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            this.f31060OooOooo.reset();
            Path path = this.f31060OooOooo;
            float[] fArr2 = this.f31059OooOooO;
            path.moveTo(fArr2[0], fArr2[1]);
            Path path2 = this.f31060OooOooo;
            float[] fArr3 = this.f31059OooOooO;
            path2.lineTo(fArr3[2], fArr3[3]);
            Path path3 = this.f31060OooOooo;
            float[] fArr4 = this.f31059OooOooO;
            path3.lineTo(fArr4[4], fArr4[5]);
            Path path4 = this.f31060OooOooo;
            float[] fArr5 = this.f31059OooOooO;
            path4.lineTo(fArr5[6], fArr5[7]);
            Path path5 = this.f31060OooOooo;
            float[] fArr6 = this.f31059OooOooO;
            path5.lineTo(fArr6[0], fArr6[1]);
            this.f31060OooOooo.close();
            canvas.drawPath(this.f31060OooOooo, this.f31057OooOoo);
        }
    }
}
