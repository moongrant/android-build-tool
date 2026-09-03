package o0O;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import p331o0OO00Oo.Oooo000;
import p333o0OO00oo.o00000;
import p333o0OO00oo.o000oOoO;
import p333o0OO00oo.o00O0O;
import p333o0OO00oo.o00Ooo;
import p333o0OO00oo.o00oO0o;
import p333o0OO00oo.o0O0O00;
import p333o0OO00oo.o0OO00O;
import p333o0OO00oo.o0OOO0o;
import p333o0OO00oo.o0Oo0oo;
import p446o0OoOoO.o000O0O0;
import p551o0oOO.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 implements OooO0o {

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f40869OooO00o;

        static {
            int[] iArr = new int[BarcodeFormat.values().length];
            f40869OooO00o = iArr;
            try {
                iArr[BarcodeFormat.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40869OooO00o[BarcodeFormat.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40869OooO00o[BarcodeFormat.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40869OooO00o[BarcodeFormat.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40869OooO00o[BarcodeFormat.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40869OooO00o[BarcodeFormat.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40869OooO00o[BarcodeFormat.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f40869OooO00o[BarcodeFormat.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f40869OooO00o[BarcodeFormat.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f40869OooO00o[BarcodeFormat.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f40869OooO00o[BarcodeFormat.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f40869OooO00o[BarcodeFormat.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f40869OooO00o[BarcodeFormat.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // o0O.OooO0o
    public final o0OO000o.OooO0O0 OooO00o(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        OooO0o o0oo0oo2;
        switch (OooO00o.f40869OooO00o[barcodeFormat.ordinal()]) {
            case 1:
                o0oo0oo2 = new o0Oo0oo();
                break;
            case 2:
                o0oo0oo2 = new o00000();
                break;
            case 3:
                o0oo0oo2 = new o0OOO0o();
                break;
            case 4:
                o0oo0oo2 = new o0O0O00();
                break;
            case 5:
                o0oo0oo2 = new o000O0O0();
                break;
            case 6:
                o0oo0oo2 = new o00Ooo();
                break;
            case 7:
                o0oo0oo2 = new o00oO0o();
                break;
            case 8:
                o0oo0oo2 = new o00O0O();
                break;
            case 9:
                o0oo0oo2 = new o0OO00O();
                break;
            case 10:
                o0oo0oo2 = new Oooo000();
                break;
            case 11:
                o0oo0oo2 = new o000oOoO();
                break;
            case 12:
                o0oo0oo2 = new oo0ooO.OooO00o();
                break;
            case 13:
                o0oo0oo2 = new OooOo();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(barcodeFormat)));
        }
        return o0oo0oo2.OooO00o(str, barcodeFormat, enumMap);
    }
}
