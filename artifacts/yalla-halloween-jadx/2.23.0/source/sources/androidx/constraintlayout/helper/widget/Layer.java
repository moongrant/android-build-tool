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
    public float f4542OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f4543OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f4544OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public ConstraintLayout f4545OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f4546OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f4547OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f4548OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f4549OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final boolean f4550OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public float f4551OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f4552OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public float f4553OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public float f4554OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f4555OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public View[] f4556OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f4557OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f4558OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f4559OooOoo0;

    public Layer(Context context) {
        super(context);
        this.f4542OooOO0o = Float.NaN;
        this.f4544OooOOO0 = Float.NaN;
        this.f4543OooOOO = Float.NaN;
        this.f4546OooOOOo = 1.0f;
        this.f4548OooOOo0 = 1.0f;
        this.f4547OooOOo = Float.NaN;
        this.f4549OooOOoo = Float.NaN;
        this.f4552OooOo00 = Float.NaN;
        this.f4551OooOo0 = Float.NaN;
        this.f4553OooOo0O = Float.NaN;
        this.f4554OooOo0o = Float.NaN;
        this.f4550OooOo = true;
        this.f4556OooOoO0 = null;
        this.f4555OooOoO = 0.0f;
        this.f4557OooOoOO = 0.0f;
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
                    this.f4559OooOoo0 = true;
                } else if (index == OooO.ConstraintLayout_Layout_android_elevation) {
                    this.f4558OooOoo = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOo(ConstraintLayout constraintLayout) {
        this.f4545OooOOOO = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f4543OooOOO = rotation;
        } else {
            if (Float.isNaN(this.f4543OooOOO)) {
                return;
            }
            this.f4543OooOOO = rotation;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOo0() {
        OooOo0O();
        this.f4547OooOOo = Float.NaN;
        this.f4549OooOOoo = Float.NaN;
        ConstraintWidget constraintWidget = ((ConstraintLayout.LayoutParams) getLayoutParams()).f4988o00ooo;
        constraintWidget.o000oOoO(0);
        constraintWidget.OoooO00(0);
        OooOo0();
        layout(((int) this.f4553OooOo0O) - getPaddingLeft(), ((int) this.f4554OooOo0o) - getPaddingTop(), getPaddingRight() + ((int) this.f4552OooOo00), getPaddingBottom() + ((int) this.f4551OooOo0));
        OooOo0o();
    }

    public final void OooOo0() {
        if (this.f4545OooOOOO == null) {
            return;
        }
        if (this.f4550OooOo || Float.isNaN(this.f4547OooOOo) || Float.isNaN(this.f4549OooOOoo)) {
            if (!Float.isNaN(this.f4542OooOO0o) && !Float.isNaN(this.f4544OooOOO0)) {
                this.f4549OooOOoo = this.f4544OooOOO0;
                this.f4547OooOOo = this.f4542OooOO0o;
                return;
            }
            View[] viewArrOooOOO0 = OooOOO0(this.f4545OooOOOO);
            int left = viewArrOooOOO0[0].getLeft();
            int top = viewArrOooOOO0[0].getTop();
            int right = viewArrOooOOO0[0].getRight();
            int bottom = viewArrOooOOO0[0].getBottom();
            for (int i = 0; i < this.f4917OooO0o0; i++) {
                View view = viewArrOooOOO0[i];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f4552OooOo00 = right;
            this.f4551OooOo0 = bottom;
            this.f4553OooOo0O = left;
            this.f4554OooOo0o = top;
            if (Float.isNaN(this.f4542OooOO0o)) {
                this.f4547OooOOo = (left + right) / 2;
            } else {
                this.f4547OooOOo = this.f4542OooOO0o;
            }
            if (Float.isNaN(this.f4544OooOOO0)) {
                this.f4549OooOOoo = (top + bottom) / 2;
            } else {
                this.f4549OooOOoo = this.f4544OooOOO0;
            }
        }
    }

    public final void OooOo0O() {
        int i;
        if (this.f4545OooOOOO == null || (i = this.f4917OooO0o0) == 0) {
            return;
        }
        View[] viewArr = this.f4556OooOoO0;
        if (viewArr == null || viewArr.length != i) {
            this.f4556OooOoO0 = new View[i];
        }
        for (int i2 = 0; i2 < this.f4917OooO0o0; i2++) {
            this.f4556OooOoO0[i2] = this.f4545OooOOOO.getViewById(this.f4915OooO0Oo[i2]);
        }
    }

    public final void OooOo0o() {
        if (this.f4545OooOOOO == null) {
            return;
        }
        if (this.f4556OooOoO0 == null) {
            OooOo0O();
        }
        OooOo0();
        double radians = Float.isNaN(this.f4543OooOOO) ? 0.0d : Math.toRadians(this.f4543OooOOO);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f = this.f4546OooOOOo;
        float f2 = f * fCos;
        float f3 = this.f4548OooOOo0;
        float f4 = (-f3) * fSin;
        float f5 = f * fSin;
        float f6 = f3 * fCos;
        for (int i = 0; i < this.f4917OooO0o0; i++) {
            View view = this.f4556OooOoO0[i];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f7 = right - this.f4547OooOOo;
            float f8 = bottom - this.f4549OooOOoo;
            float f9 = (((f4 * f8) + (f2 * f7)) - f7) + this.f4555OooOoO;
            float f10 = (((f6 * f8) + (f7 * f5)) - f8) + this.f4557OooOoOO;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            view.setScaleY(this.f4548OooOOo0);
            view.setScaleX(this.f4546OooOOOo);
            if (!Float.isNaN(this.f4543OooOOO)) {
                view.setRotation(this.f4543OooOOO);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4545OooOOOO = (ConstraintLayout) getParent();
        if (this.f4559OooOoo0 || this.f4558OooOoo) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f4917OooO0o0; i++) {
                View viewById = this.f4545OooOOOO.getViewById(this.f4915OooO0Oo[i]);
                if (viewById != null) {
                    if (this.f4559OooOoo0) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f4558OooOoo && elevation > 0.0f) {
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
        this.f4542OooOO0o = f;
        OooOo0o();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.f4544OooOOO0 = f;
        OooOo0o();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.f4543OooOOO = f;
        OooOo0o();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.f4546OooOOOo = f;
        OooOo0o();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.f4548OooOOo0 = f;
        OooOo0o();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.f4555OooOoO = f;
        OooOo0o();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.f4557OooOoOO = f;
        OooOo0o();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        OooO0oo();
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4542OooOO0o = Float.NaN;
        this.f4544OooOOO0 = Float.NaN;
        this.f4543OooOOO = Float.NaN;
        this.f4546OooOOOo = 1.0f;
        this.f4548OooOOo0 = 1.0f;
        this.f4547OooOOo = Float.NaN;
        this.f4549OooOOoo = Float.NaN;
        this.f4552OooOo00 = Float.NaN;
        this.f4551OooOo0 = Float.NaN;
        this.f4553OooOo0O = Float.NaN;
        this.f4554OooOo0o = Float.NaN;
        this.f4550OooOo = true;
        this.f4556OooOoO0 = null;
        this.f4555OooOoO = 0.0f;
        this.f4557OooOoOO = 0.0f;
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4542OooOO0o = Float.NaN;
        this.f4544OooOOO0 = Float.NaN;
        this.f4543OooOOO = Float.NaN;
        this.f4546OooOOOo = 1.0f;
        this.f4548OooOOo0 = 1.0f;
        this.f4547OooOOo = Float.NaN;
        this.f4549OooOOoo = Float.NaN;
        this.f4552OooOo00 = Float.NaN;
        this.f4551OooOo0 = Float.NaN;
        this.f4553OooOo0O = Float.NaN;
        this.f4554OooOo0o = Float.NaN;
        this.f4550OooOo = true;
        this.f4556OooOoO0 = null;
        this.f4555OooOoO = 0.0f;
        this.f4557OooOoOO = 0.0f;
    }
}
