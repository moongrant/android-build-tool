package io.grpc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<String, o000oOoO<?, ?>> f26403OooO00o;

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f26404OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o00O0O f26405OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Map<String, o000oOoO<?, ?>> f26406OooO0OO = new HashMap();

        public OooO0O0(o00O0O o00o0o2) {
            o0OOOO0o.OooOOOO.OooOO0(o00o0o2, "serviceDescriptor");
            this.f26405OooO0O0 = o00o0o2;
            this.f26404OooO00o = o00o0o2.f26398OooO00o;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final <ReqT, RespT> OooO0O0 OooO00o(MethodDescriptor<ReqT, RespT> methodDescriptor, Oooo0<ReqT, RespT> oooo0) {
            o0OOOO0o.OooOOOO.OooOO0(methodDescriptor, "method must not be null");
            o000oOoO<?, ?> o000oooo2 = new o000oOoO<>(methodDescriptor, oooo0);
            o0OOOO0o.OooOOOO.OooO0oo(this.f26404OooO00o.equals(methodDescriptor.f26343OooO0OO), "Method name should be prefixed with service name and separated with '/'. Expected service name: '%s'. Actual fully qualifed method name: '%s'.", this.f26404OooO00o, methodDescriptor.f26342OooO0O0);
            String str = methodDescriptor.f26342OooO0O0;
            o0OOOO0o.OooOOOO.OooOOOo(!this.f26406OooO0OO.containsKey(str), "Method by same name already registered: %s", str);
            this.f26406OooO0OO.put(str, o000oooo2);
            return this;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final o0OoOo0 OooO0O0() {
            o00O0O o00o0o2 = this.f26405OooO0O0;
            if (o00o0o2 == null) {
                ArrayList arrayList = new ArrayList(this.f26406OooO0OO.size());
                Iterator<o000oOoO<?, ?>> it = this.f26406OooO0OO.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().f26396OooO00o);
                }
                o00O0O.OooO00o oooO00o = new o00O0O.OooO00o(this.f26404OooO00o);
                oooO00o.f26401OooO0O0.addAll(arrayList);
                o00o0o2 = new o00O0O(oooO00o);
            }
            HashMap map = new HashMap(this.f26406OooO0OO);
            for (MethodDescriptor<?, ?> methodDescriptor : o00o0o2.f26399OooO0O0) {
                o000oOoO o000oooo2 = (o000oOoO) map.remove(methodDescriptor.f26342OooO0O0);
                if (o000oooo2 == null) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("No method bound for descriptor entry ");
                    sbOooO0o0.append(methodDescriptor.f26342OooO0O0);
                    throw new IllegalStateException(sbOooO0o0.toString());
                }
                if (o000oooo2.f26396OooO00o != methodDescriptor) {
                    throw new IllegalStateException(p058o0000OoO.OooO.OooO00o(OooO00o.OooO00o.OooO0o0("Bound method for "), methodDescriptor.f26342OooO0O0, " not same instance as method in service descriptor"));
                }
            }
            if (map.size() <= 0) {
                return new o0OoOo0(o00o0o2, this.f26406OooO0OO, null);
            }
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("No entry in descriptor matching bound method ");
            sbOooO0o1.append(((o000oOoO) map.values().iterator().next()).f26396OooO00o.f26342OooO0O0);
            throw new IllegalStateException(sbOooO0o1.toString());
        }
    }

    public o0OoOo0(o00O0O o00o0o2, Map map, OooO00o oooO00o) {
        this.f26403OooO00o = Collections.unmodifiableMap(new HashMap(map));
    }
}
