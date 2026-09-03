package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.OooO;
import androidx.constraintlayout.core.widgets.OooOOO;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.OooO0O0;
import androidx.constraintlayout.widget.VirtualLayout;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends VirtualLayout {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public OooO f4541OooOOO;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOO(AttributeSet attributeSet) {
        super.OooOOO(attributeSet);
        this.f4541OooOOO = new OooO();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_android_orientation) {
                    this.f4541OooOOO.f4424o0000Oo = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_android_padding) {
                    OooO oooO = this.f4541OooOOO;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    oooO.f4513o0OO00O = dimensionPixelSize;
                    oooO.f4514oo0o0Oo = dimensionPixelSize;
                    oooO.f4512o0O0O00 = dimensionPixelSize;
                    oooO.f4511o000OOo = dimensionPixelSize;
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_android_paddingStart) {
                    OooO oooO2 = this.f4541OooOOO;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    oooO2.f4512o0O0O00 = dimensionPixelSize2;
                    oooO2.f4505o000000 = dimensionPixelSize2;
                    oooO2.f4506o000000O = dimensionPixelSize2;
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_android_paddingEnd) {
                    this.f4541OooOOO.f4511o000OOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f4541OooOOO.f4505o000000 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_android_paddingTop) {
                    this.f4541OooOOO.f4513o0OO00O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_android_paddingRight) {
                    this.f4541OooOOO.f4506o000000O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f4541OooOOO.f4514oo0o0Oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f4541OooOOO.f4423o0000OOo = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f4541OooOOO.f4412o00000Oo = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f4541OooOOO.f4413o00000o0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f4541OooOOO.f4427o0000Ooo = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f4541OooOOO.f4415o00000oo = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f4541OooOOO.f4414o00000oO = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f4541OooOOO.f4411o0000 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f4541OooOOO.f4418o0000O00 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f4541OooOOO.f4432o0000oO = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f4541OooOOO.f4419o0000O0O = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f4541OooOOO.f4417o0000O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f4541OooOOO.f4435o000OO = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f4541OooOOO.f4434o0000oo = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f4541OooOOO.f4420o0000OO = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f4541OooOOO.f4422o0000OOO = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f4541OooOOO.f4416o0000O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f4541OooOOO.f4421o0000OO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == androidx.constraintlayout.widget.OooO.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f4541OooOOO.f4425o0000Oo0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f4918OooO0oO = this.f4541OooOOO;
        OooOo00();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOOO(OooO0O0.OooO00o oooO00o, oo0o0Oo.OooO0O0 oooO0O0, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
        super.OooOOOO(oooO00o, oooO0O0, layoutParams, sparseArray);
        if (oooO0O0 instanceof OooO) {
            OooO oooO = (OooO) oooO0O0;
            int i = layoutParams.f4983o000oOoO;
            if (i != -1) {
                oooO.f4424o0000Oo = i;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOOo(ConstraintWidget constraintWidget, boolean z) {
        OooO oooO = this.f4541OooOOO;
        int i = oooO.f4512o0O0O00;
        if (i > 0 || oooO.f4511o000OOo > 0) {
            if (z) {
                oooO.f4505o000000 = oooO.f4511o000OOo;
                oooO.f4506o000000O = i;
            } else {
                oooO.f4505o000000 = i;
                oooO.f4506o000000O = oooO.f4511o000OOo;
            }
        }
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
        OooOo0(this.f4541OooOOO, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f4541OooOOO.f4432o0000oO = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f4541OooOOO.f4427o0000Ooo = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f4541OooOOO.f4417o0000O0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f4541OooOOO.f4414o00000oO = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f4541OooOOO.f4420o0000OO = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f4541OooOOO.f4418o0000O00 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f4541OooOOO.f4416o0000O = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f4541OooOOO.f4412o00000Oo = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f4541OooOOO.f4419o0000O0O = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f4541OooOOO.f4415o00000oo = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f4541OooOOO.f4435o000OO = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f4541OooOOO.f4411o0000 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f4541OooOOO.f4425o0000Oo0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f4541OooOOO.f4424o0000Oo = i;
        requestLayout();
    }

    public void setPadding(int i) {
        OooO oooO = this.f4541OooOOO;
        oooO.f4513o0OO00O = i;
        oooO.f4514oo0o0Oo = i;
        oooO.f4512o0O0O00 = i;
        oooO.f4511o000OOo = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f4541OooOOO.f4514oo0o0Oo = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f4541OooOOO.f4505o000000 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f4541OooOOO.f4506o000000O = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f4541OooOOO.f4513o0OO00O = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f4541OooOOO.f4422o0000OOO = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f4541OooOOO.f4434o0000oo = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f4541OooOOO.f4421o0000OO0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f4541OooOOO.f4413o00000o0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f4541OooOOO.f4423o0000OOo = i;
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
