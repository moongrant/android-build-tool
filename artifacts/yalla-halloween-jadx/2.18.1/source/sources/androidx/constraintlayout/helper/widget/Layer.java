package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public class Layer extends ConstraintHelper {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public float f7116OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float f7117OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public ConstraintLayout f7118OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public float f7119OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public float f7120OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public float f7121OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public float f7122Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public float f7123Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public float f7124OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public float f7125OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public float f7126OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public View[] f7127Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f7128Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public float f7129OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public float f7130Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public float f7131o000oOoO;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f7132o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public boolean f7133ooOO;

    public Layer(Context context) {
        super(context);
        this.f7116OoooOO0 = Float.NaN;
        this.f7131o000oOoO = Float.NaN;
        this.f7117OoooOOO = Float.NaN;
        this.f7119OoooOo0 = 1.0f;
        this.f7120OoooOoO = 1.0f;
        this.f7121OoooOoo = Float.NaN;
        this.f7122Ooooo00 = Float.NaN;
        this.f7123Ooooo0o = Float.NaN;
        this.f7124OooooO0 = Float.NaN;
        this.f7125OooooOO = Float.NaN;
        this.f7126OooooOo = Float.NaN;
        this.f7128Oooooo0 = true;
        this.f7127Oooooo = null;
        this.f7129OoooooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7130Ooooooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOO0(ConstraintLayout constraintLayout) {
        OooO(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOO(AttributeSet attributeSet) {
        super.OooOOO(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o000O00.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.ConstraintLayout_Layout_android_visibility) {
                    this.f7132o0OoOo0 = true;
                } else if (index == o000O00.ConstraintLayout_Layout_android_elevation) {
                    this.f7133ooOO = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOo(ConstraintLayout constraintLayout) {
        this.f7118OoooOOo = constraintLayout;
        float rotation = getRotation();
        if (rotation != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            this.f7117OoooOOO = rotation;
        } else {
            if (Float.isNaN(this.f7117OoooOOO)) {
                return;
            }
            this.f7117OoooOOO = rotation;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOo0() {
        OooOo0O();
        this.f7121OoooOoo = Float.NaN;
        this.f7122Ooooo00 = Float.NaN;
        ConstraintWidget constraintWidget = ((ConstraintLayout.LayoutParams) getLayoutParams()).f7563o00ooo;
        constraintWidget.Ooooo00(0);
        constraintWidget.OoooOO0(0);
        OooOo0();
        layout(((int) this.f7125OooooOO) - getPaddingLeft(), ((int) this.f7126OooooOo) - getPaddingTop(), getPaddingRight() + ((int) this.f7123Ooooo0o), getPaddingBottom() + ((int) this.f7124OooooO0));
        OooOo0o();
    }

    public final void OooOo0() {
        if (this.f7118OoooOOo == null) {
            return;
        }
        if (this.f7128Oooooo0 || Float.isNaN(this.f7121OoooOoo) || Float.isNaN(this.f7122Ooooo00)) {
            if (!Float.isNaN(this.f7116OoooOO0) && !Float.isNaN(this.f7131o000oOoO)) {
                this.f7122Ooooo00 = this.f7131o000oOoO;
                this.f7121OoooOoo = this.f7116OoooOO0;
                return;
            }
            View[] viewArrOooOOO0 = OooOOO0(this.f7118OoooOOo);
            int left = viewArrOooOOO0[0].getLeft();
            int top = viewArrOooOOO0[0].getTop();
            int right = viewArrOooOOO0[0].getRight();
            int bottom = viewArrOooOOO0[0].getBottom();
            for (int i = 0; i < this.f7491Oooo0oO; i++) {
                View view = viewArrOooOOO0[i];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f7123Ooooo0o = right;
            this.f7124OooooO0 = bottom;
            this.f7125OooooOO = left;
            this.f7126OooooOo = top;
            if (Float.isNaN(this.f7116OoooOO0)) {
                this.f7121OoooOoo = (left + right) / 2;
            } else {
                this.f7121OoooOoo = this.f7116OoooOO0;
            }
            if (Float.isNaN(this.f7131o000oOoO)) {
                this.f7122Ooooo00 = (top + bottom) / 2;
            } else {
                this.f7122Ooooo00 = this.f7131o000oOoO;
            }
        }
    }

    public final void OooOo0O() {
        int i;
        if (this.f7118OoooOOo == null || (i = this.f7491Oooo0oO) == 0) {
            return;
        }
        View[] viewArr = this.f7127Oooooo;
        if (viewArr == null || viewArr.length != i) {
            this.f7127Oooooo = new View[i];
        }
        for (int i2 = 0; i2 < this.f7491Oooo0oO; i2++) {
            this.f7127Oooooo[i2] = this.f7118OoooOOo.getViewById(this.f7490Oooo0o[i2]);
        }
    }

    public final void OooOo0o() {
        if (this.f7118OoooOOo == null) {
            return;
        }
        if (this.f7127Oooooo == null) {
            OooOo0O();
        }
        OooOo0();
        double radians = Float.isNaN(this.f7117OoooOOO) ? 0.0d : Math.toRadians(this.f7117OoooOOO);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f = this.f7119OoooOo0;
        float f2 = f * fCos;
        float f3 = this.f7120OoooOoO;
        float f4 = (-f3) * fSin;
        float f5 = f * fSin;
        float f6 = f3 * fCos;
        for (int i = 0; i < this.f7491Oooo0oO; i++) {
            View view = this.f7127Oooooo[i];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f7 = right - this.f7121OoooOoo;
            float f8 = bottom - this.f7122Ooooo00;
            float f9 = (((f4 * f8) + (f2 * f7)) - f7) + this.f7129OoooooO;
            float f10 = (((f6 * f8) + (f7 * f5)) - f8) + this.f7130Ooooooo;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            view.setScaleY(this.f7120OoooOoO);
            view.setScaleX(this.f7119OoooOo0);
            if (!Float.isNaN(this.f7117OoooOOO)) {
                view.setRotation(this.f7117OoooOOO);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f7118OoooOOo = (ConstraintLayout) getParent();
        if (this.f7132o0OoOo0 || this.f7133ooOO) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f7491Oooo0oO; i++) {
                View viewById = this.f7118OoooOOo.getViewById(this.f7490Oooo0o[i]);
                if (viewById != null) {
                    if (this.f7132o0OoOo0) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f7133ooOO && elevation > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
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
        this.f7116OoooOO0 = f;
        OooOo0o();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.f7131o000oOoO = f;
        OooOo0o();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.f7117OoooOOO = f;
        OooOo0o();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.f7119OoooOo0 = f;
        OooOo0o();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.f7120OoooOoO = f;
        OooOo0o();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.f7129OoooooO = f;
        OooOo0o();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.f7130Ooooooo = f;
        OooOo0o();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        OooO0oo();
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7116OoooOO0 = Float.NaN;
        this.f7131o000oOoO = Float.NaN;
        this.f7117OoooOOO = Float.NaN;
        this.f7119OoooOo0 = 1.0f;
        this.f7120OoooOoO = 1.0f;
        this.f7121OoooOoo = Float.NaN;
        this.f7122Ooooo00 = Float.NaN;
        this.f7123Ooooo0o = Float.NaN;
        this.f7124OooooO0 = Float.NaN;
        this.f7125OooooOO = Float.NaN;
        this.f7126OooooOo = Float.NaN;
        this.f7128Oooooo0 = true;
        this.f7127Oooooo = null;
        this.f7129OoooooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7130Ooooooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7116OoooOO0 = Float.NaN;
        this.f7131o000oOoO = Float.NaN;
        this.f7117OoooOOO = Float.NaN;
        this.f7119OoooOo0 = 1.0f;
        this.f7120OoooOoO = 1.0f;
        this.f7121OoooOoo = Float.NaN;
        this.f7122Ooooo00 = Float.NaN;
        this.f7123Ooooo0o = Float.NaN;
        this.f7124OooooO0 = Float.NaN;
        this.f7125OooooOO = Float.NaN;
        this.f7126OooooOo = Float.NaN;
        this.f7128Oooooo0 = true;
        this.f7127Oooooo = null;
        this.f7129OoooooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7130Ooooooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }
}
