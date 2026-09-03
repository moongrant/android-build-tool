package com.google.firebase.components;

import android.util.Log;
import com.google.firebase.components.o00Ooo;
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
import p292o0O0OoOo.o00O00O;
import p298o0O0o00o.OooO0O0;
import p298o0O0o00o.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO implements OooO0OO, o00O00O {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooOOO0 f19812OooO0oO = new OooOOO0();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Oooo0 f19816OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOO0 f19817OooO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f19813OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f19814OooO0O0 = new HashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f19815OooO0OO = new HashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicReference<Boolean> f19818OooO0o0 = new AtomicReference<>();

    public OooOOOO(Executor executor, ArrayList arrayList, ArrayList arrayList2, OooOO0 oooOO1) {
        Oooo0 oooo0 = new Oooo0(executor);
        this.f19816OooO0Oo = oooo0;
        this.f19817OooO0o = oooOO1;
        ArrayList<OooO0O0> arrayList3 = new ArrayList();
        arrayList3.add(OooO0O0.OooO0O0(oooo0, Oooo0.class, o0O0o000.OooO0o.class, o0O0o000.OooO0OO.class));
        arrayList3.add(OooO0O0.OooO0O0(this, o00O00O.class, new Class[0]));
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
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((p298o0O0o00o.OooO0OO) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f19817OooO0o.OooO00o(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.f19813OooO00o.isEmpty()) {
                OooOo00.OooO00o(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f19813OooO00o.keySet());
                arrayList6.addAll(arrayList3);
                OooOo00.OooO00o(arrayList6);
            }
            for (final OooO0O0 oooO0O1 : arrayList3) {
                this.f19813OooO00o.put(oooO0O1, new o000oOoO(new p298o0O0o00o.OooO0OO() { // from class: com.google.firebase.components.OooOO0O
                    @Override // p298o0O0o00o.OooO0OO
                    public final Object get() {
                        OooOOOO oooOOOO = this.f19809OooO00o;
                        oooOOOO.getClass();
                        OooO0O0 oooO0O2 = oooO0O1;
                        return oooO0O2.f19798OooO0o.OooO0OO(new oo000o(oooO0O2, oooOOOO));
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
        Boolean bool = this.f19818OooO0o0.get();
        if (bool != null) {
            OooO0oO(this.f19813OooO00o, bool.booleanValue());
        }
    }

    public final ArrayList OooO(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OooO0O0 oooO0O0 = (OooO0O0) it.next();
            if (oooO0O0.f19799OooO0o0 == 0) {
                final p298o0O0o00o.OooO0OO oooO0OO = (p298o0O0o00o.OooO0OO) this.f19813OooO00o.get(oooO0O0);
                Iterator it2 = oooO0O0.f19795OooO0O0.iterator();
                while (it2.hasNext()) {
                    Qualified qualified = (Qualified) it2.next();
                    HashMap map = this.f19814OooO0O0;
                    if (map.containsKey(qualified)) {
                        final o00Ooo o00ooo2 = (o00Ooo) ((p298o0O0o00o.OooO0OO) map.get(qualified));
                        arrayList2.add(new Runnable() { // from class: o0OoOo0.o0O0O00
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // java.lang.Runnable
                            public final void run() {
                                OooO0O0.OooO00o<T> oooO00o;
                                o00Ooo o00ooo3 = (o00Ooo) o00ooo2;
                                OooO0OO<T> oooO0OO2 = (OooO0OO) oooO0OO;
                                if (o00ooo3.f19842OooO0O0 != o00Ooo.f19840OooO0Oo) {
                                    throw new IllegalStateException("provide() can be called only once.");
                                }
                                synchronized (o00ooo3) {
                                    oooO00o = o00ooo3.f19841OooO00o;
                                    o00ooo3.f19841OooO00o = null;
                                    o00ooo3.f19842OooO0O0 = oooO0OO2;
                                }
                                oooO00o.OooO00o(oooO0OO2);
                            }
                        });
                    } else {
                        map.put(qualified, oooO0OO);
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
    public final synchronized <T> p298o0O0o00o.OooO0OO<T> OooO0O0(Qualified<T> qualified) {
        try {
            if (qualified == null) {
                throw new NullPointerException("Null interface requested.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return (p298o0O0o00o.OooO0OO) this.f19814OooO0O0.get(qualified);
    }

    @Override // com.google.firebase.components.OooO0OO
    public final Set OooO0OO(Qualified qualified) {
        return (Set) OooOO0O(qualified).get();
    }

    @Override // com.google.firebase.components.OooO0OO
    public final Object OooO0Oo(Qualified qualified) {
        p298o0O0o00o.OooO0OO oooO0OOOooO0O0 = OooO0O0(qualified);
        if (oooO0OOOooO0O0 == null) {
            return null;
        }
        return oooO0OOOooO0O0.get();
    }

    @Override // com.google.firebase.components.OooO0OO
    public final <T> p298o0O0o00o.OooO0O0<T> OooO0o(Qualified<T> qualified) {
        p298o0O0o00o.OooO0OO<T> oooO0OOOooO0O0 = OooO0O0(qualified);
        if (oooO0OOOooO0O0 == null) {
            return new o00Ooo(o00Ooo.f19839OooO0OO, o00Ooo.f19840OooO0Oo);
        }
        return oooO0OOOooO0O0 instanceof o00Ooo ? (o00Ooo) oooO0OOOooO0O0 : new o00Ooo(null, oooO0OOOooO0O0);
    }

    @Override // com.google.firebase.components.OooO0OO
    public final p298o0O0o00o.OooO0OO OooO0o0(Class cls) {
        return OooO0O0(Qualified.OooO00o(cls));
    }

    public final void OooO0oO(Map<OooO0O0<?>, p298o0O0o00o.OooO0OO<?>> map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry<OooO0O0<?>, p298o0O0o00o.OooO0OO<?>> entry : map.entrySet()) {
            OooO0O0<?> key = entry.getKey();
            p298o0O0o00o.OooO0OO<?> value = entry.getValue();
            int i = key.f19797OooO0Oo;
            if (!(i == 1)) {
                if (!(i == 2) || !z) {
                }
            }
            value.get();
        }
        Oooo0 oooo0 = this.f19816OooO0Oo;
        synchronized (oooo0) {
            try {
                arrayDeque = oooo0.f19828OooO0O0;
                if (arrayDeque != null) {
                    oooo0.f19828OooO0O0 = null;
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
                oooo0.OooO0Oo((o0O0o000.OooO00o) it.next());
            }
        }
    }

    public final void OooO0oo() {
        for (OooO0O0 oooO0O0 : this.f19813OooO00o.keySet()) {
            for (OooOo oooOo : oooO0O0.f19796OooO0OO) {
                boolean z = oooOo.f19820OooO0O0 == 2;
                Qualified<?> qualified = oooOo.f19819OooO00o;
                if (z) {
                    HashMap map = this.f19815OooO0OO;
                    if (!map.containsKey(qualified)) {
                        map.put(qualified, new o0OoOo0(Collections.emptySet()));
                    }
                }
                HashMap map2 = this.f19814OooO0O0;
                if (map2.containsKey(qualified)) {
                    continue;
                } else {
                    int i = oooOo.f19820OooO0O0;
                    if (i == 1) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", oooO0O0, qualified));
                    }
                    if (!(i == 2)) {
                        map2.put(qualified, new o00Ooo(o00Ooo.f19839OooO0OO, o00Ooo.f19840OooO0Oo));
                    }
                }
            }
        }
    }

    public final ArrayList OooOO0() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        Iterator it = this.f19813OooO00o.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            OooO0O0 oooO0O0 = (OooO0O0) entry.getKey();
            if (!(oooO0O0.f19799OooO0o0 == 0)) {
                p298o0O0o00o.OooO0OO oooO0OO = (p298o0O0o00o.OooO0OO) entry.getValue();
                Iterator it2 = oooO0O0.f19795OooO0O0.iterator();
                while (it2.hasNext()) {
                    Qualified qualified = (Qualified) it2.next();
                    if (!map.containsKey(qualified)) {
                        map.put(qualified, new HashSet());
                    }
                    ((Set) map.get(qualified)).add(oooO0OO);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = this.f19815OooO0OO;
            if (map2.containsKey(key)) {
                o0OoOo0 o0oooo0 = (o0OoOo0) map2.get(entry2.getKey());
                Iterator it3 = ((Set) entry2.getValue()).iterator();
                while (it3.hasNext()) {
                    arrayList.add(new com.facebook.appevents.iap.OooO(1, o0oooo0, (p298o0O0o00o.OooO0OO) it3.next()));
                }
            } else {
                map2.put((Qualified) entry2.getKey(), new o0OoOo0((Set) ((Collection) entry2.getValue())));
            }
        }
        return arrayList;
    }

    public final synchronized <T> p298o0O0o00o.OooO0OO<Set<T>> OooOO0O(Qualified<T> qualified) {
        o0OoOo0 o0oooo0 = (o0OoOo0) this.f19815OooO0OO.get(qualified);
        if (o0oooo0 != null) {
            return o0oooo0;
        }
        return f19812OooO0oO;
    }
}
