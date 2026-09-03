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
import androidx.constraintlayout.widget.OooO;
import p013OooOo0o.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f4786OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ImageFilterView.OooO0OO f4787OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f4788OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f4789OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Path f4790OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public ViewOutlineProvider f4791OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Drawable[] f4792OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public RectF f4793OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public LayerDrawable f4794OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f4795OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public Drawable f4796OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public Drawable f4797OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f4798OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public float f4799OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f4800OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public float f4801OooOo0O;

    public class OooO00o extends ViewOutlineProvider {
        public OooO00o() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ImageFilterButton imageFilterButton = ImageFilterButton.this;
            int width = imageFilterButton.getWidth();
            int height = imageFilterButton.getHeight();
            outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * imageFilterButton.f4786OooO) / 2.0f);
        }
    }

    public class OooO0O0 extends ViewOutlineProvider {
        public OooO0O0() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ImageFilterButton imageFilterButton = ImageFilterButton.this;
            outline.setRoundRect(0, 0, imageFilterButton.getWidth(), imageFilterButton.getHeight(), imageFilterButton.f4789OooOO0);
        }
    }

    public ImageFilterButton(Context context) {
        super(context);
        this.f4787OooO0oO = new ImageFilterView.OooO0OO();
        this.f4788OooO0oo = 0.0f;
        this.f4786OooO = 0.0f;
        this.f4789OooOO0 = Float.NaN;
        this.f4792OooOOO = new Drawable[2];
        this.f4795OooOOOo = true;
        this.f4797OooOOo0 = null;
        this.f4796OooOOo = null;
        this.f4798OooOOoo = Float.NaN;
        this.f4800OooOo00 = Float.NaN;
        this.f4799OooOo0 = Float.NaN;
        this.f4801OooOo0O = Float.NaN;
        OooO00o(context, null);
    }

    private void setOverlay(boolean z) {
        this.f4795OooOOOo = z;
    }

    public final void OooO00o(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooO.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.f4797OooOOo0 = typedArrayObtainStyledAttributes.getDrawable(OooO.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == OooO.ImageFilterView_crossfade) {
                    this.f4788OooO0oo = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == OooO.ImageFilterView_warmth) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == OooO.ImageFilterView_saturation) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == OooO.ImageFilterView_contrast) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == OooO.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == OooO.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == OooO.ImageFilterView_overlay) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f4795OooOOOo));
                } else if (index == OooO.ImageFilterView_imagePanX) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.f4798OooOOoo));
                } else if (index == OooO.ImageFilterView_imagePanY) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.f4800OooOo00));
                } else if (index == OooO.ImageFilterView_imageRotate) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.f4801OooOo0O));
                } else if (index == OooO.ImageFilterView_imageZoom) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.f4799OooOo0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f4796OooOOo = drawable;
            Drawable drawable2 = this.f4797OooOOo0;
            Drawable[] drawableArr = this.f4792OooOOO;
            if (drawable2 == null || drawable == null) {
                Drawable drawable3 = getDrawable();
                this.f4796OooOOo = drawable3;
                if (drawable3 != null) {
                    Drawable drawableMutate = drawable3.mutate();
                    this.f4796OooOOo = drawableMutate;
                    drawableArr[0] = drawableMutate;
                    return;
                }
                return;
            }
            Drawable drawableMutate2 = getDrawable().mutate();
            this.f4796OooOOo = drawableMutate2;
            drawableArr[0] = drawableMutate2;
            drawableArr[1] = this.f4797OooOOo0.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.f4794OooOOOO = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f4788OooO0oo * 255.0f));
            if (!this.f4795OooOOOo) {
                this.f4794OooOOOO.getDrawable(0).setAlpha((int) ((1.0f - this.f4788OooO0oo) * 255.0f));
            }
            super.setImageDrawable(this.f4794OooOOOO);
        }
    }

    public final void OooO0O0() {
        if (Float.isNaN(this.f4798OooOOoo) && Float.isNaN(this.f4800OooOo00) && Float.isNaN(this.f4799OooOo0) && Float.isNaN(this.f4801OooOo0O)) {
            return;
        }
        float f = Float.isNaN(this.f4798OooOOoo) ? 0.0f : this.f4798OooOOoo;
        float f2 = Float.isNaN(this.f4800OooOo00) ? 0.0f : this.f4800OooOo00;
        float f3 = Float.isNaN(this.f4799OooOo0) ? 1.0f : this.f4799OooOo0;
        float f4 = Float.isNaN(this.f4801OooOo0O) ? 0.0f : this.f4801OooOo0O;
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

    public final void OooO0OO() {
        if (Float.isNaN(this.f4798OooOOoo) && Float.isNaN(this.f4800OooOo00) && Float.isNaN(this.f4799OooOo0) && Float.isNaN(this.f4801OooOo0O)) {
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
        return this.f4787OooO0oO.f4826OooO0o;
    }

    public float getCrossfade() {
        return this.f4788OooO0oo;
    }

    public float getImagePanX() {
        return this.f4798OooOOoo;
    }

    public float getImagePanY() {
        return this.f4800OooOo00;
    }

    public float getImageRotate() {
        return this.f4801OooOo0O;
    }

    public float getImageZoom() {
        return this.f4799OooOo0;
    }

    public float getRound() {
        return this.f4789OooOO0;
    }

    public float getRoundPercent() {
        return this.f4786OooO;
    }

    public float getSaturation() {
        return this.f4787OooO0oO.f4827OooO0o0;
    }

    public float getWarmth() {
        return this.f4787OooO0oO.f4828OooO0oO;
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        OooO0O0();
    }

    public void setAltImageResource(int i) {
        Drawable drawableMutate = o00Oo0.OooO00o(getContext(), i).mutate();
        this.f4797OooOOo0 = drawableMutate;
        Drawable drawable = this.f4796OooOOo;
        Drawable[] drawableArr = this.f4792OooOOO;
        drawableArr[0] = drawable;
        drawableArr[1] = drawableMutate;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f4794OooOOOO = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f4788OooO0oo);
    }

    public void setBrightness(float f) {
        ImageFilterView.OooO0OO oooO0OO = this.f4787OooO0oO;
        oooO0OO.f4825OooO0Oo = f;
        oooO0OO.OooO00o(this);
    }

    public void setContrast(float f) {
        ImageFilterView.OooO0OO oooO0OO = this.f4787OooO0oO;
        oooO0OO.f4826OooO0o = f;
        oooO0OO.OooO00o(this);
    }

    public void setCrossfade(float f) {
        this.f4788OooO0oo = f;
        if (this.f4792OooOOO != null) {
            if (!this.f4795OooOOOo) {
                this.f4794OooOOOO.getDrawable(0).setAlpha((int) ((1.0f - this.f4788OooO0oo) * 255.0f));
            }
            this.f4794OooOOOO.getDrawable(1).setAlpha((int) (this.f4788OooO0oo * 255.0f));
            super.setImageDrawable(this.f4794OooOOOO);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f4797OooOOo0 == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f4796OooOOo = drawableMutate;
        Drawable[] drawableArr = this.f4792OooOOO;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f4797OooOOo0;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f4794OooOOOO = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f4788OooO0oo);
    }

    public void setImagePanX(float f) {
        this.f4798OooOOoo = f;
        OooO0OO();
    }

    public void setImagePanY(float f) {
        this.f4800OooOo00 = f;
        OooO0OO();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i) {
        if (this.f4797OooOOo0 == null) {
            super.setImageResource(i);
            return;
        }
        Drawable drawableMutate = o00Oo0.OooO00o(getContext(), i).mutate();
        this.f4796OooOOo = drawableMutate;
        Drawable[] drawableArr = this.f4792OooOOO;
        drawableArr[0] = drawableMutate;
        drawableArr[1] = this.f4797OooOOo0;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f4794OooOOOO = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f4788OooO0oo);
    }

    public void setImageRotate(float f) {
        this.f4801OooOo0O = f;
        OooO0OO();
    }

    public void setImageZoom(float f) {
        this.f4799OooOo0 = f;
        OooO0OO();
    }

    @RequiresApi(21)
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f4789OooOO0 = f;
            float f2 = this.f4786OooO;
            this.f4786OooO = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f4789OooOO0 != f;
        this.f4789OooOO0 = f;
        if (f != 0.0f) {
            if (this.f4790OooOO0O == null) {
                this.f4790OooOO0O = new Path();
            }
            if (this.f4793OooOOO0 == null) {
                this.f4793OooOOO0 = new RectF();
            }
            if (this.f4791OooOO0o == null) {
                OooO0O0 oooO0O0 = new OooO0O0();
                this.f4791OooOO0o = oooO0O0;
                setOutlineProvider(oooO0O0);
            }
            setClipToOutline(true);
            this.f4793OooOOO0.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f4790OooOO0O.reset();
            Path path = this.f4790OooOO0O;
            RectF rectF = this.f4793OooOOO0;
            float f3 = this.f4789OooOO0;
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
        boolean z = this.f4786OooO != f;
        this.f4786OooO = f;
        if (f != 0.0f) {
            if (this.f4790OooOO0O == null) {
                this.f4790OooOO0O = new Path();
            }
            if (this.f4793OooOOO0 == null) {
                this.f4793OooOOO0 = new RectF();
            }
            if (this.f4791OooOO0o == null) {
                OooO00o oooO00o = new OooO00o();
                this.f4791OooOO0o = oooO00o;
                setOutlineProvider(oooO00o);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f4786OooO) / 2.0f;
            this.f4793OooOOO0.set(0.0f, 0.0f, width, height);
            this.f4790OooOO0O.reset();
            this.f4790OooOO0O.addRoundRect(this.f4793OooOOO0, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        ImageFilterView.OooO0OO oooO0OO = this.f4787OooO0oO;
        oooO0OO.f4827OooO0o0 = f;
        oooO0OO.OooO00o(this);
    }

    public void setWarmth(float f) {
        ImageFilterView.OooO0OO oooO0OO = this.f4787OooO0oO;
        oooO0OO.f4828OooO0oO = f;
        oooO0OO.OooO00o(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4787OooO0oO = new ImageFilterView.OooO0OO();
        this.f4788OooO0oo = 0.0f;
        this.f4786OooO = 0.0f;
        this.f4789OooOO0 = Float.NaN;
        this.f4792OooOOO = new Drawable[2];
        this.f4795OooOOOo = true;
        this.f4797OooOOo0 = null;
        this.f4796OooOOo = null;
        this.f4798OooOOoo = Float.NaN;
        this.f4800OooOo00 = Float.NaN;
        this.f4799OooOo0 = Float.NaN;
        this.f4801OooOo0O = Float.NaN;
        OooO00o(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4787OooO0oO = new ImageFilterView.OooO0OO();
        this.f4788OooO0oo = 0.0f;
        this.f4786OooO = 0.0f;
        this.f4789OooOO0 = Float.NaN;
        this.f4792OooOOO = new Drawable[2];
        this.f4795OooOOOo = true;
        this.f4797OooOOo0 = null;
        this.f4796OooOOo = null;
        this.f4798OooOOoo = Float.NaN;
        this.f4800OooOo00 = Float.NaN;
        this.f4799OooOo0 = Float.NaN;
        this.f4801OooOo0O = Float.NaN;
        OooO00o(context, attributeSet);
    }
}
