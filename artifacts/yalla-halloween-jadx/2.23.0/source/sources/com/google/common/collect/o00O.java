package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Equivalence;
import com.google.common.collect.o00O.OooOOO;
import com.google.common.collect.o00O.Oooo0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.CheckForNull;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
public final class o00O<K, V, E extends OooOOO<K, V, E>, S extends Oooo0<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final OooO00o f19452OooOOO0 = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final transient OooOOOO<K, V, E, S> f19453OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final transient int f19454OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final transient Oooo0<K, V, E, S>[] f19455OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final transient int f19456OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f19457OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Equivalence<Object> f19458OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @CheckForNull
    public transient OooOo f19459OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @CheckForNull
    public transient o0ooOOo f19460OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @CheckForNull
    public transient OooOO0O f19461OooOO0o;

    public static final class OooO implements OooOOO<Object, Object, OooO> {
        public OooO() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o00O.OooOOO
        public final int OooO0O0() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o00O.OooOOO
        public final Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o00O.OooOOO
        public final OooOOO getNext() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o00O.OooOOO
        public final Object getValue() {
            throw new AssertionError();
        }
    }

    public class OooO00o implements o000OOo<Object, Object, OooO> {
        @Override // com.google.common.collect.o00O.o000OOo
        public final /* bridge */ /* synthetic */ OooOOO OooO00o() {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.o00O.o000OOo
        public final o000OOo OooO0O0(ReferenceQueue referenceQueue, o0O0O00 o0o0o00) {
            return this;
        }

        @Override // com.google.common.collect.o00O.o000OOo
        public final void clear() {
        }

        @Override // com.google.common.collect.o00O.o000OOo
        public final Object get() {
            return null;
        }
    }

    public static abstract class OooO0O0<K, V> extends o0000OO0<K, V> implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o0OoOo0 f19462OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Equivalence<Object> f19463OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final o0OoOo0 f19464OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f19465OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public transient ConcurrentMap<K, V> f19466OooO0oo;

        public OooO0O0(o0OoOo0 o0oooo0, o0OoOo0 o0oooo1, Equivalence equivalence, int i, ConcurrentMap concurrentMap) {
            this.f19462OooO0Oo = o0oooo0;
            this.f19464OooO0o0 = o0oooo1;
            this.f19463OooO0o = equivalence;
            this.f19465OooO0oO = i;
            this.f19466OooO0oo = concurrentMap;
        }

        @Override // com.google.common.collect.o000, com.google.common.collect.o000Oo0
        public final Object OooO00o() {
            return this.f19466OooO0oo;
        }

        @Override // com.google.common.collect.o000
        /* JADX INFO: renamed from: OooO0O0 */
        public final Map OooO00o() {
            return this.f19466OooO0oo;
        }
    }

    public static abstract class OooO0OO<K, V, E extends OooOOO<K, V, E>> implements OooOOO<K, V, E> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final K f19467OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f19468OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @CheckForNull
        public final E f19469OooO0OO;

        public OooO0OO(K k, int i, @CheckForNull E e) {
            this.f19467OooO00o = k;
            this.f19468OooO0O0 = i;
            this.f19469OooO0OO = e;
        }

        @Override // com.google.common.collect.o00O.OooOOO
        public final int OooO0O0() {
            return this.f19468OooO0O0;
        }

        @Override // com.google.common.collect.o00O.OooOOO
        public final K getKey() {
            return this.f19467OooO00o;
        }

        @Override // com.google.common.collect.o00O.OooOOO
        public final E getNext() {
            return this.f19469OooO0OO;
        }
    }

    public static abstract class OooO0o<K, V, E extends OooOOO<K, V, E>> extends WeakReference<K> implements OooOOO<K, V, E> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f19470OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @CheckForNull
        public final E f19471OooO0O0;

        public OooO0o(ReferenceQueue<K> referenceQueue, K k, int i, @CheckForNull E e) {
            super(k, referenceQueue);
            this.f19470OooO00o = i;
            this.f19471OooO0O0 = e;
        }

        @Override // com.google.common.collect.o00O.OooOOO
        public final int OooO0O0() {
            return this.f19470OooO00o;
        }

        @Override // com.google.common.collect.o00O.OooOOO
        public final K getKey() {
            return get();
        }

        @Override // com.google.common.collect.o00O.OooOOO
        public final E getNext() {
            return this.f19471OooO0O0;
        }
    }

    public final class OooOO0 extends o00O<K, V, E, S>.OooOOO0<Map.Entry<K, V>> {
        @Override // java.util.Iterator
        public final Object next() {
            return OooO0OO();
        }
    }

    public final class OooOO0O extends Oooo000<Map.Entry<K, V>> {
        public OooOO0O() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            o00O.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            o00O o00o2;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = (o00o2 = o00O.this).get(key)) != null && o00o2.f19453OooO.OooO0OO().OooO00o().OooO0OO(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return o00O.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new OooOO0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && o00O.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return o00O.this.size();
        }
    }

    public interface OooOOO<K, V, E extends OooOOO<K, V, E>> {
        int OooO0O0();

        K getKey();

        E getNext();

        V getValue();
    }

    public abstract class OooOOO0<T> implements Iterator<T> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @CheckForNull
        public o00O<K, V, E, S>.o000000O f19473OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f19474OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @CheckForNull
        public Oooo0<K, V, E, S> f19475OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f19476OooO0o0 = -1;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @CheckForNull
        public AtomicReferenceArray<E> f19477OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @CheckForNull
        public E f19478OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @CheckForNull
        public o00O<K, V, E, S>.o000000O f19479OooOO0;

        public OooOOO0() {
            this.f19474OooO0Oo = o00O.this.f19455OooO0o.length - 1;
            OooO00o();
        }

        public final void OooO00o() {
            boolean z;
            this.f19473OooO = null;
            E e = this.f19478OooO0oo;
            if (e == null) {
                z = false;
                break;
            }
            while (true) {
                E e2 = (E) e.getNext();
                this.f19478OooO0oo = e2;
                if (e2 == null) {
                    z = false;
                    break;
                } else {
                    if (OooO0O0(e2)) {
                        z = true;
                        break;
                    }
                    e = this.f19478OooO0oo;
                }
            }
            if (z || OooO0Oo()) {
                return;
            }
            while (true) {
                int i = this.f19474OooO0Oo;
                if (i < 0) {
                    return;
                }
                Oooo0<K, V, E, S>[] oooo0Arr = o00O.this.f19455OooO0o;
                this.f19474OooO0Oo = i - 1;
                Oooo0<K, V, E, S> oooo0 = oooo0Arr[i];
                this.f19475OooO0o = oooo0;
                if (oooo0.f19486OooO0o0 != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f19475OooO0o.f19488OooO0oo;
                    this.f19477OooO0oO = atomicReferenceArray;
                    this.f19476OooO0o0 = atomicReferenceArray.length() - 1;
                    if (OooO0Oo()) {
                        return;
                    }
                }
            }
        }

        public final boolean OooO0O0(E e) {
            Oooo0<K, V, E, S> oooo0;
            o00O o00o2 = o00O.this;
            try {
                Object key = e.getKey();
                o00o2.getClass();
                Object value = e.getKey() == null ? null : e.getValue();
                if (value == null) {
                    return false;
                }
                this.f19473OooO = new o000000O(key, value);
                return true;
            } finally {
                this.f19475OooO0o.OooO0oO();
            }
        }

        public final o00O<K, V, E, S>.o000000O OooO0OO() {
            o00O<K, V, E, S>.o000000O o000000o2 = this.f19473OooO;
            if (o000000o2 == null) {
                throw new NoSuchElementException();
            }
            this.f19479OooOO0 = o000000o2;
            OooO00o();
            return this.f19479OooOO0;
        }

        public final boolean OooO0Oo() {
            while (true) {
                int i = this.f19476OooO0o0;
                boolean z = false;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f19477OooO0oO;
                this.f19476OooO0o0 = i - 1;
                E e = atomicReferenceArray.get(i);
                this.f19478OooO0oo = e;
                if (e != null) {
                    if (!OooO0O0(e)) {
                        E e2 = this.f19478OooO0oo;
                        if (e2 != null) {
                            while (true) {
                                E e3 = (E) e2.getNext();
                                this.f19478OooO0oo = e3;
                                if (e3 == null) {
                                    break;
                                }
                                if (OooO0O0(e3)) {
                                    z = true;
                                    break;
                                }
                                e2 = this.f19478OooO0oo;
                            }
                        }
                        if (z) {
                        }
                    }
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f19473OooO != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            com.google.common.collect.oo000o.OooO0Oo(this.f19479OooOO0 != null);
            o00O.this.remove(this.f19479OooOO0.f19490OooO0Oo);
            this.f19479OooOO0 = null;
        }
    }

    public interface OooOOOO<K, V, E extends OooOOO<K, V, E>, S extends Oooo0<K, V, E, S>> {
        Oooo0 OooO00o(o00O o00o2, int i);

        E OooO0O0(S s, E e, @CheckForNull E e2);

        o0OoOo0 OooO0OO();

        void OooO0Oo(S s, E e, V v);

        o0OoOo0 OooO0o();

        E OooO0o0(S s, K k, int i, @CheckForNull E e);
    }

    public final class OooOo extends Oooo000<K> {
        public OooOo() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            o00O.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return o00O.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return o00O.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new OooOo00();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return o00O.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return o00O.this.size();
        }
    }

    public final class OooOo00 extends o00O<K, V, E, S>.OooOOO0<K> {
        @Override // java.util.Iterator
        public final K next() {
            return OooO0OO().f19490OooO0Oo;
        }
    }

    public static abstract class Oooo0<K, V, E extends OooOOO<K, V, E>, S extends Oooo0<K, V, E, S>> extends ReentrantLock {

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final /* synthetic */ int f19482OooOO0 = 0;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final AtomicInteger f19483OooO = new AtomicInteger();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Weak
        public final o00O<K, V, E, S> f19484OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f19485OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public volatile int f19486OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f19487OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @CheckForNull
        public volatile AtomicReferenceArray<E> f19488OooO0oo;

        public Oooo0(o00O o00o2, int i) {
            this.f19484OooO0Oo = o00o2;
            AtomicReferenceArray<E> atomicReferenceArray = new AtomicReferenceArray<>(i);
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f19487OooO0oO = length;
            if (length == -1) {
                this.f19487OooO0oO = length + 1;
            }
            this.f19488OooO0oo = atomicReferenceArray;
        }

        @GuardedBy("this")
        public final E OooO(E e, E e2) {
            int i = this.f19486OooO0o0;
            E e3 = (E) e2.getNext();
            while (e != e2) {
                OooOOO oooOOOOooO0O0 = this.f19484OooO0Oo.f19453OooO.OooO0O0(OooOO0O(), e, e3);
                if (oooOOOOooO0O0 != null) {
                    e3 = (E) oooOOOOooO0O0;
                } else {
                    i--;
                }
                e = (E) e.getNext();
            }
            this.f19486OooO0o0 = i;
            return e3;
        }

        @GuardedBy("this")
        public final void OooO00o(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                OooOOO oooOOO = (OooOOO) referencePoll;
                o00O<K, V, E, S> o00o2 = this.f19484OooO0Oo;
                o00o2.getClass();
                int iOooO0O0 = oooOOO.OooO0O0();
                Oooo0<K, V, E, S> oooo0OooO0OO = o00o2.OooO0OO(iOooO0O0);
                oooo0OooO0OO.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = oooo0OooO0OO.f19488OooO0oo;
                    int length = iOooO0O0 & (atomicReferenceArray.length() - 1);
                    E e = atomicReferenceArray.get(length);
                    for (OooOOO next = e; next != null; next = next.getNext()) {
                        if (next == oooOOO) {
                            oooo0OooO0OO.f19485OooO0o++;
                            OooOOO oooOOOOooO = oooo0OooO0OO.OooO(e, next);
                            int i2 = oooo0OooO0OO.f19486OooO0o0 - 1;
                            atomicReferenceArray.set(length, (E) oooOOOOooO);
                            oooo0OooO0OO.f19486OooO0o0 = i2;
                            break;
                        }
                    }
                    oooo0OooO0OO.unlock();
                    i++;
                } catch (Throwable th) {
                    oooo0OooO0OO.unlock();
                    throw th;
                }
            } while (i != 16);
        }

        @GuardedBy("this")
        public final void OooO0O0(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                o000OOo<K, V, E> o000ooo2 = (o000OOo) referencePoll;
                o00O<K, V, E, S> o00o2 = this.f19484OooO0Oo;
                o00o2.getClass();
                OooOOO oooOOOOooO00o = o000ooo2.OooO00o();
                int iOooO0O0 = oooOOOOooO00o.OooO0O0();
                Oooo0<K, V, E, S> oooo0OooO0OO = o00o2.OooO0OO(iOooO0O0);
                Object key = oooOOOOooO00o.getKey();
                oooo0OooO0OO.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = oooo0OooO0OO.f19488OooO0oo;
                    int length = (atomicReferenceArray.length() - 1) & iOooO0O0;
                    E e = atomicReferenceArray.get(length);
                    for (OooOOO next = e; next != null; next = next.getNext()) {
                        Object key2 = next.getKey();
                        if (next.OooO0O0() == iOooO0O0 && key2 != null && oooo0OooO0OO.f19484OooO0Oo.f19458OooO0oo.OooO0OO(key, key2)) {
                            if (((o0O0O00) next).OooO00o() != o000ooo2) {
                                break;
                            }
                            oooo0OooO0OO.f19485OooO0o++;
                            OooOOO oooOOOOooO = oooo0OooO0OO.OooO(e, next);
                            int i2 = oooo0OooO0OO.f19486OooO0o0 - 1;
                            atomicReferenceArray.set(length, (E) oooOOOOooO);
                            oooo0OooO0OO.f19486OooO0o0 = i2;
                            break;
                        }
                    }
                    oooo0OooO0OO.unlock();
                    i++;
                } catch (Throwable th) {
                    oooo0OooO0OO.unlock();
                    throw th;
                }
            } while (i != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @GuardedBy("this")
        public final void OooO0OO() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f19488OooO0oo;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.f19486OooO0o0;
            AtomicReferenceArray<E> atomicReferenceArray2 = (AtomicReferenceArray<E>) new AtomicReferenceArray(length << 1);
            this.f19487OooO0oO = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                E next = atomicReferenceArray.get(i2);
                if (next != null) {
                    OooOOO next2 = next.getNext();
                    int iOooO0O0 = next.OooO0O0() & length2;
                    if (next2 == null) {
                        atomicReferenceArray2.set(iOooO0O0, next);
                    } else {
                        OooOOO oooOOO = next;
                        while (next2 != null) {
                            int iOooO0O1 = next2.OooO0O0() & length2;
                            if (iOooO0O1 != iOooO0O0) {
                                oooOOO = next2;
                                iOooO0O0 = iOooO0O1;
                            }
                            next2 = next2.getNext();
                        }
                        atomicReferenceArray2.set(iOooO0O0, oooOOO);
                        while (next != oooOOO) {
                            int iOooO0O2 = next.OooO0O0() & length2;
                            OooOOO oooOOOOooO0O0 = this.f19484OooO0Oo.f19453OooO.OooO0O0(OooOO0O(), next, (OooOOO) atomicReferenceArray2.get(iOooO0O2));
                            if (oooOOOOooO0O0 != null) {
                                atomicReferenceArray2.set(iOooO0O2, oooOOOOooO0O0);
                            } else {
                                i--;
                            }
                            next = next.getNext();
                        }
                    }
                }
            }
            this.f19488OooO0oo = atomicReferenceArray2;
            this.f19486OooO0o0 = i;
        }

        public final OooOOO OooO0Oo(int i, Object obj) {
            if (this.f19486OooO0o0 != 0) {
                AtomicReferenceArray<E> atomicReferenceArray = this.f19488OooO0oo;
                for (E next = atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); next != null; next = next.getNext()) {
                    if (next.OooO0O0() == i) {
                        Object key = next.getKey();
                        if (key == null) {
                            OooOOO0();
                        } else if (this.f19484OooO0Oo.f19458OooO0oo.OooO0OO(obj, key)) {
                            return next;
                        }
                    }
                }
            }
            return null;
        }

        @GuardedBy("this")
        public void OooO0o() {
        }

        public void OooO0o0() {
        }

        public final void OooO0oO() {
            if ((this.f19483OooO.incrementAndGet() & 63) == 0) {
                OooOO0();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object OooO0oo(int i, Object obj, boolean z, Object obj2) {
            lock();
            try {
                OooOO0();
                int i2 = this.f19486OooO0o0 + 1;
                if (i2 > this.f19487OooO0oO) {
                    OooO0OO();
                    i2 = this.f19486OooO0o0 + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f19488OooO0oo;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (OooOOO next = e; next != null; next = next.getNext()) {
                    Object key = next.getKey();
                    if (next.OooO0O0() == i && key != null && this.f19484OooO0Oo.f19458OooO0oo.OooO0OO(obj, key)) {
                        Object value = next.getValue();
                        if (value == null) {
                            this.f19485OooO0o++;
                            OooOO0o(next, obj2);
                            this.f19486OooO0o0 = this.f19486OooO0o0;
                            return null;
                        }
                        if (z) {
                            return value;
                        }
                        this.f19485OooO0o++;
                        OooOO0o(next, obj2);
                        return value;
                    }
                }
                this.f19485OooO0o++;
                OooOOO oooOOOOooO0o0 = this.f19484OooO0Oo.f19453OooO.OooO0o0(OooOO0O(), obj, i, e);
                OooOO0o(oooOOOOooO0o0, obj2);
                atomicReferenceArray.set(length, (E) oooOOOOooO0o0);
                this.f19486OooO0o0 = i2;
                return null;
            } finally {
                unlock();
            }
        }

        public final void OooOO0() {
            if (tryLock()) {
                try {
                    OooO0o();
                    this.f19483OooO.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract S OooOO0O();

        public final void OooOO0o(E e, V v) {
            this.f19484OooO0Oo.f19453OooO.OooO0Oo(OooOO0O(), e, v);
        }

        public final void OooOOO0() {
            if (tryLock()) {
                try {
                    OooO0o();
                } finally {
                    unlock();
                }
            }
        }
    }

    public static abstract class Oooo000<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return o00O.OooO00o(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) o00O.OooO00o(this).toArray(tArr);
        }
    }

    public static final class o000000<K, V, E extends OooOOO<K, V, E>> extends WeakReference<V> implements o000OOo<K, V, E> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Weak
        public final E f19489OooO00o;

        public o000000(ReferenceQueue<V> referenceQueue, V v, E e) {
            super(v, referenceQueue);
            this.f19489OooO00o = e;
        }

        @Override // com.google.common.collect.o00O.o000OOo
        public final E OooO00o() {
            return this.f19489OooO00o;
        }

        @Override // com.google.common.collect.o00O.o000OOo
        public final o000OOo OooO0O0(ReferenceQueue referenceQueue, o0O0O00 o0o0o00) {
            return new o000000(referenceQueue, get(), o0o0o00);
        }
    }

    public final class o000000O extends com.google.common.collect.OooOOO0<K, V> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final K f19490OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public V f19492OooO0o0;

        public o000000O(K k, V v) {
            this.f19490OooO0Oo = k;
            this.f19492OooO0o0 = v;
        }

        @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
        public final boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f19490OooO0Oo.equals(entry.getKey()) && this.f19492OooO0o0.equals(entry.getValue());
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f19490OooO0Oo;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f19492OooO0o0;
        }

        @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
        public final int hashCode() {
            return this.f19490OooO0Oo.hashCode() ^ this.f19492OooO0o0.hashCode();
        }

        @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = (V) o00O.this.put(this.f19490OooO0Oo, v);
            this.f19492OooO0o0 = v;
            return v2;
        }
    }

    public interface o000OOo<K, V, E extends OooOOO<K, V, E>> {
        E OooO00o();

        o000OOo OooO0O0(ReferenceQueue referenceQueue, o0O0O00 o0o0o00);

        void clear();

        @CheckForNull
        V get();
    }

    public static final class o000oOoO<K, V> extends OooO0O0<K, V> {
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            int i = objectInputStream.readInt();
            oo0oOO0 oo0ooo0 = new oo0oOO0();
            int i2 = oo0ooo0.f19695OooO0O0;
            if (!(i2 == -1)) {
                throw new IllegalStateException(com.google.common.base.oo0o0Oo.OooO00o("initial capacity was already set to %s", Integer.valueOf(i2)));
            }
            com.google.common.base.o000oOoO.OooO0Oo(i >= 0);
            oo0ooo0.f19695OooO0O0 = i;
            o0OoOo0 o0oooo0 = oo0ooo0.f19697OooO0Oo;
            com.google.common.base.o000oOoO.OooOO0o("Key strength was already set to %s", o0oooo0, o0oooo0 == null);
            o0OoOo0 o0oooo1 = this.f19462OooO0Oo;
            o0oooo1.getClass();
            oo0ooo0.f19697OooO0Oo = o0oooo1;
            o0OoOo0 o0oooo2 = o0OoOo0.STRONG;
            if (o0oooo1 != o0oooo2) {
                oo0ooo0.f19694OooO00o = true;
            }
            o0OoOo0 o0oooo3 = oo0ooo0.f19699OooO0o0;
            com.google.common.base.o000oOoO.OooOO0o("Value strength was already set to %s", o0oooo3, o0oooo3 == null);
            o0OoOo0 o0oooo4 = this.f19464OooO0o0;
            o0oooo4.getClass();
            oo0ooo0.f19699OooO0o0 = o0oooo4;
            if (o0oooo4 != o0oooo2) {
                oo0ooo0.f19694OooO00o = true;
            }
            Equivalence<Object> equivalence = oo0ooo0.f19698OooO0o;
            com.google.common.base.o000oOoO.OooOO0o("key equivalence was already set to %s", equivalence, equivalence == null);
            Equivalence<Object> equivalence2 = this.f19463OooO0o;
            equivalence2.getClass();
            oo0ooo0.f19698OooO0o = equivalence2;
            oo0ooo0.f19694OooO00o = true;
            int i3 = oo0ooo0.f19696OooO0OO;
            if (!(i3 == -1)) {
                throw new IllegalStateException(com.google.common.base.oo0o0Oo.OooO00o("concurrency level was already set to %s", Integer.valueOf(i3)));
            }
            int i4 = this.f19465OooO0oO;
            com.google.common.base.o000oOoO.OooO0Oo(i4 > 0);
            oo0ooo0.f19696OooO0OO = i4;
            this.f19466OooO0oo = oo0ooo0.OooO0O0();
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                } else {
                    this.f19466OooO0oo.put((K) object, (V) objectInputStream.readObject());
                }
            }
        }

        private Object readResolve() {
            return this.f19466OooO0oo;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeInt(this.f19466OooO0oo.size());
            for (Map.Entry<K, V> entry : this.f19466OooO0oo.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    public static final class o00O0O<K, V> extends OooO0OO<K, V, o00O0O<K, V>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @CheckForNull
        public volatile V f19493OooO0Oo;

        public static final class OooO00o<K, V> implements OooOOOO<K, V, o00O0O<K, V>, o00Oo0<K, V>> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO00o<?, ?> f19494OooO00o = new OooO00o<>();

            @Override // com.google.common.collect.o00O.OooOOOO
            public final Oooo0 OooO00o(o00O o00o2, int i) {
                return new o00Oo0(o00o2, i);
            }

            @Override // com.google.common.collect.o00O.OooOOOO
            public final OooOOO OooO0O0(Oooo0 oooo0, OooOOO oooOOO, @CheckForNull OooOOO oooOOO2) {
                o00O0O o00o0o2 = (o00O0O) oooOOO;
                o00O0O o00o0o3 = new o00O0O(o00o0o2.f19467OooO00o, o00o0o2.f19468OooO0O0, (o00O0O) oooOOO2);
                o00o0o3.f19493OooO0Oo = o00o0o2.f19493OooO0Oo;
                return o00o0o3;
            }

            @Override // com.google.common.collect.o00O.OooOOOO
            public final o0OoOo0 OooO0OO() {
                return o0OoOo0.STRONG;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.o00O.OooOOOO
            public final void OooO0Oo(Oooo0 oooo0, OooOOO oooOOO, Object obj) {
                ((o00O0O) oooOOO).f19493OooO0Oo = obj;
            }

            @Override // com.google.common.collect.o00O.OooOOOO
            public final o0OoOo0 OooO0o() {
                return o0OoOo0.STRONG;
            }

            @Override // com.google.common.collect.o00O.OooOOOO
            public final OooOOO OooO0o0(Oooo0 oooo0, Object obj, int i, @CheckForNull OooOOO oooOOO) {
                return new o00O0O(obj, i, (o00O0O) oooOOO);
            }
        }

        public o00O0O(K k, int i, @CheckForNull o00O0O<K, V> o00o0o2) {
            super(k, i, o00o0o2);
            this.f19493OooO0Oo = null;
        }

        @Override // com.google.common.collect.o00O.OooOOO
        @CheckForNull
        public final V getValue() {
            return this.f19493OooO0Oo;
        }
    }

    public static final class o00Oo0<K, V> extends Oooo0<K, V, o00O0O<K, V>, o00Oo0<K, V>> {
        @Override // com.google.common.collect.o00O.Oooo0
        public final Oooo0 OooOO0O() {
            return this;
        }
    }

    public static final class o00Ooo<K, V> extends OooO0OO<K, V, o00Ooo<K, V>> implements o0O0O00<K, V, o00Ooo<K, V>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public volatile o000OOo<K, V, o00Ooo<K, V>> f19495OooO0Oo;

        public static final class OooO00o<K, V> implements OooOOOO<K, V, o00Ooo<K, V>, oo000o<K, V>> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO00o<?, ?> f19496OooO00o = new OooO00o<>();

            @Override // com.google.common.collect.o00O.OooOOOO
            public final Oooo0 OooO00o(o00O o00o2, int i) {
                return new oo000o(o00o2, i);
            }

            @Override // com.google.common.collect.o00O.OooOOOO
            public final OooOOO OooO0O0(Oooo0 oooo0, OooOOO oooOOO, @CheckForNull OooOOO oooOOO2) {
                oo000o oo000oVar = (oo000o) oooo0;
                o00Ooo o00ooo2 = (o00Ooo) oooOOO;
                o00Ooo o00ooo3 = (o00Ooo) oooOOO2;
                int i = Oooo0.f19482OooOO0;
                if (o00ooo2.getValue() == null) {
                    return null;
                }
                ReferenceQueue<V> referenceQueue = oo000oVar.f19503OooOO0O;
                o00Ooo o00ooo4 = new o00Ooo(o00ooo2.f19467OooO00o, o00ooo2.f19468OooO0O0, o00ooo3);
                o00ooo4.f19495OooO0Oo = o00ooo2.f19495OooO0Oo.OooO0O0(referenceQueue, o00ooo4);
                return o00ooo4;
            }

            @Override // com.google.common.collect.o00O.OooOOOO
            public final o0OoOo0 OooO0OO() {
                return o0OoOo0.WEAK;
            }

            @Override // com.google.common.collect.o00O.OooOOOO
            public final void OooO0Oo(Oooo0 oooo0, OooOOO oooOOO, Object obj) {
                o00Ooo o00ooo2 = (o00Ooo) oooOOO;
                ReferenceQueue<V> referenceQueue = ((oo000o) oooo0).f19503OooOO0O;
                o000OOo<K, V, o00Ooo<K, V>> o000ooo2 = o00ooo2.f19495OooO0Oo;
                o00ooo2.f19495OooO0Oo = new o000000(referenceQueue, obj, o00ooo2);
                o000ooo2.clear();
            }

            @Override // com.google.common.collect.o00O.OooOOOO
            public final o0OoOo0 OooO0o() {
                return o0OoOo0.STRONG;
            }

            @Override // com.google.common.collect.o00O.OooOOOO
            public final OooOOO OooO0o0(Oooo0 oooo0, Object obj, int i, @CheckForNull OooOOO oooOOO) {
                return new o00Ooo(obj, i, (o00Ooo) oooOOO);
            }
        }

        public o00Ooo(K k, int i, @CheckForNull o00Ooo<K, V> o00ooo2) {
            super(k, i, o00ooo2);
            this.f19495OooO0Oo = o00O.f19452OooOOO0;
        }

        @Override // com.google.common.collect.o00O.o0O0O00
        public final o000OOo<K, V, o00Ooo<K, V>> OooO00o() {
            return this.f19495OooO0Oo;
        }

        @Override // com.google.common.collect.o00O.OooOOO
        public final V getValue() {
            return this.f19495OooO0Oo.get();
        }
    }

    public final class o00oO0o extends o00O<K, V, E, S>.OooOOO0<V> {
        @Override // java.util.Iterator
        public final V next() {
            return OooO0OO().f19492OooO0o0;
        }
    }

    public interface o0O0O00<K, V, E extends OooOOO<K, V, E>> extends OooOOO<K, V, E> {
        o000OOo<K, V, E> OooO00o();
    }

    public static final class o0OO00O<K, V> extends OooO0o<K, V, o0OO00O<K, V>> implements o0O0O00<K, V, o0OO00O<K, V>> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public volatile o000OOo<K, V, o0OO00O<K, V>> f19497OooO0OO;

        public static final class OooO00o<K, V> implements OooOOOO<K, V, o0OO00O<K, V>, oo0o0Oo<K, V>> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO00o<?, ?> f19498OooO00o = new OooO00o<>();

            @Override // com.google.common.collect.o00O.OooOOOO
            public final Oooo0 OooO00o(o00O o00o2, int i) {
                return new oo0o0Oo(o00o2, i);
            }

            @Override // com.google.common.collect.o00O.OooOOOO
            public final OooOOO OooO0O0(Oooo0 oooo0, OooOOO oooOOO, @CheckForNull OooOOO oooOOO2) {
                oo0o0Oo oo0o0oo = (oo0o0Oo) oooo0;
                o0OO00O o0oo00o2 = (o0OO00O) oooOOO;
                o0OO00O o0oo00o3 = (o0OO00O) oooOOO2;
                if (o0oo00o2.get() != null) {
                    int i = Oooo0.f19482OooOO0;
                    if (!(o0oo00o2.getValue() == null)) {
                        ReferenceQueue<K> referenceQueue = oo0o0oo.f19504OooOO0O;
                        ReferenceQueue<V> referenceQueue2 = oo0o0oo.f19505OooOO0o;
                        o0OO00O o0oo00o4 = new o0OO00O(referenceQueue, o0oo00o2.get(), o0oo00o2.f19470OooO00o, o0oo00o3);
                        o0oo00o4.f19497OooO0OO = o0oo00o2.f19497OooO0OO.OooO0O0(referenceQueue2, o0oo00o4);
                        return o0oo00o4;
                    }
                }
                return null;
            }

            @Override // com.google.common.collect.o00O.OooOOOO
            public final o0OoOo0 OooO0OO() {
                return o0OoOo0.WEAK;
            }

            @Override // com.google.common.collect.o00O.OooOOOO
            public final void OooO0Oo(Oooo0 oooo0, OooOOO oooOOO, Object obj) {
                o0OO00O o0oo00o2 = (o0OO00O) oooOOO;
                ReferenceQueue<V> referenceQueue = ((oo0o0Oo) oooo0).f19505OooOO0o;
                o000OOo<K, V, o0OO00O<K, V>> o000ooo2 = o0oo00o2.f19497OooO0OO;
                o0oo00o2.f19497OooO0OO = new o000000(referenceQueue, obj, o0oo00o2);
                o000ooo2.clear();
            }

            @Override // com.google.common.collect.o00O.OooOOOO
            public final o0OoOo0 OooO0o() {
                return o0OoOo0.WEAK;
            }

            @Override // com.google.common.collect.o00O.OooOOOO
            public final OooOOO OooO0o0(Oooo0 oooo0, Object obj, int i, @CheckForNull OooOOO oooOOO) {
                return new o0OO00O(((oo0o0Oo) oooo0).f19504OooOO0O, obj, i, (o0OO00O) oooOOO);
            }
        }

        public o0OO00O(ReferenceQueue<K> referenceQueue, K k, int i, @CheckForNull o0OO00O<K, V> o0oo00o2) {
            super(referenceQueue, k, i, o0oo00o2);
            this.f19497OooO0OO = o00O.f19452OooOOO0;
        }

        @Override // com.google.common.collect.o00O.o0O0O00
        public final o000OOo<K, V, o0OO00O<K, V>> OooO00o() {
            return this.f19497OooO0OO;
        }

        @Override // com.google.common.collect.o00O.OooOOO
        public final V getValue() {
            return this.f19497OooO0OO.get();
        }
    }

    public static final class o0OOO0o<K, V> extends OooO0o<K, V, o0OOO0o<K, V>> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @CheckForNull
        public volatile V f19499OooO0OO;

        public static final class OooO00o<K, V> implements OooOOOO<K, V, o0OOO0o<K, V>, o0Oo0oo<K, V>> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO00o<?, ?> f19500OooO00o = new OooO00o<>();

            @Override // com.google.common.collect.o00O.OooOOOO
            public final Oooo0 OooO00o(o00O o00o2, int i) {
                return new o0Oo0oo(o00o2, i);
            }

            @Override // com.google.common.collect.o00O.OooOOOO
            public final OooOOO OooO0O0(Oooo0 oooo0, OooOOO oooOOO, @CheckForNull OooOOO oooOOO2) {
                o0Oo0oo o0oo0oo2 = (o0Oo0oo) oooo0;
                o0OOO0o o0ooo0o2 = (o0OOO0o) oooOOO;
                o0OOO0o o0ooo0o3 = (o0OOO0o) oooOOO2;
                if (o0ooo0o2.get() == null) {
                    return null;
                }
                o0OOO0o o0ooo0o4 = new o0OOO0o(o0oo0oo2.f19501OooOO0O, o0ooo0o2.get(), o0ooo0o2.f19470OooO00o, o0ooo0o3);
                o0ooo0o4.f19499OooO0OO = o0ooo0o2.f19499OooO0OO;
                return o0ooo0o4;
            }

            @Override // com.google.common.collect.o00O.OooOOOO
            public final o0OoOo0 OooO0OO() {
                return o0OoOo0.STRONG;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.o00O.OooOOOO
            public final void OooO0Oo(Oooo0 oooo0, OooOOO oooOOO, Object obj) {
                ((o0OOO0o) oooOOO).f19499OooO0OO = obj;
            }

            @Override // com.google.common.collect.o00O.OooOOOO
            public final o0OoOo0 OooO0o() {
                return o0OoOo0.WEAK;
            }

            @Override // com.google.common.collect.o00O.OooOOOO
            public final OooOOO OooO0o0(Oooo0 oooo0, Object obj, int i, @CheckForNull OooOOO oooOOO) {
                return new o0OOO0o(((o0Oo0oo) oooo0).f19501OooOO0O, obj, i, (o0OOO0o) oooOOO);
            }
        }

        public o0OOO0o(ReferenceQueue<K> referenceQueue, K k, int i, @CheckForNull o0OOO0o<K, V> o0ooo0o2) {
            super(referenceQueue, k, i, o0ooo0o2);
            this.f19499OooO0OO = null;
        }

        @Override // com.google.common.collect.o00O.OooOOO
        @CheckForNull
        public final V getValue() {
            return this.f19499OooO0OO;
        }
    }

    public static final class o0Oo0oo<K, V> extends Oooo0<K, V, o0OOO0o<K, V>, o0Oo0oo<K, V>> {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final ReferenceQueue<K> f19501OooOO0O;

        public o0Oo0oo(o00O o00o2, int i) {
            super(o00o2, i);
            this.f19501OooOO0O = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.o00O.Oooo0
        public final void OooO0o() {
            OooO00o(this.f19501OooOO0O);
        }

        @Override // com.google.common.collect.o00O.Oooo0
        public final void OooO0o0() {
            while (this.f19501OooOO0O.poll() != null) {
            }
        }

        @Override // com.google.common.collect.o00O.Oooo0
        public final Oooo0 OooOO0O() {
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class o0OoOo0 {
        private static final /* synthetic */ o0OoOo0[] $VALUES;
        public static final o0OoOo0 STRONG;
        public static final o0OoOo0 WEAK;

        public final enum OooO00o extends o0OoOo0 {
            public OooO00o() {
                super("STRONG", 0);
            }

            @Override // com.google.common.collect.o00O.o0OoOo0
            public final Equivalence<Object> OooO00o() {
                return Equivalence.OooO00o.f19055OooO0Oo;
            }
        }

        public final enum OooO0O0 extends o0OoOo0 {
            public OooO0O0() {
                super("WEAK", 1);
            }

            @Override // com.google.common.collect.o00O.o0OoOo0
            public final Equivalence<Object> OooO00o() {
                return Equivalence.OooO0O0.f19056OooO0Oo;
            }
        }

        static {
            OooO00o oooO00o = new OooO00o();
            STRONG = oooO00o;
            OooO0O0 oooO0O0 = new OooO0O0();
            WEAK = oooO0O0;
            $VALUES = new o0OoOo0[]{oooO00o, oooO0O0};
        }

        public o0OoOo0() {
            throw null;
        }

        public o0OoOo0(String str, int i) {
            super(str, i);
        }

        public static o0OoOo0 valueOf(String str) {
            return (o0OoOo0) Enum.valueOf(o0OoOo0.class, str);
        }

        public static o0OoOo0[] values() {
            return (o0OoOo0[]) $VALUES.clone();
        }

        public abstract Equivalence<Object> OooO00o();
    }

    public final class o0ooOOo extends AbstractCollection<V> {
        public o0ooOOo() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            o00O.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return o00O.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return o00O.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new o00oO0o();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return o00O.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray() {
            return o00O.OooO00o(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) o00O.OooO00o(this).toArray(tArr);
        }
    }

    public static final class oo000o<K, V> extends Oooo0<K, V, o00Ooo<K, V>, oo000o<K, V>> {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final ReferenceQueue<V> f19503OooOO0O;

        public oo000o(o00O o00o2, int i) {
            super(o00o2, i);
            this.f19503OooOO0O = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.o00O.Oooo0
        public final void OooO0o() {
            OooO0O0(this.f19503OooOO0O);
        }

        @Override // com.google.common.collect.o00O.Oooo0
        public final void OooO0o0() {
            while (this.f19503OooOO0O.poll() != null) {
            }
        }

        @Override // com.google.common.collect.o00O.Oooo0
        public final Oooo0 OooOO0O() {
            return this;
        }
    }

    public static final class oo0o0Oo<K, V> extends Oooo0<K, V, o0OO00O<K, V>, oo0o0Oo<K, V>> {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final ReferenceQueue<K> f19504OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final ReferenceQueue<V> f19505OooOO0o;

        public oo0o0Oo(o00O o00o2, int i) {
            super(o00o2, i);
            this.f19504OooOO0O = new ReferenceQueue<>();
            this.f19505OooOO0o = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.o00O.Oooo0
        public final void OooO0o() {
            OooO00o(this.f19504OooOO0O);
            OooO0O0(this.f19505OooOO0o);
        }

        @Override // com.google.common.collect.o00O.Oooo0
        public final void OooO0o0() {
            while (this.f19504OooOO0O.poll() != null) {
            }
        }

        @Override // com.google.common.collect.o00O.Oooo0
        public final Oooo0 OooOO0O() {
            return this;
        }
    }

    public o00O(oo0oOO0 oo0ooo0, OooOOOO<K, V, E, S> oooOOOO) {
        int i = oo0ooo0.f19696OooO0OO;
        this.f19457OooO0oO = Math.min(i == -1 ? 4 : i, 65536);
        this.f19458OooO0oo = (Equivalence) com.google.common.base.OooOo.OooO00o(oo0ooo0.f19698OooO0o, oo0ooo0.OooO00o().OooO00o());
        this.f19453OooO = oooOOOO;
        int i2 = oo0ooo0.f19695OooO0O0;
        int iMin = Math.min(i2 == -1 ? 16 : i2, Pow2.MAX_POW2);
        int i3 = 1;
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        while (i5 < this.f19457OooO0oO) {
            i6++;
            i5 <<= 1;
        }
        this.f19456OooO0o0 = 32 - i6;
        this.f19454OooO0Oo = i5 - 1;
        this.f19455OooO0o = new Oooo0[i5];
        int i7 = iMin / i5;
        while (i3 < (i5 * i7 < iMin ? i7 + 1 : i7)) {
            i3 <<= 1;
        }
        while (true) {
            Oooo0<K, V, E, S>[] oooo0Arr = this.f19455OooO0o;
            if (i4 >= oooo0Arr.length) {
                return;
            }
            oooo0Arr[i4] = this.f19453OooO.OooO00o(this, i3);
            i4++;
        }
    }

    public static ArrayList OooO00o(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        o00O0O0O.OooO00o(arrayList, collection.iterator());
        return arrayList;
    }

    public final int OooO0O0(Object obj) {
        int iOooO0O0;
        Equivalence<Object> equivalence = this.f19458OooO0oo;
        if (obj == null) {
            equivalence.getClass();
            iOooO0O0 = 0;
        } else {
            iOooO0O0 = equivalence.OooO0O0(obj);
        }
        int i = iOooO0O0 + ((iOooO0O0 << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = (i4 << 2) + (i4 << 14) + i4;
        return (i5 >>> 16) ^ i5;
    }

    public final Oooo0<K, V, E, S> OooO0OO(int i) {
        return this.f19455OooO0o[(i >>> this.f19456OooO0o0) & this.f19454OooO0Oo];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (Oooo0<K, V, E, S> oooo0 : this.f19455OooO0o) {
            if (oooo0.f19486OooO0o0 != 0) {
                oooo0.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = oooo0.f19488OooO0oo;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    oooo0.OooO0o0();
                    oooo0.f19483OooO.set(0);
                    oooo0.f19485OooO0o++;
                    oooo0.f19486OooO0o0 = 0;
                    oooo0.unlock();
                } catch (Throwable th) {
                    oooo0.unlock();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        OooOOO oooOOOOooO0Oo;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int iOooO0O0 = OooO0O0(obj);
        Oooo0<K, V, E, S> oooo0OooO0OO = OooO0OO(iOooO0O0);
        oooo0OooO0OO.getClass();
        try {
            if (oooo0OooO0OO.f19486OooO0o0 != 0 && (oooOOOOooO0Oo = oooo0OooO0OO.OooO0Oo(iOooO0O0, obj)) != null && oooOOOOooO0Oo.getValue() != null) {
                z = true;
            }
            return z;
        } finally {
            oooo0OooO0OO.OooO0oO();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        Object value;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        Oooo0<K, V, E, S>[] oooo0Arr = this.f19455OooO0o;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = oooo0Arr.length;
            long j2 = 0;
            for (?? r10 = z; r10 < length; r10++) {
                Oooo0<K, V, E, S> oooo0 = oooo0Arr[r10];
                int i2 = oooo0.f19486OooO0o0;
                AtomicReferenceArray<E> atomicReferenceArray = oooo0.f19488OooO0oo;
                for (?? r13 = z; r13 < atomicReferenceArray.length(); r13++) {
                    for (E next = atomicReferenceArray.get(r13); next != null; next = next.getNext()) {
                        if (next.getKey() == null || (value = next.getValue()) == null) {
                            oooo0.OooOOO0();
                            value = null;
                        }
                        if (value != null && this.f19453OooO.OooO0OO().OooO00o().OooO0OO(obj, value)) {
                            return true;
                        }
                    }
                }
                j2 += (long) oooo0.f19485OooO0o;
                z = false;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            z = false;
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        OooOO0O oooOO0O = this.f19461OooOO0o;
        if (oooOO0O != null) {
            return oooOO0O;
        }
        OooOO0O oooOO0O2 = new OooOO0O();
        this.f19461OooOO0o = oooOO0O2;
        return oooOO0O2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(@CheckForNull Object obj) {
        V v = null;
        if (obj == null) {
            return null;
        }
        int iOooO0O0 = OooO0O0(obj);
        Oooo0<K, V, E, S> oooo0OooO0OO = OooO0OO(iOooO0O0);
        oooo0OooO0OO.getClass();
        try {
            OooOOO oooOOOOooO0Oo = oooo0OooO0OO.OooO0Oo(iOooO0O0, obj);
            if (oooOOOOooO0Oo != null && (v = (V) oooOOOOooO0Oo.getValue()) == null) {
                oooo0OooO0OO.OooOOO0();
            }
            return v;
        } finally {
            oooo0OooO0OO.OooO0oO();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        Oooo0<K, V, E, S>[] oooo0Arr = this.f19455OooO0o;
        long j = 0;
        for (int i = 0; i < oooo0Arr.length; i++) {
            if (oooo0Arr[i].f19486OooO0o0 != 0) {
                return false;
            }
            j += (long) oooo0Arr[i].f19485OooO0o;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < oooo0Arr.length; i2++) {
            if (oooo0Arr[i2].f19486OooO0o0 != 0) {
                return false;
            }
            j -= (long) oooo0Arr[i2].f19485OooO0o;
        }
        return j == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        OooOo oooOo = this.f19459OooOO0;
        if (oooOo != null) {
            return oooOo;
        }
        OooOo oooOo2 = new OooOo();
        this.f19459OooOO0 = oooOo2;
        return oooOo2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public final V put(K k, V v) {
        k.getClass();
        v.getClass();
        int iOooO0O0 = OooO0O0(k);
        return (V) OooO0OO(iOooO0O0).OooO0oo(iOooO0O0, k, false, v);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public final V putIfAbsent(K k, V v) {
        k.getClass();
        v.getClass();
        int iOooO0O0 = OooO0O0(k);
        return (V) OooO0OO(iOooO0O0).OooO0oo(iOooO0O0, k, true, v);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if ((r7.getValue() == null) != false) goto L21;
     */
    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V remove(@CheckForNull Object obj) {
        if (obj == null) {
            return null;
        }
        int iOooO0O0 = OooO0O0(obj);
        Oooo0<K, V, E, S> oooo0OooO0OO = OooO0OO(iOooO0O0);
        oooo0OooO0OO.lock();
        try {
            oooo0OooO0OO.OooOO0();
            AtomicReferenceArray<E> atomicReferenceArray = oooo0OooO0OO.f19488OooO0oo;
            int length = (atomicReferenceArray.length() - 1) & iOooO0O0;
            E e = atomicReferenceArray.get(length);
            OooOOO next = e;
            while (next != null) {
                Object key = next.getKey();
                if (next.OooO0O0() == iOooO0O0 && key != null && oooo0OooO0OO.f19484OooO0Oo.f19458OooO0oo.OooO0OO(obj, key)) {
                    V v = (V) next.getValue();
                    if (v == null) {
                    }
                    oooo0OooO0OO.f19485OooO0o++;
                    OooOOO oooOOOOooO = oooo0OooO0OO.OooO(e, next);
                    int i = oooo0OooO0OO.f19486OooO0o0 - 1;
                    atomicReferenceArray.set(length, (E) oooOOOOooO);
                    oooo0OooO0OO.f19486OooO0o0 = i;
                    return v;
                }
                next = next.getNext();
            }
            return null;
        } finally {
            oooo0OooO0OO.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public final V replace(K k, V v) {
        k.getClass();
        v.getClass();
        int iOooO0O0 = OooO0O0(k);
        Oooo0<K, V, E, S> oooo0OooO0OO = OooO0OO(iOooO0O0);
        oooo0OooO0OO.lock();
        try {
            oooo0OooO0OO.OooOO0();
            AtomicReferenceArray<E> atomicReferenceArray = oooo0OooO0OO.f19488OooO0oo;
            int length = (atomicReferenceArray.length() - 1) & iOooO0O0;
            E e = atomicReferenceArray.get(length);
            for (OooOOO next = e; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.OooO0O0() == iOooO0O0 && key != null && oooo0OooO0OO.f19484OooO0Oo.f19458OooO0oo.OooO0OO(k, key)) {
                    V v2 = (V) next.getValue();
                    if (v2 != null) {
                        oooo0OooO0OO.f19485OooO0o++;
                        oooo0OooO0OO.OooOO0o(next, v);
                        return v2;
                    }
                    if (!(next.getValue() == null)) {
                        break;
                    }
                    oooo0OooO0OO.f19485OooO0o++;
                    OooOOO oooOOOOooO = oooo0OooO0OO.OooO(e, next);
                    int i = oooo0OooO0OO.f19486OooO0o0 - 1;
                    atomicReferenceArray.set(length, (E) oooOOOOooO);
                    oooo0OooO0OO.f19486OooO0o0 = i;
                    break;
                }
            }
            return null;
        } finally {
            oooo0OooO0OO.unlock();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long j = 0;
        for (Oooo0<K, V, E, S> oooo0 : this.f19455OooO0o) {
            j += (long) oooo0.f19486OooO0o0;
        }
        return com.google.common.primitives.OooO0o.OooO0OO(j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        o0ooOOo o0ooooo = this.f19460OooOO0O;
        if (o0ooooo != null) {
            return o0ooooo;
        }
        o0ooOOo o0ooooo2 = new o0ooOOo();
        this.f19460OooOO0O = o0ooooo2;
        return o0ooooo2;
    }

    public Object writeReplace() {
        OooOOOO<K, V, E, S> oooOOOO = this.f19453OooO;
        o0OoOo0 o0oooo0OooO0o = oooOOOO.OooO0o();
        o0OoOo0 o0oooo0OooO0OO = oooOOOO.OooO0OO();
        Equivalence<Object> equivalence = this.f19458OooO0oo;
        oooOOOO.OooO0OO().OooO00o();
        return new o000oOoO(o0oooo0OooO0o, o0oooo0OooO0OO, equivalence, this.f19457OooO0oO, this);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public final boolean remove(@CheckForNull Object obj, @CheckForNull Object obj2) {
        boolean z = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int iOooO0O0 = OooO0O0(obj);
        Oooo0<K, V, E, S> oooo0OooO0OO = OooO0OO(iOooO0O0);
        oooo0OooO0OO.lock();
        try {
            oooo0OooO0OO.OooOO0();
            AtomicReferenceArray<E> atomicReferenceArray = oooo0OooO0OO.f19488OooO0oo;
            int length = (atomicReferenceArray.length() - 1) & iOooO0O0;
            E e = atomicReferenceArray.get(length);
            for (OooOOO next = e; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.OooO0O0() == iOooO0O0 && key != null && oooo0OooO0OO.f19484OooO0Oo.f19458OooO0oo.OooO0OO(obj, key)) {
                    if (!oooo0OooO0OO.f19484OooO0Oo.f19453OooO.OooO0OO().OooO00o().OooO0OO(obj2, next.getValue())) {
                        if (!(next.getValue() == null)) {
                            break;
                        }
                        break;
                    }
                    z = true;
                    oooo0OooO0OO.f19485OooO0o++;
                    OooOOO oooOOOOooO = oooo0OooO0OO.OooO(e, next);
                    int i = oooo0OooO0OO.f19486OooO0o0 - 1;
                    atomicReferenceArray.set(length, (E) oooOOOOooO);
                    oooo0OooO0OO.f19486OooO0o0 = i;
                    break;
                }
            }
            return z;
        } finally {
            oooo0OooO0OO.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public final boolean replace(K k, @CheckForNull V v, V v2) {
        k.getClass();
        v2.getClass();
        if (v == null) {
            return false;
        }
        int iOooO0O0 = OooO0O0(k);
        Oooo0<K, V, E, S> oooo0OooO0OO = OooO0OO(iOooO0O0);
        oooo0OooO0OO.lock();
        try {
            oooo0OooO0OO.OooOO0();
            AtomicReferenceArray<E> atomicReferenceArray = oooo0OooO0OO.f19488OooO0oo;
            int length = (atomicReferenceArray.length() - 1) & iOooO0O0;
            E e = atomicReferenceArray.get(length);
            for (OooOOO next = e; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.OooO0O0() == iOooO0O0 && key != null && oooo0OooO0OO.f19484OooO0Oo.f19458OooO0oo.OooO0OO(k, key)) {
                    Object value = next.getValue();
                    if (value == null) {
                        if (!(next.getValue() == null)) {
                            break;
                        }
                        oooo0OooO0OO.f19485OooO0o++;
                        OooOOO oooOOOOooO = oooo0OooO0OO.OooO(e, next);
                        int i = oooo0OooO0OO.f19486OooO0o0 - 1;
                        atomicReferenceArray.set(length, (E) oooOOOOooO);
                        oooo0OooO0OO.f19486OooO0o0 = i;
                        break;
                    }
                    if (!oooo0OooO0OO.f19484OooO0Oo.f19453OooO.OooO0OO().OooO00o().OooO0OO(v, value)) {
                        break;
                    }
                    oooo0OooO0OO.f19485OooO0o++;
                    oooo0OooO0OO.OooOO0o(next, v2);
                    return true;
                }
            }
            return false;
        } finally {
            oooo0OooO0OO.unlock();
        }
    }
}
