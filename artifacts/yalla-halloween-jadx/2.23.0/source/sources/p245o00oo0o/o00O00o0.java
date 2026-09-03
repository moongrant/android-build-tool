package p245o00oo0o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O00o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f40563OooO00o = {0, 0, 0, 1};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String[] f40564OooO0O0 = {"", "A", "B", "C"};

    public static String OooO00o(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String OooO0O0(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        Object[] objArr = new Object[5];
        objArr[0] = f40564OooO0O0[i];
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        objArr[3] = Character.valueOf(z ? 'H' : 'L');
        objArr[4] = Integer.valueOf(i4);
        StringBuilder sb = new StringBuilder(o0O00.OooOO0o("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }
}
