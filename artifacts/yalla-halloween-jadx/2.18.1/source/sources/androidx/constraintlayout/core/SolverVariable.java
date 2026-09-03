package androidx.constraintlayout.core;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class SolverVariable implements Comparable<SolverVariable> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f6824Oooo0o;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f6829OoooO00;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public Type f6831OoooOO0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f6825Oooo0oO = -1;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f6826Oooo0oo = -1;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f6823Oooo = 0;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f6828OoooO0 = false;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public float[] f6830OoooO0O = new float[9];

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float[] f6827OoooO = new float[9];

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public OooO0O0[] f6834o000oOoO = new OooO0O0[16];

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f6832OoooOOO = 0;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f6833OoooOOo = 0;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type) {
        this.f6831OoooOO0 = type;
    }

    public final void OooO00o(OooO0O0 oooO0O0) {
        int i = 0;
        while (true) {
            int i2 = this.f6832OoooOOO;
            if (i >= i2) {
                OooO0O0[] oooO0O0Arr = this.f6834o000oOoO;
                if (i2 >= oooO0O0Arr.length) {
                    this.f6834o000oOoO = (OooO0O0[]) Arrays.copyOf(oooO0O0Arr, oooO0O0Arr.length * 2);
                }
                OooO0O0[] oooO0O0Arr2 = this.f6834o000oOoO;
                int i3 = this.f6832OoooOOO;
                oooO0O0Arr2[i3] = oooO0O0;
                this.f6832OoooOOO = i3 + 1;
                return;
            }
            if (this.f6834o000oOoO[i] == oooO0O0) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void OooO0O0(OooO0O0 oooO0O0) {
        int i = this.f6832OoooOOO;
        int i2 = 0;
        while (i2 < i) {
            if (this.f6834o000oOoO[i2] == oooO0O0) {
                while (i2 < i - 1) {
                    OooO0O0[] oooO0O0Arr = this.f6834o000oOoO;
                    int i3 = i2 + 1;
                    oooO0O0Arr[i2] = oooO0O0Arr[i3];
                    i2 = i3;
                }
                this.f6832OoooOOO--;
                return;
            }
            i2++;
        }
    }

    public final void OooO0Oo() {
        this.f6831OoooOO0 = Type.UNKNOWN;
        this.f6823Oooo = 0;
        this.f6825Oooo0oO = -1;
        this.f6826Oooo0oo = -1;
        this.f6829OoooO00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f6828OoooO0 = false;
        int i = this.f6832OoooOOO;
        for (int i2 = 0; i2 < i; i2++) {
            this.f6834o000oOoO[i2] = null;
        }
        this.f6832OoooOOO = 0;
        this.f6833OoooOOo = 0;
        this.f6824Oooo0o = false;
        Arrays.fill(this.f6827OoooO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }

    public final void OooO0o(OooO0OO oooO0OO, OooO0O0 oooO0O0) {
        int i = this.f6832OoooOOO;
        for (int i2 = 0; i2 < i; i2++) {
            this.f6834o000oOoO[i2].OooOO0O(oooO0OO, oooO0O0, false);
        }
        this.f6832OoooOOO = 0;
    }

    public final void OooO0o0(OooO0OO oooO0OO, float f) {
        this.f6829OoooO00 = f;
        this.f6828OoooO0 = true;
        int i = this.f6832OoooOOO;
        this.f6826Oooo0oo = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f6834o000oOoO[i2].OooOO0(oooO0OO, this, false);
        }
        this.f6832OoooOOO = 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(SolverVariable solverVariable) {
        return this.f6825Oooo0oO - solverVariable.f6825Oooo0oO;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("");
        sbOooO0o0.append(this.f6825Oooo0oO);
        return sbOooO0o0.toString();
    }
}
