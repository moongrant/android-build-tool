package androidx.compose.compiler.plugins.kotlin;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.o000oOoO;
import com.google.android.material.carousel.MaskableFrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0OO implements com.google.android.exoplayer2.OooO.OooO00o, com.google.android.material.shape.OooO0O0.InterfaceC0223OooO0O0 {
    public static String OooO0OO(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    @Override // com.google.android.material.shape.OooO0O0.InterfaceC0223OooO0O0
    public o0O00o00.OooO0o OooO00o(o0O00o00.OooO0o oooO0o) {
        int i = MaskableFrameLayout.f16615OooO;
        return oooO0o instanceof o0O00o00.OooO00o ? new o0O00o00.OooO0OO(((o0O00o00.OooO00o) oooO0o).f41796OooO00o) : oooO0o;
    }

    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public com.google.android.exoplayer2.OooO OooO0O0(Bundle bundle) {
        o000oOoO.OooOOO0.OooO00o oooO00o = new o000oOoO.OooOOO0.OooO00o();
        oooO00o.f12774OooO00o = (Uri) bundle.getParcelable(o000oOoO.OooOOO0.f12768OooO0oo);
        oooO00o.f12775OooO0O0 = bundle.getString(o000oOoO.OooOOO0.f12766OooO);
        oooO00o.f12776OooO0OO = bundle.getBundle(o000oOoO.OooOOO0.f12769OooOO0);
        return new o000oOoO.OooOOO0(oooO00o);
    }
}
