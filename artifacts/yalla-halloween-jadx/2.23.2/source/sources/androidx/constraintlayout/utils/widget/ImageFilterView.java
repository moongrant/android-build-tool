package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.OooO;
import p013OooOo0o.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f4810OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO f4811OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Drawable f4812OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f4813OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Drawable f4814OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f4815OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f4816OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Path f4817OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public ViewOutlineProvider f4818OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Drawable[] f4819OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public RectF f4820OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public LayerDrawable f4821OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f4822OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f4823OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f4824OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f4825OooOOoo;

    public class OooO00o extends ViewOutlineProvider {
        public OooO00o() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ImageFilterView imageFilterView = ImageFilterView.this;
            int width = imageFilterView.getWidth();
            int height = imageFilterView.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * imageFilterView.f4810OooO) / 2.0f);
        }
    }

    public class OooO0O0 extends ViewOutlineProvider {
        public OooO0O0() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ImageFilterView imageFilterView = ImageFilterView.this;
            outline.setRoundRect(0, 0, imageFilterView.getWidth(), imageFilterView.getHeight(), imageFilterView.f4816OooOO0);
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float[] f4828OooO00o = new float[20];

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ColorMatrix f4829OooO0O0 = new ColorMatrix();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ColorMatrix f4830OooO0OO = new ColorMatrix();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f4831OooO0Oo = 1.0f;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f4833OooO0o0 = 1.0f;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float f4832OooO0o = 1.0f;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f4834OooO0oO = 1.0f;

        public final void OooO00o(ImageView imageView) {
            boolean z;
            float fLog;
            float fPow;
            float fLog2;
            ColorMatrix colorMatrix = this.f4829OooO0O0;
            colorMatrix.reset();
            float f = this.f4833OooO0o0;
            float f2 = 1.0f;
            float[] fArr = this.f4828OooO00o;
            boolean z2 = true;
            if (f != 1.0f) {
                float f3 = 1.0f - f;
                float f4 = 0.2999f * f3;
                float f5 = 0.587f * f3;
                float f6 = f3 * 0.114f;
                fArr[0] = f4 + f;
                fArr[1] = f5;
                fArr[2] = f6;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = f4;
                fArr[6] = f5 + f;
                fArr[7] = f6;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = f4;
                fArr[11] = f5;
                fArr[12] = f6 + f;
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                fArr[15] = 0.0f;
                fArr[16] = 0.0f;
                fArr[17] = 0.0f;
                fArr[18] = 1.0f;
                fArr[19] = 0.0f;
                colorMatrix.set(fArr);
                z = true;
            } else {
                z = false;
            }
            float f7 = this.f4832OooO0o;
            ColorMatrix colorMatrix2 = this.f4830OooO0OO;
            if (f7 != 1.0f) {
                colorMatrix2.setScale(f7, f7, f7, 1.0f);
                colorMatrix.postConcat(colorMatrix2);
                z = true;
            }
            float f8 = this.f4834OooO0oO;
            if (f8 != 1.0f) {
                if (f8 <= 0.0f) {
                    f8 = 0.01f;
                }
                float f9 = (5000.0f / f8) / 100.0f;
                if (f9 > 66.0f) {
                    double d = f9 - 60.0f;
                    fPow = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                    fLog = ((float) Math.pow(d, 0.07551484555006027d)) * 288.12216f;
                } else {
                    fLog = (((float) Math.log(f9)) * 99.4708f) - 161.11957f;
                    fPow = 255.0f;
                }
                if (f9 < 66.0f) {
                    fLog2 = f9 > 19.0f ? (((float) Math.log(f9 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f;
                } else {
                    fLog2 = 255.0f;
                }
                float fMin = Math.min(255.0f, Math.max(fPow, 0.0f));
                float fMin2 = Math.min(255.0f, Math.max(fLog, 0.0f));
                float fMin3 = Math.min(255.0f, Math.max(fLog2, 0.0f));
                float fLog3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
                float fLog4 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
                float fMin4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
                float fMin5 = Math.min(255.0f, Math.max(fLog3, 0.0f));
                float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, 0.0f));
                fArr[0] = fMin / fMin4;
                fArr[1] = 0.0f;
                fArr[2] = 0.0f;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = 0.0f;
                fArr[6] = fMin2 / fMin5;
                fArr[7] = 0.0f;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = 0.0f;
                fArr[11] = 0.0f;
                fArr[12] = fMin6;
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                fArr[15] = 0.0f;
                fArr[16] = 0.0f;
                fArr[17] = 0.0f;
                f2 = 1.0f;
                fArr[18] = 1.0f;
                fArr[19] = 0.0f;
                colorMatrix2.set(fArr);
                colorMatrix.postConcat(colorMatrix2);
                z = true;
            }
            float f10 = this.f4831OooO0Oo;
            if (f10 != f2) {
                fArr[0] = f10;
                fArr[1] = 0.0f;
                fArr[2] = 0.0f;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = 0.0f;
                fArr[6] = f10;
                fArr[7] = 0.0f;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = 0.0f;
                fArr[11] = 0.0f;
                fArr[12] = f10;
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                fArr[15] = 0.0f;
                fArr[16] = 0.0f;
                fArr[17] = 0.0f;
                fArr[18] = 1.0f;
                fArr[19] = 0.0f;
                colorMatrix2.set(fArr);
                colorMatrix.postConcat(colorMatrix2);
            } else {
                z2 = z;
            }
            if (z2) {
                imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            } else {
                imageView.clearColorFilter();
            }
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        this.f4811OooO0Oo = new OooO0OO();
        this.f4813OooO0o0 = true;
        this.f4812OooO0o = null;
        this.f4814OooO0oO = null;
        this.f4815OooO0oo = 0.0f;
        this.f4810OooO = 0.0f;
        this.f4816OooOO0 = Float.NaN;
        this.f4819OooOOO = new Drawable[2];
        this.f4822OooOOOo = Float.NaN;
        this.f4824OooOOo0 = Float.NaN;
        this.f4823OooOOo = Float.NaN;
        this.f4825OooOOoo = Float.NaN;
    }

    private void setOverlay(boolean z) {
        this.f4813OooO0o0 = z;
    }

    public final void OooO0OO(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooO.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f4812OooO0o = typedArrayObtainStyledAttributes.getDrawable(OooO.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == OooO.ImageFilterView_crossfade) {
                    this.f4815OooO0oo = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == OooO.ImageFilterView_warmth) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == OooO.ImageFilterView_saturation) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == OooO.ImageFilterView_contrast) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == OooO.ImageFilterView_brightness) {
                    setBrightness(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == OooO.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == OooO.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == OooO.ImageFilterView_overlay) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f4813OooO0o0));
                } else if (index == OooO.ImageFilterView_imagePanX) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.f4822OooOOOo));
                } else if (index == OooO.ImageFilterView_imagePanY) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.f4824OooOOo0));
                } else if (index == OooO.ImageFilterView_imageRotate) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.f4825OooOOoo));
                } else if (index == OooO.ImageFilterView_imageZoom) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.f4823OooOOo));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f4814OooO0oO = drawable;
            Drawable drawable2 = this.f4812OooO0o;
            Drawable[] drawableArr = this.f4819OooOOO;
            if (drawable2 == null || drawable == null) {
                Drawable drawable3 = getDrawable();
                this.f4814OooO0oO = drawable3;
                if (drawable3 != null) {
                    Drawable drawableMutate = drawable3.mutate();
                    this.f4814OooO0oO = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable drawableMutate2 = getDrawable().mutate();
            this.f4814OooO0oO = drawableMutate2;
            drawableArr[0] = drawableMutate2;
            drawableArr[1] = this.f4812OooO0o.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.f4821OooOOOO = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f4815OooO0oo * 255.0f));
            if (!this.f4813OooO0o0) {
                this.f4821OooOOOO.getDrawable(0).setAlpha((int) ((1.0f - this.f4815OooO0oo) * 255.0f));
            }
            super.setImageDrawable(this.f4821OooOOOO);
        }
    }

    public final void OooO0Oo() {
        if (Float.isNaN(this.f4822OooOOOo) && Float.isNaN(this.f4824OooOOo0) && Float.isNaN(this.f4823OooOOo) && Float.isNaN(this.f4825OooOOoo)) {
            return;
        }
        float f = Float.isNaN(this.f4822OooOOOo) ? 0.0f : this.f4822OooOOOo;
        float f2 = Float.isNaN(this.f4824OooOOo0) ? 0.0f : this.f4824OooOOo0;
        float f3 = Float.isNaN(this.f4823OooOOo) ? 1.0f : this.f4823OooOOo;
        float f4 = Float.isNaN(this.f4825OooOOoo) ? 0.0f : this.f4825OooOOoo;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f5 = f3 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f5, f5);
        float f6 = intrinsicWidth * f5;
        float f7 = f5 * intrinsicHeight;
        matrix.postTranslate(((((width - f6) * f) + width) - f6) * 0.5f, ((((height - f7) * f2) + height) - f7) * 0.5f);
        matrix.postRotate(f4, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void OooO0o0() {
        if (Float.isNaN(this.f4822OooOOOo) && Float.isNaN(this.f4824OooOOo0) && Float.isNaN(this.f4823OooOOo) && Float.isNaN(this.f4825OooOOoo)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            OooO0Oo();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getBrightness() {
        return this.f4811OooO0Oo.f4831OooO0Oo;
    }

    public float getContrast() {
        return this.f4811OooO0Oo.f4832OooO0o;
    }

    public float getCrossfade() {
        return this.f4815OooO0oo;
    }

    public float getImagePanX() {
        return this.f4822OooOOOo;
    }

    public float getImagePanY() {
        return this.f4824OooOOo0;
    }

    public float getImageRotate() {
        return this.f4825OooOOoo;
    }

    public float getImageZoom() {
        return this.f4823OooOOo;
    }

    public float getRound() {
        return this.f4816OooOO0;
    }

    public float getRoundPercent() {
        return this.f4810OooO;
    }

    public float getSaturation() {
        return this.f4811OooO0Oo.f4833OooO0o0;
    }

    public float getWarmth() {
        return this.f4811OooO0Oo.f4834OooO0oO;
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        OooO0Oo();
    }

    public void setAltImageResource(int i) {
        Drawable drawableMutate = o00Oo0.OooO00o(getContext(), i).mutate();
        this.f4812OooO0o = drawableMutate;
        Drawable drawable = this.f4814OooO0oO;
        Drawable[] drawableArr = this.f4819OooOOO;
        drawableArr[0] = drawable;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f4821OooOOOO = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f4815OooO0oo);
    }

    public void setBrightness(float f) {
        OooO0OO oooO0OO = this.f4811OooO0Oo;
        oooO0OO.f4831OooO0Oo = f;
        oooO0OO.OooO00o(this);
    }

    public void setContrast(float f) {
        OooO0OO oooO0OO = this.f4811OooO0Oo;
        oooO0OO.f4832OooO0o = f;
        oooO0OO.OooO00o(this);
    }

    public void setCrossfade(float f) {
        this.f4815OooO0oo = f;
        if (this.f4819OooOOO != null) {
            if (!this.f4813OooO0o0) {
                this.f4821OooOOOO.getDrawable(0).setAlpha((int) ((1.0f - this.f4815OooO0oo) * 255.0f));
            }
            this.f4821OooOOOO.getDrawable(1).setAlpha((int) (this.f4815OooO0oo * 255.0f));
            super.setImageDrawable(this.f4821OooOOOO);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f4812OooO0o == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f4814OooO0oO = drawableMutate;
        Drawable[] drawableArr = this.f4819OooOOO;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f4812OooO0o;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f4821OooOOOO = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f4815OooO0oo);
    }

    public void setImagePanX(float f) {
        this.f4822OooOOOo = f;
        OooO0o0();
    }

    public void setImagePanY(float f) {
        this.f4824OooOOo0 = f;
        OooO0o0();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f4812OooO0o == null) {
            super.setImageResource(i);
            return;
        }
        Drawable drawableMutate = o00Oo0.OooO00o(getContext(), i).mutate();
        this.f4814OooO0oO = drawableMutate;
        Drawable[] drawableArr = this.f4819OooOOO;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f4812OooO0o;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f4821OooOOOO = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f4815OooO0oo);
    }

    public void setImageRotate(float f) {
        this.f4825OooOOoo = f;
        OooO0o0();
    }

    public void setImageZoom(float f) {
        this.f4823OooOOo = f;
        OooO0o0();
    }

    @RequiresApi(21)
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f4816OooOO0 = f;
            float f2 = this.f4810OooO;
            this.f4810OooO = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f4816OooOO0 != f;
        this.f4816OooOO0 = f;
        if (f != 0.0f) {
            if (this.f4817OooOO0O == null) {
                this.f4817OooOO0O = new Path();
            }
            if (this.f4820OooOOO0 == null) {
                this.f4820OooOOO0 = new RectF();
            }
            if (this.f4818OooOO0o == null) {
                OooO0O0 oooO0O0 = new OooO0O0();
                this.f4818OooOO0o = oooO0O0;
                setOutlineProvider(oooO0O0);
            }
            setClipToOutline(true);
            this.f4820OooOOO0.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f4817OooOO0O.reset();
            Path path = this.f4817OooOO0O;
            RectF rectF = this.f4820OooOOO0;
            float f3 = this.f4816OooOO0;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @RequiresApi(21)
    public void setRoundPercent(float f) {
        boolean z = this.f4810OooO != f;
        this.f4810OooO = f;
        if (f != 0.0f) {
            if (this.f4817OooOO0O == null) {
                this.f4817OooOO0O = new Path();
            }
            if (this.f4820OooOOO0 == null) {
                this.f4820OooOOO0 = new RectF();
            }
            if (this.f4818OooOO0o == null) {
                OooO00o oooO00o = new OooO00o();
                this.f4818OooOO0o = oooO00o;
                setOutlineProvider(oooO00o);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f4810OooO) / 2.0f;
            this.f4820OooOOO0.set(0.0f, 0.0f, width, height);
            this.f4817OooOO0O.reset();
            this.f4817OooOO0O.addRoundRect(this.f4820OooOOO0, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        OooO0OO oooO0OO = this.f4811OooO0Oo;
        oooO0OO.f4833OooO0o0 = f;
        oooO0OO.OooO00o(this);
    }

    public void setWarmth(float f) {
        OooO0OO oooO0OO = this.f4811OooO0Oo;
        oooO0OO.f4834OooO0oO = f;
        oooO0OO.OooO00o(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4811OooO0Oo = new OooO0OO();
        this.f4813OooO0o0 = true;
        this.f4812OooO0o = null;
        this.f4814OooO0oO = null;
        this.f4815OooO0oo = 0.0f;
        this.f4810OooO = 0.0f;
        this.f4816OooOO0 = Float.NaN;
        this.f4819OooOOO = new Drawable[2];
        this.f4822OooOOOo = Float.NaN;
        this.f4824OooOOo0 = Float.NaN;
        this.f4823OooOOo = Float.NaN;
        this.f4825OooOOoo = Float.NaN;
        OooO0OO(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4811OooO0Oo = new OooO0OO();
        this.f4813OooO0o0 = true;
        this.f4812OooO0o = null;
        this.f4814OooO0oO = null;
        this.f4815OooO0oo = 0.0f;
        this.f4810OooO = 0.0f;
        this.f4816OooOO0 = Float.NaN;
        this.f4819OooOOO = new Drawable[2];
        this.f4822OooOOOo = Float.NaN;
        this.f4824OooOOo0 = Float.NaN;
        this.f4823OooOOo = Float.NaN;
        this.f4825OooOOoo = Float.NaN;
        OooO0OO(context, attributeSet);
    }
}
