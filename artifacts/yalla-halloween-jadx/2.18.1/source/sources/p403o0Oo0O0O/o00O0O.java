package p403o0Oo0O0O;

import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import p392o0OOooo.o00000O;
import p401o0Oo0O0.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f39013OooO00o = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f39014OooO00o;

        static {
            int[] iArr = new int[Mode.values().length];
            f39014OooO00o = iArr;
            try {
                iArr[Mode.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39014OooO00o[Mode.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39014OooO00o[Mode.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39014OooO00o[Mode.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static int OooO00o(Mode mode, o00000O o00000o, o00000O o00000o2, o000oOoO o000oooo2) {
        return mode.OooO0O0(o000oooo2) + o00000o.f38917Oooo0oO + o00000o2.f38917Oooo0oO;
    }

    public static o000oOoO OooO0O0(int i, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        for (int i2 = 1; i2 <= 40; i2++) {
            o000oOoO o000ooooOooO0O0 = o000oOoO.OooO0O0(i2);
            if (OooO0Oo(i, o000ooooOooO0O0, errorCorrectionLevel)) {
                return o000ooooOooO0O0;
            }
        }
        throw new WriterException("Data too big");
    }

    public static int OooO0OO(int i) {
        int[] iArr = f39013OooO00o;
        if (i < 96) {
            return iArr[i];
        }
        return -1;
    }

    public static boolean OooO0Oo(int i, o000oOoO o000oooo2, ErrorCorrectionLevel errorCorrectionLevel) {
        int i2 = o000oooo2.f39006OooO0OO;
        o000oOoO.OooO0O0 oooO0O0 = o000oooo2.f39005OooO0O0[errorCorrectionLevel.ordinal()];
        int i3 = oooO0O0.f39009OooO00o;
        int i4 = 0;
        for (o000oOoO.OooO00o oooO00o : oooO0O0.f39010OooO0O0) {
            i4 += oooO00o.f39007OooO00o;
        }
        return i2 - (i3 * i4) >= (i + 7) / 8;
    }
}
