package o0OO00OO;

import com.facebook.appevents.AppEventsConstants;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import p326o0O0oooO.o0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO implements o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOOO f43032OooO00o = new OooOOOO();

    @Override // p326o0O0oooO.o0o0Oo
    public final o0OO000.OooO0O0 OooO00o(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat != BarcodeFormat.UPC_A) {
            throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(barcodeFormat)));
        }
        return this.f43032OooO00o.OooO00o(AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(String.valueOf(str)), BarcodeFormat.EAN_13, enumMap);
    }
}
