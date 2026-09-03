package androidx.compose.compiler.plugins.kotlin;

import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.style.ForegroundColorSpan;
import com.code.android.util.o0000;
import com.google.android.exoplayer2.o000oOoO;
import p245o00oo0o.o00O0O00;
import p584o0oOooO0.oO00O0o;
import p585o0oOooOO.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements com.google.android.exoplayer2.OooO.OooO00o, o00O0O00, f {
    public static StringBuilder OooO0OO(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    @Override // p585o0oOooOO.f
    public void OooO00o(Editable editable, int i, int i2) {
        if (editable != null) {
            editable.setSpan(new ForegroundColorSpan(o0000.OooO00o(oO00O0o.color_1BA1FD)), i, i2, 33);
        }
    }

    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public com.google.android.exoplayer2.OooO OooO0O0(Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable(o000oOoO.OooOOOO.f12777OooOO0O);
        uri.getClass();
        String string = bundle.getString(o000oOoO.OooOOOO.f12778OooOO0o);
        String string2 = bundle.getString(o000oOoO.OooOOOO.f12780OooOOO0);
        int i = bundle.getInt(o000oOoO.OooOOOO.f12779OooOOO, 0);
        int i2 = bundle.getInt(o000oOoO.OooOOOO.f12781OooOOOO, 0);
        String string3 = bundle.getString(o000oOoO.OooOOOO.f12782OooOOOo);
        String string4 = bundle.getString(o000oOoO.OooOOOO.f12784OooOOo0);
        o000oOoO.OooOOOO.OooO00o oooO00o = new o000oOoO.OooOOOO.OooO00o(uri);
        oooO00o.f12793OooO0O0 = string;
        oooO00o.f12794OooO0OO = string2;
        oooO00o.f12795OooO0Oo = i;
        oooO00o.f12797OooO0o0 = i2;
        oooO00o.f12796OooO0o = string3;
        oooO00o.f12798OooO0oO = string4;
        return new o000oOoO.OooOOOO(oooO00o);
    }

    @Override // p245o00oo0o.o00O0O00
    public void accept(Object obj) {
        ((com.google.android.exoplayer2.drm.OooO0O0.OooO00o) obj).OooO0OO();
    }
}
