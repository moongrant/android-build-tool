package p061o0000o0;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p058o0000OoO.OooOO0;
import p418o0Oo0oo.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO00O extends o0O0O00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o00O0O f27882OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public OooOo00 f27883OooOO0o;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f27884OooO00o;

        static {
            int[] iArr = new int[o00000O0.OooO0OO(4).length];
            f27884OooO00o = iArr;
            try {
                iArr[o00000O0.OooO0O0(2)] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27884OooO00o[o00000O0.OooO0O0(3)] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27884OooO00o[o00000O0.OooO0O0(4)] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public o0OO00O(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        o00O0O o00o0o2 = new o00O0O(this);
        this.f27882OooOO0O = o00o0o2;
        this.f27883OooOO0o = null;
        this.f27879OooO0oo.f27863OooO0o0 = 6;
        this.f27871OooO.f27863OooO0o0 = 7;
        o00o0o2.f27863OooO0o0 = 8;
        this.f27876OooO0o = 1;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r9v33, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r9v36, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r9v39, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    /* JADX WARN: Type inference failed for: r9v49, types: [java.util.ArrayList, java.util.List<o0000o0.o00O0O>] */
    @Override // p061o0000o0.o0O0O00, p061o0000o0.Oooo0
    public final void OooO00o(Oooo0 oooo0) {
        float f;
        float f2;
        float f3;
        int i;
        if (OooO00o.f27884OooO00o[o00000O0.OooO0O0(this.f27880OooOO0)] == 3) {
            ConstraintWidget constraintWidget = this.f27873OooO0O0;
            OooOO0o(constraintWidget.f6938Oooo0o, constraintWidget.f6941Oooo0oo, 1);
            return;
        }
        o00Oo0 o00oo1 = this.f27877OooO0o0;
        if (o00oo1.f27860OooO0OO && !o00oo1.f27866OooOO0 && this.f27875OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget2 = this.f27873OooO0O0;
            int i2 = constraintWidget2.f6920OooOo0;
            if (i2 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.f6948OoooOOo;
                if (constraintWidget3 != null) {
                    o00Oo0 o00oo2 = constraintWidget3.f6906OooO0o0.f27877OooO0o0;
                    if (o00oo2.f27866OooOO0) {
                        o00oo1.OooO0Oo((int) ((o00oo2.f27864OooO0oO * constraintWidget2.f6928OooOoo0) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                o00Oo0 o00oo3 = constraintWidget2.f6904OooO0Oo.f27877OooO0o0;
                if (o00oo3.f27866OooOO0) {
                    int i3 = constraintWidget2.f6952Ooooo00;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = o00oo3.f27864OooO0oO * constraintWidget2.f6951OoooOoo;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = o00oo3.f27864OooO0oO;
                            f2 = constraintWidget2.f6951OoooOoo;
                        }
                        o00oo1.OooO0Oo(i);
                    } else {
                        f = o00oo3.f27864OooO0oO;
                        f2 = constraintWidget2.f6951OoooOoo;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    o00oo1.OooO0Oo(i);
                }
            }
        }
        o00O0O o00o0o2 = this.f27879OooO0oo;
        if (o00o0o2.f27860OooO0OO) {
            o00O0O o00o0o3 = this.f27871OooO;
            if (o00o0o3.f27860OooO0OO) {
                if (o00o0o2.f27866OooOO0 && o00o0o3.f27866OooOO0 && this.f27877OooO0o0.f27866OooOO0) {
                    return;
                }
                if (!this.f27877OooO0o0.f27866OooOO0 && this.f27875OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    ConstraintWidget constraintWidget4 = this.f27873OooO0O0;
                    if (constraintWidget4.f6921OooOo00 == 0 && !constraintWidget4.Oooo00O()) {
                        o00O0O o00o0o4 = (o00O0O) this.f27879OooO0oo.f27868OooOO0o.get(0);
                        o00O0O o00o0o5 = (o00O0O) this.f27871OooO.f27868OooOO0o.get(0);
                        int i4 = o00o0o4.f27864OooO0oO;
                        o00O0O o00o0o6 = this.f27879OooO0oo;
                        int i5 = i4 + o00o0o6.f27862OooO0o;
                        int i6 = o00o0o5.f27864OooO0oO + this.f27871OooO.f27862OooO0o;
                        o00o0o6.OooO0Oo(i5);
                        this.f27871OooO.OooO0Oo(i6);
                        this.f27877OooO0o0.OooO0Oo(i6 - i5);
                        return;
                    }
                }
                if (!this.f27877OooO0o0.f27866OooOO0 && this.f27875OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f27872OooO00o == 1 && this.f27879OooO0oo.f27868OooOO0o.size() > 0 && this.f27871OooO.f27868OooOO0o.size() > 0) {
                    o00O0O o00o0o7 = (o00O0O) this.f27879OooO0oo.f27868OooOO0o.get(0);
                    int i7 = (((o00O0O) this.f27871OooO.f27868OooOO0o.get(0)).f27864OooO0oO + this.f27871OooO.f27862OooO0o) - (o00o0o7.f27864OooO0oO + this.f27879OooO0oo.f27862OooO0o);
                    o00Oo0 o00oo4 = this.f27877OooO0o0;
                    int i8 = o00oo4.f27869OooOOO0;
                    if (i7 < i8) {
                        o00oo4.OooO0Oo(i7);
                    } else {
                        o00oo4.OooO0Oo(i8);
                    }
                }
                if (this.f27877OooO0o0.f27866OooOO0 && this.f27879OooO0oo.f27868OooOO0o.size() > 0 && this.f27871OooO.f27868OooOO0o.size() > 0) {
                    o00O0O o00o0o8 = (o00O0O) this.f27879OooO0oo.f27868OooOO0o.get(0);
                    o00O0O o00o0o9 = (o00O0O) this.f27871OooO.f27868OooOO0o.get(0);
                    int i9 = o00o0o8.f27864OooO0oO;
                    o00O0O o00o0o10 = this.f27879OooO0oo;
                    int i10 = o00o0o10.f27862OooO0o + i9;
                    int i11 = o00o0o9.f27864OooO0oO;
                    int i12 = this.f27871OooO.f27862OooO0o + i11;
                    float f4 = this.f27873OooO0O0.f6959OoooooO;
                    if (o00o0o8 == o00o0o9) {
                        f4 = 0.5f;
                    } else {
                        i9 = i10;
                        i11 = i12;
                    }
                    o00o0o10.OooO0Oo((int) ((((i11 - i9) - this.f27877OooO0o0.f27864OooO0oO) * f4) + i9 + 0.5f));
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
            this.f27877OooO0o0.OooO0Oo(constraintWidget5.OooOOo());
        }
        if (!this.f27877OooO0o0.f27866OooOO0) {
            ConstraintWidget constraintWidget6 = this.f27873OooO0O0;
            this.f27875OooO0Oo = constraintWidget6.f6947OoooOOO[1];
            if (constraintWidget6.f6934Oooo00O) {
                this.f27883OooOO0o = new OooOo00(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f27875OooO0Oo;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidget4 = this.f27873OooO0O0.f6948OoooOOo) != null && constraintWidget4.f6947OoooOOO[1] == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int iOooOOo = (constraintWidget4.OooOOo() - this.f27873OooO0O0.f6938Oooo0o.OooO0o0()) - this.f27873OooO0O0.f6941Oooo0oo.OooO0o0();
                    OooO0O0(this.f27879OooO0oo, constraintWidget4.f6906OooO0o0.f27879OooO0oo, this.f27873OooO0O0.f6938Oooo0o.OooO0o0());
                    OooO0O0(this.f27871OooO, constraintWidget4.f6906OooO0o0.f27871OooO, -this.f27873OooO0O0.f6941Oooo0oo.OooO0o0());
                    this.f27877OooO0o0.OooO0Oo(iOooOOo);
                    return;
                }
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.f27877OooO0o0.OooO0Oo(this.f27873OooO0O0.OooOOo());
                }
            }
        } else if (this.f27875OooO0Oo == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidget2 = (constraintWidget = this.f27873OooO0O0).f6948OoooOOo) != null && constraintWidget2.f6947OoooOOO[1] == ConstraintWidget.DimensionBehaviour.FIXED) {
            OooO0O0(this.f27879OooO0oo, constraintWidget2.f6906OooO0o0.f27879OooO0oo, constraintWidget.f6938Oooo0o.OooO0o0());
            OooO0O0(this.f27871OooO, constraintWidget2.f6906OooO0o0.f27871OooO, -this.f27873OooO0O0.f6941Oooo0oo.OooO0o0());
            return;
        }
        o00Oo0 o00oo1 = this.f27877OooO0o0;
        boolean z = o00oo1.f27866OooOO0;
        if (z) {
            ConstraintWidget constraintWidget7 = this.f27873OooO0O0;
            if (constraintWidget7.f6901OooO00o) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.f6942OoooO;
                if (constraintAnchorArr[2].f6895OooO0o != null && constraintAnchorArr[3].f6895OooO0o != null) {
                    if (constraintWidget7.Oooo00O()) {
                        this.f27879OooO0oo.f27862OooO0o = this.f27873OooO0O0.f6942OoooO[2].OooO0o0();
                        this.f27871OooO.f27862OooO0o = -this.f27873OooO0O0.f6942OoooO[3].OooO0o0();
                    } else {
                        o00O0O o00o0oOooO0oo = OooO0oo(this.f27873OooO0O0.f6942OoooO[2]);
                        if (o00o0oOooO0oo != null) {
                            OooO0O0(this.f27879OooO0oo, o00o0oOooO0oo, this.f27873OooO0O0.f6942OoooO[2].OooO0o0());
                        }
                        o00O0O o00o0oOooO0oo2 = OooO0oo(this.f27873OooO0O0.f6942OoooO[3]);
                        if (o00o0oOooO0oo2 != null) {
                            OooO0O0(this.f27871OooO, o00o0oOooO0oo2, -this.f27873OooO0O0.f6942OoooO[3].OooO0o0());
                        }
                        this.f27879OooO0oo.f27859OooO0O0 = true;
                        this.f27871OooO.f27859OooO0O0 = true;
                    }
                    ConstraintWidget constraintWidget8 = this.f27873OooO0O0;
                    if (constraintWidget8.f6934Oooo00O) {
                        OooO0O0(this.f27882OooOO0O, this.f27879OooO0oo, constraintWidget8.f6955OooooOO);
                        return;
                    }
                    return;
                }
                if (constraintAnchorArr[2].f6895OooO0o != null) {
                    o00O0O o00o0oOooO0oo3 = OooO0oo(constraintAnchorArr[2]);
                    if (o00o0oOooO0oo3 != null) {
                        OooO0O0(this.f27879OooO0oo, o00o0oOooO0oo3, this.f27873OooO0O0.f6942OoooO[2].OooO0o0());
                        OooO0O0(this.f27871OooO, this.f27879OooO0oo, this.f27877OooO0o0.f27864OooO0oO);
                        ConstraintWidget constraintWidget9 = this.f27873OooO0O0;
                        if (constraintWidget9.f6934Oooo00O) {
                            OooO0O0(this.f27882OooOO0O, this.f27879OooO0oo, constraintWidget9.f6955OooooOO);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (constraintAnchorArr[3].f6895OooO0o != null) {
                    o00O0O o00o0oOooO0oo4 = OooO0oo(constraintAnchorArr[3]);
                    if (o00o0oOooO0oo4 != null) {
                        OooO0O0(this.f27871OooO, o00o0oOooO0oo4, -this.f27873OooO0O0.f6942OoooO[3].OooO0o0());
                        OooO0O0(this.f27879OooO0oo, this.f27871OooO, -this.f27877OooO0o0.f27864OooO0oO);
                    }
                    ConstraintWidget constraintWidget10 = this.f27873OooO0O0;
                    if (constraintWidget10.f6934Oooo00O) {
                        OooO0O0(this.f27882OooOO0O, this.f27879OooO0oo, constraintWidget10.f6955OooooOO);
                        return;
                    }
                    return;
                }
                if (constraintAnchorArr[4].f6895OooO0o != null) {
                    o00O0O o00o0oOooO0oo5 = OooO0oo(constraintAnchorArr[4]);
                    if (o00o0oOooO0oo5 != null) {
                        OooO0O0(this.f27882OooOO0O, o00o0oOooO0oo5, 0);
                        OooO0O0(this.f27879OooO0oo, this.f27882OooOO0O, -this.f27873OooO0O0.f6955OooooOO);
                        OooO0O0(this.f27871OooO, this.f27879OooO0oo, this.f27877OooO0o0.f27864OooO0oO);
                        return;
                    }
                    return;
                }
                if ((constraintWidget7 instanceof OooOO0) || constraintWidget7.f6948OoooOOo == null || constraintWidget7.OooOOOO(ConstraintAnchor.Type.CENTER).f6895OooO0o != null) {
                    return;
                }
                ConstraintWidget constraintWidget11 = this.f27873OooO0O0;
                OooO0O0(this.f27879OooO0oo, constraintWidget11.f6948OoooOOo.f6906OooO0o0.f27879OooO0oo, constraintWidget11.OooOoOO());
                OooO0O0(this.f27871OooO, this.f27879OooO0oo, this.f27877OooO0o0.f27864OooO0oO);
                ConstraintWidget constraintWidget12 = this.f27873OooO0O0;
                if (constraintWidget12.f6934Oooo00O) {
                    OooO0O0(this.f27882OooOO0O, this.f27879OooO0oo, constraintWidget12.f6955OooooOO);
                    return;
                }
                return;
            }
        }
        if (z || this.f27875OooO0Oo != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            o00oo1.OooO0O0(this);
        } else {
            ConstraintWidget constraintWidget13 = this.f27873OooO0O0;
            int i = constraintWidget13.f6920OooOo0;
            if (i == 2) {
                ConstraintWidget constraintWidget14 = constraintWidget13.f6948OoooOOo;
                if (constraintWidget14 != null) {
                    o00Oo0 o00oo2 = constraintWidget14.f6906OooO0o0.f27877OooO0o0;
                    o00oo1.f27868OooOO0o.add(o00oo2);
                    o00oo2.f27867OooOO0O.add(this.f27877OooO0o0);
                    o00Oo0 o00oo3 = this.f27877OooO0o0;
                    o00oo3.f27859OooO0O0 = true;
                    o00oo3.f27867OooOO0O.add(this.f27879OooO0oo);
                    this.f27877OooO0o0.f27867OooOO0O.add(this.f27871OooO);
                }
            } else if (i == 3 && !constraintWidget13.Oooo00O()) {
                ConstraintWidget constraintWidget15 = this.f27873OooO0O0;
                if (constraintWidget15.f6921OooOo00 != 3) {
                    o00Oo0 o00oo4 = constraintWidget15.f6904OooO0Oo.f27877OooO0o0;
                    this.f27877OooO0o0.f27868OooOO0o.add(o00oo4);
                    o00oo4.f27867OooOO0O.add(this.f27877OooO0o0);
                    o00Oo0 o00oo5 = this.f27877OooO0o0;
                    o00oo5.f27859OooO0O0 = true;
                    o00oo5.f27867OooOO0O.add(this.f27879OooO0oo);
                    this.f27877OooO0o0.f27867OooOO0O.add(this.f27871OooO);
                }
            }
        }
        ConstraintWidget constraintWidget16 = this.f27873OooO0O0;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget16.f6942OoooO;
        if (constraintAnchorArr2[2].f6895OooO0o != null && constraintAnchorArr2[3].f6895OooO0o != null) {
            if (constraintWidget16.Oooo00O()) {
                this.f27879OooO0oo.f27862OooO0o = this.f27873OooO0O0.f6942OoooO[2].OooO0o0();
                this.f27871OooO.f27862OooO0o = -this.f27873OooO0O0.f6942OoooO[3].OooO0o0();
            } else {
                o00O0O o00o0oOooO0oo6 = OooO0oo(this.f27873OooO0O0.f6942OoooO[2]);
                o00O0O o00o0oOooO0oo7 = OooO0oo(this.f27873OooO0O0.f6942OoooO[3]);
                if (o00o0oOooO0oo6 != null) {
                    o00o0oOooO0oo6.OooO0O0(this);
                }
                if (o00o0oOooO0oo7 != null) {
                    o00o0oOooO0oo7.OooO0O0(this);
                }
                this.f27880OooOO0 = 4;
            }
            if (this.f27873OooO0O0.f6934Oooo00O) {
                OooO0OO(this.f27882OooOO0O, this.f27879OooO0oo, 1, this.f27883OooOO0o);
            }
        } else if (constraintAnchorArr2[2].f6895OooO0o != null) {
            o00O0O o00o0oOooO0oo8 = OooO0oo(constraintAnchorArr2[2]);
            if (o00o0oOooO0oo8 != null) {
                OooO0O0(this.f27879OooO0oo, o00o0oOooO0oo8, this.f27873OooO0O0.f6942OoooO[2].OooO0o0());
                OooO0OO(this.f27871OooO, this.f27879OooO0oo, 1, this.f27877OooO0o0);
                if (this.f27873OooO0O0.f6934Oooo00O) {
                    OooO0OO(this.f27882OooOO0O, this.f27879OooO0oo, 1, this.f27883OooOO0o);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f27875OooO0Oo;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3) {
                    ConstraintWidget constraintWidget17 = this.f27873OooO0O0;
                    if (constraintWidget17.f6951OoooOoo > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        o0OOO0o o0ooo0o2 = constraintWidget17.f6904OooO0Oo;
                        if (o0ooo0o2.f27875OooO0Oo == dimensionBehaviour3) {
                            o0ooo0o2.f27877OooO0o0.f27867OooOO0O.add(this.f27877OooO0o0);
                            this.f27877OooO0o0.f27868OooOO0o.add(this.f27873OooO0O0.f6904OooO0Oo.f27877OooO0o0);
                            this.f27877OooO0o0.f27858OooO00o = this;
                        }
                    }
                }
            }
        } else if (constraintAnchorArr2[3].f6895OooO0o != null) {
            o00O0O o00o0oOooO0oo9 = OooO0oo(constraintAnchorArr2[3]);
            if (o00o0oOooO0oo9 != null) {
                OooO0O0(this.f27871OooO, o00o0oOooO0oo9, -this.f27873OooO0O0.f6942OoooO[3].OooO0o0());
                OooO0OO(this.f27879OooO0oo, this.f27871OooO, -1, this.f27877OooO0o0);
                if (this.f27873OooO0O0.f6934Oooo00O) {
                    OooO0OO(this.f27882OooOO0O, this.f27879OooO0oo, 1, this.f27883OooOO0o);
                }
            }
        } else if (constraintAnchorArr2[4].f6895OooO0o != null) {
            o00O0O o00o0oOooO0oo10 = OooO0oo(constraintAnchorArr2[4]);
            if (o00o0oOooO0oo10 != null) {
                OooO0O0(this.f27882OooOO0O, o00o0oOooO0oo10, 0);
                OooO0OO(this.f27879OooO0oo, this.f27882OooOO0O, -1, this.f27883OooOO0o);
                OooO0OO(this.f27871OooO, this.f27879OooO0oo, 1, this.f27877OooO0o0);
            }
        } else if (!(constraintWidget16 instanceof OooOO0) && (constraintWidget3 = constraintWidget16.f6948OoooOOo) != null) {
            OooO0O0(this.f27879OooO0oo, constraintWidget3.f6906OooO0o0.f27879OooO0oo, constraintWidget16.OooOoOO());
            OooO0OO(this.f27871OooO, this.f27879OooO0oo, 1, this.f27877OooO0o0);
            if (this.f27873OooO0O0.f6934Oooo00O) {
                OooO0OO(this.f27882OooOO0O, this.f27879OooO0oo, 1, this.f27883OooOO0o);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.f27875OooO0Oo;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour4 == dimensionBehaviour5) {
                ConstraintWidget constraintWidget18 = this.f27873OooO0O0;
                if (constraintWidget18.f6951OoooOoo > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    o0OOO0o o0ooo0o3 = constraintWidget18.f6904OooO0Oo;
                    if (o0ooo0o3.f27875OooO0Oo == dimensionBehaviour5) {
                        o0ooo0o3.f27877OooO0o0.f27867OooOO0O.add(this.f27877OooO0o0);
                        this.f27877OooO0o0.f27868OooOO0o.add(this.f27873OooO0O0.f6904OooO0Oo.f27877OooO0o0);
                        this.f27877OooO0o0.f27858OooO00o = this;
                    }
                }
            }
        }
        if (this.f27877OooO0o0.f27868OooOO0o.size() == 0) {
            this.f27877OooO0o0.f27860OooO0OO = true;
        }
    }

    @Override // p061o0000o0.o0O0O00
    public final void OooO0o() {
        this.f27874OooO0OO = null;
        this.f27879OooO0oo.OooO0OO();
        this.f27871OooO.OooO0OO();
        this.f27882OooOO0O.OooO0OO();
        this.f27877OooO0o0.OooO0OO();
        this.f27878OooO0oO = false;
    }

    @Override // p061o0000o0.o0O0O00
    public final void OooO0o0() {
        o00O0O o00o0o2 = this.f27879OooO0oo;
        if (o00o0o2.f27866OooOO0) {
            this.f27873OooO0O0.f6954OooooO0 = o00o0o2.f27864OooO0oO;
        }
    }

    @Override // p061o0000o0.o0O0O00
    public final boolean OooOO0O() {
        return this.f27875OooO0Oo != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f27873OooO0O0.f6920OooOo0 == 0;
    }

    public final void OooOOO0() {
        this.f27878OooO0oO = false;
        this.f27879OooO0oo.OooO0OO();
        this.f27879OooO0oo.f27866OooOO0 = false;
        this.f27871OooO.OooO0OO();
        this.f27871OooO.f27866OooOO0 = false;
        this.f27882OooOO0O.OooO0OO();
        this.f27882OooOO0O.f27866OooOO0 = false;
        this.f27877OooO0o0.f27866OooOO0 = false;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("VerticalRun ");
        sbOooO0o0.append(this.f27873OooO0O0.f6962o00O0O);
        return sbOooO0o0.toString();
    }
}
