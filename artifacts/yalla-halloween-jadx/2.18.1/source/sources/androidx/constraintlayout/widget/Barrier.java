package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.OooO0o;
import p058o0000OoO.OooOO0O;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends ConstraintHelper {

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f7477OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.OooO00o f7478OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f7479o000oOoO;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOO(AttributeSet attributeSet) {
        super.OooOOO(attributeSet);
        this.f7478OoooOOO = new androidx.constraintlayout.core.widgets.OooO00o();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o000O00.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == o000O00.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f7478OoooOOO.f7023oo0o0Oo = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == o000O00.ConstraintLayout_Layout_barrierMargin) {
                    this.f7478OoooOOO.f7021o0O0O00 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f7489Oooo = this.f7478OoooOOO;
        OooOo00();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOOO(OooO00o.C0043OooO00o c0043OooO00o, OooOO0O oooOO0O, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.OooOOOO(c0043OooO00o, oooOO0O, layoutParams, sparseArray);
        if (oooOO0O instanceof androidx.constraintlayout.core.widgets.OooO00o) {
            androidx.constraintlayout.core.widgets.OooO00o oooO00o = (androidx.constraintlayout.core.widgets.OooO00o) oooOO0O;
            OooOo0(oooO00o, c0043OooO00o.f7620OooO0o0.f7694Oooooo0, ((OooO0o) oooOO0O.f6948OoooOOo).f7057o000OOo);
            OooO00o.OooO0O0 oooO0O0 = c0043OooO00o.f7620OooO0o0;
            oooO00o.f7023oo0o0Oo = oooO0O0.f7700o00Ooo;
            oooO00o.f7021o0O0O00 = oooO0O0.f7693Oooooo;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOOo(ConstraintWidget constraintWidget, boolean z) {
        OooOo0(constraintWidget, this.f7477OoooOO0, z);
    }

    public final void OooOo0(ConstraintWidget constraintWidget, int i, boolean z) {
        this.f7479o000oOoO = i;
        if (z) {
            int i2 = this.f7477OoooOO0;
            if (i2 == 5) {
                this.f7479o000oOoO = 1;
            } else if (i2 == 6) {
                this.f7479o000oOoO = 0;
            }
        } else {
            int i3 = this.f7477OoooOO0;
            if (i3 == 5) {
                this.f7479o000oOoO = 0;
            } else if (i3 == 6) {
                this.f7479o000oOoO = 1;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.OooO00o) {
            ((androidx.constraintlayout.core.widgets.OooO00o) constraintWidget).f7022o0OO00O = this.f7479o000oOoO;
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f7478OoooOOO.f7023oo0o0Oo;
    }

    public int getMargin() {
        return this.f7478OoooOOO.f7021o0O0O00;
    }

    public int getType() {
        return this.f7477OoooOO0;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f7478OoooOOO.f7023oo0o0Oo = z;
    }

    public void setDpMargin(int i) {
        this.f7478OoooOOO.f7021o0O0O00 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f7478OoooOOO.f7021o0O0O00 = i;
    }

    public void setType(int i) {
        this.f7477OoooOO0 = i;
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
