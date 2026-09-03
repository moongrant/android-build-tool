package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import o0O000o0.OooO;
import p280o0O00o0O.o000oOoO;
import p280o0O00o0O.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
public class MaskableFrameLayout extends FrameLayout implements o0O000o0.OooO0O0, o0OoOo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final /* synthetic */ int f16142OooO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f16143OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public com.google.android.material.shape.OooO0O0 f16144OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final RectF f16145OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO00o f16146OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Boolean f16147OooO0oo;

    public static abstract class OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public com.google.android.material.shape.OooO0O0 f16149OooO0O0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f16148OooO00o = false;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public RectF f16150OooO0OO = new RectF();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Path f16151OooO0Oo = new Path();

        public abstract void OooO00o(View view);

        public abstract boolean OooO0O0();
    }

    @RequiresApi(22)
    public static class OooO0O0 extends OooO00o {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f16152OooO0o0 = false;

        public class OooO00o extends ViewOutlineProvider {
            public OooO00o() {
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                OooO0O0 oooO0O0 = OooO0O0.this;
                if (oooO0O0.f16149OooO0O0 == null || oooO0O0.f16150OooO0OO.isEmpty()) {
                    return;
                }
                RectF rectF = oooO0O0.f16150OooO0OO;
                int i = (int) rectF.left;
                int i2 = (int) rectF.top;
                int i3 = (int) rectF.right;
                int i4 = (int) rectF.bottom;
                com.google.android.material.shape.OooO0O0 oooO0O1 = oooO0O0.f16149OooO0O0;
                oooO0O0.getClass();
                outline.setRoundRect(i, i2, i3, i4, oooO0O1.f17155OooO0o.OooO00o(rectF));
            }
        }

        public OooO0O0(View view) {
            OooO0OO(view);
        }

        @DoNotInline
        private void OooO0OO(View view) {
            view.setOutlineProvider(new OooO00o());
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.OooO00o
        public final void OooO00o(View view) {
            com.google.android.material.shape.OooO0O0 oooO0O0;
            if (!this.f16150OooO0OO.isEmpty() && (oooO0O0 = this.f16149OooO0O0) != null) {
                this.f16152OooO0o0 = oooO0O0.OooO0o(this.f16150OooO0OO);
            }
            view.setClipToOutline(!OooO0O0());
            if (OooO0O0()) {
                view.invalidate();
            } else {
                view.invalidateOutline();
            }
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.OooO00o
        public final boolean OooO0O0() {
            return !this.f16152OooO0o0 || this.f16148OooO00o;
        }
    }

    @RequiresApi(33)
    public static class OooO0OO extends OooO00o {

        public class OooO00o extends ViewOutlineProvider {
            public OooO00o() {
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                OooO0OO oooO0OO = OooO0OO.this;
                if (oooO0OO.f16151OooO0Oo.isEmpty()) {
                    return;
                }
                outline.setPath(oooO0OO.f16151OooO0Oo);
            }
        }

        public OooO0OO(View view) {
            OooO0OO(view);
        }

        @DoNotInline
        private void OooO0OO(View view) {
            view.setOutlineProvider(new OooO00o());
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.OooO00o
        public final void OooO00o(View view) {
            view.setClipToOutline(!this.f16148OooO00o);
            if (this.f16148OooO00o) {
                view.invalidate();
            } else {
                view.invalidateOutline();
            }
        }

        @Override // com.google.android.material.carousel.MaskableFrameLayout.OooO00o
        public final boolean OooO0O0() {
            return this.f16148OooO00o;
        }
    }

    public MaskableFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public final void OooO0O0() {
        com.google.android.material.shape.OooO0O0 oooO0O0;
        if (getWidth() == 0) {
            return;
        }
        float fOooO00o = o0O000.OooO0O0.OooO00o(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.f16143OooO0Oo);
        RectF rectF = this.f16145OooO0o0;
        rectF.set(fOooO00o, 0.0f, getWidth() - fOooO00o, getHeight());
        OooO00o oooO00o = this.f16146OooO0oO;
        oooO00o.f16150OooO0OO = rectF;
        if (!rectF.isEmpty() && (oooO0O0 = oooO00o.f16149OooO0O0) != null) {
            o000oOoO.OooO00o.f41085OooO00o.OooO00o(oooO0O0, 1.0f, oooO00o.f16150OooO0OO, null, oooO00o.f16151OooO0Oo);
        }
        oooO00o.OooO00o(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        OooO00o oooO00o = this.f16146OooO0oO;
        if (oooO00o.OooO0O0()) {
            Path path = oooO00o.f16151OooO0Oo;
            if (!path.isEmpty()) {
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            }
        }
        super.dispatchDraw(canvas);
    }

    @NonNull
    public RectF getMaskRectF() {
        return this.f16145OooO0o0;
    }

    public float getMaskXPercentage() {
        return this.f16143OooO0Oo;
    }

    @NonNull
    public com.google.android.material.shape.OooO0O0 getShapeAppearanceModel() {
        return this.f16144OooO0o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.f16147OooO0oo;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            OooO00o oooO00o = this.f16146OooO0oO;
            if (zBooleanValue != oooO00o.f16148OooO00o) {
                oooO00o.f16148OooO00o = zBooleanValue;
                oooO00o.OooO00o(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        OooO00o oooO00o = this.f16146OooO0oO;
        this.f16147OooO0oo = Boolean.valueOf(oooO00o.f16148OooO00o);
        if (true != oooO00o.f16148OooO00o) {
            oooO00o.f16148OooO00o = true;
            oooO00o.OooO00o(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        OooO0O0();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        RectF rectF = this.f16145OooO0o0;
        if (rectF.isEmpty() || motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setForceCompatClipping(boolean z) {
        OooO00o oooO00o = this.f16146OooO0oO;
        if (z != oooO00o.f16148OooO00o) {
            oooO00o.f16148OooO00o = z;
            oooO00o.OooO00o(this);
        }
    }

    @Override // o0O000o0.OooO0O0
    public void setMaskXPercentage(float f) {
        float fOooO00o = o0000O00.OooO00o.OooO00o(f, 0.0f, 1.0f);
        if (this.f16143OooO0Oo != fOooO00o) {
            this.f16143OooO0Oo = fOooO00o;
            OooO0O0();
        }
    }

    public void setOnMaskChangedListener(@Nullable OooO oooO) {
    }

    @Override // p280o0O00o0O.o0OoOo0
    public void setShapeAppearanceModel(@NonNull com.google.android.material.shape.OooO0O0 oooO0O0) {
        com.google.android.material.shape.OooO0O0 oooO0O1;
        com.google.android.material.shape.OooO0O0 oooO0O0OooO0oo = oooO0O0.OooO0oo(new o0O000o0.OooO0OO());
        this.f16144OooO0o = oooO0O0OooO0oo;
        OooO00o oooO00o = this.f16146OooO0oO;
        oooO00o.f16149OooO0O0 = oooO0O0OooO0oo;
        if (!oooO00o.f16150OooO0OO.isEmpty() && (oooO0O1 = oooO00o.f16149OooO0O0) != null) {
            o000oOoO.OooO00o.f41085OooO00o.OooO00o(oooO0O1, 1.0f, oooO00o.f16150OooO0OO, null, oooO00o.f16151OooO0Oo);
        }
        oooO00o.OooO00o(this);
    }

    public MaskableFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        OooO00o oooO0O0;
        super(context, attributeSet, i);
        this.f16143OooO0Oo = 0.0f;
        this.f16145OooO0o0 = new RectF();
        if (Build.VERSION.SDK_INT >= 33) {
            oooO0O0 = new OooO0OO(this);
        } else {
            oooO0O0 = new OooO0O0(this);
        }
        this.f16146OooO0oO = oooO0O0;
        this.f16147OooO0oo = null;
        setShapeAppearanceModel(new com.google.android.material.shape.OooO0O0(com.google.android.material.shape.OooO0O0.OooO0OO(context, attributeSet, i, 0)));
    }
}
