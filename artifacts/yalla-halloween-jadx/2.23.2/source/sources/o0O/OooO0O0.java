package o0O;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import p330o0OO00Oo.OooOo;
import p332o0OO00oo.Oooo0;
import p332o0OO00oo.o000000O;
import p332o0OO00oo.o00Oo0;
import p332o0OO00oo.o0OOO0o;
import p332o0OO00oo.o0Oo0oo;
import p332o0OO00oo.o0OoOo0;
import p332o0OO00oo.o0ooOOo;
import p332o0OO00oo.oo000o;
import p332o0OO00oo.oo0o0Oo;
import p444o0OoOoO.o000O0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 implements OooO0o {

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f40874OooO00o;

        static {
            int[] iArr = new int[BarcodeFormat.values().length];
            f40874OooO00o = iArr;
            try {
                iArr[BarcodeFormat.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40874OooO00o[BarcodeFormat.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40874OooO00o[BarcodeFormat.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40874OooO00o[BarcodeFormat.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40874OooO00o[BarcodeFormat.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40874OooO00o[BarcodeFormat.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40874OooO00o[BarcodeFormat.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f40874OooO00o[BarcodeFormat.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f40874OooO00o[BarcodeFormat.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f40874OooO00o[BarcodeFormat.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f40874OooO00o[BarcodeFormat.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f40874OooO00o[BarcodeFormat.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f40874OooO00o[BarcodeFormat.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // o0O.OooO0o
    public final o0OO000o.OooO0O0 OooO00o(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        OooO0o o0ooo0o2;
        switch (OooO00o.f40874OooO00o[barcodeFormat.ordinal()]) {
            case 1:
                o0ooo0o2 = new o0OOO0o();
                break;
            case 2:
                o0ooo0o2 = new o000000O();
                break;
            case 3:
                o0ooo0o2 = new o0ooOOo();
                break;
            case 4:
                o0ooo0o2 = new oo0o0Oo();
                break;
            case 5:
                o0ooo0o2 = new o000O0O0();
                break;
            case 6:
                o0ooo0o2 = new o00Oo0();
                break;
            case 7:
                o0ooo0o2 = new oo000o();
                break;
            case 8:
                o0ooo0o2 = new o0OoOo0();
                break;
            case 9:
                o0ooo0o2 = new o0Oo0oo();
                break;
            case 10:
                o0ooo0o2 = new OooOo();
                break;
            case 11:
                o0ooo0o2 = new Oooo0();
                break;
            case 12:
                o0ooo0o2 = new oo0ooO.OooO00o();
                break;
            case 13:
                o0ooo0o2 = new p548o0oOO.OooOo();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(barcodeFormat)));
        }
        return o0ooo0o2.OooO00o(str, barcodeFormat, enumMap);
    }
}
