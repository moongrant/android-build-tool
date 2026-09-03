package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {
    /* JADX WARN: Code duplicated, block: B:177:0x0282  */
    /* JADX WARN: Code duplicated, block: B:197:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:199:0x02df  */
    /* JADX WARN: Code duplicated, block: B:201:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:203:0x0306  */
    /* JADX WARN: Code duplicated, block: B:291:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:64:0x0102  */
    public static void OooO00o(OooO0o oooO0o, androidx.constraintlayout.core.OooO0OO oooO0OO, ArrayList<ConstraintWidget> arrayList, int i) {
        int i2;
        OooO0OO[] oooO0OOArr;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        ConstraintAnchor[] constraintAnchorArr;
        OooO0OO[] oooO0OOArr2;
        int i6;
        int i7;
        ConstraintWidget constraintWidget;
        SolverVariable solverVariable;
        ConstraintAnchor constraintAnchor;
        SolverVariable solverVariable2;
        ConstraintAnchor constraintAnchor2;
        SolverVariable solverVariable3;
        ConstraintWidget constraintWidget2;
        SolverVariable solverVariable4;
        int size;
        float f;
        boolean z8;
        ConstraintAnchor constraintAnchor3;
        ConstraintWidget constraintWidget3;
        int i8;
        boolean z9;
        ConstraintWidget constraintWidget4;
        OooO0o oooO0o2 = oooO0o;
        if (i == 0) {
            i2 = oooO0o2.f4476o00000;
            oooO0OOArr = oooO0o2.f4482o00000OO;
            i3 = 0;
        } else {
            i2 = oooO0o2.f4481o00000O0;
            oooO0OOArr = oooO0o2.f4480o00000O;
            i3 = 2;
        }
        int i9 = 0;
        while (i9 < i2) {
            OooO0OO oooO0OO2 = oooO0OOArr[i9];
            boolean z10 = oooO0OO2.f4474OooOOo0;
            int i10 = 8;
            int i11 = 1;
            ConstraintWidget constraintWidget5 = oooO0OO2.f4459OooO00o;
            if (z10) {
                i4 = i9;
                i5 = i2;
                z = true;
            } else {
                int i12 = oooO0OO2.f4469OooOO0o;
                int i13 = i12 * 2;
                ConstraintWidget constraintWidget6 = constraintWidget5;
                ConstraintWidget constraintWidget7 = constraintWidget6;
                boolean z11 = false;
                while (!z11) {
                    oooO0OO2.f4458OooO += i11;
                    constraintWidget6.f4401o00oO0o[i12] = null;
                    constraintWidget6.f4407oo000o[i12] = null;
                    int i14 = constraintWidget6.f4403o0OoOo0;
                    ConstraintAnchor[] constraintAnchorArr2 = constraintWidget6.f4376OoooO;
                    if (i14 != i10) {
                        constraintWidget6.OooOOOO(i12);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        constraintAnchorArr2[i13].OooO0o0();
                        int i15 = i13 + 1;
                        constraintAnchorArr2[i15].OooO0o0();
                        constraintAnchorArr2[i13].OooO0o0();
                        constraintAnchorArr2[i15].OooO0o0();
                        if (oooO0OO2.f4460OooO0O0 == null) {
                            oooO0OO2.f4460OooO0O0 = constraintWidget6;
                        }
                        oooO0OO2.f4462OooO0Oo = constraintWidget6;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget6.f4381OoooOOO[i12];
                        if (dimensionBehaviour2 == dimensionBehaviour) {
                            int i16 = constraintWidget6.f4356OooOo0O[i12];
                            z9 = z11;
                            if (i16 == 0 || i16 == 3 || i16 == 2) {
                                oooO0OO2.f4467OooOO0++;
                                float f2 = constraintWidget6.f4402o00ooo[i12];
                                if (f2 > 0.0f) {
                                    oooO0OO2.f4468OooOO0O += f2;
                                }
                                if (constraintWidget6.f4403o0OoOo0 != 8 && dimensionBehaviour2 == dimensionBehaviour && (i16 == 0 || i16 == 3)) {
                                    if (f2 < 0.0f) {
                                        oooO0OO2.f4470OooOOO = true;
                                    } else {
                                        oooO0OO2.f4472OooOOOO = true;
                                    }
                                    if (oooO0OO2.f4466OooO0oo == null) {
                                        oooO0OO2.f4466OooO0oo = new ArrayList<>();
                                    }
                                    oooO0OO2.f4466OooO0oo.add(constraintWidget6);
                                }
                                if (oooO0OO2.f4463OooO0o == null) {
                                    oooO0OO2.f4463OooO0o = constraintWidget6;
                                }
                                ConstraintWidget constraintWidget8 = oooO0OO2.f4465OooO0oO;
                                if (constraintWidget8 != null) {
                                    constraintWidget8.f4407oo000o[i12] = constraintWidget6;
                                }
                                oooO0OO2.f4465OooO0oO = constraintWidget6;
                            }
                        } else {
                            z9 = z11;
                        }
                        i9 = i9;
                    } else {
                        z9 = z11;
                        i9 = i9;
                    }
                    ConstraintWidget constraintWidget9 = constraintWidget7;
                    if (constraintWidget9 != constraintWidget6) {
                        constraintWidget9.f4401o00oO0o[i12] = constraintWidget6;
                    }
                    ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[i13 + 1].f4329OooO0o;
                    if (constraintAnchor4 != null) {
                        constraintWidget4 = constraintAnchor4.f4328OooO0Oo;
                        ConstraintAnchor constraintAnchor5 = constraintWidget4.f4376OoooO[i13].f4329OooO0o;
                        if (constraintAnchor5 == null || constraintAnchor5.f4328OooO0Oo != constraintWidget6) {
                            constraintWidget4 = null;
                        }
                    } else {
                        constraintWidget4 = null;
                    }
                    if (constraintWidget4 != null) {
                        z11 = z9;
                    } else {
                        constraintWidget4 = constraintWidget6;
                        z11 = true;
                    }
                    constraintWidget7 = constraintWidget6;
                    i9 = i9;
                    i2 = i2;
                    i11 = 1;
                    i10 = 8;
                    constraintWidget6 = constraintWidget4;
                }
                i4 = i9;
                i5 = i2;
                ConstraintWidget constraintWidget10 = oooO0OO2.f4460OooO0O0;
                if (constraintWidget10 != null) {
                    constraintWidget10.f4376OoooO[i13].OooO0o0();
                }
                ConstraintWidget constraintWidget11 = oooO0OO2.f4462OooO0Oo;
                if (constraintWidget11 != null) {
                    constraintWidget11.f4376OoooO[i13 + 1].OooO0o0();
                }
                oooO0OO2.f4461OooO0OO = constraintWidget6;
                if (i12 == 0 && oooO0OO2.f4471OooOOO0) {
                    oooO0OO2.f4464OooO0o0 = constraintWidget6;
                } else {
                    oooO0OO2.f4464OooO0o0 = constraintWidget5;
                }
                oooO0OO2.f4473OooOOOo = oooO0OO2.f4472OooOOOO && oooO0OO2.f4470OooOOO;
                z = true;
            }
            oooO0OO2.f4474OooOOo0 = z;
            if (arrayList == 0 || arrayList.contains(constraintWidget5)) {
                ConstraintWidget constraintWidget12 = oooO0OO2.f4461OooO0OO;
                ConstraintWidget constraintWidget13 = oooO0OO2.f4460OooO0O0;
                ConstraintWidget constraintWidget14 = oooO0OO2.f4462OooO0Oo;
                ConstraintWidget constraintWidget15 = oooO0OO2.f4464OooO0o0;
                float f3 = oooO0OO2.f4468OooOO0O;
                boolean z12 = oooO0o2.f4381OoooOOO[i] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (i == 0) {
                    int i17 = constraintWidget15.f4398o00Ooo;
                    boolean z13 = i17 == 0;
                    z3 = i17 == 1;
                    if (i17 == 2) {
                        z4 = z13;
                        z5 = z4;
                        z6 = z3;
                        z7 = true;
                    } else {
                        z2 = z13;
                        z5 = z2;
                        z6 = z3;
                        z7 = false;
                    }
                } else {
                    int i18 = constraintWidget15.f4399o00o0O;
                    boolean z14 = i18 == 0;
                    boolean z15 = i18 == 1;
                    if (i18 == 2) {
                        z4 = z14;
                        z3 = z15;
                        z5 = z4;
                        z6 = z3;
                        z7 = true;
                    } else {
                        z2 = z14;
                        z3 = z15;
                        z5 = z2;
                        z6 = z3;
                        z7 = false;
                    }
                }
                ConstraintWidget constraintWidget16 = constraintWidget5;
                boolean z16 = false;
                while (true) {
                    constraintAnchorArr = oooO0o2.f4376OoooO;
                    if (z16) {
                        break;
                    }
                    float f4 = f3;
                    ConstraintAnchor constraintAnchor6 = constraintWidget16.f4376OoooO[i3];
                    int i19 = z7 ? 1 : 4;
                    int iOooO0o0 = constraintAnchor6.OooO0o0();
                    boolean z17 = z16;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget16.f4381OoooOOO[i];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    boolean z18 = dimensionBehaviour3 == dimensionBehaviour4 && constraintWidget16.f4356OooOo0O[i] == 0;
                    ConstraintAnchor constraintAnchor7 = constraintAnchor6.f4329OooO0o;
                    if (constraintAnchor7 != null && constraintWidget16 != constraintWidget5) {
                        iOooO0o0 = constraintAnchor7.OooO0o0() + iOooO0o0;
                    }
                    int i20 = iOooO0o0;
                    if (z7 && constraintWidget16 != constraintWidget5 && constraintWidget16 != constraintWidget13) {
                        i19 = 8;
                    }
                    ConstraintAnchor constraintAnchor8 = constraintAnchor6.f4329OooO0o;
                    if (constraintAnchor8 != null) {
                        if (constraintWidget16 == constraintWidget13) {
                            oooO0OO.OooO0o(constraintAnchor6.f4324OooO, constraintAnchor8.f4324OooO, i20, 6);
                        } else {
                            oooO0OO.OooO0o(constraintAnchor6.f4324OooO, constraintAnchor8.f4324OooO, i20, 8);
                        }
                        if (z18 && !z7) {
                            i19 = 5;
                        }
                        oooO0OO.OooO0o0(constraintAnchor6.f4324OooO, constraintAnchor6.f4329OooO0o.f4324OooO, i20, (constraintWidget16 == constraintWidget13 && z7 && constraintWidget16.f4395o000oOoO[i]) ? 5 : i19);
                    } else {
                        oooO0OO2 = oooO0OO2;
                        constraintWidget5 = constraintWidget5;
                    }
                    ConstraintAnchor[] constraintAnchorArr3 = constraintWidget16.f4376OoooO;
                    if (z12) {
                        if (constraintWidget16.f4403o0OoOo0 == 8 || constraintWidget16.f4381OoooOOO[i] != dimensionBehaviour4) {
                            i8 = 0;
                        } else {
                            i8 = 0;
                            oooO0OO.OooO0o(constraintAnchorArr3[i3 + 1].f4324OooO, constraintAnchorArr3[i3].f4324OooO, 0, 5);
                        }
                        oooO0OO.OooO0o(constraintAnchorArr3[i3].f4324OooO, constraintAnchorArr[i3].f4324OooO, i8, 8);
                    }
                    ConstraintAnchor constraintAnchor9 = constraintAnchorArr3[i3 + 1].f4329OooO0o;
                    if (constraintAnchor9 != null) {
                        constraintWidget3 = constraintAnchor9.f4328OooO0Oo;
                        ConstraintAnchor constraintAnchor10 = constraintWidget3.f4376OoooO[i3].f4329OooO0o;
                        if (constraintAnchor10 == null || constraintAnchor10.f4328OooO0Oo != constraintWidget16) {
                            constraintWidget3 = null;
                        }
                    } else {
                        constraintWidget3 = null;
                    }
                    if (constraintWidget3 != null) {
                        constraintWidget16 = constraintWidget3;
                        z16 = z17;
                    } else {
                        z16 = true;
                    }
                    f3 = f4;
                    constraintWidget15 = constraintWidget15;
                    oooO0OOArr = oooO0OOArr;
                    constraintWidget5 = constraintWidget5;
                    oooO0OO2 = oooO0OO2;
                }
                OooO0OO oooO0OO3 = oooO0OO2;
                ConstraintWidget constraintWidget17 = constraintWidget15;
                float f5 = f3;
                ConstraintWidget constraintWidget18 = constraintWidget5;
                oooO0OOArr2 = oooO0OOArr;
                if (constraintWidget14 != null) {
                    int i21 = i3 + 1;
                    if (constraintWidget12.f4376OoooO[i21].f4329OooO0o != null) {
                        ConstraintAnchor constraintAnchor11 = constraintWidget14.f4376OoooO[i21];
                        if ((constraintWidget14.f4381OoooOOO[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget14.f4356OooOo0O[i] == 0) && !z7) {
                            ConstraintAnchor constraintAnchor12 = constraintAnchor11.f4329OooO0o;
                            if (constraintAnchor12.f4328OooO0Oo == oooO0o2) {
                                oooO0OO.OooO0o0(constraintAnchor11.f4324OooO, constraintAnchor12.f4324OooO, -constraintAnchor11.OooO0o0(), 5);
                            } else if (z7) {
                                constraintAnchor3 = constraintAnchor11.f4329OooO0o;
                                if (constraintAnchor3.f4328OooO0Oo == oooO0o2) {
                                    oooO0OO.OooO0o0(constraintAnchor11.f4324OooO, constraintAnchor3.f4324OooO, -constraintAnchor11.OooO0o0(), 4);
                                }
                            }
                        } else if (z7) {
                            constraintAnchor3 = constraintAnchor11.f4329OooO0o;
                            if (constraintAnchor3.f4328OooO0Oo == oooO0o2) {
                                oooO0OO.OooO0o0(constraintAnchor11.f4324OooO, constraintAnchor3.f4324OooO, -constraintAnchor11.OooO0o0(), 4);
                            }
                        }
                        oooO0OO.OooO0oO(constraintAnchor11.f4324OooO, constraintWidget12.f4376OoooO[i21].f4329OooO0o.f4324OooO, -constraintAnchor11.OooO0o0(), 6);
                    }
                }
                if (z12) {
                    int i22 = i3 + 1;
                    SolverVariable solverVariable5 = constraintAnchorArr[i22].f4324OooO;
                    ConstraintAnchor constraintAnchor13 = constraintWidget12.f4376OoooO[i22];
                    oooO0OO.OooO0o(solverVariable5, constraintAnchor13.f4324OooO, constraintAnchor13.OooO0o0(), 8);
                }
                ArrayList<ConstraintWidget> arrayList2 = oooO0OO3.f4466OooO0oo;
                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                    if (oooO0OO3.f4470OooOOO && !oooO0OO3.f4473OooOOOo) {
                        f5 = oooO0OO3.f4467OooOO0;
                    }
                    ConstraintWidget constraintWidget19 = null;
                    float f6 = 0.0f;
                    int i23 = 0;
                    while (i23 < size) {
                        ConstraintWidget constraintWidget20 = arrayList2.get(i23);
                        float f7 = constraintWidget20.f4402o00ooo[i];
                        ConstraintAnchor[] constraintAnchorArr4 = constraintWidget20.f4376OoooO;
                        if (f7 < 0.0f) {
                            if (oooO0OO3.f4473OooOOOo) {
                                oooO0OO.OooO0o0(constraintAnchorArr4[i3 + 1].f4324OooO, constraintAnchorArr4[i3].f4324OooO, 0, 4);
                                z8 = false;
                            } else {
                                f7 = 1.0f;
                                f = 0.0f;
                            }
                            arrayList2 = arrayList2;
                            size = size;
                            i23++;
                            arrayList2 = arrayList2;
                            size = size;
                        } else {
                            f = 0.0f;
                        }
                        if (f7 == f) {
                            z8 = false;
                            oooO0OO.OooO0o0(constraintAnchorArr4[i3 + 1].f4324OooO, constraintAnchorArr4[i3].f4324OooO, 0, 8);
                            arrayList2 = arrayList2;
                            size = size;
                        } else {
                            if (constraintWidget19 != null) {
                                ConstraintAnchor[] constraintAnchorArr5 = constraintWidget19.f4376OoooO;
                                SolverVariable solverVariable6 = constraintAnchorArr5[i3].f4324OooO;
                                int i24 = i3 + 1;
                                SolverVariable solverVariable7 = constraintAnchorArr5[i24].f4324OooO;
                                SolverVariable solverVariable8 = constraintAnchorArr4[i3].f4324OooO;
                                SolverVariable solverVariable9 = constraintAnchorArr4[i24].f4324OooO;
                                androidx.constraintlayout.core.OooO0O0 oooO0O0OooOO0o = oooO0OO.OooOO0o();
                                oooO0O0OooOO0o.f4229OooO0O0 = 0.0f;
                                if (f5 == 0.0f || f6 == f7) {
                                    oooO0O0OooOO0o.f4231OooO0Oo.OooO0oo(solverVariable6, 1.0f);
                                    oooO0O0OooOO0o.f4231OooO0Oo.OooO0oo(solverVariable7, -1.0f);
                                    oooO0O0OooOO0o.f4231OooO0Oo.OooO0oo(solverVariable9, 1.0f);
                                    oooO0O0OooOO0o.f4231OooO0Oo.OooO0oo(solverVariable8, -1.0f);
                                } else if (f6 == 0.0f) {
                                    oooO0O0OooOO0o.f4231OooO0Oo.OooO0oo(solverVariable6, 1.0f);
                                    oooO0O0OooOO0o.f4231OooO0Oo.OooO0oo(solverVariable7, -1.0f);
                                } else if (f7 == f) {
                                    oooO0O0OooOO0o.f4231OooO0Oo.OooO0oo(solverVariable8, 1.0f);
                                    oooO0O0OooOO0o.f4231OooO0Oo.OooO0oo(solverVariable9, -1.0f);
                                } else {
                                    float f8 = (f6 / f5) / (f7 / f5);
                                    oooO0O0OooOO0o.f4231OooO0Oo.OooO0oo(solverVariable6, 1.0f);
                                    oooO0O0OooOO0o.f4231OooO0Oo.OooO0oo(solverVariable7, -1.0f);
                                    oooO0O0OooOO0o.f4231OooO0Oo.OooO0oo(solverVariable9, f8);
                                    oooO0O0OooOO0o.f4231OooO0Oo.OooO0oo(solverVariable8, -f8);
                                }
                                oooO0OO.OooO0OO(oooO0O0OooOO0o);
                            } else {
                                constraintWidget20 = constraintWidget20;
                            }
                            f6 = f7;
                            constraintWidget19 = constraintWidget20;
                        }
                        i23++;
                        arrayList2 = arrayList2;
                        size = size;
                    }
                }
                int i25 = 4;
                if (constraintWidget13 == null || !(constraintWidget13 == constraintWidget14 || z7)) {
                    i6 = i4;
                    ConstraintWidget constraintWidget21 = constraintWidget18;
                    if (!z5 || constraintWidget13 == null) {
                        i4 = i6;
                        int i26 = 8;
                        if (z6 && constraintWidget13 != null) {
                            int i27 = oooO0OO3.f4467OooOO0;
                            boolean z19 = i27 > 0 && oooO0OO3.f4458OooO == i27;
                            ConstraintWidget constraintWidget22 = constraintWidget13;
                            ConstraintWidget constraintWidget23 = constraintWidget22;
                            while (constraintWidget22 != null) {
                                ConstraintWidget constraintWidget24 = constraintWidget22.f4401o00oO0o[i];
                                while (constraintWidget24 != null && constraintWidget24.f4403o0OoOo0 == i26) {
                                    constraintWidget24 = constraintWidget24.f4401o00oO0o[i];
                                }
                                if (constraintWidget22 == constraintWidget13 || constraintWidget22 == constraintWidget14 || constraintWidget24 == null) {
                                    i7 = i26;
                                    i25 = i25;
                                    constraintWidget = constraintWidget23;
                                } else {
                                    ConstraintWidget constraintWidget25 = constraintWidget24 == constraintWidget14 ? null : constraintWidget24;
                                    ConstraintAnchor[] constraintAnchorArr6 = constraintWidget22.f4376OoooO;
                                    ConstraintAnchor constraintAnchor14 = constraintAnchorArr6[i3];
                                    SolverVariable solverVariable10 = constraintAnchor14.f4324OooO;
                                    int i28 = i3 + 1;
                                    SolverVariable solverVariable11 = constraintWidget23.f4376OoooO[i28].f4324OooO;
                                    int iOooO0o1 = constraintAnchor14.OooO0o0();
                                    int iOooO0o2 = constraintAnchorArr6[i28].OooO0o0();
                                    if (constraintWidget25 != null) {
                                        constraintAnchor = constraintWidget25.f4376OoooO[i3];
                                        solverVariable2 = constraintAnchor.f4324OooO;
                                        ConstraintAnchor constraintAnchor15 = constraintAnchor.f4329OooO0o;
                                        solverVariable = constraintAnchor15 != null ? constraintAnchor15.f4324OooO : null;
                                    } else {
                                        ConstraintAnchor constraintAnchor16 = constraintWidget14.f4376OoooO[i3];
                                        SolverVariable solverVariable12 = constraintAnchor16 != null ? constraintAnchor16.f4324OooO : null;
                                        solverVariable = constraintAnchorArr6[i28].f4324OooO;
                                        constraintAnchor = constraintAnchor16;
                                        solverVariable2 = solverVariable12;
                                    }
                                    int iOooO0o3 = constraintAnchor != null ? constraintAnchor.OooO0o0() + iOooO0o2 : iOooO0o2;
                                    int iOooO0o4 = constraintWidget23.f4376OoooO[i28].OooO0o0() + iOooO0o1;
                                    int i29 = z19 ? 8 : i25;
                                    if (solverVariable10 == null || solverVariable11 == null || solverVariable2 == null || solverVariable == null) {
                                        i7 = 8;
                                        constraintWidget = constraintWidget23;
                                    } else {
                                        SolverVariable solverVariable13 = solverVariable;
                                        constraintWidget = constraintWidget23;
                                        i7 = 8;
                                        oooO0OO.OooO0O0(solverVariable10, solverVariable11, iOooO0o4, 0.5f, solverVariable2, solverVariable13, iOooO0o3, i29);
                                    }
                                    constraintWidget24 = constraintWidget25;
                                }
                                constraintWidget23 = constraintWidget22.f4403o0OoOo0 != i7 ? constraintWidget22 : constraintWidget;
                                constraintWidget22 = constraintWidget24;
                                i26 = i7;
                                i25 = i25;
                            }
                            ConstraintAnchor constraintAnchor17 = constraintWidget13.f4376OoooO[i3];
                            ConstraintAnchor constraintAnchor18 = constraintWidget21.f4376OoooO[i3].f4329OooO0o;
                            int i30 = i3 + 1;
                            ConstraintAnchor constraintAnchor19 = constraintWidget14.f4376OoooO[i30];
                            ConstraintAnchor constraintAnchor20 = constraintWidget12.f4376OoooO[i30].f4329OooO0o;
                            if (constraintAnchor18 != null) {
                                if (constraintWidget13 != constraintWidget14) {
                                    oooO0OO.OooO0o0(constraintAnchor17.f4324OooO, constraintAnchor18.f4324OooO, constraintAnchor17.OooO0o0(), 5);
                                } else if (constraintAnchor20 != null) {
                                    oooO0OO.OooO0O0(constraintAnchor17.f4324OooO, constraintAnchor18.f4324OooO, constraintAnchor17.OooO0o0(), 0.5f, constraintAnchor19.f4324OooO, constraintAnchor20.f4324OooO, constraintAnchor19.OooO0o0(), 5);
                                }
                            }
                            if (constraintAnchor20 != null && constraintWidget13 != constraintWidget14) {
                                oooO0OO.OooO0o0(constraintAnchor19.f4324OooO, constraintAnchor20.f4324OooO, -constraintAnchor19.OooO0o0(), 5);
                            }
                        }
                    } else {
                        int i31 = oooO0OO3.f4467OooOO0;
                        boolean z20 = i31 > 0 && oooO0OO3.f4458OooO == i31;
                        ConstraintWidget constraintWidget26 = constraintWidget13;
                        ConstraintWidget constraintWidget27 = constraintWidget26;
                        while (constraintWidget27 != null) {
                            ConstraintWidget constraintWidget28 = constraintWidget27.f4401o00oO0o[i];
                            while (constraintWidget28 != null && constraintWidget28.f4403o0OoOo0 == 8) {
                                constraintWidget28 = constraintWidget28.f4401o00oO0o[i];
                            }
                            if (constraintWidget28 != null || constraintWidget27 == constraintWidget14) {
                                ConstraintAnchor[] constraintAnchorArr7 = constraintWidget27.f4376OoooO;
                                ConstraintAnchor constraintAnchor21 = constraintAnchorArr7[i3];
                                SolverVariable solverVariable14 = constraintAnchor21.f4324OooO;
                                ConstraintAnchor constraintAnchor22 = constraintAnchor21.f4329OooO0o;
                                SolverVariable solverVariable15 = constraintAnchor22 != null ? constraintAnchor22.f4324OooO : null;
                                if (constraintWidget26 != constraintWidget27) {
                                    solverVariable15 = constraintWidget26.f4376OoooO[i3 + 1].f4324OooO;
                                } else if (constraintWidget27 == constraintWidget13) {
                                    ConstraintAnchor constraintAnchor23 = constraintWidget21.f4376OoooO[i3].f4329OooO0o;
                                    solverVariable15 = constraintAnchor23 != null ? constraintAnchor23.f4324OooO : null;
                                }
                                int iOooO0o5 = constraintAnchor21.OooO0o0();
                                int i32 = i3 + 1;
                                int iOooO0o6 = constraintAnchorArr7[i32].OooO0o0();
                                if (constraintWidget28 != null) {
                                    constraintAnchor2 = constraintWidget28.f4376OoooO[i3];
                                    solverVariable3 = constraintAnchor2.f4324OooO;
                                } else {
                                    constraintAnchor2 = constraintWidget12.f4376OoooO[i32].f4329OooO0o;
                                    solverVariable3 = constraintAnchor2 != null ? constraintAnchor2.f4324OooO : null;
                                }
                                SolverVariable solverVariable16 = constraintAnchorArr7[i32].f4324OooO;
                                if (constraintAnchor2 != null) {
                                    iOooO0o6 = constraintAnchor2.OooO0o0() + iOooO0o6;
                                }
                                int iOooO0o7 = constraintWidget26.f4376OoooO[i32].OooO0o0() + iOooO0o5;
                                if (solverVariable14 == null || solverVariable15 == null || solverVariable3 == null || solverVariable16 == null) {
                                    constraintWidget2 = constraintWidget28;
                                } else {
                                    if (constraintWidget27 == constraintWidget13) {
                                        iOooO0o7 = constraintWidget13.f4376OoooO[i3].OooO0o0();
                                    }
                                    if (constraintWidget27 == constraintWidget14) {
                                        iOooO0o6 = constraintWidget14.f4376OoooO[i32].OooO0o0();
                                    }
                                    int i33 = iOooO0o6;
                                    constraintWidget2 = constraintWidget28;
                                    oooO0OO.OooO0O0(solverVariable14, solverVariable15, iOooO0o7, 0.5f, solverVariable3, solverVariable16, i33, z20 ? 8 : 5);
                                }
                            } else {
                                constraintWidget2 = constraintWidget28;
                            }
                            constraintWidget26 = constraintWidget27.f4403o0OoOo0 != 8 ? constraintWidget27 : constraintWidget26;
                            constraintWidget21 = constraintWidget21;
                            constraintWidget27 = constraintWidget2;
                            i6 = i6;
                        }
                        i4 = i6;
                    }
                } else {
                    ConstraintAnchor constraintAnchor24 = constraintWidget18.f4376OoooO[i3];
                    int i34 = i3 + 1;
                    ConstraintAnchor constraintAnchor25 = constraintWidget12.f4376OoooO[i34];
                    ConstraintAnchor constraintAnchor26 = constraintAnchor24.f4329OooO0o;
                    SolverVariable solverVariable17 = constraintAnchor26 != null ? constraintAnchor26.f4324OooO : null;
                    ConstraintAnchor constraintAnchor27 = constraintAnchor25.f4329OooO0o;
                    SolverVariable solverVariable18 = constraintAnchor27 != null ? constraintAnchor27.f4324OooO : null;
                    ConstraintAnchor constraintAnchor28 = constraintWidget13.f4376OoooO[i3];
                    if (constraintWidget14 != null) {
                        constraintAnchor25 = constraintWidget14.f4376OoooO[i34];
                    }
                    if (solverVariable17 == null || solverVariable18 == null) {
                        i6 = i4;
                        i4 = i6;
                    } else {
                        oooO0OO.OooO0O0(constraintAnchor28.f4324OooO, solverVariable17, constraintAnchor28.OooO0o0(), i == 0 ? constraintWidget17.f4391Oooooo : constraintWidget17.f4393OoooooO, solverVariable18, constraintAnchor25.f4324OooO, constraintAnchor25.OooO0o0(), 7);
                    }
                }
                if ((z5 || z6) && constraintWidget13 != null && constraintWidget13 != constraintWidget14) {
                    ConstraintAnchor[] constraintAnchorArr8 = constraintWidget13.f4376OoooO;
                    ConstraintAnchor constraintAnchor29 = constraintAnchorArr8[i3];
                    if (constraintWidget14 == null) {
                        constraintWidget14 = constraintWidget13;
                    }
                    int i35 = i3 + 1;
                    ConstraintAnchor constraintAnchor30 = constraintWidget14.f4376OoooO[i35];
                    ConstraintAnchor constraintAnchor31 = constraintAnchor29.f4329OooO0o;
                    SolverVariable solverVariable19 = constraintAnchor31 != null ? constraintAnchor31.f4324OooO : null;
                    ConstraintAnchor constraintAnchor32 = constraintAnchor30.f4329OooO0o;
                    SolverVariable solverVariable20 = constraintAnchor32 != null ? constraintAnchor32.f4324OooO : null;
                    if (constraintWidget12 != constraintWidget14) {
                        ConstraintAnchor constraintAnchor33 = constraintWidget12.f4376OoooO[i35].f4329OooO0o;
                        solverVariable4 = constraintAnchor33 != null ? constraintAnchor33.f4324OooO : null;
                    } else {
                        solverVariable4 = solverVariable20;
                    }
                    if (constraintWidget13 == constraintWidget14) {
                        constraintAnchor30 = constraintAnchorArr8[i35];
                    }
                    if (solverVariable19 != null && solverVariable4 != null) {
                        oooO0OO.OooO0O0(constraintAnchor29.f4324OooO, solverVariable19, constraintAnchor29.OooO0o0(), 0.5f, solverVariable4, constraintAnchor30.f4324OooO, constraintWidget14.f4376OoooO[i35].OooO0o0(), 5);
                    }
                }
            } else {
                oooO0OOArr2 = oooO0OOArr;
            }
            i9 = i4 + 1;
            oooO0o2 = oooO0o;
            i2 = i5;
            oooO0OOArr = oooO0OOArr2;
        }
    }
}
