package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import p060o0000o.o00Oo0;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements MotionLayout.OooOOOO {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f7142OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float f7143OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public View[] f7144OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f7145o000oOoO;

    public MotionHelper(Context context) {
        super(context);
        this.f7142OoooOO0 = false;
        this.f7145o000oOoO = false;
    }

    public void OooO00o(int i) {
    }

    public void OooO0O0() {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.OooOOOO
    public final void OooO0OO() {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.OooOOOO
    public final void OooO0Oo() {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOO(AttributeSet attributeSet) {
        super.OooOOO(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o000O00.MotionHelper);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.MotionHelper_onShow) {
                    this.f7142OoooOO0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f7142OoooOO0);
                } else if (index == o000O00.MotionHelper_onHide) {
                    this.f7145o000oOoO = typedArrayObtainStyledAttributes.getBoolean(index, this.f7145o000oOoO);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void OooOo0(MotionLayout motionLayout, HashMap<View, o00Oo0> map) {
    }

    public float getProgress() {
        return this.f7143OoooOOO;
    }

    public void setProgress(float f) {
        this.f7143OoooOOO = f;
        int i = 0;
        if (this.f7491Oooo0oO > 0) {
            this.f7144OoooOOo = OooOOO0((ConstraintLayout) getParent());
            while (i < this.f7491Oooo0oO) {
                View view = this.f7144OoooOOo[i];
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            boolean z = viewGroup.getChildAt(i) instanceof MotionHelper;
            i++;
        }
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7142OoooOO0 = false;
        this.f7145o000oOoO = false;
        OooOOO(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7142OoooOO0 = false;
        this.f7145o000oOoO = false;
        OooOOO(attributeSet);
    }
}
