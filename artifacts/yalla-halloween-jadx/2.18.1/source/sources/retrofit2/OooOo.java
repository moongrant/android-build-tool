package retrofit2;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Method f53753OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<?> f53754OooO0O0;

    public OooOo(Method method, List<?> list) {
        this.f53753OooO00o = method;
        this.f53754OooO0O0 = Collections.unmodifiableList(list);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.f53753OooO00o.getDeclaringClass().getName(), this.f53753OooO00o.getName(), this.f53754OooO0O0);
    }
}
