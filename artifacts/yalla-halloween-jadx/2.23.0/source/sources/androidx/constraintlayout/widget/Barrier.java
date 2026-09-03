package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends ConstraintHelper {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f4902OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.OooO00o f4903OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f4904OooOOO0;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOO(AttributeSet attributeSet) {
        super.OooOOO(attributeSet);
        this.f4903OooOOO = new androidx.constraintlayout.core.widgets.OooO00o();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, OooO.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == OooO.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == OooO.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f4903OooOOO.f4457oo0o0Oo = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == OooO.ConstraintLayout_Layout_barrierMargin) {
                    this.f4903OooOOO.f4455o0O0O00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f4918OooO0oO = this.f4903OooOOO;
        OooOo00();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOOO(OooO0O0.OooO00o oooO00o, oo0o0Oo.OooO0O0 oooO0O0, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
        super.OooOOOO(oooO00o, oooO0O0, layoutParams, sparseArray);
        if (oooO0O0 instanceof androidx.constraintlayout.core.widgets.OooO00o) {
            androidx.constraintlayout.core.widgets.OooO00o oooO00o2 = (androidx.constraintlayout.core.widgets.OooO00o) oooO0O0;
            boolean z = ((androidx.constraintlayout.core.widgets.OooO0o) oooO0O0.f4382OoooOOo).f4491o000OOo;
            OooO0O0.C0117OooO0O0 c0117OooO0O0 = oooO00o.f5060OooO0o0;
            OooOo0(oooO00o2, c0117OooO0O0.f5134Oooooo0, z);
            oooO00o2.f4457oo0o0Oo = c0117OooO0O0.f5140o00Ooo;
            oooO00o2.f4455o0O0O00 = c0117OooO0O0.f5133Oooooo;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOOo(ConstraintWidget constraintWidget, boolean z) {
        OooOo0(constraintWidget, this.f4902OooOO0o, z);
    }

    public final void OooOo0(ConstraintWidget constraintWidget, int i, boolean z) {
        this.f4904OooOOO0 = i;
        if (z) {
            int i2 = this.f4902OooOO0o;
            if (i2 == 5) {
                this.f4904OooOOO0 = 1;
            } else if (i2 == 6) {
                this.f4904OooOOO0 = 0;
            }
        } else {
            int i3 = this.f4902OooOO0o;
            if (i3 == 5) {
                this.f4904OooOOO0 = 0;
            } else if (i3 == 6) {
                this.f4904OooOOO0 = 1;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.OooO00o) {
            ((androidx.constraintlayout.core.widgets.OooO00o) constraintWidget).f4456o0OO00O = this.f4904OooOOO0;
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f4903OooOOO.f4457oo0o0Oo;
    }

    public int getMargin() {
        return this.f4903OooOOO.f4455o0O0O00;
    }

    public int getType() {
        return this.f4902OooOO0o;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f4903OooOOO.f4457oo0o0Oo = z;
    }

    public void setDpMargin(int i) {
        this.f4903OooOOO.f4455o0O0O00 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f4903OooOOO.f4455o0O0O00 = i;
    }

    public void setType(int i) {
        this.f4902OooOO0o = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
