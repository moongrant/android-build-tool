package io.grpc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f26398OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Collection<MethodDescriptor<?, ?>> f26399OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f26400OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public List<MethodDescriptor<?, ?>> f26401OooO0O0 = new ArrayList();

        public OooO00o(String str) {
            o0OOOO0o.OooOOOO.OooOO0(str, "name");
            this.f26400OooO00o = str;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<io.grpc.MethodDescriptor<?, ?>>] */
        public final OooO00o OooO00o(MethodDescriptor<?, ?> methodDescriptor) {
            ?? r0 = this.f26401OooO0O0;
            o0OOOO0o.OooOOOO.OooOO0(methodDescriptor, "method");
            r0.add(methodDescriptor);
            return this;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.Collection, java.util.List<io.grpc.MethodDescriptor<?, ?>>] */
    public o00O0O(OooO00o oooO00o) {
        String str = oooO00o.f26400OooO00o;
        this.f26398OooO00o = str;
        ?? r1 = oooO00o.f26401OooO0O0;
        HashSet hashSet = new HashSet(r1.size());
        for (MethodDescriptor methodDescriptor : r1) {
            o0OOOO0o.OooOOOO.OooOO0(methodDescriptor, "method");
            String str2 = methodDescriptor.f26343OooO0OO;
            o0OOOO0o.OooOOOO.OooO0oo(str.equals(str2), "service names %s != %s", str2, str);
            o0OOOO0o.OooOOOO.OooO0oO(hashSet.add(methodDescriptor.f26342OooO0O0), "duplicate name %s", methodDescriptor.f26342OooO0O0);
        }
        this.f26399OooO0O0 = Collections.unmodifiableList(new ArrayList(oooO00o.f26401OooO0O0));
    }

    public static OooO00o OooO00o(String str) {
        return new OooO00o(str);
    }

    public final String toString() {
        o0OOOO0o.OooOOO0.OooO00o oooO00oOooO0O0 = o0OOOO0o.OooOOO0.OooO0O0(this);
        oooO00oOooO0O0.OooO0OO("name", this.f26398OooO00o);
        oooO00oOooO0O0.OooO0OO("schemaDescriptor", null);
        oooO00oOooO0O0.OooO0OO("methods", this.f26399OooO0O0);
        oooO00oOooO0O0.f38241OooO0Oo = true;
        return oooO00oOooO0O0.toString();
    }
}
