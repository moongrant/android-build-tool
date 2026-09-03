package o0Oo00o0;

import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int[] f38947OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int[] f38948OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f38949OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f38950OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f38951OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f38952OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO00o f38942OooO0oO = new OooO00o(4201, 4096, 1);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooO00o f38943OooO0oo = new OooO00o(1033, 1024, 1);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final OooO00o f38941OooO = new OooO00o(67, 64, 1);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final OooO00o f38944OooOO0 = new OooO00o(19, 16, 1);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final OooO00o f38945OooOO0O = new OooO00o(285, 256, 0);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final OooO00o f38946OooOO0o = new OooO00o(301, 256, 1);

    public OooO00o(int i, int i2, int i3) {
        this.f38952OooO0o0 = i;
        this.f38950OooO0Oo = i2;
        this.f38951OooO0o = i3;
        this.f38947OooO00o = new int[i2];
        this.f38948OooO0O0 = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f38947OooO00o[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f38948OooO0O0[this.f38947OooO00o[i6]] = i6;
        }
        this.f38949OooO0OO = new OooO0O0(this, new int[]{0});
        new OooO0O0(this, new int[]{1});
    }

    public final int OooO00o(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f38947OooO00o;
        int[] iArr2 = this.f38948OooO0O0;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f38950OooO0Oo - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.f38952OooO0o0));
        sb.append(',');
        return o0O0ooO.OooO00o(sb, this.f38950OooO0Oo, ')');
    }
}
