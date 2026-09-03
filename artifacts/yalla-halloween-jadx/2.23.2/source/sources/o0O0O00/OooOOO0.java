package o0O0O00;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0O0.OooO00o f41125OooO00o = new OooO0O0.OooO00o();

    public static boolean OooO00o(ConstraintWidget constraintWidget) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f4387OoooOOO;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[1];
        ConstraintWidget constraintWidget2 = constraintWidget.f4388OoooOOo;
        androidx.constraintlayout.core.widgets.OooO0o oooO0o = constraintWidget2 != null ? (androidx.constraintlayout.core.widgets.OooO0o) constraintWidget2 : null;
        if (oooO0o != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = oooO0o.f4387OoooOOO[0];
        }
        if (oooO0o != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = oooO0o.f4387OoooOOO[1];
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        boolean z = dimensionBehaviour3 == dimensionBehaviour7 || constraintWidget.Oooo000() || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour3 == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.f4361OooOo00 == 0 && constraintWidget.f4391OoooOoo == 0.0f && constraintWidget.OooOoO0(0)) || (dimensionBehaviour3 == dimensionBehaviour2 && constraintWidget.f4361OooOo00 == 1 && constraintWidget.OooOoO(0, constraintWidget.OooOo0O()));
        boolean z2 = dimensionBehaviour4 == dimensionBehaviour7 || constraintWidget.Oooo00O() || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || (dimensionBehaviour4 == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) && constraintWidget.f4360OooOo0 == 0 && constraintWidget.f4391OoooOoo == 0.0f && constraintWidget.OooOoO0(1)) || (dimensionBehaviour4 == dimensionBehaviour && constraintWidget.f4360OooOo0 == 1 && constraintWidget.OooOoO(1, constraintWidget.OooOOOo()));
        if (constraintWidget.f4391OoooOoo <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    public static void OooO0O0(int i, ConstraintWidget constraintWidget, OooO0O0.InterfaceC0442OooO0O0 interfaceC0442OooO0O0, boolean z) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.f4354OooOOOO) {
            return;
        }
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.OooO0o) && constraintWidget.OooOooo() && OooO00o(constraintWidget)) {
            androidx.constraintlayout.core.widgets.OooO0o.OooooO0(constraintWidget, interfaceC0442OooO0O0, new OooO0O0.OooO00o());
        }
        ConstraintAnchor constraintAnchorOooOOO = constraintWidget.OooOOO(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor constraintAnchorOooOOO2 = constraintWidget.OooOOO(ConstraintAnchor.Type.RIGHT);
        int iOooO0Oo = constraintAnchorOooOOO.OooO0Oo();
        int iOooO0Oo2 = constraintAnchorOooOOO2.OooO0Oo();
        HashSet<ConstraintAnchor> hashSet = constraintAnchorOooOOO.f4331OooO00o;
        char c = 0;
        if (hashSet != null && constraintAnchorOooOOO.f4333OooO0OO) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f4334OooO0Oo;
                int i2 = i + 1;
                boolean zOooO00o = OooO00o(constraintWidget2);
                if (constraintWidget2.OooOooo() && zOooO00o) {
                    androidx.constraintlayout.core.widgets.OooO0o.OooooO0(constraintWidget2, interfaceC0442OooO0O0, new OooO0O0.OooO00o());
                }
                ConstraintAnchor constraintAnchor5 = constraintWidget2.f4379Oooo0o0;
                ConstraintAnchor constraintAnchor6 = constraintWidget2.f4380Oooo0oO;
                char c2 = ((next == constraintAnchor5 && (constraintAnchor4 = constraintAnchor6.f4335OooO0o) != null && constraintAnchor4.f4333OooO0OO) || (next == constraintAnchor6 && (constraintAnchor3 = constraintAnchor5.f4335OooO0o) != null && constraintAnchor3.f4333OooO0OO)) ? (char) 1 : c;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.f4387OoooOOO[c];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour != dimensionBehaviour2 || zOooO00o) {
                    if (!constraintWidget2.OooOooo()) {
                        if (next == constraintAnchor5 && constraintAnchor6.f4335OooO0o == null) {
                            int iOooO0o0 = constraintAnchor5.OooO0o0() + iOooO0Oo;
                            constraintWidget2.Oooo0oo(iOooO0o0, constraintWidget2.OooOo0O() + iOooO0o0);
                            OooO0O0(i2, constraintWidget2, interfaceC0442OooO0O0, z);
                        } else if (next == constraintAnchor6 && constraintAnchor5.f4335OooO0o == null) {
                            int iOooO0o1 = iOooO0Oo - constraintAnchor6.OooO0o0();
                            constraintWidget2.Oooo0oo(iOooO0o1 - constraintWidget2.OooOo0O(), iOooO0o1);
                            OooO0O0(i2, constraintWidget2, interfaceC0442OooO0O0, z);
                        } else if (c2 != 0 && !constraintWidget2.OooOoo()) {
                            OooO0OO(i2, constraintWidget2, interfaceC0442OooO0O0, z);
                        }
                    }
                } else if (dimensionBehaviour == dimensionBehaviour2 && constraintWidget2.f4359OooOo >= 0 && constraintWidget2.f4363OooOo0o >= 0 && ((constraintWidget2.f4409o0OoOo0 == 8 || (constraintWidget2.f4361OooOo00 == 0 && constraintWidget2.f4391OoooOoo == 0.0f)) && !constraintWidget2.OooOoo() && !constraintWidget2.f4372Oooo0 && c2 != 0 && !constraintWidget2.OooOoo())) {
                    OooO0Oo(i2, constraintWidget, interfaceC0442OooO0O0, constraintWidget2, z);
                }
                c = 0;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.OooOO0) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = constraintAnchorOooOOO2.f4331OooO00o;
        if (hashSet2 != null && constraintAnchorOooOOO2.f4333OooO0OO) {
            Iterator<ConstraintAnchor> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f4334OooO0Oo;
                int i3 = i + 1;
                boolean zOooO00o2 = OooO00o(constraintWidget3);
                if (constraintWidget3.OooOooo() && zOooO00o2) {
                    androidx.constraintlayout.core.widgets.OooO0o.OooooO0(constraintWidget3, interfaceC0442OooO0O0, new OooO0O0.OooO00o());
                }
                ConstraintAnchor constraintAnchor7 = constraintWidget3.f4379Oooo0o0;
                ConstraintAnchor constraintAnchor8 = constraintWidget3.f4380Oooo0oO;
                boolean z2 = (next2 == constraintAnchor7 && (constraintAnchor2 = constraintAnchor8.f4335OooO0o) != null && constraintAnchor2.f4333OooO0OO) || (next2 == constraintAnchor8 && (constraintAnchor = constraintAnchor7.f4335OooO0o) != null && constraintAnchor.f4333OooO0OO);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.f4387OoooOOO[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour3 != dimensionBehaviour4 || zOooO00o2) {
                    if (!constraintWidget3.OooOooo()) {
                        if (next2 == constraintAnchor7 && constraintAnchor8.f4335OooO0o == null) {
                            int iOooO0o2 = constraintAnchor7.OooO0o0() + iOooO0Oo2;
                            constraintWidget3.Oooo0oo(iOooO0o2, constraintWidget3.OooOo0O() + iOooO0o2);
                            OooO0O0(i3, constraintWidget3, interfaceC0442OooO0O0, z);
                        } else if (next2 == constraintAnchor8 && constraintAnchor7.f4335OooO0o == null) {
                            int iOooO0o3 = iOooO0Oo2 - constraintAnchor8.OooO0o0();
                            constraintWidget3.Oooo0oo(iOooO0o3 - constraintWidget3.OooOo0O(), iOooO0o3);
                            OooO0O0(i3, constraintWidget3, interfaceC0442OooO0O0, z);
                        } else if (z2 && !constraintWidget3.OooOoo()) {
                            OooO0OO(i3, constraintWidget3, interfaceC0442OooO0O0, z);
                        }
                    }
                } else if (dimensionBehaviour3 == dimensionBehaviour4 && constraintWidget3.f4359OooOo >= 0 && constraintWidget3.f4363OooOo0o >= 0) {
                    if (constraintWidget3.f4409o0OoOo0 != 8) {
                        if (constraintWidget3.f4361OooOo00 == 0) {
                            if (constraintWidget3.f4391OoooOoo == 0.0f) {
                            }
                        }
                    }
                    if (!constraintWidget3.OooOoo() && !constraintWidget3.f4372Oooo0 && z2 && !constraintWidget3.OooOoo()) {
                        OooO0Oo(i3, constraintWidget, interfaceC0442OooO0O0, constraintWidget3, z);
                    }
                }
            }
        }
        constraintWidget.f4354OooOOOO = true;
    }

    public static void OooO0OO(int i, ConstraintWidget constraintWidget, OooO0O0.InterfaceC0442OooO0O0 interfaceC0442OooO0O0, boolean z) {
        float f = constraintWidget.f4397Oooooo;
        ConstraintAnchor constraintAnchor = constraintWidget.f4379Oooo0o0;
        int iOooO0Oo = constraintAnchor.f4335OooO0o.OooO0Oo();
        ConstraintAnchor constraintAnchor2 = constraintWidget.f4380Oooo0oO;
        int iOooO0Oo2 = constraintAnchor2.f4335OooO0o.OooO0Oo();
        int iOooO0o0 = constraintAnchor.OooO0o0() + iOooO0Oo;
        int iOooO0o1 = iOooO0Oo2 - constraintAnchor2.OooO0o0();
        if (iOooO0Oo == iOooO0Oo2) {
            f = 0.5f;
        } else {
            iOooO0Oo = iOooO0o0;
            iOooO0Oo2 = iOooO0o1;
        }
        int iOooOo0O = constraintWidget.OooOo0O();
        int i2 = (iOooO0Oo2 - iOooO0Oo) - iOooOo0O;
        if (iOooO0Oo > iOooO0Oo2) {
            i2 = (iOooO0Oo - iOooO0Oo2) - iOooOo0O;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iOooO0Oo;
        int i4 = i3 + iOooOo0O;
        if (iOooO0Oo > iOooO0Oo2) {
            i4 = i3 - iOooOo0O;
        }
        constraintWidget.Oooo0oo(i3, i4);
        OooO0O0(i + 1, constraintWidget, interfaceC0442OooO0O0, z);
    }

    public static void OooO0Oo(int i, ConstraintWidget constraintWidget, OooO0O0.InterfaceC0442OooO0O0 interfaceC0442OooO0O0, ConstraintWidget constraintWidget2, boolean z) {
        float f = constraintWidget2.f4397Oooooo;
        ConstraintAnchor constraintAnchor = constraintWidget2.f4379Oooo0o0;
        int iOooO0o0 = constraintAnchor.OooO0o0() + constraintAnchor.f4335OooO0o.OooO0Oo();
        ConstraintAnchor constraintAnchor2 = constraintWidget2.f4380Oooo0oO;
        int iOooO0Oo = constraintAnchor2.f4335OooO0o.OooO0Oo() - constraintAnchor2.OooO0o0();
        if (iOooO0Oo >= iOooO0o0) {
            int iOooOo0O = constraintWidget2.OooOo0O();
            if (constraintWidget2.f4409o0OoOo0 != 8) {
                int i2 = constraintWidget2.f4361OooOo00;
                if (i2 == 2) {
                    iOooOo0O = (int) (constraintWidget2.f4397Oooooo * 0.5f * (constraintWidget instanceof androidx.constraintlayout.core.widgets.OooO0o ? constraintWidget.OooOo0O() : constraintWidget.f4388OoooOOo.OooOo0O()));
                } else if (i2 == 0) {
                    iOooOo0O = iOooO0Oo - iOooO0o0;
                }
                iOooOo0O = Math.max(constraintWidget2.f4363OooOo0o, iOooOo0O);
                int i3 = constraintWidget2.f4359OooOo;
                if (i3 > 0) {
                    iOooOo0O = Math.min(i3, iOooOo0O);
                }
            }
            int i4 = iOooO0o0 + ((int) ((f * ((iOooO0Oo - iOooO0o0) - iOooOo0O)) + 0.5f));
            constraintWidget2.Oooo0oo(i4, iOooOo0O + i4);
            OooO0O0(i + 1, constraintWidget2, interfaceC0442OooO0O0, z);
        }
    }

    public static void OooO0o(int i, ConstraintWidget constraintWidget, OooO0O0.InterfaceC0442OooO0O0 interfaceC0442OooO0O0, ConstraintWidget constraintWidget2) {
        float f = constraintWidget2.f4399OoooooO;
        ConstraintAnchor constraintAnchor = constraintWidget2.f4378Oooo0o;
        int iOooO0o0 = constraintAnchor.OooO0o0() + constraintAnchor.f4335OooO0o.OooO0Oo();
        ConstraintAnchor constraintAnchor2 = constraintWidget2.f4381Oooo0oo;
        int iOooO0Oo = constraintAnchor2.f4335OooO0o.OooO0Oo() - constraintAnchor2.OooO0o0();
        if (iOooO0Oo >= iOooO0o0) {
            int iOooOOOo = constraintWidget2.OooOOOo();
            if (constraintWidget2.f4409o0OoOo0 != 8) {
                int i2 = constraintWidget2.f4360OooOo0;
                if (i2 == 2) {
                    iOooOOOo = (int) (f * 0.5f * (constraintWidget instanceof androidx.constraintlayout.core.widgets.OooO0o ? constraintWidget.OooOOOo() : constraintWidget.f4388OoooOOo.OooOOOo()));
                } else if (i2 == 0) {
                    iOooOOOo = iOooO0Oo - iOooO0o0;
                }
                iOooOOOo = Math.max(constraintWidget2.f4364OooOoO, iOooOOOo);
                int i3 = constraintWidget2.f4366OooOoOO;
                if (i3 > 0) {
                    iOooOOOo = Math.min(i3, iOooOOOo);
                }
            }
            int i4 = iOooO0o0 + ((int) ((f * ((iOooO0Oo - iOooO0o0) - iOooOOOo)) + 0.5f));
            constraintWidget2.Oooo(i4, iOooOOOo + i4);
            OooO0oO(i + 1, constraintWidget2, interfaceC0442OooO0O0);
        }
    }

    public static void OooO0o0(int i, ConstraintWidget constraintWidget, OooO0O0.InterfaceC0442OooO0O0 interfaceC0442OooO0O0) {
        float f = constraintWidget.f4399OoooooO;
        ConstraintAnchor constraintAnchor = constraintWidget.f4378Oooo0o;
        int iOooO0Oo = constraintAnchor.f4335OooO0o.OooO0Oo();
        ConstraintAnchor constraintAnchor2 = constraintWidget.f4381Oooo0oo;
        int iOooO0Oo2 = constraintAnchor2.f4335OooO0o.OooO0Oo();
        int iOooO0o0 = constraintAnchor.OooO0o0() + iOooO0Oo;
        int iOooO0o1 = iOooO0Oo2 - constraintAnchor2.OooO0o0();
        if (iOooO0Oo == iOooO0Oo2) {
            f = 0.5f;
        } else {
            iOooO0Oo = iOooO0o0;
            iOooO0Oo2 = iOooO0o1;
        }
        int iOooOOOo = constraintWidget.OooOOOo();
        int i2 = (iOooO0Oo2 - iOooO0Oo) - iOooOOOo;
        if (iOooO0Oo > iOooO0Oo2) {
            i2 = (iOooO0Oo - iOooO0Oo2) - iOooOOOo;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iOooO0Oo + i3;
        int i5 = i4 + iOooOOOo;
        if (iOooO0Oo > iOooO0Oo2) {
            i4 = iOooO0Oo - i3;
            i5 = i4 - iOooOOOo;
        }
        constraintWidget.Oooo(i4, i5);
        OooO0oO(i + 1, constraintWidget, interfaceC0442OooO0O0);
    }

    public static void OooO0oO(int i, ConstraintWidget constraintWidget, OooO0O0.InterfaceC0442OooO0O0 interfaceC0442OooO0O0) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        ConstraintAnchor constraintAnchor5;
        if (constraintWidget.f4355OooOOOo) {
            return;
        }
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.OooO0o) && constraintWidget.OooOooo() && OooO00o(constraintWidget)) {
            androidx.constraintlayout.core.widgets.OooO0o.OooooO0(constraintWidget, interfaceC0442OooO0O0, new OooO0O0.OooO00o());
        }
        ConstraintAnchor constraintAnchorOooOOO = constraintWidget.OooOOO(ConstraintAnchor.Type.TOP);
        ConstraintAnchor constraintAnchorOooOOO2 = constraintWidget.OooOOO(ConstraintAnchor.Type.BOTTOM);
        int iOooO0Oo = constraintAnchorOooOOO.OooO0Oo();
        int iOooO0Oo2 = constraintAnchorOooOOO2.OooO0Oo();
        HashSet<ConstraintAnchor> hashSet = constraintAnchorOooOOO.f4331OooO00o;
        char c = 1;
        if (hashSet != null && constraintAnchorOooOOO.f4333OooO0OO) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f4334OooO0Oo;
                int i2 = i + 1;
                boolean zOooO00o = OooO00o(constraintWidget2);
                if (constraintWidget2.OooOooo() && zOooO00o) {
                    androidx.constraintlayout.core.widgets.OooO0o.OooooO0(constraintWidget2, interfaceC0442OooO0O0, new OooO0O0.OooO00o());
                }
                ConstraintAnchor constraintAnchor6 = constraintWidget2.f4378Oooo0o;
                ConstraintAnchor constraintAnchor7 = constraintWidget2.f4381Oooo0oo;
                char c2 = ((next == constraintAnchor6 && (constraintAnchor5 = constraintAnchor7.f4335OooO0o) != null && constraintAnchor5.f4333OooO0OO) || (next == constraintAnchor7 && (constraintAnchor4 = constraintAnchor6.f4335OooO0o) != null && constraintAnchor4.f4333OooO0OO)) ? c : (char) 0;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.f4387OoooOOO[c];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour != dimensionBehaviour2 || zOooO00o) {
                    if (!constraintWidget2.OooOooo()) {
                        if (next == constraintAnchor6 && constraintAnchor7.f4335OooO0o == null) {
                            int iOooO0o0 = constraintAnchor6.OooO0o0() + iOooO0Oo;
                            constraintWidget2.Oooo(iOooO0o0, constraintWidget2.OooOOOo() + iOooO0o0);
                            OooO0oO(i2, constraintWidget2, interfaceC0442OooO0O0);
                        } else if (next == constraintAnchor7 && constraintAnchor6.f4335OooO0o == null) {
                            int iOooO0o1 = iOooO0Oo - constraintAnchor7.OooO0o0();
                            constraintWidget2.Oooo(iOooO0o1 - constraintWidget2.OooOOOo(), iOooO0o1);
                            OooO0oO(i2, constraintWidget2, interfaceC0442OooO0O0);
                        } else if (c2 != 0 && !constraintWidget2.OooOooO()) {
                            OooO0o0(i2, constraintWidget2, interfaceC0442OooO0O0);
                        }
                    }
                } else if (dimensionBehaviour == dimensionBehaviour2 && constraintWidget2.f4366OooOoOO >= 0 && constraintWidget2.f4364OooOoO >= 0 && ((constraintWidget2.f4409o0OoOo0 == 8 || (constraintWidget2.f4360OooOo0 == 0 && constraintWidget2.f4391OoooOoo == 0.0f)) && !constraintWidget2.OooOooO() && !constraintWidget2.f4372Oooo0 && c2 != 0 && !constraintWidget2.OooOooO())) {
                    OooO0o(i2, constraintWidget, interfaceC0442OooO0O0, constraintWidget2);
                }
                c = 1;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.OooOO0) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = constraintAnchorOooOOO2.f4331OooO00o;
        if (hashSet2 != null && constraintAnchorOooOOO2.f4333OooO0OO) {
            Iterator<ConstraintAnchor> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f4334OooO0Oo;
                int i3 = i + 1;
                boolean zOooO00o2 = OooO00o(constraintWidget3);
                if (constraintWidget3.OooOooo() && zOooO00o2) {
                    androidx.constraintlayout.core.widgets.OooO0o.OooooO0(constraintWidget3, interfaceC0442OooO0O0, new OooO0O0.OooO00o());
                }
                ConstraintAnchor constraintAnchor8 = constraintWidget3.f4378Oooo0o;
                ConstraintAnchor constraintAnchor9 = constraintWidget3.f4381Oooo0oo;
                boolean z = (next2 == constraintAnchor8 && (constraintAnchor3 = constraintAnchor9.f4335OooO0o) != null && constraintAnchor3.f4333OooO0OO) || (next2 == constraintAnchor9 && (constraintAnchor2 = constraintAnchor8.f4335OooO0o) != null && constraintAnchor2.f4333OooO0OO);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.f4387OoooOOO[1];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour3 != dimensionBehaviour4 || zOooO00o2) {
                    if (constraintWidget3.OooOooo()) {
                        continue;
                    } else if (next2 == constraintAnchor8 && constraintAnchor9.f4335OooO0o == null) {
                        int iOooO0o2 = constraintAnchor8.OooO0o0() + iOooO0Oo2;
                        constraintWidget3.Oooo(iOooO0o2, constraintWidget3.OooOOOo() + iOooO0o2);
                        OooO0oO(i3, constraintWidget3, interfaceC0442OooO0O0);
                    } else if (next2 == constraintAnchor9 && constraintAnchor8.f4335OooO0o == null) {
                        int iOooO0o3 = iOooO0Oo2 - constraintAnchor9.OooO0o0();
                        constraintWidget3.Oooo(iOooO0o3 - constraintWidget3.OooOOOo(), iOooO0o3);
                        OooO0oO(i3, constraintWidget3, interfaceC0442OooO0O0);
                    } else if (z && !constraintWidget3.OooOooO()) {
                        OooO0o0(i3, constraintWidget3, interfaceC0442OooO0O0);
                    }
                } else if (dimensionBehaviour3 == dimensionBehaviour4 && constraintWidget3.f4366OooOoOO >= 0 && constraintWidget3.f4364OooOoO >= 0) {
                    if (constraintWidget3.f4409o0OoOo0 != 8) {
                        if (constraintWidget3.f4360OooOo0 == 0) {
                            if (constraintWidget3.f4391OoooOoo == 0.0f) {
                            }
                        }
                    }
                    if (!constraintWidget3.OooOooO() && !constraintWidget3.f4372Oooo0 && z && !constraintWidget3.OooOooO()) {
                        OooO0o(i3, constraintWidget, interfaceC0442OooO0O0, constraintWidget3);
                    }
                }
            }
        }
        ConstraintAnchor constraintAnchorOooOOO3 = constraintWidget.OooOOO(ConstraintAnchor.Type.BASELINE);
        if (constraintAnchorOooOOO3.f4331OooO00o != null && constraintAnchorOooOOO3.f4333OooO0OO) {
            int iOooO0Oo3 = constraintAnchorOooOOO3.OooO0Oo();
            for (ConstraintAnchor constraintAnchor10 : constraintAnchorOooOOO3.f4331OooO00o) {
                ConstraintWidget constraintWidget4 = constraintAnchor10.f4334OooO0Oo;
                int i4 = i + 1;
                boolean zOooO00o3 = OooO00o(constraintWidget4);
                if (constraintWidget4.OooOooo() && zOooO00o3) {
                    androidx.constraintlayout.core.widgets.OooO0o.OooooO0(constraintWidget4, interfaceC0442OooO0O0, new OooO0O0.OooO00o());
                }
                if (constraintWidget4.f4387OoooOOO[1] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || zOooO00o3) {
                    if (!constraintWidget4.OooOooo() && constraintAnchor10 == (constraintAnchor = constraintWidget4.f4371Oooo)) {
                        int iOooO0o4 = constraintAnchor10.OooO0o0() + iOooO0Oo3;
                        if (constraintWidget4.f4374Oooo00O) {
                            int i5 = iOooO0o4 - constraintWidget4.f4395OooooOO;
                            int i6 = constraintWidget4.f4390OoooOoO + i5;
                            constraintWidget4.f4394OooooO0 = i5;
                            constraintWidget4.f4378Oooo0o.OooOO0o(i5);
                            constraintWidget4.f4381Oooo0oo.OooOO0o(i6);
                            constraintAnchor.OooOO0o(iOooO0o4);
                            constraintWidget4.f4352OooOOO = true;
                        }
                        OooO0oO(i4, constraintWidget4, interfaceC0442OooO0O0);
                    }
                }
            }
        }
        constraintWidget.f4355OooOOOo = true;
    }
}
