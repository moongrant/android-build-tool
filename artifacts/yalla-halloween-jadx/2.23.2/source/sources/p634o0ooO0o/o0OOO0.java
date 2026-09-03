package p634o0ooO0o;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OOO0 {
    public static int OooO00o(int i, float f, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return (i6 + ((int) (f * ((i2 & 255) - i6)))) | ((i3 + ((int) ((((i2 >> 24) & 255) - i3) * f))) << 24) | ((i4 + ((int) ((((i2 >> 16) & 255) - i4) * f))) << 16) | ((i5 + ((int) ((((i2 >> 8) & 255) - i5) * f))) << 8);
    }
}
