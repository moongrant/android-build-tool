package p061o0000o0;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import p058o0000OoO.OooOO0;
import p418o0Oo0oo.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o extends o0O0O00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static int[] f27885OooOO0O = new int[2];

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f27886OooO00o;

        static {
            int[] iArr = new int[o00000O0.OooO0OO(4).length];
            f27886OooO00o = iArr;
            try {
                iArr[o00000O0.OooO0O0(2)] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27886OooO00o[o00000O0.OooO0O0(3)] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27886OooO00o[o00000O0.OooO0O0(4)] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public o0OOO0o(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f27879OooO0oo.f27863OooO0o0 = 4;
        this.f27871OooO.f27863OooO0o0 = 5;
        this.f27876OooO0o = 0;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x029d  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ac  */
    /* JADX WARN: Type inference failed for: r0v100, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r0v105, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r0v109, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r0v113, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r0v124, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r0v128, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r0v139, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r0v144, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    @Override // p061o0000o0.o0O0O00, p061o0000o0.Oooo0
    public final void OooO00o(Oooo0 oooo0) {
        int iOooO0oO;
        int i;
        int iOooO0oO2;
        float f;
        float f2;
        float f3;
        int i2;
        if (OooO00o.f27886OooO00o[o00000O0.OooO0O0(this.f27880OooOO0)] == 3) {
            ConstraintWidget constraintWidget = this.f27873OooO0O0;
            OooOO0o(constraintWidget.f6939Oooo0o0, constraintWidget.f6940Oooo0oO, 0);
            return;
        }
        o00Oo0 o00oo1 = this.f27877OooO0o0;
        if (!o00oo1.f27866OooOO0 && this.f27875OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.f27873OooO0O0;
            int i3 = constraintWidget2.f6921OooOo00;
            if (i3 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.f6948OoooOOo;
                if (constraintWidget3 != null) {
                    o00Oo0 o00oo2 = constraintWidget3.f6904OooO0Oo.f27877OooO0o0;
                    if (o00oo2.f27866OooOO0) {
                        o00oo1.OooO0Oo((int) ((o00oo2.f27864OooO0oO * constraintWidget2.f6925OooOoO0) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = constraintWidget2.f6920OooOo0;
                if (i4 == 0 || i4 == 3) {
                    o0OO00O o0oo00o2 = constraintWidget2.f6906OooO0o0;
                    o00O0O o00o0o2 = o0oo00o2.f27879OooO0oo;
                    o00O0O o00o0o3 = o0oo00o2.f27871OooO;
                    boolean z = constraintWidget2.f6939Oooo0o0.f6895OooO0o != null;
                    boolean z2 = constraintWidget2.f6938Oooo0o.f6895OooO0o != null;
                    boolean z3 = constraintWidget2.f6940Oooo0oO.f6895OooO0o != null;
                    boolean z4 = constraintWidget2.f6941Oooo0oo.f6895OooO0o != null;
                    int i5 = constraintWidget2.f6952Ooooo00;
                    if (z && z2 && z3 && z4) {
                        float f4 = constraintWidget2.f6951OoooOoo;
                        if (o00o0o2.f27866OooOO0 && o00o0o3.f27866OooOO0) {
                            o00O0O o00o0o4 = this.f27879OooO0oo;
                            if (o00o0o4.f27860OooO0OO && this.f27871OooO.f27860OooO0OO) {
                                int i6 = ((o00O0O) o00o0o4.f27868OooOO0o.get(0)).f27864OooO0oO + this.f27879OooO0oo.f27862OooO0o;
                                int i7 = ((o00O0O) this.f27871OooO.f27868OooOO0o.get(0)).f27864OooO0oO - this.f27871OooO.f27862OooO0o;
                                int i8 = o00o0o2.f27864OooO0oO + o00o0o2.f27862OooO0o;
                                int i9 = o00o0o3.f27864OooO0oO - o00o0o3.f27862OooO0o;
                                int[] iArr = f27885OooOO0O;
                                OooOOO0(iArr, i6, i7, i8, i9, f4, i5);
                                this.f27877OooO0o0.OooO0Oo(iArr[0]);
                                this.f27873OooO0O0.f6906OooO0o0.f27877OooO0o0.OooO0Oo(iArr[1]);
                                return;
                            }
                            return;
                        }
                        o00O0O o00o0o5 = this.f27879OooO0oo;
                        if (o00o0o5.f27866OooOO0) {
                            o00O0O o00o0o6 = this.f27871OooO;
                            if (o00o0o6.f27866OooOO0) {
                                if (!o00o0o2.f27860OooO0OO || !o00o0o3.f27860OooO0OO) {
                                    return;
                                }
                                int i10 = o00o0o5.f27864OooO0oO + o00o0o5.f27862OooO0o;
                                int i11 = o00o0o6.f27864OooO0oO - o00o0o6.f27862OooO0o;
                                int i12 = ((o00O0O) o00o0o2.f27868OooOO0o.get(0)).f27864OooO0oO + o00o0o2.f27862OooO0o;
                                int i13 = ((o00O0O) o00o0o3.f27868OooOO0o.get(0)).f27864OooO0oO - o00o0o3.f27862OooO0o;
                                int[] iArr2 = f27885OooOO0O;
                                OooOOO0(iArr2, i10, i11, i12, i13, f4, i5);
                                this.f27877OooO0o0.OooO0Oo(iArr2[0]);
                                this.f27873OooO0O0.f6906OooO0o0.f27877OooO0o0.OooO0Oo(iArr2[1]);
                            }
                        }
                        o00O0O o00o0o7 = this.f27879OooO0oo;
                        if (!o00o0o7.f27860OooO0OO || !this.f27871OooO.f27860OooO0OO || !o00o0o2.f27860OooO0OO || !o00o0o3.f27860OooO0OO) {
                            return;
                        }
                        int i14 = ((o00O0O) o00o0o7.f27868OooOO0o.get(0)).f27864OooO0oO + this.f27879OooO0oo.f27862OooO0o;
                        int i15 = ((o00O0O) this.f27871OooO.f27868OooOO0o.get(0)).f27864OooO0oO - this.f27871OooO.f27862OooO0o;
                        int i16 = ((o00O0O) o00o0o2.f27868OooOO0o.get(0)).f27864OooO0oO + o00o0o2.f27862OooO0o;
                        int i17 = ((o00O0O) o00o0o3.f27868OooOO0o.get(0)).f27864OooO0oO - o00o0o3.f27862OooO0o;
                        int[] iArr3 = f27885OooOO0O;
                        OooOOO0(iArr3, i14, i15, i16, i17, f4, i5);
                        this.f27877OooO0o0.OooO0Oo(iArr3[0]);
                        this.f27873OooO0O0.f6906OooO0o0.f27877OooO0o0.OooO0Oo(iArr3[1]);
                    } else if (z && z3) {
                        o00O0O o00o0o8 = this.f27879OooO0oo;
                        if (!o00o0o8.f27860OooO0OO || !this.f27871OooO.f27860OooO0OO) {
                            return;
                        }
                        float f5 = constraintWidget2.f6951OoooOoo;
                        int i18 = ((o00O0O) o00o0o8.f27868OooOO0o.get(0)).f27864OooO0oO + this.f27879OooO0oo.f27862OooO0o;
                        int i19 = ((o00O0O) this.f27871OooO.f27868OooOO0o.get(0)).f27864OooO0oO - this.f27871OooO.f27862OooO0o;
                        if (i5 == -1 || i5 == 0) {
                            int iOooO0oO3 = OooO0oO(i19 - i18, 0);
                            int i20 = (int) ((iOooO0oO3 * f5) + 0.5f);
                            int iOooO0oO4 = OooO0oO(i20, 1);
                            if (i20 != iOooO0oO4) {
                                iOooO0oO3 = (int) ((iOooO0oO4 / f5) + 0.5f);
                            }
                            this.f27877OooO0o0.OooO0Oo(iOooO0oO3);
                            this.f27873OooO0O0.f6906OooO0o0.f27877OooO0o0.OooO0Oo(iOooO0oO4);
                        } else if (i5 == 1) {
                            int iOooO0oO5 = OooO0oO(i19 - i18, 0);
                            int i21 = (int) ((iOooO0oO5 / f5) + 0.5f);
                            int iOooO0oO6 = OooO0oO(i21, 1);
                            if (i21 != iOooO0oO6) {
                                iOooO0oO5 = (int) ((iOooO0oO6 * f5) + 0.5f);
                            }
                            this.f27877OooO0o0.OooO0Oo(iOooO0oO5);
                            this.f27873OooO0O0.f6906OooO0o0.f27877OooO0o0.OooO0Oo(iOooO0oO6);
                        }
                    } else if (z2 && z4) {
                        if (!o00o0o2.f27860OooO0OO || !o00o0o3.f27860OooO0OO) {
                            return;
                        }
                        float f6 = constraintWidget2.f6951OoooOoo;
                        int i22 = ((o00O0O) o00o0o2.f27868OooOO0o.get(0)).f27864OooO0oO + o00o0o2.f27862OooO0o;
                        int i23 = ((o00O0O) o00o0o3.f27868OooOO0o.get(0)).f27864OooO0oO - o00o0o3.f27862OooO0o;
                        if (i5 == -1) {
                            iOooO0oO = OooO0oO(i23 - i22, 1);
                            i = (int) ((iOooO0oO / f6) + 0.5f);
                            iOooO0oO2 = OooO0oO(i, 0);
                            if (i != iOooO0oO2) {
                                iOooO0oO = (int) ((iOooO0oO2 * f6) + 0.5f);
                            }
                            this.f27877OooO0o0.OooO0Oo(iOooO0oO2);
                            this.f27873OooO0O0.f6906OooO0o0.f27877OooO0o0.OooO0Oo(iOooO0oO);
                        } else if (i5 == 0) {
                            int iOooO0oO7 = OooO0oO(i23 - i22, 1);
                            int i24 = (int) ((iOooO0oO7 * f6) + 0.5f);
                            int iOooO0oO8 = OooO0oO(i24, 0);
                            if (i24 != iOooO0oO8) {
                                iOooO0oO7 = (int) ((iOooO0oO8 / f6) + 0.5f);
                            }
                            this.f27877OooO0o0.OooO0Oo(iOooO0oO8);
                            this.f27873OooO0O0.f6906OooO0o0.f27877OooO0o0.OooO0Oo(iOooO0oO7);
                        } else if (i5 == 1) {
                            iOooO0oO = OooO0oO(i23 - i22, 1);
                            i = (int) ((iOooO0oO / f6) + 0.5f);
                            iOooO0oO2 = OooO0oO(i, 0);
                            if (i != iOooO0oO2) {
                                iOooO0oO = (int) ((iOooO0oO2 * f6) + 0.5f);
                            }
                            this.f27877OooO0o0.OooO0Oo(iOooO0oO2);
                            this.f27873OooO0O0.f6906OooO0o0.f27877OooO0o0.OooO0Oo(iOooO0oO);
                        }
                    }
                } else {
                    int i25 = constraintWidget2.f6952Ooooo00;
                    if (i25 != -1) {
                        if (i25 == 0) {
                            f3 = constraintWidget2.f6906OooO0o0.f27877OooO0o0.f27864OooO0oO / constraintWidget2.f6951OoooOoo;
                            i2 = (int) (f3 + 0.5f);
                        } else if (i25 != 1) {
                            i2 = 0;
                        } else {
                            f = constraintWidget2.f6906OooO0o0.f27877OooO0o0.f27864OooO0oO;
                            f2 = constraintWidget2.f6951OoooOoo;
                        }
                        o00oo1.OooO0Oo(i2);
                    } else {
                        f = constraintWidget2.f6906OooO0o0.f27877OooO0o0.f27864OooO0oO;
                        f2 = constraintWidget2.f6951OoooOoo;
                    }
                    f3 = f * f2;
                    i2 = (int) (f3 + 0.5f);
                    o00oo1.OooO0Oo(i2);
                }
            }
        }
        o00O0O o00o0o9 = this.f27879OooO0oo;
        if (o00o0o9.f27860OooO0OO) {
            o00O0O o00o0o10 = this.f27871OooO;
            if (o00o0o10.f27860OooO0OO) {
                if (o00o0o9.f27866OooOO0 && o00o0o10.f27866OooOO0 && this.f27877OooO0o0.f27866OooOO0) {
                    return;
                }
                if (!this.f27877OooO0o0.f27866OooOO0 && this.f27875OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget4 = this.f27873OooO0O0;
                    if (constraintWidget4.f6921OooOo00 == 0 && !constraintWidget4.Oooo000()) {
                        o00O0O o00o0o11 = (o00O0O) this.f27879OooO0oo.f27868OooOO0o.get(0);
                        o00O0O o00o0o12 = (o00O0O) this.f27871OooO.f27868OooOO0o.get(0);
                        int i26 = o00o0o11.f27864OooO0oO;
                        o00O0O o00o0o13 = this.f27879OooO0oo;
                        int i27 = i26 + o00o0o13.f27862OooO0o;
                        int i28 = o00o0o12.f27864OooO0oO + this.f27871OooO.f27862OooO0o;
                        o00o0o13.OooO0Oo(i27);
                        this.f27871OooO.OooO0Oo(i28);
                        this.f27877OooO0o0.OooO0Oo(i28 - i27);
                        return;
                    }
                }
                if (!this.f27877OooO0o0.f27866OooOO0 && this.f27875OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f27872OooO00o == 1 && this.f27879OooO0oo.f27868OooOO0o.size() > 0 && this.f27871OooO.f27868OooOO0o.size() > 0) {
                    int iMin = Math.min((((o00O0O) this.f27871OooO.f27868OooOO0o.get(0)).f27864OooO0oO + this.f27871OooO.f27862OooO0o) - (((o00O0O) this.f27879OooO0oo.f27868OooOO0o.get(0)).f27864OooO0oO + this.f27879OooO0oo.f27862OooO0o), this.f27877OooO0o0.f27869OooOOO0);
                    ConstraintWidget constraintWidget5 = this.f27873OooO0O0;
                    int i29 = constraintWidget5.f6919OooOo;
                    int iMax = Math.max(constraintWidget5.f6923OooOo0o, iMin);
                    if (i29 > 0) {
                        iMax = Math.min(i29, iMax);
                    }
                    this.f27877OooO0o0.OooO0Oo(iMax);
                }
                if (this.f27877OooO0o0.f27866OooOO0) {
                    o00O0O o00o0o14 = (o00O0O) this.f27879OooO0oo.f27868OooOO0o.get(0);
                    o00O0O o00o0o15 = (o00O0O) this.f27871OooO.f27868OooOO0o.get(0);
                    int i30 = o00o0o14.f27864OooO0oO;
                    o00O0O o00o0o16 = this.f27879OooO0oo;
                    int i31 = o00o0o16.f27862OooO0o + i30;
                    int i32 = o00o0o15.f27864OooO0oO;
                    int i33 = this.f27871OooO.f27862OooO0o + i32;
                    float f7 = this.f27873OooO0O0.f6957Oooooo;
                    if (o00o0o14 == o00o0o15) {
                        f7 = 0.5f;
                    } else {
                        i30 = i31;
                        i32 = i33;
                    }
                    o00o0o16.OooO0Oo((int) ((((i32 - i30) - this.f27877OooO0o0.f27864OooO0oO) * f7) + i30 + 0.5f));
                    this.f27871OooO.OooO0Oo(this.f27879OooO0oo.f27864OooO0oO + this.f27877OooO0o0.f27864OooO0oO);
                }
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p061o0000o0.o0O0O00
    public final void OooO0Oo() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5 = this.f27873OooO0O0;
        if (constraintWidget5.f6901OooO00o) {
            this.f27877OooO0o0.OooO0Oo(constraintWidget5.OooOoO0());
        }
        o00Oo0 o00oo1 = this.f27877OooO0o0;
        if (o00oo1.f27866OooOO0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f27875OooO0Oo;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour == dimensionBehaviour2 && (constraintWidget2 = (constraintWidget = this.f27873OooO0O0).f6948OoooOOo) != null) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget2.f6947OoooOOO;
                if (dimensionBehaviourArr[0] == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviourArr[0] == dimensionBehaviour2) {
                    OooO0O0(this.f27879OooO0oo, constraintWidget2.f6904OooO0Oo.f27879OooO0oo, constraintWidget.f6939Oooo0o0.OooO0o0());
                    OooO0O0(this.f27871OooO, constraintWidget2.f6904OooO0Oo.f27871OooO, -this.f27873OooO0O0.f6940Oooo0oO.OooO0o0());
                    return;
                }
            }
        } else {
            ConstraintWidget constraintWidget6 = this.f27873OooO0O0;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget6.f6947OoooOOO[0];
            this.f27875OooO0Oo = dimensionBehaviour3;
            if (dimensionBehaviour3 != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (dimensionBehaviour3 == dimensionBehaviour4 && (constraintWidget4 = constraintWidget6.f6948OoooOOo) != null) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget4.f6947OoooOOO;
                    if (dimensionBehaviourArr2[0] == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviourArr2[0] == dimensionBehaviour4) {
                        int iOooOoO0 = (constraintWidget4.OooOoO0() - this.f27873OooO0O0.f6939Oooo0o0.OooO0o0()) - this.f27873OooO0O0.f6940Oooo0oO.OooO0o0();
                        OooO0O0(this.f27879OooO0oo, constraintWidget4.f6904OooO0Oo.f27879OooO0oo, this.f27873OooO0O0.f6939Oooo0o0.OooO0o0());
                        OooO0O0(this.f27871OooO, constraintWidget4.f6904OooO0Oo.f27871OooO, -this.f27873OooO0O0.f6940Oooo0oO.OooO0o0());
                        this.f27877OooO0o0.OooO0Oo(iOooOoO0);
                        return;
                    }
                }
                if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED) {
                    o00oo1.OooO0Oo(constraintWidget6.OooOoO0());
                }
            }
        }
        o00Oo0 o00oo2 = this.f27877OooO0o0;
        if (o00oo2.f27866OooOO0) {
            ConstraintWidget constraintWidget7 = this.f27873OooO0O0;
            if (constraintWidget7.f6901OooO00o) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.f6942OoooO;
                if (constraintAnchorArr[0].f6895OooO0o != null && constraintAnchorArr[1].f6895OooO0o != null) {
                    if (constraintWidget7.Oooo000()) {
                        this.f27879OooO0oo.f27862OooO0o = this.f27873OooO0O0.f6942OoooO[0].OooO0o0();
                        this.f27871OooO.f27862OooO0o = -this.f27873OooO0O0.f6942OoooO[1].OooO0o0();
                        return;
                    }
                    o00O0O o00o0oOooO0oo = OooO0oo(this.f27873OooO0O0.f6942OoooO[0]);
                    if (o00o0oOooO0oo != null) {
                        OooO0O0(this.f27879OooO0oo, o00o0oOooO0oo, this.f27873OooO0O0.f6942OoooO[0].OooO0o0());
                    }
                    o00O0O o00o0oOooO0oo2 = OooO0oo(this.f27873OooO0O0.f6942OoooO[1]);
                    if (o00o0oOooO0oo2 != null) {
                        OooO0O0(this.f27871OooO, o00o0oOooO0oo2, -this.f27873OooO0O0.f6942OoooO[1].OooO0o0());
                    }
                    this.f27879OooO0oo.f27859OooO0O0 = true;
                    this.f27871OooO.f27859OooO0O0 = true;
                    return;
                }
                if (constraintAnchorArr[0].f6895OooO0o != null) {
                    o00O0O o00o0oOooO0oo3 = OooO0oo(constraintAnchorArr[0]);
                    if (o00o0oOooO0oo3 != null) {
                        OooO0O0(this.f27879OooO0oo, o00o0oOooO0oo3, this.f27873OooO0O0.f6942OoooO[0].OooO0o0());
                        OooO0O0(this.f27871OooO, this.f27879OooO0oo, this.f27877OooO0o0.f27864OooO0oO);
                        return;
                    }
                    return;
                }
                if (constraintAnchorArr[1].f6895OooO0o != null) {
                    o00O0O o00o0oOooO0oo4 = OooO0oo(constraintAnchorArr[1]);
                    if (o00o0oOooO0oo4 != null) {
                        OooO0O0(this.f27871OooO, o00o0oOooO0oo4, -this.f27873OooO0O0.f6942OoooO[1].OooO0o0());
                        OooO0O0(this.f27879OooO0oo, this.f27871OooO, -this.f27877OooO0o0.f27864OooO0oO);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof OooOO0) || constraintWidget7.f6948OoooOOo == null || constraintWidget7.OooOOOO(ConstraintAnchor.Type.CENTER).f6895OooO0o != null) {
                    return;
                }
                ConstraintWidget constraintWidget8 = this.f27873OooO0O0;
                OooO0O0(this.f27879OooO0oo, constraintWidget8.f6948OoooOOo.f6904OooO0Oo.f27879OooO0oo, constraintWidget8.OooOoO());
                OooO0O0(this.f27871OooO, this.f27879OooO0oo, this.f27877OooO0o0.f27864OooO0oO);
                return;
            }
        }
        if (this.f27875OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget9 = this.f27873OooO0O0;
            int i = constraintWidget9.f6921OooOo00;
            if (i == 2) {
                ConstraintWidget constraintWidget10 = constraintWidget9.f6948OoooOOo;
                if (constraintWidget10 != null) {
                    o00Oo0 o00oo3 = constraintWidget10.f6906OooO0o0.f27877OooO0o0;
                    o00oo2.f27868OooOO0o.add(o00oo3);
                    o00oo3.f27867OooOO0O.add(this.f27877OooO0o0);
                    o00Oo0 o00oo4 = this.f27877OooO0o0;
                    o00oo4.f27859OooO0O0 = true;
                    o00oo4.f27867OooOO0O.add(this.f27879OooO0oo);
                    this.f27877OooO0o0.f27867OooOO0O.add(this.f27871OooO);
                }
            } else if (i == 3) {
                if (constraintWidget9.f6920OooOo0 == 3) {
                    this.f27879OooO0oo.f27858OooO00o = this;
                    this.f27871OooO.f27858OooO00o = this;
                    o0OO00O o0oo00o2 = constraintWidget9.f6906OooO0o0;
                    o0oo00o2.f27879OooO0oo.f27858OooO00o = this;
                    o0oo00o2.f27871OooO.f27858OooO00o = this;
                    o00oo2.f27858OooO00o = this;
                    if (constraintWidget9.Oooo00O()) {
                        this.f27877OooO0o0.f27868OooOO0o.add(this.f27873OooO0O0.f6906OooO0o0.f27877OooO0o0);
                        this.f27873OooO0O0.f6906OooO0o0.f27877OooO0o0.f27867OooOO0O.add(this.f27877OooO0o0);
                        o0OO00O o0oo00o3 = this.f27873OooO0O0.f6906OooO0o0;
                        o0oo00o3.f27877OooO0o0.f27858OooO00o = this;
                        this.f27877OooO0o0.f27868OooOO0o.add(o0oo00o3.f27879OooO0oo);
                        this.f27877OooO0o0.f27868OooOO0o.add(this.f27873OooO0O0.f6906OooO0o0.f27871OooO);
                        this.f27873OooO0O0.f6906OooO0o0.f27879OooO0oo.f27867OooOO0O.add(this.f27877OooO0o0);
                        this.f27873OooO0O0.f6906OooO0o0.f27871OooO.f27867OooOO0O.add(this.f27877OooO0o0);
                    } else if (this.f27873OooO0O0.Oooo000()) {
                        this.f27873OooO0O0.f6906OooO0o0.f27877OooO0o0.f27868OooOO0o.add(this.f27877OooO0o0);
                        this.f27877OooO0o0.f27867OooOO0O.add(this.f27873OooO0O0.f6906OooO0o0.f27877OooO0o0);
                    } else {
                        this.f27873OooO0O0.f6906OooO0o0.f27877OooO0o0.f27868OooOO0o.add(this.f27877OooO0o0);
                    }
                } else {
                    o00Oo0 o00oo5 = constraintWidget9.f6906OooO0o0.f27877OooO0o0;
                    o00oo2.f27868OooOO0o.add(o00oo5);
                    o00oo5.f27867OooOO0O.add(this.f27877OooO0o0);
                    this.f27873OooO0O0.f6906OooO0o0.f27879OooO0oo.f27867OooOO0O.add(this.f27877OooO0o0);
                    this.f27873OooO0O0.f6906OooO0o0.f27871OooO.f27867OooOO0O.add(this.f27877OooO0o0);
                    o00Oo0 o00oo6 = this.f27877OooO0o0;
                    o00oo6.f27859OooO0O0 = true;
                    o00oo6.f27867OooOO0O.add(this.f27879OooO0oo);
                    this.f27877OooO0o0.f27867OooOO0O.add(this.f27871OooO);
                    this.f27879OooO0oo.f27868OooOO0o.add(this.f27877OooO0o0);
                    this.f27871OooO.f27868OooOO0o.add(this.f27877OooO0o0);
                }
            }
        }
        ConstraintWidget constraintWidget11 = this.f27873OooO0O0;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget11.f6942OoooO;
        if (constraintAnchorArr2[0].f6895OooO0o != null && constraintAnchorArr2[1].f6895OooO0o != null) {
            if (constraintWidget11.Oooo000()) {
                this.f27879OooO0oo.f27862OooO0o = this.f27873OooO0O0.f6942OoooO[0].OooO0o0();
                this.f27871OooO.f27862OooO0o = -this.f27873OooO0O0.f6942OoooO[1].OooO0o0();
                return;
            }
            o00O0O o00o0oOooO0oo5 = OooO0oo(this.f27873OooO0O0.f6942OoooO[0]);
            o00O0O o00o0oOooO0oo6 = OooO0oo(this.f27873OooO0O0.f6942OoooO[1]);
            if (o00o0oOooO0oo5 != null) {
                o00o0oOooO0oo5.OooO0O0(this);
            }
            if (o00o0oOooO0oo6 != null) {
                o00o0oOooO0oo6.OooO0O0(this);
            }
            this.f27880OooOO0 = 4;
            return;
        }
        if (constraintAnchorArr2[0].f6895OooO0o != null) {
            o00O0O o00o0oOooO0oo7 = OooO0oo(constraintAnchorArr2[0]);
            if (o00o0oOooO0oo7 != null) {
                OooO0O0(this.f27879OooO0oo, o00o0oOooO0oo7, this.f27873OooO0O0.f6942OoooO[0].OooO0o0());
                OooO0OO(this.f27871OooO, this.f27879OooO0oo, 1, this.f27877OooO0o0);
                return;
            }
            return;
        }
        if (constraintAnchorArr2[1].f6895OooO0o != null) {
            o00O0O o00o0oOooO0oo8 = OooO0oo(constraintAnchorArr2[1]);
            if (o00o0oOooO0oo8 != null) {
                OooO0O0(this.f27871OooO, o00o0oOooO0oo8, -this.f27873OooO0O0.f6942OoooO[1].OooO0o0());
                OooO0OO(this.f27879OooO0oo, this.f27871OooO, -1, this.f27877OooO0o0);
                return;
            }
            return;
        }
        if ((constraintWidget11 instanceof OooOO0) || (constraintWidget3 = constraintWidget11.f6948OoooOOo) == null) {
            return;
        }
        OooO0O0(this.f27879OooO0oo, constraintWidget3.f6904OooO0Oo.f27879OooO0oo, constraintWidget11.OooOoO());
        OooO0OO(this.f27871OooO, this.f27879OooO0oo, 1, this.f27877OooO0o0);
    }

    @Override // p061o0000o0.o0O0O00
    public final void OooO0o() {
        this.f27874OooO0OO = null;
        this.f27879OooO0oo.OooO0OO();
        this.f27871OooO.OooO0OO();
        this.f27877OooO0o0.OooO0OO();
        this.f27878OooO0oO = false;
    }

    @Override // p061o0000o0.o0O0O00
    public final void OooO0o0() {
        o00O0O o00o0o2 = this.f27879OooO0oo;
        if (o00o0o2.f27866OooOO0) {
            this.f27873OooO0O0.f6953Ooooo0o = o00o0o2.f27864OooO0oO;
        }
    }

    @Override // p061o0000o0.o0O0O00
    public final boolean OooOO0O() {
        return this.f27875OooO0Oo != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f27873OooO0O0.f6921OooOo00 == 0;
    }

    public final void OooOOO() {
        this.f27878OooO0oO = false;
        this.f27879OooO0oo.OooO0OO();
        this.f27879OooO0oo.f27866OooOO0 = false;
        this.f27871OooO.OooO0OO();
        this.f27871OooO.f27866OooOO0 = false;
        this.f27877OooO0o0.f27866OooOO0 = false;
    }

    public final void OooOOO0(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
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

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("HorizontalRun ");
        sbOooO0o0.append(this.f27873OooO0O0.f6962o00O0O);
        return sbOooO0o0.toString();
    }
}
