package p421o0OoO0Oo;

import java.util.LinkedHashMap;
import java.util.Map;
import p421o0OoO0Oo.o00000;
import p425o0OoO0oo.o000O00O;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o00000<T extends o00000> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f45564OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Object f45565OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public LinkedHashMap f45566OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Map<String, String> f45567OooO0Oo;

    public final void OooO00o(String str, String str2) {
        if (this.f45566OooO0OO == null) {
            this.f45566OooO0OO = new LinkedHashMap();
        }
        this.f45566OooO0OO.put(str, str2);
    }

    public abstract o000O00O OooO0O0();

    public final String toString() {
        return "OkHttpRequestBuilder{ url='" + this.f45564OooO00o + ", headers=" + this.f45566OooO0OO + ", params=" + this.f45567OooO0Oo + ", tag=" + this.f45565OooO0O0 + ", id=0 }";
    }
}
