package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Equivalence;
import com.google.common.collect.o00O0OO.OooOOO;
import com.google.common.collect.o00O0OO.Oooo0;
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
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
public final class o00O0OO<K, V, E extends OooOOO<K, V, E>, S extends Oooo0<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public static final o000OOo<Object, Object, OooO> f18483o000oOoO = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f18484Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final transient int f18485Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final transient int f18486Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final transient Oooo0<K, V, E, S>[] f18487Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Collection<V> f18488OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final transient OooOOOO<K, V, E, S> f18489OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final Equivalence<Object> f18490OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Set<K> f18491OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Set<Map.Entry<K, V>> f18492OoooOO0;

    public static final class OooO implements OooOOO<Object, Object, OooO> {
        public OooO() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o00O0OO.OooOOO
        public final OooOOO OooO00o() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o00O0OO.OooOOO
        public final int OooO0OO() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o00O0OO.OooOOO
        public final Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.o00O0OO.OooOOO
        public final Object getValue() {
            throw new AssertionError();
        }
    }

    public static class OooO00o implements o000OOo<Object, Object, OooO> {
        @Override // com.google.common.collect.o00O0OO.o000OOo
        public final /* bridge */ /* synthetic */ OooOOO OooO00o() {
            return null;
        }

        @Override // com.google.common.collect.o00O0OO.o000OOo
        public final o000OOo OooO0O0(ReferenceQueue<Object> referenceQueue, OooOOO oooOOO) {
            return this;
        }

        @Override // com.google.common.collect.o00O0OO.o000OOo
        public final void clear() {
        }

        @Override // com.google.common.collect.o00O0OO.o000OOo
        public final Object get() {
            return null;
        }
    }

    public static abstract class OooO0O0<K, V> extends o0000O<K, V> implements Serializable {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final int f18493Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final o0OoOo0 f18494Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final o0OoOo0 f18495Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final Equivalence<Object> f18496Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public transient ConcurrentMap<K, V> f18497OoooO00;

        public OooO0O0(o0OoOo0 o0oooo1, o0OoOo0 o0oooo2, Equivalence equivalence, int i, ConcurrentMap concurrentMap) {
            this.f18494Oooo0o = o0oooo1;
            this.f18495Oooo0oO = o0oooo2;
            this.f18496Oooo0oo = equivalence;
            this.f18493Oooo = i;
            this.f18497OoooO00 = concurrentMap;
        }

        @Override // com.google.common.collect.o0000OO0, com.google.common.collect.o000O0o
        public final Object OooO00o() {
            return this.f18497OoooO00;
        }

        @Override // com.google.common.collect.o0000OO0
        /* JADX INFO: renamed from: OooO0O0 */
        public final Map OooO00o() {
            return this.f18497OoooO00;
        }
    }

    public static abstract class OooO0OO<K, V, E extends OooOOO<K, V, E>> implements OooOOO<K, V, E> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final K f18498OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f18499OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NullableDecl
        public final E f18500OooO0OO;

        public OooO0OO(K k, int i, @NullableDecl E e) {
            this.f18498OooO00o = k;
            this.f18499OooO0O0 = i;
            this.f18500OooO0OO = e;
        }

        @Override // com.google.common.collect.o00O0OO.OooOOO
        public final E OooO00o() {
            return this.f18500OooO0OO;
        }

        @Override // com.google.common.collect.o00O0OO.OooOOO
        public final int OooO0OO() {
            return this.f18499OooO0O0;
        }

        @Override // com.google.common.collect.o00O0OO.OooOOO
        public final K getKey() {
            return this.f18498OooO00o;
        }
    }

    public static abstract class OooO0o<K, V, E extends OooOOO<K, V, E>> extends WeakReference<K> implements OooOOO<K, V, E> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f18501OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NullableDecl
        public final E f18502OooO0O0;

        public OooO0o(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl E e) {
            super(k, referenceQueue);
            this.f18501OooO00o = i;
            this.f18502OooO0O0 = e;
        }

        @Override // com.google.common.collect.o00O0OO.OooOOO
        public final E OooO00o() {
            return this.f18502OooO0O0;
        }

        @Override // com.google.common.collect.o00O0OO.OooOOO
        public final int OooO0OO() {
            return this.f18501OooO00o;
        }

        @Override // com.google.common.collect.o00O0OO.OooOOO
        public final K getKey() {
            return get();
        }
    }

    public final class OooOO0 extends o00O0OO<K, V, E, S>.OooOOO0<Map.Entry<K, V>> {
        public OooOO0(o00O0OO o00o0oo2) {
            super();
        }

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
            o00O0OO.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = o00O0OO.this.get(key)) != null && o00O0OO.this.OooO0Oo().OooO0OO(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return o00O0OO.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new OooOO0(o00O0OO.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && o00O0OO.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return o00O0OO.this.size();
        }
    }

    public interface OooOOO<K, V, E extends OooOOO<K, V, E>> {
        E OooO00o();

        int OooO0OO();

        K getKey();

        V getValue();
    }

    public abstract class OooOOO0<T> implements Iterator<T> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        @MonotonicNonNullDecl
        public AtomicReferenceArray<E> f18504Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f18505Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f18506Oooo0oO = -1;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @MonotonicNonNullDecl
        public Oooo0<K, V, E, S> f18507Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        @NullableDecl
        public o00O0OO<K, V, E, S>.o000000O f18509OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        @NullableDecl
        public E f18510OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        @NullableDecl
        public o00O0OO<K, V, E, S>.o000000O f18511OoooO0O;

        public OooOOO0() {
            this.f18505Oooo0o = o00O0OO.this.f18487Oooo0oo.length - 1;
            OooO00o();
        }

        public final void OooO00o() {
            this.f18509OoooO0 = null;
            if (OooO0Oo() || OooO0o0()) {
                return;
            }
            while (true) {
                int i = this.f18505Oooo0o;
                if (i < 0) {
                    return;
                }
                Oooo0<K, V, E, S>[] oooo0Arr = o00O0OO.this.f18487Oooo0oo;
                this.f18505Oooo0o = i - 1;
                Oooo0<K, V, E, S> oooo0 = oooo0Arr[i];
                this.f18507Oooo0oo = oooo0;
                if (oooo0.f18516Oooo0oO != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f18507Oooo0oo.f18519OoooO00;
                    this.f18504Oooo = atomicReferenceArray;
                    this.f18506Oooo0oO = atomicReferenceArray.length() - 1;
                    if (OooO0o0()) {
                        return;
                    }
                }
            }
        }

        public final boolean OooO0O0(E e) {
            Object value;
            boolean z;
            try {
                Object key = e.getKey();
                Objects.requireNonNull(o00O0OO.this);
                Object obj = null;
                if (e.getKey() != null && (value = e.getValue()) != null) {
                    obj = value;
                }
                if (obj != null) {
                    this.f18509OoooO0 = new o000000O(key, obj);
                    z = true;
                } else {
                    z = false;
                }
                return z;
            } finally {
                this.f18507Oooo0oo.OooO0oo();
            }
        }

        public final o00O0OO<K, V, E, S>.o000000O OooO0OO() {
            o00O0OO<K, V, E, S>.o000000O o000000o2 = this.f18509OoooO0;
            if (o000000o2 == null) {
                throw new NoSuchElementException();
            }
            this.f18511OoooO0O = o000000o2;
            OooO00o();
            return this.f18511OoooO0O;
        }

        public final boolean OooO0Oo() {
            E e = this.f18510OoooO00;
            if (e == null) {
                return false;
            }
            while (true) {
                this.f18510OoooO00 = (E) e.OooO00o();
                E e2 = this.f18510OoooO00;
                if (e2 == null) {
                    return false;
                }
                if (OooO0O0(e2)) {
                    return true;
                }
                e = this.f18510OoooO00;
            }
        }

        public final boolean OooO0o0() {
            while (true) {
                int i = this.f18506Oooo0oO;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f18504Oooo;
                this.f18506Oooo0oO = i - 1;
                E e = atomicReferenceArray.get(i);
                this.f18510OoooO00 = e;
                if (e != null && (OooO0O0(e) || OooO0Oo())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18509OoooO0 != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            com.google.common.collect.oo000o.OooO0Oo(this.f18511OoooO0O != null);
            o00O0OO.this.remove(this.f18511OoooO0O.f18521Oooo0o);
            this.f18511OoooO0O = null;
        }
    }

    public interface OooOOOO<K, V, E extends OooOOO<K, V, E>, S extends Oooo0<K, V, E, S>> {
        Oooo0 OooO00o(o00O0OO o00o0oo2, int i);

        E OooO0O0(S s, E e, @NullableDecl E e2);

        o0OoOo0 OooO0OO();

        o0OoOo0 OooO0Oo();

        E OooO0o(S s, K k, int i, @NullableDecl E e);

        void OooO0o0(S s, E e, V v);
    }

    public final class OooOo extends Oooo000<K> {
        public OooOo() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            o00O0OO.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return o00O0OO.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return o00O0OO.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new OooOo00(o00O0OO.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return o00O0OO.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return o00O0OO.this.size();
        }
    }

    public final class OooOo00 extends o00O0OO<K, V, E, S>.OooOOO0<K> {
        public OooOo00(o00O0OO o00o0oo2) {
            super();
        }

        @Override // java.util.Iterator
        public final K next() {
            return OooO0OO().f18521Oooo0o;
        }
    }

    public static abstract class Oooo0<K, V, E extends OooOOO<K, V, E>, S extends Oooo0<K, V, E, S>> extends ReentrantLock {

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public static final /* synthetic */ int f18513OoooO0O = 0;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f18514Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @Weak
        public final o00O0OO<K, V, E, S> f18515Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public volatile int f18516Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f18517Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final AtomicInteger f18518OoooO0 = new AtomicInteger();

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        @MonotonicNonNullDecl
        public volatile AtomicReferenceArray<E> f18519OoooO00;

        public Oooo0(o00O0OO o00o0oo2, int i) {
            this.f18515Oooo0o = o00o0oo2;
            AtomicReferenceArray<E> atomicReferenceArray = new AtomicReferenceArray<>(i);
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f18514Oooo = length;
            if (length == -1) {
                this.f18514Oooo = length + 1;
            }
            this.f18519OoooO00 = atomicReferenceArray;
        }

        public final V OooO(K k, int i, V v, boolean z) {
            lock();
            try {
                OooOO0O();
                int i2 = this.f18516Oooo0oO + 1;
                if (i2 > this.f18514Oooo) {
                    OooO0Oo();
                    i2 = this.f18516Oooo0oO + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f18519OoooO00;
                int length = (atomicReferenceArray.length() - 1) & i;
                E e = atomicReferenceArray.get(length);
                for (OooOOO oooOOOOooO00o = e; oooOOOOooO00o != null; oooOOOOooO00o = oooOOOOooO00o.OooO00o()) {
                    Object key = oooOOOOooO00o.getKey();
                    if (oooOOOOooO00o.OooO0OO() == i && key != null && this.f18515Oooo0o.f18490OoooO00.OooO0OO(k, key)) {
                        V v2 = (V) oooOOOOooO00o.getValue();
                        if (v2 == null) {
                            this.f18517Oooo0oo++;
                            OooOOO0(oooOOOOooO00o, v);
                            this.f18516Oooo0oO = this.f18516Oooo0oO;
                            return null;
                        }
                        if (z) {
                            return v2;
                        }
                        this.f18517Oooo0oo++;
                        OooOOO0(oooOOOOooO00o, v);
                        return v2;
                    }
                }
                this.f18517Oooo0oo++;
                OooOOO oooOOOOooO0o = this.f18515Oooo0o.f18489OoooO0.OooO0o(OooOO0o(), k, i, e);
                OooOOO0(oooOOOOooO0o, v);
                atomicReferenceArray.set(length, (E) oooOOOOooO0o);
                this.f18516Oooo0oO = i2;
                return null;
            } finally {
                unlock();
            }
        }

        public final <T> void OooO00o(ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        @GuardedBy("this")
        public final void OooO0O0(ReferenceQueue<K> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends K> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                OooOOO oooOOO = (OooOOO) referencePoll;
                o00O0OO<K, V, E, S> o00o0oo2 = this.f18515Oooo0o;
                Objects.requireNonNull(o00o0oo2);
                int iOooO0OO = oooOOO.OooO0OO();
                Oooo0<K, V, E, S> oooo0OooO0OO = o00o0oo2.OooO0OO(iOooO0OO);
                oooo0OooO0OO.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = oooo0OooO0OO.f18519OoooO00;
                    int length = iOooO0OO & (atomicReferenceArray.length() - 1);
                    E e = atomicReferenceArray.get(length);
                    for (OooOOO oooOOOOooO00o = e; oooOOOOooO00o != null; oooOOOOooO00o = oooOOOOooO00o.OooO00o()) {
                        if (oooOOOOooO00o == oooOOO) {
                            oooo0OooO0OO.f18517Oooo0oo++;
                            OooOOO oooOOOOooOO0 = oooo0OooO0OO.OooOO0(e, oooOOOOooO00o);
                            int i2 = oooo0OooO0OO.f18516Oooo0oO - 1;
                            atomicReferenceArray.set(length, (E) oooOOOOooOO0);
                            oooo0OooO0OO.f18516Oooo0oO = i2;
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
        public final void OooO0OO(ReferenceQueue<V> referenceQueue) {
            int i = 0;
            do {
                Reference<? extends V> referencePoll = referenceQueue.poll();
                if (referencePoll == null) {
                    return;
                }
                o000OOo<K, V, E> o000ooo2 = (o000OOo) referencePoll;
                o00O0OO<K, V, E, S> o00o0oo2 = this.f18515Oooo0o;
                Objects.requireNonNull(o00o0oo2);
                OooOOO oooOOOOooO00o = o000ooo2.OooO00o();
                int iOooO0OO = oooOOOOooO00o.OooO0OO();
                Oooo0<K, V, E, S> oooo0OooO0OO = o00o0oo2.OooO0OO(iOooO0OO);
                Object key = oooOOOOooO00o.getKey();
                oooo0OooO0OO.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = oooo0OooO0OO.f18519OoooO00;
                    int length = (atomicReferenceArray.length() - 1) & iOooO0OO;
                    E e = atomicReferenceArray.get(length);
                    for (OooOOO oooOOOOooO00o2 = e; oooOOOOooO00o2 != null; oooOOOOooO00o2 = oooOOOOooO00o2.OooO00o()) {
                        Object key2 = oooOOOOooO00o2.getKey();
                        if (oooOOOOooO00o2.OooO0OO() == iOooO0OO && key2 != null && oooo0OooO0OO.f18515Oooo0o.f18490OoooO00.OooO0OO(key, key2)) {
                            if (((o0O0O00) oooOOOOooO00o2).OooO0O0() != o000ooo2) {
                                break;
                            }
                            oooo0OooO0OO.f18517Oooo0oo++;
                            OooOOO oooOOOOooOO0 = oooo0OooO0OO.OooOO0(e, oooOOOOooO00o2);
                            int i2 = oooo0OooO0OO.f18516Oooo0oO - 1;
                            atomicReferenceArray.set(length, (E) oooOOOOooOO0);
                            oooo0OooO0OO.f18516Oooo0oO = i2;
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
        public final void OooO0Oo() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f18519OoooO00;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i = this.f18516Oooo0oO;
            AtomicReferenceArray<E> atomicReferenceArray2 = (AtomicReferenceArray<E>) new AtomicReferenceArray(length << 1);
            this.f18514Oooo = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                E eOooO00o = atomicReferenceArray.get(i2);
                if (eOooO00o != null) {
                    OooOOO oooOOOOooO00o = eOooO00o.OooO00o();
                    int iOooO0OO = eOooO00o.OooO0OO() & length2;
                    if (oooOOOOooO00o == null) {
                        atomicReferenceArray2.set(iOooO0OO, eOooO00o);
                    } else {
                        OooOOO oooOOO = eOooO00o;
                        while (oooOOOOooO00o != null) {
                            int iOooO0OO2 = oooOOOOooO00o.OooO0OO() & length2;
                            if (iOooO0OO2 != iOooO0OO) {
                                oooOOO = oooOOOOooO00o;
                                iOooO0OO = iOooO0OO2;
                            }
                            oooOOOOooO00o = oooOOOOooO00o.OooO00o();
                        }
                        atomicReferenceArray2.set(iOooO0OO, oooOOO);
                        while (eOooO00o != oooOOO) {
                            int iOooO0OO3 = eOooO00o.OooO0OO() & length2;
                            OooOOO oooOOOOooO0O0 = this.f18515Oooo0o.f18489OoooO0.OooO0O0(OooOO0o(), eOooO00o, (OooOOO) atomicReferenceArray2.get(iOooO0OO3));
                            if (oooOOOOooO0O0 != null) {
                                atomicReferenceArray2.set(iOooO0OO3, oooOOOOooO0O0);
                            } else {
                                i--;
                            }
                            eOooO00o = eOooO00o.OooO00o();
                        }
                    }
                }
            }
            this.f18519OoooO00 = atomicReferenceArray2;
            this.f18516Oooo0oO = i;
        }

        public void OooO0o() {
        }

        public final E OooO0o0(Object obj, int i) {
            if (this.f18516Oooo0oO != 0) {
                AtomicReferenceArray<E> atomicReferenceArray = this.f18519OoooO00;
                for (E e = atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); e != null; e = (E) e.OooO00o()) {
                    if (e.OooO0OO() == i) {
                        Object key = e.getKey();
                        if (key == null) {
                            OooOOO();
                        } else if (this.f18515Oooo0o.f18490OoooO00.OooO0OO(obj, key)) {
                            return e;
                        }
                    }
                }
            }
            return null;
        }

        @GuardedBy("this")
        public void OooO0oO() {
        }

        public final void OooO0oo() {
            if ((this.f18518OoooO0.incrementAndGet() & 63) == 0) {
                OooOO0O();
            }
        }

        @GuardedBy("this")
        public final E OooOO0(E e, E e2) {
            int i = this.f18516Oooo0oO;
            E e3 = (E) e2.OooO00o();
            while (e != e2) {
                OooOOO oooOOOOooO0O0 = this.f18515Oooo0o.f18489OoooO0.OooO0O0(OooOO0o(), e, e3);
                if (oooOOOOooO0O0 != null) {
                    e3 = (E) oooOOOOooO0O0;
                } else {
                    i--;
                }
                e = (E) e.OooO00o();
            }
            this.f18516Oooo0oO = i;
            return e3;
        }

        public final void OooOO0O() {
            if (tryLock()) {
                try {
                    OooO0oO();
                    this.f18518OoooO0.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract S OooOO0o();

        public final void OooOOO() {
            if (tryLock()) {
                try {
                    OooO0oO();
                } finally {
                    unlock();
                }
            }
        }

        public final void OooOOO0(E e, V v) {
            this.f18515Oooo0o.f18489OoooO0.OooO0o0(OooOO0o(), e, v);
        }
    }

    public static abstract class Oooo000<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            return o00O0OO.OooO00o(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) o00O0OO.OooO00o(this).toArray(tArr);
        }
    }

    public static final class o000000<K, V, E extends OooOOO<K, V, E>> extends WeakReference<V> implements o000OOo<K, V, E> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Weak
        public final E f18520OooO00o;

        public o000000(ReferenceQueue<V> referenceQueue, V v, E e) {
            super(v, referenceQueue);
            this.f18520OooO00o = e;
        }

        @Override // com.google.common.collect.o00O0OO.o000OOo
        public final E OooO00o() {
            return this.f18520OooO00o;
        }

        @Override // com.google.common.collect.o00O0OO.o000OOo
        public final o000OOo<K, V, E> OooO0O0(ReferenceQueue<V> referenceQueue, E e) {
            return new o000000(referenceQueue, get(), e);
        }
    }

    public final class o000000O extends com.google.common.collect.OooOOO0<K, V> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final K f18521Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public V f18522Oooo0oO;

        public o000000O(K k, V v) {
            this.f18521Oooo0o = k;
            this.f18522Oooo0oO = v;
        }

        @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
        public final boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f18521Oooo0o.equals(entry.getKey()) && this.f18522Oooo0oO.equals(entry.getValue());
        }

        @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
        public final K getKey() {
            return this.f18521Oooo0o;
        }

        @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
        public final V getValue() {
            return this.f18522Oooo0oO;
        }

        @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
        public final int hashCode() {
            return this.f18521Oooo0o.hashCode() ^ this.f18522Oooo0oO.hashCode();
        }

        @Override // com.google.common.collect.OooOOO0, java.util.Map.Entry
        public final V setValue(V v) {
            V v2 = (V) o00O0OO.this.put(this.f18521Oooo0o, v);
            this.f18522Oooo0oO = v;
            return v2;
        }
    }

    public interface o000OOo<K, V, E extends OooOOO<K, V, E>> {
        E OooO00o();

        o000OOo<K, V, E> OooO0O0(ReferenceQueue<V> referenceQueue, E e);

        void clear();

        @NullableDecl
        V get();
    }

    public static final class o000oOoO<K, V> extends OooO0O0<K, V> {
        public o000oOoO(o0OoOo0 o0oooo1, o0OoOo0 o0oooo2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, int i, ConcurrentMap<K, V> concurrentMap) {
            super(o0oooo1, o0oooo2, equivalence, i, concurrentMap);
        }

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            int i = objectInputStream.readInt();
            oo0o0O0 oo0o0o0 = new oo0o0O0();
            int i2 = oo0o0o0.f18684OooO0O0;
            o0OOOO0o.OooOOOO.OooOOOO(i2 == -1, "initial capacity was already set to %s", i2);
            o0OOOO0o.OooOOOO.OooO0O0(i >= 0);
            oo0o0o0.f18684OooO0O0 = i;
            oo0o0o0.OooO0Oo(this.f18494Oooo0o);
            o0OoOo0 o0oooo1 = this.f18495Oooo0oO;
            o0OoOo0 o0oooo2 = oo0o0o0.f18688OooO0o0;
            o0OOOO0o.OooOOOO.OooOOOo(o0oooo2 == null, "Value strength was already set to %s", o0oooo2);
            Objects.requireNonNull(o0oooo1);
            oo0o0o0.f18688OooO0o0 = o0oooo1;
            if (o0oooo1 != o0OoOo0.STRONG) {
                oo0o0o0.f18683OooO00o = true;
            }
            Equivalence<Object> equivalence = this.f18496Oooo0oo;
            Equivalence<Object> equivalence2 = oo0o0o0.f18687OooO0o;
            o0OOOO0o.OooOOOO.OooOOOo(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
            Objects.requireNonNull(equivalence);
            oo0o0o0.f18687OooO0o = equivalence;
            oo0o0o0.f18683OooO00o = true;
            int i3 = this.f18493Oooo;
            int i4 = oo0o0o0.f18685OooO0OO;
            o0OOOO0o.OooOOOO.OooOOOO(i4 == -1, "concurrency level was already set to %s", i4);
            o0OOOO0o.OooOOOO.OooO0O0(i3 > 0);
            oo0o0o0.f18685OooO0OO = i3;
            this.f18497OoooO00 = oo0o0o0.OooO0OO();
            while (true) {
                Object object = objectInputStream.readObject();
                if (object == null) {
                    return;
                } else {
                    this.f18497OoooO00.put((K) object, (V) objectInputStream.readObject());
                }
            }
        }

        private Object readResolve() {
            return this.f18497OoooO00;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeInt(this.f18497OoooO00.size());
            for (Map.Entry<K, V> entry : this.f18497OoooO00.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject(null);
        }
    }

    public static final class o00O0O<K, V> extends OooO0OO<K, V, o00O0O<K, V>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NullableDecl
        public volatile V f18524OooO0Oo;

        public static final class OooO00o<K, V> implements OooOOOO<K, V, o00O0O<K, V>, o00Oo0<K, V>> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO00o<?, ?> f18525OooO00o = new OooO00o<>();

            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final Oooo0 OooO00o(o00O0OO o00o0oo2, int i) {
                return new o00Oo0(o00o0oo2, i);
            }

            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final OooOOO OooO0O0(Oooo0 oooo0, OooOOO oooOOO, @NullableDecl OooOOO oooOOO2) {
                o00O0O o00o0o2 = (o00O0O) oooOOO;
                o00O0O o00o0o3 = new o00O0O(o00o0o2.f18498OooO00o, o00o0o2.f18499OooO0O0, (o00O0O) oooOOO2);
                o00o0o3.f18524OooO0Oo = o00o0o2.f18524OooO0Oo;
                return o00o0o3;
            }

            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final o0OoOo0 OooO0OO() {
                return o0OoOo0.STRONG;
            }

            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final o0OoOo0 OooO0Oo() {
                return o0OoOo0.STRONG;
            }

            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final OooOOO OooO0o(Oooo0 oooo0, Object obj, int i, @NullableDecl OooOOO oooOOO) {
                return new o00O0O(obj, i, (o00O0O) oooOOO);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final void OooO0o0(Oooo0 oooo0, OooOOO oooOOO, Object obj) {
                ((o00O0O) oooOOO).f18524OooO0Oo = obj;
            }
        }

        public o00O0O(K k, int i, @NullableDecl o00O0O<K, V> o00o0o2) {
            super(k, i, o00o0o2);
            this.f18524OooO0Oo = null;
        }

        @Override // com.google.common.collect.o00O0OO.OooOOO
        @NullableDecl
        public final V getValue() {
            return this.f18524OooO0Oo;
        }
    }

    public static final class o00Oo0<K, V> extends Oooo0<K, V, o00O0O<K, V>, o00Oo0<K, V>> {
        public o00Oo0(o00O0OO o00o0oo2, int i) {
            super(o00o0oo2, i);
        }

        @Override // com.google.common.collect.o00O0OO.Oooo0
        public final Oooo0 OooOO0o() {
            return this;
        }
    }

    public static final class o00Ooo<K, V> extends OooO0OO<K, V, o00Ooo<K, V>> implements o0O0O00<K, V, o00Ooo<K, V>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public volatile o000OOo<K, V, o00Ooo<K, V>> f18526OooO0Oo;

        public static final class OooO00o<K, V> implements OooOOOO<K, V, o00Ooo<K, V>, oo000o<K, V>> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO00o<?, ?> f18527OooO00o = new OooO00o<>();

            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final Oooo0 OooO00o(o00O0OO o00o0oo2, int i) {
                return new oo000o(o00o0oo2, i);
            }

            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final OooOOO OooO0O0(Oooo0 oooo0, OooOOO oooOOO, @NullableDecl OooOOO oooOOO2) {
                oo000o oo000oVar = (oo000o) oooo0;
                o00Ooo o00ooo2 = (o00Ooo) oooOOO;
                o00Ooo o00ooo3 = (o00Ooo) oooOOO2;
                int i = Oooo0.f18513OoooO0O;
                if (o00ooo2.getValue() == null) {
                    return null;
                }
                ReferenceQueue<V> referenceQueue = oo000oVar.f18534OoooO;
                o00Ooo o00ooo4 = new o00Ooo(o00ooo2.f18498OooO00o, o00ooo2.f18499OooO0O0, o00ooo3);
                o00ooo4.f18526OooO0Oo = o00ooo2.f18526OooO0Oo.OooO0O0(referenceQueue, o00ooo4);
                return o00ooo4;
            }

            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final o0OoOo0 OooO0OO() {
                return o0OoOo0.STRONG;
            }

            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final o0OoOo0 OooO0Oo() {
                return o0OoOo0.WEAK;
            }

            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final OooOOO OooO0o(Oooo0 oooo0, Object obj, int i, @NullableDecl OooOOO oooOOO) {
                return new o00Ooo(obj, i, (o00Ooo) oooOOO);
            }

            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final void OooO0o0(Oooo0 oooo0, OooOOO oooOOO, Object obj) {
                o00Ooo o00ooo2 = (o00Ooo) oooOOO;
                ReferenceQueue<V> referenceQueue = ((oo000o) oooo0).f18534OoooO;
                o000OOo<K, V, o00Ooo<K, V>> o000ooo2 = o00ooo2.f18526OooO0Oo;
                o00ooo2.f18526OooO0Oo = new o000000(referenceQueue, obj, o00ooo2);
                o000ooo2.clear();
            }
        }

        public o00Ooo(K k, int i, @NullableDecl o00Ooo<K, V> o00ooo2) {
            super(k, i, o00ooo2);
            o000OOo<Object, Object, OooO> o000ooo2 = o00O0OO.f18483o000oOoO;
            this.f18526OooO0Oo = (o000OOo<K, V, o00Ooo<K, V>>) o00O0OO.f18483o000oOoO;
        }

        @Override // com.google.common.collect.o00O0OO.o0O0O00
        public final o000OOo<K, V, o00Ooo<K, V>> OooO0O0() {
            return this.f18526OooO0Oo;
        }

        @Override // com.google.common.collect.o00O0OO.OooOOO
        public final V getValue() {
            return this.f18526OooO0Oo.get();
        }
    }

    public final class o00oO0o extends o00O0OO<K, V, E, S>.OooOOO0<V> {
        public o00oO0o(o00O0OO o00o0oo2) {
            super();
        }

        @Override // java.util.Iterator
        public final V next() {
            return OooO0OO().f18522Oooo0oO;
        }
    }

    public interface o0O0O00<K, V, E extends OooOOO<K, V, E>> extends OooOOO<K, V, E> {
        o000OOo<K, V, E> OooO0O0();
    }

    public static final class o0OO00O<K, V> extends OooO0o<K, V, o0OO00O<K, V>> implements o0O0O00<K, V, o0OO00O<K, V>> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public volatile o000OOo<K, V, o0OO00O<K, V>> f18528OooO0OO;

        public static final class OooO00o<K, V> implements OooOOOO<K, V, o0OO00O<K, V>, oo0o0Oo<K, V>> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO00o<?, ?> f18529OooO00o = new OooO00o<>();

            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final Oooo0 OooO00o(o00O0OO o00o0oo2, int i) {
                return new oo0o0Oo(o00o0oo2, i);
            }

            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final OooOOO OooO0O0(Oooo0 oooo0, OooOOO oooOOO, @NullableDecl OooOOO oooOOO2) {
                oo0o0Oo oo0o0oo = (oo0o0Oo) oooo0;
                o0OO00O o0oo00o2 = (o0OO00O) oooOOO;
                o0OO00O o0oo00o3 = (o0OO00O) oooOOO2;
                if (o0oo00o2.get() == null) {
                    return null;
                }
                int i = Oooo0.f18513OoooO0O;
                if (o0oo00o2.getValue() == null) {
                    return null;
                }
                ReferenceQueue<K> referenceQueue = oo0o0oo.f18535OoooO;
                ReferenceQueue<V> referenceQueue2 = oo0o0oo.f18536OoooOO0;
                o0OO00O o0oo00o4 = new o0OO00O(referenceQueue, o0oo00o2.get(), o0oo00o2.f18501OooO00o, o0oo00o3);
                o0oo00o4.f18528OooO0OO = o0oo00o2.f18528OooO0OO.OooO0O0(referenceQueue2, o0oo00o4);
                return o0oo00o4;
            }

            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final o0OoOo0 OooO0OO() {
                return o0OoOo0.WEAK;
            }

            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final o0OoOo0 OooO0Oo() {
                return o0OoOo0.WEAK;
            }

            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final OooOOO OooO0o(Oooo0 oooo0, Object obj, int i, @NullableDecl OooOOO oooOOO) {
                return new o0OO00O(((oo0o0Oo) oooo0).f18535OoooO, obj, i, (o0OO00O) oooOOO);
            }

            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final void OooO0o0(Oooo0 oooo0, OooOOO oooOOO, Object obj) {
                o0OO00O o0oo00o2 = (o0OO00O) oooOOO;
                ReferenceQueue<V> referenceQueue = ((oo0o0Oo) oooo0).f18536OoooOO0;
                o000OOo<K, V, o0OO00O<K, V>> o000ooo2 = o0oo00o2.f18528OooO0OO;
                o0oo00o2.f18528OooO0OO = new o000000(referenceQueue, obj, o0oo00o2);
                o000ooo2.clear();
            }
        }

        public o0OO00O(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl o0OO00O<K, V> o0oo00o2) {
            super(referenceQueue, k, i, o0oo00o2);
            o000OOo<Object, Object, OooO> o000ooo2 = o00O0OO.f18483o000oOoO;
            this.f18528OooO0OO = (o000OOo<K, V, o0OO00O<K, V>>) o00O0OO.f18483o000oOoO;
        }

        @Override // com.google.common.collect.o00O0OO.o0O0O00
        public final o000OOo<K, V, o0OO00O<K, V>> OooO0O0() {
            return this.f18528OooO0OO;
        }

        @Override // com.google.common.collect.o00O0OO.OooOOO
        public final V getValue() {
            return this.f18528OooO0OO.get();
        }
    }

    public static final class o0OOO0o<K, V> extends OooO0o<K, V, o0OOO0o<K, V>> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NullableDecl
        public volatile V f18530OooO0OO;

        public static final class OooO00o<K, V> implements OooOOOO<K, V, o0OOO0o<K, V>, o0Oo0oo<K, V>> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO00o<?, ?> f18531OooO00o = new OooO00o<>();

            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final Oooo0 OooO00o(o00O0OO o00o0oo2, int i) {
                return new o0Oo0oo(o00o0oo2, i);
            }

            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final OooOOO OooO0O0(Oooo0 oooo0, OooOOO oooOOO, @NullableDecl OooOOO oooOOO2) {
                o0Oo0oo o0oo0oo2 = (o0Oo0oo) oooo0;
                o0OOO0o o0ooo0o2 = (o0OOO0o) oooOOO;
                o0OOO0o o0ooo0o3 = (o0OOO0o) oooOOO2;
                if (o0ooo0o2.get() == null) {
                    return null;
                }
                o0OOO0o o0ooo0o4 = new o0OOO0o(o0oo0oo2.f18532OoooO, o0ooo0o2.get(), o0ooo0o2.f18501OooO00o, o0ooo0o3);
                o0ooo0o4.f18530OooO0OO = o0ooo0o2.f18530OooO0OO;
                return o0ooo0o4;
            }

            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final o0OoOo0 OooO0OO() {
                return o0OoOo0.WEAK;
            }

            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final o0OoOo0 OooO0Oo() {
                return o0OoOo0.STRONG;
            }

            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final OooOOO OooO0o(Oooo0 oooo0, Object obj, int i, @NullableDecl OooOOO oooOOO) {
                return new o0OOO0o(((o0Oo0oo) oooo0).f18532OoooO, obj, i, (o0OOO0o) oooOOO);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.o00O0OO.OooOOOO
            public final void OooO0o0(Oooo0 oooo0, OooOOO oooOOO, Object obj) {
                ((o0OOO0o) oooOOO).f18530OooO0OO = obj;
            }
        }

        public o0OOO0o(ReferenceQueue<K> referenceQueue, K k, int i, @NullableDecl o0OOO0o<K, V> o0ooo0o2) {
            super(referenceQueue, k, i, o0ooo0o2);
            this.f18530OooO0OO = null;
        }

        @Override // com.google.common.collect.o00O0OO.OooOOO
        @NullableDecl
        public final V getValue() {
            return this.f18530OooO0OO;
        }
    }

    public static final class o0Oo0oo<K, V> extends Oooo0<K, V, o0OOO0o<K, V>, o0Oo0oo<K, V>> {

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final ReferenceQueue<K> f18532OoooO;

        public o0Oo0oo(o00O0OO o00o0oo2, int i) {
            super(o00o0oo2, i);
            this.f18532OoooO = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.o00O0OO.Oooo0
        public final void OooO0o() {
            OooO00o(this.f18532OoooO);
        }

        @Override // com.google.common.collect.o00O0OO.Oooo0
        public final void OooO0oO() {
            OooO0O0(this.f18532OoooO);
        }

        @Override // com.google.common.collect.o00O0OO.Oooo0
        public final Oooo0 OooOO0o() {
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class o0OoOo0 {
        private static final /* synthetic */ o0OoOo0[] $VALUES;
        public static final o0OoOo0 STRONG;
        public static final o0OoOo0 WEAK;

        public static enum OooO00o extends o0OoOo0 {
            public OooO00o() {
                super("STRONG", 0, null);
            }

            @Override // com.google.common.collect.o00O0OO.o0OoOo0
            public final Equivalence<Object> OooO00o() {
                return Equivalence.OooO00o.f18112Oooo0o;
            }
        }

        public static enum OooO0O0 extends o0OoOo0 {
            public OooO0O0() {
                super("WEAK", 1, null);
            }

            @Override // com.google.common.collect.o00O0OO.o0OoOo0
            public final Equivalence<Object> OooO00o() {
                return Equivalence.OooO0O0.f18113Oooo0o;
            }
        }

        static {
            OooO00o oooO00o = new OooO00o();
            STRONG = oooO00o;
            OooO0O0 oooO0O0 = new OooO0O0();
            WEAK = oooO0O0;
            $VALUES = new o0OoOo0[]{oooO00o, oooO0O0};
        }

        public o0OoOo0(String str, int i, OooO00o oooO00o) {
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
            o00O0OO.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            return o00O0OO.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            return o00O0OO.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new o00oO0o(o00O0OO.this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            return o00O0OO.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray() {
            return o00O0OO.OooO00o(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) o00O0OO.OooO00o(this).toArray(tArr);
        }
    }

    public static final class oo000o<K, V> extends Oooo0<K, V, o00Ooo<K, V>, oo000o<K, V>> {

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final ReferenceQueue<V> f18534OoooO;

        public oo000o(o00O0OO o00o0oo2, int i) {
            super(o00o0oo2, i);
            this.f18534OoooO = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.o00O0OO.Oooo0
        public final void OooO0o() {
            OooO00o(this.f18534OoooO);
        }

        @Override // com.google.common.collect.o00O0OO.Oooo0
        public final void OooO0oO() {
            OooO0OO(this.f18534OoooO);
        }

        @Override // com.google.common.collect.o00O0OO.Oooo0
        public final Oooo0 OooOO0o() {
            return this;
        }
    }

    public static final class oo0o0Oo<K, V> extends Oooo0<K, V, o0OO00O<K, V>, oo0o0Oo<K, V>> {

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final ReferenceQueue<K> f18535OoooO;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final ReferenceQueue<V> f18536OoooOO0;

        public oo0o0Oo(o00O0OO o00o0oo2, int i) {
            super(o00o0oo2, i);
            this.f18535OoooO = new ReferenceQueue<>();
            this.f18536OoooOO0 = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.o00O0OO.Oooo0
        public final void OooO0o() {
            OooO00o(this.f18535OoooO);
        }

        @Override // com.google.common.collect.o00O0OO.Oooo0
        public final void OooO0oO() {
            OooO0O0(this.f18535OoooO);
            OooO0OO(this.f18536OoooOO0);
        }

        @Override // com.google.common.collect.o00O0OO.Oooo0
        public final Oooo0 OooOO0o() {
            return this;
        }
    }

    public o00O0OO(oo0o0O0 oo0o0o0, OooOOOO<K, V, E, S> oooOOOO) {
        int i = oo0o0o0.f18685OooO0OO;
        this.f18484Oooo = Math.min(i == -1 ? 4 : i, 65536);
        this.f18490OoooO00 = (Equivalence) o0OOOO0o.OooOOO0.OooO00o(oo0o0o0.f18687OooO0o, oo0o0o0.OooO00o().OooO00o());
        this.f18489OoooO0 = oooOOOO;
        int i2 = oo0o0o0.f18684OooO0O0;
        int iMin = Math.min(i2 == -1 ? 16 : i2, 1073741824);
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        int i6 = 0;
        while (i5 < this.f18484Oooo) {
            i6++;
            i5 <<= 1;
        }
        this.f18486Oooo0oO = 32 - i6;
        this.f18485Oooo0o = i5 - 1;
        this.f18487Oooo0oo = new Oooo0[i5];
        int i7 = iMin / i5;
        while (i4 < (i5 * i7 < iMin ? i7 + 1 : i7)) {
            i4 <<= 1;
        }
        while (true) {
            Oooo0<K, V, E, S>[] oooo0Arr = this.f18487Oooo0oo;
            if (i3 >= oooo0Arr.length) {
                return;
            }
            oooo0Arr[i3] = this.f18489OoooO0.OooO00o(this, i4);
            i3++;
        }
    }

    public static ArrayList OooO00o(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        o00O0.OooO00o(arrayList, collection.iterator());
        return arrayList;
    }

    public final int OooO0O0(Object obj) {
        Equivalence<Object> equivalence = this.f18490OoooO00;
        Objects.requireNonNull(equivalence);
        int iOooO0O0 = obj == null ? 0 : equivalence.OooO0O0(obj);
        int i = iOooO0O0 + ((iOooO0O0 << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = (i4 << 2) + (i4 << 14) + i4;
        return (i5 >>> 16) ^ i5;
    }

    public final Oooo0<K, V, E, S> OooO0OO(int i) {
        return this.f18487Oooo0oo[(i >>> this.f18486Oooo0oO) & this.f18485Oooo0o];
    }

    @VisibleForTesting
    public final Equivalence<Object> OooO0Oo() {
        return this.f18489OoooO0.OooO0Oo().OooO00o();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (Oooo0<K, V, E, S> oooo0 : this.f18487Oooo0oo) {
            if (oooo0.f18516Oooo0oO != 0) {
                oooo0.lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = oooo0.f18519OoooO00;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, null);
                    }
                    oooo0.OooO0o();
                    oooo0.f18518OoooO0.set(0);
                    oooo0.f18517Oooo0oo++;
                    oooo0.f18516Oooo0oO = 0;
                    oooo0.unlock();
                } catch (Throwable th) {
                    oooo0.unlock();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@NullableDecl Object obj) {
        OooOOO oooOOOOooO0o0;
        boolean z = false;
        if (obj == null) {
            return false;
        }
        int iOooO0O0 = OooO0O0(obj);
        Oooo0<K, V, E, S> oooo0OooO0OO = OooO0OO(iOooO0O0);
        Objects.requireNonNull(oooo0OooO0OO);
        try {
            if (oooo0OooO0OO.f18516Oooo0oO != 0 && (oooOOOOooO0o0 = oooo0OooO0OO.OooO0o0(obj, iOooO0O0)) != null && oooOOOOooO0o0.getValue() != null) {
                z = true;
            }
            return z;
        } finally {
            oooo0OooO0OO.OooO0oo();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@NullableDecl Object obj) {
        Object value;
        if (obj == null) {
            return false;
        }
        Oooo0<K, V, E, S>[] oooo0Arr = this.f18487Oooo0oo;
        long j = -1;
        int i = 0;
        while (i < 3) {
            long j2 = 0;
            int length = oooo0Arr.length;
            for (int i2 = 0; i2 < length; i2++) {
                Oooo0<K, V, E, S> oooo0 = oooo0Arr[i2];
                int i3 = oooo0.f18516Oooo0oO;
                AtomicReferenceArray<E> atomicReferenceArray = oooo0.f18519OoooO00;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    for (E eOooO00o = atomicReferenceArray.get(i4); eOooO00o != null; eOooO00o = eOooO00o.OooO00o()) {
                        if (eOooO00o.getKey() == null || (value = eOooO00o.getValue()) == null) {
                            oooo0.OooOOO();
                            value = null;
                        }
                        if (value != null && OooO0Oo().OooO0OO(obj, value)) {
                            return true;
                        }
                    }
                }
                j2 += (long) oooo0.f18517Oooo0oo;
            }
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f18492OoooOO0;
        if (set != null) {
            return set;
        }
        OooOO0O oooOO0O = new OooOO0O();
        this.f18492OoooOO0 = oooOO0O;
        return oooOO0O;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(@NullableDecl Object obj) {
        V v = null;
        if (obj == null) {
            return null;
        }
        int iOooO0O0 = OooO0O0(obj);
        Oooo0<K, V, E, S> oooo0OooO0OO = OooO0OO(iOooO0O0);
        Objects.requireNonNull(oooo0OooO0OO);
        try {
            OooOOO oooOOOOooO0o0 = oooo0OooO0OO.OooO0o0(obj, iOooO0O0);
            if (oooOOOOooO0o0 != null && (v = (V) oooOOOOooO0o0.getValue()) == null) {
                oooo0OooO0OO.OooOOO();
            }
            return v;
        } finally {
            oooo0OooO0OO.OooO0oo();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        Oooo0<K, V, E, S>[] oooo0Arr = this.f18487Oooo0oo;
        long j = 0;
        for (int i = 0; i < oooo0Arr.length; i++) {
            if (oooo0Arr[i].f18516Oooo0oO != 0) {
                return false;
            }
            j += (long) oooo0Arr[i].f18517Oooo0oo;
        }
        if (j == 0) {
            return true;
        }
        for (int i2 = 0; i2 < oooo0Arr.length; i2++) {
            if (oooo0Arr[i2].f18516Oooo0oO != 0) {
                return false;
            }
            j -= (long) oooo0Arr[i2].f18517Oooo0oo;
        }
        return j == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.f18491OoooO0O;
        if (set != null) {
            return set;
        }
        OooOo oooOo = new OooOo();
        this.f18491OoooO0O = oooOo;
        return oooOo;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public final V put(K k, V v) {
        Objects.requireNonNull(k);
        Objects.requireNonNull(v);
        int iOooO0O0 = OooO0O0(k);
        return OooO0OO(iOooO0O0).OooO(k, iOooO0O0, v, false);
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
        Objects.requireNonNull(k);
        Objects.requireNonNull(v);
        int iOooO0O0 = OooO0O0(k);
        return OooO0OO(iOooO0O0).OooO(k, iOooO0O0, v, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if ((r7.getValue() == null) != false) goto L21;
     */
    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V remove(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int iOooO0O0 = OooO0O0(obj);
        Oooo0<K, V, E, S> oooo0OooO0OO = OooO0OO(iOooO0O0);
        oooo0OooO0OO.lock();
        try {
            oooo0OooO0OO.OooOO0O();
            AtomicReferenceArray<E> atomicReferenceArray = oooo0OooO0OO.f18519OoooO00;
            int length = (atomicReferenceArray.length() - 1) & iOooO0O0;
            E e = atomicReferenceArray.get(length);
            OooOOO oooOOOOooO00o = e;
            while (oooOOOOooO00o != null) {
                Object key = oooOOOOooO00o.getKey();
                if (oooOOOOooO00o.OooO0OO() == iOooO0O0 && key != null && oooo0OooO0OO.f18515Oooo0o.f18490OoooO00.OooO0OO(obj, key)) {
                    V v = (V) oooOOOOooO00o.getValue();
                    if (v == null) {
                    }
                    oooo0OooO0OO.f18517Oooo0oo++;
                    OooOOO oooOOOOooOO0 = oooo0OooO0OO.OooOO0(e, oooOOOOooO00o);
                    int i = oooo0OooO0OO.f18516Oooo0oO - 1;
                    atomicReferenceArray.set(length, (E) oooOOOOooOO0);
                    oooo0OooO0OO.f18516Oooo0oO = i;
                    return v;
                }
                oooOOOOooO00o = oooOOOOooO00o.OooO00o();
            }
            return null;
        } finally {
            oooo0OooO0OO.unlock();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public final V replace(K k, V v) {
        Objects.requireNonNull(k);
        Objects.requireNonNull(v);
        int iOooO0O0 = OooO0O0(k);
        Oooo0<K, V, E, S> oooo0OooO0OO = OooO0OO(iOooO0O0);
        oooo0OooO0OO.lock();
        try {
            oooo0OooO0OO.OooOO0O();
            AtomicReferenceArray<E> atomicReferenceArray = oooo0OooO0OO.f18519OoooO00;
            int length = (atomicReferenceArray.length() - 1) & iOooO0O0;
            E e = atomicReferenceArray.get(length);
            for (OooOOO oooOOOOooO00o = e; oooOOOOooO00o != null; oooOOOOooO00o = oooOOOOooO00o.OooO00o()) {
                Object key = oooOOOOooO00o.getKey();
                if (oooOOOOooO00o.OooO0OO() == iOooO0O0 && key != null && oooo0OooO0OO.f18515Oooo0o.f18490OoooO00.OooO0OO(k, key)) {
                    V v2 = (V) oooOOOOooO00o.getValue();
                    if (v2 != null) {
                        oooo0OooO0OO.f18517Oooo0oo++;
                        oooo0OooO0OO.OooOOO0(oooOOOOooO00o, v);
                        return v2;
                    }
                    if (!(oooOOOOooO00o.getValue() == null)) {
                        break;
                    }
                    oooo0OooO0OO.f18517Oooo0oo++;
                    OooOOO oooOOOOooOO0 = oooo0OooO0OO.OooOO0(e, oooOOOOooO00o);
                    int i = oooo0OooO0OO.f18516Oooo0oO - 1;
                    atomicReferenceArray.set(length, (E) oooOOOOooOO0);
                    oooo0OooO0OO.f18516Oooo0oO = i;
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
        for (Oooo0<K, V, E, S> oooo0 : this.f18487Oooo0oo) {
            j += (long) oooo0.f18516Oooo0oO;
        }
        return o0OOOOO.OooO0OO.OooO00o(j);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f18488OoooO;
        if (collection != null) {
            return collection;
        }
        o0ooOOo o0ooooo2 = new o0ooOOo();
        this.f18488OoooO = o0ooooo2;
        return o0ooooo2;
    }

    public Object writeReplace() {
        return new o000oOoO(this.f18489OoooO0.OooO0OO(), this.f18489OoooO0.OooO0Oo(), this.f18490OoooO00, this.f18489OoooO0.OooO0Oo().OooO00o(), this.f18484Oooo, this);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public final boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        boolean z = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int iOooO0O0 = OooO0O0(obj);
        Oooo0<K, V, E, S> oooo0OooO0OO = OooO0OO(iOooO0O0);
        oooo0OooO0OO.lock();
        try {
            oooo0OooO0OO.OooOO0O();
            AtomicReferenceArray<E> atomicReferenceArray = oooo0OooO0OO.f18519OoooO00;
            int length = (atomicReferenceArray.length() - 1) & iOooO0O0;
            E e = atomicReferenceArray.get(length);
            for (OooOOO oooOOOOooO00o = e; oooOOOOooO00o != null; oooOOOOooO00o = oooOOOOooO00o.OooO00o()) {
                Object key = oooOOOOooO00o.getKey();
                if (oooOOOOooO00o.OooO0OO() == iOooO0O0 && key != null && oooo0OooO0OO.f18515Oooo0o.f18490OoooO00.OooO0OO(obj, key)) {
                    if (!oooo0OooO0OO.f18515Oooo0o.OooO0Oo().OooO0OO(obj2, oooOOOOooO00o.getValue())) {
                        if (!(oooOOOOooO00o.getValue() == null)) {
                            break;
                        }
                        break;
                    }
                    z = true;
                    oooo0OooO0OO.f18517Oooo0oo++;
                    OooOOO oooOOOOooOO0 = oooo0OooO0OO.OooOO0(e, oooOOOOooO00o);
                    int i = oooo0OooO0OO.f18516Oooo0oO - 1;
                    atomicReferenceArray.set(length, (E) oooOOOOooOO0);
                    oooo0OooO0OO.f18516Oooo0oO = i;
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
    public final boolean replace(K k, @NullableDecl V v, V v2) {
        Objects.requireNonNull(k);
        Objects.requireNonNull(v2);
        if (v == null) {
            return false;
        }
        int iOooO0O0 = OooO0O0(k);
        Oooo0<K, V, E, S> oooo0OooO0OO = OooO0OO(iOooO0O0);
        oooo0OooO0OO.lock();
        try {
            oooo0OooO0OO.OooOO0O();
            AtomicReferenceArray<E> atomicReferenceArray = oooo0OooO0OO.f18519OoooO00;
            int length = (atomicReferenceArray.length() - 1) & iOooO0O0;
            E e = atomicReferenceArray.get(length);
            for (OooOOO oooOOOOooO00o = e; oooOOOOooO00o != null; oooOOOOooO00o = oooOOOOooO00o.OooO00o()) {
                Object key = oooOOOOooO00o.getKey();
                if (oooOOOOooO00o.OooO0OO() == iOooO0O0 && key != null && oooo0OooO0OO.f18515Oooo0o.f18490OoooO00.OooO0OO(k, key)) {
                    Object value = oooOOOOooO00o.getValue();
                    if (value == null) {
                        if (!(oooOOOOooO00o.getValue() == null)) {
                            break;
                        }
                        oooo0OooO0OO.f18517Oooo0oo++;
                        OooOOO oooOOOOooOO0 = oooo0OooO0OO.OooOO0(e, oooOOOOooO00o);
                        int i = oooo0OooO0OO.f18516Oooo0oO - 1;
                        atomicReferenceArray.set(length, (E) oooOOOOooOO0);
                        oooo0OooO0OO.f18516Oooo0oO = i;
                        break;
                    }
                    if (!oooo0OooO0OO.f18515Oooo0o.OooO0Oo().OooO0OO(v, value)) {
                        break;
                    }
                    oooo0OooO0OO.f18517Oooo0oo++;
                    oooo0OooO0OO.OooOOO0(oooOOOOooO00o, v2);
                    return true;
                }
            }
            return false;
        } finally {
            oooo0OooO0OO.unlock();
        }
    }
}
