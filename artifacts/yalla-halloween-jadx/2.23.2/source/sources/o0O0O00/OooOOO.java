package o0O0O00;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO {
    public static o000oOoO OooO00o(ConstraintWidget constraintWidget, int i, ArrayList<o000oOoO> arrayList, o000oOoO o000oooo2) {
        boolean z;
        int i2;
        int i3 = i == 0 ? constraintWidget.f4411o0ooOOo : constraintWidget.f4412o0ooOoO;
        if (i3 != -1 && (o000oooo2 == null || i3 != o000oooo2.f41135OooO0O0)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                o000oOoO o000oooo3 = arrayList.get(i4);
                if (o000oooo3.f41135OooO0O0 == i3) {
                    if (o000oooo2 != null) {
                        o000oooo2.OooO0OO(i, o000oooo3);
                        arrayList.remove(o000oooo2);
                    }
                    o000oooo2 = o000oooo3;
                    break;
                }
            }
        } else if (i3 != -1) {
            return o000oooo2;
        }
        if (o000oooo2 == null) {
            if (constraintWidget instanceof oo0o0Oo.OooO0O0) {
                oo0o0Oo.OooO0O0 oooO0O0 = (oo0o0Oo.OooO0O0) constraintWidget;
                int i5 = 0;
                while (true) {
                    if (i5 >= oooO0O0.f60341o0Oo0oo) {
                        i2 = -1;
                        break;
                    }
                    ConstraintWidget constraintWidget2 = oooO0O0.f60340o0OOO0o[i5];
                    if ((i == 0 && (i2 = constraintWidget2.f4411o0ooOOo) != -1) || (i == 1 && (i2 = constraintWidget2.f4412o0ooOoO) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        o000oOoO o000oooo4 = arrayList.get(i6);
                        if (o000oooo4.f41135OooO0O0 == i2) {
                            o000oooo2 = o000oooo4;
                            break;
                        }
                    }
                }
            }
            if (o000oooo2 == null) {
                o000oooo2 = new o000oOoO(i);
            }
            arrayList.add(o000oooo2);
        }
        ArrayList<ConstraintWidget> arrayList2 = o000oooo2.f41134OooO00o;
        if (arrayList2.contains(constraintWidget)) {
            z = false;
        } else {
            arrayList2.add(constraintWidget);
            z = true;
        }
        if (z) {
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.OooOO0) {
                androidx.constraintlayout.core.widgets.OooOO0 oooOO1 = (androidx.constraintlayout.core.widgets.OooOO0) constraintWidget;
                oooOO1.f4507oo0o0Oo.OooO0OO(oooOO1.f4503o0O0O00 == 0 ? 1 : 0, o000oooo2, arrayList);
            }
            int i7 = o000oooo2.f41135OooO0O0;
            if (i == 0) {
                constraintWidget.f4411o0ooOOo = i7;
                constraintWidget.f4379Oooo0o0.OooO0OO(i, o000oooo2, arrayList);
                constraintWidget.f4380Oooo0oO.OooO0OO(i, o000oooo2, arrayList);
            } else {
                constraintWidget.f4412o0ooOoO = i7;
                constraintWidget.f4378Oooo0o.OooO0OO(i, o000oooo2, arrayList);
                constraintWidget.f4371Oooo.OooO0OO(i, o000oooo2, arrayList);
                constraintWidget.f4381Oooo0oo.OooO0OO(i, o000oooo2, arrayList);
            }
            constraintWidget.f4385OoooO0O.OooO0OO(i, o000oooo2, arrayList);
        }
        return o000oooo2;
    }

    public static boolean OooO0O0(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        return (dimensionBehaviour3 == dimensionBehaviour7 || dimensionBehaviour3 == (dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != dimensionBehaviour6)) || (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != dimensionBehaviour5));
    }
}
