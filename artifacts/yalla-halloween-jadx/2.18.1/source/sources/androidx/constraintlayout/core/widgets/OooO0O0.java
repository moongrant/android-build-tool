package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {
    /* JADX WARN: Code duplicated, block: B:124:0x01c2 A[PHI: r7 r21
      0x01c2: PHI (r7v4 boolean) = (r7v2 boolean), (r7v56 boolean) binds: [B:123:0x01c0, B:114:0x01ad] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r21v3 boolean) = (r21v1 boolean), (r21v6 boolean) binds: [B:123:0x01c0, B:114:0x01ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:126:0x01c8 A[PHI: r7 r21
      0x01c8: PHI (r7v54 boolean) = (r7v2 boolean), (r7v56 boolean) binds: [B:123:0x01c0, B:114:0x01ad] A[DONT_GENERATE, DONT_INLINE]
      0x01c8: PHI (r21v5 boolean) = (r21v1 boolean), (r21v6 boolean) binds: [B:123:0x01c0, B:114:0x01ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:179:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:199:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:201:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:203:0x0302  */
    /* JADX WARN: Code duplicated, block: B:205:0x0323  */
    /* JADX WARN: Code duplicated, block: B:315:0x054c  */
    /* JADX WARN: Code duplicated, block: B:334:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:335:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:404:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:405:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:408:0x06df  */
    /* JADX WARN: Code duplicated, block: B:409:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:412:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:413:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:415:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:417:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:419:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:421:0x0701  */
    /* JADX WARN: Code duplicated, block: B:423:0x0707 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:433:0x0724 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:70:0x011d  */
    public static void OooO00o(OooO0o oooO0o, androidx.constraintlayout.core.OooO0OO oooO0OO, ArrayList<ConstraintWidget> arrayList, int i) {
        int i2;
        OooO0OO[] oooO0OOArr;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        OooO0OO[] oooO0OOArr2;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        int i6;
        int i7;
        ConstraintWidget constraintWidget3;
        ConstraintAnchor constraintAnchor;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        ConstraintAnchor constraintAnchor2;
        SolverVariable solverVariable3;
        ConstraintAnchor[] constraintAnchorArr;
        ConstraintAnchor constraintAnchor3;
        ConstraintWidget constraintWidget4;
        int i8;
        ConstraintAnchor constraintAnchor4;
        ConstraintAnchor constraintAnchor5;
        SolverVariable solverVariable4;
        ConstraintAnchor constraintAnchor6;
        SolverVariable solverVariable5;
        SolverVariable solverVariable6;
        int size;
        ConstraintAnchor constraintAnchor7;
        ConstraintWidget constraintWidget5;
        int i9;
        int i10;
        boolean z5;
        ConstraintWidget constraintWidget6;
        OooO0o oooO0o2 = oooO0o;
        if (i == 0) {
            i2 = oooO0o2.f7042o00000;
            oooO0OOArr = oooO0o2.f7048o00000OO;
            i3 = 0;
        } else {
            i2 = oooO0o2.f7047o00000O0;
            oooO0OOArr = oooO0o2.f7046o00000O;
            i3 = 2;
        }
        int i11 = 0;
        while (i11 < i2) {
            OooO0OO oooO0OO2 = oooO0OOArr[i11];
            int i12 = 8;
            int i13 = 1;
            if (oooO0OO2.f7040OooOOo0) {
                i4 = i11;
            } else {
                int i14 = oooO0OO2.f7035OooOO0o * 2;
                ConstraintWidget constraintWidget7 = oooO0OO2.f7025OooO00o;
                ConstraintWidget constraintWidget8 = constraintWidget7;
                boolean z6 = false;
                while (!z6) {
                    oooO0OO2.f7024OooO += i13;
                    ConstraintWidget[] constraintWidgetArr = constraintWidget7.f6967o00oO0o;
                    int i15 = oooO0OO2.f7035OooOO0o;
                    constraintWidgetArr[i15] = null;
                    constraintWidget7.f6973oo000o[i15] = null;
                    if (constraintWidget7.f6969o0OoOo0 != i12) {
                        ConstraintWidget.DimensionBehaviour dimensionBehaviourOooOOo0 = constraintWidget7.OooOOo0(i15);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (dimensionBehaviourOooOOo0 != dimensionBehaviour) {
                            int i16 = oooO0OO2.f7035OooOO0o;
                        }
                        constraintWidget7.f6942OoooO[i14].OooO0o0();
                        int i17 = i14 + 1;
                        constraintWidget7.f6942OoooO[i17].OooO0o0();
                        constraintWidget7.f6942OoooO[i14].OooO0o0();
                        constraintWidget7.f6942OoooO[i17].OooO0o0();
                        if (oooO0OO2.f7026OooO0O0 == null) {
                            oooO0OO2.f7026OooO0O0 = constraintWidget7;
                        }
                        oooO0OO2.f7028OooO0Oo = constraintWidget7;
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget7.f6947OoooOOO;
                        int i18 = oooO0OO2.f7035OooOO0o;
                        if (dimensionBehaviourArr[i18] == dimensionBehaviour) {
                            int[] iArr = constraintWidget7.f6922OooOo0O;
                            if (iArr[i18] != 0) {
                                z5 = z6;
                                if (iArr[i18] == 3 || iArr[i18] == 2) {
                                }
                            } else {
                                z5 = z6;
                            }
                            oooO0OO2.f7033OooOO0++;
                            float[] fArr = constraintWidget7.f6968o00ooo;
                            float f = fArr[i18];
                            if (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                oooO0OO2.f7034OooOO0O += fArr[i18];
                            }
                            if (constraintWidget7.f6969o0OoOo0 != 8 && dimensionBehaviourArr[i18] == dimensionBehaviour && (iArr[i18] == 0 || iArr[i18] == 3)) {
                                if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                    oooO0OO2.f7036OooOOO = true;
                                } else {
                                    oooO0OO2.f7038OooOOOO = true;
                                }
                                if (oooO0OO2.f7032OooO0oo == null) {
                                    oooO0OO2.f7032OooO0oo = new ArrayList<>();
                                }
                                oooO0OO2.f7032OooO0oo.add(constraintWidget7);
                            }
                            if (oooO0OO2.f7029OooO0o == null) {
                                oooO0OO2.f7029OooO0o = constraintWidget7;
                            }
                            ConstraintWidget constraintWidget9 = oooO0OO2.f7031OooO0oO;
                            if (constraintWidget9 != null) {
                                constraintWidget9.f6973oo000o[oooO0OO2.f7035OooOO0o] = constraintWidget7;
                            }
                            oooO0OO2.f7031OooO0oO = constraintWidget7;
                        } else {
                            z5 = z6;
                        }
                        i11 = i11;
                    } else {
                        z5 = z6;
                        i11 = i11;
                    }
                    if (constraintWidget8 != constraintWidget7) {
                        constraintWidget8.f6967o00oO0o[oooO0OO2.f7035OooOO0o] = constraintWidget7;
                    }
                    ConstraintAnchor constraintAnchor8 = constraintWidget7.f6942OoooO[i14 + 1].f6895OooO0o;
                    if (constraintAnchor8 != null) {
                        constraintWidget6 = constraintAnchor8.f6894OooO0Oo;
                        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget6.f6942OoooO;
                        if (constraintAnchorArr2[i14].f6895OooO0o == null || constraintAnchorArr2[i14].f6895OooO0o.f6894OooO0Oo != constraintWidget7) {
                            constraintWidget6 = null;
                        }
                    } else {
                        constraintWidget6 = null;
                    }
                    if (constraintWidget6 != null) {
                        z6 = z5;
                    } else {
                        constraintWidget6 = constraintWidget7;
                        z6 = true;
                    }
                    constraintWidget8 = constraintWidget7;
                    i11 = i11;
                    i13 = 1;
                    i12 = 8;
                    constraintWidget7 = constraintWidget6;
                }
                i4 = i11;
                ConstraintWidget constraintWidget10 = oooO0OO2.f7026OooO0O0;
                if (constraintWidget10 != null) {
                    constraintWidget10.f6942OoooO[i14].OooO0o0();
                }
                ConstraintWidget constraintWidget11 = oooO0OO2.f7028OooO0Oo;
                if (constraintWidget11 != null) {
                    constraintWidget11.f6942OoooO[i14 + 1].OooO0o0();
                }
                oooO0OO2.f7027OooO0OO = constraintWidget7;
                if (oooO0OO2.f7035OooOO0o == 0 && oooO0OO2.f7037OooOOO0) {
                    oooO0OO2.f7030OooO0o0 = constraintWidget7;
                } else {
                    oooO0OO2.f7030OooO0o0 = oooO0OO2.f7025OooO00o;
                }
                oooO0OO2.f7039OooOOOo = oooO0OO2.f7038OooOOOO && oooO0OO2.f7036OooOOO;
            }
            oooO0OO2.f7040OooOOo0 = true;
            if (arrayList == 0 || arrayList.contains(oooO0OO2.f7025OooO00o)) {
                ConstraintWidget constraintWidget12 = oooO0OO2.f7025OooO00o;
                ConstraintWidget constraintWidget13 = oooO0OO2.f7027OooO0OO;
                ConstraintWidget constraintWidget14 = oooO0OO2.f7026OooO0O0;
                ConstraintWidget constraintWidget15 = oooO0OO2.f7028OooO0Oo;
                ConstraintWidget constraintWidget16 = oooO0OO2.f7030OooO0o0;
                float f2 = oooO0OO2.f7034OooOO0O;
                boolean z7 = oooO0o2.f6947OoooOOO[i] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (i == 0) {
                    int i19 = constraintWidget16.f6964o00Ooo;
                    boolean z8 = i19 == 0;
                    if (i19 == 1) {
                        i10 = 2;
                        z2 = true;
                    } else {
                        i10 = 2;
                        z2 = false;
                    }
                    z = z8;
                    if (i19 == i10) {
                        z3 = z;
                        z4 = true;
                    } else {
                        z3 = z;
                        z4 = false;
                    }
                } else {
                    int i20 = constraintWidget16.f6965o00o0O;
                    z = i20 == 0;
                    z2 = i20 == 1;
                    if (i20 == 2) {
                        z3 = z;
                        z4 = true;
                    } else {
                        z3 = z;
                        z4 = false;
                    }
                }
                boolean z9 = z2;
                ConstraintWidget constraintWidget17 = constraintWidget12;
                boolean z10 = false;
                while (!z10) {
                    ConstraintAnchor constraintAnchor9 = constraintWidget17.f6942OoooO[i3];
                    int i21 = z4 ? 1 : 4;
                    int iOooO0o0 = constraintAnchor9.OooO0o0();
                    boolean z11 = z10;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget17.f6947OoooOOO[i];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    boolean z12 = dimensionBehaviour2 == dimensionBehaviour3 && constraintWidget17.f6922OooOo0O[i] == 0;
                    ConstraintAnchor constraintAnchor10 = constraintAnchor9.f6895OooO0o;
                    if (constraintAnchor10 != null && constraintWidget17 != constraintWidget12) {
                        iOooO0o0 = constraintAnchor10.OooO0o0() + iOooO0o0;
                    }
                    int i22 = iOooO0o0;
                    if (z4 && constraintWidget17 != constraintWidget12 && constraintWidget17 != constraintWidget14) {
                        i21 = 8;
                    }
                    ConstraintAnchor constraintAnchor11 = constraintAnchor9.f6895OooO0o;
                    if (constraintAnchor11 != null) {
                        if (constraintWidget17 == constraintWidget14) {
                            oooO0OO.OooO0o(constraintAnchor9.f6890OooO, constraintAnchor11.f6890OooO, i22, 6);
                        } else {
                            oooO0OO.OooO0o(constraintAnchor9.f6890OooO, constraintAnchor11.f6890OooO, i22, 8);
                        }
                        if (z12 && !z4) {
                            i21 = 5;
                        }
                        oooO0OO.OooO0Oo(constraintAnchor9.f6890OooO, constraintAnchor9.f6895OooO0o.f6890OooO, i22, (constraintWidget17 == constraintWidget14 && z4 && constraintWidget17.f6961o000oOoO[i]) ? 5 : i21);
                    } else {
                        constraintWidget16 = constraintWidget16;
                        constraintWidget12 = constraintWidget12;
                    }
                    if (z7) {
                        if (constraintWidget17.f6969o0OoOo0 == 8 || constraintWidget17.f6947OoooOOO[i] != dimensionBehaviour3) {
                            i9 = 0;
                        } else {
                            ConstraintAnchor[] constraintAnchorArr3 = constraintWidget17.f6942OoooO;
                            i9 = 0;
                            oooO0OO.OooO0o(constraintAnchorArr3[i3 + 1].f6890OooO, constraintAnchorArr3[i3].f6890OooO, 0, 5);
                        }
                        oooO0OO.OooO0o(constraintWidget17.f6942OoooO[i3].f6890OooO, oooO0o2.f6942OoooO[i3].f6890OooO, i9, 8);
                    }
                    ConstraintAnchor constraintAnchor12 = constraintWidget17.f6942OoooO[i3 + 1].f6895OooO0o;
                    if (constraintAnchor12 != null) {
                        constraintWidget5 = constraintAnchor12.f6894OooO0Oo;
                        ConstraintAnchor[] constraintAnchorArr4 = constraintWidget5.f6942OoooO;
                        if (constraintAnchorArr4[i3].f6895OooO0o == null || constraintAnchorArr4[i3].f6895OooO0o.f6894OooO0Oo != constraintWidget17) {
                            constraintWidget5 = null;
                        }
                    } else {
                        constraintWidget5 = null;
                    }
                    if (constraintWidget5 != null) {
                        constraintWidget17 = constraintWidget5;
                        z10 = z11;
                    } else {
                        z10 = true;
                    }
                    oooO0OOArr = oooO0OOArr;
                    i2 = i2;
                    constraintWidget16 = constraintWidget16;
                    constraintWidget12 = constraintWidget12;
                }
                ConstraintWidget constraintWidget18 = constraintWidget16;
                ConstraintWidget constraintWidget19 = constraintWidget12;
                i5 = i2;
                oooO0OOArr2 = oooO0OOArr;
                if (constraintWidget15 != null) {
                    int i23 = i3 + 1;
                    if (constraintWidget13.f6942OoooO[i23].f6895OooO0o != null) {
                        ConstraintAnchor constraintAnchor13 = constraintWidget15.f6942OoooO[i23];
                        if ((constraintWidget15.f6947OoooOOO[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget15.f6922OooOo0O[i] == 0) && !z4) {
                            ConstraintAnchor constraintAnchor14 = constraintAnchor13.f6895OooO0o;
                            if (constraintAnchor14.f6894OooO0Oo == oooO0o2) {
                                oooO0OO.OooO0Oo(constraintAnchor13.f6890OooO, constraintAnchor14.f6890OooO, -constraintAnchor13.OooO0o0(), 5);
                            } else if (z4) {
                                constraintAnchor7 = constraintAnchor13.f6895OooO0o;
                                if (constraintAnchor7.f6894OooO0Oo == oooO0o2) {
                                    oooO0OO.OooO0Oo(constraintAnchor13.f6890OooO, constraintAnchor7.f6890OooO, -constraintAnchor13.OooO0o0(), 4);
                                }
                            }
                        } else if (z4) {
                            constraintAnchor7 = constraintAnchor13.f6895OooO0o;
                            if (constraintAnchor7.f6894OooO0Oo == oooO0o2) {
                                oooO0OO.OooO0Oo(constraintAnchor13.f6890OooO, constraintAnchor7.f6890OooO, -constraintAnchor13.OooO0o0(), 4);
                            }
                        }
                        oooO0OO.OooO0oO(constraintAnchor13.f6890OooO, constraintWidget13.f6942OoooO[i23].f6895OooO0o.f6890OooO, -constraintAnchor13.OooO0o0(), 6);
                    }
                }
                if (z7) {
                    int i24 = i3 + 1;
                    SolverVariable solverVariable7 = oooO0o2.f6942OoooO[i24].f6890OooO;
                    ConstraintAnchor[] constraintAnchorArr5 = constraintWidget13.f6942OoooO;
                    oooO0OO.OooO0o(solverVariable7, constraintAnchorArr5[i24].f6890OooO, constraintAnchorArr5[i24].OooO0o0(), 8);
                }
                ArrayList<ConstraintWidget> arrayList2 = oooO0OO2.f7032OooO0oo;
                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                    float f3 = (!oooO0OO2.f7036OooOOO || oooO0OO2.f7039OooOOOo) ? f2 : oooO0OO2.f7033OooOO0;
                    ConstraintWidget constraintWidget20 = null;
                    float f4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    int i25 = 0;
                    while (i25 < size) {
                        ConstraintWidget constraintWidget21 = arrayList2.get(i25);
                        float f5 = constraintWidget21.f6968o00ooo[i];
                        if (f5 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            if (oooO0OO2.f7039OooOOOo) {
                                ConstraintAnchor[] constraintAnchorArr6 = constraintWidget21.f6942OoooO;
                                oooO0OO.OooO0Oo(constraintAnchorArr6[i3 + 1].f6890OooO, constraintAnchorArr6[i3].f6890OooO, 0, 4);
                            } else {
                                f5 = 1.0f;
                            }
                            oooO0OO2 = oooO0OO2;
                            arrayList2 = arrayList2;
                            size = size;
                            i25++;
                            oooO0OO2 = oooO0OO2;
                            size = size;
                            arrayList2 = arrayList2;
                        }
                        if (f5 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            ConstraintAnchor[] constraintAnchorArr7 = constraintWidget21.f6942OoooO;
                            oooO0OO.OooO0Oo(constraintAnchorArr7[i3 + 1].f6890OooO, constraintAnchorArr7[i3].f6890OooO, 0, 8);
                            oooO0OO2 = oooO0OO2;
                            arrayList2 = arrayList2;
                            size = size;
                        } else {
                            if (constraintWidget20 != null) {
                                ConstraintAnchor[] constraintAnchorArr8 = constraintWidget20.f6942OoooO;
                                SolverVariable solverVariable8 = constraintAnchorArr8[i3].f6890OooO;
                                int i26 = i3 + 1;
                                SolverVariable solverVariable9 = constraintAnchorArr8[i26].f6890OooO;
                                ConstraintAnchor[] constraintAnchorArr9 = constraintWidget21.f6942OoooO;
                                SolverVariable solverVariable10 = constraintAnchorArr9[i3].f6890OooO;
                                SolverVariable solverVariable11 = constraintAnchorArr9[i26].f6890OooO;
                                androidx.constraintlayout.core.OooO0O0 oooO0O0OooOOO0 = oooO0OO.OooOOO0();
                                oooO0O0OooOOO0.f6796OooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                if (f3 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || f4 == f5) {
                                    oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable8, 1.0f);
                                    oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable9, -1.0f);
                                    oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable11, 1.0f);
                                    oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable10, -1.0f);
                                } else if (f4 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                    oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable8, 1.0f);
                                    oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable9, -1.0f);
                                } else if (f5 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                    oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable10, 1.0f);
                                    oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable11, -1.0f);
                                } else {
                                    float f6 = (f4 / f3) / (f5 / f3);
                                    oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable8, 1.0f);
                                    oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable9, -1.0f);
                                    oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable11, f6);
                                    oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable10, -f6);
                                }
                                oooO0OO.OooO0OO(oooO0O0OooOOO0);
                            }
                            f4 = f5;
                            constraintWidget20 = constraintWidget21;
                        }
                        i25++;
                        oooO0OO2 = oooO0OO2;
                        size = size;
                        arrayList2 = arrayList2;
                    }
                }
                OooO0OO oooO0OO3 = oooO0OO2;
                if (constraintWidget14 == null || !(constraintWidget14 == constraintWidget15 || z4)) {
                    constraintWidget = constraintWidget15;
                    constraintWidget2 = constraintWidget14;
                    i6 = i4;
                    if (!z3 || constraintWidget2 == null) {
                        i7 = i6;
                        if (z9 && constraintWidget2 != null) {
                            int i27 = oooO0OO3.f7033OooOO0;
                            boolean z13 = i27 > 0 && oooO0OO3.f7024OooO == i27;
                            ConstraintWidget constraintWidget22 = constraintWidget2;
                            ConstraintWidget constraintWidget23 = constraintWidget22;
                            while (constraintWidget22 != null) {
                                ConstraintWidget constraintWidget24 = constraintWidget22.f6967o00oO0o[i];
                                while (constraintWidget24 != null && constraintWidget24.f6969o0OoOo0 == 8) {
                                    constraintWidget24 = constraintWidget24.f6967o00oO0o[i];
                                }
                                if (constraintWidget22 == constraintWidget2 || constraintWidget22 == constraintWidget || constraintWidget24 == null) {
                                    constraintWidget3 = constraintWidget24;
                                } else {
                                    ConstraintWidget constraintWidget25 = constraintWidget24 == constraintWidget ? null : constraintWidget24;
                                    ConstraintAnchor constraintAnchor15 = constraintWidget22.f6942OoooO[i3];
                                    SolverVariable solverVariable12 = constraintAnchor15.f6890OooO;
                                    int i28 = i3 + 1;
                                    SolverVariable solverVariable13 = constraintWidget23.f6942OoooO[i28].f6890OooO;
                                    int iOooO0o1 = constraintAnchor15.OooO0o0();
                                    int iOooO0o2 = constraintWidget22.f6942OoooO[i28].OooO0o0();
                                    if (constraintWidget25 != null) {
                                        constraintAnchor = constraintWidget25.f6942OoooO[i3];
                                        solverVariable = constraintAnchor.f6890OooO;
                                        ConstraintAnchor constraintAnchor16 = constraintAnchor.f6895OooO0o;
                                        solverVariable2 = constraintAnchor16 != null ? constraintAnchor16.f6890OooO : null;
                                    } else {
                                        constraintAnchor = constraintWidget.f6942OoooO[i3];
                                        solverVariable = constraintAnchor != null ? constraintAnchor.f6890OooO : null;
                                        solverVariable2 = constraintWidget22.f6942OoooO[i28].f6890OooO;
                                    }
                                    int iOooO0o3 = constraintAnchor != null ? constraintAnchor.OooO0o0() + iOooO0o2 : iOooO0o2;
                                    int iOooO0o4 = constraintWidget23.f6942OoooO[i28].OooO0o0() + iOooO0o1;
                                    int i29 = z13 ? 8 : 4;
                                    if (solverVariable12 != null && solverVariable13 != null && solverVariable != null && solverVariable2 != null) {
                                        oooO0OO.OooO0O0(solverVariable12, solverVariable13, iOooO0o4, 0.5f, solverVariable, solverVariable2, iOooO0o3, i29);
                                    }
                                    constraintWidget3 = constraintWidget25;
                                }
                                if (constraintWidget22.f6969o0OoOo0 != 8) {
                                    constraintWidget23 = constraintWidget22;
                                }
                                constraintWidget22 = constraintWidget3;
                            }
                            ConstraintAnchor constraintAnchor17 = constraintWidget2.f6942OoooO[i3];
                            ConstraintAnchor constraintAnchor18 = constraintWidget19.f6942OoooO[i3].f6895OooO0o;
                            int i30 = i3 + 1;
                            ConstraintAnchor constraintAnchor19 = constraintWidget.f6942OoooO[i30];
                            ConstraintAnchor constraintAnchor20 = constraintWidget13.f6942OoooO[i30].f6895OooO0o;
                            if (constraintAnchor18 != null) {
                                if (constraintWidget2 != constraintWidget) {
                                    oooO0OO.OooO0Oo(constraintAnchor17.f6890OooO, constraintAnchor18.f6890OooO, constraintAnchor17.OooO0o0(), 5);
                                } else if (constraintAnchor20 != null) {
                                    oooO0OO.OooO0O0(constraintAnchor17.f6890OooO, constraintAnchor18.f6890OooO, constraintAnchor17.OooO0o0(), 0.5f, constraintAnchor19.f6890OooO, constraintAnchor20.f6890OooO, constraintAnchor19.OooO0o0(), 5);
                                }
                            }
                            if (constraintAnchor20 != null && constraintWidget2 != constraintWidget) {
                                oooO0OO.OooO0Oo(constraintAnchor19.f6890OooO, constraintAnchor20.f6890OooO, -constraintAnchor19.OooO0o0(), 5);
                            }
                        }
                    } else {
                        int i31 = oooO0OO3.f7033OooOO0;
                        boolean z14 = i31 > 0 && oooO0OO3.f7024OooO == i31;
                        ConstraintWidget constraintWidget26 = constraintWidget2;
                        ConstraintWidget constraintWidget27 = constraintWidget26;
                        while (constraintWidget27 != null) {
                            ConstraintWidget constraintWidget28 = constraintWidget27.f6967o00oO0o[i];
                            while (constraintWidget28 != null && constraintWidget28.f6969o0OoOo0 == 8) {
                                constraintWidget28 = constraintWidget28.f6967o00oO0o[i];
                            }
                            if (constraintWidget28 != null || constraintWidget27 == constraintWidget) {
                                ConstraintAnchor constraintAnchor21 = constraintWidget27.f6942OoooO[i3];
                                SolverVariable solverVariable14 = constraintAnchor21.f6890OooO;
                                ConstraintAnchor constraintAnchor22 = constraintAnchor21.f6895OooO0o;
                                SolverVariable solverVariable15 = constraintAnchor22 != null ? constraintAnchor22.f6890OooO : null;
                                if (constraintWidget26 != constraintWidget27) {
                                    solverVariable15 = constraintWidget26.f6942OoooO[i3 + 1].f6890OooO;
                                } else if (constraintWidget27 == constraintWidget2) {
                                    ConstraintAnchor[] constraintAnchorArr10 = constraintWidget19.f6942OoooO;
                                    solverVariable15 = constraintAnchorArr10[i3].f6895OooO0o != null ? constraintAnchorArr10[i3].f6895OooO0o.f6890OooO : null;
                                }
                                int iOooO0o5 = constraintAnchor21.OooO0o0();
                                int i32 = i3 + 1;
                                int iOooO0o6 = constraintWidget27.f6942OoooO[i32].OooO0o0();
                                if (constraintWidget28 != null) {
                                    constraintAnchor2 = constraintWidget28.f6942OoooO[i3];
                                    solverVariable3 = constraintAnchor2.f6890OooO;
                                } else {
                                    constraintAnchor2 = constraintWidget13.f6942OoooO[i32].f6895OooO0o;
                                    if (constraintAnchor2 != null) {
                                        solverVariable3 = constraintAnchor2.f6890OooO;
                                    } else {
                                        solverVariable3 = null;
                                    }
                                    SolverVariable solverVariable16 = constraintWidget27.f6942OoooO[i32].f6890OooO;
                                    if (constraintAnchor2 != null) {
                                        iOooO0o6 += constraintAnchor2.OooO0o0();
                                    }
                                    int iOooO0o7 = constraintWidget26.f6942OoooO[i32].OooO0o0() + iOooO0o5;
                                    if (solverVariable14 == null && solverVariable15 != null && solverVariable3 != null && solverVariable16 != null) {
                                        if (constraintWidget27 == constraintWidget2) {
                                            iOooO0o7 = constraintWidget2.f6942OoooO[i3].OooO0o0();
                                        }
                                        int iOooO0o8 = constraintWidget27 == constraintWidget ? constraintWidget.f6942OoooO[i32].OooO0o0() : iOooO0o6;
                                        i6 = i6;
                                        int i33 = iOooO0o7;
                                        SolverVariable solverVariable17 = solverVariable3;
                                        constraintWidget28 = constraintWidget28;
                                        constraintWidget26 = constraintWidget26;
                                        oooO0OO.OooO0O0(solverVariable14, solverVariable15, i33, 0.5f, solverVariable17, solverVariable16, iOooO0o8, z14 ? 8 : 5);
                                    }
                                    if (constraintWidget27.f6969o0OoOo0 != 8) {
                                        constraintWidget26 = constraintWidget27;
                                    } else {
                                        constraintWidget26 = constraintWidget26;
                                    }
                                    constraintWidget27 = constraintWidget28;
                                    i6 = i6;
                                }
                                SolverVariable solverVariable18 = constraintWidget27.f6942OoooO[i32].f6890OooO;
                                if (constraintAnchor2 != null) {
                                    iOooO0o6 += constraintAnchor2.OooO0o0();
                                }
                                int iOooO0o9 = constraintWidget26.f6942OoooO[i32].OooO0o0() + iOooO0o5;
                                if (solverVariable14 == null) {
                                }
                            }
                            if (constraintWidget27.f6969o0OoOo0 != 8) {
                                constraintWidget26 = constraintWidget27;
                            } else {
                                constraintWidget26 = constraintWidget26;
                            }
                            constraintWidget27 = constraintWidget28;
                            i6 = i6;
                        }
                    }
                    if ((z3 || z9) && constraintWidget2 != null && constraintWidget2 != constraintWidget) {
                        constraintAnchorArr = constraintWidget2.f6942OoooO;
                        constraintAnchor3 = constraintAnchorArr[i3];
                        if (constraintWidget == null) {
                            constraintWidget4 = constraintWidget2;
                        } else {
                            constraintWidget4 = constraintWidget;
                        }
                        i8 = i3 + 1;
                        constraintAnchor4 = constraintWidget4.f6942OoooO[i8];
                        constraintAnchor5 = constraintAnchor3.f6895OooO0o;
                        if (constraintAnchor5 != null) {
                            solverVariable4 = constraintAnchor5.f6890OooO;
                        } else {
                            solverVariable4 = null;
                        }
                        constraintAnchor6 = constraintAnchor4.f6895OooO0o;
                        if (constraintAnchor6 != null) {
                            solverVariable5 = constraintAnchor6.f6890OooO;
                        } else {
                            solverVariable5 = null;
                        }
                        if (constraintWidget13 != constraintWidget4) {
                            ConstraintAnchor constraintAnchor23 = constraintWidget13.f6942OoooO[i8].f6895OooO0o;
                            solverVariable6 = constraintAnchor23 != null ? constraintAnchor23.f6890OooO : null;
                        } else {
                            solverVariable6 = solverVariable5;
                        }
                        if (constraintWidget2 == constraintWidget4) {
                            constraintAnchor3 = constraintAnchorArr[i3];
                            constraintAnchor4 = constraintAnchorArr[i8];
                        }
                        if (solverVariable4 == null && solverVariable6 != null) {
                            oooO0OO.OooO0O0(constraintAnchor3.f6890OooO, solverVariable4, constraintAnchor3.OooO0o0(), 0.5f, solverVariable6, constraintAnchor4.f6890OooO, constraintWidget4.f6942OoooO[i8].OooO0o0(), 5);
                        }
                    }
                } else {
                    ConstraintAnchor constraintAnchor24 = constraintWidget19.f6942OoooO[i3];
                    int i34 = i3 + 1;
                    ConstraintAnchor constraintAnchor25 = constraintWidget13.f6942OoooO[i34];
                    ConstraintAnchor constraintAnchor26 = constraintAnchor24.f6895OooO0o;
                    SolverVariable solverVariable19 = constraintAnchor26 != null ? constraintAnchor26.f6890OooO : null;
                    ConstraintAnchor constraintAnchor27 = constraintAnchor25.f6895OooO0o;
                    SolverVariable solverVariable20 = constraintAnchor27 != null ? constraintAnchor27.f6890OooO : null;
                    ConstraintAnchor constraintAnchor28 = constraintWidget14.f6942OoooO[i3];
                    if (constraintWidget15 != null) {
                        constraintAnchor25 = constraintWidget15.f6942OoooO[i34];
                    }
                    if (solverVariable19 == null || solverVariable20 == null) {
                        constraintWidget = constraintWidget15;
                        constraintWidget2 = constraintWidget14;
                        i6 = i4;
                    } else {
                        constraintWidget = constraintWidget15;
                        constraintWidget2 = constraintWidget14;
                        i6 = i4;
                        oooO0OO.OooO0O0(constraintAnchor28.f6890OooO, solverVariable19, constraintAnchor28.OooO0o0(), i == 0 ? constraintWidget18.f6957Oooooo : constraintWidget18.f6959OoooooO, solverVariable20, constraintAnchor25.f6890OooO, constraintAnchor25.OooO0o0(), 7);
                    }
                }
                i7 = i6;
                if (z3) {
                    constraintAnchorArr = constraintWidget2.f6942OoooO;
                    constraintAnchor3 = constraintAnchorArr[i3];
                    if (constraintWidget == null) {
                        constraintWidget4 = constraintWidget2;
                    } else {
                        constraintWidget4 = constraintWidget;
                    }
                    i8 = i3 + 1;
                    constraintAnchor4 = constraintWidget4.f6942OoooO[i8];
                    constraintAnchor5 = constraintAnchor3.f6895OooO0o;
                    if (constraintAnchor5 != null) {
                        solverVariable4 = constraintAnchor5.f6890OooO;
                    } else {
                        solverVariable4 = null;
                    }
                    constraintAnchor6 = constraintAnchor4.f6895OooO0o;
                    if (constraintAnchor6 != null) {
                        solverVariable5 = constraintAnchor6.f6890OooO;
                    } else {
                        solverVariable5 = null;
                    }
                    if (constraintWidget13 != constraintWidget4) {
                        ConstraintAnchor constraintAnchor29 = constraintWidget13.f6942OoooO[i8].f6895OooO0o;
                        solverVariable6 = constraintAnchor29 != null ? constraintAnchor29.f6890OooO : null;
                    } else {
                        solverVariable6 = solverVariable5;
                    }
                    if (constraintWidget2 == constraintWidget4) {
                        constraintAnchor3 = constraintAnchorArr[i3];
                        constraintAnchor4 = constraintAnchorArr[i8];
                    }
                    if (solverVariable4 == null) {
                    }
                } else {
                    constraintAnchorArr = constraintWidget2.f6942OoooO;
                    constraintAnchor3 = constraintAnchorArr[i3];
                    if (constraintWidget == null) {
                        constraintWidget4 = constraintWidget2;
                    } else {
                        constraintWidget4 = constraintWidget;
                    }
                    i8 = i3 + 1;
                    constraintAnchor4 = constraintWidget4.f6942OoooO[i8];
                    constraintAnchor5 = constraintAnchor3.f6895OooO0o;
                    if (constraintAnchor5 != null) {
                        solverVariable4 = constraintAnchor5.f6890OooO;
                    } else {
                        solverVariable4 = null;
                    }
                    constraintAnchor6 = constraintAnchor4.f6895OooO0o;
                    if (constraintAnchor6 != null) {
                        solverVariable5 = constraintAnchor6.f6890OooO;
                    } else {
                        solverVariable5 = null;
                    }
                    if (constraintWidget13 != constraintWidget4) {
                        ConstraintAnchor constraintAnchor210 = constraintWidget13.f6942OoooO[i8].f6895OooO0o;
                        solverVariable6 = constraintAnchor210 != null ? constraintAnchor210.f6890OooO : null;
                    } else {
                        solverVariable6 = solverVariable5;
                    }
                    if (constraintWidget2 == constraintWidget4) {
                        constraintAnchor3 = constraintAnchorArr[i3];
                        constraintAnchor4 = constraintAnchorArr[i8];
                    }
                    if (solverVariable4 == null) {
                    }
                }
            } else {
                i5 = i2;
                oooO0OOArr2 = oooO0OOArr;
                i7 = i4;
            }
            i11 = i7 + 1;
            oooO0o2 = oooO0o;
            oooO0OOArr = oooO0OOArr2;
            i2 = i5;
        }
    }
}
