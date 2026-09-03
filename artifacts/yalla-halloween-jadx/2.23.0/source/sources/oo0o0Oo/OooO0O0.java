package oo0o0Oo;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import o0O0O00.OooOOO;
import o0O0O00.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
public class OooO0O0 extends ConstraintWidget implements OooO00o {

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public ConstraintWidget[] f60903o0OOO0o = new ConstraintWidget[4];

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public int f60904o0Oo0oo = 0;

    @Override // oo0o0Oo.OooO00o
    public final void OooO00o(ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i = this.f60904o0Oo0oo + 1;
        ConstraintWidget[] constraintWidgetArr = this.f60903o0OOO0o;
        if (i > constraintWidgetArr.length) {
            this.f60903o0OOO0o = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.f60903o0OOO0o;
        int i2 = this.f60904o0Oo0oo;
        constraintWidgetArr2[i2] = constraintWidget;
        this.f60904o0Oo0oo = i2 + 1;
    }

    @Override // oo0o0Oo.OooO00o
    public final void OooO0O0() {
        this.f60904o0Oo0oo = 0;
        Arrays.fill(this.f60903o0OOO0o, (Object) null);
    }

    public void OooO0OO() {
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void OooOO0O(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.OooOO0O(constraintWidget, map);
        OooO0O0 oooO0O0 = (OooO0O0) constraintWidget;
        this.f60904o0Oo0oo = 0;
        int i = oooO0O0.f60904o0Oo0oo;
        for (int i2 = 0; i2 < i; i2++) {
            OooO00o(map.get(oooO0O0.f60903o0OOO0o[i2]));
        }
    }

    public final void OoooOo0(int i, o000oOoO o000oooo2, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.f60904o0Oo0oo; i2++) {
            ConstraintWidget constraintWidget = this.f60903o0OOO0o[i2];
            ArrayList<ConstraintWidget> arrayList2 = o000oooo2.f41881OooO00o;
            if (!arrayList2.contains(constraintWidget)) {
                arrayList2.add(constraintWidget);
            }
        }
        for (int i3 = 0; i3 < this.f60904o0Oo0oo; i3++) {
            OooOOO.OooO00o(this.f60903o0OOO0o[i3], i, arrayList, o000oooo2);
        }
    }
}
