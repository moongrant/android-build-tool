package androidx.constraintlayout.core;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class SolverVariable implements Comparable<SolverVariable> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f4263OooO0Oo;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f4267OooO0oo;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Type f4270OooOO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f4265OooO0o0 = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f4264OooO0o = -1;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f4266OooO0oO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f4262OooO = false;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final float[] f4268OooOO0 = new float[9];

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final float[] f4269OooOO0O = new float[9];

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public OooO0O0[] f4272OooOOO0 = new OooO0O0[16];

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f4271OooOOO = 0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f4273OooOOOO = 0;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type) {
        this.f4270OooOO0o = type;
    }

    public final void OooO00o(OooO0O0 oooO0O0) {
        int i = 0;
        while (true) {
            int i2 = this.f4271OooOOO;
            if (i >= i2) {
                OooO0O0[] oooO0O0Arr = this.f4272OooOOO0;
                if (i2 >= oooO0O0Arr.length) {
                    this.f4272OooOOO0 = (OooO0O0[]) Arrays.copyOf(oooO0O0Arr, oooO0O0Arr.length * 2);
                }
                OooO0O0[] oooO0O0Arr2 = this.f4272OooOOO0;
                int i3 = this.f4271OooOOO;
                oooO0O0Arr2[i3] = oooO0O0;
                this.f4271OooOOO = i3 + 1;
                return;
            }
            if (this.f4272OooOOO0[i] == oooO0O0) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void OooO0O0(OooO0O0 oooO0O0) {
        int i = this.f4271OooOOO;
        int i2 = 0;
        while (i2 < i) {
            if (this.f4272OooOOO0[i2] == oooO0O0) {
                while (i2 < i - 1) {
                    OooO0O0[] oooO0O0Arr = this.f4272OooOOO0;
                    int i3 = i2 + 1;
                    oooO0O0Arr[i2] = oooO0O0Arr[i3];
                    i2 = i3;
                }
                this.f4271OooOOO--;
                return;
            }
            i2++;
        }
    }

    public final void OooO0OO() {
        this.f4270OooOO0o = Type.UNKNOWN;
        this.f4266OooO0oO = 0;
        this.f4265OooO0o0 = -1;
        this.f4264OooO0o = -1;
        this.f4267OooO0oo = 0.0f;
        this.f4262OooO = false;
        int i = this.f4271OooOOO;
        for (int i2 = 0; i2 < i; i2++) {
            this.f4272OooOOO0[i2] = null;
        }
        this.f4271OooOOO = 0;
        this.f4273OooOOOO = 0;
        this.f4263OooO0Oo = false;
        Arrays.fill(this.f4269OooOO0O, 0.0f);
    }

    public final void OooO0Oo(OooO0OO oooO0OO, float f) {
        this.f4267OooO0oo = f;
        this.f4262OooO = true;
        int i = this.f4271OooOOO;
        this.f4264OooO0o = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f4272OooOOO0[i2].OooO0oo(oooO0OO, this, false);
        }
        this.f4271OooOOO = 0;
    }

    public final void OooO0o0(OooO0OO oooO0OO, OooO0O0 oooO0O0) {
        int i = this.f4271OooOOO;
        for (int i2 = 0; i2 < i; i2++) {
            this.f4272OooOOO0[i2].OooO(oooO0OO, oooO0O0, false);
        }
        this.f4271OooOOO = 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(SolverVariable solverVariable) {
        return this.f4265OooO0o0 - solverVariable.f4265OooO0o0;
    }

    public final String toString() {
        return "" + this.f4265OooO0o0;
    }
}
