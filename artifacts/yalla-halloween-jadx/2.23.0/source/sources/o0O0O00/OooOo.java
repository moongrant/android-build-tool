package o0O0O00;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends o0OoOo0 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final int[] f41873OooOO0O = new int[2];

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f41874OooO00o;

        static {
            int[] iArr = new int[o0OoOo0.OooO0O0.values().length];
            f41874OooO00o = iArr;
            try {
                iArr[o0OoOo0.OooO0O0.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41874OooO00o[o0OoOo0.OooO0O0.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41874OooO00o[o0OoOo0.OooO0O0.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public OooOo(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f41894OooO0oo.f41865OooO0o0 = OooOO0.OooO00o.LEFT;
        this.f41886OooO.f41865OooO0o0 = OooOO0.OooO00o.RIGHT;
        this.f41891OooO0o = 0;
    }

    public static void OooOOO0(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x026b  */
    /* JADX WARN: Code duplicated, block: B:120:0x027a  */
    @Override // o0O0O00.o0OoOo0, o0O0O00.OooO0o
    public final void OooO00o(OooO0o oooO0o) {
        int iOooO0oO;
        int i;
        int iOooO0oO2;
        float f;
        float f2;
        float f3;
        int i2;
        if (OooO00o.f41874OooO00o[this.f41895OooOO0.ordinal()] == 3) {
            ConstraintWidget constraintWidget = this.f41888OooO0O0;
            OooOO0o(constraintWidget.f4373Oooo0o0, constraintWidget.f4374Oooo0oO, 0);
            return;
        }
        OooOO0O oooOO0O = this.f41892OooO0o0;
        boolean z = oooOO0O.f41868OooOO0;
        OooOO0 oooOO1 = this.f41894OooO0oo;
        OooOO0 oooOO2 = this.f41886OooO;
        if (!z && this.f41890OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.f41888OooO0O0;
            int i3 = constraintWidget2.f4355OooOo00;
            if (i3 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.f4382OoooOOo;
                if (constraintWidget3 != null) {
                    OooOO0O oooOO0O2 = constraintWidget3.f4338OooO0Oo.f41892OooO0o0;
                    if (oooOO0O2.f41868OooOO0) {
                        oooOO0O.OooO0Oo((int) ((oooOO0O2.f41866OooO0oO * constraintWidget2.f4359OooOoO0) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = constraintWidget2.f4354OooOo0;
                if (i4 == 0 || i4 == 3) {
                    Oooo0 oooo0 = constraintWidget2.f4340OooO0o0;
                    OooOO0 oooOO3 = oooo0.f41894OooO0oo;
                    OooOO0 oooOO4 = oooo0.f41886OooO;
                    boolean z2 = constraintWidget2.f4373Oooo0o0.f4329OooO0o != null;
                    boolean z3 = constraintWidget2.f4372Oooo0o.f4329OooO0o != null;
                    boolean z4 = constraintWidget2.f4374Oooo0oO.f4329OooO0o != null;
                    boolean z5 = constraintWidget2.f4375Oooo0oo.f4329OooO0o != null;
                    int i5 = constraintWidget2.f4386Ooooo00;
                    if (z2 && z3 && z4 && z5) {
                        float f4 = constraintWidget2.f4385OoooOoo;
                        boolean z6 = oooOO3.f41868OooOO0;
                        int[] iArr = f41873OooOO0O;
                        if (z6 && oooOO4.f41868OooOO0) {
                            if (oooOO1.f41862OooO0OO && oooOO2.f41862OooO0OO) {
                                OooOOO0(iArr, ((OooOO0) oooOO1.f41870OooOO0o.get(0)).f41866OooO0oO + oooOO1.f41864OooO0o, ((OooOO0) oooOO2.f41870OooOO0o.get(0)).f41866OooO0oO - oooOO2.f41864OooO0o, oooOO3.f41866OooO0oO + oooOO3.f41864OooO0o, oooOO4.f41866OooO0oO - oooOO4.f41864OooO0o, f4, i5);
                                oooOO0O.OooO0Oo(iArr[0]);
                                this.f41888OooO0O0.f4340OooO0o0.f41892OooO0o0.OooO0Oo(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z7 = oooOO1.f41868OooOO0;
                        ArrayList arrayList = oooOO3.f41870OooOO0o;
                        if (z7 && oooOO2.f41868OooOO0) {
                            if (!oooOO3.f41862OooO0OO || !oooOO4.f41862OooO0OO) {
                                return;
                            }
                            OooOOO0(iArr, oooOO1.f41866OooO0oO + oooOO1.f41864OooO0o, oooOO2.f41866OooO0oO - oooOO2.f41864OooO0o, ((OooOO0) arrayList.get(0)).f41866OooO0oO + oooOO3.f41864OooO0o, ((OooOO0) oooOO4.f41870OooOO0o.get(0)).f41866OooO0oO - oooOO4.f41864OooO0o, f4, i5);
                            oooOO0O.OooO0Oo(iArr[0]);
                            this.f41888OooO0O0.f4340OooO0o0.f41892OooO0o0.OooO0Oo(iArr[1]);
                        }
                        if (!oooOO1.f41862OooO0OO || !oooOO2.f41862OooO0OO || !oooOO3.f41862OooO0OO || !oooOO4.f41862OooO0OO) {
                            return;
                        }
                        OooOOO0(iArr, ((OooOO0) oooOO1.f41870OooOO0o.get(0)).f41866OooO0oO + oooOO1.f41864OooO0o, ((OooOO0) oooOO2.f41870OooOO0o.get(0)).f41866OooO0oO - oooOO2.f41864OooO0o, ((OooOO0) arrayList.get(0)).f41866OooO0oO + oooOO3.f41864OooO0o, ((OooOO0) oooOO4.f41870OooOO0o.get(0)).f41866OooO0oO - oooOO4.f41864OooO0o, f4, i5);
                        oooOO0O.OooO0Oo(iArr[0]);
                        this.f41888OooO0O0.f4340OooO0o0.f41892OooO0o0.OooO0Oo(iArr[1]);
                    } else if (z2 && z4) {
                        if (!oooOO1.f41862OooO0OO || !oooOO2.f41862OooO0OO) {
                            return;
                        }
                        float f5 = constraintWidget2.f4385OoooOoo;
                        int i6 = ((OooOO0) oooOO1.f41870OooOO0o.get(0)).f41866OooO0oO + oooOO1.f41864OooO0o;
                        int i7 = ((OooOO0) oooOO2.f41870OooOO0o.get(0)).f41866OooO0oO - oooOO2.f41864OooO0o;
                        if (i5 == -1 || i5 == 0) {
                            int iOooO0oO3 = OooO0oO(i7 - i6, 0);
                            int i8 = (int) ((iOooO0oO3 * f5) + 0.5f);
                            int iOooO0oO4 = OooO0oO(i8, 1);
                            if (i8 != iOooO0oO4) {
                                iOooO0oO3 = (int) ((iOooO0oO4 / f5) + 0.5f);
                            }
                            oooOO0O.OooO0Oo(iOooO0oO3);
                            this.f41888OooO0O0.f4340OooO0o0.f41892OooO0o0.OooO0Oo(iOooO0oO4);
                        } else if (i5 == 1) {
                            int iOooO0oO5 = OooO0oO(i7 - i6, 0);
                            int i9 = (int) ((iOooO0oO5 / f5) + 0.5f);
                            int iOooO0oO6 = OooO0oO(i9, 1);
                            if (i9 != iOooO0oO6) {
                                iOooO0oO5 = (int) ((iOooO0oO6 * f5) + 0.5f);
                            }
                            oooOO0O.OooO0Oo(iOooO0oO5);
                            this.f41888OooO0O0.f4340OooO0o0.f41892OooO0o0.OooO0Oo(iOooO0oO6);
                        }
                    } else if (z3 && z5) {
                        if (!oooOO3.f41862OooO0OO || !oooOO4.f41862OooO0OO) {
                            return;
                        }
                        float f6 = constraintWidget2.f4385OoooOoo;
                        int i10 = ((OooOO0) oooOO3.f41870OooOO0o.get(0)).f41866OooO0oO + oooOO3.f41864OooO0o;
                        int i11 = ((OooOO0) oooOO4.f41870OooOO0o.get(0)).f41866OooO0oO - oooOO4.f41864OooO0o;
                        if (i5 == -1) {
                            iOooO0oO = OooO0oO(i11 - i10, 1);
                            i = (int) ((iOooO0oO / f6) + 0.5f);
                            iOooO0oO2 = OooO0oO(i, 0);
                            if (i != iOooO0oO2) {
                                iOooO0oO = (int) ((iOooO0oO2 * f6) + 0.5f);
                            }
                            oooOO0O.OooO0Oo(iOooO0oO2);
                            this.f41888OooO0O0.f4340OooO0o0.f41892OooO0o0.OooO0Oo(iOooO0oO);
                        } else if (i5 == 0) {
                            int iOooO0oO7 = OooO0oO(i11 - i10, 1);
                            int i12 = (int) ((iOooO0oO7 * f6) + 0.5f);
                            int iOooO0oO8 = OooO0oO(i12, 0);
                            if (i12 != iOooO0oO8) {
                                iOooO0oO7 = (int) ((iOooO0oO8 / f6) + 0.5f);
                            }
                            oooOO0O.OooO0Oo(iOooO0oO8);
                            this.f41888OooO0O0.f4340OooO0o0.f41892OooO0o0.OooO0Oo(iOooO0oO7);
                        } else if (i5 == 1) {
                            iOooO0oO = OooO0oO(i11 - i10, 1);
                            i = (int) ((iOooO0oO / f6) + 0.5f);
                            iOooO0oO2 = OooO0oO(i, 0);
                            if (i != iOooO0oO2) {
                                iOooO0oO = (int) ((iOooO0oO2 * f6) + 0.5f);
                            }
                            oooOO0O.OooO0Oo(iOooO0oO2);
                            this.f41888OooO0O0.f4340OooO0o0.f41892OooO0o0.OooO0Oo(iOooO0oO);
                        }
                    }
                } else {
                    int i13 = constraintWidget2.f4386Ooooo00;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f3 = constraintWidget2.f4340OooO0o0.f41892OooO0o0.f41866OooO0oO / constraintWidget2.f4385OoooOoo;
                            i2 = (int) (f3 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f = constraintWidget2.f4340OooO0o0.f41892OooO0o0.f41866OooO0oO;
                            f2 = constraintWidget2.f4385OoooOoo;
                        }
                        oooOO0O.OooO0Oo(i2);
                    } else {
                        f = constraintWidget2.f4340OooO0o0.f41892OooO0o0.f41866OooO0oO;
                        f2 = constraintWidget2.f4385OoooOoo;
                    }
                    f3 = f * f2;
                    i2 = (int) (f3 + 0.5f);
                    oooOO0O.OooO0Oo(i2);
                }
            }
        }
        if (oooOO1.f41862OooO0OO && oooOO2.f41862OooO0OO) {
            if (oooOO1.f41868OooOO0 && oooOO2.f41868OooOO0 && oooOO0O.f41868OooOO0) {
                return;
            }
            boolean z8 = oooOO0O.f41868OooOO0;
            ArrayList arrayList2 = oooOO1.f41870OooOO0o;
            ArrayList arrayList3 = oooOO2.f41870OooOO0o;
            if (!z8 && this.f41890OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget constraintWidget4 = this.f41888OooO0O0;
                if (constraintWidget4.f4355OooOo00 == 0 && !constraintWidget4.OooOoo()) {
                    OooOO0 oooOO5 = (OooOO0) arrayList2.get(0);
                    OooOO0 oooOO6 = (OooOO0) arrayList3.get(0);
                    int i14 = oooOO5.f41866OooO0oO + oooOO1.f41864OooO0o;
                    int i15 = oooOO6.f41866OooO0oO + oooOO2.f41864OooO0o;
                    oooOO1.OooO0Oo(i14);
                    oooOO2.OooO0Oo(i15);
                    oooOO0O.OooO0Oo(i15 - i14);
                    return;
                }
            }
            if (!oooOO0O.f41868OooOO0 && this.f41890OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f41887OooO00o == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                int iMin = Math.min((((OooOO0) arrayList3.get(0)).f41866OooO0oO + oooOO2.f41864OooO0o) - (((OooOO0) arrayList2.get(0)).f41866OooO0oO + oooOO1.f41864OooO0o), oooOO0O.f41871OooOOO0);
                ConstraintWidget constraintWidget5 = this.f41888OooO0O0;
                int i16 = constraintWidget5.f4353OooOo;
                int iMax = Math.max(constraintWidget5.f4357OooOo0o, iMin);
                if (i16 > 0) {
                    iMax = Math.min(i16, iMax);
                }
                oooOO0O.OooO0Oo(iMax);
            }
            if (oooOO0O.f41868OooOO0) {
                OooOO0 oooOO7 = (OooOO0) arrayList2.get(0);
                OooOO0 oooOO8 = (OooOO0) arrayList3.get(0);
                int i17 = oooOO7.f41866OooO0oO;
                int i18 = oooOO1.f41864OooO0o + i17;
                int i19 = oooOO8.f41866OooO0oO;
                int i20 = oooOO2.f41864OooO0o + i19;
                float f7 = this.f41888OooO0O0.f4391Oooooo;
                if (oooOO7 == oooOO8) {
                    f7 = 0.5f;
                } else {
                    i17 = i18;
                    i19 = i20;
                }
                oooOO1.OooO0Oo((int) ((((i19 - i17) - oooOO0O.f41866OooO0oO) * f7) + i17 + 0.5f));
                oooOO2.OooO0Oo(oooOO1.f41866OooO0oO + oooOO0O.f41866OooO0oO);
            }
        }
    }

    @Override // o0O0O00.o0OoOo0
    public final void OooO0Oo() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget constraintWidget5 = this.f41888OooO0O0;
        boolean z = constraintWidget5.f4335OooO00o;
        OooOO0O oooOO0O = this.f41892OooO0o0;
        if (z) {
            oooOO0O.OooO0Oo(constraintWidget5.OooOo0O());
        }
        boolean z2 = oooOO0O.f41868OooOO0;
        OooOO0 oooOO1 = this.f41886OooO;
        OooOO0 oooOO2 = this.f41894OooO0oo;
        if (z2) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = this.f41890OooO0Oo;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour3 == dimensionBehaviour4 && (constraintWidget2 = (constraintWidget = this.f41888OooO0O0).f4382OoooOOo) != null && ((dimensionBehaviour = constraintWidget2.f4381OoooOOO[0]) == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour == dimensionBehaviour4)) {
                o0OoOo0.OooO0O0(oooOO2, constraintWidget2.f4338OooO0Oo.f41894OooO0oo, constraintWidget.f4373Oooo0o0.OooO0o0());
                o0OoOo0.OooO0O0(oooOO1, constraintWidget2.f4338OooO0Oo.f41886OooO, -this.f41888OooO0O0.f4374Oooo0oO.OooO0o0());
                return;
            }
        } else {
            ConstraintWidget constraintWidget6 = this.f41888OooO0O0;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = constraintWidget6.f4381OoooOOO[0];
            this.f41890OooO0Oo = dimensionBehaviour5;
            if (dimensionBehaviour5 != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (dimensionBehaviour5 == dimensionBehaviour6 && (constraintWidget4 = constraintWidget6.f4382OoooOOo) != null && ((dimensionBehaviour2 = constraintWidget4.f4381OoooOOO[0]) == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour2 == dimensionBehaviour6)) {
                    int iOooOo0O = (constraintWidget4.OooOo0O() - this.f41888OooO0O0.f4373Oooo0o0.OooO0o0()) - this.f41888OooO0O0.f4374Oooo0oO.OooO0o0();
                    o0OoOo0.OooO0O0(oooOO2, constraintWidget4.f4338OooO0Oo.f41894OooO0oo, this.f41888OooO0O0.f4373Oooo0o0.OooO0o0());
                    o0OoOo0.OooO0O0(oooOO1, constraintWidget4.f4338OooO0Oo.f41886OooO, -this.f41888OooO0O0.f4374Oooo0oO.OooO0o0());
                    oooOO0O.OooO0Oo(iOooOo0O);
                    return;
                }
                if (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED) {
                    oooOO0O.OooO0Oo(constraintWidget6.OooOo0O());
                }
            }
        }
        if (oooOO0O.f41868OooOO0) {
            ConstraintWidget constraintWidget7 = this.f41888OooO0O0;
            if (constraintWidget7.f4335OooO00o) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.f4376OoooO;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f4329OooO0o;
                if (constraintAnchor2 != null && constraintAnchorArr[1].f4329OooO0o != null) {
                    if (constraintWidget7.OooOoo()) {
                        oooOO2.f41864OooO0o = this.f41888OooO0O0.f4376OoooO[0].OooO0o0();
                        oooOO1.f41864OooO0o = -this.f41888OooO0O0.f4376OoooO[1].OooO0o0();
                        return;
                    }
                    OooOO0 oooOO0OooO0oo = o0OoOo0.OooO0oo(this.f41888OooO0O0.f4376OoooO[0]);
                    if (oooOO0OooO0oo != null) {
                        o0OoOo0.OooO0O0(oooOO2, oooOO0OooO0oo, this.f41888OooO0O0.f4376OoooO[0].OooO0o0());
                    }
                    OooOO0 oooOO0OooO0oo2 = o0OoOo0.OooO0oo(this.f41888OooO0O0.f4376OoooO[1]);
                    if (oooOO0OooO0oo2 != null) {
                        o0OoOo0.OooO0O0(oooOO1, oooOO0OooO0oo2, -this.f41888OooO0O0.f4376OoooO[1].OooO0o0());
                    }
                    oooOO2.f41861OooO0O0 = true;
                    oooOO1.f41861OooO0O0 = true;
                    return;
                }
                if (constraintAnchor2 != null) {
                    OooOO0 oooOO0OooO0oo3 = o0OoOo0.OooO0oo(constraintAnchor);
                    if (oooOO0OooO0oo3 != null) {
                        o0OoOo0.OooO0O0(oooOO2, oooOO0OooO0oo3, this.f41888OooO0O0.f4376OoooO[0].OooO0o0());
                        o0OoOo0.OooO0O0(oooOO1, oooOO2, oooOO0O.f41866OooO0oO);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                if (constraintAnchor3.f4329OooO0o != null) {
                    OooOO0 oooOO0OooO0oo4 = o0OoOo0.OooO0oo(constraintAnchor3);
                    if (oooOO0OooO0oo4 != null) {
                        o0OoOo0.OooO0O0(oooOO1, oooOO0OooO0oo4, -this.f41888OooO0O0.f4376OoooO[1].OooO0o0());
                        o0OoOo0.OooO0O0(oooOO2, oooOO1, -oooOO0O.f41866OooO0oO);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof oo0o0Oo.OooO00o) || constraintWidget7.f4382OoooOOo == null || constraintWidget7.OooOOO(ConstraintAnchor.Type.CENTER).f4329OooO0o != null) {
                    return;
                }
                ConstraintWidget constraintWidget8 = this.f41888OooO0O0;
                o0OoOo0.OooO0O0(oooOO2, constraintWidget8.f4382OoooOOo.f4338OooO0Oo.f41894OooO0oo, constraintWidget8.OooOo0o());
                o0OoOo0.OooO0O0(oooOO1, oooOO2, oooOO0O.f41866OooO0oO);
                return;
            }
        }
        if (this.f41890OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget9 = this.f41888OooO0O0;
            int i = constraintWidget9.f4355OooOo00;
            ArrayList arrayList = oooOO0O.f41869OooOO0O;
            ArrayList arrayList2 = oooOO0O.f41870OooOO0o;
            if (i == 2) {
                ConstraintWidget constraintWidget10 = constraintWidget9.f4382OoooOOo;
                if (constraintWidget10 != null) {
                    OooOO0O oooOO0O2 = constraintWidget10.f4340OooO0o0.f41892OooO0o0;
                    arrayList2.add(oooOO0O2);
                    oooOO0O2.f41869OooOO0O.add(oooOO0O);
                    oooOO0O.f41861OooO0O0 = true;
                    arrayList.add(oooOO2);
                    arrayList.add(oooOO1);
                }
            } else if (i == 3) {
                if (constraintWidget9.f4354OooOo0 == 3) {
                    oooOO2.f41860OooO00o = this;
                    oooOO1.f41860OooO00o = this;
                    Oooo0 oooo0 = constraintWidget9.f4340OooO0o0;
                    oooo0.f41894OooO0oo.f41860OooO00o = this;
                    oooo0.f41886OooO.f41860OooO00o = this;
                    oooOO0O.f41860OooO00o = this;
                    if (constraintWidget9.OooOooO()) {
                        arrayList2.add(this.f41888OooO0O0.f4340OooO0o0.f41892OooO0o0);
                        this.f41888OooO0O0.f4340OooO0o0.f41892OooO0o0.f41869OooOO0O.add(oooOO0O);
                        Oooo0 oooo1 = this.f41888OooO0O0.f4340OooO0o0;
                        oooo1.f41892OooO0o0.f41860OooO00o = this;
                        arrayList2.add(oooo1.f41894OooO0oo);
                        arrayList2.add(this.f41888OooO0O0.f4340OooO0o0.f41886OooO);
                        this.f41888OooO0O0.f4340OooO0o0.f41894OooO0oo.f41869OooOO0O.add(oooOO0O);
                        this.f41888OooO0O0.f4340OooO0o0.f41886OooO.f41869OooOO0O.add(oooOO0O);
                    } else if (this.f41888OooO0O0.OooOoo()) {
                        this.f41888OooO0O0.f4340OooO0o0.f41892OooO0o0.f41870OooOO0o.add(oooOO0O);
                        arrayList.add(this.f41888OooO0O0.f4340OooO0o0.f41892OooO0o0);
                    } else {
                        this.f41888OooO0O0.f4340OooO0o0.f41892OooO0o0.f41870OooOO0o.add(oooOO0O);
                    }
                } else {
                    OooOO0O oooOO0O3 = constraintWidget9.f4340OooO0o0.f41892OooO0o0;
                    arrayList2.add(oooOO0O3);
                    oooOO0O3.f41869OooOO0O.add(oooOO0O);
                    this.f41888OooO0O0.f4340OooO0o0.f41894OooO0oo.f41869OooOO0O.add(oooOO0O);
                    this.f41888OooO0O0.f4340OooO0o0.f41886OooO.f41869OooOO0O.add(oooOO0O);
                    oooOO0O.f41861OooO0O0 = true;
                    arrayList.add(oooOO2);
                    arrayList.add(oooOO1);
                    oooOO2.f41870OooOO0o.add(oooOO0O);
                    oooOO1.f41870OooOO0o.add(oooOO0O);
                }
            }
        }
        ConstraintWidget constraintWidget11 = this.f41888OooO0O0;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget11.f4376OoooO;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.f4329OooO0o;
        if (constraintAnchor5 != null && constraintAnchorArr2[1].f4329OooO0o != null) {
            if (constraintWidget11.OooOoo()) {
                oooOO2.f41864OooO0o = this.f41888OooO0O0.f4376OoooO[0].OooO0o0();
                oooOO1.f41864OooO0o = -this.f41888OooO0O0.f4376OoooO[1].OooO0o0();
                return;
            }
            OooOO0 oooOO0OooO0oo5 = o0OoOo0.OooO0oo(this.f41888OooO0O0.f4376OoooO[0]);
            OooOO0 oooOO0OooO0oo6 = o0OoOo0.OooO0oo(this.f41888OooO0O0.f4376OoooO[1]);
            if (oooOO0OooO0oo5 != null) {
                oooOO0OooO0oo5.OooO0O0(this);
            }
            if (oooOO0OooO0oo6 != null) {
                oooOO0OooO0oo6.OooO0O0(this);
            }
            this.f41895OooOO0 = o0OoOo0.OooO0O0.CENTER;
            return;
        }
        if (constraintAnchor5 != null) {
            OooOO0 oooOO0OooO0oo7 = o0OoOo0.OooO0oo(constraintAnchor4);
            if (oooOO0OooO0oo7 != null) {
                o0OoOo0.OooO0O0(oooOO2, oooOO0OooO0oo7, this.f41888OooO0O0.f4376OoooO[0].OooO0o0());
                OooO0OO(oooOO1, oooOO2, 1, oooOO0O);
                return;
            }
            return;
        }
        ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
        if (constraintAnchor6.f4329OooO0o != null) {
            OooOO0 oooOO0OooO0oo8 = o0OoOo0.OooO0oo(constraintAnchor6);
            if (oooOO0OooO0oo8 != null) {
                o0OoOo0.OooO0O0(oooOO1, oooOO0OooO0oo8, -this.f41888OooO0O0.f4376OoooO[1].OooO0o0());
                OooO0OO(oooOO2, oooOO1, -1, oooOO0O);
                return;
            }
            return;
        }
        if ((constraintWidget11 instanceof oo0o0Oo.OooO00o) || (constraintWidget3 = constraintWidget11.f4382OoooOOo) == null) {
            return;
        }
        o0OoOo0.OooO0O0(oooOO2, constraintWidget3.f4338OooO0Oo.f41894OooO0oo, constraintWidget11.OooOo0o());
        OooO0OO(oooOO1, oooOO2, 1, oooOO0O);
    }

    @Override // o0O0O00.o0OoOo0
    public final void OooO0o() {
        this.f41889OooO0OO = null;
        this.f41894OooO0oo.OooO0OO();
        this.f41886OooO.OooO0OO();
        this.f41892OooO0o0.OooO0OO();
        this.f41893OooO0oO = false;
    }

    @Override // o0O0O00.o0OoOo0
    public final void OooO0o0() {
        OooOO0 oooOO1 = this.f41894OooO0oo;
        if (oooOO1.f41868OooOO0) {
            this.f41888OooO0O0.f4387Ooooo0o = oooOO1.f41866OooO0oO;
        }
    }

    @Override // o0O0O00.o0OoOo0
    public final boolean OooOO0O() {
        return this.f41890OooO0Oo != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f41888OooO0O0.f4355OooOo00 == 0;
    }

    public final void OooOOO() {
        this.f41893OooO0oO = false;
        OooOO0 oooOO1 = this.f41894OooO0oo;
        oooOO1.OooO0OO();
        oooOO1.f41868OooOO0 = false;
        OooOO0 oooOO2 = this.f41886OooO;
        oooOO2.OooO0OO();
        oooOO2.f41868OooOO0 = false;
        this.f41892OooO0o0.f41868OooOO0 = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f41888OooO0O0.f4396o00O0O;
    }
}
