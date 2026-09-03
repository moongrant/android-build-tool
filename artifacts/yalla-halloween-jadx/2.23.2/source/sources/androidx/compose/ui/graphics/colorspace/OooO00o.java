package androidx.compose.ui.graphics.colorspace;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements DoubleFunction, androidx.media3.common.OooO0OO.OooO00o {
    public static int OooO00o(int i, int i2, int i3, int i4, int i5) {
        return (((i + i2) * i3) + i4) * i5;
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0OO(Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable(androidx.media3.common.OooOOO0.OooOOOO.f6593OooOO0O);
        uri.getClass();
        String string = bundle.getString(androidx.media3.common.OooOOO0.OooOOOO.f6594OooOO0o);
        String string2 = bundle.getString(androidx.media3.common.OooOOO0.OooOOOO.f6596OooOOO0);
        int i = bundle.getInt(androidx.media3.common.OooOOO0.OooOOOO.f6595OooOOO, 0);
        int i2 = bundle.getInt(androidx.media3.common.OooOOO0.OooOOOO.f6597OooOOOO, 0);
        String string3 = bundle.getString(androidx.media3.common.OooOOO0.OooOOOO.f6598OooOOOo);
        String string4 = bundle.getString(androidx.media3.common.OooOOO0.OooOOOO.f6600OooOOo0);
        androidx.media3.common.OooOOO0.OooOOOO.OooO00o oooO00o = new androidx.media3.common.OooOOO0.OooOOOO.OooO00o(uri);
        oooO00o.f6609OooO0O0 = string;
        oooO00o.f6610OooO0OO = string2;
        oooO00o.f6611OooO0Oo = i;
        oooO00o.f6613OooO0o0 = i2;
        oooO00o.f6612OooO0o = string3;
        oooO00o.f6614OooO0oO = string4;
        return new androidx.media3.common.OooOOO0.OooOOOO(oooO00o);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d) {
        return ColorSpaces.ExtendedSrgb$lambda$1(d);
    }
}
