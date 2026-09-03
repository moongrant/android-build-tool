package p399o0Oo00oo;

import com.facebook.appevents.AppEventsConstants;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import java.util.Map;
import p390o0OOooOO.o0;
import p392o0OOooo.o00000OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000 implements o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000 f38983OooO00o = new o00000();

    @Override // p390o0OOooOO.o0
    public final o00000OO OooO00o(String str, BarcodeFormat barcodeFormat, Map map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.UPC_A) {
            return this.f38983OooO00o.OooO00o(AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(String.valueOf(str)), BarcodeFormat.EAN_13, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
