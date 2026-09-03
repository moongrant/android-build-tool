package p061o0000o0;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0O0O00 implements Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f27872OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ConstraintWidget f27873OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o0Oo0oo f27874OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ConstraintWidget.DimensionBehaviour f27875OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o00Oo0 f27877OooO0o0 = new o00Oo0(this);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f27876OooO0o = 0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f27878OooO0oO = false;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o00O0O f27879OooO0oo = new o00O0O(this);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o00O0O f27871OooO = new o00O0O(this);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f27880OooOO0 = 1;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f27881OooO00o;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f27881OooO00o = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27881OooO00o[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27881OooO00o[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27881OooO00o[ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27881OooO00o[ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public o0O0O00(ConstraintWidget constraintWidget) {
        this.f27873OooO0O0 = constraintWidget;
    }

    public final o00O0O OooO(ConstraintAnchor constraintAnchor, int i) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f6895OooO0o;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f6894OooO0Oo;
        o0O0O00 o0o0o00 = i == 0 ? constraintWidget.f6904OooO0Oo : constraintWidget.f6906OooO0o0;
        int i2 = OooO00o.f27881OooO00o[constraintAnchor2.f6896OooO0o0.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return o0o0o00.f27871OooO;
        }
        return o0o0o00.f27879OooO0oo;
    }

    @Override // p061o0000o0.Oooo0
    public void OooO00o(Oooo0 oooo0) {
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooO0O0(o00O0O o00o0o2, o00O0O o00o0o3, int i) {
        o00o0o2.f27868OooOO0o.add(o00o0o3);
        o00o0o2.f27862OooO0o = i;
        o00o0o3.f27867OooOO0O.add(o00o0o2);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooO0OO(o00O0O o00o0o2, o00O0O o00o0o3, int i, o00Oo0 o00oo1) {
        o00o0o2.f27868OooOO0o.add(o00o0o3);
        o00o0o2.f27868OooOO0o.add(this.f27877OooO0o0);
        o00o0o2.f27865OooO0oo = i;
        o00o0o2.f27857OooO = o00oo1;
        o00o0o3.f27867OooOO0O.add(o00o0o2);
        o00oo1.f27867OooOO0O.add(o00o0o2);
    }

    public abstract void OooO0Oo();

    public abstract void OooO0o();

    public abstract void OooO0o0();

    public final int OooO0oO(int i, int i2) {
        int iMax;
        if (i2 == 0) {
            ConstraintWidget constraintWidget = this.f27873OooO0O0;
            int i3 = constraintWidget.f6919OooOo;
            iMax = Math.max(constraintWidget.f6923OooOo0o, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f27873OooO0O0;
            int i4 = constraintWidget2.f6926OooOoOO;
            iMax = Math.max(constraintWidget2.f6924OooOoO, i);
            if (i4 > 0) {
                iMax = Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    public final o00O0O OooO0oo(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f6895OooO0o;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f6894OooO0Oo;
        int i = OooO00o.f27881OooO00o[constraintAnchor2.f6896OooO0o0.ordinal()];
        if (i == 1) {
            return constraintWidget.f6904OooO0Oo.f27879OooO0oo;
        }
        if (i == 2) {
            return constraintWidget.f6904OooO0Oo.f27871OooO;
        }
        if (i == 3) {
            return constraintWidget.f6906OooO0o0.f27879OooO0oo;
        }
        if (i == 4) {
            return constraintWidget.f6906OooO0o0.f27882OooOO0O;
        }
        if (i != 5) {
            return null;
        }
        return constraintWidget.f6906OooO0o0.f27871OooO;
    }

    public long OooOO0() {
        o00Oo0 o00oo1 = this.f27877OooO0o0;
        if (o00oo1.f27866OooOO0) {
            return o00oo1.f27864OooO0oO;
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
        o00Oo0 o00oo1;
        float f;
        int i2;
        o00O0O o00o0oOooO0oo = OooO0oo(constraintAnchor);
        o00O0O o00o0oOooO0oo2 = OooO0oo(constraintAnchor2);
        if (o00o0oOooO0oo.f27866OooOO0 && o00o0oOooO0oo2.f27866OooOO0) {
            int iOooO0o0 = constraintAnchor.OooO0o0() + o00o0oOooO0oo.f27864OooO0oO;
            int iOooO0o1 = o00o0oOooO0oo2.f27864OooO0oO - constraintAnchor2.OooO0o0();
            int i3 = iOooO0o1 - iOooO0o0;
            o00Oo0 o00oo2 = this.f27877OooO0o0;
            if (!o00oo2.f27866OooOO0) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f27875OooO0Oo;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour == dimensionBehaviour2) {
                    int i4 = this.f27872OooO00o;
                    if (i4 == 0) {
                        o00oo2.OooO0Oo(OooO0oO(i3, i));
                    } else if (i4 == 1) {
                        this.f27877OooO0o0.OooO0Oo(Math.min(OooO0oO(o00oo2.f27869OooOOO0, i), i3));
                    } else if (i4 == 2) {
                        ConstraintWidget constraintWidget = this.f27873OooO0O0;
                        ConstraintWidget constraintWidget2 = constraintWidget.f6948OoooOOo;
                        if (constraintWidget2 != null) {
                            o00Oo0 o00oo3 = (i == 0 ? constraintWidget2.f6904OooO0Oo : constraintWidget2.f6906OooO0o0).f27877OooO0o0;
                            if (o00oo3.f27866OooOO0) {
                                o00oo2.OooO0Oo(OooO0oO((int) ((o00oo3.f27864OooO0oO * (i == 0 ? constraintWidget.f6925OooOoO0 : constraintWidget.f6928OooOoo0)) + 0.5f), i));
                            }
                        }
                    } else if (i4 == 3) {
                        ConstraintWidget constraintWidget3 = this.f27873OooO0O0;
                        o0O0O00 o0o0o00 = constraintWidget3.f6904OooO0Oo;
                        if (o0o0o00.f27875OooO0Oo == dimensionBehaviour2 && o0o0o00.f27872OooO00o == 3) {
                            o0OO00O o0oo00o2 = constraintWidget3.f6906OooO0o0;
                            if (o0oo00o2.f27875OooO0Oo != dimensionBehaviour2 || o0oo00o2.f27872OooO00o != 3) {
                                if (i == 0) {
                                    o0o0o00 = constraintWidget3.f6906OooO0o0;
                                }
                                o00oo1 = o0o0o00.f27877OooO0o0;
                                if (o00oo1.f27866OooOO0) {
                                    f = constraintWidget3.f6951OoooOoo;
                                    if (i == 1) {
                                        i2 = (int) ((o00oo1.f27864OooO0oO / f) + 0.5f);
                                    } else {
                                        i2 = (int) ((f * o00oo1.f27864OooO0oO) + 0.5f);
                                    }
                                    o00oo2.OooO0Oo(i2);
                                }
                            }
                        } else {
                            if (i == 0) {
                                o0o0o00 = constraintWidget3.f6906OooO0o0;
                            }
                            o00oo1 = o0o0o00.f27877OooO0o0;
                            if (o00oo1.f27866OooOO0) {
                                f = constraintWidget3.f6951OoooOoo;
                                if (i == 1) {
                                    i2 = (int) ((o00oo1.f27864OooO0oO / f) + 0.5f);
                                } else {
                                    i2 = (int) ((f * o00oo1.f27864OooO0oO) + 0.5f);
                                }
                                o00oo2.OooO0Oo(i2);
                            }
                        }
                    }
                }
            }
            o00Oo0 o00oo4 = this.f27877OooO0o0;
            if (o00oo4.f27866OooOO0) {
                int i5 = o00oo4.f27864OooO0oO;
                if (i5 == i3) {
                    this.f27879OooO0oo.OooO0Oo(iOooO0o0);
                    this.f27871OooO.OooO0Oo(iOooO0o1);
                    return;
                }
                ConstraintWidget constraintWidget4 = this.f27873OooO0O0;
                float f2 = i == 0 ? constraintWidget4.f6957Oooooo : constraintWidget4.f6959OoooooO;
                if (o00o0oOooO0oo == o00o0oOooO0oo2) {
                    iOooO0o0 = o00o0oOooO0oo.f27864OooO0oO;
                    iOooO0o1 = o00o0oOooO0oo2.f27864OooO0oO;
                    f2 = 0.5f;
                }
                this.f27879OooO0oo.OooO0Oo((int) ((((iOooO0o1 - iOooO0o0) - i5) * f2) + iOooO0o0 + 0.5f));
                this.f27871OooO.OooO0Oo(this.f27879OooO0oo.f27864OooO0oO + this.f27877OooO0o0.f27864OooO0oO);
            }
        }
    }
}
