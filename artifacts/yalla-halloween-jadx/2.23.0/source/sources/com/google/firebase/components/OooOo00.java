package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 {

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.google.firebase.components.OooO0O0<?> f19822OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final HashSet f19823OooO0O0 = new HashSet();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final HashSet f19824OooO0OO = new HashSet();

        public OooO00o(com.google.firebase.components.OooO0O0<?> oooO0O0) {
            this.f19822OooO00o = oooO0O0;
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Qualified<?> f19825OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f19826OooO0O0;

        public OooO0O0() {
            throw null;
        }

        public OooO0O0(Qualified qualified, boolean z) {
            this.f19825OooO00o = qualified;
            this.f19826OooO0O0 = z;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return oooO0O0.f19825OooO00o.equals(this.f19825OooO00o) && oooO0O0.f19826OooO0O0 == this.f19826OooO0O0;
        }

        public final int hashCode() {
            return ((this.f19825OooO00o.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f19826OooO0O0).hashCode();
        }
    }

    public static void OooO00o(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (OooO00o oooO00o : (Set) it2.next()) {
                        for (OooOo oooOo : oooO00o.f19822OooO00o.f19796OooO0OO) {
                            if (oooOo.f19821OooO0OO == 0) {
                                Set<OooO00o> set = (Set) map.get(new OooO0O0(oooOo.f19819OooO00o, oooOo.f19820OooO0O0 == 2));
                                if (set != null) {
                                    for (OooO00o oooO00o2 : set) {
                                        oooO00o.f19823OooO0O0.add(oooO00o2);
                                        oooO00o2.f19824OooO0OO.add(oooO00o);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<OooO00o> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (OooO00o oooO00o3 : hashSet) {
                    if (oooO00o3.f19824OooO0OO.isEmpty()) {
                        hashSet2.add(oooO00o3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    OooO00o oooO00o4 = (OooO00o) hashSet2.iterator().next();
                    hashSet2.remove(oooO00o4);
                    i++;
                    for (OooO00o oooO00o5 : oooO00o4.f19823OooO0O0) {
                        oooO00o5.f19824OooO0OO.remove(oooO00o4);
                        if (oooO00o5.f19824OooO0OO.isEmpty()) {
                            hashSet2.add(oooO00o5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (OooO00o oooO00o6 : hashSet) {
                    if (!oooO00o6.f19824OooO0OO.isEmpty() && !oooO00o6.f19823OooO0O0.isEmpty()) {
                        arrayList2.add(oooO00o6.f19822OooO00o);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
            com.google.firebase.components.OooO0O0 oooO0O0 = (com.google.firebase.components.OooO0O0) it.next();
            OooO00o oooO00o7 = new OooO00o(oooO0O0);
            Iterator it4 = oooO0O0.f19795OooO0O0.iterator();
            while (it4.hasNext()) {
                Qualified qualified = (Qualified) it4.next();
                boolean z = !(oooO0O0.f19799OooO0o0 == 0);
                OooO0O0 oooO0O1 = new OooO0O0(qualified, z);
                if (!map.containsKey(oooO0O1)) {
                    map.put(oooO0O1, new HashSet());
                }
                Set set2 = (Set) map.get(oooO0O1);
                if (!set2.isEmpty() && !z) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", qualified));
                }
                set2.add(oooO00o7);
            }
        }
    }
}
