package p326o0O0oooO;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import o0OO000.OooO0O0;
import o0OO00OO.OooO0o;
import o0OO00OO.OooOO0;
import o0OO00OO.OooOOO0;
import o0OO00OO.OooOOOO;
import o0OO00OO.OooOo;
import o0OO00OO.OooOo00;
import o0OO00OO.o000oOoO;
import o0OO00OO.o00Ooo;
import p180o00o000O.o00Oo0;
import p188o00o0O.OooOOO;
import p329o0OO00oo.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOO0 implements o0o0Oo {

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f42976OooO00o;

        static {
            int[] iArr = new int[BarcodeFormat.values().length];
            f42976OooO00o = iArr;
            try {
                iArr[BarcodeFormat.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42976OooO00o[BarcodeFormat.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42976OooO00o[BarcodeFormat.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42976OooO00o[BarcodeFormat.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42976OooO00o[BarcodeFormat.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42976OooO00o[BarcodeFormat.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42976OooO00o[BarcodeFormat.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f42976OooO00o[BarcodeFormat.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f42976OooO00o[BarcodeFormat.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f42976OooO00o[BarcodeFormat.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f42976OooO00o[BarcodeFormat.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f42976OooO00o[BarcodeFormat.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f42976OooO00o[BarcodeFormat.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // p326o0O0oooO.o0o0Oo
    public final OooO0O0 OooO00o(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        o0o0Oo oooOo00;
        switch (OooO00o.f42976OooO00o[barcodeFormat.ordinal()]) {
            case 1:
                oooOo00 = new OooOo00();
                break;
            case 2:
                oooOo00 = new o00Ooo();
                break;
            case 3:
                oooOo00 = new OooOOOO();
                break;
            case 4:
                oooOo00 = new o000oOoO();
                break;
            case 5:
                oooOo00 = new o0OO00o0.OooO00o();
                break;
            case 6:
                oooOo00 = new OooOO0();
                break;
            case 7:
                oooOo00 = new OooOOO0();
                break;
            case 8:
                oooOo00 = new OooO0o();
                break;
            case 9:
                oooOo00 = new OooOo();
                break;
            case 10:
                oooOo00 = new oo0o0Oo();
                break;
            case 11:
                oooOo00 = new o0OO00OO.OooO0O0();
                break;
            case 12:
                oooOo00 = new OooOOO();
                break;
            case 13:
                oooOo00 = new o00Oo0();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(barcodeFormat)));
        }
        return oooOo00.OooO00o(str, barcodeFormat, enumMap);
    }
}
