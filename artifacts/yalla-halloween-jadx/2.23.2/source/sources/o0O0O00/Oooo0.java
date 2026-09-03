package o0O0O00;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 extends o0OoOo0 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooOO0 f41128OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public o0O0O00.OooO00o f41129OooOO0o;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f41130OooO00o;

        static {
            int[] iArr = new int[o0OoOo0.OooO0O0.values().length];
            f41130OooO00o = iArr;
            try {
                iArr[o0OoOo0.OooO0O0.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41130OooO00o[o0OoOo0.OooO0O0.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41130OooO00o[o0OoOo0.OooO0O0.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Oooo0(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        OooOO0 oooOO1 = new OooOO0(this);
        this.f41128OooOO0O = oooOO1;
        this.f41129OooOO0o = null;
        this.f41147OooO0oo.f41118OooO0o0 = OooOO0.OooO00o.TOP;
        this.f41139OooO.f41118OooO0o0 = OooOO0.OooO00o.BOTTOM;
        oooOO1.f41118OooO0o0 = OooOO0.OooO00o.BASELINE;
        this.f41144OooO0o = 1;
    }

    @Override // o0O0O00.o0OoOo0, o0O0O00.OooO0o
    public final void OooO00o(OooO0o oooO0o) {
        float f;
        float f2;
        float f3;
        int i;
        if (OooO00o.f41130OooO00o[this.f41148OooOO0.ordinal()] == 3) {
            ConstraintWidget constraintWidget = this.f41141OooO0O0;
            OooOO0o(constraintWidget.f4378Oooo0o, constraintWidget.f4381Oooo0oo, 1);
            return;
        }
        OooOO0O oooOO0O = this.f41145OooO0o0;
        if (oooOO0O.f41115OooO0OO && !oooOO0O.f41121OooOO0 && this.f41143OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.f41141OooO0O0;
            int i2 = constraintWidget2.f4360OooOo0;
            if (i2 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.f4388OoooOOo;
                if (constraintWidget3 != null) {
                    OooOO0O oooOO0O2 = constraintWidget3.f4346OooO0o0.f41145OooO0o0;
                    if (oooOO0O2.f41121OooOO0) {
                        oooOO0O.OooO0Oo((int) ((oooOO0O2.f41119OooO0oO * constraintWidget2.f4368OooOoo0) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                OooOO0O oooOO0O3 = constraintWidget2.f4344OooO0Oo.f41145OooO0o0;
                if (oooOO0O3.f41121OooOO0) {
                    int i3 = constraintWidget2.f4392Ooooo00;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = oooOO0O3.f41119OooO0oO * constraintWidget2.f4391OoooOoo;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = oooOO0O3.f41119OooO0oO;
                            f2 = constraintWidget2.f4391OoooOoo;
                        }
                        oooOO0O.OooO0Oo(i);
                    } else {
                        f = oooOO0O3.f41119OooO0oO;
                        f2 = constraintWidget2.f4391OoooOoo;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    oooOO0O.OooO0Oo(i);
                }
            }
        }
        OooOO0 oooOO1 = this.f41147OooO0oo;
        if (oooOO1.f41115OooO0OO) {
            OooOO0 oooOO2 = this.f41139OooO;
            if (oooOO2.f41115OooO0OO) {
                if (oooOO1.f41121OooOO0 && oooOO2.f41121OooOO0 && oooOO0O.f41121OooOO0) {
                    return;
                }
                boolean z = oooOO0O.f41121OooOO0;
                ArrayList arrayList = oooOO1.f41123OooOO0o;
                ArrayList arrayList2 = oooOO2.f41123OooOO0o;
                if (!z && this.f41143OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget4 = this.f41141OooO0O0;
                    if (constraintWidget4.f4361OooOo00 == 0 && !constraintWidget4.OooOooO()) {
                        OooOO0 oooOO3 = (OooOO0) arrayList.get(0);
                        OooOO0 oooOO4 = (OooOO0) arrayList2.get(0);
                        int i4 = oooOO3.f41119OooO0oO + oooOO1.f41117OooO0o;
                        int i5 = oooOO4.f41119OooO0oO + oooOO2.f41117OooO0o;
                        oooOO1.OooO0Oo(i4);
                        oooOO2.OooO0Oo(i5);
                        oooOO0O.OooO0Oo(i5 - i4);
                        return;
                    }
                }
                if (!oooOO0O.f41121OooOO0 && this.f41143OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f41140OooO00o == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    OooOO0 oooOO5 = (OooOO0) arrayList.get(0);
                    int i6 = (((OooOO0) arrayList2.get(0)).f41119OooO0oO + oooOO2.f41117OooO0o) - (oooOO5.f41119OooO0oO + oooOO1.f41117OooO0o);
                    int i7 = oooOO0O.f41124OooOOO0;
                    if (i6 < i7) {
                        oooOO0O.OooO0Oo(i6);
                    } else {
                        oooOO0O.OooO0Oo(i7);
                    }
                }
                if (oooOO0O.f41121OooOO0 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    OooOO0 oooOO6 = (OooOO0) arrayList.get(0);
                    OooOO0 oooOO7 = (OooOO0) arrayList2.get(0);
                    int i8 = oooOO6.f41119OooO0oO;
                    int i9 = oooOO1.f41117OooO0o + i8;
                    int i10 = oooOO7.f41119OooO0oO;
                    int i11 = oooOO2.f41117OooO0o + i10;
                    float f4 = this.f41141OooO0O0.f4399OoooooO;
                    if (oooOO6 == oooOO7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    oooOO1.OooO0Oo((int) ((((i10 - i8) - oooOO0O.f41119OooO0oO) * f4) + i8 + 0.5f));
                    oooOO2.OooO0Oo(oooOO1.f41119OooO0oO + oooOO0O.f41119OooO0oO);
                }
            }
        }
    }

    @Override // o0O0O00.o0OoOo0
    public final void OooO0Oo() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5 = this.f41141OooO0O0;
        boolean z = constraintWidget5.f4341OooO00o;
        OooOO0O oooOO0O = this.f41145OooO0o0;
        if (z) {
            oooOO0O.OooO0Oo(constraintWidget5.OooOOOo());
        }
        boolean z2 = oooOO0O.f41121OooOO0;
        OooOO0 oooOO1 = this.f41139OooO;
        OooOO0 oooOO2 = this.f41147OooO0oo;
        if (!z2) {
            ConstraintWidget constraintWidget6 = this.f41141OooO0O0;
            this.f41143OooO0Oo = constraintWidget6.f4387OoooOOO[1];
            if (constraintWidget6.f4374Oooo00O) {
                this.f41129OooOO0o = new o0O0O00.OooO00o(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f41143OooO0Oo;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidget4 = this.f41141OooO0O0.f4388OoooOOo) != null && constraintWidget4.f4387OoooOOO[1] == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int iOooOOOo = (constraintWidget4.OooOOOo() - this.f41141OooO0O0.f4378Oooo0o.OooO0o0()) - this.f41141OooO0O0.f4381Oooo0oo.OooO0o0();
                    o0OoOo0.OooO0O0(oooOO2, constraintWidget4.f4346OooO0o0.f41147OooO0oo, this.f41141OooO0O0.f4378Oooo0o.OooO0o0());
                    o0OoOo0.OooO0O0(oooOO1, constraintWidget4.f4346OooO0o0.f41139OooO, -this.f41141OooO0O0.f4381Oooo0oo.OooO0o0());
                    oooOO0O.OooO0Oo(iOooOOOo);
                    return;
                }
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED) {
                    oooOO0O.OooO0Oo(this.f41141OooO0O0.OooOOOo());
                }
            }
        } else if (this.f41143OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidget2 = (constraintWidget = this.f41141OooO0O0).f4388OoooOOo) != null && constraintWidget2.f4387OoooOOO[1] == ConstraintWidget.DimensionBehaviour.FIXED) {
            o0OoOo0.OooO0O0(oooOO2, constraintWidget2.f4346OooO0o0.f41147OooO0oo, constraintWidget.f4378Oooo0o.OooO0o0());
            o0OoOo0.OooO0O0(oooOO1, constraintWidget2.f4346OooO0o0.f41139OooO, -this.f41141OooO0O0.f4381Oooo0oo.OooO0o0());
            return;
        }
        boolean z3 = oooOO0O.f41121OooOO0;
        OooOO0 oooOO3 = this.f41128OooOO0O;
        if (z3) {
            ConstraintWidget constraintWidget7 = this.f41141OooO0O0;
            if (constraintWidget7.f4341OooO00o) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.f4382OoooO;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f4335OooO0o;
                if (constraintAnchor2 != null && constraintAnchorArr[3].f4335OooO0o != null) {
                    if (constraintWidget7.OooOooO()) {
                        oooOO2.f41117OooO0o = this.f41141OooO0O0.f4382OoooO[2].OooO0o0();
                        oooOO1.f41117OooO0o = -this.f41141OooO0O0.f4382OoooO[3].OooO0o0();
                    } else {
                        OooOO0 oooOO0OooO0oo = o0OoOo0.OooO0oo(this.f41141OooO0O0.f4382OoooO[2]);
                        if (oooOO0OooO0oo != null) {
                            o0OoOo0.OooO0O0(oooOO2, oooOO0OooO0oo, this.f41141OooO0O0.f4382OoooO[2].OooO0o0());
                        }
                        OooOO0 oooOO0OooO0oo2 = o0OoOo0.OooO0oo(this.f41141OooO0O0.f4382OoooO[3]);
                        if (oooOO0OooO0oo2 != null) {
                            o0OoOo0.OooO0O0(oooOO1, oooOO0OooO0oo2, -this.f41141OooO0O0.f4382OoooO[3].OooO0o0());
                        }
                        oooOO2.f41114OooO0O0 = true;
                        oooOO1.f41114OooO0O0 = true;
                    }
                    ConstraintWidget constraintWidget8 = this.f41141OooO0O0;
                    if (constraintWidget8.f4374Oooo00O) {
                        o0OoOo0.OooO0O0(oooOO3, oooOO2, constraintWidget8.f4395OooooOO);
                        return;
                    }
                    return;
                }
                if (constraintAnchor2 != null) {
                    OooOO0 oooOO0OooO0oo3 = o0OoOo0.OooO0oo(constraintAnchor);
                    if (oooOO0OooO0oo3 != null) {
                        o0OoOo0.OooO0O0(oooOO2, oooOO0OooO0oo3, this.f41141OooO0O0.f4382OoooO[2].OooO0o0());
                        o0OoOo0.OooO0O0(oooOO1, oooOO2, oooOO0O.f41119OooO0oO);
                        ConstraintWidget constraintWidget9 = this.f41141OooO0O0;
                        if (constraintWidget9.f4374Oooo00O) {
                            o0OoOo0.OooO0O0(oooOO3, oooOO2, constraintWidget9.f4395OooooOO);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                if (constraintAnchor3.f4335OooO0o != null) {
                    OooOO0 oooOO0OooO0oo4 = o0OoOo0.OooO0oo(constraintAnchor3);
                    if (oooOO0OooO0oo4 != null) {
                        o0OoOo0.OooO0O0(oooOO1, oooOO0OooO0oo4, -this.f41141OooO0O0.f4382OoooO[3].OooO0o0());
                        o0OoOo0.OooO0O0(oooOO2, oooOO1, -oooOO0O.f41119OooO0oO);
                    }
                    ConstraintWidget constraintWidget10 = this.f41141OooO0O0;
                    if (constraintWidget10.f4374Oooo00O) {
                        o0OoOo0.OooO0O0(oooOO3, oooOO2, constraintWidget10.f4395OooooOO);
                        return;
                    }
                    return;
                }
                ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                if (constraintAnchor4.f4335OooO0o != null) {
                    OooOO0 oooOO0OooO0oo5 = o0OoOo0.OooO0oo(constraintAnchor4);
                    if (oooOO0OooO0oo5 != null) {
                        o0OoOo0.OooO0O0(oooOO3, oooOO0OooO0oo5, 0);
                        o0OoOo0.OooO0O0(oooOO2, oooOO3, -this.f41141OooO0O0.f4395OooooOO);
                        o0OoOo0.OooO0O0(oooOO1, oooOO2, oooOO0O.f41119OooO0oO);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof oo0o0Oo.OooO00o) || constraintWidget7.f4388OoooOOo == null || constraintWidget7.OooOOO(ConstraintAnchor.Type.CENTER).f4335OooO0o != null) {
                    return;
                }
                ConstraintWidget constraintWidget11 = this.f41141OooO0O0;
                o0OoOo0.OooO0O0(oooOO2, constraintWidget11.f4388OoooOOo.f4346OooO0o0.f41147OooO0oo, constraintWidget11.OooOo());
                o0OoOo0.OooO0O0(oooOO1, oooOO2, oooOO0O.f41119OooO0oO);
                ConstraintWidget constraintWidget12 = this.f41141OooO0O0;
                if (constraintWidget12.f4374Oooo00O) {
                    o0OoOo0.OooO0O0(oooOO3, oooOO2, constraintWidget12.f4395OooooOO);
                    return;
                }
                return;
            }
        }
        ArrayList arrayList = oooOO0O.f41123OooOO0o;
        if (z3 || this.f41143OooO0Oo != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            oooOO0O.OooO0O0(this);
        } else {
            ConstraintWidget constraintWidget13 = this.f41141OooO0O0;
            int i = constraintWidget13.f4360OooOo0;
            ArrayList arrayList2 = oooOO0O.f41122OooOO0O;
            if (i == 2) {
                ConstraintWidget constraintWidget14 = constraintWidget13.f4388OoooOOo;
                if (constraintWidget14 != null) {
                    OooOO0O oooOO0O2 = constraintWidget14.f4346OooO0o0.f41145OooO0o0;
                    arrayList.add(oooOO0O2);
                    oooOO0O2.f41122OooOO0O.add(oooOO0O);
                    oooOO0O.f41114OooO0O0 = true;
                    arrayList2.add(oooOO2);
                    arrayList2.add(oooOO1);
                }
            } else if (i == 3 && !constraintWidget13.OooOooO()) {
                ConstraintWidget constraintWidget15 = this.f41141OooO0O0;
                if (constraintWidget15.f4361OooOo00 != 3) {
                    OooOO0O oooOO0O3 = constraintWidget15.f4344OooO0Oo.f41145OooO0o0;
                    arrayList.add(oooOO0O3);
                    oooOO0O3.f41122OooOO0O.add(oooOO0O);
                    oooOO0O.f41114OooO0O0 = true;
                    arrayList2.add(oooOO2);
                    arrayList2.add(oooOO1);
                }
            }
        }
        ConstraintWidget constraintWidget16 = this.f41141OooO0O0;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget16.f4382OoooO;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.f4335OooO0o;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].f4335OooO0o != null) {
            if (constraintWidget16.OooOooO()) {
                oooOO2.f41117OooO0o = this.f41141OooO0O0.f4382OoooO[2].OooO0o0();
                oooOO1.f41117OooO0o = -this.f41141OooO0O0.f4382OoooO[3].OooO0o0();
            } else {
                OooOO0 oooOO0OooO0oo6 = o0OoOo0.OooO0oo(this.f41141OooO0O0.f4382OoooO[2]);
                OooOO0 oooOO0OooO0oo7 = o0OoOo0.OooO0oo(this.f41141OooO0O0.f4382OoooO[3]);
                if (oooOO0OooO0oo6 != null) {
                    oooOO0OooO0oo6.OooO0O0(this);
                }
                if (oooOO0OooO0oo7 != null) {
                    oooOO0OooO0oo7.OooO0O0(this);
                }
                this.f41148OooOO0 = o0OoOo0.OooO0O0.CENTER;
            }
            if (this.f41141OooO0O0.f4374Oooo00O) {
                OooO0OO(oooOO3, oooOO2, 1, this.f41129OooOO0o);
            }
        } else if (constraintAnchor6 != null) {
            OooOO0 oooOO0OooO0oo8 = o0OoOo0.OooO0oo(constraintAnchor5);
            if (oooOO0OooO0oo8 != null) {
                o0OoOo0.OooO0O0(oooOO2, oooOO0OooO0oo8, this.f41141OooO0O0.f4382OoooO[2].OooO0o0());
                OooO0OO(oooOO1, oooOO2, 1, oooOO0O);
                if (this.f41141OooO0O0.f4374Oooo00O) {
                    OooO0OO(oooOO3, oooOO2, 1, this.f41129OooOO0o);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f41143OooO0Oo;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3) {
                    ConstraintWidget constraintWidget17 = this.f41141OooO0O0;
                    if (constraintWidget17.f4391OoooOoo > 0.0f) {
                        OooOo oooOo = constraintWidget17.f4344OooO0Oo;
                        if (oooOo.f41143OooO0Oo == dimensionBehaviour3) {
                            oooOo.f41145OooO0o0.f41122OooOO0O.add(oooOO0O);
                            arrayList.add(this.f41141OooO0O0.f4344OooO0Oo.f41145OooO0o0);
                            oooOO0O.f41113OooO00o = this;
                        }
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.f4335OooO0o != null) {
                OooOO0 oooOO0OooO0oo9 = o0OoOo0.OooO0oo(constraintAnchor7);
                if (oooOO0OooO0oo9 != null) {
                    o0OoOo0.OooO0O0(oooOO1, oooOO0OooO0oo9, -this.f41141OooO0O0.f4382OoooO[3].OooO0o0());
                    OooO0OO(oooOO2, oooOO1, -1, oooOO0O);
                    if (this.f41141OooO0O0.f4374Oooo00O) {
                        OooO0OO(oooOO3, oooOO2, 1, this.f41129OooOO0o);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.f4335OooO0o != null) {
                    OooOO0 oooOO0OooO0oo10 = o0OoOo0.OooO0oo(constraintAnchor8);
                    if (oooOO0OooO0oo10 != null) {
                        o0OoOo0.OooO0O0(oooOO3, oooOO0OooO0oo10, 0);
                        OooO0OO(oooOO2, oooOO3, -1, this.f41129OooOO0o);
                        OooO0OO(oooOO1, oooOO2, 1, oooOO0O);
                    }
                } else if (!(constraintWidget16 instanceof oo0o0Oo.OooO00o) && (constraintWidget3 = constraintWidget16.f4388OoooOOo) != null) {
                    o0OoOo0.OooO0O0(oooOO2, constraintWidget3.f4346OooO0o0.f41147OooO0oo, constraintWidget16.OooOo());
                    OooO0OO(oooOO1, oooOO2, 1, oooOO0O);
                    if (this.f41141OooO0O0.f4374Oooo00O) {
                        OooO0OO(oooOO3, oooOO2, 1, this.f41129OooOO0o);
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.f41143OooO0Oo;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour5) {
                        ConstraintWidget constraintWidget18 = this.f41141OooO0O0;
                        if (constraintWidget18.f4391OoooOoo > 0.0f) {
                            OooOo oooOo2 = constraintWidget18.f4344OooO0Oo;
                            if (oooOo2.f41143OooO0Oo == dimensionBehaviour5) {
                                oooOo2.f41145OooO0o0.f41122OooOO0O.add(oooOO0O);
                                arrayList.add(this.f41141OooO0O0.f4344OooO0Oo.f41145OooO0o0);
                                oooOO0O.f41113OooO00o = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            oooOO0O.f41115OooO0OO = true;
        }
    }

    @Override // o0O0O00.o0OoOo0
    public final void OooO0o() {
        this.f41142OooO0OO = null;
        this.f41147OooO0oo.OooO0OO();
        this.f41139OooO.OooO0OO();
        this.f41128OooOO0O.OooO0OO();
        this.f41145OooO0o0.OooO0OO();
        this.f41146OooO0oO = false;
    }

    @Override // o0O0O00.o0OoOo0
    public final void OooO0o0() {
        OooOO0 oooOO1 = this.f41147OooO0oo;
        if (oooOO1.f41121OooOO0) {
            this.f41141OooO0O0.f4394OooooO0 = oooOO1.f41119OooO0oO;
        }
    }

    @Override // o0O0O00.o0OoOo0
    public final boolean OooOO0O() {
        return this.f41143OooO0Oo != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f41141OooO0O0.f4360OooOo0 == 0;
    }

    public final void OooOOO0() {
        this.f41146OooO0oO = false;
        OooOO0 oooOO1 = this.f41147OooO0oo;
        oooOO1.OooO0OO();
        oooOO1.f41121OooOO0 = false;
        OooOO0 oooOO2 = this.f41139OooO;
        oooOO2.OooO0OO();
        oooOO2.f41121OooOO0 = false;
        OooOO0 oooOO3 = this.f41128OooOO0O;
        oooOO3.OooO0OO();
        oooOO3.f41121OooOO0 = false;
        this.f41145OooO0o0.f41121OooOO0 = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f41141OooO0O0.f4402o00O0O;
    }
}
