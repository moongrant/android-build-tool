package p332o0OO00oo;

import com.google.zxing.FormatException;
import p057o0000OoO.OooOOOO;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0O0O00 extends OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f42345OooO00o = {1, 1, 1};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f42346OooO0O0 = {1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f42347OooO0OO = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[][] f42348OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[][] f42349OooO0o0;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f42348OooO0Oo = iArr;
        int[][] iArr2 = new int[20][];
        f42349OooO0o0 = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f42348OooO0Oo[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f42349OooO0o0[i] = iArr4;
        }
    }

    public static boolean OooO0OO(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return OooO0Oo(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10);
    }

    public static int OooO0Oo(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int iCharAt = charSequence.charAt(i2) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw FormatException.OooO00o();
            }
            i += iCharAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int iCharAt2 = charSequence.charAt(i4) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw FormatException.OooO00o();
            }
            i3 += iCharAt2;
        }
        return (1000 - i3) % 10;
    }
}
