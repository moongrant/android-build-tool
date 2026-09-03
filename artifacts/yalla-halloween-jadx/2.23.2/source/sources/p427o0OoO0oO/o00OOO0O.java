package p427o0OoO0oO;

import java.util.LinkedHashMap;
import java.util.Map;
import p248o00oo0o0.o00O00;
import p427o0OoO0oO.o00OOO0O;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o00OOO0O<T extends o00OOO0O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f46764OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Object f46765OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public LinkedHashMap f46766OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Map<String, String> f46767OooO0Oo;

    public final void OooO00o(String str, String str2) {
        if (this.f46766OooO0OO == null) {
            this.f46766OooO0OO = new LinkedHashMap();
        }
        this.f46766OooO0OO.put(str, str2);
    }

    public abstract o00O00 OooO0O0();

    public final String toString() {
        return "OkHttpRequestBuilder{ url='" + this.f46764OooO00o + ", headers=" + this.f46766OooO0OO + ", params=" + this.f46767OooO0Oo + ", tag=" + this.f46765OooO0O0 + ", id=0 }";
    }
}
