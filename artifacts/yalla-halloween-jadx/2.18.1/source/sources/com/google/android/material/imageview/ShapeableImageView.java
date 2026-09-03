package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OooO0O0;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import o0OOO0O.OooO0OO;
import p012OooOo0.OooOO0O;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;
import p347o0OOO0o0.o00000;
import p352o0OOOOoO.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public class ShapeableImageView extends AppCompatImageView implements o00000 {

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public static final int f17151Oooooo = Oooo000.Widget_MaterialComponents_ShapeableImageView;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final OooO0O0 f17152Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final Paint f17153OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final RectF f17154OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final RectF f17155OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final Paint f17156OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final Path f17157OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f17158OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public com.google.android.material.shape.OooO00o f17159OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @Dimension
    public float f17160OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public Path f17161OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Dimension
    public int f17162OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Dimension
    public int f17163Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Dimension
    public int f17164Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Dimension
    public int f17165OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Dimension
    public int f17166OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @Dimension
    public int f17167OooooOo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f17168Oooooo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public ColorStateList f17169o000oOoO;

    @TargetApi(21)
    public class OooO00o extends ViewOutlineProvider {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Rect f17170OooO00o = new Rect();

        public OooO00o() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ShapeableImageView shapeableImageView = ShapeableImageView.this;
            if (shapeableImageView.f17159OoooOOo == null) {
                return;
            }
            if (shapeableImageView.f17158OoooOOO == null) {
                shapeableImageView.f17158OoooOOO = new MaterialShapeDrawable(ShapeableImageView.this.f17159OoooOOo);
            }
            ShapeableImageView.this.f17155OoooO00.round(this.f17170OooO00o);
            ShapeableImageView.this.f17158OoooOOO.setBounds(this.f17170OooO00o);
            ShapeableImageView.this.f17158OoooOOO.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    public final boolean OooO0OO() {
        return (this.f17166OooooOO == Integer.MIN_VALUE && this.f17167OooooOo == Integer.MIN_VALUE) ? false : true;
    }

    public final boolean OooO0Oo() {
        return getLayoutDirection() == 1;
    }

    public final void OooO0o0(int i, int i2) {
        this.f17155OoooO00.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        this.f17152Oooo.OooO00o(this.f17159OoooOOo, 1.0f, this.f17155OoooO00, this.f17157OoooOO0);
        this.f17161OoooOoO.rewind();
        this.f17161OoooOoO.addPath(this.f17157OoooOO0);
        this.f17154OoooO0.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, i, i2);
        this.f17161OoooOoO.addRect(this.f17154OoooO0, Path.Direction.CCW);
    }

    @Dimension
    public int getContentPaddingBottom() {
        return this.f17165OooooO0;
    }

    @Dimension
    public final int getContentPaddingEnd() {
        int i = this.f17167OooooOo;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return OooO0Oo() ? this.f17162OoooOoo : this.f17164Ooooo0o;
    }

    @Dimension
    public int getContentPaddingLeft() {
        int i;
        int i2;
        if (OooO0OO()) {
            if (OooO0Oo() && (i2 = this.f17167OooooOo) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!OooO0Oo() && (i = this.f17166OooooOO) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f17162OoooOoo;
    }

    @Dimension
    public int getContentPaddingRight() {
        int i;
        int i2;
        if (OooO0OO()) {
            if (OooO0Oo() && (i2 = this.f17166OooooOO) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!OooO0Oo() && (i = this.f17167OooooOo) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f17164Ooooo0o;
    }

    @Dimension
    public final int getContentPaddingStart() {
        int i = this.f17166OooooOO;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return OooO0Oo() ? this.f17164Ooooo0o : this.f17162OoooOoo;
    }

    @Dimension
    public int getContentPaddingTop() {
        return this.f17163Ooooo00;
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @NonNull
    public com.google.android.material.shape.OooO00o getShapeAppearanceModel() {
        return this.f17159OoooOOo;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.f17169o000oOoO;
    }

    @Dimension
    public float getStrokeWidth() {
        return this.f17160OoooOo0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        setLayerType(0, null);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f17161OoooOoO, this.f17153OoooO);
        if (this.f17169o000oOoO == null) {
            return;
        }
        this.f17156OoooO0O.setStrokeWidth(this.f17160OoooOo0);
        int colorForState = this.f17169o000oOoO.getColorForState(getDrawableState(), this.f17169o000oOoO.getDefaultColor());
        if (this.f17160OoooOo0 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || colorForState == 0) {
            return;
        }
        this.f17156OoooO0O.setColor(colorForState);
        canvas.drawPath(this.f17157OoooOO0, this.f17156OoooO0O);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f17168Oooooo0 && isLayoutDirectionResolved()) {
            this.f17168Oooooo0 = true;
            if (isPaddingRelative() || OooO0OO()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        OooO0o0(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(@Dimension int i, @Dimension int i2, @Dimension int i3, @Dimension int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    @Override // android.view.View
    public final void setPaddingRelative(@Dimension int i, @Dimension int i2, @Dimension int i3, @Dimension int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    @Override // p347o0OOO0o0.o00000
    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.OooO00o oooO00o) {
        this.f17159OoooOOo = oooO00o;
        MaterialShapeDrawable materialShapeDrawable = this.f17158OoooOOO;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(oooO00o);
        }
        OooO0o0(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        this.f17169o000oOoO = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@ColorRes int i) {
        setStrokeColor(OooOO0O.OooO00o(getContext(), i));
    }

    public void setStrokeWidth(@Dimension float f) {
        if (this.f17160OoooOo0 != f) {
            this.f17160OoooOo0 = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(@DimenRes int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = f17151Oooooo;
        super(OooOOO0.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f17152Oooo = OooO0O0.OooO00o.f17591OooO00o;
        this.f17157OoooOO0 = new Path();
        this.f17168Oooooo0 = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f17153OoooO = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f17155OoooO00 = new RectF();
        this.f17154OoooO0 = new RectF();
        this.f17161OoooOoO = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, Oooo0.ShapeableImageView, i, i2);
        this.f17169o000oOoO = OooO0OO.OooO00o(context2, typedArrayObtainStyledAttributes, Oooo0.ShapeableImageView_strokeColor);
        this.f17160OoooOo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(Oooo0.ShapeableImageView_strokeWidth, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(Oooo0.ShapeableImageView_contentPadding, 0);
        this.f17162OoooOoo = dimensionPixelSize;
        this.f17163Ooooo00 = dimensionPixelSize;
        this.f17164Ooooo0o = dimensionPixelSize;
        this.f17165OooooO0 = dimensionPixelSize;
        this.f17162OoooOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(Oooo0.ShapeableImageView_contentPaddingLeft, dimensionPixelSize);
        this.f17163Ooooo00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(Oooo0.ShapeableImageView_contentPaddingTop, dimensionPixelSize);
        this.f17164Ooooo0o = typedArrayObtainStyledAttributes.getDimensionPixelSize(Oooo0.ShapeableImageView_contentPaddingRight, dimensionPixelSize);
        this.f17165OooooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(Oooo0.ShapeableImageView_contentPaddingBottom, dimensionPixelSize);
        this.f17166OooooOO = typedArrayObtainStyledAttributes.getDimensionPixelSize(Oooo0.ShapeableImageView_contentPaddingStart, Integer.MIN_VALUE);
        this.f17167OooooOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(Oooo0.ShapeableImageView_contentPaddingEnd, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f17156OoooO0O = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f17159OoooOOo = com.google.android.material.shape.OooO00o.OooO0OO(context2, attributeSet, i, i2).OooO00o();
        setOutlineProvider(new OooO00o());
    }
}
