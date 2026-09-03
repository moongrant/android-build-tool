package p061o0000o0;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.OooO0o;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 extends o0O0O00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public ArrayList<o0O0O00> f27847OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f27848OooOO0o;

    public Oooo000(ConstraintWidget constraintWidget, int i) {
        ConstraintWidget constraintWidget2;
        super(constraintWidget);
        this.f27847OooOO0O = new ArrayList<>();
        this.f27876OooO0o = i;
        ConstraintWidget constraintWidget3 = this.f27873OooO0O0;
        ConstraintWidget constraintWidgetOooOo00 = constraintWidget3.OooOo00(i);
        while (true) {
            ConstraintWidget constraintWidget4 = constraintWidgetOooOo00;
            constraintWidget2 = constraintWidget3;
            constraintWidget3 = constraintWidget4;
            if (constraintWidget3 == null) {
                break;
            } else {
                constraintWidgetOooOo00 = constraintWidget3.OooOo00(this.f27876OooO0o);
            }
        }
        this.f27873OooO0O0 = constraintWidget2;
        ArrayList<o0O0O00> arrayList = this.f27847OooOO0O;
        int i2 = this.f27876OooO0o;
        arrayList.add(i2 == 0 ? constraintWidget2.f6904OooO0Oo : i2 == 1 ? constraintWidget2.f6906OooO0o0 : null);
        ConstraintWidget constraintWidgetOooOOoo = constraintWidget2.OooOOoo(this.f27876OooO0o);
        while (constraintWidgetOooOOoo != null) {
            ArrayList<o0O0O00> arrayList2 = this.f27847OooOO0O;
            int i3 = this.f27876OooO0o;
            arrayList2.add(i3 == 0 ? constraintWidgetOooOOoo.f6904OooO0Oo : i3 == 1 ? constraintWidgetOooOOoo.f6906OooO0o0 : null);
            constraintWidgetOooOOoo = constraintWidgetOooOOoo.OooOOoo(this.f27876OooO0o);
        }
        for (o0O0O00 o0o0o00 : this.f27847OooOO0O) {
            int i4 = this.f27876OooO0o;
            if (i4 == 0) {
                o0o0o00.f27873OooO0O0.f6902OooO0O0 = this;
            } else if (i4 == 1) {
                o0o0o00.f27873OooO0O0.f6903OooO0OO = this;
            }
        }
        if ((this.f27876OooO0o == 0 && ((OooO0o) this.f27873OooO0O0.f6948OoooOOo).f7057o000OOo) && this.f27847OooOO0O.size() > 1) {
            ArrayList<o0O0O00> arrayList3 = this.f27847OooOO0O;
            this.f27873OooO0O0 = arrayList3.get(arrayList3.size() - 1).f27873OooO0O0;
        }
        this.f27848OooOO0o = this.f27876OooO0o == 0 ? this.f27873OooO0O0.f6964o00Ooo : this.f27873OooO0O0.f6965o00o0O;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0195  */
    /* JADX WARN: Code duplicated, block: B:294:0x00e0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d8 A[ADDED_TO_REGION] */
    @Override // p061o0000o0.o0O0O00, p061o0000o0.Oooo0
    public final void OooO00o(Oooo0 oooo0) {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f2;
        o00O0O o00o0o2 = this.f27879OooO0oo;
        if (o00o0o2.f27866OooOO0) {
            o00O0O o00o0o3 = this.f27871OooO;
            if (o00o0o3.f27866OooOO0) {
                ConstraintWidget constraintWidget = this.f27873OooO0O0.f6948OoooOOo;
                boolean z2 = constraintWidget instanceof OooO0o ? ((OooO0o) constraintWidget).f7057o000OOo : false;
                int i12 = o00o0o3.f27864OooO0oO - o00o0o2.f27864OooO0oO;
                int size = this.f27847OooOO0O.size();
                int i13 = 0;
                while (true) {
                    i = 8;
                    if (i13 >= size) {
                        i13 = -1;
                        break;
                    } else if (this.f27847OooOO0O.get(i13).f27873OooO0O0.f6969o0OoOo0 != 8) {
                        break;
                    } else {
                        i13++;
                    }
                }
                int i14 = size - 1;
                int i15 = i14;
                while (true) {
                    if (i15 < 0) {
                        i15 = -1;
                        break;
                    } else if (this.f27847OooOO0O.get(i15).f27873OooO0O0.f6969o0OoOo0 != 8) {
                        break;
                    } else {
                        i15--;
                    }
                }
                int i16 = 0;
                while (true) {
                    if (i16 >= 2) {
                        i2 = 0;
                        i3 = 0;
                        i4 = 0;
                        f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        break;
                    }
                    int i17 = 0;
                    i4 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    while (i17 < size) {
                        o0O0O00 o0o0o00 = this.f27847OooOO0O.get(i17);
                        ConstraintWidget constraintWidget2 = o0o0o00.f27873OooO0O0;
                        if (constraintWidget2.f6969o0OoOo0 != i) {
                            i19++;
                            if (i17 > 0 && i17 >= i13) {
                                i4 += o0o0o00.f27879OooO0oo.f27862OooO0o;
                            }
                            o00Oo0 o00oo1 = o0o0o00.f27877OooO0o0;
                            int i20 = o00oo1.f27864OooO0oO;
                            boolean z3 = o0o0o00.f27875OooO0Oo != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                            if (z3) {
                                int i21 = this.f27876OooO0o;
                                if (i21 == 0 && !constraintWidget2.f6904OooO0Oo.f27877OooO0o0.f27866OooOO0) {
                                    return;
                                }
                                if (i21 == 1 && !constraintWidget2.f6906OooO0o0.f27877OooO0o0.f27866OooOO0) {
                                    return;
                                } else {
                                    i10 = i20;
                                }
                            } else {
                                i10 = i20;
                                if (o0o0o00.f27872OooO00o == 1 && i16 == 0) {
                                    i11 = o00oo1.f27869OooOOO0;
                                    i18++;
                                } else {
                                    if (o00oo1.f27866OooOO0) {
                                        i11 = i10;
                                    }
                                    if (z3) {
                                        i4 += i11;
                                    } else {
                                        i18++;
                                        f2 = constraintWidget2.f6968o00ooo[this.f27876OooO0o];
                                        if (f2 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                            f += f2;
                                        }
                                    }
                                    if (i17 >= i14 && i17 < i15) {
                                        i4 += -o0o0o00.f27871OooO.f27862OooO0o;
                                    }
                                }
                                z3 = true;
                                if (z3) {
                                    i18++;
                                    f2 = constraintWidget2.f6968o00ooo[this.f27876OooO0o];
                                    if (f2 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                        f += f2;
                                    }
                                } else {
                                    i4 += i11;
                                }
                                if (i17 >= i14) {
                                }
                            }
                            i11 = i10;
                            if (z3) {
                                i18++;
                                f2 = constraintWidget2.f6968o00ooo[this.f27876OooO0o];
                                if (f2 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                    f += f2;
                                }
                            } else {
                                i4 += i11;
                            }
                            if (i17 >= i14) {
                            }
                        }
                        i17++;
                        i = 8;
                    }
                    if (i4 < i12 || i18 == 0) {
                        i2 = i18;
                        i3 = i19;
                        break;
                    } else {
                        i16++;
                        i = 8;
                    }
                }
                int i22 = this.f27879OooO0oo.f27864OooO0oO;
                if (z2) {
                    i22 = this.f27871OooO.f27864OooO0oO;
                }
                if (i4 > i12) {
                    int i23 = (int) (((i4 - i12) / 2.0f) + 0.5f);
                    i22 = z2 ? i22 + i23 : i22 - i23;
                }
                if (i2 > 0) {
                    float f3 = i12 - i4;
                    int i24 = (int) ((f3 / i2) + 0.5f);
                    int i25 = 0;
                    int i26 = 0;
                    while (i25 < size) {
                        o0O0O00 o0o0o01 = this.f27847OooOO0O.get(i25);
                        int i27 = i24;
                        ConstraintWidget constraintWidget3 = o0o0o01.f27873OooO0O0;
                        int i28 = i4;
                        int i29 = i22;
                        if (constraintWidget3.f6969o0OoOo0 != 8 && o0o0o01.f27875OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                            o00Oo0 o00oo2 = o0o0o01.f27877OooO0o0;
                            if (o00oo2.f27866OooOO0) {
                                z2 = z2;
                            } else {
                                int i30 = f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? (int) (((constraintWidget3.f6968o00ooo[this.f27876OooO0o] * f3) / f) + 0.5f) : i27;
                                if (this.f27876OooO0o == 0) {
                                    i8 = constraintWidget3.f6919OooOo;
                                    i9 = constraintWidget3.f6923OooOo0o;
                                } else {
                                    i8 = constraintWidget3.f6926OooOoOO;
                                    i9 = constraintWidget3.f6924OooOoO;
                                }
                                int iMax = Math.max(i9, o0o0o01.f27872OooO00o == 1 ? Math.min(i30, o00oo2.f27869OooOOO0) : i30);
                                if (i8 > 0) {
                                    iMax = Math.min(i8, iMax);
                                }
                                if (iMax != i30) {
                                    i26++;
                                    i30 = iMax;
                                }
                                o0o0o01.f27877OooO0o0.OooO0Oo(i30);
                            }
                        } else {
                            z2 = z2;
                        }
                        i25++;
                        i24 = i27;
                        i4 = i28;
                        i22 = i29;
                        z2 = z2;
                        f3 = f3;
                        i3 = i3;
                    }
                    z = z2;
                    i5 = i3;
                    i6 = i22;
                    int i31 = i4;
                    if (i26 > 0) {
                        i2 -= i26;
                        int i32 = 0;
                        for (int i33 = 0; i33 < size; i33++) {
                            o0O0O00 o0o0o02 = this.f27847OooOO0O.get(i33);
                            if (o0o0o02.f27873OooO0O0.f6969o0OoOo0 != 8) {
                                if (i33 > 0 && i33 >= i13) {
                                    i32 += o0o0o02.f27879OooO0oo.f27862OooO0o;
                                }
                                i32 += o0o0o02.f27877OooO0o0.f27864OooO0oO;
                                if (i33 < i14 && i33 < i15) {
                                    i32 += -o0o0o02.f27871OooO.f27862OooO0o;
                                }
                            }
                        }
                        i4 = i32;
                    } else {
                        i4 = i31;
                    }
                    i7 = 2;
                    if (this.f27848OooOO0o == 2 && i26 == 0) {
                        this.f27848OooOO0o = 0;
                    }
                } else {
                    z = z2;
                    i5 = i3;
                    i6 = i22;
                    i7 = 2;
                }
                if (i4 > i12) {
                    this.f27848OooOO0o = i7;
                }
                if (i5 > 0 && i2 == 0 && i13 == i15) {
                    this.f27848OooOO0o = i7;
                }
                int i34 = this.f27848OooOO0o;
                if (i34 == 1) {
                    int i35 = i5;
                    int i36 = i35 > 1 ? (i12 - i4) / ((-1) + i35) : i35 == 1 ? (i12 - i4) / 2 : 0;
                    if (i2 > 0) {
                        i36 = 0;
                    }
                    int i37 = i6;
                    for (int i38 = 0; i38 < size; i38++) {
                        o0O0O00 o0o0o03 = this.f27847OooOO0O.get(z ? size - (i38 + 1) : i38);
                        if (o0o0o03.f27873OooO0O0.f6969o0OoOo0 == 8) {
                            o0o0o03.f27879OooO0oo.OooO0Oo(i37);
                            o0o0o03.f27871OooO.OooO0Oo(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i13) {
                                i37 = z ? i37 - o0o0o03.f27879OooO0oo.f27862OooO0o : i37 + o0o0o03.f27879OooO0oo.f27862OooO0o;
                            }
                            if (z) {
                                o0o0o03.f27871OooO.OooO0Oo(i37);
                            } else {
                                o0o0o03.f27879OooO0oo.OooO0Oo(i37);
                            }
                            o00Oo0 o00oo3 = o0o0o03.f27877OooO0o0;
                            int i39 = o00oo3.f27864OooO0oO;
                            if (o0o0o03.f27875OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && o0o0o03.f27872OooO00o == 1) {
                                i39 = o00oo3.f27869OooOOO0;
                            }
                            i37 = z ? i37 - i39 : i37 + i39;
                            if (z) {
                                o0o0o03.f27879OooO0oo.OooO0Oo(i37);
                            } else {
                                o0o0o03.f27871OooO.OooO0Oo(i37);
                            }
                            o0o0o03.f27878OooO0oO = true;
                            if (i38 < i14 && i38 < i15) {
                                i37 = z ? i37 - (-o0o0o03.f27871OooO.f27862OooO0o) : i37 + (-o0o0o03.f27871OooO.f27862OooO0o);
                            }
                        }
                    }
                    return;
                }
                int i40 = i5;
                if (i34 == 0) {
                    int i41 = (i12 - i4) / (i40 + 1);
                    if (i2 > 0) {
                        i41 = 0;
                    }
                    int i42 = i6;
                    for (int i43 = 0; i43 < size; i43++) {
                        o0O0O00 o0o0o04 = this.f27847OooOO0O.get(z ? size - (i43 + 1) : i43);
                        if (o0o0o04.f27873OooO0O0.f6969o0OoOo0 == 8) {
                            o0o0o04.f27879OooO0oo.OooO0Oo(i42);
                            o0o0o04.f27871OooO.OooO0Oo(i42);
                        } else {
                            int i44 = z ? i42 - i41 : i42 + i41;
                            if (i43 > 0 && i43 >= i13) {
                                i44 = z ? i44 - o0o0o04.f27879OooO0oo.f27862OooO0o : i44 + o0o0o04.f27879OooO0oo.f27862OooO0o;
                            }
                            if (z) {
                                o0o0o04.f27871OooO.OooO0Oo(i44);
                            } else {
                                o0o0o04.f27879OooO0oo.OooO0Oo(i44);
                            }
                            o00Oo0 o00oo4 = o0o0o04.f27877OooO0o0;
                            int iMin = o00oo4.f27864OooO0oO;
                            if (o0o0o04.f27875OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && o0o0o04.f27872OooO00o == 1) {
                                iMin = Math.min(iMin, o00oo4.f27869OooOOO0);
                            }
                            i42 = z ? i44 - iMin : i44 + iMin;
                            if (z) {
                                o0o0o04.f27879OooO0oo.OooO0Oo(i42);
                            } else {
                                o0o0o04.f27871OooO.OooO0Oo(i42);
                            }
                            if (i43 < i14 && i43 < i15) {
                                i42 = z ? i42 - (-o0o0o04.f27871OooO.f27862OooO0o) : i42 + (-o0o0o04.f27871OooO.f27862OooO0o);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 2) {
                    float f4 = this.f27876OooO0o == 0 ? this.f27873OooO0O0.f6957Oooooo : this.f27873OooO0O0.f6959OoooooO;
                    if (z) {
                        f4 = 1.0f - f4;
                    }
                    int i45 = (int) (((i12 - i4) * f4) + 0.5f);
                    if (i45 < 0 || i2 > 0) {
                        i45 = 0;
                    }
                    int i46 = z ? i6 - i45 : i6 + i45;
                    for (int i47 = 0; i47 < size; i47++) {
                        o0O0O00 o0o0o05 = this.f27847OooOO0O.get(z ? size - (i47 + 1) : i47);
                        if (o0o0o05.f27873OooO0O0.f6969o0OoOo0 == 8) {
                            o0o0o05.f27879OooO0oo.OooO0Oo(i46);
                            o0o0o05.f27871OooO.OooO0Oo(i46);
                        } else {
                            if (i47 > 0 && i47 >= i13) {
                                i46 = z ? i46 - o0o0o05.f27879OooO0oo.f27862OooO0o : i46 + o0o0o05.f27879OooO0oo.f27862OooO0o;
                            }
                            if (z) {
                                o0o0o05.f27871OooO.OooO0Oo(i46);
                            } else {
                                o0o0o05.f27879OooO0oo.OooO0Oo(i46);
                            }
                            o00Oo0 o00oo5 = o0o0o05.f27877OooO0o0;
                            int i48 = o00oo5.f27864OooO0oO;
                            if (o0o0o05.f27875OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && o0o0o05.f27872OooO00o == 1) {
                                i48 = o00oo5.f27869OooOOO0;
                            }
                            i46 = z ? i46 - i48 : i46 + i48;
                            if (z) {
                                o0o0o05.f27879OooO0oo.OooO0Oo(i46);
                            } else {
                                o0o0o05.f27871OooO.OooO0Oo(i46);
                            }
                            if (i47 < i14 && i47 < i15) {
                                i46 = z ? i46 - (-o0o0o05.f27871OooO.f27862OooO0o) : i46 + (-o0o0o05.f27871OooO.f27862OooO0o);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p061o0000o0.o0O0O00
    public final void OooO0Oo() {
        Iterator<o0O0O00> it = this.f27847OooOO0O.iterator();
        while (it.hasNext()) {
            it.next().OooO0Oo();
        }
        int size = this.f27847OooOO0O.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = this.f27847OooOO0O.get(0).f27873OooO0O0;
        ConstraintWidget constraintWidget2 = this.f27847OooOO0O.get(size - 1).f27873OooO0O0;
        if (this.f27876OooO0o == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.f6939Oooo0o0;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.f6940Oooo0oO;
            o00O0O o00o0oOooO = OooO(constraintAnchor, 0);
            int iOooO0o0 = constraintAnchor.OooO0o0();
            ConstraintWidget constraintWidgetOooOOO0 = OooOOO0();
            if (constraintWidgetOooOOO0 != null) {
                iOooO0o0 = constraintWidgetOooOOO0.f6939Oooo0o0.OooO0o0();
            }
            if (o00o0oOooO != null) {
                OooO0O0(this.f27879OooO0oo, o00o0oOooO, iOooO0o0);
            }
            o00O0O o00o0oOooO2 = OooO(constraintAnchor2, 0);
            int iOooO0o1 = constraintAnchor2.OooO0o0();
            ConstraintWidget constraintWidgetOooOOO = OooOOO();
            if (constraintWidgetOooOOO != null) {
                iOooO0o1 = constraintWidgetOooOOO.f6940Oooo0oO.OooO0o0();
            }
            if (o00o0oOooO2 != null) {
                OooO0O0(this.f27871OooO, o00o0oOooO2, -iOooO0o1);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.f6938Oooo0o;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.f6941Oooo0oo;
            o00O0O o00o0oOooO3 = OooO(constraintAnchor3, 1);
            int iOooO0o2 = constraintAnchor3.OooO0o0();
            ConstraintWidget constraintWidgetOooOOO1 = OooOOO0();
            if (constraintWidgetOooOOO1 != null) {
                iOooO0o2 = constraintWidgetOooOOO1.f6938Oooo0o.OooO0o0();
            }
            if (o00o0oOooO3 != null) {
                OooO0O0(this.f27879OooO0oo, o00o0oOooO3, iOooO0o2);
            }
            o00O0O o00o0oOooO4 = OooO(constraintAnchor4, 1);
            int iOooO0o3 = constraintAnchor4.OooO0o0();
            ConstraintWidget constraintWidgetOooOOO2 = OooOOO();
            if (constraintWidgetOooOOO2 != null) {
                iOooO0o3 = constraintWidgetOooOOO2.f6941Oooo0oo.OooO0o0();
            }
            if (o00o0oOooO4 != null) {
                OooO0O0(this.f27871OooO, o00o0oOooO4, -iOooO0o3);
            }
        }
        this.f27879OooO0oo.f27858OooO00o = this;
        this.f27871OooO.f27858OooO00o = this;
    }

    @Override // p061o0000o0.o0O0O00
    public final void OooO0o() {
        this.f27874OooO0OO = null;
        Iterator<o0O0O00> it = this.f27847OooOO0O.iterator();
        while (it.hasNext()) {
            it.next().OooO0o();
        }
    }

    @Override // p061o0000o0.o0O0O00
    public final void OooO0o0() {
        for (int i = 0; i < this.f27847OooOO0O.size(); i++) {
            this.f27847OooOO0O.get(i).OooO0o0();
        }
    }

    @Override // p061o0000o0.o0O0O00
    public final long OooOO0() {
        int size = this.f27847OooOO0O.size();
        long jOooOO0 = 0;
        for (int i = 0; i < size; i++) {
            o0O0O00 o0o0o00 = this.f27847OooOO0O.get(i);
            jOooOO0 = ((long) o0o0o00.f27871OooO.f27862OooO0o) + o0o0o00.OooOO0() + jOooOO0 + ((long) o0o0o00.f27879OooO0oo.f27862OooO0o);
        }
        return jOooOO0;
    }

    @Override // p061o0000o0.o0O0O00
    public final boolean OooOO0O() {
        int size = this.f27847OooOO0O.size();
        for (int i = 0; i < size; i++) {
            if (!this.f27847OooOO0O.get(i).OooOO0O()) {
                return false;
            }
        }
        return true;
    }

    public final ConstraintWidget OooOOO() {
        for (int size = this.f27847OooOO0O.size() - 1; size >= 0; size--) {
            ConstraintWidget constraintWidget = this.f27847OooOO0O.get(size).f27873OooO0O0;
            if (constraintWidget.f6969o0OoOo0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public final ConstraintWidget OooOOO0() {
        for (int i = 0; i < this.f27847OooOO0O.size(); i++) {
            ConstraintWidget constraintWidget = this.f27847OooOO0O.get(i).f27873OooO0O0;
            if (constraintWidget.f6969o0OoOo0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f27876OooO0o == 0 ? "horizontal : " : "vertical : ");
        for (o0O0O00 o0o0o00 : this.f27847OooOO0O) {
            sb.append("<");
            sb.append(o0o0o00);
            sb.append("> ");
        }
        return sb.toString();
    }
}
