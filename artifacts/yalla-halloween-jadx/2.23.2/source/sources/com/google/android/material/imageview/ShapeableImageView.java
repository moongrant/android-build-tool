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
import androidx.core.content.ContextCompat;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.OooO0O0;
import p272o0O0000o.o0000O0O;
import p272o0O0000o.o000OO;
import p276o0O00OoO.OooO0o;
import p280o0O00o0O.o000oOoO;
import p280o0O00o0O.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public class ShapeableImageView extends AppCompatImageView implements o0OoOo0 {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final int f16636OooOo0O = o0000O0O.Widget_MaterialComponents_ShapeableImageView;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Path f16637OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000oOoO f16638OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final RectF f16639OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final RectF f16640OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Paint f16641OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Paint f16642OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public ColorStateList f16643OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f16644OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public OooO0O0 f16645OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Path f16646OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Dimension
    public float f16647OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Dimension
    public final int f16648OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Dimension
    public final int f16649OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Dimension
    public final int f16650OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Dimension
    public final int f16651OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Dimension
    public final int f16652OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f16653OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Dimension
    public final int f16654OooOo00;

    @TargetApi(21)
    public class OooO00o extends ViewOutlineProvider {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Rect f16655OooO00o = new Rect();

        public OooO00o() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ShapeableImageView shapeableImageView = ShapeableImageView.this;
            if (shapeableImageView.f16645OooOO0o == null) {
                return;
            }
            if (shapeableImageView.f16644OooOO0O == null) {
                shapeableImageView.f16644OooOO0O = new MaterialShapeDrawable(shapeableImageView.f16645OooOO0o);
            }
            RectF rectF = shapeableImageView.f16640OooO0o0;
            Rect rect = this.f16655OooO00o;
            rectF.round(rect);
            shapeableImageView.f16644OooOO0O.setBounds(rect);
            shapeableImageView.f16644OooOO0O.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    public final boolean OooO0OO() {
        return getLayoutDirection() == 1;
    }

    public final void OooO0Oo(int i, int i2) {
        RectF rectF = this.f16640OooO0o0;
        rectF.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
        OooO0O0 oooO0O0 = this.f16645OooOO0o;
        Path path = this.f16637OooO;
        this.f16638OooO0Oo.OooO00o(oooO0O0, 1.0f, rectF, null, path);
        Path path2 = this.f16646OooOOO;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.f16639OooO0o;
        rectF2.set(0.0f, 0.0f, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    @Dimension
    public int getContentPaddingBottom() {
        return this.f16650OooOOo;
    }

    @Dimension
    public final int getContentPaddingEnd() {
        int i = this.f16654OooOo00;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return OooO0OO() ? this.f16648OooOOOO : this.f16651OooOOo0;
    }

    @Dimension
    public int getContentPaddingLeft() {
        int i = this.f16654OooOo00;
        int i2 = this.f16652OooOOoo;
        if ((i2 == Integer.MIN_VALUE && i == Integer.MIN_VALUE) ? false : true) {
            if (OooO0OO() && i != Integer.MIN_VALUE) {
                return i;
            }
            if (!OooO0OO() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.f16648OooOOOO;
    }

    @Dimension
    public int getContentPaddingRight() {
        int i = this.f16654OooOo00;
        int i2 = this.f16652OooOOoo;
        if ((i2 == Integer.MIN_VALUE && i == Integer.MIN_VALUE) ? false : true) {
            if (OooO0OO() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (!OooO0OO() && i != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f16651OooOOo0;
    }

    @Dimension
    public final int getContentPaddingStart() {
        int i = this.f16652OooOOoo;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return OooO0OO() ? this.f16651OooOOo0 : this.f16648OooOOOO;
    }

    @Dimension
    public int getContentPaddingTop() {
        return this.f16649OooOOOo;
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
    public OooO0O0 getShapeAppearanceModel() {
        return this.f16645OooOO0o;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.f16643OooOO0;
    }

    @Dimension
    public float getStrokeWidth() {
        return this.f16647OooOOO0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f16646OooOOO, this.f16642OooO0oo);
        if (this.f16643OooOO0 == null) {
            return;
        }
        Paint paint = this.f16641OooO0oO;
        paint.setStrokeWidth(this.f16647OooOOO0);
        int colorForState = this.f16643OooOO0.getColorForState(getDrawableState(), this.f16643OooOO0.getDefaultColor());
        if (this.f16647OooOOO0 <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.f16637OooO, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f16653OooOo0 && isLayoutDirectionResolved()) {
            boolean z = true;
            this.f16653OooOo0 = true;
            if (!isPaddingRelative()) {
                if (this.f16652OooOOoo == Integer.MIN_VALUE && this.f16654OooOo00 == Integer.MIN_VALUE) {
                    z = false;
                }
                if (!z) {
                    setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
                    return;
                }
            }
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        OooO0Oo(i, i2);
    }

    @Override // android.view.View
    public final void setPadding(@Dimension int i, @Dimension int i2, @Dimension int i3, @Dimension int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    @Override // android.view.View
    public final void setPaddingRelative(@Dimension int i, @Dimension int i2, @Dimension int i3, @Dimension int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    @Override // p280o0O00o0O.o0OoOo0
    public void setShapeAppearanceModel(@NonNull OooO0O0 oooO0O0) {
        this.f16645OooOO0o = oooO0O0;
        MaterialShapeDrawable materialShapeDrawable = this.f16644OooOO0O;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(oooO0O0);
        }
        OooO0Oo(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        this.f16643OooOO0 = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@ColorRes int i) {
        setStrokeColor(ContextCompat.OooO0O0(i, getContext()));
    }

    public void setStrokeWidth(@Dimension float f) {
        if (this.f16647OooOOO0 != f) {
            this.f16647OooOOO0 = f;
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
        int i2 = f16636OooOo0O;
        super(o0O0O0O.OooO00o.OooO00o(context, attributeSet, i, i2), attributeSet, i);
        this.f16638OooO0Oo = o000oOoO.OooO00o.f41085OooO00o;
        this.f16637OooO = new Path();
        this.f16653OooOo0 = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f16642OooO0oo = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f16640OooO0o0 = new RectF();
        this.f16639OooO0o = new RectF();
        this.f16646OooOOO = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, o000OO.ShapeableImageView, i, i2);
        setLayerType(2, null);
        this.f16643OooOO0 = OooO0o.OooO00o(context2, typedArrayObtainStyledAttributes, o000OO.ShapeableImageView_strokeColor);
        this.f16647OooOOO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000OO.ShapeableImageView_strokeWidth, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000OO.ShapeableImageView_contentPadding, 0);
        this.f16648OooOOOO = dimensionPixelSize;
        this.f16649OooOOOo = dimensionPixelSize;
        this.f16651OooOOo0 = dimensionPixelSize;
        this.f16650OooOOo = dimensionPixelSize;
        this.f16648OooOOOO = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000OO.ShapeableImageView_contentPaddingLeft, dimensionPixelSize);
        this.f16649OooOOOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000OO.ShapeableImageView_contentPaddingTop, dimensionPixelSize);
        this.f16651OooOOo0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000OO.ShapeableImageView_contentPaddingRight, dimensionPixelSize);
        this.f16650OooOOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000OO.ShapeableImageView_contentPaddingBottom, dimensionPixelSize);
        this.f16652OooOOoo = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000OO.ShapeableImageView_contentPaddingStart, Integer.MIN_VALUE);
        this.f16654OooOo00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000OO.ShapeableImageView_contentPaddingEnd, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f16641OooO0oO = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f16645OooOO0o = new OooO0O0(OooO0O0.OooO0OO(context2, attributeSet, i, i2));
        setOutlineProvider(new OooO00o());
    }
}
