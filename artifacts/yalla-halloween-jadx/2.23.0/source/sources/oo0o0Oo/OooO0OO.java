package oo0o0Oo;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import p644o0ooOoO.oO0000o0;

/* JADX INFO: loaded from: classes.dex */
public class OooO0OO extends ConstraintWidget {

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public ArrayList<ConstraintWidget> f60905o0OOO0o;

    public OooO0OO() {
        this.f60905o0OOO0o = new ArrayList<>();
    }

    public final void OooO00o(ConstraintWidget constraintWidget) {
        this.f60905o0OOO0o.add(constraintWidget);
        ConstraintWidget constraintWidget2 = constraintWidget.f4382OoooOOo;
        if (constraintWidget2 != null) {
            ((OooO0OO) constraintWidget2).f60905o0OOO0o.remove(constraintWidget);
            constraintWidget.Oooo00o();
        }
        constraintWidget.f4382OoooOOo = this;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void Oooo00o() {
        this.f60905o0OOO0o.clear();
        super.Oooo00o();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void Oooo0OO(oO0000o0 oo0000o0) {
        super.Oooo0OO(oo0000o0);
        int size = this.f60905o0OOO0o.size();
        for (int i = 0; i < size; i++) {
            this.f60905o0OOO0o.get(i).Oooo0OO(oo0000o0);
        }
    }

    public void OoooOo0() {
        ArrayList<ConstraintWidget> arrayList = this.f60905o0OOO0o;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f60905o0OOO0o.get(i);
            if (constraintWidget instanceof OooO0OO) {
                ((OooO0OO) constraintWidget).OoooOo0();
            }
        }
    }

    public OooO0OO(int i) {
        super(0, 0);
        this.f60905o0OOO0o = new ArrayList<>();
    }
}
