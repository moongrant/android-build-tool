package androidx.constraintlayout.core;

import androidx.camera.core.impl.OooOOOO;
import java.util.Arrays;
import p039OoooOoo.o00OO;
import p644o0ooOoO.oO0000o0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements OooO0O0.OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f4220OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oO0000o0 f4221OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f4219OooO00o = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f4222OooO0Oo = 8;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int[] f4224OooO0o0 = new int[8];

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int[] f4223OooO0o = new int[8];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float[] f4225OooO0oO = new float[8];

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f4226OooO0oo = -1;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f4218OooO = -1;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f4227OooOO0 = false;

    public OooO00o(OooO0O0 oooO0O0, oO0000o0 oo0000o0) {
        this.f4220OooO0O0 = oooO0O0;
        this.f4221OooO0OO = oo0000o0;
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final float OooO(int i) {
        int i2 = this.f4226OooO0oo;
        for (int i3 = 0; i2 != -1 && i3 < this.f4219OooO00o; i3++) {
            if (i3 == i) {
                return this.f4225OooO0oO[i2];
            }
            i2 = this.f4223OooO0o[i2];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final boolean OooO00o(SolverVariable solverVariable) {
        int i = this.f4226OooO0oo;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f4219OooO00o; i2++) {
            if (this.f4224OooO0o0[i] == solverVariable.f4259OooO0o0) {
                return true;
            }
            i = this.f4223OooO0o[i];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final SolverVariable OooO0O0(int i) {
        int i2 = this.f4226OooO0oo;
        for (int i3 = 0; i2 != -1 && i3 < this.f4219OooO00o; i3++) {
            if (i3 == i) {
                return this.f4221OooO0OO.f59611OooO0OO[this.f4224OooO0o0[i2]];
            }
            i2 = this.f4223OooO0o[i2];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final void OooO0OO(SolverVariable solverVariable, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f4226OooO0oo;
            OooO0O0 oooO0O0 = this.f4220OooO0O0;
            if (i == -1) {
                this.f4226OooO0oo = 0;
                this.f4225OooO0oO[0] = f;
                this.f4224OooO0o0[0] = solverVariable.f4259OooO0o0;
                this.f4223OooO0o[0] = -1;
                solverVariable.f4267OooOOOO++;
                solverVariable.OooO00o(oooO0O0);
                this.f4219OooO00o++;
                if (this.f4227OooOO0) {
                    return;
                }
                int i2 = this.f4218OooO + 1;
                this.f4218OooO = i2;
                int[] iArr = this.f4224OooO0o0;
                if (i2 >= iArr.length) {
                    this.f4227OooOO0 = true;
                    this.f4218OooO = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f4219OooO00o; i4++) {
                int i5 = this.f4224OooO0o0[i];
                int i6 = solverVariable.f4259OooO0o0;
                if (i5 == i6) {
                    float[] fArr = this.f4225OooO0oO;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f4226OooO0oo) {
                            this.f4226OooO0oo = this.f4223OooO0o[i];
                        } else {
                            int[] iArr2 = this.f4223OooO0o;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            solverVariable.OooO0O0(oooO0O0);
                        }
                        if (this.f4227OooOO0) {
                            this.f4218OooO = i;
                        }
                        solverVariable.f4267OooOOOO--;
                        this.f4219OooO00o--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f4223OooO0o[i];
            }
            int length = this.f4218OooO;
            int i7 = length + 1;
            if (this.f4227OooOO0) {
                int[] iArr3 = this.f4224OooO0o0;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f4224OooO0o0;
            if (length >= iArr4.length && this.f4219OooO00o < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f4224OooO0o0;
                    if (i8 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr6 = this.f4224OooO0o0;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f4222OooO0Oo * 2;
                this.f4222OooO0Oo = i9;
                this.f4227OooOO0 = false;
                this.f4218OooO = length - 1;
                this.f4225OooO0oO = Arrays.copyOf(this.f4225OooO0oO, i9);
                this.f4224OooO0o0 = Arrays.copyOf(this.f4224OooO0o0, this.f4222OooO0Oo);
                this.f4223OooO0o = Arrays.copyOf(this.f4223OooO0o, this.f4222OooO0Oo);
            }
            this.f4224OooO0o0[length] = solverVariable.f4259OooO0o0;
            this.f4225OooO0oO[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f4223OooO0o;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f4223OooO0o[length] = this.f4226OooO0oo;
                this.f4226OooO0oo = length;
            }
            solverVariable.f4267OooOOOO++;
            solverVariable.OooO00o(oooO0O0);
            this.f4219OooO00o++;
            if (!this.f4227OooOO0) {
                this.f4218OooO++;
            }
            int i10 = this.f4218OooO;
            int[] iArr8 = this.f4224OooO0o0;
            if (i10 >= iArr8.length) {
                this.f4227OooOO0 = true;
                this.f4218OooO = iArr8.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final void OooO0Oo() {
        int i = this.f4226OooO0oo;
        for (int i2 = 0; i != -1 && i2 < this.f4219OooO00o; i2++) {
            float[] fArr = this.f4225OooO0oO;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f4223OooO0o[i];
        }
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final int OooO0o() {
        return this.f4219OooO00o;
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final float OooO0o0(SolverVariable solverVariable, boolean z) {
        int i = this.f4226OooO0oo;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f4219OooO00o) {
            if (this.f4224OooO0o0[i] == solverVariable.f4259OooO0o0) {
                if (i == this.f4226OooO0oo) {
                    this.f4226OooO0oo = this.f4223OooO0o[i];
                } else {
                    int[] iArr = this.f4223OooO0o;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    solverVariable.OooO0O0(this.f4220OooO0O0);
                }
                solverVariable.f4267OooOOOO--;
                this.f4219OooO00o--;
                this.f4224OooO0o0[i] = -1;
                if (this.f4227OooOO0) {
                    this.f4218OooO = i;
                }
                return this.f4225OooO0oO[i];
            }
            i2++;
            i3 = i;
            i = this.f4223OooO0o[i];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final float OooO0oO(OooO0O0 oooO0O0, boolean z) {
        float fOooOO0 = OooOO0(oooO0O0.f4228OooO00o);
        OooO0o0(oooO0O0.f4228OooO00o, z);
        OooO0O0.OooO00o oooO00o = oooO0O0.f4231OooO0Oo;
        int iOooO0o = oooO00o.OooO0o();
        for (int i = 0; i < iOooO0o; i++) {
            SolverVariable solverVariableOooO0O0 = oooO00o.OooO0O0(i);
            OooO0OO(solverVariableOooO0O0, oooO00o.OooOO0(solverVariableOooO0O0) * fOooOO0, z);
        }
        return fOooOO0;
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final void OooO0oo(SolverVariable solverVariable, float f) {
        if (f == 0.0f) {
            OooO0o0(solverVariable, true);
            return;
        }
        int i = this.f4226OooO0oo;
        OooO0O0 oooO0O0 = this.f4220OooO0O0;
        if (i == -1) {
            this.f4226OooO0oo = 0;
            this.f4225OooO0oO[0] = f;
            this.f4224OooO0o0[0] = solverVariable.f4259OooO0o0;
            this.f4223OooO0o[0] = -1;
            solverVariable.f4267OooOOOO++;
            solverVariable.OooO00o(oooO0O0);
            this.f4219OooO00o++;
            if (this.f4227OooOO0) {
                return;
            }
            int i2 = this.f4218OooO + 1;
            this.f4218OooO = i2;
            int[] iArr = this.f4224OooO0o0;
            if (i2 >= iArr.length) {
                this.f4227OooOO0 = true;
                this.f4218OooO = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f4219OooO00o; i4++) {
            int i5 = this.f4224OooO0o0[i];
            int i6 = solverVariable.f4259OooO0o0;
            if (i5 == i6) {
                this.f4225OooO0oO[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f4223OooO0o[i];
        }
        int length = this.f4218OooO;
        int i7 = length + 1;
        if (this.f4227OooOO0) {
            int[] iArr2 = this.f4224OooO0o0;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f4224OooO0o0;
        if (length >= iArr3.length && this.f4219OooO00o < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f4224OooO0o0;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f4224OooO0o0;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f4222OooO0Oo * 2;
            this.f4222OooO0Oo = i9;
            this.f4227OooOO0 = false;
            this.f4218OooO = length - 1;
            this.f4225OooO0oO = Arrays.copyOf(this.f4225OooO0oO, i9);
            this.f4224OooO0o0 = Arrays.copyOf(this.f4224OooO0o0, this.f4222OooO0Oo);
            this.f4223OooO0o = Arrays.copyOf(this.f4223OooO0o, this.f4222OooO0Oo);
        }
        this.f4224OooO0o0[length] = solverVariable.f4259OooO0o0;
        this.f4225OooO0oO[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f4223OooO0o;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f4223OooO0o[length] = this.f4226OooO0oo;
            this.f4226OooO0oo = length;
        }
        solverVariable.f4267OooOOOO++;
        solverVariable.OooO00o(oooO0O0);
        int i10 = this.f4219OooO00o + 1;
        this.f4219OooO00o = i10;
        if (!this.f4227OooOO0) {
            this.f4218OooO++;
        }
        int[] iArr7 = this.f4224OooO0o0;
        if (i10 >= iArr7.length) {
            this.f4227OooOO0 = true;
        }
        if (this.f4218OooO >= iArr7.length) {
            this.f4227OooOO0 = true;
            this.f4218OooO = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final float OooOO0(SolverVariable solverVariable) {
        int i = this.f4226OooO0oo;
        for (int i2 = 0; i != -1 && i2 < this.f4219OooO00o; i2++) {
            if (this.f4224OooO0o0[i] == solverVariable.f4259OooO0o0) {
                return this.f4225OooO0oO[i];
            }
            i = this.f4223OooO0o[i];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final void OooOO0O(float f) {
        int i = this.f4226OooO0oo;
        for (int i2 = 0; i != -1 && i2 < this.f4219OooO00o; i2++) {
            float[] fArr = this.f4225OooO0oO;
            fArr[i] = fArr[i] / f;
            i = this.f4223OooO0o[i];
        }
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final void clear() {
        int i = this.f4226OooO0oo;
        for (int i2 = 0; i != -1 && i2 < this.f4219OooO00o; i2++) {
            SolverVariable solverVariable = this.f4221OooO0OO.f59611OooO0OO[this.f4224OooO0o0[i]];
            if (solverVariable != null) {
                solverVariable.OooO0O0(this.f4220OooO0O0);
            }
            i = this.f4223OooO0o[i];
        }
        this.f4226OooO0oo = -1;
        this.f4218OooO = -1;
        this.f4227OooOO0 = false;
        this.f4219OooO00o = 0;
    }

    public final String toString() {
        int i = this.f4226OooO0oo;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f4219OooO00o; i2++) {
            StringBuilder sbOooO00o = o00OO.OooO00o(OooOOOO.OooO00o(string, " -> "));
            sbOooO00o.append(this.f4225OooO0oO[i]);
            sbOooO00o.append(" : ");
            StringBuilder sbOooO00o2 = o00OO.OooO00o(sbOooO00o.toString());
            sbOooO00o2.append(this.f4221OooO0OO.f59611OooO0OO[this.f4224OooO0o0[i]]);
            string = sbOooO00o2.toString();
            i = this.f4223OooO0o[i];
        }
        return string;
    }
}
