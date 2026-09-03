package p031OoooO0;

import android.net.Uri;
import android.os.Bundle;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.media3.common.OooO0OO;
import androidx.media3.common.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00Ooo implements DoubleFunction, OooO0OO.OooO00o {
    public static String OooO00o(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public OooO0OO OooO0OO(Bundle bundle) {
        OooOOO0.C0139OooOOO0.OooO00o oooO00o = new OooOOO0.C0139OooOOO0.OooO00o();
        oooO00o.f6590OooO00o = (Uri) bundle.getParcelable(OooOOO0.C0139OooOOO0.f6584OooO0oo);
        oooO00o.f6591OooO0O0 = bundle.getString(OooOOO0.C0139OooOOO0.f6582OooO);
        oooO00o.f6592OooO0OO = bundle.getBundle(OooOOO0.C0139OooOOO0.f6585OooOO0);
        return new OooOOO0.C0139OooOOO0(oooO00o);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d) {
        return ColorSpaces.ExtendedSrgb$lambda$0(d);
    }
}
