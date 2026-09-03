package p551o0oOO;

import OooO00o.OooO00o;
import java.util.LinkedHashMap;
import java.util.Map;
import p551o0oOO.OooOOO;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOOO<T extends OooOOO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f44611OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Object f44612OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Map<String, String> f44613OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Map<String, String> f44614OooO0Oo;

    public final T OooO00o(String str, String str2) {
        if (this.f44613OooO0OO == null) {
            this.f44613OooO0OO = new LinkedHashMap();
        }
        this.f44613OooO0OO.put(str, str2);
        return this;
    }

    public abstract p156o00OoO0.OooOOO OooO0O0();

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("OkHttpRequestBuilder{ url='");
        sbOooO0o0.append(this.f44611OooO00o);
        sbOooO0o0.append(", headers=");
        sbOooO0o0.append(this.f44613OooO0OO);
        sbOooO0o0.append(", params=");
        sbOooO0o0.append(this.f44614OooO0Oo);
        sbOooO0o0.append(", tag=");
        sbOooO0o0.append(this.f44612OooO0O0);
        sbOooO0o0.append(", id=");
        sbOooO0o0.append(0);
        sbOooO0o0.append(" }");
        return sbOooO0o0.toString();
    }
}
