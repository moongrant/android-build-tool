package p357o0OOOo0O;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.OooO;
import p373o0OOo0o0.o0000;
import p373o0OOo0o0.o00000O;
import p373o0OOo0o0.o00000OO;
import p373o0OOo0o0.o0000Ooo;
import p375o0OOo0oo.o0OOO0o;
import p375o0OOo0oo.o0ooOOo;
import p467o0OooOo.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo extends o00Oo0 implements o00O0000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<o0OOO0o<ComponentRegistrar>> f38356OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00000O f38358OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0Oo0oo f38359OooO0oO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<oo000o<?>, o0OOO0o<?>> f38353OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<Class<?>, o0OOO0o<?>> f38354OooO0O0 = new HashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<Class<?>, o0000Ooo<?>> f38355OooO0OO = new HashMap();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AtomicReference<Boolean> f38357OooO0o = new AtomicReference<>();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public o000OOo(Executor executor, Iterable iterable, Collection collection, o0Oo0oo o0oo0oo2, OooO00o oooO00o) {
        o00000O o00000o = new o00000O(executor);
        this.f38358OooO0o0 = o00000o;
        this.f38359OooO0oO = o0oo0oo2;
        ArrayList<oo000o<?>> arrayList = new ArrayList();
        arrayList.add(oo000o.OooO0OO(o00000o, o00000O.class, o0000.class, o0000Ooo.class));
        arrayList.add(oo000o.OooO0OO(this, o00O0000.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            oo000o oo000oVar = (oo000o) it.next();
            if (oo000oVar != null) {
                arrayList.add(oo000oVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        this.f38356OooO0Oo = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((o0OOO0o) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList.addAll(this.f38359OooO0oO.OooO00o(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.f38353OooO00o.isEmpty()) {
                o000000O.OooO00o(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.f38353OooO00o.keySet());
                arrayList4.addAll(arrayList);
                o000000O.OooO00o(arrayList4);
            }
            for (final oo000o<?> oo000oVar2 : arrayList) {
                this.f38353OooO00o.put(oo000oVar2, new o00000OO(new o0OOO0o() { // from class: o0OOOo0O.oo0o0Oo
                    @Override // p375o0OOo0oo.o0OOO0o
                    public final Object get() {
                        o000OOo o000ooo2 = this.f38379OooO00o;
                        oo000o oo000oVar3 = oo000oVar2;
                        Objects.requireNonNull(o000ooo2);
                        return oo000oVar3.f38370OooO0o.OooO00o(new o0000O0(oo000oVar3, o000ooo2));
                    }
                }));
            }
            arrayList3.addAll(OooO0oo(arrayList));
            arrayList3.addAll(OooO());
            OooO0oO();
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        Boolean bool = this.f38357OooO0o.get();
        if (bool != null) {
            OooO0o(this.f38353OooO00o, bool.booleanValue());
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final List<Runnable> OooO() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<oo000o<?>, o0OOO0o<?>> entry : this.f38353OooO00o.entrySet()) {
            oo000o<?> key = entry.getKey();
            if (!key.OooO0O0()) {
                o0OOO0o<?> value = entry.getValue();
                Iterator it = key.f38367OooO0O0.iterator();
                while (it.hasNext()) {
                    Class cls = (Class) it.next();
                    if (!map.containsKey(cls)) {
                        map.put(cls, new HashSet());
                    }
                    ((Set) map.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f38355OooO0OO.containsKey(entry2.getKey())) {
                o0000Ooo<?> o0000ooo = this.f38355OooO0OO.get(entry2.getKey());
                Iterator it2 = ((Set) entry2.getValue()).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new com.facebook.appevents.ondeviceprocessing.OooO00o(o0000ooo, (o0OOO0o) it2.next(), 1));
                }
            } else {
                this.f38355OooO0OO.put((Class) entry2.getKey(), new o0000Ooo<>((Set) ((Collection) entry2.getValue())));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, o0OOo0oo.o0OOO0o<?>>] */
    @Override // p357o0OOOo0O.o00oO0o
    public final synchronized <T> o0OOO0o<T> OooO0O0(Class<T> cls) {
        return (o0OOO0o) this.f38354OooO0O0.get(cls);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, o0OOOo0O.o0000Ooo<?>>] */
    @Override // p357o0OOOo0O.o00oO0o
    public final synchronized <T> o0OOO0o<Set<T>> OooO0OO(Class<T> cls) {
        o0000Ooo o0000ooo = (o0000Ooo) this.f38355OooO0OO.get(cls);
        if (o0000ooo != null) {
            return o0000ooo;
        }
        return new o0OOO0o() { // from class: o0OOOo0O.o0O0O00
            @Override // p375o0OOo0oo.o0OOO0o
            public final Object get() {
                return Collections.emptySet();
            }
        };
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayDeque, java.util.Queue<o0OOo0o0.o00000O<?>>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.util.concurrent.ConcurrentHashMap<o0OOo0o0.o00000OO<java.lang.Object>, java.util.concurrent.Executor>>] */
    public final void OooO0o(Map<oo000o<?>, o0OOO0o<?>> map, boolean z) {
        Queue<o00000O<?>> queue;
        Set<Map.Entry> setEmptySet;
        for (Map.Entry<oo000o<?>, o0OOO0o<?>> entry : map.entrySet()) {
            oo000o<?> key = entry.getKey();
            o0OOO0o<?> value = entry.getValue();
            int i = key.f38369OooO0Oo;
            if (!(i == 1)) {
                if (!(i == 2) || !z) {
                }
            }
            value.get();
        }
        o00000O o00000o = this.f38358OooO0o0;
        synchronized (o00000o) {
            try {
                queue = o00000o.f38331OooO0O0;
                if (queue != null) {
                    o00000o.f38331OooO0O0 = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            for (final o00000O<?> o00000o2 : queue) {
                Objects.requireNonNull(o00000o2);
                synchronized (o00000o) {
                    ?? r2 = o00000o.f38331OooO0O0;
                    if (r2 != 0) {
                        r2.add(o00000o2);
                    } else {
                        synchronized (o00000o) {
                            Map map2 = (Map) o00000o.f38330OooO00o.get(null);
                            setEmptySet = map2 == null ? Collections.emptySet() : map2.entrySet();
                        }
                        for (final Map.Entry entry2 : setEmptySet) {
                            ((Executor) entry2.getValue()).execute(new Runnable() { // from class: o0OOOo0O.o00000O0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Map.Entry entry3 = entry2;
                                    ((o00000OO) entry3.getKey()).OooO00o(o00000o2);
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    @Override // p357o0OOOo0O.o00oO0o
    public final <T> o0ooOOo<T> OooO0o0(Class<T> cls) {
        o0OOO0o<T> o0ooo0oOooO0O0 = OooO0O0(cls);
        if (o0ooo0oOooO0O0 == null) {
            return new o0000oo(OooO.f26407OooO0Oo, o0000O00.f38347OooO00o);
        }
        return o0ooo0oOooO0O0 instanceof o0000oo ? (o0000oo) o0ooo0oOooO0O0 : new o0000oo(null, o0ooo0oOooO0O0);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooO0oO() {
        for (oo000o<?> oo000oVar : this.f38353OooO00o.keySet()) {
            for (o00000 o00000Var : oo000oVar.f38368OooO0OO) {
                if (o00000Var.OooO00o() && !this.f38355OooO0OO.containsKey(o00000Var.f38321OooO00o)) {
                    this.f38355OooO0OO.put(o00000Var.f38321OooO00o, new o0000Ooo<>(Collections.emptySet()));
                } else if (this.f38354OooO0O0.containsKey(o00000Var.f38321OooO00o)) {
                    continue;
                } else {
                    if (o00000Var.f38322OooO0O0 == 1) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", oo000oVar, o00000Var.f38321OooO00o));
                    }
                    if (!o00000Var.OooO00o()) {
                        this.f38354OooO0O0.put(o00000Var.f38321OooO00o, new o0000oo(OooO.f26407OooO0Oo, o0000O00.f38347OooO00o));
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final List<Runnable> OooO0oo(List<oo000o<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (oo000o<?> oo000oVar : list) {
            if (oo000oVar.OooO0O0()) {
                final o0OOO0o<?> o0ooo0o2 = this.f38353OooO00o.get(oo000oVar);
                for (Class<? super Object> cls : oo000oVar.f38367OooO0O0) {
                    if (this.f38354OooO0O0.containsKey(cls)) {
                        final o0000oo o0000ooVar = (o0000oo) this.f38354OooO0O0.get(cls);
                        arrayList.add(new Runnable() { // from class: o0OOOo0O.o0OO00O
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
                                o0ooOOo.OooO00o<T> oooO00o;
                                o0000oo o0000ooVar2 = o0000ooVar;
                                o0OOO0o<T> o0ooo0o3 = o0ooo0o2;
                                if (o0000ooVar2.f38352OooO0O0 != o0000O00.f38347OooO00o) {
                                    throw new IllegalStateException("provide() can be called only once.");
                                }
                                synchronized (o0000ooVar2) {
                                    oooO00o = o0000ooVar2.f38351OooO00o;
                                    o0000ooVar2.f38351OooO00o = null;
                                    o0000ooVar2.f38352OooO0O0 = o0ooo0o3;
                                }
                                oooO00o.OooO0O0(o0ooo0o3);
                            }
                        });
                    } else {
                        this.f38354OooO0O0.put(cls, o0ooo0o2);
                    }
                }
            }
        }
        return arrayList;
    }
}
