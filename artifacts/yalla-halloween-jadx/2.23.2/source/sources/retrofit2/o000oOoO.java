package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Method f60616OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<?> f60617OooO0O0;

    public o000oOoO(Method method, ArrayList arrayList) {
        this.f60616OooO00o = method;
        this.f60617OooO0O0 = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        Method method = this.f60616OooO00o;
        return String.format("%s.%s() %s", method.getDeclaringClass().getName(), method.getName(), this.f60617OooO0O0);
    }
}
