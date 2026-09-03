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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.OooO00o;
import androidx.constraintlayout.widget.VirtualLayout;
import p058o0000OoO.OooOO0O;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends VirtualLayout {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public OooO f7115OoooOOO;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOO(AttributeSet attributeSet) {
        super.OooOOO(attributeSet);
        this.f7115OoooOOO = new OooO();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o000O00.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.ConstraintLayout_Layout_android_orientation) {
                    this.f7115OoooOOO.f6990o0000Oo = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == o000O00.ConstraintLayout_Layout_android_padding) {
                    OooO oooO = this.f7115OoooOOO;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    oooO.f7079o0OO00O = dimensionPixelSize;
                    oooO.f7080oo0o0Oo = dimensionPixelSize;
                    oooO.f7078o0O0O00 = dimensionPixelSize;
                    oooO.f7077o000OOo = dimensionPixelSize;
                } else if (index == o000O00.ConstraintLayout_Layout_android_paddingStart) {
                    OooO oooO2 = this.f7115OoooOOO;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    oooO2.f7078o0O0O00 = dimensionPixelSize2;
                    oooO2.f7071o000000 = dimensionPixelSize2;
                    oooO2.f7072o000000O = dimensionPixelSize2;
                } else if (index == o000O00.ConstraintLayout_Layout_android_paddingEnd) {
                    this.f7115OoooOOO.f7077o000OOo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == o000O00.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f7115OoooOOO.f7071o000000 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == o000O00.ConstraintLayout_Layout_android_paddingTop) {
                    this.f7115OoooOOO.f7079o0OO00O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == o000O00.ConstraintLayout_Layout_android_paddingRight) {
                    this.f7115OoooOOO.f7072o000000O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == o000O00.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f7115OoooOOO.f7080oo0o0Oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == o000O00.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f7115OoooOOO.f6989o0000OOo = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == o000O00.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f7115OoooOOO.f6978o00000Oo = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == o000O00.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f7115OoooOOO.f6979o00000o0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == o000O00.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f7115OoooOOO.f6993o0000Ooo = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == o000O00.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f7115OoooOOO.f6981o00000oo = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == o000O00.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f7115OoooOOO.f6980o00000oO = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == o000O00.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f7115OoooOOO.f6977o0000 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == o000O00.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f7115OoooOOO.f6984o0000O00 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == o000O00.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f7115OoooOOO.f6998o0000oO = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == o000O00.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f7115OoooOOO.f6985o0000O0O = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == o000O00.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f7115OoooOOO.f6983o0000O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == o000O00.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f7115OoooOOO.f7001o000OO = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == o000O00.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f7115OoooOOO.f7000o0000oo = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == o000O00.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f7115OoooOOO.f6986o0000OO = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == o000O00.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f7115OoooOOO.f6988o0000OOO = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == o000O00.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f7115OoooOOO.f6982o0000O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == o000O00.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f7115OoooOOO.f6987o0000OO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == o000O00.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f7115OoooOOO.f6991o0000Oo0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f7489Oooo = this.f7115OoooOOO;
        OooOo00();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOOO(OooO00o.C0043OooO00o c0043OooO00o, OooOO0O oooOO0O, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.OooOOOO(c0043OooO00o, oooOO0O, layoutParams, sparseArray);
        if (oooOO0O instanceof OooO) {
            OooO oooO = (OooO) oooOO0O;
            int i = layoutParams.f7558o000oOoO;
            if (i != -1) {
                oooO.f6990o0000Oo = i;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void OooOOOo(ConstraintWidget constraintWidget, boolean z) {
        OooO oooO = this.f7115OoooOOO;
        int i = oooO.f7078o0O0O00;
        if (i > 0 || oooO.f7077o000OOo > 0) {
            if (z) {
                oooO.f7071o000000 = oooO.f7077o000OOo;
                oooO.f7072o000000O = i;
            } else {
                oooO.f7071o000000 = i;
                oooO.f7072o000000O = oooO.f7077o000OOo;
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
            oooOOO.OooooOo(mode, size, mode2, size2);
            setMeasuredDimension(oooOOO.f7070o00000, oooOOO.f7075o00000O0);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i, int i2) {
        OooOo0(this.f7115OoooOOO, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f7115OoooOOO.f6998o0000oO = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f7115OoooOOO.f6993o0000Ooo = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f7115OoooOOO.f6983o0000O0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f7115OoooOOO.f6980o00000oO = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f7115OoooOOO.f6986o0000OO = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f7115OoooOOO.f6984o0000O00 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f7115OoooOOO.f6982o0000O = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f7115OoooOOO.f6978o00000Oo = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f7115OoooOOO.f6985o0000O0O = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f7115OoooOOO.f6981o00000oo = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f7115OoooOOO.f7001o000OO = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f7115OoooOOO.f6977o0000 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f7115OoooOOO.f6991o0000Oo0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f7115OoooOOO.f6990o0000Oo = i;
        requestLayout();
    }

    public void setPadding(int i) {
        OooO oooO = this.f7115OoooOOO;
        oooO.f7079o0OO00O = i;
        oooO.f7080oo0o0Oo = i;
        oooO.f7078o0O0O00 = i;
        oooO.f7077o000OOo = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f7115OoooOOO.f7080oo0o0Oo = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f7115OoooOOO.f7071o000000 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f7115OoooOOO.f7072o000000O = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f7115OoooOOO.f7079o0OO00O = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f7115OoooOOO.f6988o0000OOO = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f7115OoooOOO.f7000o0000oo = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f7115OoooOOO.f6987o0000OO0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f7115OoooOOO.f6979o00000o0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f7115OoooOOO.f6989o0000OOo = i;
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
