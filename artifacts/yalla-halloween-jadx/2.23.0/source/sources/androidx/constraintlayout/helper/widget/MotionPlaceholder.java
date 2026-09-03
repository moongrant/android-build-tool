package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.OooOOO;
import androidx.constraintlayout.core.widgets.OooOOO0;
import androidx.constraintlayout.widget.VirtualLayout;
import oo0o0Oo.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class MotionPlaceholder extends VirtualLayout {
    public MotionPlaceholder(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOO(AttributeSet attributeSet) {
        super.OooOOO(attributeSet);
        this.f4918OooO0oO = new OooOOO0();
        OooOo00();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOoo(OooO00o oooO00o, SparseArray sparseArray) {
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public final void OooOo0(OooOOO oooOOO, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (oooOOO == null) {
            setMeasuredDimension(0, 0);
        } else {
            oooOOO.OoooOoO(mode, size, mode2, size2);
            setMeasuredDimension(oooOOO.f4504o00000, oooOOO.f4509o00000O0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i, int i2) {
        OooOo0(null, i, i2);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
    }
}
