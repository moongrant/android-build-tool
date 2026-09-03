package p551o0oOO;

import android.net.Uri;
import java.util.Map;
import p156o00OoO0.OooO;
import p156o00OoO0.OooOOO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends OooOOO<OooOOO0> {
    @Override // p551o0oOO.OooOOO
    public final OooOOO OooO0O0() {
        Map<String, String> map = this.f44614OooO0Oo;
        if (map != null) {
            String string = this.f44611OooO00o;
            if (string != null && !map.isEmpty()) {
                Uri.Builder builderBuildUpon = Uri.parse(string).buildUpon();
                for (String str : map.keySet()) {
                    builderBuildUpon.appendQueryParameter(str, map.get(str));
                }
                string = builderBuildUpon.build().toString();
            }
            this.f44611OooO00o = string;
        }
        return new OooOOO(new OooO(this.f44611OooO00o, this.f44612OooO0O0, this.f44614OooO0Oo, this.f44613OooO0OO));
    }
}
