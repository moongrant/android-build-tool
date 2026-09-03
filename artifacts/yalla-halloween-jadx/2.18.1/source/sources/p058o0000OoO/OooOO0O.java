package p058o0000OoO;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p061o0000o0.oo000o;
import p061o0000o0.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public class OooOO0O extends ConstraintWidget implements OooOO0 {

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public ConstraintWidget[] f27654o0OOO0o = new ConstraintWidget[4];

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public int f27655o0Oo0oo = 0;

    @Override // p058o0000OoO.OooOO0
    public final void OooO00o() {
        this.f27655o0Oo0oo = 0;
        Arrays.fill(this.f27654o0OOO0o, (Object) null);
    }

    @Override // p058o0000OoO.OooOO0
    public final void OooO0O0(ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i = this.f27655o0Oo0oo + 1;
        ConstraintWidget[] constraintWidgetArr = this.f27654o0OOO0o;
        if (i > constraintWidgetArr.length) {
            this.f27654o0OOO0o = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.f27654o0OOO0o;
        int i2 = this.f27655o0Oo0oo;
        constraintWidgetArr2[i2] = constraintWidget;
        this.f27655o0Oo0oo = i2 + 1;
    }

    public void OooO0OO() {
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void OooOO0o(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.OooOO0o(constraintWidget, map);
        OooOO0O oooOO0O = (OooOO0O) constraintWidget;
        this.f27655o0Oo0oo = 0;
        int i = oooOO0O.f27655o0Oo0oo;
        for (int i2 = 0; i2 < i; i2++) {
            OooO0O0(map.get(oooOO0O.f27654o0OOO0o[i2]));
        }
    }

    public final void OooooOO(ArrayList<oo0o0Oo> arrayList, int i, oo0o0Oo oo0o0oo) {
        for (int i2 = 0; i2 < this.f27655o0Oo0oo; i2++) {
            oo0o0oo.OooO00o(this.f27654o0OOO0o[i2]);
        }
        for (int i3 = 0; i3 < this.f27655o0Oo0oo; i3++) {
            oo000o.OooO00o(this.f27654o0OOO0o[i3], i, arrayList, oo0o0oo);
        }
    }
}
