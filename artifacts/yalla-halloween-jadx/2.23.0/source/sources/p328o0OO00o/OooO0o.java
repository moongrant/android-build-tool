package p328o0OO00o;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[][] f43057OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f43058OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f43059OooO0OO;

    public OooO0o(int i, int i2) {
        this.f43057OooO00o = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.f43058OooO0O0 = i;
        this.f43059OooO0OO = i2;
    }

    public final byte OooO00o(int i, int i2) {
        return this.f43057OooO00o[i2][i];
    }

    public final void OooO0O0(int i, int i2, int i3) {
        this.f43057OooO00o[i2][i] = (byte) i3;
    }

    public final void OooO0OO(int i, int i2, boolean z) {
        this.f43057OooO00o[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public final String toString() {
        int i = this.f43058OooO0O0;
        int i2 = this.f43059OooO0OO;
        StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr = this.f43057OooO00o[i3];
            for (int i4 = 0; i4 < i; i4++) {
                byte b = bArr[i4];
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
