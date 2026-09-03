package p061o0000o0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.OooOO0;
import java.util.ArrayList;
import p058o0000OoO.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o {
    public static oo0o0Oo OooO00o(ConstraintWidget constraintWidget, int i, ArrayList<oo0o0Oo> arrayList, oo0o0Oo oo0o0oo) {
        int i2;
        int i3 = i == 0 ? constraintWidget.f6971o0ooOOo : constraintWidget.f6972o0ooOoO;
        if (i3 != -1 && (oo0o0oo == null || i3 != oo0o0oo.f27891OooO0O0)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                oo0o0Oo oo0o0oo2 = arrayList.get(i4);
                if (oo0o0oo2.f27891OooO0O0 == i3) {
                    if (oo0o0oo != null) {
                        oo0o0oo.OooO0Oo(i, oo0o0oo2);
                        arrayList.remove(oo0o0oo);
                    }
                    oo0o0oo = oo0o0oo2;
                    break;
                }
            }
        } else if (i3 != -1) {
            return oo0o0oo;
        }
        if (oo0o0oo == null) {
            if (constraintWidget instanceof OooOO0O) {
                OooOO0O oooOO0O = (OooOO0O) constraintWidget;
                int i5 = 0;
                while (true) {
                    if (i5 >= oooOO0O.f27655o0Oo0oo) {
                        i2 = -1;
                        break;
                    }
                    ConstraintWidget constraintWidget2 = oooOO0O.f27654o0OOO0o[i5];
                    if ((i == 0 && (i2 = constraintWidget2.f6971o0ooOOo) != -1) || (i == 1 && (i2 = constraintWidget2.f6972o0ooOoO) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        oo0o0Oo oo0o0oo3 = arrayList.get(i6);
                        if (oo0o0oo3.f27891OooO0O0 == i2) {
                            oo0o0oo = oo0o0oo3;
                            break;
                        }
                    }
                }
            }
            if (oo0o0oo == null) {
                oo0o0oo = new oo0o0Oo(i);
            }
            arrayList.add(oo0o0oo);
        }
        if (oo0o0oo.OooO00o(constraintWidget)) {
            if (constraintWidget instanceof OooOO0) {
                OooOO0 oooOO1 = (OooOO0) constraintWidget;
                oooOO1.f7067oo0o0Oo.OooO0OO(oooOO1.f7063o0O0O00 == 0 ? 1 : 0, arrayList, oo0o0oo);
            }
            if (i == 0) {
                constraintWidget.f6971o0ooOOo = oo0o0oo.f27891OooO0O0;
                constraintWidget.f6939Oooo0o0.OooO0OO(i, arrayList, oo0o0oo);
                constraintWidget.f6940Oooo0oO.OooO0OO(i, arrayList, oo0o0oo);
            } else {
                constraintWidget.f6972o0ooOoO = oo0o0oo.f27891OooO0O0;
                constraintWidget.f6938Oooo0o.OooO0OO(i, arrayList, oo0o0oo);
                constraintWidget.f6931Oooo.OooO0OO(i, arrayList, oo0o0oo);
                constraintWidget.f6941Oooo0oo.OooO0OO(i, arrayList, oo0o0oo);
            }
            constraintWidget.f6945OoooO0O.OooO0OO(i, arrayList, oo0o0oo);
        }
        return oo0o0oo;
    }

    public static oo0o0Oo OooO0O0(ArrayList<oo0o0Oo> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            oo0o0Oo oo0o0oo = arrayList.get(i2);
            if (i == oo0o0oo.f27891OooO0O0) {
                return oo0o0oo;
            }
        }
        return null;
    }

    public static boolean OooO0OO(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        return (dimensionBehaviour3 == dimensionBehaviour7 || dimensionBehaviour3 == (dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != dimensionBehaviour6)) || (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != dimensionBehaviour5));
    }
}
