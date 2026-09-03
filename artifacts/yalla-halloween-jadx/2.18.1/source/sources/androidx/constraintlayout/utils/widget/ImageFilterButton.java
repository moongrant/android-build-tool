package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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
import androidx.appcompat.widget.AppCompatImageButton;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p012OooOo0.OooOO0O;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ImageFilterView.OooO0OO f7361Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public Path f7362OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float f7363OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f7364OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public float f7365OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public ViewOutlineProvider f7366OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public Drawable[] f7367OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public LayerDrawable f7368OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f7369OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public Drawable f7370OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public Drawable f7371OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public float f7372Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public float f7373Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public float f7374OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public float f7375OooooOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public RectF f7376o000oOoO;

    public class OooO00o extends ViewOutlineProvider {
        public OooO00o() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            int width = ImageFilterButton.this.getWidth();
            int height = ImageFilterButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * ImageFilterButton.this.f7363OoooO0) / 2.0f);
        }
    }

    public class OooO0O0 extends ViewOutlineProvider {
        public OooO0O0() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f7365OoooO0O);
        }
    }

    public ImageFilterButton(Context context) {
        super(context);
        this.f7361Oooo = new ImageFilterView.OooO0OO();
        this.f7364OoooO00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7363OoooO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7365OoooO0O = Float.NaN;
        this.f7367OoooOOO = new Drawable[2];
        this.f7369OoooOo0 = true;
        this.f7370OoooOoO = null;
        this.f7371OoooOoo = null;
        this.f7372Ooooo00 = Float.NaN;
        this.f7373Ooooo0o = Float.NaN;
        this.f7374OooooO0 = Float.NaN;
        this.f7375OooooOO = Float.NaN;
        OooO00o(context, null);
    }

    private void setOverlay(boolean z) {
        this.f7369OoooOo0 = z;
    }

    public final void OooO00o(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o000O00.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f7370OoooOoO = typedArrayObtainStyledAttributes.getDrawable(o000O00.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.ImageFilterView_crossfade) {
                    this.f7364OoooO00 = typedArrayObtainStyledAttributes.getFloat(index, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                } else if (index == o000O00.ImageFilterView_warmth) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                } else if (index == o000O00.ImageFilterView_saturation) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                } else if (index == o000O00.ImageFilterView_contrast) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                } else if (index == o000O00.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                } else if (index == o000O00.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                } else if (index == o000O00.ImageFilterView_overlay) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f7369OoooOo0));
                } else if (index == o000O00.ImageFilterView_imagePanX) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.f7372Ooooo00));
                } else if (index == o000O00.ImageFilterView_imagePanY) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.f7373Ooooo0o));
                } else if (index == o000O00.ImageFilterView_imageRotate) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.f7375OooooOO));
                } else if (index == o000O00.ImageFilterView_imageZoom) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.f7374OooooO0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f7371OoooOoo = drawable;
            if (this.f7370OoooOoO == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f7371OoooOoo = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f7367OoooOOO;
                    Drawable drawableMutate = drawable2.mutate();
                    this.f7371OoooOoo = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f7367OoooOOO;
            Drawable drawableMutate2 = getDrawable().mutate();
            this.f7371OoooOoo = drawableMutate2;
            drawableArr2[0] = drawableMutate2;
            this.f7367OoooOOO[1] = this.f7370OoooOoO.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f7367OoooOOO);
            this.f7368OoooOOo = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f7364OoooO00 * 255.0f));
            if (!this.f7369OoooOo0) {
                this.f7368OoooOOo.getDrawable(0).setAlpha((int) ((1.0f - this.f7364OoooO00) * 255.0f));
            }
            super.setImageDrawable(this.f7368OoooOOo);
        }
    }

    public final void OooO0O0() {
        if (Float.isNaN(this.f7372Ooooo00) && Float.isNaN(this.f7373Ooooo0o) && Float.isNaN(this.f7374OooooO0) && Float.isNaN(this.f7375OooooOO)) {
            return;
        }
        boolean zIsNaN = Float.isNaN(this.f7372Ooooo00);
        float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float f2 = zIsNaN ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : this.f7372Ooooo00;
        float f3 = Float.isNaN(this.f7373Ooooo0o) ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : this.f7373Ooooo0o;
        float f4 = Float.isNaN(this.f7374OooooO0) ? 1.0f : this.f7374OooooO0;
        if (!Float.isNaN(this.f7375OooooOO)) {
            f = this.f7375OooooOO;
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

    public final void OooO0OO() {
        if (Float.isNaN(this.f7372Ooooo00) && Float.isNaN(this.f7373Ooooo0o) && Float.isNaN(this.f7374OooooO0) && Float.isNaN(this.f7375OooooOO)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            OooO0O0();
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getContrast() {
        return this.f7361Oooo.f7401OooO0o;
    }

    public float getCrossfade() {
        return this.f7364OoooO00;
    }

    public float getImagePanX() {
        return this.f7372Ooooo00;
    }

    public float getImagePanY() {
        return this.f7373Ooooo0o;
    }

    public float getImageRotate() {
        return this.f7375OooooOO;
    }

    public float getImageZoom() {
        return this.f7374OooooO0;
    }

    public float getRound() {
        return this.f7365OoooO0O;
    }

    public float getRoundPercent() {
        return this.f7363OoooO0;
    }

    public float getSaturation() {
        return this.f7361Oooo.f7402OooO0o0;
    }

    public float getWarmth() {
        return this.f7361Oooo.f7403OooO0oO;
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        OooO0O0();
    }

    public void setAltImageResource(int i) {
        Drawable drawableMutate = OooOO0O.OooO0O0(getContext(), i).mutate();
        this.f7370OoooOoO = drawableMutate;
        Drawable[] drawableArr = this.f7367OoooOOO;
        drawableArr[0] = this.f7371OoooOoo;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f7367OoooOOO);
        this.f7368OoooOOo = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f7364OoooO00);
    }

    public void setBrightness(float f) {
        ImageFilterView.OooO0OO oooO0OO = this.f7361Oooo;
        oooO0OO.f7400OooO0Oo = f;
        oooO0OO.OooO00o(this);
    }

    public void setContrast(float f) {
        ImageFilterView.OooO0OO oooO0OO = this.f7361Oooo;
        oooO0OO.f7401OooO0o = f;
        oooO0OO.OooO00o(this);
    }

    public void setCrossfade(float f) {
        this.f7364OoooO00 = f;
        if (this.f7367OoooOOO != null) {
            if (!this.f7369OoooOo0) {
                this.f7368OoooOOo.getDrawable(0).setAlpha((int) ((1.0f - this.f7364OoooO00) * 255.0f));
            }
            this.f7368OoooOOo.getDrawable(1).setAlpha((int) (this.f7364OoooO00 * 255.0f));
            super.setImageDrawable(this.f7368OoooOOo);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f7370OoooOoO == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f7371OoooOoo = drawableMutate;
        Drawable[] drawableArr = this.f7367OoooOOO;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f7370OoooOoO;
        LayerDrawable layerDrawable = new LayerDrawable(this.f7367OoooOOO);
        this.f7368OoooOOo = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f7364OoooO00);
    }

    public void setImagePanX(float f) {
        this.f7372Ooooo00 = f;
        OooO0OO();
    }

    public void setImagePanY(float f) {
        this.f7373Ooooo0o = f;
        OooO0OO();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f7370OoooOoO == null) {
            super.setImageResource(i);
            return;
        }
        Drawable drawableMutate = OooOO0O.OooO0O0(getContext(), i).mutate();
        this.f7371OoooOoo = drawableMutate;
        Drawable[] drawableArr = this.f7367OoooOOO;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f7370OoooOoO;
        LayerDrawable layerDrawable = new LayerDrawable(this.f7367OoooOOO);
        this.f7368OoooOOo = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f7364OoooO00);
    }

    public void setImageRotate(float f) {
        this.f7375OooooOO = f;
        OooO0OO();
    }

    public void setImageZoom(float f) {
        this.f7374OooooO0 = f;
        OooO0OO();
    }

    @RequiresApi(21)
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f7365OoooO0O = f;
            float f2 = this.f7363OoooO0;
            this.f7363OoooO0 = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f7365OoooO0O != f;
        this.f7365OoooO0O = f;
        if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            if (this.f7362OoooO == null) {
                this.f7362OoooO = new Path();
            }
            if (this.f7376o000oOoO == null) {
                this.f7376o000oOoO = new RectF();
            }
            if (this.f7366OoooOO0 == null) {
                OooO0O0 oooO0O0 = new OooO0O0();
                this.f7366OoooOO0 = oooO0O0;
                setOutlineProvider(oooO0O0);
            }
            setClipToOutline(true);
            this.f7376o000oOoO.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, getWidth(), getHeight());
            this.f7362OoooO.reset();
            Path path = this.f7362OoooO;
            RectF rectF = this.f7376o000oOoO;
            float f3 = this.f7365OoooO0O;
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
        boolean z = this.f7363OoooO0 != f;
        this.f7363OoooO0 = f;
        if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            if (this.f7362OoooO == null) {
                this.f7362OoooO = new Path();
            }
            if (this.f7376o000oOoO == null) {
                this.f7376o000oOoO = new RectF();
            }
            if (this.f7366OoooOO0 == null) {
                OooO00o oooO00o = new OooO00o();
                this.f7366OoooOO0 = oooO00o;
                setOutlineProvider(oooO00o);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f7363OoooO0) / 2.0f;
            this.f7376o000oOoO.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, width, height);
            this.f7362OoooO.reset();
            this.f7362OoooO.addRoundRect(this.f7376o000oOoO, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        ImageFilterView.OooO0OO oooO0OO = this.f7361Oooo;
        oooO0OO.f7402OooO0o0 = f;
        oooO0OO.OooO00o(this);
    }

    public void setWarmth(float f) {
        ImageFilterView.OooO0OO oooO0OO = this.f7361Oooo;
        oooO0OO.f7403OooO0oO = f;
        oooO0OO.OooO00o(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7361Oooo = new ImageFilterView.OooO0OO();
        this.f7364OoooO00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7363OoooO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7365OoooO0O = Float.NaN;
        this.f7367OoooOOO = new Drawable[2];
        this.f7369OoooOo0 = true;
        this.f7370OoooOoO = null;
        this.f7371OoooOoo = null;
        this.f7372Ooooo00 = Float.NaN;
        this.f7373Ooooo0o = Float.NaN;
        this.f7374OooooO0 = Float.NaN;
        this.f7375OooooOO = Float.NaN;
        OooO00o(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7361Oooo = new ImageFilterView.OooO0OO();
        this.f7364OoooO00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7363OoooO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7365OoooO0O = Float.NaN;
        this.f7367OoooOOO = new Drawable[2];
        this.f7369OoooOo0 = true;
        this.f7370OoooOoO = null;
        this.f7371OoooOoo = null;
        this.f7372Ooooo00 = Float.NaN;
        this.f7373Ooooo0o = Float.NaN;
        this.f7374OooooO0 = Float.NaN;
        this.f7375OooooOO = Float.NaN;
        OooO00o(context, attributeSet);
    }
}
