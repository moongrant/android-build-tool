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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p012OooOo0.OooOO0O;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public OooO0OO f7379Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f7380OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Drawable f7381OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f7382OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public Drawable f7383OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public float f7384OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public Path f7385OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public ViewOutlineProvider f7386OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public RectF f7387OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public Drawable[] f7388OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public LayerDrawable f7389OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public float f7390Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public float f7391Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public float f7392OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public float f7393OooooOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public float f7394o000oOoO;

    public class OooO00o extends ViewOutlineProvider {
        public OooO00o() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            int width = ImageFilterView.this.getWidth();
            int height = ImageFilterView.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * ImageFilterView.this.f7384OoooOO0) / 2.0f);
        }
    }

    public class OooO0O0 extends ViewOutlineProvider {
        public OooO0O0() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f7394o000oOoO);
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float[] f7397OooO00o = new float[20];

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ColorMatrix f7398OooO0O0 = new ColorMatrix();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public ColorMatrix f7399OooO0OO = new ColorMatrix();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f7400OooO0Oo = 1.0f;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f7402OooO0o0 = 1.0f;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float f7401OooO0o = 1.0f;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f7403OooO0oO = 1.0f;

        public final void OooO00o(ImageView imageView) {
            float f;
            boolean z;
            float fLog;
            float fPow;
            float fLog2;
            this.f7398OooO0O0.reset();
            float f2 = this.f7402OooO0o0;
            boolean z2 = true;
            if (f2 != 1.0f) {
                float f3 = 1.0f - f2;
                float f4 = 0.2999f * f3;
                float f5 = 0.587f * f3;
                float f6 = f3 * 0.114f;
                float[] fArr = this.f7397OooO00o;
                fArr[0] = f4 + f2;
                fArr[1] = f5;
                fArr[2] = f6;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = f4;
                fArr[6] = f5 + f2;
                fArr[7] = f6;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = f4;
                fArr[11] = f5;
                fArr[12] = f6 + f2;
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                fArr[15] = 0.0f;
                fArr[16] = 0.0f;
                fArr[17] = 0.0f;
                f = 1.0f;
                fArr[18] = 1.0f;
                fArr[19] = 0.0f;
                this.f7398OooO0O0.set(fArr);
                z = true;
            } else {
                f = 1.0f;
                z = false;
            }
            float f7 = this.f7401OooO0o;
            if (f7 != f) {
                this.f7399OooO0OO.setScale(f7, f7, f7, f);
                this.f7398OooO0O0.postConcat(this.f7399OooO0OO);
                z = true;
            }
            float f8 = this.f7403OooO0oO;
            if (f8 != f) {
                if (f8 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
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
                    fLog2 = f9 > 19.0f ? (((float) Math.log(f9 - 10.0f)) * 138.51773f) - 305.0448f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                } else {
                    fLog2 = 255.0f;
                }
                float fMin = Math.min(255.0f, Math.max(fPow, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                float fMin2 = Math.min(255.0f, Math.max(fLog, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                float fMin3 = Math.min(255.0f, Math.max(fLog2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                float fLog3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
                float fLog4 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
                float fMin4 = Math.min(255.0f, Math.max(255.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                float fMin5 = Math.min(255.0f, Math.max(fLog3, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                float[] fArr2 = this.f7397OooO00o;
                fArr2[0] = fMin / fMin4;
                fArr2[1] = 0.0f;
                fArr2[2] = 0.0f;
                fArr2[3] = 0.0f;
                fArr2[4] = 0.0f;
                fArr2[5] = 0.0f;
                fArr2[6] = fMin2 / fMin5;
                fArr2[7] = 0.0f;
                fArr2[8] = 0.0f;
                fArr2[9] = 0.0f;
                fArr2[10] = 0.0f;
                fArr2[11] = 0.0f;
                fArr2[12] = fMin6;
                fArr2[13] = 0.0f;
                fArr2[14] = 0.0f;
                fArr2[15] = 0.0f;
                fArr2[16] = 0.0f;
                fArr2[17] = 0.0f;
                fArr2[18] = 1.0f;
                fArr2[19] = 0.0f;
                this.f7399OooO0OO.set(fArr2);
                this.f7398OooO0O0.postConcat(this.f7399OooO0OO);
                z = true;
            }
            float f10 = this.f7400OooO0Oo;
            if (f10 != 1.0f) {
                float[] fArr3 = this.f7397OooO00o;
                fArr3[0] = f10;
                fArr3[1] = 0.0f;
                fArr3[2] = 0.0f;
                fArr3[3] = 0.0f;
                fArr3[4] = 0.0f;
                fArr3[5] = 0.0f;
                fArr3[6] = f10;
                fArr3[7] = 0.0f;
                fArr3[8] = 0.0f;
                fArr3[9] = 0.0f;
                fArr3[10] = 0.0f;
                fArr3[11] = 0.0f;
                fArr3[12] = f10;
                fArr3[13] = 0.0f;
                fArr3[14] = 0.0f;
                fArr3[15] = 0.0f;
                fArr3[16] = 0.0f;
                fArr3[17] = 0.0f;
                fArr3[18] = 1.0f;
                fArr3[19] = 0.0f;
                this.f7399OooO0OO.set(fArr3);
                this.f7398OooO0O0.postConcat(this.f7399OooO0OO);
            } else {
                z2 = z;
            }
            if (z2) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f7398OooO0O0));
            } else {
                imageView.clearColorFilter();
            }
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        this.f7379Oooo = new OooO0OO();
        this.f7382OoooO00 = true;
        this.f7381OoooO0 = null;
        this.f7383OoooO0O = null;
        this.f7380OoooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7384OoooOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7394o000oOoO = Float.NaN;
        this.f7388OoooOoO = new Drawable[2];
        this.f7390Ooooo00 = Float.NaN;
        this.f7391Ooooo0o = Float.NaN;
        this.f7392OooooO0 = Float.NaN;
        this.f7393OooooOO = Float.NaN;
    }

    private void setOverlay(boolean z) {
        this.f7382OoooO00 = z;
    }

    public final void OooO0OO(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o000O00.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f7381OoooO0 = typedArrayObtainStyledAttributes.getDrawable(o000O00.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.ImageFilterView_crossfade) {
                    this.f7380OoooO = typedArrayObtainStyledAttributes.getFloat(index, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                } else if (index == o000O00.ImageFilterView_warmth) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                } else if (index == o000O00.ImageFilterView_saturation) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                } else if (index == o000O00.ImageFilterView_contrast) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                } else if (index == o000O00.ImageFilterView_brightness) {
                    setBrightness(typedArrayObtainStyledAttributes.getFloat(index, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                } else if (index == o000O00.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                } else if (index == o000O00.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                } else if (index == o000O00.ImageFilterView_overlay) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f7382OoooO00));
                } else if (index == o000O00.ImageFilterView_imagePanX) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.f7390Ooooo00));
                } else if (index == o000O00.ImageFilterView_imagePanY) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.f7391Ooooo0o));
                } else if (index == o000O00.ImageFilterView_imageRotate) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.f7393OooooOO));
                } else if (index == o000O00.ImageFilterView_imageZoom) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.f7392OooooO0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f7383OoooO0O = drawable;
            if (this.f7381OoooO0 == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f7383OoooO0O = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f7388OoooOoO;
                    Drawable drawableMutate = drawable2.mutate();
                    this.f7383OoooO0O = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f7388OoooOoO;
            Drawable drawableMutate2 = getDrawable().mutate();
            this.f7383OoooO0O = drawableMutate2;
            drawableArr2[0] = drawableMutate2;
            this.f7388OoooOoO[1] = this.f7381OoooO0.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f7388OoooOoO);
            this.f7389OoooOoo = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f7380OoooO * 255.0f));
            if (!this.f7382OoooO00) {
                this.f7389OoooOoo.getDrawable(0).setAlpha((int) ((1.0f - this.f7380OoooO) * 255.0f));
            }
            super.setImageDrawable(this.f7389OoooOoo);
        }
    }

    public final void OooO0Oo() {
        if (Float.isNaN(this.f7390Ooooo00) && Float.isNaN(this.f7391Ooooo0o) && Float.isNaN(this.f7392OooooO0) && Float.isNaN(this.f7393OooooOO)) {
            return;
        }
        boolean zIsNaN = Float.isNaN(this.f7390Ooooo00);
        float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float f2 = zIsNaN ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : this.f7390Ooooo00;
        float f3 = Float.isNaN(this.f7391Ooooo0o) ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : this.f7391Ooooo0o;
        float f4 = Float.isNaN(this.f7392OooooO0) ? 1.0f : this.f7392OooooO0;
        if (!Float.isNaN(this.f7393OooooOO)) {
            f = this.f7393OooooOO;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f5 = f4 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f5, f5);
        float f6 = intrinsicWidth * f5;
        float f7 = f5 * intrinsicHeight;
        matrix.postTranslate(((((width - f6) * f2) + width) - f6) * 0.5f, ((((height - f7) * f3) + height) - f7) * 0.5f);
        matrix.postRotate(f, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void OooO0o0() {
        if (Float.isNaN(this.f7390Ooooo00) && Float.isNaN(this.f7391Ooooo0o) && Float.isNaN(this.f7392OooooO0) && Float.isNaN(this.f7393OooooOO)) {
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
        return this.f7379Oooo.f7400OooO0Oo;
    }

    public float getContrast() {
        return this.f7379Oooo.f7401OooO0o;
    }

    public float getCrossfade() {
        return this.f7380OoooO;
    }

    public float getImagePanX() {
        return this.f7390Ooooo00;
    }

    public float getImagePanY() {
        return this.f7391Ooooo0o;
    }

    public float getImageRotate() {
        return this.f7393OooooOO;
    }

    public float getImageZoom() {
        return this.f7392OooooO0;
    }

    public float getRound() {
        return this.f7394o000oOoO;
    }

    public float getRoundPercent() {
        return this.f7384OoooOO0;
    }

    public float getSaturation() {
        return this.f7379Oooo.f7402OooO0o0;
    }

    public float getWarmth() {
        return this.f7379Oooo.f7403OooO0oO;
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        OooO0Oo();
    }

    public void setAltImageResource(int i) {
        Drawable drawableMutate = OooOO0O.OooO0O0(getContext(), i).mutate();
        this.f7381OoooO0 = drawableMutate;
        Drawable[] drawableArr = this.f7388OoooOoO;
        drawableArr[0] = this.f7383OoooO0O;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f7388OoooOoO);
        this.f7389OoooOoo = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f7380OoooO);
    }

    public void setBrightness(float f) {
        OooO0OO oooO0OO = this.f7379Oooo;
        oooO0OO.f7400OooO0Oo = f;
        oooO0OO.OooO00o(this);
    }

    public void setContrast(float f) {
        OooO0OO oooO0OO = this.f7379Oooo;
        oooO0OO.f7401OooO0o = f;
        oooO0OO.OooO00o(this);
    }

    public void setCrossfade(float f) {
        this.f7380OoooO = f;
        if (this.f7388OoooOoO != null) {
            if (!this.f7382OoooO00) {
                this.f7389OoooOoo.getDrawable(0).setAlpha((int) ((1.0f - this.f7380OoooO) * 255.0f));
            }
            this.f7389OoooOoo.getDrawable(1).setAlpha((int) (this.f7380OoooO * 255.0f));
            super.setImageDrawable(this.f7389OoooOoo);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f7381OoooO0 == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f7383OoooO0O = drawableMutate;
        Drawable[] drawableArr = this.f7388OoooOoO;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f7381OoooO0;
        LayerDrawable layerDrawable = new LayerDrawable(this.f7388OoooOoO);
        this.f7389OoooOoo = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f7380OoooO);
    }

    public void setImagePanX(float f) {
        this.f7390Ooooo00 = f;
        OooO0o0();
    }

    public void setImagePanY(float f) {
        this.f7391Ooooo0o = f;
        OooO0o0();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f7381OoooO0 == null) {
            super.setImageResource(i);
            return;
        }
        Drawable drawableMutate = OooOO0O.OooO0O0(getContext(), i).mutate();
        this.f7383OoooO0O = drawableMutate;
        Drawable[] drawableArr = this.f7388OoooOoO;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f7381OoooO0;
        LayerDrawable layerDrawable = new LayerDrawable(this.f7388OoooOoO);
        this.f7389OoooOoo = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f7380OoooO);
    }

    public void setImageRotate(float f) {
        this.f7393OooooOO = f;
        OooO0o0();
    }

    public void setImageZoom(float f) {
        this.f7392OooooO0 = f;
        OooO0o0();
    }

    @RequiresApi(21)
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f7394o000oOoO = f;
            float f2 = this.f7384OoooOO0;
            this.f7384OoooOO0 = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f7394o000oOoO != f;
        this.f7394o000oOoO = f;
        if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            if (this.f7385OoooOOO == null) {
                this.f7385OoooOOO = new Path();
            }
            if (this.f7387OoooOo0 == null) {
                this.f7387OoooOo0 = new RectF();
            }
            if (this.f7386OoooOOo == null) {
                OooO0O0 oooO0O0 = new OooO0O0();
                this.f7386OoooOOo = oooO0O0;
                setOutlineProvider(oooO0O0);
            }
            setClipToOutline(true);
            this.f7387OoooOo0.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, getWidth(), getHeight());
            this.f7385OoooOOO.reset();
            Path path = this.f7385OoooOOO;
            RectF rectF = this.f7387OoooOo0;
            float f3 = this.f7394o000oOoO;
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
        boolean z = this.f7384OoooOO0 != f;
        this.f7384OoooOO0 = f;
        if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            if (this.f7385OoooOOO == null) {
                this.f7385OoooOOO = new Path();
            }
            if (this.f7387OoooOo0 == null) {
                this.f7387OoooOo0 = new RectF();
            }
            if (this.f7386OoooOOo == null) {
                OooO00o oooO00o = new OooO00o();
                this.f7386OoooOOo = oooO00o;
                setOutlineProvider(oooO00o);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f7384OoooOO0) / 2.0f;
            this.f7387OoooOo0.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, width, height);
            this.f7385OoooOOO.reset();
            this.f7385OoooOOO.addRoundRect(this.f7387OoooOo0, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        OooO0OO oooO0OO = this.f7379Oooo;
        oooO0OO.f7402OooO0o0 = f;
        oooO0OO.OooO00o(this);
    }

    public void setWarmth(float f) {
        OooO0OO oooO0OO = this.f7379Oooo;
        oooO0OO.f7403OooO0oO = f;
        oooO0OO.OooO00o(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7379Oooo = new OooO0OO();
        this.f7382OoooO00 = true;
        this.f7381OoooO0 = null;
        this.f7383OoooO0O = null;
        this.f7380OoooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7384OoooOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7394o000oOoO = Float.NaN;
        this.f7388OoooOoO = new Drawable[2];
        this.f7390Ooooo00 = Float.NaN;
        this.f7391Ooooo0o = Float.NaN;
        this.f7392OooooO0 = Float.NaN;
        this.f7393OooooOO = Float.NaN;
        OooO0OO(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7379Oooo = new OooO0OO();
        this.f7382OoooO00 = true;
        this.f7381OoooO0 = null;
        this.f7383OoooO0O = null;
        this.f7380OoooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7384OoooOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7394o000oOoO = Float.NaN;
        this.f7388OoooOoO = new Drawable[2];
        this.f7390Ooooo00 = Float.NaN;
        this.f7391Ooooo0o = Float.NaN;
        this.f7392OooooO0 = Float.NaN;
        this.f7393OooooOO = Float.NaN;
        OooO0OO(context, attributeSet);
    }
}
