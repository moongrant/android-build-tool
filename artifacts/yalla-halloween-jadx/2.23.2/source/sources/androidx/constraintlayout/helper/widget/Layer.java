package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.OooO;

/* JADX INFO: loaded from: classes.dex */
public class Layer extends ConstraintHelper {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f4548OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f4549OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f4550OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public ConstraintLayout f4551OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f4552OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f4553OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f4554OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f4555OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final boolean f4556OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public float f4557OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f4558OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public float f4559OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public float f4560OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f4561OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public View[] f4562OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f4563OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f4564OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f4565OooOoo0;

    public Layer(Context context) {
        super(context);
        this.f4548OooOO0o = Float.NaN;
        this.f4550OooOOO0 = Float.NaN;
        this.f4549OooOOO = Float.NaN;
        this.f4552OooOOOo = 1.0f;
        this.f4554OooOOo0 = 1.0f;
        this.f4553OooOOo = Float.NaN;
        this.f4555OooOOoo = Float.NaN;
        this.f4558OooOo00 = Float.NaN;
        this.f4557OooOo0 = Float.NaN;
        this.f4559OooOo0O = Float.NaN;
        this.f4560OooOo0o = Float.NaN;
        this.f4556OooOo = true;
        this.f4562OooOoO0 = null;
        this.f4561OooOoO = 0.0f;
        this.f4563OooOoOO = 0.0f;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOO0(ConstraintLayout constraintLayout) {
        OooO(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOO(AttributeSet attributeSet) {
        super.OooOOO(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooO.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == OooO.ConstraintLayout_Layout_android_visibility) {
                    this.f4565OooOoo0 = true;
                } else if (index == OooO.ConstraintLayout_Layout_android_elevation) {
                    this.f4564OooOoo = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOo(ConstraintLayout constraintLayout) {
        this.f4551OooOOOO = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f4549OooOOO = rotation;
        } else {
            if (Float.isNaN(this.f4549OooOOO)) {
                return;
            }
            this.f4549OooOOO = rotation;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOo0() {
        OooOo0O();
        this.f4553OooOOo = Float.NaN;
        this.f4555OooOOoo = Float.NaN;
        ConstraintWidget constraintWidget = ((ConstraintLayout.LayoutParams) getLayoutParams()).f4994o00ooo;
        constraintWidget.o000oOoO(0);
        constraintWidget.OoooO00(0);
        OooOo0();
        layout(((int) this.f4559OooOo0O) - getPaddingLeft(), ((int) this.f4560OooOo0o) - getPaddingTop(), getPaddingRight() + ((int) this.f4558OooOo00), getPaddingBottom() + ((int) this.f4557OooOo0));
        OooOo0o();
    }

    public final void OooOo0() {
        if (this.f4551OooOOOO == null) {
            return;
        }
        if (this.f4556OooOo || Float.isNaN(this.f4553OooOOo) || Float.isNaN(this.f4555OooOOoo)) {
            if (!Float.isNaN(this.f4548OooOO0o) && !Float.isNaN(this.f4550OooOOO0)) {
                this.f4555OooOOoo = this.f4550OooOOO0;
                this.f4553OooOOo = this.f4548OooOO0o;
                return;
            }
            View[] viewArrOooOOO0 = OooOOO0(this.f4551OooOOOO);
            int left = viewArrOooOOO0[0].getLeft();
            int top = viewArrOooOOO0[0].getTop();
            int right = viewArrOooOOO0[0].getRight();
            int bottom = viewArrOooOOO0[0].getBottom();
            for (int i = 0; i < this.f4923OooO0o0; i++) {
                View view = viewArrOooOOO0[i];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f4558OooOo00 = right;
            this.f4557OooOo0 = bottom;
            this.f4559OooOo0O = left;
            this.f4560OooOo0o = top;
            if (Float.isNaN(this.f4548OooOO0o)) {
                this.f4553OooOOo = (left + right) / 2;
            } else {
                this.f4553OooOOo = this.f4548OooOO0o;
            }
            if (Float.isNaN(this.f4550OooOOO0)) {
                this.f4555OooOOoo = (top + bottom) / 2;
            } else {
                this.f4555OooOOoo = this.f4550OooOOO0;
            }
        }
    }

    public final void OooOo0O() {
        int i;
        if (this.f4551OooOOOO == null || (i = this.f4923OooO0o0) == 0) {
            return;
        }
        View[] viewArr = this.f4562OooOoO0;
        if (viewArr == null || viewArr.length != i) {
            this.f4562OooOoO0 = new View[i];
        }
        for (int i2 = 0; i2 < this.f4923OooO0o0; i2++) {
            this.f4562OooOoO0[i2] = this.f4551OooOOOO.getViewById(this.f4921OooO0Oo[i2]);
        }
    }

    public final void OooOo0o() {
        if (this.f4551OooOOOO == null) {
            return;
        }
        if (this.f4562OooOoO0 == null) {
            OooOo0O();
        }
        OooOo0();
        double radians = Float.isNaN(this.f4549OooOOO) ? 0.0d : Math.toRadians(this.f4549OooOOO);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f = this.f4552OooOOOo;
        float f2 = f * fCos;
        float f3 = this.f4554OooOOo0;
        float f4 = (-f3) * fSin;
        float f5 = f * fSin;
        float f6 = f3 * fCos;
        for (int i = 0; i < this.f4923OooO0o0; i++) {
            View view = this.f4562OooOoO0[i];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f7 = right - this.f4553OooOOo;
            float f8 = bottom - this.f4555OooOOoo;
            float f9 = (((f4 * f8) + (f2 * f7)) - f7) + this.f4561OooOoO;
            float f10 = (((f6 * f8) + (f7 * f5)) - f8) + this.f4563OooOoOO;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            view.setScaleY(this.f4554OooOOo0);
            view.setScaleX(this.f4552OooOOOo);
            if (!Float.isNaN(this.f4549OooOOO)) {
                view.setRotation(this.f4549OooOOO);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4551OooOOOO = (ConstraintLayout) getParent();
        if (this.f4565OooOoo0 || this.f4564OooOoo) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f4923OooO0o0; i++) {
                View viewById = this.f4551OooOOOO.getViewById(this.f4921OooO0Oo[i]);
                if (viewById != null) {
                    if (this.f4565OooOoo0) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f4564OooOoo && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        OooO0oo();
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        this.f4548OooOO0o = f;
        OooOo0o();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.f4550OooOOO0 = f;
        OooOo0o();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.f4549OooOOO = f;
        OooOo0o();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.f4552OooOOOo = f;
        OooOo0o();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.f4554OooOOo0 = f;
        OooOo0o();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.f4561OooOoO = f;
        OooOo0o();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.f4563OooOoOO = f;
        OooOo0o();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        OooO0oo();
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4548OooOO0o = Float.NaN;
        this.f4550OooOOO0 = Float.NaN;
        this.f4549OooOOO = Float.NaN;
        this.f4552OooOOOo = 1.0f;
        this.f4554OooOOo0 = 1.0f;
        this.f4553OooOOo = Float.NaN;
        this.f4555OooOOoo = Float.NaN;
        this.f4558OooOo00 = Float.NaN;
        this.f4557OooOo0 = Float.NaN;
        this.f4559OooOo0O = Float.NaN;
        this.f4560OooOo0o = Float.NaN;
        this.f4556OooOo = true;
        this.f4562OooOoO0 = null;
        this.f4561OooOoO = 0.0f;
        this.f4563OooOoOO = 0.0f;
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4548OooOO0o = Float.NaN;
        this.f4550OooOOO0 = Float.NaN;
        this.f4549OooOOO = Float.NaN;
        this.f4552OooOOOo = 1.0f;
        this.f4554OooOOo0 = 1.0f;
        this.f4553OooOOo = Float.NaN;
        this.f4555OooOOoo = Float.NaN;
        this.f4558OooOo00 = Float.NaN;
        this.f4557OooOo0 = Float.NaN;
        this.f4559OooOo0O = Float.NaN;
        this.f4560OooOo0o = Float.NaN;
        this.f4556OooOo = true;
        this.f4562OooOoO0 = null;
        this.f4561OooOoO = 0.0f;
        this.f4563OooOoOO = 0.0f;
    }
}
