package p357o0OOOo0O;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000O {

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final oo000o<?> f38325OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Set<OooO0O0> f38326OooO0O0 = new HashSet();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Set<OooO0O0> f38327OooO0OO = new HashSet();

        public OooO0O0(oo000o<?> oo000oVar) {
            this.f38325OooO00o = oo000oVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<o0OOOo0O.o000000O$OooO0O0>] */
        public final boolean OooO00o() {
            return this.f38327OooO0OO.isEmpty();
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Class<?> f38328OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f38329OooO0O0;

        public OooO0OO(Class cls, boolean z, OooO00o oooO00o) {
            this.f38328OooO00o = cls;
            this.f38329OooO0O0 = z;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return oooO0OO.f38328OooO00o.equals(this.f38328OooO00o) && oooO0OO.f38329OooO0O0 == this.f38329OooO0O0;
        }

        public final int hashCode() {
            return ((this.f38328OooO00o.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f38329OooO0O0).hashCode();
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.HashSet, java.util.Set<o0OOOo0O.o000000O$OooO0O0>] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.HashSet, java.util.Set<o0OOOo0O.o000000O$OooO0O0>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet, java.util.Set<o0OOOo0O.o000000O$OooO0O0>] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.HashSet, java.util.Set<o0OOOo0O.o000000O$OooO0O0>] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.HashSet, java.util.Set<o0OOOo0O.o000000O$OooO0O0>] */
    public static void OooO00o(List<oo000o<?>> list) {
        Set<OooO0O0> set;
        HashMap map = new HashMap(list.size());
        Iterator<oo000o<?>> it = list.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (OooO0O0 oooO0O0 : (Set) it2.next()) {
                        for (o00000 o00000Var : oooO0O0.f38325OooO00o.f38368OooO0OO) {
                            if ((o00000Var.f38323OooO0OO == 0) && (set = (Set) map.get(new OooO0OO(o00000Var.f38321OooO00o, o00000Var.OooO00o(), null))) != null) {
                                for (OooO0O0 oooO0O1 : set) {
                                    oooO0O0.f38326OooO0O0.add(oooO0O1);
                                    oooO0O1.f38327OooO0OO.add(oooO0O0);
                                }
                            }
                        }
                    }
                }
                HashSet<OooO0O0> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (OooO0O0 oooO0O2 : hashSet) {
                    if (oooO0O2.OooO00o()) {
                        hashSet2.add(oooO0O2);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    OooO0O0 oooO0O3 = (OooO0O0) hashSet2.iterator().next();
                    hashSet2.remove(oooO0O3);
                    i++;
                    for (OooO0O0 oooO0O4 : oooO0O3.f38326OooO0O0) {
                        oooO0O4.f38327OooO0OO.remove(oooO0O3);
                        if (oooO0O4.OooO00o()) {
                            hashSet2.add(oooO0O4);
                        }
                    }
                }
                if (i == list.size()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (OooO0O0 oooO0O5 : hashSet) {
                    if (!oooO0O5.OooO00o() && !oooO0O5.f38326OooO0O0.isEmpty()) {
                        arrayList.add(oooO0O5.f38325OooO00o);
                    }
                }
                throw new DependencyCycleException(arrayList);
            }
            oo000o<?> next = it.next();
            OooO0O0 oooO0O6 = new OooO0O0(next);
            for (Class<? super Object> cls : next.f38367OooO0O0) {
                boolean z = !next.OooO0O0();
                OooO0OO oooO0OO = new OooO0OO(cls, z, null);
                if (!map.containsKey(oooO0OO)) {
                    map.put(oooO0OO, new HashSet());
                }
                Set set2 = (Set) map.get(oooO0OO);
                if (!set2.isEmpty() && !z) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(oooO0O6);
            }
        }
    }
}
