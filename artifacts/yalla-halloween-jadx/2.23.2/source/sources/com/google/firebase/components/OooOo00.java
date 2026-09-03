package com.google.firebase.components;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p037OoooOo0.o00000O;
import p295o0O0Ooo.o0OO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 implements OooO0OO, o0OO00O {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooOOO0 f19345OooO0oO = new OooOOO0();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000oOoO f19349OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOO0 f19350OooO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f19346OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f19347OooO0O0 = new HashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f19348OooO0OO = new HashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicReference<Boolean> f19351OooO0o0 = new AtomicReference<>();

    public OooOo00(Executor executor, ArrayList arrayList, ArrayList arrayList2, OooOO0 oooOO1) {
        o000oOoO o000oooo2 = new o000oOoO(executor);
        this.f19349OooO0Oo = o000oooo2;
        this.f19350OooO0o = oooOO1;
        ArrayList<OooO0O0> arrayList3 = new ArrayList();
        arrayList3.add(OooO0O0.OooO0O0(o000oooo2, o000oOoO.class, o0O0o00O.OooO0o.class, o0O0o00O.OooO0OO.class));
        arrayList3.add(OooO0O0.OooO0O0(this, o0OO00O.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            OooO0O0 oooO0O0 = (OooO0O0) it.next();
            if (oooO0O0 != null) {
                arrayList3.add(oooO0O0);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((p301o0O0o0O.OooO0o) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f19350OooO0o.OooO00o(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.f19346OooO00o.isEmpty()) {
                OooOo.OooO00o(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f19346OooO00o.keySet());
                arrayList6.addAll(arrayList3);
                OooOo.OooO00o(arrayList6);
            }
            for (final OooO0O0 oooO0O1 : arrayList3) {
                this.f19346OooO00o.put(oooO0O1, new o0OoOo0(new p301o0O0o0O.OooO0o() { // from class: com.google.firebase.components.OooOO0O
                    @Override // p301o0O0o0O.OooO0o
                    public final Object get() {
                        OooOo00 oooOo00 = this.f19335OooO00o;
                        oooOo00.getClass();
                        OooO0O0 oooO0O2 = oooO0O1;
                        return oooO0O2.f19324OooO0o.OooO00o(new o00oO0o(oooO0O2, oooOo00));
                    }
                }));
            }
            arrayList5.addAll(OooO(arrayList3));
            arrayList5.addAll(OooOO0());
            OooO0oo();
        }
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        Boolean bool = this.f19351OooO0o0.get();
        if (bool != null) {
            OooO0oO(this.f19346OooO00o, bool.booleanValue());
        }
    }

    public final ArrayList OooO(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OooO0O0 oooO0O0 = (OooO0O0) it.next();
            int i = 1;
            if (oooO0O0.f19325OooO0o0 == 0) {
                p301o0O0o0O.OooO0o oooO0o = (p301o0O0o0O.OooO0o) this.f19346OooO00o.get(oooO0O0);
                Iterator it2 = oooO0O0.f19321OooO0O0.iterator();
                while (it2.hasNext()) {
                    Qualified qualified = (Qualified) it2.next();
                    HashMap map = this.f19347OooO0O0;
                    if (map.containsKey(qualified)) {
                        arrayList2.add(new o00000O(i, (oo000o) ((p301o0O0o0O.OooO0o) map.get(qualified)), oooO0o));
                    } else {
                        map.put(qualified, oooO0o);
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // com.google.firebase.components.OooO0OO
    public final Object OooO00o(Class cls) {
        return OooO0Oo(Qualified.OooO00o(cls));
    }

    @Override // com.google.firebase.components.OooO0OO
    public final synchronized <T> p301o0O0o0O.OooO0o<T> OooO0O0(Qualified<T> qualified) {
        try {
            if (qualified == null) {
                throw new NullPointerException("Null interface requested.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return (p301o0O0o0O.OooO0o) this.f19347OooO0O0.get(qualified);
    }

    @Override // com.google.firebase.components.OooO0OO
    public final Set OooO0OO(Qualified qualified) {
        return (Set) OooOO0O(qualified).get();
    }

    @Override // com.google.firebase.components.OooO0OO
    public final Object OooO0Oo(Qualified qualified) {
        p301o0O0o0O.OooO0o oooO0oOooO0O0 = OooO0O0(qualified);
        if (oooO0oOooO0O0 == null) {
            return null;
        }
        return oooO0oOooO0O0.get();
    }

    @Override // com.google.firebase.components.OooO0OO
    public final <T> p301o0O0o0O.OooO0OO<T> OooO0o(Qualified<T> qualified) {
        p301o0O0o0O.OooO0o<T> oooO0oOooO0O0 = OooO0O0(qualified);
        if (oooO0oOooO0O0 == null) {
            return new oo000o(oo000o.f19378OooO0OO, oo000o.f19379OooO0Oo);
        }
        return oooO0oOooO0O0 instanceof oo000o ? (oo000o) oooO0oOooO0O0 : new oo000o(null, oooO0oOooO0O0);
    }

    @Override // com.google.firebase.components.OooO0OO
    public final p301o0O0o0O.OooO0o OooO0o0(Class cls) {
        return OooO0O0(Qualified.OooO00o(cls));
    }

    public final void OooO0oO(Map<OooO0O0<?>, p301o0O0o0O.OooO0o<?>> map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry<OooO0O0<?>, p301o0O0o0O.OooO0o<?>> entry : map.entrySet()) {
            OooO0O0<?> key = entry.getKey();
            p301o0O0o0O.OooO0o<?> value = entry.getValue();
            int i = key.f19323OooO0Oo;
            if (!(i == 1)) {
                if (!(i == 2) || !z) {
                }
            }
            value.get();
        }
        o000oOoO o000oooo2 = this.f19349OooO0Oo;
        synchronized (o000oooo2) {
            try {
                arrayDeque = o000oooo2.f19360OooO0O0;
                if (arrayDeque != null) {
                    o000oooo2.f19360OooO0O0 = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                o000oooo2.OooO0Oo((o0O0o00O.OooO00o) it.next());
            }
        }
    }

    public final void OooO0oo() {
        for (OooO0O0 oooO0O0 : this.f19346OooO00o.keySet()) {
            for (Oooo000 oooo000 : oooO0O0.f19322OooO0OO) {
                boolean z = oooo000.f19355OooO0O0 == 2;
                Qualified<?> qualified = oooo000.f19354OooO00o;
                if (z) {
                    HashMap map = this.f19348OooO0OO;
                    if (!map.containsKey(qualified)) {
                        map.put(qualified, new o00O0O(Collections.emptySet()));
                    }
                }
                HashMap map2 = this.f19347OooO0O0;
                if (map2.containsKey(qualified)) {
                    continue;
                } else {
                    int i = oooo000.f19355OooO0O0;
                    if (i == 1) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", oooO0O0, qualified));
                    }
                    if (!(i == 2)) {
                        map2.put(qualified, new oo000o(oo000o.f19378OooO0OO, oo000o.f19379OooO0Oo));
                    }
                }
            }
        }
    }

    public final ArrayList OooOO0() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f19346OooO00o.entrySet()) {
            OooO0O0 oooO0O0 = (OooO0O0) entry.getKey();
            if (!(oooO0O0.f19325OooO0o0 == 0)) {
                p301o0O0o0O.OooO0o oooO0o = (p301o0O0o0O.OooO0o) entry.getValue();
                Iterator it = oooO0O0.f19321OooO0O0.iterator();
                while (it.hasNext()) {
                    Qualified qualified = (Qualified) it.next();
                    if (!map.containsKey(qualified)) {
                        map.put(qualified, new HashSet());
                    }
                    ((Set) map.get(qualified)).add(oooO0o);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = this.f19348OooO0OO;
            if (map2.containsKey(key)) {
                final o00O0O o00o0o2 = (o00O0O) map2.get(entry2.getKey());
                for (final p301o0O0o0O.OooO0o oooO0o2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: com.google.firebase.components.OooOOO
                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        @Override // java.lang.Runnable
                        public final void run() {
                            o00O0O o00o0o3 = o00o0o2;
                            p301o0O0o0O.OooO0o oooO0o3 = oooO0o2;
                            synchronized (o00o0o3) {
                                if (o00o0o3.f19363OooO0O0 == 0) {
                                    o00o0o3.f19362OooO00o.add((p301o0O0o0O.OooO0o<T>) oooO0o3);
                                } else {
                                    o00o0o3.f19363OooO0O0.add((T) oooO0o3.get());
                                }
                            }
                        }
                    });
                }
            } else {
                map2.put((Qualified) entry2.getKey(), new o00O0O((Set) ((Collection) entry2.getValue())));
            }
        }
        return arrayList;
    }

    public final synchronized <T> p301o0O0o0O.OooO0o<Set<T>> OooOO0O(Qualified<T> qualified) {
        o00O0O o00o0o2 = (o00O0O) this.f19348OooO0OO.get(qualified);
        if (o00o0o2 != null) {
            return o00o0o2;
        }
        return f19345OooO0oO;
    }
}
