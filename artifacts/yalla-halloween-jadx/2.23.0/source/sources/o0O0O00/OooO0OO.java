package o0O0O00;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends o0OoOo0 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ArrayList<o0OoOo0> f41857OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f41858OooOO0o;

    public OooO0OO(int i, ConstraintWidget constraintWidget) {
        ConstraintWidget constraintWidget2;
        super(constraintWidget);
        this.f41857OooOO0O = new ArrayList<>();
        this.f41891OooO0o = i;
        ConstraintWidget constraintWidget3 = this.f41888OooO0O0;
        ConstraintWidget constraintWidgetOooOOo = constraintWidget3.OooOOo(i);
        while (true) {
            constraintWidget2 = constraintWidget3;
            constraintWidget3 = constraintWidgetOooOOo;
            if (constraintWidget3 == null) {
                break;
            } else {
                constraintWidgetOooOOo = constraintWidget3.OooOOo(this.f41891OooO0o);
            }
        }
        this.f41888OooO0O0 = constraintWidget2;
        int i2 = this.f41891OooO0o;
        o0OoOo0 o0oooo0 = i2 == 0 ? constraintWidget2.f4338OooO0Oo : i2 == 1 ? constraintWidget2.f4340OooO0o0 : null;
        ArrayList<o0OoOo0> arrayList = this.f41857OooOO0O;
        arrayList.add(o0oooo0);
        ConstraintWidget constraintWidgetOooOOo0 = constraintWidget2.OooOOo0(this.f41891OooO0o);
        while (constraintWidgetOooOOo0 != null) {
            int i3 = this.f41891OooO0o;
            arrayList.add(i3 == 0 ? constraintWidgetOooOOo0.f4338OooO0Oo : i3 == 1 ? constraintWidgetOooOOo0.f4340OooO0o0 : null);
            constraintWidgetOooOOo0 = constraintWidgetOooOOo0.OooOOo0(this.f41891OooO0o);
        }
        for (o0OoOo0 o0oooo1 : arrayList) {
            int i4 = this.f41891OooO0o;
            if (i4 == 0) {
                o0oooo1.f41888OooO0O0.f4336OooO0O0 = this;
            } else if (i4 == 1) {
                o0oooo1.f41888OooO0O0.f4337OooO0OO = this;
            }
        }
        if ((this.f41891OooO0o == 0 && ((androidx.constraintlayout.core.widgets.OooO0o) this.f41888OooO0O0.f4382OoooOOo).f4491o000OOo) && arrayList.size() > 1) {
            this.f41888OooO0O0 = ((o0OoOo0) p018OooOoo0.OooOOO.OooO0O0(arrayList, 1)).f41888OooO0O0;
        }
        this.f41858OooOO0o = this.f41891OooO0o == 0 ? this.f41888OooO0O0.f4398o00Ooo : this.f41888OooO0O0.f4399o00o0O;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:295:0x00e8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0 A[ADDED_TO_REGION] */
    @Override // o0O0O00.o0OoOo0, o0O0O00.OooO0o
    public final void OooO00o(OooO0o oooO0o) {
        int i;
        ArrayList<o0OoOo0> arrayList;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        boolean z;
        ArrayList<o0OoOo0> arrayList2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f2;
        OooOO0 oooOO1 = this.f41894OooO0oo;
        if (oooOO1.f41868OooOO0) {
            OooOO0 oooOO2 = this.f41886OooO;
            if (oooOO2.f41868OooOO0) {
                ConstraintWidget constraintWidget = this.f41888OooO0O0.f4382OoooOOo;
                boolean z2 = constraintWidget instanceof androidx.constraintlayout.core.widgets.OooO0o ? ((androidx.constraintlayout.core.widgets.OooO0o) constraintWidget).f4491o000OOo : false;
                int i15 = oooOO2.f41866OooO0oO - oooOO1.f41866OooO0oO;
                ArrayList<o0OoOo0> arrayList3 = this.f41857OooOO0O;
                int size = arrayList3.size();
                int i16 = 0;
                while (true) {
                    i = -1;
                    if (i16 >= size) {
                        i16 = -1;
                        break;
                    } else if (arrayList3.get(i16).f41888OooO0O0.f4403o0OoOo0 != 8) {
                        break;
                    } else {
                        i16++;
                    }
                }
                int i17 = size - 1;
                for (int i18 = i17; i18 >= 0; i18--) {
                    if (arrayList3.get(i18).f41888OooO0O0.f4403o0OoOo0 != 8) {
                        i = i18;
                        break;
                    }
                }
                int i19 = 0;
                while (true) {
                    if (i19 >= 2) {
                        arrayList = arrayList3;
                        i2 = i16;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        f = 0.0f;
                        break;
                    }
                    int i20 = 0;
                    i5 = 0;
                    int i21 = 0;
                    int i22 = 0;
                    f = 0.0f;
                    while (i20 < size) {
                        o0OoOo0 o0oooo0 = arrayList3.get(i20);
                        ConstraintWidget constraintWidget2 = o0oooo0.f41888OooO0O0;
                        ArrayList<o0OoOo0> arrayList4 = arrayList3;
                        if (constraintWidget2.f4403o0OoOo0 == 8) {
                            i13 = i16;
                        } else {
                            i22++;
                            if (i20 > 0 && i20 >= i16) {
                                i5 += o0oooo0.f41894OooO0oo.f41864OooO0o;
                            }
                            OooOO0O oooOO0O = o0oooo0.f41892OooO0o0;
                            int i23 = oooOO0O.f41866OooO0oO;
                            i13 = i16;
                            boolean z3 = o0oooo0.f41890OooO0Oo != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                            if (z3) {
                                int i24 = this.f41891OooO0o;
                                if (i24 == 0 && !constraintWidget2.f4338OooO0Oo.f41892OooO0o0.f41868OooOO0) {
                                    return;
                                }
                                if (i24 == 1 && !constraintWidget2.f4340OooO0o0.f41892OooO0o0.f41868OooOO0) {
                                    return;
                                }
                            } else {
                                if (o0oooo0.f41887OooO00o == 1 && i19 == 0) {
                                    i14 = oooOO0O.f41871OooOOO0;
                                    i21++;
                                } else {
                                    if (oooOO0O.f41868OooOO0) {
                                        i14 = i23;
                                    }
                                    if (z3) {
                                        i5 += i14;
                                    } else {
                                        i21++;
                                        f2 = constraintWidget2.f4402o00ooo[this.f41891OooO0o];
                                        if (f2 >= 0.0f) {
                                            f += f2;
                                        }
                                    }
                                    if (i20 >= i17 && i20 < i) {
                                        i5 += -o0oooo0.f41886OooO.f41864OooO0o;
                                    }
                                }
                                z3 = true;
                                if (z3) {
                                    i21++;
                                    f2 = constraintWidget2.f4402o00ooo[this.f41891OooO0o];
                                    if (f2 >= 0.0f) {
                                        f += f2;
                                    }
                                } else {
                                    i5 += i14;
                                }
                                if (i20 >= i17) {
                                }
                            }
                            i14 = i23;
                            if (z3) {
                                i21++;
                                f2 = constraintWidget2.f4402o00ooo[this.f41891OooO0o];
                                if (f2 >= 0.0f) {
                                    f += f2;
                                }
                            } else {
                                i5 += i14;
                            }
                            if (i20 >= i17) {
                            }
                        }
                        i20++;
                        arrayList3 = arrayList4;
                        i16 = i13;
                    }
                    arrayList = arrayList3;
                    i2 = i16;
                    if (i5 < i15 || i21 == 0) {
                        i3 = i21;
                        i4 = i22;
                        break;
                    } else {
                        i19++;
                        arrayList3 = arrayList;
                        i16 = i2;
                    }
                }
                int i25 = oooOO1.f41866OooO0oO;
                if (z2) {
                    i25 = oooOO2.f41866OooO0oO;
                }
                if (i5 > i15) {
                    i25 = z2 ? i25 + ((int) (((i5 - i15) / 2.0f) + 0.5f)) : i25 - ((int) (((i5 - i15) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f3 = i15 - i5;
                    int i26 = (int) ((f3 / i3) + 0.5f);
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < size) {
                        ArrayList<o0OoOo0> arrayList5 = arrayList;
                        o0OoOo0 o0oooo1 = arrayList5.get(i27);
                        int i29 = i26;
                        ConstraintWidget constraintWidget3 = o0oooo1.f41888OooO0O0;
                        int i30 = i5;
                        int i31 = i25;
                        if (constraintWidget3.f4403o0OoOo0 != 8 && o0oooo1.f41890OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                            OooOO0O oooOO0O2 = o0oooo1.f41892OooO0o0;
                            if (oooOO0O2.f41868OooOO0) {
                                z2 = z2;
                            } else {
                                int i32 = f > 0.0f ? (int) (((constraintWidget3.f4402o00ooo[this.f41891OooO0o] * f3) / f) + 0.5f) : i29;
                                if (this.f41891OooO0o == 0) {
                                    i11 = constraintWidget3.f4353OooOo;
                                    i12 = constraintWidget3.f4357OooOo0o;
                                } else {
                                    i11 = constraintWidget3.f4360OooOoOO;
                                    i12 = constraintWidget3.f4358OooOoO;
                                }
                                int iMax = Math.max(i12, o0oooo1.f41887OooO00o == 1 ? Math.min(i32, oooOO0O2.f41871OooOOO0) : i32);
                                if (i11 > 0) {
                                    iMax = Math.min(i11, iMax);
                                }
                                if (iMax != i32) {
                                    i28++;
                                    i32 = iMax;
                                }
                                oooOO0O2.OooO0Oo(i32);
                            }
                        } else {
                            z2 = z2;
                        }
                        i27++;
                        i26 = i29;
                        i5 = i30;
                        i25 = i31;
                        z2 = z2;
                        f3 = f3;
                        arrayList = arrayList5;
                    }
                    i6 = i25;
                    z = z2;
                    arrayList2 = arrayList;
                    int i33 = i5;
                    if (i28 > 0) {
                        i3 -= i28;
                        int i34 = 0;
                        int i35 = 0;
                        while (i34 < size) {
                            o0OoOo0 o0oooo2 = arrayList2.get(i34);
                            if (o0oooo2.f41888OooO0O0.f4403o0OoOo0 == 8) {
                                i10 = i2;
                            } else {
                                i10 = i2;
                                if (i34 > 0 && i34 >= i10) {
                                    i35 += o0oooo2.f41894OooO0oo.f41864OooO0o;
                                }
                                i35 += o0oooo2.f41892OooO0o0.f41866OooO0oO;
                                if (i34 < i17 && i34 < i) {
                                    i35 += -o0oooo2.f41886OooO.f41864OooO0o;
                                }
                            }
                            i34++;
                            i2 = i10;
                        }
                        i7 = i2;
                        i5 = i35;
                    } else {
                        i7 = i2;
                        i5 = i33;
                    }
                    i9 = 2;
                    if (this.f41858OooOO0o == 2 && i28 == 0) {
                        i8 = 0;
                        this.f41858OooOO0o = 0;
                    } else {
                        i8 = 0;
                    }
                } else {
                    i6 = i25;
                    z = z2;
                    arrayList2 = arrayList;
                    i7 = i2;
                    i8 = 0;
                    i9 = 2;
                }
                if (i5 > i15) {
                    this.f41858OooOO0o = i9;
                }
                if (i4 > 0 && i3 == 0 && i7 == i) {
                    this.f41858OooOO0o = i9;
                }
                int i36 = this.f41858OooOO0o;
                if (i36 == 1) {
                    int i37 = i4 > 1 ? (i15 - i5) / (i4 - 1) : i4 == 1 ? (i15 - i5) / 2 : i8;
                    if (i3 > 0) {
                        i37 = i8;
                    }
                    int i38 = i6;
                    for (int i39 = i8; i39 < size; i39++) {
                        o0OoOo0 o0oooo3 = arrayList2.get(z ? size - (i39 + 1) : i39);
                        int i40 = o0oooo3.f41888OooO0O0.f4403o0OoOo0;
                        OooOO0 oooOO3 = o0oooo3.f41886OooO;
                        OooOO0 oooOO4 = o0oooo3.f41894OooO0oo;
                        if (i40 == 8) {
                            oooOO4.OooO0Oo(i38);
                            oooOO3.OooO0Oo(i38);
                        } else {
                            if (i39 > 0) {
                                i38 = z ? i38 - i37 : i38 + i37;
                            }
                            if (i39 > 0 && i39 >= i7) {
                                i38 = z ? i38 - oooOO4.f41864OooO0o : i38 + oooOO4.f41864OooO0o;
                            }
                            if (z) {
                                oooOO3.OooO0Oo(i38);
                            } else {
                                oooOO4.OooO0Oo(i38);
                            }
                            OooOO0O oooOO0O3 = o0oooo3.f41892OooO0o0;
                            int i41 = oooOO0O3.f41866OooO0oO;
                            if (o0oooo3.f41890OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && o0oooo3.f41887OooO00o == 1) {
                                i41 = oooOO0O3.f41871OooOOO0;
                            }
                            i38 = z ? i38 - i41 : i38 + i41;
                            if (z) {
                                oooOO4.OooO0Oo(i38);
                            } else {
                                oooOO3.OooO0Oo(i38);
                            }
                            o0oooo3.f41893OooO0oO = true;
                            if (i39 < i17 && i39 < i) {
                                i38 = z ? i38 - (-oooOO3.f41864OooO0o) : i38 + (-oooOO3.f41864OooO0o);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 0) {
                    int i42 = (i15 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i42 = i8;
                    }
                    int i43 = i6;
                    for (int i44 = i8; i44 < size; i44++) {
                        o0OoOo0 o0oooo4 = arrayList2.get(z ? size - (i44 + 1) : i44);
                        int i45 = o0oooo4.f41888OooO0O0.f4403o0OoOo0;
                        OooOO0 oooOO5 = o0oooo4.f41886OooO;
                        OooOO0 oooOO6 = o0oooo4.f41894OooO0oo;
                        if (i45 == 8) {
                            oooOO6.OooO0Oo(i43);
                            oooOO5.OooO0Oo(i43);
                        } else {
                            int i46 = z ? i43 - i42 : i43 + i42;
                            if (i44 > 0 && i44 >= i7) {
                                i46 = z ? i46 - oooOO6.f41864OooO0o : i46 + oooOO6.f41864OooO0o;
                            }
                            if (z) {
                                oooOO5.OooO0Oo(i46);
                            } else {
                                oooOO6.OooO0Oo(i46);
                            }
                            OooOO0O oooOO0O4 = o0oooo4.f41892OooO0o0;
                            int iMin = oooOO0O4.f41866OooO0oO;
                            if (o0oooo4.f41890OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && o0oooo4.f41887OooO00o == 1) {
                                iMin = Math.min(iMin, oooOO0O4.f41871OooOOO0);
                            }
                            i43 = z ? i46 - iMin : i46 + iMin;
                            if (z) {
                                oooOO6.OooO0Oo(i43);
                            } else {
                                oooOO5.OooO0Oo(i43);
                            }
                            if (i44 < i17 && i44 < i) {
                                i43 = z ? i43 - (-oooOO5.f41864OooO0o) : i43 + (-oooOO5.f41864OooO0o);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 2) {
                    float f4 = this.f41891OooO0o == 0 ? this.f41888OooO0O0.f4391Oooooo : this.f41888OooO0O0.f4393OoooooO;
                    if (z) {
                        f4 = 1.0f - f4;
                    }
                    int i47 = (int) (((i15 - i5) * f4) + 0.5f);
                    if (i47 < 0 || i3 > 0) {
                        i47 = i8;
                    }
                    int i48 = z ? i6 - i47 : i6 + i47;
                    for (int i49 = i8; i49 < size; i49++) {
                        o0OoOo0 o0oooo5 = arrayList2.get(z ? size - (i49 + 1) : i49);
                        int i50 = o0oooo5.f41888OooO0O0.f4403o0OoOo0;
                        OooOO0 oooOO7 = o0oooo5.f41886OooO;
                        OooOO0 oooOO8 = o0oooo5.f41894OooO0oo;
                        if (i50 == 8) {
                            oooOO8.OooO0Oo(i48);
                            oooOO7.OooO0Oo(i48);
                        } else {
                            if (i49 > 0 && i49 >= i7) {
                                i48 = z ? i48 - oooOO8.f41864OooO0o : i48 + oooOO8.f41864OooO0o;
                            }
                            if (z) {
                                oooOO7.OooO0Oo(i48);
                            } else {
                                oooOO8.OooO0Oo(i48);
                            }
                            OooOO0O oooOO0O5 = o0oooo5.f41892OooO0o0;
                            int i51 = oooOO0O5.f41866OooO0oO;
                            if (o0oooo5.f41890OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && o0oooo5.f41887OooO00o == 1) {
                                i51 = oooOO0O5.f41871OooOOO0;
                            }
                            i48 = z ? i48 - i51 : i48 + i51;
                            if (z) {
                                oooOO8.OooO0Oo(i48);
                            } else {
                                oooOO7.OooO0Oo(i48);
                            }
                            if (i49 < i17 && i49 < i) {
                                i48 = z ? i48 - (-oooOO7.f41864OooO0o) : i48 + (-oooOO7.f41864OooO0o);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // o0O0O00.o0OoOo0
    public final void OooO0Oo() {
        ArrayList<o0OoOo0> arrayList = this.f41857OooOO0O;
        Iterator<o0OoOo0> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().OooO0Oo();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = arrayList.get(0).f41888OooO0O0;
        ConstraintWidget constraintWidget2 = arrayList.get(size - 1).f41888OooO0O0;
        int i = this.f41891OooO0o;
        OooOO0 oooOO1 = this.f41886OooO;
        OooOO0 oooOO2 = this.f41894OooO0oo;
        if (i == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.f4373Oooo0o0;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.f4374Oooo0oO;
            OooOO0 oooOO0OooO = o0OoOo0.OooO(constraintAnchor, 0);
            int iOooO0o0 = constraintAnchor.OooO0o0();
            ConstraintWidget constraintWidgetOooOOO0 = OooOOO0();
            if (constraintWidgetOooOOO0 != null) {
                iOooO0o0 = constraintWidgetOooOOO0.f4373Oooo0o0.OooO0o0();
            }
            if (oooOO0OooO != null) {
                o0OoOo0.OooO0O0(oooOO2, oooOO0OooO, iOooO0o0);
            }
            OooOO0 oooOO0OooO2 = o0OoOo0.OooO(constraintAnchor2, 0);
            int iOooO0o1 = constraintAnchor2.OooO0o0();
            ConstraintWidget constraintWidgetOooOOO = OooOOO();
            if (constraintWidgetOooOOO != null) {
                iOooO0o1 = constraintWidgetOooOOO.f4374Oooo0oO.OooO0o0();
            }
            if (oooOO0OooO2 != null) {
                o0OoOo0.OooO0O0(oooOO1, oooOO0OooO2, -iOooO0o1);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.f4372Oooo0o;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.f4375Oooo0oo;
            OooOO0 oooOO0OooO3 = o0OoOo0.OooO(constraintAnchor3, 1);
            int iOooO0o2 = constraintAnchor3.OooO0o0();
            ConstraintWidget constraintWidgetOooOOO1 = OooOOO0();
            if (constraintWidgetOooOOO1 != null) {
                iOooO0o2 = constraintWidgetOooOOO1.f4372Oooo0o.OooO0o0();
            }
            if (oooOO0OooO3 != null) {
                o0OoOo0.OooO0O0(oooOO2, oooOO0OooO3, iOooO0o2);
            }
            OooOO0 oooOO0OooO4 = o0OoOo0.OooO(constraintAnchor4, 1);
            int iOooO0o3 = constraintAnchor4.OooO0o0();
            ConstraintWidget constraintWidgetOooOOO2 = OooOOO();
            if (constraintWidgetOooOOO2 != null) {
                iOooO0o3 = constraintWidgetOooOOO2.f4375Oooo0oo.OooO0o0();
            }
            if (oooOO0OooO4 != null) {
                o0OoOo0.OooO0O0(oooOO1, oooOO0OooO4, -iOooO0o3);
            }
        }
        oooOO2.f41860OooO00o = this;
        oooOO1.f41860OooO00o = this;
    }

    @Override // o0O0O00.o0OoOo0
    public final void OooO0o() {
        this.f41889OooO0OO = null;
        Iterator<o0OoOo0> it = this.f41857OooOO0O.iterator();
        while (it.hasNext()) {
            it.next().OooO0o();
        }
    }

    @Override // o0O0O00.o0OoOo0
    public final void OooO0o0() {
        int i = 0;
        while (true) {
            ArrayList<o0OoOo0> arrayList = this.f41857OooOO0O;
            if (i >= arrayList.size()) {
                return;
            }
            arrayList.get(i).OooO0o0();
            i++;
        }
    }

    @Override // o0O0O00.o0OoOo0
    public final long OooOO0() {
        ArrayList<o0OoOo0> arrayList = this.f41857OooOO0O;
        int size = arrayList.size();
        long jOooOO0 = 0;
        for (int i = 0; i < size; i++) {
            o0OoOo0 o0oooo0 = arrayList.get(i);
            jOooOO0 = ((long) o0oooo0.f41886OooO.f41864OooO0o) + o0oooo0.OooOO0() + jOooOO0 + ((long) o0oooo0.f41894OooO0oo.f41864OooO0o);
        }
        return jOooOO0;
    }

    @Override // o0O0O00.o0OoOo0
    public final boolean OooOO0O() {
        ArrayList<o0OoOo0> arrayList = this.f41857OooOO0O;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!arrayList.get(i).OooOO0O()) {
                return false;
            }
        }
        return true;
    }

    public final ConstraintWidget OooOOO() {
        ArrayList<o0OoOo0> arrayList = this.f41857OooOO0O;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ConstraintWidget constraintWidget = arrayList.get(size).f41888OooO0O0;
            if (constraintWidget.f4403o0OoOo0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public final ConstraintWidget OooOOO0() {
        int i = 0;
        while (true) {
            ArrayList<o0OoOo0> arrayList = this.f41857OooOO0O;
            if (i >= arrayList.size()) {
                return null;
            }
            ConstraintWidget constraintWidget = arrayList.get(i).f41888OooO0O0;
            if (constraintWidget.f4403o0OoOo0 != 8) {
                return constraintWidget;
            }
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f41891OooO0o == 0 ? "horizontal : " : "vertical : ");
        for (o0OoOo0 o0oooo0 : this.f41857OooOO0O) {
            sb.append("<");
            sb.append(o0oooo0);
            sb.append("> ");
        }
        return sb.toString();
    }
}
