package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.qiniu.android.http.ResponseInfo;

/* JADX INFO: loaded from: classes.dex */
public class OooOo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f5100OooO0OO = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ProgressBar f5101OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Bitmap f5102OooO0O0;

    @RequiresApi(23)
    public static class OooO00o {
        public static void OooO00o(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i) {
            layerDrawable2.setLayerGravity(i, layerDrawable.getLayerGravity(i));
            layerDrawable2.setLayerWidth(i, layerDrawable.getLayerWidth(i));
            layerDrawable2.setLayerHeight(i, layerDrawable.getLayerHeight(i));
            layerDrawable2.setLayerInsetLeft(i, layerDrawable.getLayerInsetLeft(i));
            layerDrawable2.setLayerInsetRight(i, layerDrawable.getLayerInsetRight(i));
            layerDrawable2.setLayerInsetTop(i, layerDrawable.getLayerInsetTop(i));
            layerDrawable2.setLayerInsetBottom(i, layerDrawable.getLayerInsetBottom(i));
            layerDrawable2.setLayerInsetStart(i, layerDrawable.getLayerInsetStart(i));
            layerDrawable2.setLayerInsetEnd(i, layerDrawable.getLayerInsetEnd(i));
        }
    }

    public OooOo(ProgressBar progressBar) {
        this.f5101OooO00o = progressBar;
    }

    public void OooO00o(AttributeSet attributeSet, int i) {
        o0000O0 o0000o0OooOOo = o0000O0.OooOOo(this.f5101OooO00o.getContext(), attributeSet, f5100OooO0OO, i);
        Drawable drawableOooO0oo = o0000o0OooOOo.OooO0oo(0);
        if (drawableOooO0oo != null) {
            ProgressBar progressBar = this.f5101OooO00o;
            if (drawableOooO0oo instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableOooO0oo;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableOooO0O0 = OooO0O0(animationDrawable.getFrame(i2), true);
                    drawableOooO0O0.setLevel(ResponseInfo.UnknownError);
                    animationDrawable2.addFrame(drawableOooO0O0, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(ResponseInfo.UnknownError);
                drawableOooO0oo = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(drawableOooO0oo);
        }
        Drawable drawableOooO0oo2 = o0000o0OooOOo.OooO0oo(1);
        if (drawableOooO0oo2 != null) {
            this.f5101OooO00o.setProgressDrawable(OooO0O0(drawableOooO0oo2, false));
        }
        o0000o0OooOOo.OooOOoo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    public final Drawable OooO0O0(Drawable drawable, boolean z) {
        if (drawable instanceof p084o000Ooo.o0OO00O) {
            p084o000Ooo.o0OO00O o0oo00o2 = (p084o000Ooo.o0OO00O) drawable;
            Drawable drawableOooO0O0 = o0oo00o2.OooO0O0();
            if (drawableOooO0O0 != null) {
                o0oo00o2.OooO00o(OooO0O0(drawableOooO0O0, z));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = OooO0O0(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    if (Build.VERSION.SDK_INT >= 23) {
                        OooO00o.OooO00o(layerDrawable, layerDrawable2, i2);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f5102OooO0O0 == null) {
                    this.f5102OooO0O0 = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
