package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.OooO;
import java.util.HashMap;
import o000000O.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements MotionLayout.OooOOOO {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f4568OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f4569OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f4570OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public View[] f4571OooOOOO;

    public MotionHelper(Context context) {
        super(context);
        this.f4568OooOO0o = false;
        this.f4570OooOOO0 = false;
    }

    public void OooO00o(int i) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.OooOOOO
    public final void OooO0O0() {
    }

    public void OooO0OO() {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.OooOOOO
    public final void OooO0Oo() {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOO(AttributeSet attributeSet) {
        super.OooOOO(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooO.MotionHelper);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == OooO.MotionHelper_onShow) {
                    this.f4568OooOO0o = typedArrayObtainStyledAttributes.getBoolean(index, this.f4568OooOO0o);
                } else if (index == OooO.MotionHelper_onHide) {
                    this.f4570OooOOO0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f4570OooOOO0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void OooOo0(MotionLayout motionLayout, HashMap<View, Oooo0> map) {
    }

    public float getProgress() {
        return this.f4569OooOOO;
    }

    public void setProgress(float f) {
        this.f4569OooOOO = f;
        int i = 0;
        if (this.f4917OooO0o0 > 0) {
            this.f4571OooOOOO = OooOOO0((ConstraintLayout) getParent());
            while (i < this.f4917OooO0o0) {
                View view = this.f4571OooOOOO[i];
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
        this.f4568OooOO0o = false;
        this.f4570OooOOO0 = false;
        OooOOO(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4568OooOO0o = false;
        this.f4570OooOOO0 = false;
        OooOOO(attributeSet);
    }
}
