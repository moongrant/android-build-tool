package p314o0O0oOo0;

import android.content.Context;
import com.google.firebase.components.OooO;
import com.google.firebase.components.OooO0O0;
import com.google.firebase.components.OooOo;
import com.google.firebase.components.oo000o;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0Oo {

    public interface OooO00o<T> {
        String OooO0O0(Context context);
    }

    public static OooO0O0<?> OooO00o(String str, String str2) {
        o000O0o o000o0o2 = new o000O0o(str, str2);
        OooO0O0.OooO00o OooO00o2 = OooO0O0.OooO00o(o000O00O.class);
        OooO00o2.f19806OooO0o0 = 1;
        OooO00o2.f19805OooO0o = new com.google.firebase.components.OooO00o(o000o0o2);
        return OooO00o2.OooO0O0();
    }

    public static OooO0O0<?> OooO0O0(final String str, final OooO00o<Context> oooO00o) {
        OooO0O0.OooO00o OooO00o2 = OooO0O0.OooO00o(o000O00O.class);
        OooO00o2.f19806OooO0o0 = 1;
        OooO00o2.OooO00o(OooOo.OooO0O0(Context.class));
        OooO00o2.f19805OooO0o = new OooO() { // from class: o0O0oOo0.o000O0
            @Override // com.google.firebase.components.OooO
            public final Object OooO0OO(oo000o oo000oVar) {
                return new o000O0o(str, oooO00o.OooO0O0((Context) oo000oVar.OooO00o(Context.class)));
            }
        };
        return OooO00o2.OooO0O0();
    }
}
