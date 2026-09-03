package p153o00Oo0oO;

import android.text.TextUtils;
import java.util.Map;
import p160o00OoOO0.o00OO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo {
    public final void OooO00o(String str, int i, o00OO0O0.OooO0O0 oooO0O0) {
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("barid", str);
        mapOooO0O0.put("type", i + "");
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32320o000OO, mapOooO0O0, oooO0O0);
    }

    public final void OooO0O0(String str, String str2, String str3, o00OO0O0.OooO0O0 oooO0O0) {
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("pageindex", str);
        if (!TextUtils.isEmpty(str2)) {
            mapOooO0O0.put("labelId", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            mapOooO0O0.put("countryId", str3);
        }
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32335o0Oo0oo, mapOooO0O0, oooO0O0);
    }

    public final void OooO0OO(String str, boolean z, o00OO0O0.OooO0O0 oooO0O0) {
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("barid", str);
        mapOooO0O0.put("type", (z ? 1 : 0) + "");
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32261OoooO00, mapOooO0O0, oooO0O0);
    }

    public final void OooO0Oo(String str, int i, o00OO0O0.OooO0O0 oooO0O0) {
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("barid", str);
        mapOooO0O0.put("dues", i + "");
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0Oo(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32260OoooO0, mapOooO0O0, oooO0O0);
    }
}
