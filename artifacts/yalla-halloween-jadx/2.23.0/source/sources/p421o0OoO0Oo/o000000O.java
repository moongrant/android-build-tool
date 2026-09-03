package p421o0OoO0Oo;

import android.net.Uri;
import java.util.Map;
import p425o0OoO0oo.o000;
import p425o0OoO0oo.o000O00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O extends o00000<o000000O> {
    @Override // p421o0OoO0Oo.o00000
    public final o000O00O OooO0O0() {
        Map<String, String> map = this.f45567OooO0Oo;
        if (map != null) {
            String string = this.f45564OooO00o;
            if (string != null && !map.isEmpty()) {
                Uri.Builder builderBuildUpon = Uri.parse(string).buildUpon();
                for (String str : map.keySet()) {
                    builderBuildUpon.appendQueryParameter(str, map.get(str));
                }
                string = builderBuildUpon.build().toString();
            }
            this.f45564OooO00o = string;
        }
        return new o000O00O(new o000(this.f45564OooO00o, this.f45565OooO0O0, this.f45567OooO0Oo, this.f45566OooO0OO));
    }
}
