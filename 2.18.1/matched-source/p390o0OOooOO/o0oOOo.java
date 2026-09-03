package p390o0OOooOO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import java.util.Map;
import p391o0OOooOo.o0O00000;
import p392o0OOooo.o00000OO;
import p396o0Oo0.OooOO0O;
import p397o0Oo00o.o0oo0000;
import p399o0Oo00oo.o0000;
import p399o0Oo00oo.o00000;
import p399o0Oo00oo.o000000;
import p399o0Oo00oo.o00000O;
import p399o0Oo00oo.o00000O0;
import p399o0Oo00oo.o0000O0O;
import p399o0Oo00oo.o0OO00O;
import p399o0Oo00oo.o0OOO0o;
import p402o0Oo0O00.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oOOo implements o0 {

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f38914OooO00o;

        static {
            int[] iArr = new int[BarcodeFormat.values().length];
            f38914OooO00o = iArr;
            try {
                iArr[BarcodeFormat.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38914OooO00o[BarcodeFormat.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38914OooO00o[BarcodeFormat.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38914OooO00o[BarcodeFormat.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38914OooO00o[BarcodeFormat.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38914OooO00o[BarcodeFormat.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38914OooO00o[BarcodeFormat.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f38914OooO00o[BarcodeFormat.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f38914OooO00o[BarcodeFormat.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f38914OooO00o[BarcodeFormat.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f38914OooO00o[BarcodeFormat.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f38914OooO00o[BarcodeFormat.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f38914OooO00o[BarcodeFormat.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // p390o0OOooOO.o0
    public final o00000OO OooO00o(String str, BarcodeFormat barcodeFormat, Map map) throws WriterException {
        o0 o00000o1;
        switch (OooO00o.f38914OooO00o[barcodeFormat.ordinal()]) {
            case 1:
                o00000o1 = new o00000O0();
                break;
            case 2:
                o00000o1 = new o0000O0O();
                break;
            case 3:
                o00000o1 = new o00000();
                break;
            case 4:
                o00000o1 = new o0000();
                break;
            case 5:
                o00000o1 = new o0O0O00();
                break;
            case 6:
                o00000o1 = new p399o0Oo00oo.o0O0O00();
                break;
            case 7:
                o00000o1 = new o000000();
                break;
            case 8:
                o00000o1 = new o0OO00O();
                break;
            case 9:
                o00000o1 = new o00000O();
                break;
            case 10:
                o00000o1 = new OooOO0O();
                break;
            case 11:
                o00000o1 = new o0OOO0o();
                break;
            case 12:
                o00000o1 = new o0oo0000();
                break;
            case 13:
                o00000o1 = new o0O00000();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(barcodeFormat)));
        }
        return o00000o1.OooO00o(str, barcodeFormat, map);
    }
}
