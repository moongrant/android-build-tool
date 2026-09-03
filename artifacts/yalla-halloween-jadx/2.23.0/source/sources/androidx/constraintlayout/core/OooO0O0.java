package androidx.constraintlayout.core;

import androidx.camera.core.impl.OooOOOO;
import com.facebook.appevents.AppEventsConstants;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import p039OoooOoo.o00OO;
import p644o0ooOoO.oO0000o0;

/* JADX INFO: loaded from: classes.dex */
public class OooO0O0 implements OooO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO00o f4231OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public SolverVariable f4228OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f4229OooO0O0 = 0.0f;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList<SolverVariable> f4230OooO0OO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f4232OooO0o0 = false;

    public interface OooO00o {
        float OooO(int i);

        boolean OooO00o(SolverVariable solverVariable);

        SolverVariable OooO0O0(int i);

        void OooO0OO(SolverVariable solverVariable, float f, boolean z);

        void OooO0Oo();

        int OooO0o();

        float OooO0o0(SolverVariable solverVariable, boolean z);

        float OooO0oO(OooO0O0 oooO0O0, boolean z);

        void OooO0oo(SolverVariable solverVariable, float f);

        float OooOO0(SolverVariable solverVariable);

        void OooOO0O(float f);

        void clear();
    }

    public OooO0O0() {
    }

    public void OooO(OooO0OO oooO0OO, OooO0O0 oooO0O0, boolean z) {
        float fOooO0oO = this.f4231OooO0Oo.OooO0oO(oooO0O0, z);
        this.f4229OooO0O0 = (oooO0O0.f4229OooO0O0 * fOooO0oO) + this.f4229OooO0O0;
        if (z) {
            oooO0O0.f4228OooO00o.OooO0O0(this);
        }
        if (this.f4228OooO00o == null || this.f4231OooO0Oo.OooO0o() != 0) {
            return;
        }
        this.f4232OooO0o0 = true;
        oooO0OO.f4236OooO00o = true;
    }

    @Override // androidx.constraintlayout.core.OooO0OO.OooO00o
    public SolverVariable OooO00o(boolean[] zArr) {
        return OooO0o(zArr, null);
    }

    public final void OooO0O0(OooO0OO oooO0OO, int i) {
        this.f4231OooO0Oo.OooO0oo(oooO0OO.OooOO0(i), 1.0f);
        this.f4231OooO0Oo.OooO0oo(oooO0OO.OooOO0(i), -1.0f);
    }

    public final void OooO0OO(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f4229OooO0O0 = i;
        }
        if (z) {
            this.f4231OooO0Oo.OooO0oo(solverVariable, 1.0f);
            this.f4231OooO0Oo.OooO0oo(solverVariable2, -1.0f);
            this.f4231OooO0Oo.OooO0oo(solverVariable3, -1.0f);
        } else {
            this.f4231OooO0Oo.OooO0oo(solverVariable, -1.0f);
            this.f4231OooO0Oo.OooO0oo(solverVariable2, 1.0f);
            this.f4231OooO0Oo.OooO0oo(solverVariable3, 1.0f);
        }
    }

    public final void OooO0Oo(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f4229OooO0O0 = i;
        }
        if (z) {
            this.f4231OooO0Oo.OooO0oo(solverVariable, 1.0f);
            this.f4231OooO0Oo.OooO0oo(solverVariable2, -1.0f);
            this.f4231OooO0Oo.OooO0oo(solverVariable3, 1.0f);
        } else {
            this.f4231OooO0Oo.OooO0oo(solverVariable, -1.0f);
            this.f4231OooO0Oo.OooO0oo(solverVariable2, 1.0f);
            this.f4231OooO0Oo.OooO0oo(solverVariable3, -1.0f);
        }
    }

    public final SolverVariable OooO0o(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int iOooO0o = this.f4231OooO0Oo.OooO0o();
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        for (int i = 0; i < iOooO0o; i++) {
            float fOooO = this.f4231OooO0Oo.OooO(i);
            if (fOooO < 0.0f) {
                SolverVariable solverVariableOooO0O0 = this.f4231OooO0Oo.OooO0O0(i);
                if ((zArr == null || !zArr[solverVariableOooO0O0.f4259OooO0o0]) && solverVariableOooO0O0 != solverVariable && (((type = solverVariableOooO0O0.f4264OooOO0o) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && fOooO < f)) {
                    f = fOooO;
                    solverVariable2 = solverVariableOooO0O0;
                }
            }
        }
        return solverVariable2;
    }

    public boolean OooO0o0() {
        return this.f4228OooO00o == null && this.f4229OooO0O0 == 0.0f && this.f4231OooO0Oo.OooO0o() == 0;
    }

    public final void OooO0oO(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f4228OooO00o;
        if (solverVariable2 != null) {
            this.f4231OooO0Oo.OooO0oo(solverVariable2, -1.0f);
            this.f4228OooO00o.f4258OooO0o = -1;
            this.f4228OooO00o = null;
        }
        float fOooO0o0 = this.f4231OooO0Oo.OooO0o0(solverVariable, true) * (-1.0f);
        this.f4228OooO00o = solverVariable;
        if (fOooO0o0 == 1.0f) {
            return;
        }
        this.f4229OooO0O0 /= fOooO0o0;
        this.f4231OooO0Oo.OooOO0O(fOooO0o0);
    }

    public final void OooO0oo(OooO0OO oooO0OO, SolverVariable solverVariable, boolean z) {
        if (solverVariable == null || !solverVariable.f4256OooO) {
            return;
        }
        float fOooOO0 = this.f4231OooO0Oo.OooOO0(solverVariable);
        this.f4229OooO0O0 = (solverVariable.f4261OooO0oo * fOooOO0) + this.f4229OooO0O0;
        this.f4231OooO0Oo.OooO0o0(solverVariable, z);
        if (z) {
            solverVariable.OooO0O0(this);
        }
        if (this.f4231OooO0Oo.OooO0o() == 0) {
            this.f4232OooO0o0 = true;
            oooO0OO.f4236OooO00o = true;
        }
    }

    public String toString() {
        boolean z;
        String strOooO00o = OooOOOO.OooO00o(this.f4228OooO00o == null ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "" + this.f4228OooO00o, " = ");
        if (this.f4229OooO0O0 != 0.0f) {
            StringBuilder sbOooO00o = o00OO.OooO00o(strOooO00o);
            sbOooO00o.append(this.f4229OooO0O0);
            strOooO00o = sbOooO00o.toString();
            z = true;
        } else {
            z = false;
        }
        int iOooO0o = this.f4231OooO0Oo.OooO0o();
        for (int i = 0; i < iOooO0o; i++) {
            SolverVariable solverVariableOooO0O0 = this.f4231OooO0Oo.OooO0O0(i);
            if (solverVariableOooO0O0 != null) {
                float fOooO = this.f4231OooO0Oo.OooO(i);
                if (fOooO != 0.0f) {
                    String string = solverVariableOooO0O0.toString();
                    if (z) {
                        if (fOooO > 0.0f) {
                            strOooO00o = OooOOOO.OooO00o(strOooO00o, " + ");
                        } else {
                            strOooO00o = OooOOOO.OooO00o(strOooO00o, " - ");
                            fOooO *= -1.0f;
                        }
                    } else if (fOooO < 0.0f) {
                        strOooO00o = OooOOOO.OooO00o(strOooO00o, "- ");
                        fOooO *= -1.0f;
                    }
                    strOooO00o = fOooO == 1.0f ? OooOOOO.OooO00o(strOooO00o, string) : strOooO00o + fOooO + ZegoConstants.ZegoVideoDataAuxPublishingStream + string;
                    z = true;
                }
            }
        }
        return !z ? OooOOOO.OooO00o(strOooO00o, "0.0") : strOooO00o;
    }

    public OooO0O0(oO0000o0 oo0000o0) {
        this.f4231OooO0Oo = new androidx.constraintlayout.core.OooO00o(this, oo0000o0);
    }
}
