package androidx.constraintlayout.core;

import com.zego.zegoavkit2.ZegoConstants;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Arrays;
import java.util.Comparator;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends androidx.constraintlayout.core.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO0O0 f6817OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public SolverVariable[] f6818OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public SolverVariable[] f6819OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f6820OooO0oo;

    public class OooO00o implements Comparator<SolverVariable> {
        @Override // java.util.Comparator
        public final int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.f6825Oooo0oO - solverVariable2.f6825Oooo0oO;
        }
    }

    public class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public SolverVariable f6821OooO00o;

        public OooO0O0() {
        }

        public final String toString() {
            String string = "[ ";
            if (this.f6821OooO00o != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(string);
                    sbOooO0o0.append(this.f6821OooO00o.f6827OoooO[i]);
                    sbOooO0o0.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                    string = sbOooO0o0.toString();
                }
            }
            StringBuilder sbOooO00o = Oooo0.OooO00o(string, "] ");
            sbOooO00o.append(this.f6821OooO00o);
            return sbOooO00o.toString();
        }
    }

    public OooO0o(o0000OOO.OooO00o oooO00o) {
        super(oooO00o);
        this.f6818OooO0o = new SolverVariable[128];
        this.f6819OooO0oO = new SolverVariable[128];
        this.f6820OooO0oo = 0;
        this.f6817OooO = new OooO0O0();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    @Override // androidx.constraintlayout.core.OooO0O0, androidx.constraintlayout.core.OooO0OO.OooO00o
    public final SolverVariable OooO00o(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f6820OooO0oo; i2++) {
            SolverVariable[] solverVariableArr = this.f6818OooO0o;
            SolverVariable solverVariable = solverVariableArr[i2];
            if (!zArr[solverVariable.f6825Oooo0oO]) {
                OooO0O0 oooO0O0 = this.f6817OooO;
                oooO0O0.f6821OooO00o = solverVariable;
                int i3 = 8;
                boolean z = true;
                if (i == -1) {
                    while (true) {
                        if (i3 >= 0) {
                            float f = oooO0O0.f6821OooO00o.f6827OoooO[i3];
                            if (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
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
                            float f2 = solverVariable2.f6827OoooO[i3];
                            float f3 = oooO0O0.f6821OooO00o.f6827OoooO[i3];
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
        return this.f6818OooO0o[i];
    }

    @Override // androidx.constraintlayout.core.OooO0O0
    public final boolean OooO0oO() {
        return this.f6820OooO0oo == 0;
    }

    @Override // androidx.constraintlayout.core.OooO0O0
    public final void OooOO0O(OooO0OO oooO0OO, androidx.constraintlayout.core.OooO0O0 oooO0O0, boolean z) {
        SolverVariable solverVariable = oooO0O0.f6795OooO00o;
        if (solverVariable == null) {
            return;
        }
        androidx.constraintlayout.core.OooO0O0.OooO00o oooO00o = oooO0O0.f6798OooO0Oo;
        int iOooO00o = oooO00o.OooO00o();
        for (int i = 0; i < iOooO00o; i++) {
            SolverVariable solverVariableOooO0o0 = oooO00o.OooO0o0(i);
            float fOooO0oo = oooO00o.OooO0oo(i);
            OooO0O0 oooO0O1 = this.f6817OooO;
            oooO0O1.f6821OooO00o = solverVariableOooO0o0;
            boolean z2 = true;
            if (solverVariableOooO0o0.f6824Oooo0o) {
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr = oooO0O1.f6821OooO00o.f6827OoooO;
                    fArr[i2] = (solverVariable.f6827OoooO[i2] * fOooO0oo) + fArr[i2];
                    if (Math.abs(fArr[i2]) < 1.0E-4f) {
                        oooO0O1.f6821OooO00o.f6827OoooO[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    OooO0o.this.OooOOO0(oooO0O1.f6821OooO00o);
                }
                z2 = false;
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f = solverVariable.f6827OoooO[i3];
                    if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        float f2 = f * fOooO0oo;
                        if (Math.abs(f2) < 1.0E-4f) {
                            f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        }
                        oooO0O1.f6821OooO00o.f6827OoooO[i3] = f2;
                    } else {
                        oooO0O1.f6821OooO00o.f6827OoooO[i3] = 0.0f;
                    }
                }
            }
            if (z2) {
                OooOO0o(solverVariableOooO0o0);
            }
            this.f6796OooO0O0 = (oooO0O0.f6796OooO0O0 * fOooO0oo) + this.f6796OooO0O0;
        }
        OooOOO0(solverVariable);
    }

    public final void OooOO0o(SolverVariable solverVariable) {
        int i;
        int i2 = this.f6820OooO0oo + 1;
        SolverVariable[] solverVariableArr = this.f6818OooO0o;
        if (i2 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f6818OooO0o = solverVariableArr2;
            this.f6819OooO0oO = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f6818OooO0o;
        int i3 = this.f6820OooO0oo;
        solverVariableArr3[i3] = solverVariable;
        int i4 = i3 + 1;
        this.f6820OooO0oo = i4;
        if (i4 > 1 && solverVariableArr3[i4 - 1].f6825Oooo0oO > solverVariable.f6825Oooo0oO) {
            int i5 = 0;
            while (true) {
                i = this.f6820OooO0oo;
                if (i5 >= i) {
                    break;
                }
                this.f6819OooO0oO[i5] = this.f6818OooO0o[i5];
                i5++;
            }
            Arrays.sort(this.f6819OooO0oO, 0, i, new OooO00o());
            for (int i6 = 0; i6 < this.f6820OooO0oo; i6++) {
                this.f6818OooO0o[i6] = this.f6819OooO0oO[i6];
            }
        }
        solverVariable.f6824Oooo0o = true;
        solverVariable.OooO00o(this);
    }

    public final void OooOOO0(SolverVariable solverVariable) {
        int i = 0;
        while (i < this.f6820OooO0oo) {
            if (this.f6818OooO0o[i] == solverVariable) {
                while (true) {
                    int i2 = this.f6820OooO0oo;
                    if (i >= i2 - 1) {
                        this.f6820OooO0oo = i2 - 1;
                        solverVariable.f6824Oooo0o = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.f6818OooO0o;
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
        StringBuilder sbOooO00o = Oooo0.OooO00o("", " goal -> (");
        sbOooO00o.append(this.f6796OooO0O0);
        sbOooO00o.append(") : ");
        String string = sbOooO00o.toString();
        for (int i = 0; i < this.f6820OooO0oo; i++) {
            this.f6817OooO.f6821OooO00o = this.f6818OooO0o[i];
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(string);
            sbOooO0o0.append(this.f6817OooO);
            sbOooO0o0.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            string = sbOooO0o0.toString();
        }
        return string;
    }
}
