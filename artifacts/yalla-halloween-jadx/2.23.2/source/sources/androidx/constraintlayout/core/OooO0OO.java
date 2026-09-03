package androidx.constraintlayout.core;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import java.util.ArrayList;
import java.util.Arrays;
import p646o0ooOoO.oO0Oo0oo;
import p646o0ooOoO.ooOOOOoo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static boolean f4239OooOOOo = false;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static int f4240OooOOo0 = 1000;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0o f4244OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO0O0[] f4246OooO0o;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final oO0Oo0oo f4252OooOO0o;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public OooO0O0 f4255OooOOOO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f4242OooO00o = false;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f4243OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f4245OooO0Oo = 32;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f4247OooO0o0 = 32;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f4248OooO0oO = false;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean[] f4249OooO0oo = new boolean[32];

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f4241OooO = 1;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f4250OooOO0 = 0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f4251OooOO0O = 32;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public SolverVariable[] f4254OooOOO0 = new SolverVariable[f4240OooOOo0];

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f4253OooOOO = 0;

    public interface OooO00o {
        SolverVariable OooO00o(boolean[] zArr);
    }

    public OooO0OO() {
        this.f4246OooO0o = null;
        this.f4246OooO0o = new OooO0O0[32];
        for (int i = 0; i < this.f4250OooOO0; i++) {
            OooO0O0[] oooO0O0Arr = this.f4246OooO0o;
            OooO0O0 oooO0O0 = oooO0O0Arr[i];
            if (oooO0O0 != null) {
                ooOOOOoo oooooooo = this.f4252OooOO0o.f58115OooO00o;
                int i2 = oooooooo.f58119OooO0O0;
                Object[] objArr = oooooooo.f58118OooO00o;
                if (i2 < objArr.length) {
                    objArr[i2] = oooO0O0;
                    oooooooo.f58119OooO0O0 = i2 + 1;
                }
            }
            oooO0O0Arr[i] = null;
        }
        oO0Oo0oo oo0oo0oo = new oO0Oo0oo();
        this.f4252OooOO0o = oo0oo0oo;
        this.f4244OooO0OO = new OooO0o(oo0oo0oo);
        this.f4255OooOOOO = new OooO0O0(oo0oo0oo);
    }

    public static int OooOOO(ConstraintAnchor constraintAnchor) {
        SolverVariable solverVariable = constraintAnchor.f4330OooO;
        if (solverVariable != null) {
            return (int) (solverVariable.f4267OooO0oo + 0.5f);
        }
        return 0;
    }

    public final void OooO() {
        for (int i = 0; i < this.f4250OooOO0; i++) {
            OooO0O0 oooO0O0 = this.f4246OooO0o[i];
            oooO0O0.f4234OooO00o.f4267OooO0oo = oooO0O0.f4235OooO0O0;
        }
    }

    public final SolverVariable OooO00o(SolverVariable.Type type) {
        ooOOOOoo oooooooo = this.f4252OooOO0o.f58116OooO0O0;
        int i = oooooooo.f58119OooO0O0;
        Object obj = null;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = oooooooo.f58118OooO00o;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            oooooooo.f58119OooO0O0 = i2;
            obj = obj2;
        }
        SolverVariable solverVariable = (SolverVariable) obj;
        if (solverVariable == null) {
            solverVariable = new SolverVariable(type);
            solverVariable.f4270OooOO0o = type;
        } else {
            solverVariable.OooO0OO();
            solverVariable.f4270OooOO0o = type;
        }
        int i3 = this.f4253OooOOO;
        int i4 = f4240OooOOo0;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            f4240OooOOo0 = i5;
            this.f4254OooOOO0 = (SolverVariable[]) Arrays.copyOf(this.f4254OooOOO0, i5);
        }
        SolverVariable[] solverVariableArr = this.f4254OooOOO0;
        int i6 = this.f4253OooOOO;
        this.f4253OooOOO = i6 + 1;
        solverVariableArr[i6] = solverVariable;
        return solverVariable;
    }

    public final void OooO0O0(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        OooO0O0 oooO0O0OooOO0o = OooOO0o();
        if (solverVariable2 == solverVariable3) {
            oooO0O0OooOO0o.f4237OooO0Oo.OooO0oo(solverVariable, 1.0f);
            oooO0O0OooOO0o.f4237OooO0Oo.OooO0oo(solverVariable4, 1.0f);
            oooO0O0OooOO0o.f4237OooO0Oo.OooO0oo(solverVariable2, -2.0f);
        } else if (f == 0.5f) {
            oooO0O0OooOO0o.f4237OooO0Oo.OooO0oo(solverVariable, 1.0f);
            oooO0O0OooOO0o.f4237OooO0Oo.OooO0oo(solverVariable2, -1.0f);
            oooO0O0OooOO0o.f4237OooO0Oo.OooO0oo(solverVariable3, -1.0f);
            oooO0O0OooOO0o.f4237OooO0Oo.OooO0oo(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                oooO0O0OooOO0o.f4235OooO0O0 = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            oooO0O0OooOO0o.f4237OooO0Oo.OooO0oo(solverVariable, -1.0f);
            oooO0O0OooOO0o.f4237OooO0Oo.OooO0oo(solverVariable2, 1.0f);
            oooO0O0OooOO0o.f4235OooO0O0 = i;
        } else if (f >= 1.0f) {
            oooO0O0OooOO0o.f4237OooO0Oo.OooO0oo(solverVariable4, -1.0f);
            oooO0O0OooOO0o.f4237OooO0Oo.OooO0oo(solverVariable3, 1.0f);
            oooO0O0OooOO0o.f4235OooO0O0 = -i2;
        } else {
            float f2 = 1.0f - f;
            oooO0O0OooOO0o.f4237OooO0Oo.OooO0oo(solverVariable, f2 * 1.0f);
            oooO0O0OooOO0o.f4237OooO0Oo.OooO0oo(solverVariable2, f2 * (-1.0f));
            oooO0O0OooOO0o.f4237OooO0Oo.OooO0oo(solverVariable3, (-1.0f) * f);
            oooO0O0OooOO0o.f4237OooO0Oo.OooO0oo(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                oooO0O0OooOO0o.f4235OooO0O0 = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            oooO0O0OooOO0o.OooO0O0(this, i3);
        }
        OooO0OO(oooO0O0OooOO0o);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed  */
    public final void OooO0OO(OooO0O0 oooO0O0) {
        boolean z;
        boolean z2;
        boolean z3;
        SolverVariable solverVariableOooO0o;
        ArrayList<SolverVariable> arrayList;
        boolean z4 = true;
        if (this.f4250OooOO0 + 1 >= this.f4251OooOO0O || this.f4241OooO + 1 >= this.f4247OooO0o0) {
            OooOOOO();
        }
        if (oooO0O0.f4238OooO0o0) {
            z = false;
        } else {
            if (this.f4246OooO0o.length != 0) {
                boolean z5 = false;
                while (!z5) {
                    int iOooO0o = oooO0O0.f4237OooO0Oo.OooO0o();
                    int i = 0;
                    while (true) {
                        arrayList = oooO0O0.f4236OooO0OO;
                        if (i >= iOooO0o) {
                            break;
                        }
                        SolverVariable solverVariableOooO0O0 = oooO0O0.f4237OooO0Oo.OooO0O0(i);
                        if (solverVariableOooO0O0.f4264OooO0o != -1 || solverVariableOooO0O0.f4262OooO) {
                            arrayList.add(solverVariableOooO0O0);
                        }
                        i++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            SolverVariable solverVariable = arrayList.get(i2);
                            if (solverVariable.f4262OooO) {
                                oooO0O0.OooO0oo(this, solverVariable, true);
                            } else {
                                oooO0O0.OooO(this, this.f4246OooO0o[solverVariable.f4264OooO0o], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z5 = true;
                    }
                }
                if (oooO0O0.f4234OooO00o != null && oooO0O0.f4237OooO0Oo.OooO0o() == 0) {
                    oooO0O0.f4238OooO0o0 = true;
                    this.f4242OooO00o = true;
                }
            }
            if (oooO0O0.OooO0o0()) {
                return;
            }
            float f = oooO0O0.f4235OooO0O0;
            if (f < 0.0f) {
                oooO0O0.f4235OooO0O0 = f * (-1.0f);
                oooO0O0.f4237OooO0Oo.OooO0Oo();
            }
            int iOooO0o2 = oooO0O0.f4237OooO0Oo.OooO0o();
            float f2 = 0.0f;
            float f3 = 0.0f;
            SolverVariable solverVariable2 = null;
            SolverVariable solverVariable3 = null;
            boolean z6 = false;
            boolean z7 = false;
            for (int i3 = 0; i3 < iOooO0o2; i3++) {
                float fOooO = oooO0O0.f4237OooO0Oo.OooO(i3);
                SolverVariable solverVariableOooO0O1 = oooO0O0.f4237OooO0Oo.OooO0O0(i3);
                if (solverVariableOooO0O1.f4270OooOO0o == SolverVariable.Type.UNRESTRICTED) {
                    if (solverVariable2 == null) {
                        if (solverVariableOooO0O1.f4273OooOOOO <= 1) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        solverVariable2 = solverVariableOooO0O1;
                        f2 = fOooO;
                    } else {
                        if (f2 > fOooO) {
                            if (solverVariableOooO0O1.f4273OooOOOO > 1) {
                                z6 = false;
                            }
                            solverVariable2 = solverVariableOooO0O1;
                            f2 = fOooO;
                        } else if (!z6) {
                            if (solverVariableOooO0O1.f4273OooOOOO <= 1) {
                            }
                        }
                        z6 = true;
                        solverVariable2 = solverVariableOooO0O1;
                        f2 = fOooO;
                    }
                } else if (solverVariable2 == null && fOooO < 0.0f) {
                    if (solverVariable3 == null) {
                        if (solverVariableOooO0O1.f4273OooOOOO <= 1) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        solverVariable3 = solverVariableOooO0O1;
                        f3 = fOooO;
                    } else {
                        if (f3 > fOooO) {
                            if (solverVariableOooO0O1.f4273OooOOOO > 1) {
                                z7 = false;
                            }
                            solverVariable3 = solverVariableOooO0O1;
                            f3 = fOooO;
                        } else if (!z7) {
                            if (solverVariableOooO0O1.f4273OooOOOO <= 1) {
                            }
                        }
                        z7 = true;
                        solverVariable3 = solverVariableOooO0O1;
                        f3 = fOooO;
                    }
                }
            }
            if (solverVariable2 == null) {
                solverVariable2 = solverVariable3;
            }
            if (solverVariable2 == null) {
                z2 = true;
            } else {
                oooO0O0.OooO0oO(solverVariable2);
                z2 = false;
            }
            if (oooO0O0.f4237OooO0Oo.OooO0o() == 0) {
                oooO0O0.f4238OooO0o0 = true;
            }
            if (z2) {
                if (this.f4241OooO + 1 >= this.f4247OooO0o0) {
                    OooOOOO();
                }
                SolverVariable solverVariableOooO00o = OooO00o(SolverVariable.Type.SLACK);
                int i4 = this.f4243OooO0O0 + 1;
                this.f4243OooO0O0 = i4;
                this.f4241OooO++;
                solverVariableOooO00o.f4265OooO0o0 = i4;
                oO0Oo0oo oo0oo0oo = this.f4252OooOO0o;
                oo0oo0oo.f58117OooO0OO[i4] = solverVariableOooO00o;
                oooO0O0.f4234OooO00o = solverVariableOooO00o;
                int i5 = this.f4250OooOO0;
                OooO0oo(oooO0O0);
                if (this.f4250OooOO0 == i5 + 1) {
                    OooO0O0 oooO0O1 = this.f4255OooOOOO;
                    oooO0O1.getClass();
                    oooO0O1.f4234OooO00o = null;
                    oooO0O1.f4237OooO0Oo.clear();
                    for (int i6 = 0; i6 < oooO0O0.f4237OooO0Oo.OooO0o(); i6++) {
                        oooO0O1.f4237OooO0Oo.OooO0OO(oooO0O0.f4237OooO0Oo.OooO0O0(i6), oooO0O0.f4237OooO0Oo.OooO(i6), true);
                    }
                    OooOOo(this.f4255OooOOOO);
                    if (solverVariableOooO00o.f4264OooO0o == -1) {
                        if (oooO0O0.f4234OooO00o == solverVariableOooO00o && (solverVariableOooO0o = oooO0O0.OooO0o(null, solverVariableOooO00o)) != null) {
                            oooO0O0.OooO0oO(solverVariableOooO0o);
                        }
                        if (!oooO0O0.f4238OooO0o0) {
                            oooO0O0.f4234OooO00o.OooO0o0(this, oooO0O0);
                        }
                        ooOOOOoo oooooooo = oo0oo0oo.f58115OooO00o;
                        int i7 = oooooooo.f58119OooO0O0;
                        Object[] objArr = oooooooo.f58118OooO00o;
                        if (i7 < objArr.length) {
                            objArr[i7] = oooO0O0;
                            oooooooo.f58119OooO0O0 = i7 + 1;
                        }
                        this.f4250OooOO0--;
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            SolverVariable solverVariable4 = oooO0O0.f4234OooO00o;
            if (solverVariable4 == null || (solverVariable4.f4270OooOO0o != SolverVariable.Type.UNRESTRICTED && oooO0O0.f4235OooO0O0 < 0.0f)) {
                z4 = false;
            }
            if (!z4) {
                return;
            } else {
                z = z3;
            }
        }
        if (z) {
            return;
        }
        OooO0oo(oooO0O0);
    }

    public final void OooO0Oo(SolverVariable solverVariable, int i) {
        int i2 = solverVariable.f4264OooO0o;
        if (i2 == -1) {
            solverVariable.OooO0Oo(this, i);
            for (int i3 = 0; i3 < this.f4243OooO0O0 + 1; i3++) {
                SolverVariable solverVariable2 = this.f4252OooOO0o.f58117OooO0OO[i3];
            }
            return;
        }
        if (i2 == -1) {
            OooO0O0 oooO0O0OooOO0o = OooOO0o();
            oooO0O0OooOO0o.f4234OooO00o = solverVariable;
            float f = i;
            solverVariable.f4267OooO0oo = f;
            oooO0O0OooOO0o.f4235OooO0O0 = f;
            oooO0O0OooOO0o.f4238OooO0o0 = true;
            OooO0OO(oooO0O0OooOO0o);
            return;
        }
        OooO0O0 oooO0O0 = this.f4246OooO0o[i2];
        if (oooO0O0.f4238OooO0o0) {
            oooO0O0.f4235OooO0O0 = i;
            return;
        }
        if (oooO0O0.f4237OooO0Oo.OooO0o() == 0) {
            oooO0O0.f4238OooO0o0 = true;
            oooO0O0.f4235OooO0O0 = i;
            return;
        }
        OooO0O0 oooO0O0OooOO0o2 = OooOO0o();
        if (i < 0) {
            oooO0O0OooOO0o2.f4235OooO0O0 = i * (-1);
            oooO0O0OooOO0o2.f4237OooO0Oo.OooO0oo(solverVariable, 1.0f);
        } else {
            oooO0O0OooOO0o2.f4235OooO0O0 = i;
            oooO0O0OooOO0o2.f4237OooO0Oo.OooO0oo(solverVariable, -1.0f);
        }
        OooO0OO(oooO0O0OooOO0o2);
    }

    public final void OooO0o(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        OooO0O0 oooO0O0OooOO0o = OooOO0o();
        SolverVariable solverVariableOooOOO0 = OooOOO0();
        solverVariableOooOOO0.f4266OooO0oO = 0;
        oooO0O0OooOO0o.OooO0OO(solverVariable, solverVariable2, solverVariableOooOOO0, i);
        if (i2 != 8) {
            oooO0O0OooOO0o.f4237OooO0Oo.OooO0oo(OooOO0(i2), (int) (oooO0O0OooOO0o.f4237OooO0Oo.OooOO0(solverVariableOooOOO0) * (-1.0f)));
        }
        OooO0OO(oooO0O0OooOO0o);
    }

    public final void OooO0o0(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        if (i2 == 8 && solverVariable2.f4262OooO && solverVariable.f4264OooO0o == -1) {
            solverVariable.OooO0Oo(this, solverVariable2.f4267OooO0oo + i);
            return;
        }
        OooO0O0 oooO0O0OooOO0o = OooOO0o();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            oooO0O0OooOO0o.f4235OooO0O0 = i;
        }
        if (z) {
            oooO0O0OooOO0o.f4237OooO0Oo.OooO0oo(solverVariable, 1.0f);
            oooO0O0OooOO0o.f4237OooO0Oo.OooO0oo(solverVariable2, -1.0f);
        } else {
            oooO0O0OooOO0o.f4237OooO0Oo.OooO0oo(solverVariable, -1.0f);
            oooO0O0OooOO0o.f4237OooO0Oo.OooO0oo(solverVariable2, 1.0f);
        }
        if (i2 != 8) {
            oooO0O0OooOO0o.OooO0O0(this, i2);
        }
        OooO0OO(oooO0O0OooOO0o);
    }

    public final void OooO0oO(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        OooO0O0 oooO0O0OooOO0o = OooOO0o();
        SolverVariable solverVariableOooOOO0 = OooOOO0();
        solverVariableOooOOO0.f4266OooO0oO = 0;
        oooO0O0OooOO0o.OooO0Oo(solverVariable, solverVariable2, solverVariableOooOOO0, i);
        if (i2 != 8) {
            oooO0O0OooOO0o.f4237OooO0Oo.OooO0oo(OooOO0(i2), (int) (oooO0O0OooOO0o.f4237OooO0Oo.OooOO0(solverVariableOooOOO0) * (-1.0f)));
        }
        OooO0OO(oooO0O0OooOO0o);
    }

    public final void OooO0oo(OooO0O0 oooO0O0) {
        int i;
        if (oooO0O0.f4238OooO0o0) {
            oooO0O0.f4234OooO00o.OooO0Oo(this, oooO0O0.f4235OooO0O0);
        } else {
            OooO0O0[] oooO0O0Arr = this.f4246OooO0o;
            int i2 = this.f4250OooOO0;
            oooO0O0Arr[i2] = oooO0O0;
            SolverVariable solverVariable = oooO0O0.f4234OooO00o;
            solverVariable.f4264OooO0o = i2;
            this.f4250OooOO0 = i2 + 1;
            solverVariable.OooO0o0(this, oooO0O0);
        }
        if (this.f4242OooO00o) {
            int i3 = 0;
            while (i3 < this.f4250OooOO0) {
                if (this.f4246OooO0o[i3] == null) {
                    System.out.println("WTF");
                }
                OooO0O0 oooO0O1 = this.f4246OooO0o[i3];
                if (oooO0O1 != null && oooO0O1.f4238OooO0o0) {
                    oooO0O1.f4234OooO00o.OooO0Oo(this, oooO0O1.f4235OooO0O0);
                    ooOOOOoo oooooooo = this.f4252OooOO0o.f58115OooO00o;
                    int i4 = oooooooo.f58119OooO0O0;
                    Object[] objArr = oooooooo.f58118OooO00o;
                    if (i4 < objArr.length) {
                        objArr[i4] = oooO0O1;
                        oooooooo.f58119OooO0O0 = i4 + 1;
                    }
                    this.f4246OooO0o[i3] = null;
                    int i5 = i3 + 1;
                    int i6 = i5;
                    while (true) {
                        i = this.f4250OooOO0;
                        if (i5 >= i) {
                            break;
                        }
                        OooO0O0[] oooO0O0Arr2 = this.f4246OooO0o;
                        int i7 = i5 - 1;
                        OooO0O0 oooO0O2 = oooO0O0Arr2[i5];
                        oooO0O0Arr2[i7] = oooO0O2;
                        SolverVariable solverVariable2 = oooO0O2.f4234OooO00o;
                        if (solverVariable2.f4264OooO0o == i5) {
                            solverVariable2.f4264OooO0o = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i) {
                        this.f4246OooO0o[i6] = null;
                    }
                    this.f4250OooOO0 = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f4242OooO00o = false;
        }
    }

    public final SolverVariable OooOO0(int i) {
        if (this.f4241OooO + 1 >= this.f4247OooO0o0) {
            OooOOOO();
        }
        SolverVariable solverVariableOooO00o = OooO00o(SolverVariable.Type.ERROR);
        int i2 = this.f4243OooO0O0 + 1;
        this.f4243OooO0O0 = i2;
        this.f4241OooO++;
        solverVariableOooO00o.f4265OooO0o0 = i2;
        solverVariableOooO00o.f4266OooO0oO = i;
        this.f4252OooOO0o.f58117OooO0OO[i2] = solverVariableOooO00o;
        OooO0o oooO0o = this.f4244OooO0OO;
        oooO0o.f4256OooO.f4260OooO00o = solverVariableOooO00o;
        float[] fArr = solverVariableOooO00o.f4269OooOO0O;
        Arrays.fill(fArr, 0.0f);
        fArr[solverVariableOooO00o.f4266OooO0oO] = 1.0f;
        oooO0o.OooOO0(solverVariableOooO00o);
        return solverVariableOooO00o;
    }

    public final SolverVariable OooOO0O(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f4241OooO + 1 >= this.f4247OooO0o0) {
            OooOOOO();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.f4330OooO;
            if (solverVariable == null) {
                constraintAnchor.OooOO0O();
                solverVariable = constraintAnchor.f4330OooO;
            }
            int i = solverVariable.f4265OooO0o0;
            oO0Oo0oo oo0oo0oo = this.f4252OooOO0o;
            if (i == -1 || i > this.f4243OooO0O0 || oo0oo0oo.f58117OooO0OO[i] == null) {
                if (i != -1) {
                    solverVariable.OooO0OO();
                }
                int i2 = this.f4243OooO0O0 + 1;
                this.f4243OooO0O0 = i2;
                this.f4241OooO++;
                solverVariable.f4265OooO0o0 = i2;
                solverVariable.f4270OooOO0o = SolverVariable.Type.UNRESTRICTED;
                oo0oo0oo.f58117OooO0OO[i2] = solverVariable;
            }
        }
        return solverVariable;
    }

    public final OooO0O0 OooOO0o() {
        Object obj;
        oO0Oo0oo oo0oo0oo = this.f4252OooOO0o;
        ooOOOOoo oooooooo = oo0oo0oo.f58115OooO00o;
        int i = oooooooo.f58119OooO0O0;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = oooooooo.f58118OooO00o;
            obj = objArr[i2];
            objArr[i2] = null;
            oooooooo.f58119OooO0O0 = i2;
        } else {
            obj = null;
        }
        OooO0O0 oooO0O0 = (OooO0O0) obj;
        if (oooO0O0 == null) {
            return new OooO0O0(oo0oo0oo);
        }
        oooO0O0.f4234OooO00o = null;
        oooO0O0.f4237OooO0Oo.clear();
        oooO0O0.f4235OooO0O0 = 0.0f;
        oooO0O0.f4238OooO0o0 = false;
        return oooO0O0;
    }

    public final SolverVariable OooOOO0() {
        if (this.f4241OooO + 1 >= this.f4247OooO0o0) {
            OooOOOO();
        }
        SolverVariable solverVariableOooO00o = OooO00o(SolverVariable.Type.SLACK);
        int i = this.f4243OooO0O0 + 1;
        this.f4243OooO0O0 = i;
        this.f4241OooO++;
        solverVariableOooO00o.f4265OooO0o0 = i;
        this.f4252OooOO0o.f58117OooO0OO[i] = solverVariableOooO00o;
        return solverVariableOooO00o;
    }

    public final void OooOOOO() {
        int i = this.f4245OooO0Oo * 2;
        this.f4245OooO0Oo = i;
        this.f4246OooO0o = (OooO0O0[]) Arrays.copyOf(this.f4246OooO0o, i);
        oO0Oo0oo oo0oo0oo = this.f4252OooOO0o;
        oo0oo0oo.f58117OooO0OO = (SolverVariable[]) Arrays.copyOf(oo0oo0oo.f58117OooO0OO, this.f4245OooO0Oo);
        int i2 = this.f4245OooO0Oo;
        this.f4249OooO0oo = new boolean[i2];
        this.f4247OooO0o0 = i2;
        this.f4251OooOO0O = i2;
    }

    public final void OooOOOo() throws Exception {
        OooO0o oooO0o = this.f4244OooO0OO;
        if (oooO0o.OooO0o0()) {
            OooO();
            return;
        }
        if (!this.f4248OooO0oO) {
            OooOOo0(oooO0o);
            return;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= this.f4250OooOO0) {
                z = true;
                break;
            } else if (!this.f4246OooO0o[i].f4238OooO0o0) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            OooO();
        } else {
            OooOOo0(oooO0o);
        }
    }

    public final void OooOOo(OooO0O0 oooO0O0) {
        for (int i = 0; i < this.f4241OooO; i++) {
            this.f4249OooO0oo[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.f4241OooO * 2) {
                return;
            }
            SolverVariable solverVariable = oooO0O0.f4234OooO00o;
            if (solverVariable != null) {
                this.f4249OooO0oo[solverVariable.f4265OooO0o0] = true;
            }
            SolverVariable solverVariableOooO00o = oooO0O0.OooO00o(this.f4249OooO0oo);
            if (solverVariableOooO00o != null) {
                boolean[] zArr = this.f4249OooO0oo;
                int i3 = solverVariableOooO00o.f4265OooO0o0;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (solverVariableOooO00o != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f4250OooOO0; i5++) {
                    OooO0O0 oooO0O1 = this.f4246OooO0o[i5];
                    if (oooO0O1.f4234OooO00o.f4270OooOO0o != SolverVariable.Type.UNRESTRICTED && !oooO0O1.f4238OooO0o0 && oooO0O1.f4237OooO0Oo.OooO00o(solverVariableOooO00o)) {
                        float fOooOO0 = oooO0O1.f4237OooO0Oo.OooOO0(solverVariableOooO00o);
                        if (fOooOO0 < 0.0f) {
                            float f2 = (-oooO0O1.f4235OooO0O0) / fOooOO0;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    OooO0O0 oooO0O2 = this.f4246OooO0o[i4];
                    oooO0O2.f4234OooO00o.f4264OooO0o = -1;
                    oooO0O2.OooO0oO(solverVariableOooO00o);
                    SolverVariable solverVariable2 = oooO0O2.f4234OooO00o;
                    solverVariable2.f4264OooO0o = i4;
                    solverVariable2.OooO0o0(this, oooO0O2);
                }
            } else {
                z = true;
            }
        }
    }

    public final void OooOOo0(OooO0o oooO0o) throws Exception {
        float f;
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            f = 0.0f;
            i = 1;
            if (i2 >= this.f4250OooOO0) {
                z = false;
                break;
            }
            OooO0O0 oooO0O0 = this.f4246OooO0o[i2];
            if (oooO0O0.f4234OooO00o.f4270OooOO0o != SolverVariable.Type.UNRESTRICTED && oooO0O0.f4235OooO0O0 < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3 += i;
                float f2 = Float.MAX_VALUE;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                int i7 = 0;
                while (i6 < this.f4250OooOO0) {
                    OooO0O0 oooO0O1 = this.f4246OooO0o[i6];
                    if (oooO0O1.f4234OooO00o.f4270OooOO0o != SolverVariable.Type.UNRESTRICTED && !oooO0O1.f4238OooO0o0 && oooO0O1.f4235OooO0O0 < f) {
                        int iOooO0o = oooO0O1.f4237OooO0Oo.OooO0o();
                        int i8 = 0;
                        while (i8 < iOooO0o) {
                            SolverVariable solverVariableOooO0O0 = oooO0O1.f4237OooO0Oo.OooO0O0(i8);
                            float fOooOO0 = oooO0O1.f4237OooO0Oo.OooOO0(solverVariableOooO0O0);
                            if (fOooOO0 > f) {
                                for (int i9 = 0; i9 < 9; i9++) {
                                    float f3 = solverVariableOooO0O0.f4268OooOO0[i9] / fOooOO0;
                                    if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                        i5 = solverVariableOooO0O0.f4265OooO0o0;
                                        i7 = i9;
                                        f2 = f3;
                                        i4 = i6;
                                    }
                                }
                            }
                            i8++;
                            f = 0.0f;
                        }
                    }
                    i6++;
                    f = 0.0f;
                }
                if (i4 != -1) {
                    OooO0O0 oooO0O2 = this.f4246OooO0o[i4];
                    oooO0O2.f4234OooO00o.f4264OooO0o = -1;
                    oooO0O2.OooO0oO(this.f4252OooOO0o.f58117OooO0OO[i5]);
                    SolverVariable solverVariable = oooO0O2.f4234OooO00o;
                    solverVariable.f4264OooO0o = i4;
                    solverVariable.OooO0o0(this, oooO0O2);
                } else {
                    z2 = true;
                }
                if (i3 > this.f4241OooO / 2) {
                    z2 = true;
                }
                f = 0.0f;
                i = 1;
            }
        }
        OooOOo(oooO0o);
        OooO();
    }

    public final void OooOOoo() {
        oO0Oo0oo oo0oo0oo;
        int i = 0;
        while (true) {
            oo0oo0oo = this.f4252OooOO0o;
            SolverVariable[] solverVariableArr = oo0oo0oo.f58117OooO0OO;
            if (i >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i];
            if (solverVariable != null) {
                solverVariable.OooO0OO();
            }
            i++;
        }
        SolverVariable[] solverVariableArr2 = this.f4254OooOOO0;
        int length = this.f4253OooOOO;
        ooOOOOoo oooooooo = oo0oo0oo.f58116OooO0O0;
        oooooooo.getClass();
        if (length > solverVariableArr2.length) {
            length = solverVariableArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            SolverVariable solverVariable2 = solverVariableArr2[i2];
            int i3 = oooooooo.f58119OooO0O0;
            Object[] objArr = oooooooo.f58118OooO00o;
            if (i3 < objArr.length) {
                objArr[i3] = solverVariable2;
                oooooooo.f58119OooO0O0 = i3 + 1;
            }
        }
        this.f4253OooOOO = 0;
        Arrays.fill(oo0oo0oo.f58117OooO0OO, (Object) null);
        this.f4243OooO0O0 = 0;
        OooO0o oooO0o = this.f4244OooO0OO;
        oooO0o.f4259OooO0oo = 0;
        oooO0o.f4235OooO0O0 = 0.0f;
        this.f4241OooO = 1;
        for (int i4 = 0; i4 < this.f4250OooOO0; i4++) {
            OooO0O0 oooO0O0 = this.f4246OooO0o[i4];
        }
        for (int i5 = 0; i5 < this.f4250OooOO0; i5++) {
            OooO0O0[] oooO0O0Arr = this.f4246OooO0o;
            OooO0O0 oooO0O1 = oooO0O0Arr[i5];
            if (oooO0O1 != null) {
                ooOOOOoo oooooooo2 = oo0oo0oo.f58115OooO00o;
                int i6 = oooooooo2.f58119OooO0O0;
                Object[] objArr2 = oooooooo2.f58118OooO00o;
                if (i6 < objArr2.length) {
                    objArr2[i6] = oooO0O1;
                    oooooooo2.f58119OooO0O0 = i6 + 1;
                }
            }
            oooO0O0Arr[i5] = null;
        }
        this.f4250OooOO0 = 0;
        this.f4255OooOOOO = new OooO0O0(oo0oo0oo);
    }
}
