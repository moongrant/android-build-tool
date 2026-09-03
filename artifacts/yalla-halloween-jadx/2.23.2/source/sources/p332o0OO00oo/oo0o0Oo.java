package p332o0OO00oo;

import com.facebook.appevents.AppEventsConstants;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import o0O.OooO0o;
import o0OO000o.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0o0Oo implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0ooOOo f42353OooO00o = new o0ooOOo();

    @Override // o0O.OooO0o
    public final OooO0O0 OooO00o(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat != BarcodeFormat.UPC_A) {
            throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(barcodeFormat)));
        }
        return this.f42353OooO00o.OooO00o(AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(String.valueOf(str)), BarcodeFormat.EAN_13, enumMap);
    }
}
