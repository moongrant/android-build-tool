package p403o0Oo0O0O;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[][] f39019OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f39020OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f39021OooO0OO;

    public o0OoOo0(int i, int i2) {
        this.f39019OooO00o = (byte[][]) Array.newInstance((Class<?>) byte.class, i2, i);
        this.f39020OooO0O0 = i;
        this.f39021OooO0OO = i2;
    }

    public final byte OooO00o(int i, int i2) {
        return this.f39019OooO00o[i2][i];
    }

    public final void OooO0O0(int i, int i2, int i3) {
        this.f39019OooO00o[i2][i] = (byte) i3;
    }

    public final void OooO0OO(int i, int i2, boolean z) {
        this.f39019OooO00o[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f39020OooO0O0 * 2 * this.f39021OooO0OO) + 2);
        for (int i = 0; i < this.f39021OooO0OO; i++) {
            byte[] bArr = this.f39019OooO00o[i];
            for (int i2 = 0; i2 < this.f39020OooO0O0; i2++) {
                byte b = bArr[i2];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
