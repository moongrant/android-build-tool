package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Method f61182OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<?> f61183OooO0O0;

    public o0OoOo0(Method method, ArrayList arrayList) {
        this.f61182OooO00o = method;
        this.f61183OooO0O0 = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        Method method = this.f61182OooO00o;
        return String.format("%s.%s() %s", method.getDeclaringClass().getName(), method.getName(), this.f61183OooO0O0);
    }
}
