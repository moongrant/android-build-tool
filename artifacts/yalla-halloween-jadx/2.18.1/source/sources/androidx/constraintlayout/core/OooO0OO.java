package androidx.constraintlayout.core;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static boolean f6800OooOOOo = false;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static int f6801OooOOo0 = 1000;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO0o f6805OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO0O0[] f6807OooO0o;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o0000OOO.OooO00o f6813OooOO0o;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public OooO0O0 f6816OooOOOO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f6803OooO00o = false;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f6804OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f6806OooO0Oo = 32;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f6808OooO0o0 = 32;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f6809OooO0oO = false;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean[] f6810OooO0oo = new boolean[32];

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f6802OooO = 1;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f6811OooOO0 = 0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f6812OooOO0O = 32;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public SolverVariable[] f6815OooOOO0 = new SolverVariable[f6801OooOOo0];

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f6814OooOOO = 0;

    public interface OooO00o {
        SolverVariable OooO00o(boolean[] zArr);
    }

    public OooO0OO() {
        this.f6807OooO0o = null;
        this.f6807OooO0o = new OooO0O0[32];
        OooOo00();
        o0000OOO.OooO00o oooO00o = new o0000OOO.OooO00o();
        this.f6813OooOO0o = oooO00o;
        this.f6805OooO0OO = new OooO0o(oooO00o);
        this.f6816OooOOOO = new OooO0O0(oooO00o);
    }

    public final void OooO(OooO0O0 oooO0O0) {
        int i;
        if (oooO0O0.f6799OooO0o0) {
            oooO0O0.f6795OooO00o.OooO0o0(this, oooO0O0.f6796OooO0O0);
        } else {
            OooO0O0[] oooO0O0Arr = this.f6807OooO0o;
            int i2 = this.f6811OooOO0;
            oooO0O0Arr[i2] = oooO0O0;
            SolverVariable solverVariable = oooO0O0.f6795OooO00o;
            solverVariable.f6826Oooo0oo = i2;
            this.f6811OooOO0 = i2 + 1;
            solverVariable.OooO0o(this, oooO0O0);
        }
        if (this.f6803OooO00o) {
            int i3 = 0;
            while (i3 < this.f6811OooOO0) {
                if (this.f6807OooO0o[i3] == null) {
                    System.out.println("WTF");
                }
                OooO0O0[] oooO0O0Arr2 = this.f6807OooO0o;
                if (oooO0O0Arr2[i3] != null && oooO0O0Arr2[i3].f6799OooO0o0) {
                    OooO0O0 oooO0O1 = oooO0O0Arr2[i3];
                    oooO0O1.f6795OooO00o.OooO0o0(this, oooO0O1.f6796OooO0O0);
                    this.f6813OooOO0o.f27516OooO00o.OooO0O0(oooO0O1);
                    this.f6807OooO0o[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f6811OooOO0;
                        if (i4 >= i) {
                            break;
                        }
                        OooO0O0[] oooO0O0Arr3 = this.f6807OooO0o;
                        int i6 = i4 - 1;
                        oooO0O0Arr3[i6] = oooO0O0Arr3[i4];
                        if (oooO0O0Arr3[i6].f6795OooO00o.f6826Oooo0oo == i4) {
                            oooO0O0Arr3[i6].f6795OooO00o.f6826Oooo0oo = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f6807OooO0o[i5] = null;
                    }
                    this.f6811OooOO0 = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f6803OooO00o = false;
        }
    }

    public final SolverVariable OooO00o(SolverVariable.Type type, String str) {
        SolverVariable solverVariable = (SolverVariable) this.f6813OooOO0o.f27517OooO0O0.OooO00o();
        if (solverVariable == null) {
            solverVariable = new SolverVariable(type);
            solverVariable.f6831OoooOO0 = type;
        } else {
            solverVariable.OooO0Oo();
            solverVariable.f6831OoooOO0 = type;
        }
        int i = this.f6814OooOOO;
        int i2 = f6801OooOOo0;
        if (i >= i2) {
            int i3 = i2 * 2;
            f6801OooOOo0 = i3;
            this.f6815OooOOO0 = (SolverVariable[]) Arrays.copyOf(this.f6815OooOOO0, i3);
        }
        SolverVariable[] solverVariableArr = this.f6815OooOOO0;
        int i4 = this.f6814OooOOO;
        this.f6814OooOOO = i4 + 1;
        solverVariableArr[i4] = solverVariable;
        return solverVariable;
    }

    public final void OooO0O0(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2, int i3) {
        OooO0O0 oooO0O0OooOOO0 = OooOOO0();
        if (solverVariable2 == solverVariable3) {
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable, 1.0f);
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable4, 1.0f);
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable2, -2.0f);
        } else if (f == 0.5f) {
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable, 1.0f);
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable2, -1.0f);
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable3, -1.0f);
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                oooO0O0OooOOO0.f6796OooO0O0 = (-i) + i2;
            }
        } else if (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable, -1.0f);
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable2, 1.0f);
            oooO0O0OooOOO0.f6796OooO0O0 = i;
        } else if (f >= 1.0f) {
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable4, -1.0f);
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable3, 1.0f);
            oooO0O0OooOOO0.f6796OooO0O0 = -i2;
        } else {
            float f2 = 1.0f - f;
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable, f2 * 1.0f);
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable2, f2 * (-1.0f));
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable3, (-1.0f) * f);
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                oooO0O0OooOOO0.f6796OooO0O0 = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            oooO0O0OooOOO0.OooO0O0(this, i3);
        }
        OooO0OO(oooO0O0OooOOO0);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f8  */
    public final void OooO0OO(OooO0O0 oooO0O0) {
        boolean z;
        boolean z2;
        boolean z3;
        SolverVariable solverVariableOooO0oo;
        boolean z4 = true;
        if (this.f6811OooOO0 + 1 >= this.f6812OooOO0O || this.f6802OooO + 1 >= this.f6808OooO0o0) {
            OooOOOo();
        }
        if (oooO0O0.f6799OooO0o0) {
            z = false;
        } else {
            if (this.f6807OooO0o.length != 0) {
                boolean z5 = false;
                while (!z5) {
                    int iOooO00o = oooO0O0.f6798OooO0Oo.OooO00o();
                    for (int i = 0; i < iOooO00o; i++) {
                        SolverVariable solverVariableOooO0o0 = oooO0O0.f6798OooO0Oo.OooO0o0(i);
                        if (solverVariableOooO0o0.f6826Oooo0oo != -1 || solverVariableOooO0o0.f6828OoooO0) {
                            oooO0O0.f6797OooO0OO.add(solverVariableOooO0o0);
                        }
                    }
                    int size = oooO0O0.f6797OooO0OO.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            SolverVariable solverVariable = oooO0O0.f6797OooO0OO.get(i2);
                            if (solverVariable.f6828OoooO0) {
                                oooO0O0.OooOO0(this, solverVariable, true);
                            } else {
                                oooO0O0.OooOO0O(this, this.f6807OooO0o[solverVariable.f6826Oooo0oo], true);
                            }
                        }
                        oooO0O0.f6797OooO0OO.clear();
                    } else {
                        z5 = true;
                    }
                }
                if (oooO0O0.f6795OooO00o != null && oooO0O0.f6798OooO0Oo.OooO00o() == 0) {
                    oooO0O0.f6799OooO0o0 = true;
                    this.f6803OooO00o = true;
                }
            }
            if (oooO0O0.OooO0oO()) {
                return;
            }
            float f = oooO0O0.f6796OooO0O0;
            if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                oooO0O0.f6796OooO0O0 = f * (-1.0f);
                oooO0O0.f6798OooO0Oo.OooO0oO();
            }
            int iOooO00o2 = oooO0O0.f6798OooO0Oo.OooO00o();
            SolverVariable solverVariable2 = null;
            SolverVariable solverVariable3 = null;
            float f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            boolean z6 = false;
            float f3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            boolean z7 = false;
            for (int i3 = 0; i3 < iOooO00o2; i3++) {
                float fOooO0oo = oooO0O0.f6798OooO0Oo.OooO0oo(i3);
                SolverVariable solverVariableOooO0o1 = oooO0O0.f6798OooO0Oo.OooO0o0(i3);
                if (solverVariableOooO0o1.f6831OoooOO0 == SolverVariable.Type.UNRESTRICTED) {
                    if (solverVariable2 == null) {
                        if (solverVariableOooO0o1.f6833OoooOOo <= 1) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        solverVariable2 = solverVariableOooO0o1;
                        f2 = fOooO0oo;
                    } else if (f2 > fOooO0oo) {
                        if (solverVariableOooO0o1.f6833OoooOOo <= 1) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        solverVariable2 = solverVariableOooO0o1;
                        f2 = fOooO0oo;
                    } else if (!z6) {
                        if (solverVariableOooO0o1.f6833OoooOOo <= 1) {
                            solverVariable2 = solverVariableOooO0o1;
                            f2 = fOooO0oo;
                            z6 = true;
                        }
                    }
                } else if (solverVariable2 == null && fOooO0oo < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    if (solverVariable3 == null) {
                        if (solverVariableOooO0o1.f6833OoooOOo <= 1) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        solverVariable3 = solverVariableOooO0o1;
                        f3 = fOooO0oo;
                    } else if (f3 > fOooO0oo) {
                        if (solverVariableOooO0o1.f6833OoooOOo <= 1) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        solverVariable3 = solverVariableOooO0o1;
                        f3 = fOooO0oo;
                    } else if (!z7) {
                        if (solverVariableOooO0o1.f6833OoooOOo <= 1) {
                            solverVariable3 = solverVariableOooO0o1;
                            f3 = fOooO0oo;
                            z7 = true;
                        }
                    }
                }
            }
            if (solverVariable2 == null) {
                solverVariable2 = solverVariable3;
            }
            if (solverVariable2 == null) {
                z2 = true;
            } else {
                oooO0O0.OooO(solverVariable2);
                z2 = false;
            }
            if (oooO0O0.f6798OooO0Oo.OooO00o() == 0) {
                oooO0O0.f6799OooO0o0 = true;
            }
            if (z2) {
                if (this.f6802OooO + 1 >= this.f6808OooO0o0) {
                    OooOOOo();
                }
                SolverVariable solverVariableOooO00o = OooO00o(SolverVariable.Type.SLACK, null);
                int i4 = this.f6804OooO0O0 + 1;
                this.f6804OooO0O0 = i4;
                this.f6802OooO++;
                solverVariableOooO00o.f6825Oooo0oO = i4;
                this.f6813OooOO0o.f27518OooO0OO[i4] = solverVariableOooO00o;
                oooO0O0.f6795OooO00o = solverVariableOooO00o;
                int i5 = this.f6811OooOO0;
                OooO(oooO0O0);
                if (this.f6811OooOO0 == i5 + 1) {
                    OooO0O0 oooO0O1 = this.f6816OooOOOO;
                    Objects.requireNonNull(oooO0O1);
                    oooO0O1.f6795OooO00o = null;
                    oooO0O1.f6798OooO0Oo.clear();
                    for (int i6 = 0; i6 < oooO0O0.f6798OooO0Oo.OooO00o(); i6++) {
                        oooO0O1.f6798OooO0Oo.OooO0o(oooO0O0.f6798OooO0Oo.OooO0o0(i6), oooO0O0.f6798OooO0Oo.OooO0oo(i6), true);
                    }
                    OooOOoo(this.f6816OooOOOO);
                    if (solverVariableOooO00o.f6826Oooo0oo == -1) {
                        if (oooO0O0.f6795OooO00o == solverVariableOooO00o && (solverVariableOooO0oo = oooO0O0.OooO0oo(null, solverVariableOooO00o)) != null) {
                            oooO0O0.OooO(solverVariableOooO0oo);
                        }
                        if (!oooO0O0.f6799OooO0o0) {
                            oooO0O0.f6795OooO00o.OooO0o(this, oooO0O0);
                        }
                        this.f6813OooOO0o.f27516OooO00o.OooO0O0(oooO0O0);
                        this.f6811OooOO0--;
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            SolverVariable solverVariable4 = oooO0O0.f6795OooO00o;
            if (solverVariable4 == null || (solverVariable4.f6831OoooOO0 != SolverVariable.Type.UNRESTRICTED && oooO0O0.f6796OooO0O0 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
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
        OooO(oooO0O0);
    }

    public final OooO0O0 OooO0Oo(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        if (i2 == 8 && solverVariable2.f6828OoooO0 && solverVariable.f6826Oooo0oo == -1) {
            solverVariable.OooO0o0(this, solverVariable2.f6829OoooO00 + i);
            return null;
        }
        OooO0O0 oooO0O0OooOOO0 = OooOOO0();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            oooO0O0OooOOO0.f6796OooO0O0 = i;
        }
        if (z) {
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable, 1.0f);
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable2, -1.0f);
        } else {
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable, -1.0f);
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(solverVariable2, 1.0f);
        }
        if (i2 != 8) {
            oooO0O0OooOOO0.OooO0O0(this, i2);
        }
        OooO0OO(oooO0O0OooOOO0);
        return oooO0O0OooOOO0;
    }

    public final void OooO0o(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        OooO0O0 oooO0O0OooOOO0 = OooOOO0();
        SolverVariable solverVariableOooOOO = OooOOO();
        solverVariableOooOOO.f6823Oooo = 0;
        oooO0O0OooOOO0.OooO0Oo(solverVariable, solverVariable2, solverVariableOooOOO, i);
        if (i2 != 8) {
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(OooOO0O(i2, null), (int) (oooO0O0OooOOO0.f6798OooO0Oo.OooOO0(solverVariableOooOOO) * (-1.0f)));
        }
        OooO0OO(oooO0O0OooOOO0);
    }

    public final void OooO0o0(SolverVariable solverVariable, int i) {
        int i2 = solverVariable.f6826Oooo0oo;
        if (i2 == -1) {
            solverVariable.OooO0o0(this, i);
            for (int i3 = 0; i3 < this.f6804OooO0O0 + 1; i3++) {
                SolverVariable solverVariable2 = this.f6813OooOO0o.f27518OooO0OO[i3];
            }
            return;
        }
        if (i2 == -1) {
            OooO0O0 oooO0O0OooOOO0 = OooOOO0();
            oooO0O0OooOOO0.f6795OooO00o = solverVariable;
            float f = i;
            solverVariable.f6829OoooO00 = f;
            oooO0O0OooOOO0.f6796OooO0O0 = f;
            oooO0O0OooOOO0.f6799OooO0o0 = true;
            OooO0OO(oooO0O0OooOOO0);
            return;
        }
        OooO0O0 oooO0O0 = this.f6807OooO0o[i2];
        if (oooO0O0.f6799OooO0o0) {
            oooO0O0.f6796OooO0O0 = i;
            return;
        }
        if (oooO0O0.f6798OooO0Oo.OooO00o() == 0) {
            oooO0O0.f6799OooO0o0 = true;
            oooO0O0.f6796OooO0O0 = i;
            return;
        }
        OooO0O0 oooO0O0OooOOO1 = OooOOO0();
        if (i < 0) {
            oooO0O0OooOOO1.f6796OooO0O0 = i * (-1);
            oooO0O0OooOOO1.f6798OooO0Oo.OooO0Oo(solverVariable, 1.0f);
        } else {
            oooO0O0OooOOO1.f6796OooO0O0 = i;
            oooO0O0OooOOO1.f6798OooO0Oo.OooO0Oo(solverVariable, -1.0f);
        }
        OooO0OO(oooO0O0OooOOO1);
    }

    public final void OooO0oO(SolverVariable solverVariable, SolverVariable solverVariable2, int i, int i2) {
        OooO0O0 oooO0O0OooOOO0 = OooOOO0();
        SolverVariable solverVariableOooOOO = OooOOO();
        solverVariableOooOOO.f6823Oooo = 0;
        oooO0O0OooOOO0.OooO0o0(solverVariable, solverVariable2, solverVariableOooOOO, i);
        if (i2 != 8) {
            oooO0O0OooOOO0.f6798OooO0Oo.OooO0Oo(OooOO0O(i2, null), (int) (oooO0O0OooOOO0.f6798OooO0Oo.OooOO0(solverVariableOooOOO) * (-1.0f)));
        }
        OooO0OO(oooO0O0OooOOO0);
    }

    public final void OooO0oo(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        OooO0O0 oooO0O0OooOOO0 = OooOOO0();
        oooO0O0OooOOO0.OooO0OO(solverVariable, solverVariable2, solverVariable3, solverVariable4, f);
        OooO0OO(oooO0O0OooOOO0);
    }

    public final void OooOO0() {
        for (int i = 0; i < this.f6811OooOO0; i++) {
            OooO0O0 oooO0O0 = this.f6807OooO0o[i];
            oooO0O0.f6795OooO00o.f6829OoooO00 = oooO0O0.f6796OooO0O0;
        }
    }

    public final SolverVariable OooOO0O(int i, String str) {
        if (this.f6802OooO + 1 >= this.f6808OooO0o0) {
            OooOOOo();
        }
        SolverVariable solverVariableOooO00o = OooO00o(SolverVariable.Type.ERROR, str);
        int i2 = this.f6804OooO0O0 + 1;
        this.f6804OooO0O0 = i2;
        this.f6802OooO++;
        solverVariableOooO00o.f6825Oooo0oO = i2;
        solverVariableOooO00o.f6823Oooo = i;
        this.f6813OooOO0o.f27518OooO0OO[i2] = solverVariableOooO00o;
        OooO0o oooO0o = this.f6805OooO0OO;
        oooO0o.f6817OooO.f6821OooO00o = solverVariableOooO00o;
        Arrays.fill(solverVariableOooO00o.f6827OoooO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        solverVariableOooO00o.f6827OoooO[solverVariableOooO00o.f6823Oooo] = 1.0f;
        oooO0o.OooOO0o(solverVariableOooO00o);
        return solverVariableOooO00o;
    }

    public final SolverVariable OooOO0o(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f6802OooO + 1 >= this.f6808OooO0o0) {
            OooOOOo();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.f6890OooO;
            if (solverVariable == null) {
                constraintAnchor.OooOO0o();
                solverVariable = constraintAnchor.f6890OooO;
            }
            int i = solverVariable.f6825Oooo0oO;
            if (i == -1 || i > this.f6804OooO0O0 || this.f6813OooOO0o.f27518OooO0OO[i] == null) {
                if (i != -1) {
                    solverVariable.OooO0Oo();
                }
                int i2 = this.f6804OooO0O0 + 1;
                this.f6804OooO0O0 = i2;
                this.f6802OooO++;
                solverVariable.f6825Oooo0oO = i2;
                solverVariable.f6831OoooOO0 = SolverVariable.Type.UNRESTRICTED;
                this.f6813OooOO0o.f27518OooO0OO[i2] = solverVariable;
            }
        }
        return solverVariable;
    }

    public final SolverVariable OooOOO() {
        if (this.f6802OooO + 1 >= this.f6808OooO0o0) {
            OooOOOo();
        }
        SolverVariable solverVariableOooO00o = OooO00o(SolverVariable.Type.SLACK, null);
        int i = this.f6804OooO0O0 + 1;
        this.f6804OooO0O0 = i;
        this.f6802OooO++;
        solverVariableOooO00o.f6825Oooo0oO = i;
        this.f6813OooOO0o.f27518OooO0OO[i] = solverVariableOooO00o;
        return solverVariableOooO00o;
    }

    public final OooO0O0 OooOOO0() {
        OooO0O0 oooO0O0 = (OooO0O0) this.f6813OooOO0o.f27516OooO00o.OooO00o();
        if (oooO0O0 == null) {
            return new OooO0O0(this.f6813OooOO0o);
        }
        oooO0O0.f6795OooO00o = null;
        oooO0O0.f6798OooO0Oo.clear();
        oooO0O0.f6796OooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        oooO0O0.f6799OooO0o0 = false;
        return oooO0O0;
    }

    public final int OooOOOO(Object obj) {
        SolverVariable solverVariable = ((ConstraintAnchor) obj).f6890OooO;
        if (solverVariable != null) {
            return (int) (solverVariable.f6829OoooO00 + 0.5f);
        }
        return 0;
    }

    public final void OooOOOo() {
        int i = this.f6806OooO0Oo * 2;
        this.f6806OooO0Oo = i;
        this.f6807OooO0o = (OooO0O0[]) Arrays.copyOf(this.f6807OooO0o, i);
        o0000OOO.OooO00o oooO00o = this.f6813OooOO0o;
        oooO00o.f27518OooO0OO = (SolverVariable[]) Arrays.copyOf(oooO00o.f27518OooO0OO, this.f6806OooO0Oo);
        int i2 = this.f6806OooO0Oo;
        this.f6810OooO0oo = new boolean[i2];
        this.f6808OooO0o0 = i2;
        this.f6812OooOO0O = i2;
    }

    public final void OooOOo(OooO00o oooO00o) throws Exception {
        float f;
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            int i3 = this.f6811OooOO0;
            f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            i = 1;
            if (i2 >= i3) {
                z = false;
                break;
            }
            OooO0O0[] oooO0O0Arr = this.f6807OooO0o;
            if (oooO0O0Arr[i2].f6795OooO00o.f6831OoooOO0 != SolverVariable.Type.UNRESTRICTED && oooO0O0Arr[i2].f6796OooO0O0 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            int i4 = 0;
            while (!z2) {
                i4 += i;
                float f2 = Float.MAX_VALUE;
                int i5 = 0;
                int i6 = -1;
                int i7 = -1;
                int i8 = 0;
                while (i5 < this.f6811OooOO0) {
                    OooO0O0 oooO0O0 = this.f6807OooO0o[i5];
                    if (oooO0O0.f6795OooO00o.f6831OoooOO0 != SolverVariable.Type.UNRESTRICTED && !oooO0O0.f6799OooO0o0 && oooO0O0.f6796OooO0O0 < f) {
                        int iOooO00o = oooO0O0.f6798OooO0Oo.OooO00o();
                        int i9 = 0;
                        while (i9 < iOooO00o) {
                            SolverVariable solverVariableOooO0o0 = oooO0O0.f6798OooO0Oo.OooO0o0(i9);
                            float fOooOO0 = oooO0O0.f6798OooO0Oo.OooOO0(solverVariableOooO0o0);
                            if (fOooOO0 > f) {
                                for (int i10 = 0; i10 < 9; i10++) {
                                    float f3 = solverVariableOooO0o0.f6830OoooO0O[i10] / fOooOO0;
                                    if ((f3 < f2 && i10 == i8) || i10 > i8) {
                                        i7 = solverVariableOooO0o0.f6825Oooo0oO;
                                        i8 = i10;
                                        f2 = f3;
                                        i6 = i5;
                                    }
                                }
                            }
                            i9++;
                            f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        }
                    }
                    i5++;
                    f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                }
                if (i6 != -1) {
                    OooO0O0 oooO0O1 = this.f6807OooO0o[i6];
                    oooO0O1.f6795OooO00o.f6826Oooo0oo = -1;
                    oooO0O1.OooO(this.f6813OooOO0o.f27518OooO0OO[i7]);
                    SolverVariable solverVariable = oooO0O1.f6795OooO00o;
                    solverVariable.f6826Oooo0oo = i6;
                    solverVariable.OooO0o(this, oooO0O1);
                } else {
                    z2 = true;
                }
                if (i4 > this.f6802OooO / 2) {
                    z2 = true;
                }
                f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                i = 1;
            }
        }
        OooOOoo(oooO00o);
        OooOO0();
    }

    public final void OooOOo0() throws Exception {
        OooO0o oooO0o = this.f6805OooO0OO;
        boolean z = false;
        if (oooO0o.f6820OooO0oo == 0) {
            OooOO0();
            return;
        }
        if (!this.f6809OooO0oO) {
            OooOOo(oooO0o);
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.f6811OooOO0) {
                z = true;
                break;
            } else if (!this.f6807OooO0o[i].f6799OooO0o0) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            OooOO0();
        } else {
            OooOOo(this.f6805OooO0OO);
        }
    }

    public final int OooOOoo(OooO00o oooO00o) {
        for (int i = 0; i < this.f6802OooO; i++) {
            this.f6810OooO0oo[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.f6802OooO * 2) {
                return i2;
            }
            SolverVariable solverVariable = ((OooO0O0) oooO00o).f6795OooO00o;
            if (solverVariable != null) {
                this.f6810OooO0oo[solverVariable.f6825Oooo0oO] = true;
            }
            SolverVariable solverVariableOooO00o = oooO00o.OooO00o(this.f6810OooO0oo);
            if (solverVariableOooO00o != null) {
                boolean[] zArr = this.f6810OooO0oo;
                int i3 = solverVariableOooO00o.f6825Oooo0oO;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (solverVariableOooO00o != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f6811OooOO0; i5++) {
                    OooO0O0 oooO0O0 = this.f6807OooO0o[i5];
                    if (oooO0O0.f6795OooO00o.f6831OoooOO0 != SolverVariable.Type.UNRESTRICTED && !oooO0O0.f6799OooO0o0 && oooO0O0.f6798OooO0Oo.OooO0O0(solverVariableOooO00o)) {
                        float fOooOO0 = oooO0O0.f6798OooO0Oo.OooOO0(solverVariableOooO00o);
                        if (fOooOO0 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            float f2 = (-oooO0O0.f6796OooO0O0) / fOooOO0;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    OooO0O0 oooO0O1 = this.f6807OooO0o[i4];
                    oooO0O1.f6795OooO00o.f6826Oooo0oo = -1;
                    oooO0O1.OooO(solverVariableOooO00o);
                    SolverVariable solverVariable2 = oooO0O1.f6795OooO00o;
                    solverVariable2.f6826Oooo0oo = i4;
                    solverVariable2.OooO0o(this, oooO0O1);
                }
            } else {
                z = true;
            }
        }
        return i2;
    }

    public final void OooOo0() {
        o0000OOO.OooO00o oooO00o;
        int i = 0;
        while (true) {
            oooO00o = this.f6813OooOO0o;
            SolverVariable[] solverVariableArr = oooO00o.f27518OooO0OO;
            if (i >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i];
            if (solverVariable != null) {
                solverVariable.OooO0Oo();
            }
            i++;
        }
        o0000OOO.OooO0OO oooO0OO = oooO00o.f27517OooO0O0;
        SolverVariable[] solverVariableArr2 = this.f6815OooOOO0;
        int length = this.f6814OooOOO;
        Objects.requireNonNull(oooO0OO);
        if (length > solverVariableArr2.length) {
            length = solverVariableArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            SolverVariable solverVariable2 = solverVariableArr2[i2];
            int i3 = oooO0OO.f27520OooO0O0;
            Object[] objArr = oooO0OO.f27519OooO00o;
            if (i3 < objArr.length) {
                objArr[i3] = solverVariable2;
                oooO0OO.f27520OooO0O0 = i3 + 1;
            }
        }
        this.f6814OooOOO = 0;
        Arrays.fill(this.f6813OooOO0o.f27518OooO0OO, (Object) null);
        this.f6804OooO0O0 = 0;
        OooO0o oooO0o = this.f6805OooO0OO;
        oooO0o.f6820OooO0oo = 0;
        oooO0o.f6796OooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f6802OooO = 1;
        for (int i4 = 0; i4 < this.f6811OooOO0; i4++) {
            OooO0O0[] oooO0O0Arr = this.f6807OooO0o;
            if (oooO0O0Arr[i4] != null) {
                Objects.requireNonNull(oooO0O0Arr[i4]);
            }
        }
        OooOo00();
        this.f6811OooOO0 = 0;
        this.f6816OooOOOO = new OooO0O0(this.f6813OooOO0o);
    }

    public final void OooOo00() {
        for (int i = 0; i < this.f6811OooOO0; i++) {
            OooO0O0 oooO0O0 = this.f6807OooO0o[i];
            if (oooO0O0 != null) {
                this.f6813OooOO0o.f27516OooO00o.OooO0O0(oooO0O0);
            }
            this.f6807OooO0o[i] = null;
        }
    }
}
