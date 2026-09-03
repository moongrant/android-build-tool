package androidx.constraintlayout.core;

import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.UserDataStore;
import com.zego.zegoavkit2.ZegoConstants;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public class OooO0O0 implements OooO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO00o f6798OooO0Oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public SolverVariable f6795OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public float f6796OooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ArrayList<SolverVariable> f6797OooO0OO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f6799OooO0o0 = false;

    public interface OooO00o {
        float OooO(SolverVariable solverVariable, boolean z);

        int OooO00o();

        boolean OooO0O0(SolverVariable solverVariable);

        float OooO0OO(OooO0O0 oooO0O0, boolean z);

        void OooO0Oo(SolverVariable solverVariable, float f);

        void OooO0o(SolverVariable solverVariable, float f, boolean z);

        SolverVariable OooO0o0(int i);

        void OooO0oO();

        float OooO0oo(int i);

        float OooOO0(SolverVariable solverVariable);

        void OooOO0O(float f);

        void clear();
    }

    public OooO0O0() {
    }

    public final void OooO(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f6795OooO00o;
        if (solverVariable2 != null) {
            this.f6798OooO0Oo.OooO0Oo(solverVariable2, -1.0f);
            this.f6795OooO00o.f6826Oooo0oo = -1;
            this.f6795OooO00o = null;
        }
        float fOooO = this.f6798OooO0Oo.OooO(solverVariable, true) * (-1.0f);
        this.f6795OooO00o = solverVariable;
        if (fOooO == 1.0f) {
            return;
        }
        this.f6796OooO0O0 /= fOooO;
        this.f6798OooO0Oo.OooOO0O(fOooO);
    }

    @Override // androidx.constraintlayout.core.OooO0OO.OooO00o
    public SolverVariable OooO00o(boolean[] zArr) {
        return OooO0oo(zArr, null);
    }

    public final OooO0O0 OooO0O0(OooO0OO oooO0OO, int i) {
        this.f6798OooO0Oo.OooO0Oo(oooO0OO.OooOO0O(i, "ep"), 1.0f);
        this.f6798OooO0Oo.OooO0Oo(oooO0OO.OooOO0O(i, UserDataStore.EMAIL), -1.0f);
        return this;
    }

    public final OooO0O0 OooO0OO(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f6798OooO0Oo.OooO0Oo(solverVariable, -1.0f);
        this.f6798OooO0Oo.OooO0Oo(solverVariable2, 1.0f);
        this.f6798OooO0Oo.OooO0Oo(solverVariable3, f);
        this.f6798OooO0Oo.OooO0Oo(solverVariable4, -f);
        return this;
    }

    public final OooO0O0 OooO0Oo(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f6796OooO0O0 = i;
        }
        if (z) {
            this.f6798OooO0Oo.OooO0Oo(solverVariable, 1.0f);
            this.f6798OooO0Oo.OooO0Oo(solverVariable2, -1.0f);
            this.f6798OooO0Oo.OooO0Oo(solverVariable3, -1.0f);
        } else {
            this.f6798OooO0Oo.OooO0Oo(solverVariable, -1.0f);
            this.f6798OooO0Oo.OooO0Oo(solverVariable2, 1.0f);
            this.f6798OooO0Oo.OooO0Oo(solverVariable3, 1.0f);
        }
        return this;
    }

    public final OooO0O0 OooO0o(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f6798OooO0Oo.OooO0Oo(solverVariable3, 0.5f);
        this.f6798OooO0Oo.OooO0Oo(solverVariable4, 0.5f);
        this.f6798OooO0Oo.OooO0Oo(solverVariable, -0.5f);
        this.f6798OooO0Oo.OooO0Oo(solverVariable2, -0.5f);
        this.f6796OooO0O0 = -f;
        return this;
    }

    public final OooO0O0 OooO0o0(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f6796OooO0O0 = i;
        }
        if (z) {
            this.f6798OooO0Oo.OooO0Oo(solverVariable, 1.0f);
            this.f6798OooO0Oo.OooO0Oo(solverVariable2, -1.0f);
            this.f6798OooO0Oo.OooO0Oo(solverVariable3, 1.0f);
        } else {
            this.f6798OooO0Oo.OooO0Oo(solverVariable, -1.0f);
            this.f6798OooO0Oo.OooO0Oo(solverVariable2, 1.0f);
            this.f6798OooO0Oo.OooO0Oo(solverVariable3, -1.0f);
        }
        return this;
    }

    public boolean OooO0oO() {
        return this.f6795OooO00o == null && this.f6796OooO0O0 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && this.f6798OooO0Oo.OooO00o() == 0;
    }

    public final SolverVariable OooO0oo(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int iOooO00o = this.f6798OooO0Oo.OooO00o();
        SolverVariable solverVariable2 = null;
        float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        for (int i = 0; i < iOooO00o; i++) {
            float fOooO0oo = this.f6798OooO0Oo.OooO0oo(i);
            if (fOooO0oo < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                SolverVariable solverVariableOooO0o0 = this.f6798OooO0Oo.OooO0o0(i);
                if ((zArr == null || !zArr[solverVariableOooO0o0.f6825Oooo0oO]) && solverVariableOooO0o0 != solverVariable && (((type = solverVariableOooO0o0.f6831OoooOO0) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && fOooO0oo < f)) {
                    f = fOooO0oo;
                    solverVariable2 = solverVariableOooO0o0;
                }
            }
        }
        return solverVariable2;
    }

    public final void OooOO0(OooO0OO oooO0OO, SolverVariable solverVariable, boolean z) {
        if (solverVariable == null || !solverVariable.f6828OoooO0) {
            return;
        }
        float fOooOO0 = this.f6798OooO0Oo.OooOO0(solverVariable);
        this.f6796OooO0O0 = (solverVariable.f6829OoooO00 * fOooOO0) + this.f6796OooO0O0;
        this.f6798OooO0Oo.OooO(solverVariable, z);
        if (z) {
            solverVariable.OooO0O0(this);
        }
        if (this.f6798OooO0Oo.OooO00o() == 0) {
            this.f6799OooO0o0 = true;
            oooO0OO.f6803OooO00o = true;
        }
    }

    public void OooOO0O(OooO0OO oooO0OO, OooO0O0 oooO0O0, boolean z) {
        float fOooO0OO = this.f6798OooO0Oo.OooO0OO(oooO0O0, z);
        this.f6796OooO0O0 = (oooO0O0.f6796OooO0O0 * fOooO0OO) + this.f6796OooO0O0;
        if (z) {
            oooO0O0.f6795OooO00o.OooO0O0(this);
        }
        if (this.f6795OooO00o == null || this.f6798OooO0Oo.OooO00o() != 0) {
            return;
        }
        this.f6799OooO0o0 = true;
        oooO0OO.f6803OooO00o = true;
    }

    public String toString() {
        String string;
        boolean z;
        if (this.f6795OooO00o == null) {
            string = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        } else {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("");
            sbOooO0o0.append(this.f6795OooO00o);
            string = sbOooO0o0.toString();
        }
        String strOooO0Oo = OooOo00.OooO0Oo(string, " = ");
        if (this.f6796OooO0O0 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0(strOooO0Oo);
            sbOooO0o1.append(this.f6796OooO0O0);
            strOooO0Oo = sbOooO0o1.toString();
            z = true;
        } else {
            z = false;
        }
        int iOooO00o = this.f6798OooO0Oo.OooO00o();
        for (int i = 0; i < iOooO00o; i++) {
            SolverVariable solverVariableOooO0o0 = this.f6798OooO0Oo.OooO0o0(i);
            if (solverVariableOooO0o0 != null) {
                float fOooO0oo = this.f6798OooO0Oo.OooO0oo(i);
                if (fOooO0oo != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    String string2 = solverVariableOooO0o0.toString();
                    if (z) {
                        if (fOooO0oo > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            strOooO0Oo = OooOo00.OooO0Oo(strOooO0Oo, " + ");
                        } else {
                            strOooO0Oo = OooOo00.OooO0Oo(strOooO0Oo, " - ");
                            fOooO0oo *= -1.0f;
                        }
                    } else if (fOooO0oo < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        strOooO0Oo = OooOo00.OooO0Oo(strOooO0Oo, "- ");
                        fOooO0oo *= -1.0f;
                    }
                    strOooO0Oo = fOooO0oo == 1.0f ? OooOo00.OooO0Oo(strOooO0Oo, string2) : strOooO0Oo + fOooO0oo + ZegoConstants.ZegoVideoDataAuxPublishingStream + string2;
                    z = true;
                }
            }
        }
        return !z ? OooOo00.OooO0Oo(strOooO0Oo, "0.0") : strOooO0Oo;
    }

    public OooO0O0(o0000OOO.OooO00o oooO00o) {
        this.f6798OooO0Oo = new androidx.constraintlayout.core.OooO00o(this, oooO00o);
    }
}
