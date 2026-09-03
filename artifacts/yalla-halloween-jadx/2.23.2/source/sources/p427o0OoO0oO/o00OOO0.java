package p427o0OoO0oO;

import android.net.Uri;
import java.util.Map;
import p248o00oo0o0.o00O00;
import p430o0OoOO00.oo000o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0 extends o00OOO0O<o00OOO0> {
    @Override // p427o0OoO0oO.o00OOO0O
    public final o00O00 OooO0O0() {
        Map<String, String> map = this.f46767OooO0Oo;
        if (map != null) {
            String string = this.f46764OooO00o;
            if (string != null && !map.isEmpty()) {
                Uri.Builder builderBuildUpon = Uri.parse(string).buildUpon();
                for (String str : map.keySet()) {
                    builderBuildUpon.appendQueryParameter(str, map.get(str));
                }
                string = builderBuildUpon.build().toString();
            }
            this.f46764OooO00o = string;
        }
        return new o00O00(new oo000o(this.f46764OooO00o, this.f46765OooO0O0, this.f46767OooO0Oo, this.f46766OooO0OO));
    }
}
