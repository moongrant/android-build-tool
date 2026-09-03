package p058o0000OoO;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import o0000OOO.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class OooOOO0 extends ConstraintWidget {

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public ArrayList<ConstraintWidget> f27656o0OOO0o;

    public OooOOO0() {
        this.f27656o0OOO0o = new ArrayList<>();
    }

    public final void OooO0O0(ConstraintWidget constraintWidget) {
        this.f27656o0OOO0o.add(constraintWidget);
        ConstraintWidget constraintWidget2 = constraintWidget.f6948OoooOOo;
        if (constraintWidget2 != null) {
            ((OooOOO0) constraintWidget2).f27656o0OOO0o.remove(constraintWidget);
            constraintWidget.Oooo0OO();
        }
        constraintWidget.f6948OoooOOo = this;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void Oooo0OO() {
        this.f27656o0OOO0o.clear();
        super.Oooo0OO();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void Oooo0oO(OooO00o oooO00o) {
        super.Oooo0oO(oooO00o);
        int size = this.f27656o0OOO0o.size();
        for (int i = 0; i < size; i++) {
            this.f27656o0OOO0o.get(i).Oooo0oO(oooO00o);
        }
    }

    public void OooooOO() {
        ArrayList<ConstraintWidget> arrayList = this.f27656o0OOO0o;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f27656o0OOO0o.get(i);
            if (constraintWidget instanceof OooOOO0) {
                ((OooOOO0) constraintWidget).OooooOO();
            }
        }
    }

    public final void OooooOo() {
        this.f27656o0OOO0o.clear();
    }

    public OooOOO0(int i, int i2) {
        super(0, 0);
        this.f27656o0OOO0o = new ArrayList<>();
    }
}
