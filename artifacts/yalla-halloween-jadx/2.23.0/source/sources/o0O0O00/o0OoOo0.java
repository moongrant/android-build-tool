package o0O0O00;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0OoOo0 implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f41887OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ConstraintWidget f41888OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Oooo000 f41889OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ConstraintWidget.DimensionBehaviour f41890OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOO0O f41892OooO0o0 = new OooOO0O(this);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f41891OooO0o = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f41893OooO0oO = false;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOO0 f41894OooO0oo = new OooOO0(this);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOO0 f41886OooO = new OooOO0(this);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooO0O0 f41895OooOO0 = OooO0O0.NONE;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f41896OooO00o;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f41896OooO00o = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41896OooO00o[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41896OooO00o[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41896OooO00o[ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41896OooO00o[ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum OooO0O0 {
        NONE,
        START,
        END,
        CENTER
    }

    public o0OoOo0(ConstraintWidget constraintWidget) {
        this.f41888OooO0O0 = constraintWidget;
    }

    public static OooOO0 OooO(ConstraintAnchor constraintAnchor, int i) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f4329OooO0o;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f4328OooO0Oo;
        o0OoOo0 o0oooo0 = i == 0 ? constraintWidget.f4338OooO0Oo : constraintWidget.f4340OooO0o0;
        int i2 = OooO00o.f41896OooO00o[constraintAnchor2.f4330OooO0o0.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return o0oooo0.f41886OooO;
        }
        return o0oooo0.f41894OooO0oo;
    }

    public static void OooO0O0(OooOO0 oooOO1, OooOO0 oooOO2, int i) {
        oooOO1.f41870OooOO0o.add(oooOO2);
        oooOO1.f41864OooO0o = i;
        oooOO2.f41869OooOO0O.add(oooOO1);
    }

    public static OooOO0 OooO0oo(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f4329OooO0o;
        if (constraintAnchor2 == null) {
            return null;
        }
        int i = OooO00o.f41896OooO00o[constraintAnchor2.f4330OooO0o0.ordinal()];
        ConstraintWidget constraintWidget = constraintAnchor2.f4328OooO0Oo;
        if (i == 1) {
            return constraintWidget.f4338OooO0Oo.f41894OooO0oo;
        }
        if (i == 2) {
            return constraintWidget.f4338OooO0Oo.f41886OooO;
        }
        if (i == 3) {
            return constraintWidget.f4340OooO0o0.f41894OooO0oo;
        }
        if (i == 4) {
            return constraintWidget.f4340OooO0o0.f41875OooOO0O;
        }
        if (i != 5) {
            return null;
        }
        return constraintWidget.f4340OooO0o0.f41886OooO;
    }

    @Override // o0O0O00.OooO0o
    public void OooO00o(OooO0o oooO0o) {
    }

    public final void OooO0OO(OooOO0 oooOO1, OooOO0 oooOO2, int i, OooOO0O oooOO0O) {
        oooOO1.f41870OooOO0o.add(oooOO2);
        oooOO1.f41870OooOO0o.add(this.f41892OooO0o0);
        oooOO1.f41867OooO0oo = i;
        oooOO1.f41859OooO = oooOO0O;
        oooOO2.f41869OooOO0O.add(oooOO1);
        oooOO0O.f41869OooOO0O.add(oooOO1);
    }

    public abstract void OooO0Oo();

    public abstract void OooO0o();

    public abstract void OooO0o0();

    public final int OooO0oO(int i, int i2) {
        int iMax;
        if (i2 == 0) {
            ConstraintWidget constraintWidget = this.f41888OooO0O0;
            int i3 = constraintWidget.f4353OooOo;
            iMax = Math.max(constraintWidget.f4357OooOo0o, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f41888OooO0O0;
            int i4 = constraintWidget2.f4360OooOoOO;
            iMax = Math.max(constraintWidget2.f4358OooOoO, i);
            if (i4 > 0) {
                iMax = Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    public long OooOO0() {
        OooOO0O oooOO0O = this.f41892OooO0o0;
        if (oooOO0O.f41868OooOO0) {
            return oooOO0O.f41866OooO0oO;
        }
        return 0L;
    }

    public abstract boolean OooOO0O();

    /* JADX WARN: Code duplicated, block: B:29:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    public final void OooOO0o(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        OooOO0O oooOO0O;
        float f;
        int i2;
        OooOO0 oooOO0OooO0oo = OooO0oo(constraintAnchor);
        OooOO0 oooOO0OooO0oo2 = OooO0oo(constraintAnchor2);
        if (oooOO0OooO0oo.f41868OooOO0 && oooOO0OooO0oo2.f41868OooOO0) {
            int iOooO0o0 = constraintAnchor.OooO0o0() + oooOO0OooO0oo.f41866OooO0oO;
            int iOooO0o1 = oooOO0OooO0oo2.f41866OooO0oO - constraintAnchor2.OooO0o0();
            int i3 = iOooO0o1 - iOooO0o0;
            OooOO0O oooOO0O2 = this.f41892OooO0o0;
            if (!oooOO0O2.f41868OooOO0) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f41890OooO0Oo;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour == dimensionBehaviour2) {
                    int i4 = this.f41887OooO00o;
                    if (i4 == 0) {
                        oooOO0O2.OooO0Oo(OooO0oO(i3, i));
                    } else if (i4 == 1) {
                        oooOO0O2.OooO0Oo(Math.min(OooO0oO(oooOO0O2.f41871OooOOO0, i), i3));
                    } else if (i4 == 2) {
                        ConstraintWidget constraintWidget = this.f41888OooO0O0;
                        ConstraintWidget constraintWidget2 = constraintWidget.f4382OoooOOo;
                        if (constraintWidget2 != null) {
                            OooOO0O oooOO0O3 = (i == 0 ? constraintWidget2.f4338OooO0Oo : constraintWidget2.f4340OooO0o0).f41892OooO0o0;
                            if (oooOO0O3.f41868OooOO0) {
                                oooOO0O2.OooO0Oo(OooO0oO((int) ((oooOO0O3.f41866OooO0oO * (i == 0 ? constraintWidget.f4359OooOoO0 : constraintWidget.f4362OooOoo0)) + 0.5f), i));
                            }
                        }
                    } else if (i4 == 3) {
                        ConstraintWidget constraintWidget3 = this.f41888OooO0O0;
                        o0OoOo0 o0oooo0 = constraintWidget3.f4338OooO0Oo;
                        if (o0oooo0.f41890OooO0Oo == dimensionBehaviour2 && o0oooo0.f41887OooO00o == 3) {
                            Oooo0 oooo0 = constraintWidget3.f4340OooO0o0;
                            if (oooo0.f41890OooO0Oo != dimensionBehaviour2 || oooo0.f41887OooO00o != 3) {
                                if (i == 0) {
                                    o0oooo0 = constraintWidget3.f4340OooO0o0;
                                }
                                oooOO0O = o0oooo0.f41892OooO0o0;
                                if (oooOO0O.f41868OooOO0) {
                                    f = constraintWidget3.f4385OoooOoo;
                                    if (i == 1) {
                                        i2 = (int) ((oooOO0O.f41866OooO0oO / f) + 0.5f);
                                    } else {
                                        i2 = (int) ((f * oooOO0O.f41866OooO0oO) + 0.5f);
                                    }
                                    oooOO0O2.OooO0Oo(i2);
                                }
                            }
                        } else {
                            if (i == 0) {
                                o0oooo0 = constraintWidget3.f4340OooO0o0;
                            }
                            oooOO0O = o0oooo0.f41892OooO0o0;
                            if (oooOO0O.f41868OooOO0) {
                                f = constraintWidget3.f4385OoooOoo;
                                if (i == 1) {
                                    i2 = (int) ((oooOO0O.f41866OooO0oO / f) + 0.5f);
                                } else {
                                    i2 = (int) ((f * oooOO0O.f41866OooO0oO) + 0.5f);
                                }
                                oooOO0O2.OooO0Oo(i2);
                            }
                        }
                    }
                }
            }
            if (oooOO0O2.f41868OooOO0) {
                int i5 = oooOO0O2.f41866OooO0oO;
                OooOO0 oooOO1 = this.f41886OooO;
                OooOO0 oooOO2 = this.f41894OooO0oo;
                if (i5 == i3) {
                    oooOO2.OooO0Oo(iOooO0o0);
                    oooOO1.OooO0Oo(iOooO0o1);
                    return;
                }
                ConstraintWidget constraintWidget4 = this.f41888OooO0O0;
                float f2 = i == 0 ? constraintWidget4.f4391Oooooo : constraintWidget4.f4393OoooooO;
                if (oooOO0OooO0oo == oooOO0OooO0oo2) {
                    iOooO0o0 = oooOO0OooO0oo.f41866OooO0oO;
                    iOooO0o1 = oooOO0OooO0oo2.f41866OooO0oO;
                    f2 = 0.5f;
                }
                oooOO2.OooO0Oo((int) ((((iOooO0o1 - iOooO0o0) - i5) * f2) + iOooO0o0 + 0.5f));
                oooOO1.OooO0Oo(oooOO2.f41866OooO0oO + oooOO0O2.f41866OooO0oO);
            }
        }
    }
}
