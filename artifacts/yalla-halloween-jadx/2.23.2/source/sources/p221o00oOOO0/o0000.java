package p221o00oOOO0;

import java.util.Arrays;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final char[] f39658OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f39659OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int[] f39660OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final int[] f39661OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[] f39662OooO0o0;

    static {
        int i;
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f39658OooO00o = charArray;
        int length = charArray.length;
        f39659OooO0O0 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            f39659OooO0O0[i2] = (byte) f39658OooO00o[i2];
        }
        int[] iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        for (int i3 = 0; i3 < 32; i3++) {
            iArr[i3] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        int[] iArr2 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        System.arraycopy(iArr, 0, iArr2, 0, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        for (int i4 = 128; i4 < 256; i4++) {
            if ((i4 & 224) == 192) {
                i = 2;
            } else if ((i4 & 240) == 224) {
                i = 3;
            } else {
                i = (i4 & 248) == 240 ? 4 : -1;
            }
            iArr2[i4] = i;
        }
        f39660OooO0OO = iArr2;
        int[] iArr3 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        Arrays.fill(iArr3, -1);
        for (int i5 = 33; i5 < 256; i5++) {
            if (Character.isJavaIdentifierPart((char) i5)) {
                iArr3[i5] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        int[] iArr4 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        System.arraycopy(iArr3, 0, iArr4, 0, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        Arrays.fill(iArr4, 128, 128, 0);
        int[] iArr5 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        int[] iArr6 = f39660OooO0OO;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        int[] iArr7 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        int[] iArr8 = new int[128];
        for (int i6 = 0; i6 < 32; i6++) {
            iArr8[i6] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        f39661OooO0Oo = iArr8;
        int[] iArr9 = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        f39662OooO0o0 = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i7 = 0; i7 < 10; i7++) {
            f39662OooO0o0[i7 + 48] = i7;
        }
        for (int i8 = 0; i8 < 6; i8++) {
            int[] iArr10 = f39662OooO0o0;
            int i9 = i8 + 10;
            iArr10[i8 + 97] = i9;
            iArr10[i8 + 65] = i9;
        }
    }
}
