package o0O0O00;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final androidx.constraintlayout.core.widgets.OooO0o f41089OooO00o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final androidx.constraintlayout.core.widgets.OooO0o f41092OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO0O0.InterfaceC0442OooO0O0 f41093OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0O0.OooO00o f41095OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ArrayList<Oooo000> f41096OooO0oo;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f41090OooO0O0 = true;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f41091OooO0OO = true;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ArrayList<o0OoOo0> f41094OooO0o0 = new ArrayList<>();

    public OooO(androidx.constraintlayout.core.widgets.OooO0o oooO0o) {
        new ArrayList();
        this.f41093OooO0o = null;
        this.f41095OooO0oO = new OooO0O0.OooO00o();
        this.f41096OooO0oo = new ArrayList<>();
        this.f41089OooO00o = oooO0o;
        this.f41092OooO0Oo = oooO0o;
    }

    public final void OooO00o(OooOO0 oooOO1, int i, int i2, ArrayList arrayList, Oooo000 oooo000) {
        o0OoOo0 o0oooo1 = oooOO1.f41116OooO0Oo;
        if (o0oooo1.f41142OooO0OO == null) {
            androidx.constraintlayout.core.widgets.OooO0o oooO0o = this.f41089OooO00o;
            if (o0oooo1 == oooO0o.f4344OooO0Oo || o0oooo1 == oooO0o.f4346OooO0o0) {
                return;
            }
            if (oooo000 == null) {
                oooo000 = new Oooo000(o0oooo1);
                arrayList.add(oooo000);
            }
            o0oooo1.f41142OooO0OO = oooo000;
            oooo000.f41132OooO0O0.add(o0oooo1);
            OooOO0 oooOO2 = o0oooo1.f41147OooO0oo;
            for (OooO0o oooO0o2 : oooOO2.f41122OooOO0O) {
                if (oooO0o2 instanceof OooOO0) {
                    OooO00o((OooOO0) oooO0o2, i, 0, arrayList, oooo000);
                }
            }
            OooOO0 oooOO3 = o0oooo1.f41139OooO;
            for (OooO0o oooO0o3 : oooOO3.f41122OooOO0O) {
                if (oooO0o3 instanceof OooOO0) {
                    OooO00o((OooOO0) oooO0o3, i, 1, arrayList, oooo000);
                }
            }
            if (i == 1 && (o0oooo1 instanceof Oooo0)) {
                for (OooO0o oooO0o4 : ((Oooo0) o0oooo1).f41128OooOO0O.f41122OooOO0O) {
                    if (oooO0o4 instanceof OooOO0) {
                        OooO00o((OooOO0) oooO0o4, i, 2, arrayList, oooo000);
                    }
                }
            }
            Iterator it = oooOO2.f41123OooOO0o.iterator();
            while (it.hasNext()) {
                OooO00o((OooOO0) it.next(), i, 0, arrayList, oooo000);
            }
            Iterator it2 = oooOO3.f41123OooOO0o.iterator();
            while (it2.hasNext()) {
                OooO00o((OooOO0) it2.next(), i, 1, arrayList, oooo000);
            }
            if (i == 1 && (o0oooo1 instanceof Oooo0)) {
                Iterator it3 = ((Oooo0) o0oooo1).f41128OooOO0O.f41123OooOO0o.iterator();
                while (it3.hasNext()) {
                    OooO00o((OooOO0) it3.next(), i, 2, arrayList, oooo000);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:163:0x0279 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x01a0  */
    public final void OooO0O0(androidx.constraintlayout.core.widgets.OooO0o oooO0o) {
        int i;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        for (ConstraintWidget constraintWidget : oooO0o.f60342o0OOO0o) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f4387OoooOOO;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[1];
            if (constraintWidget.f4409o0OoOo0 == 8) {
                constraintWidget.f4341OooO00o = true;
            } else {
                float f = constraintWidget.f4365OooOoO0;
                if (f < 1.0f && dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.f4361OooOo00 = 2;
                }
                float f2 = constraintWidget.f4368OooOoo0;
                if (f2 < 1.0f && dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    constraintWidget.f4360OooOo0 = 2;
                }
                if (constraintWidget.f4391OoooOoo > 0.0f) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour6 && (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.f4361OooOo00 = 3;
                    } else if (dimensionBehaviour5 == dimensionBehaviour6 && (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        constraintWidget.f4360OooOo0 = 3;
                    } else if (dimensionBehaviour4 == dimensionBehaviour6 && dimensionBehaviour5 == dimensionBehaviour6) {
                        if (constraintWidget.f4361OooOo00 == 0) {
                            constraintWidget.f4361OooOo00 = 3;
                        }
                        if (constraintWidget.f4360OooOo0 == 0) {
                            constraintWidget.f4360OooOo0 = 3;
                        }
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                ConstraintAnchor constraintAnchor = constraintWidget.f4380Oooo0oO;
                ConstraintAnchor constraintAnchor2 = constraintWidget.f4379Oooo0o0;
                if (dimensionBehaviour4 == dimensionBehaviour7 && constraintWidget.f4361OooOo00 == 1 && (constraintAnchor2.f4335OooO0o == null || constraintAnchor.f4335OooO0o == null)) {
                    dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintAnchor constraintAnchor3 = constraintWidget.f4381Oooo0oo;
                ConstraintAnchor constraintAnchor4 = constraintWidget.f4378Oooo0o;
                if (dimensionBehaviour5 == dimensionBehaviour7 && constraintWidget.f4360OooOo0 == 1 && (constraintAnchor4.f4335OooO0o == null || constraintAnchor3.f4335OooO0o == null)) {
                    dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = dimensionBehaviour5;
                OooOo oooOo = constraintWidget.f4344OooO0Oo;
                oooOo.f41143OooO0Oo = dimensionBehaviour4;
                int i2 = constraintWidget.f4361OooOo00;
                oooOo.f41140OooO00o = i2;
                Oooo0 oooo0 = constraintWidget.f4346OooO0o0;
                oooo0.f41143OooO0Oo = dimensionBehaviour8;
                int i3 = constraintWidget.f4360OooOo0;
                oooo0.f41140OooO00o = i3;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if ((dimensionBehaviour4 == dimensionBehaviour9 || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour8 == dimensionBehaviour9 || dimensionBehaviour8 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour8 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    int iOooOo0O = constraintWidget.OooOo0O();
                    if (dimensionBehaviour4 == dimensionBehaviour9) {
                        iOooOo0O = (oooO0o.OooOo0O() - constraintAnchor2.f4337OooO0oO) - constraintAnchor.f4337OooO0oO;
                        dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    int iOooOOOo = constraintWidget.OooOOOo();
                    if (dimensionBehaviour8 == dimensionBehaviour9) {
                        int iOooOOOo2 = (oooO0o.OooOOOo() - constraintAnchor4.f4337OooO0oO) - constraintAnchor3.f4337OooO0oO;
                        dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.FIXED;
                        i = iOooOOOo2;
                    } else {
                        i = iOooOOOo;
                    }
                    OooO0o(constraintWidget, dimensionBehaviour4, iOooOo0O, dimensionBehaviour8, i);
                    constraintWidget.f4344OooO0Oo.f41145OooO0o0.OooO0Oo(constraintWidget.OooOo0O());
                    constraintWidget.f4346OooO0o0.f41145OooO0o0.OooO0Oo(constraintWidget.OooOOOo());
                    constraintWidget.f4341OooO00o = true;
                } else {
                    ConstraintAnchor[] constraintAnchorArr = constraintWidget.f4382OoooO;
                    if (dimensionBehaviour4 != dimensionBehaviour7 || (dimensionBehaviour8 != (dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && dimensionBehaviour8 != ConstraintWidget.DimensionBehaviour.FIXED)) {
                        dimensionBehaviour = dimensionBehaviour8;
                        if (dimensionBehaviour != dimensionBehaviour7 && (dimensionBehaviour4 == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                            if (i3 == 3) {
                                if (dimensionBehaviour4 == dimensionBehaviour2) {
                                    OooO0o(constraintWidget, dimensionBehaviour2, 0, dimensionBehaviour2, 0);
                                }
                                int iOooOo0O2 = constraintWidget.OooOo0O();
                                float f3 = constraintWidget.f4391OoooOoo;
                                if (constraintWidget.f4392Ooooo00 == -1) {
                                    f3 = 1.0f / f3;
                                }
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = ConstraintWidget.DimensionBehaviour.FIXED;
                                OooO0o(constraintWidget, dimensionBehaviour10, iOooOo0O2, dimensionBehaviour10, (int) ((iOooOo0O2 * f3) + 0.5f));
                                constraintWidget.f4344OooO0Oo.f41145OooO0o0.OooO0Oo(constraintWidget.OooOo0O());
                                constraintWidget.f4346OooO0o0.f41145OooO0o0.OooO0Oo(constraintWidget.OooOOOo());
                                constraintWidget.f4341OooO00o = true;
                            } else if (i3 == 1) {
                                OooO0o(constraintWidget, dimensionBehaviour4, 0, dimensionBehaviour2, 0);
                                constraintWidget.f4346OooO0o0.f41145OooO0o0.f41124OooOOO0 = constraintWidget.OooOOOo();
                            } else if (i3 == 2) {
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = oooO0o.f4387OoooOOO[1];
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.FIXED;
                                if (dimensionBehaviour11 == dimensionBehaviour12 || dimensionBehaviour11 == dimensionBehaviour9) {
                                    OooO0o(constraintWidget, dimensionBehaviour4, constraintWidget.OooOo0O(), dimensionBehaviour12, (int) ((f2 * oooO0o.OooOOOo()) + 0.5f));
                                    constraintWidget.f4344OooO0Oo.f41145OooO0o0.OooO0Oo(constraintWidget.OooOo0O());
                                    constraintWidget.f4346OooO0o0.f41145OooO0o0.OooO0Oo(constraintWidget.OooOOOo());
                                    constraintWidget.f4341OooO00o = true;
                                }
                            } else if (constraintAnchorArr[2].f4335OooO0o == null || constraintAnchorArr[3].f4335OooO0o == null) {
                                OooO0o(constraintWidget, dimensionBehaviour2, 0, dimensionBehaviour, 0);
                                constraintWidget.f4344OooO0Oo.f41145OooO0o0.OooO0Oo(constraintWidget.OooOo0O());
                                constraintWidget.f4346OooO0o0.f41145OooO0o0.OooO0Oo(constraintWidget.OooOOOo());
                                constraintWidget.f4341OooO00o = true;
                            }
                        }
                        if (dimensionBehaviour4 != dimensionBehaviour7 && dimensionBehaviour == dimensionBehaviour7) {
                            if (i2 == 1 || i3 == 1) {
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                OooO0o(constraintWidget, dimensionBehaviour13, 0, dimensionBehaviour13, 0);
                                constraintWidget.f4344OooO0Oo.f41145OooO0o0.f41124OooOOO0 = constraintWidget.OooOo0O();
                                constraintWidget.f4346OooO0o0.f41145OooO0o0.f41124OooOOO0 = constraintWidget.OooOOOo();
                            } else if (i3 == 2 && i2 == 2) {
                                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = oooO0o.f4387OoooOOO;
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = dimensionBehaviourArr2[0];
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = ConstraintWidget.DimensionBehaviour.FIXED;
                                if (dimensionBehaviour14 == dimensionBehaviour15 && dimensionBehaviourArr2[1] == dimensionBehaviour15) {
                                    OooO0o(constraintWidget, dimensionBehaviour15, (int) ((f * oooO0o.OooOo0O()) + 0.5f), dimensionBehaviour15, (int) ((f2 * oooO0o.OooOOOo()) + 0.5f));
                                    constraintWidget.f4344OooO0Oo.f41145OooO0o0.OooO0Oo(constraintWidget.OooOo0O());
                                    constraintWidget.f4346OooO0o0.f41145OooO0o0.OooO0Oo(constraintWidget.OooOOOo());
                                    constraintWidget.f4341OooO00o = true;
                                }
                            }
                        }
                    } else if (i2 == 3) {
                        if (dimensionBehaviour8 == dimensionBehaviour3) {
                            OooO0o(constraintWidget, dimensionBehaviour3, 0, dimensionBehaviour3, 0);
                        }
                        int iOooOOOo3 = constraintWidget.OooOOOo();
                        int i4 = (int) ((iOooOOOo3 * constraintWidget.f4391OoooOoo) + 0.5f);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = ConstraintWidget.DimensionBehaviour.FIXED;
                        OooO0o(constraintWidget, dimensionBehaviour16, i4, dimensionBehaviour16, iOooOOOo3);
                        constraintWidget.f4344OooO0Oo.f41145OooO0o0.OooO0Oo(constraintWidget.OooOo0O());
                        constraintWidget.f4346OooO0o0.f41145OooO0o0.OooO0Oo(constraintWidget.OooOOOo());
                        constraintWidget.f4341OooO00o = true;
                    } else if (i2 == 1) {
                        OooO0o(constraintWidget, dimensionBehaviour3, 0, dimensionBehaviour8, 0);
                        constraintWidget.f4344OooO0Oo.f41145OooO0o0.f41124OooOOO0 = constraintWidget.OooOo0O();
                    } else {
                        dimensionBehaviour = dimensionBehaviour8;
                        if (i2 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = oooO0o.f4387OoooOOO[0];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour17 == dimensionBehaviour18 || dimensionBehaviour17 == dimensionBehaviour9) {
                                OooO0o(constraintWidget, dimensionBehaviour18, (int) ((f * oooO0o.OooOo0O()) + 0.5f), dimensionBehaviour, constraintWidget.OooOOOo());
                                constraintWidget.f4344OooO0Oo.f41145OooO0o0.OooO0Oo(constraintWidget.OooOo0O());
                                constraintWidget.f4346OooO0o0.f41145OooO0o0.OooO0Oo(constraintWidget.OooOOOo());
                                constraintWidget.f4341OooO00o = true;
                            } else {
                                if (dimensionBehaviour != dimensionBehaviour7) {
                                }
                                if (dimensionBehaviour4 != dimensionBehaviour7) {
                                }
                            }
                        } else if (constraintAnchorArr[0].f4335OooO0o == null || constraintAnchorArr[1].f4335OooO0o == null) {
                            OooO0o(constraintWidget, dimensionBehaviour3, 0, dimensionBehaviour, 0);
                            constraintWidget.f4344OooO0Oo.f41145OooO0o0.OooO0Oo(constraintWidget.OooOo0O());
                            constraintWidget.f4346OooO0o0.f41145OooO0o0.OooO0Oo(constraintWidget.OooOOOo());
                            constraintWidget.f4341OooO00o = true;
                        } else {
                            if (dimensionBehaviour != dimensionBehaviour7) {
                            }
                            if (dimensionBehaviour4 != dimensionBehaviour7) {
                            }
                        }
                    }
                }
            }
        }
    }

    public final void OooO0OO() {
        ArrayList<o0OoOo0> arrayList = this.f41094OooO0o0;
        arrayList.clear();
        androidx.constraintlayout.core.widgets.OooO0o oooO0o = this.f41092OooO0Oo;
        oooO0o.f4344OooO0Oo.OooO0o();
        oooO0o.f4346OooO0o0.OooO0o();
        arrayList.add(oooO0o.f4344OooO0Oo);
        arrayList.add(oooO0o.f4346OooO0o0);
        HashSet hashSet = null;
        for (ConstraintWidget constraintWidget : oooO0o.f60342o0OOO0o) {
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.OooOO0) {
                arrayList.add(new OooOOOO(constraintWidget));
            } else {
                if (constraintWidget.OooOoo()) {
                    if (constraintWidget.f4342OooO0O0 == null) {
                        constraintWidget.f4342OooO0O0 = new OooO0OO(0, constraintWidget);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f4342OooO0O0);
                } else {
                    arrayList.add(constraintWidget.f4344OooO0Oo);
                }
                if (constraintWidget.OooOooO()) {
                    if (constraintWidget.f4343OooO0OO == null) {
                        constraintWidget.f4343OooO0OO = new OooO0OO(1, constraintWidget);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f4343OooO0OO);
                } else {
                    arrayList.add(constraintWidget.f4346OooO0o0);
                }
                if (constraintWidget instanceof oo0o0Oo.OooO0O0) {
                    arrayList.add(new OooOo00(constraintWidget));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<o0OoOo0> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().OooO0o();
        }
        for (o0OoOo0 o0oooo1 : arrayList) {
            if (o0oooo1.f41141OooO0O0 != oooO0o) {
                o0oooo1.OooO0Oo();
            }
        }
        ArrayList<Oooo000> arrayList2 = this.f41096OooO0oo;
        arrayList2.clear();
        androidx.constraintlayout.core.widgets.OooO0o oooO0o2 = this.f41089OooO00o;
        OooO0o0(oooO0o2.f4344OooO0Oo, 0, arrayList2);
        OooO0o0(oooO0o2.f4346OooO0o0, 1, arrayList2);
        this.f41090OooO0O0 = false;
    }

    public final int OooO0Oo(androidx.constraintlayout.core.widgets.OooO0o oooO0o, int i) {
        long jOooOO0;
        ArrayList<Oooo000> arrayList;
        int i2;
        long jMax;
        float f;
        long j;
        ArrayList<Oooo000> arrayList2 = this.f41096OooO0oo;
        int size = arrayList2.size();
        int i3 = 0;
        long jMax2 = 0;
        while (i3 < size) {
            o0OoOo0 o0oooo1 = arrayList2.get(i3).f41131OooO00o;
            if (!(o0oooo1 instanceof OooO0OO) ? !(i != 0 ? (o0oooo1 instanceof Oooo0) : (o0oooo1 instanceof OooOo)) : ((OooO0OO) o0oooo1).f41144OooO0o != i) {
                OooOO0 oooOO1 = (i == 0 ? oooO0o.f4344OooO0Oo : oooO0o.f4346OooO0o0).f41147OooO0oo;
                OooOO0 oooOO2 = (i == 0 ? oooO0o.f4344OooO0Oo : oooO0o.f4346OooO0o0).f41139OooO;
                boolean zContains = o0oooo1.f41147OooO0oo.f41123OooOO0o.contains(oooOO1);
                OooOO0 oooOO3 = o0oooo1.f41139OooO;
                boolean zContains2 = oooOO3.f41123OooOO0o.contains(oooOO2);
                long jOooOO1 = o0oooo1.OooOO0();
                OooOO0 oooOO4 = o0oooo1.f41147OooO0oo;
                if (zContains && zContains2) {
                    long jOooO0O0 = Oooo000.OooO0O0(oooOO4, 0L);
                    long jOooO00o = Oooo000.OooO00o(oooOO3, 0L);
                    long j2 = jOooO0O0 - jOooOO1;
                    int i4 = oooOO3.f41117OooO0o;
                    arrayList = arrayList2;
                    i2 = size;
                    if (j2 >= (-i4)) {
                        j2 += (long) i4;
                    }
                    long j3 = j2;
                    long j4 = (-jOooO00o) - jOooOO1;
                    long j5 = oooOO4.f41117OooO0o;
                    long j6 = j4 - j5;
                    if (j6 >= j5) {
                        j6 -= j5;
                    }
                    ConstraintWidget constraintWidget = o0oooo1.f41141OooO0O0;
                    if (i == 0) {
                        f = constraintWidget.f4397Oooooo;
                    } else if (i == 1) {
                        f = constraintWidget.f4399OoooooO;
                    } else {
                        constraintWidget.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j = (long) ((j3 / (1.0f - f)) + (j6 / f));
                    } else {
                        j = 0;
                    }
                    float f2 = j;
                    jOooOO0 = (((long) oooOO4.f41117OooO0o) + ((((long) ((f2 * f) + 0.5f)) + jOooOO1) + ((long) OooOo.OooO0o.OooO00o(1.0f, f, f2, 0.5f)))) - ((long) oooOO3.f41117OooO0o);
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    if (zContains) {
                        jMax = Math.max(Oooo000.OooO0O0(oooOO4, oooOO4.f41117OooO0o), ((long) oooOO4.f41117OooO0o) + jOooOO1);
                    } else if (zContains2) {
                        jMax = Math.max(-Oooo000.OooO00o(oooOO3, oooOO3.f41117OooO0o), ((long) (-oooOO3.f41117OooO0o)) + jOooOO1);
                    } else {
                        jOooOO0 = (o0oooo1.OooOO0() + ((long) oooOO4.f41117OooO0o)) - ((long) oooOO3.f41117OooO0o);
                    }
                    jOooOO0 = jMax;
                }
            } else {
                jOooOO0 = 0;
                arrayList = arrayList2;
                i2 = size;
            }
            jMax2 = Math.max(jMax2, jOooOO0);
            i3++;
            arrayList2 = arrayList;
            size = i2;
        }
        return (int) jMax2;
    }

    public final void OooO0o(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i2) {
        OooO0O0.OooO00o oooO00o = this.f41095OooO0oO;
        oooO00o.f41101OooO00o = dimensionBehaviour;
        oooO00o.f41102OooO0O0 = dimensionBehaviour2;
        oooO00o.f41103OooO0OO = i;
        oooO00o.f41104OooO0Oo = i2;
        this.f41093OooO0o.OooO0O0(constraintWidget, oooO00o);
        constraintWidget.o000oOoO(oooO00o.f41106OooO0o0);
        constraintWidget.OoooO00(oooO00o.f41105OooO0o);
        constraintWidget.f4374Oooo00O = oooO00o.f41108OooO0oo;
        int i3 = oooO00o.f41107OooO0oO;
        constraintWidget.f4395OooooOO = i3;
        constraintWidget.f4374Oooo00O = i3 > 0;
    }

    public final void OooO0o0(o0OoOo0 o0oooo1, int i, ArrayList<Oooo000> arrayList) {
        OooOO0 oooOO1;
        Iterator it = o0oooo1.f41147OooO0oo.f41122OooOO0O.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            oooOO1 = o0oooo1.f41139OooO;
            if (!zHasNext) {
                break;
            }
            OooO0o oooO0o = (OooO0o) it.next();
            if (oooO0o instanceof OooOO0) {
                OooO00o((OooOO0) oooO0o, i, 0, arrayList, null);
            } else if (oooO0o instanceof o0OoOo0) {
                OooO00o(((o0OoOo0) oooO0o).f41147OooO0oo, i, 0, arrayList, null);
            }
        }
        for (OooO0o oooO0o2 : oooOO1.f41122OooOO0O) {
            if (oooO0o2 instanceof OooOO0) {
                OooO00o((OooOO0) oooO0o2, i, 1, arrayList, null);
            } else if (oooO0o2 instanceof o0OoOo0) {
                OooO00o(((o0OoOo0) oooO0o2).f41139OooO, i, 1, arrayList, null);
            }
        }
        if (i == 1) {
            for (OooO0o oooO0o3 : ((Oooo0) o0oooo1).f41128OooOO0O.f41122OooOO0O) {
                if (oooO0o3 instanceof OooOO0) {
                    OooO00o((OooOO0) oooO0o3, i, 2, arrayList, null);
                }
            }
        }
    }

    public final void OooO0oO() {
        OooO00o oooO00o;
        for (ConstraintWidget constraintWidget : this.f41089OooO00o.f60342o0OOO0o) {
            if (!constraintWidget.f4341OooO00o) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f4387OoooOOO;
                boolean z = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i = constraintWidget.f4361OooOo00;
                int i2 = constraintWidget.f4360OooOo0;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z2 = dimensionBehaviour == dimensionBehaviour3 || (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i == 1);
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                OooOO0O oooOO0O = constraintWidget.f4344OooO0Oo.f41145OooO0o0;
                boolean z3 = oooOO0O.f41121OooOO0;
                OooOO0O oooOO0O2 = constraintWidget.f4346OooO0o0.f41145OooO0o0;
                boolean z4 = oooOO0O2.f41121OooOO0;
                if (z3 && z4) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    OooO0o(constraintWidget, dimensionBehaviour4, oooOO0O.f41119OooO0oO, dimensionBehaviour4, oooOO0O2.f41119OooO0oO);
                    constraintWidget.f4341OooO00o = true;
                } else if (z3 && z) {
                    OooO0o(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, oooOO0O.f41119OooO0oO, dimensionBehaviour3, oooOO0O2.f41119OooO0oO);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.f4346OooO0o0.f41145OooO0o0.f41124OooOOO0 = constraintWidget.OooOOOo();
                    } else {
                        constraintWidget.f4346OooO0o0.f41145OooO0o0.OooO0Oo(constraintWidget.OooOOOo());
                        constraintWidget.f4341OooO00o = true;
                    }
                } else if (z4 && z2) {
                    OooO0o(constraintWidget, dimensionBehaviour3, oooOO0O.f41119OooO0oO, ConstraintWidget.DimensionBehaviour.FIXED, oooOO0O2.f41119OooO0oO);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        constraintWidget.f4344OooO0Oo.f41145OooO0o0.f41124OooOOO0 = constraintWidget.OooOo0O();
                    } else {
                        constraintWidget.f4344OooO0Oo.f41145OooO0o0.OooO0Oo(constraintWidget.OooOo0O());
                        constraintWidget.f4341OooO00o = true;
                    }
                }
                if (constraintWidget.f4341OooO00o && (oooO00o = constraintWidget.f4346OooO0o0.f41129OooOO0o) != null) {
                    oooO00o.OooO0Oo(constraintWidget.f4395OooooOO);
                }
            }
        }
    }
}
