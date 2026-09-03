package androidx.constraintlayout.core;

import com.zego.zegoavkit2.ZegoConstants;
import java.util.Arrays;
import java.util.Comparator;
import p037OoooOo0.o000Oo0;
import p039OoooOoo.o00OO;
import p644o0ooOoO.oO0000o0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends androidx.constraintlayout.core.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO0O0 f4250OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public SolverVariable[] f4251OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public SolverVariable[] f4252OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f4253OooO0oo;

    public class OooO00o implements Comparator<SolverVariable> {
        @Override // java.util.Comparator
        public final int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.f4259OooO0o0 - solverVariable2.f4259OooO0o0;
        }
    }

    public class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public SolverVariable f4254OooO00o;

        public OooO0O0() {
        }

        public final String toString() {
            String string = "[ ";
            if (this.f4254OooO00o != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder sbOooO00o = o00OO.OooO00o(string);
                    sbOooO00o.append(this.f4254OooO00o.f4263OooOO0O[i]);
                    sbOooO00o.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                    string = sbOooO00o.toString();
                }
            }
            StringBuilder sbOooO0O0 = o000Oo0.OooO0O0(string, "] ");
            sbOooO0O0.append(this.f4254OooO00o);
            return sbOooO0O0.toString();
        }
    }

    public OooO0o(oO0000o0 oo0000o0) {
        super(oo0000o0);
        this.f4251OooO0o = new SolverVariable[128];
        this.f4252OooO0oO = new SolverVariable[128];
        this.f4253OooO0oo = 0;
        this.f4250OooO = new OooO0O0();
    }

    @Override // androidx.constraintlayout.core.OooO0O0
    public final void OooO(OooO0OO oooO0OO, androidx.constraintlayout.core.OooO0O0 oooO0O0, boolean z) {
        boolean z2;
        SolverVariable solverVariable = oooO0O0.f4228OooO00o;
        if (solverVariable == null) {
            return;
        }
        androidx.constraintlayout.core.OooO0O0.OooO00o oooO00o = oooO0O0.f4231OooO0Oo;
        int iOooO0o = oooO00o.OooO0o();
        for (int i = 0; i < iOooO0o; i++) {
            SolverVariable solverVariableOooO0O0 = oooO00o.OooO0O0(i);
            float fOooO = oooO00o.OooO(i);
            OooO0O0 oooO0O1 = this.f4250OooO;
            oooO0O1.f4254OooO00o = solverVariableOooO0O0;
            boolean z3 = solverVariableOooO0O0.f4257OooO0Oo;
            float[] fArr = solverVariable.f4263OooOO0O;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = oooO0O1.f4254OooO00o.f4263OooOO0O;
                    float f = (fArr[i2] * fOooO) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        oooO0O1.f4254OooO00o.f4263OooOO0O[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    OooO0o.this.OooOO0O(oooO0O1.f4254OooO00o);
                }
                z2 = false;
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fOooO;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        oooO0O1.f4254OooO00o.f4263OooOO0O[i3] = f3;
                    } else {
                        oooO0O1.f4254OooO00o.f4263OooOO0O[i3] = 0.0f;
                    }
                }
                z2 = true;
            }
            if (z2) {
                OooOO0(solverVariableOooO0O0);
            }
            this.f4229OooO0O0 = (oooO0O0.f4229OooO0O0 * fOooO) + this.f4229OooO0O0;
        }
        OooOO0O(solverVariable);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    @Override // androidx.constraintlayout.core.OooO0O0, androidx.constraintlayout.core.OooO0OO.OooO00o
    public final SolverVariable OooO00o(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f4253OooO0oo; i2++) {
            SolverVariable[] solverVariableArr = this.f4251OooO0o;
            SolverVariable solverVariable = solverVariableArr[i2];
            if (!zArr[solverVariable.f4259OooO0o0]) {
                OooO0O0 oooO0O0 = this.f4250OooO;
                oooO0O0.f4254OooO00o = solverVariable;
                boolean z = true;
                int i3 = 8;
                if (i == -1) {
                    while (true) {
                        if (i3 >= 0) {
                            float f = oooO0O0.f4254OooO00o.f4263OooOO0O[i3];
                            if (f <= 0.0f) {
                                if (f < 0.0f) {
                                    break;
                                }
                                i3--;
                            }
                        }
                        z = false;
                        break;
                    }
                    if (z) {
                        i = i2;
                    }
                } else {
                    SolverVariable solverVariable2 = solverVariableArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = solverVariable2.f4263OooOO0O[i3];
                            float f3 = oooO0O0.f4254OooO00o.f4263OooOO0O[i3];
                            if (f3 != f2) {
                                if (f3 < f2) {
                                    break;
                                }
                                break;
                            }
                            i3--;
                        }
                        z = false;
                        break;
                    }
                    if (z) {
                        i = i2;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f4251OooO0o[i];
    }

    @Override // androidx.constraintlayout.core.OooO0O0
    public final boolean OooO0o0() {
        return this.f4253OooO0oo == 0;
    }

    public final void OooOO0(SolverVariable solverVariable) {
        int i;
        int i2 = this.f4253OooO0oo + 1;
        SolverVariable[] solverVariableArr = this.f4251OooO0o;
        if (i2 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f4251OooO0o = solverVariableArr2;
            this.f4252OooO0oO = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f4251OooO0o;
        int i3 = this.f4253OooO0oo;
        solverVariableArr3[i3] = solverVariable;
        int i4 = i3 + 1;
        this.f4253OooO0oo = i4;
        if (i4 > 1 && solverVariableArr3[i4 - 1].f4259OooO0o0 > solverVariable.f4259OooO0o0) {
            int i5 = 0;
            while (true) {
                i = this.f4253OooO0oo;
                if (i5 >= i) {
                    break;
                }
                this.f4252OooO0oO[i5] = this.f4251OooO0o[i5];
                i5++;
            }
            Arrays.sort(this.f4252OooO0oO, 0, i, new OooO00o());
            for (int i6 = 0; i6 < this.f4253OooO0oo; i6++) {
                this.f4251OooO0o[i6] = this.f4252OooO0oO[i6];
            }
        }
        solverVariable.f4257OooO0Oo = true;
        solverVariable.OooO00o(this);
    }

    public final void OooOO0O(SolverVariable solverVariable) {
        int i = 0;
        while (i < this.f4253OooO0oo) {
            if (this.f4251OooO0o[i] == solverVariable) {
                while (true) {
                    int i2 = this.f4253OooO0oo;
                    if (i >= i2 - 1) {
                        this.f4253OooO0oo = i2 - 1;
                        solverVariable.f4257OooO0Oo = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.f4251OooO0o;
                        int i3 = i + 1;
                        solverVariableArr[i] = solverVariableArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.OooO0O0
    public final String toString() {
        String str = " goal -> (" + this.f4229OooO0O0 + ") : ";
        for (int i = 0; i < this.f4253OooO0oo; i++) {
            SolverVariable solverVariable = this.f4251OooO0o[i];
            OooO0O0 oooO0O0 = this.f4250OooO;
            oooO0O0.f4254OooO00o = solverVariable;
            str = str + oooO0O0 + ZegoConstants.ZegoVideoDataAuxPublishingStream;
        }
        return str;
    }
}
