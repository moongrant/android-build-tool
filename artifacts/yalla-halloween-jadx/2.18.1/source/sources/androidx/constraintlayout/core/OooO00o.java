package androidx.constraintlayout.core;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Arrays;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements OooO0O0.OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f6787OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000OOO.OooO00o f6788OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f6786OooO00o = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f6789OooO0Oo = 8;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int[] f6791OooO0o0 = new int[8];

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int[] f6790OooO0o = new int[8];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float[] f6792OooO0oO = new float[8];

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f6793OooO0oo = -1;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f6785OooO = -1;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f6794OooOO0 = false;

    public OooO00o(OooO0O0 oooO0O0, o0000OOO.OooO00o oooO00o) {
        this.f6787OooO0O0 = oooO0O0;
        this.f6788OooO0OO = oooO00o;
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final float OooO(SolverVariable solverVariable, boolean z) {
        int i = this.f6793OooO0oo;
        if (i == -1) {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f6786OooO00o) {
            if (this.f6791OooO0o0[i] == solverVariable.f6825Oooo0oO) {
                if (i == this.f6793OooO0oo) {
                    this.f6793OooO0oo = this.f6790OooO0o[i];
                } else {
                    int[] iArr = this.f6790OooO0o;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    solverVariable.OooO0O0(this.f6787OooO0O0);
                }
                solverVariable.f6833OoooOOo--;
                this.f6786OooO00o--;
                this.f6791OooO0o0[i] = -1;
                if (this.f6794OooOO0) {
                    this.f6785OooO = i;
                }
                return this.f6792OooO0oO[i];
            }
            i2++;
            i3 = i;
            i = this.f6790OooO0o[i];
        }
        return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final int OooO00o() {
        return this.f6786OooO00o;
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final boolean OooO0O0(SolverVariable solverVariable) {
        int i = this.f6793OooO0oo;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f6786OooO00o; i2++) {
            if (this.f6791OooO0o0[i] == solverVariable.f6825Oooo0oO) {
                return true;
            }
            i = this.f6790OooO0o[i];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final float OooO0OO(OooO0O0 oooO0O0, boolean z) {
        float fOooOO0 = OooOO0(oooO0O0.f6795OooO00o);
        OooO(oooO0O0.f6795OooO00o, z);
        OooO0O0.OooO00o oooO00o = oooO0O0.f6798OooO0Oo;
        int iOooO00o = oooO00o.OooO00o();
        for (int i = 0; i < iOooO00o; i++) {
            SolverVariable solverVariableOooO0o0 = oooO00o.OooO0o0(i);
            OooO0o(solverVariableOooO0o0, oooO00o.OooOO0(solverVariableOooO0o0) * fOooOO0, z);
        }
        return fOooOO0;
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final void OooO0Oo(SolverVariable solverVariable, float f) {
        if (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            OooO(solverVariable, true);
            return;
        }
        int i = this.f6793OooO0oo;
        if (i == -1) {
            this.f6793OooO0oo = 0;
            this.f6792OooO0oO[0] = f;
            this.f6791OooO0o0[0] = solverVariable.f6825Oooo0oO;
            this.f6790OooO0o[0] = -1;
            solverVariable.f6833OoooOOo++;
            solverVariable.OooO00o(this.f6787OooO0O0);
            this.f6786OooO00o++;
            if (this.f6794OooOO0) {
                return;
            }
            int i2 = this.f6785OooO + 1;
            this.f6785OooO = i2;
            int[] iArr = this.f6791OooO0o0;
            if (i2 >= iArr.length) {
                this.f6794OooOO0 = true;
                this.f6785OooO = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f6786OooO00o; i4++) {
            int[] iArr2 = this.f6791OooO0o0;
            int i5 = iArr2[i];
            int i6 = solverVariable.f6825Oooo0oO;
            if (i5 == i6) {
                this.f6792OooO0oO[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.f6790OooO0o[i];
        }
        int length = this.f6785OooO;
        int i7 = length + 1;
        if (this.f6794OooOO0) {
            int[] iArr3 = this.f6791OooO0o0;
            if (iArr3[length] != -1) {
                length = iArr3.length;
            }
        } else {
            length = i7;
        }
        int[] iArr4 = this.f6791OooO0o0;
        if (length >= iArr4.length && this.f6786OooO00o < iArr4.length) {
            int i8 = 0;
            while (true) {
                int[] iArr5 = this.f6791OooO0o0;
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
        int[] iArr6 = this.f6791OooO0o0;
        if (length >= iArr6.length) {
            length = iArr6.length;
            int i9 = this.f6789OooO0Oo * 2;
            this.f6789OooO0Oo = i9;
            this.f6794OooOO0 = false;
            this.f6785OooO = length - 1;
            this.f6792OooO0oO = Arrays.copyOf(this.f6792OooO0oO, i9);
            this.f6791OooO0o0 = Arrays.copyOf(this.f6791OooO0o0, this.f6789OooO0Oo);
            this.f6790OooO0o = Arrays.copyOf(this.f6790OooO0o, this.f6789OooO0Oo);
        }
        this.f6791OooO0o0[length] = solverVariable.f6825Oooo0oO;
        this.f6792OooO0oO[length] = f;
        if (i3 != -1) {
            int[] iArr7 = this.f6790OooO0o;
            iArr7[length] = iArr7[i3];
            iArr7[i3] = length;
        } else {
            this.f6790OooO0o[length] = this.f6793OooO0oo;
            this.f6793OooO0oo = length;
        }
        solverVariable.f6833OoooOOo++;
        solverVariable.OooO00o(this.f6787OooO0O0);
        int i10 = this.f6786OooO00o + 1;
        this.f6786OooO00o = i10;
        if (!this.f6794OooOO0) {
            this.f6785OooO++;
        }
        int[] iArr8 = this.f6791OooO0o0;
        if (i10 >= iArr8.length) {
            this.f6794OooOO0 = true;
        }
        if (this.f6785OooO >= iArr8.length) {
            this.f6794OooOO0 = true;
            this.f6785OooO = iArr8.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final void OooO0o(SolverVariable solverVariable, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f6793OooO0oo;
            if (i == -1) {
                this.f6793OooO0oo = 0;
                this.f6792OooO0oO[0] = f;
                this.f6791OooO0o0[0] = solverVariable.f6825Oooo0oO;
                this.f6790OooO0o[0] = -1;
                solverVariable.f6833OoooOOo++;
                solverVariable.OooO00o(this.f6787OooO0O0);
                this.f6786OooO00o++;
                if (this.f6794OooOO0) {
                    return;
                }
                int i2 = this.f6785OooO + 1;
                this.f6785OooO = i2;
                int[] iArr = this.f6791OooO0o0;
                if (i2 >= iArr.length) {
                    this.f6794OooOO0 = true;
                    this.f6785OooO = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f6786OooO00o; i4++) {
                int[] iArr2 = this.f6791OooO0o0;
                int i5 = iArr2[i];
                int i6 = solverVariable.f6825Oooo0oO;
                if (i5 == i6) {
                    float[] fArr = this.f6792OooO0oO;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    }
                    fArr[i] = f2;
                    if (f2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        if (i == this.f6793OooO0oo) {
                            this.f6793OooO0oo = this.f6790OooO0o[i];
                        } else {
                            int[] iArr3 = this.f6790OooO0o;
                            iArr3[i3] = iArr3[i];
                        }
                        if (z) {
                            solverVariable.OooO0O0(this.f6787OooO0O0);
                        }
                        if (this.f6794OooOO0) {
                            this.f6785OooO = i;
                        }
                        solverVariable.f6833OoooOOo--;
                        this.f6786OooO00o--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i3 = i;
                }
                i = this.f6790OooO0o[i];
            }
            int length = this.f6785OooO;
            int i7 = length + 1;
            if (this.f6794OooOO0) {
                int[] iArr4 = this.f6791OooO0o0;
                if (iArr4[length] != -1) {
                    length = iArr4.length;
                }
            } else {
                length = i7;
            }
            int[] iArr5 = this.f6791OooO0o0;
            if (length >= iArr5.length && this.f6786OooO00o < iArr5.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr6 = this.f6791OooO0o0;
                    if (i8 >= iArr6.length) {
                        break;
                    }
                    if (iArr6[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr7 = this.f6791OooO0o0;
            if (length >= iArr7.length) {
                length = iArr7.length;
                int i9 = this.f6789OooO0Oo * 2;
                this.f6789OooO0Oo = i9;
                this.f6794OooOO0 = false;
                this.f6785OooO = length - 1;
                this.f6792OooO0oO = Arrays.copyOf(this.f6792OooO0oO, i9);
                this.f6791OooO0o0 = Arrays.copyOf(this.f6791OooO0o0, this.f6789OooO0Oo);
                this.f6790OooO0o = Arrays.copyOf(this.f6790OooO0o, this.f6789OooO0Oo);
            }
            this.f6791OooO0o0[length] = solverVariable.f6825Oooo0oO;
            this.f6792OooO0oO[length] = f;
            if (i3 != -1) {
                int[] iArr8 = this.f6790OooO0o;
                iArr8[length] = iArr8[i3];
                iArr8[i3] = length;
            } else {
                this.f6790OooO0o[length] = this.f6793OooO0oo;
                this.f6793OooO0oo = length;
            }
            solverVariable.f6833OoooOOo++;
            solverVariable.OooO00o(this.f6787OooO0O0);
            this.f6786OooO00o++;
            if (!this.f6794OooOO0) {
                this.f6785OooO++;
            }
            int i10 = this.f6785OooO;
            int[] iArr9 = this.f6791OooO0o0;
            if (i10 >= iArr9.length) {
                this.f6794OooOO0 = true;
                this.f6785OooO = iArr9.length - 1;
            }
        }
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final SolverVariable OooO0o0(int i) {
        int i2 = this.f6793OooO0oo;
        for (int i3 = 0; i2 != -1 && i3 < this.f6786OooO00o; i3++) {
            if (i3 == i) {
                return this.f6788OooO0OO.f27518OooO0OO[this.f6791OooO0o0[i2]];
            }
            i2 = this.f6790OooO0o[i2];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final void OooO0oO() {
        int i = this.f6793OooO0oo;
        for (int i2 = 0; i != -1 && i2 < this.f6786OooO00o; i2++) {
            float[] fArr = this.f6792OooO0oO;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f6790OooO0o[i];
        }
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final float OooO0oo(int i) {
        int i2 = this.f6793OooO0oo;
        for (int i3 = 0; i2 != -1 && i3 < this.f6786OooO00o; i3++) {
            if (i3 == i) {
                return this.f6792OooO0oO[i2];
            }
            i2 = this.f6790OooO0o[i2];
        }
        return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final float OooOO0(SolverVariable solverVariable) {
        int i = this.f6793OooO0oo;
        for (int i2 = 0; i != -1 && i2 < this.f6786OooO00o; i2++) {
            if (this.f6791OooO0o0[i] == solverVariable.f6825Oooo0oO) {
                return this.f6792OooO0oO[i];
            }
            i = this.f6790OooO0o[i];
        }
        return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final void OooOO0O(float f) {
        int i = this.f6793OooO0oo;
        for (int i2 = 0; i != -1 && i2 < this.f6786OooO00o; i2++) {
            float[] fArr = this.f6792OooO0oO;
            fArr[i] = fArr[i] / f;
            i = this.f6790OooO0o[i];
        }
    }

    @Override // androidx.constraintlayout.core.OooO0O0.OooO00o
    public final void clear() {
        int i = this.f6793OooO0oo;
        for (int i2 = 0; i != -1 && i2 < this.f6786OooO00o; i2++) {
            SolverVariable solverVariable = this.f6788OooO0OO.f27518OooO0OO[this.f6791OooO0o0[i]];
            if (solverVariable != null) {
                solverVariable.OooO0O0(this.f6787OooO0O0);
            }
            i = this.f6790OooO0o[i];
        }
        this.f6793OooO0oo = -1;
        this.f6785OooO = -1;
        this.f6794OooOO0 = false;
        this.f6786OooO00o = 0;
    }

    public final String toString() {
        int i = this.f6793OooO0oo;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f6786OooO00o; i2++) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(OooOo00.OooO0Oo(string, " -> "));
            sbOooO0o0.append(this.f6792OooO0oO[i]);
            sbOooO0o0.append(" : ");
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0(sbOooO0o0.toString());
            sbOooO0o1.append(this.f6788OooO0OO.f27518OooO0OO[this.f6791OooO0o0[i]]);
            string = sbOooO0o1.toString();
            i = this.f6790OooO0o[i];
        }
        return string;
    }
}
