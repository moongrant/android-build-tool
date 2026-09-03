package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public final class LinkedHashMultimap<K, V> extends o00O0OO0<K, V> {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @VisibleForTesting
    public transient int f18753OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public transient OooO0O0<K, V> f18754OooOO0O;

    public class OooO00o implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooO0O0<K, V> f18755OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @CheckForNull
        public OooO0O0<K, V> f18757OooO0o0;

        public OooO00o() {
            OooO0O0<K, V> oooO0O0 = LinkedHashMultimap.this.f18754OooOO0O.f18763OooOO0O;
            Objects.requireNonNull(oooO0O0);
            this.f18755OooO0Oo = oooO0O0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18755OooO0Oo != LinkedHashMultimap.this.f18754OooOO0O;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            OooO0O0<K, V> oooO0O0 = this.f18755OooO0Oo;
            this.f18757OooO0o0 = oooO0O0;
            OooO0O0<K, V> oooO0O1 = oooO0O0.f18763OooOO0O;
            Objects.requireNonNull(oooO0O1);
            this.f18755OooO0Oo = oooO0O1;
            return oooO0O0;
        }

        @Override // java.util.Iterator
        public final void remove() {
            com.google.common.base.o0OoOo0.OooOOO(this.f18757OooO0o0 != null, "no calls to next() since the last call to remove()");
            OooO0O0<K, V> oooO0O0 = this.f18757OooO0o0;
            LinkedHashMultimap.this.remove(oooO0O0.f18959OooO0Oo, oooO0O0.f18960OooO0o0);
            this.f18757OooO0o0 = null;
        }
    }

    @VisibleForTesting
    public static final class OooO0O0<K, V> extends o000O0O0<K, V> implements OooO0o<K, V> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f18758OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f18759OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @CheckForNull
        public OooO0O0<K, V> f18760OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @CheckForNull
        public OooO0o<K, V> f18761OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @CheckForNull
        public OooO0O0<K, V> f18762OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @CheckForNull
        public OooO0O0<K, V> f18763OooOO0O;

        public OooO0O0(@ParametricNullness K k, @ParametricNullness V v, int i, @CheckForNull OooO0O0<K, V> oooO0O0) {
            super(k, v);
            this.f18759OooO0o = i;
            this.f18760OooO0oO = oooO0O0;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.OooO0o
        public final OooO0o<K, V> OooO00o() {
            OooO0o<K, V> oooO0o = this.f18758OooO;
            Objects.requireNonNull(oooO0o);
            return oooO0o;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.OooO0o
        public final void OooO0O0(OooO0o<K, V> oooO0o) {
            this.f18758OooO = oooO0o;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.OooO0o
        public final void OooO0OO(OooO0o<K, V> oooO0o) {
            this.f18761OooO0oo = oooO0o;
        }

        public final OooO0o<K, V> OooO0Oo() {
            OooO0o<K, V> oooO0o = this.f18761OooO0oo;
            Objects.requireNonNull(oooO0o);
            return oooO0o;
        }
    }

    @VisibleForTesting
    public final class OooO0OO extends o0O0O0Oo.OooO0OO<V> implements OooO0o<K, V> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @ParametricNullness
        public final K f18765OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @VisibleForTesting
        public OooO0O0<K, V>[] f18767OooO0o0;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f18766OooO0o = 0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f18768OooO0oO = 0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public OooO0o<K, V> f18769OooO0oo = this;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public OooO0o<K, V> f18764OooO = this;

        public class OooO00o implements Iterator<V> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public OooO0o<K, V> f18771OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public int f18772OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            @CheckForNull
            public OooO0O0<K, V> f18773OooO0o0;

            public OooO00o() {
                this.f18771OooO0Oo = OooO0OO.this.f18769OooO0oo;
                this.f18772OooO0o = OooO0OO.this.f18768OooO0oO;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                OooO0OO oooO0OO = OooO0OO.this;
                if (oooO0OO.f18768OooO0oO == this.f18772OooO0o) {
                    return this.f18771OooO0Oo != oooO0OO;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public final V next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                OooO0O0<K, V> oooO0O0 = (OooO0O0) this.f18771OooO0Oo;
                V v = oooO0O0.f18960OooO0o0;
                this.f18773OooO0o0 = oooO0O0;
                this.f18771OooO0Oo = oooO0O0.OooO00o();
                return v;
            }

            @Override // java.util.Iterator
            public final void remove() {
                OooO0OO oooO0OO = OooO0OO.this;
                if (oooO0OO.f18768OooO0oO != this.f18772OooO0o) {
                    throw new ConcurrentModificationException();
                }
                com.google.common.base.o0OoOo0.OooOOO(this.f18773OooO0o0 != null, "no calls to next() since the last call to remove()");
                oooO0OO.remove(this.f18773OooO0o0.f18960OooO0o0);
                this.f18772OooO0o = oooO0OO.f18768OooO0oO;
                this.f18773OooO0o0 = null;
            }
        }

        public OooO0OO(K k, int i) {
            this.f18765OooO0Oo = k;
            this.f18767OooO0o0 = new OooO0O0[o000OO0O.OooO00o(1.0d, i)];
        }

        @Override // com.google.common.collect.LinkedHashMultimap.OooO0o
        public final OooO0o<K, V> OooO00o() {
            return this.f18769OooO0oo;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.OooO0o
        public final void OooO0O0(OooO0o<K, V> oooO0o) {
            this.f18769OooO0oo = oooO0o;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.OooO0o
        public final void OooO0OO(OooO0o<K, V> oooO0o) {
            this.f18764OooO = oooO0o;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(@ParametricNullness V v) {
            int iOooO0OO = o000OO0O.OooO0OO(v);
            OooO0O0<K, V>[] oooO0O0Arr = this.f18767OooO0o0;
            int length = (oooO0O0Arr.length - 1) & iOooO0OO;
            OooO0O0<K, V> oooO0O0 = oooO0O0Arr[length];
            OooO0O0<K, V> oooO0O1 = oooO0O0;
            while (true) {
                boolean z = false;
                if (oooO0O1 == null) {
                    OooO0O0<K, V> oooO0O2 = new OooO0O0<>(this.f18765OooO0Oo, v, iOooO0OO, oooO0O0);
                    OooO0o<K, V> oooO0o = this.f18764OooO;
                    oooO0o.OooO0O0(oooO0O2);
                    oooO0O2.f18761OooO0oo = oooO0o;
                    oooO0O2.f18758OooO = this;
                    this.f18764OooO = oooO0O2;
                    LinkedHashMultimap linkedHashMultimap = LinkedHashMultimap.this;
                    OooO0O0<K, V> oooO0O3 = linkedHashMultimap.f18754OooOO0O.f18762OooOO0;
                    Objects.requireNonNull(oooO0O3);
                    oooO0O3.f18763OooOO0O = oooO0O2;
                    oooO0O2.f18762OooOO0 = oooO0O3;
                    OooO0O0<K, V> oooO0O4 = linkedHashMultimap.f18754OooOO0O;
                    oooO0O2.f18763OooOO0O = oooO0O4;
                    oooO0O4.f18762OooOO0 = oooO0O2;
                    OooO0O0<K, V>[] oooO0O0Arr2 = this.f18767OooO0o0;
                    oooO0O0Arr2[length] = oooO0O2;
                    int i = this.f18766OooO0o + 1;
                    this.f18766OooO0o = i;
                    this.f18768OooO0oO++;
                    int length2 = oooO0O0Arr2.length;
                    if (i > ((double) length2) * 1.0d && length2 < 1073741824) {
                        z = true;
                    }
                    if (z) {
                        int length3 = oooO0O0Arr2.length * 2;
                        OooO0O0<K, V>[] oooO0O0Arr3 = new OooO0O0[length3];
                        this.f18767OooO0o0 = oooO0O0Arr3;
                        int i2 = length3 - 1;
                        for (OooO0o<K, V> oooO0oOooO00o = this.f18769OooO0oo; oooO0oOooO00o != this; oooO0oOooO00o = oooO0oOooO00o.OooO00o()) {
                            OooO0O0<K, V> oooO0O5 = (OooO0O0) oooO0oOooO00o;
                            int i3 = oooO0O5.f18759OooO0o & i2;
                            oooO0O5.f18760OooO0oO = oooO0O0Arr3[i3];
                            oooO0O0Arr3[i3] = oooO0O5;
                        }
                    }
                    return true;
                }
                if (oooO0O1.f18759OooO0o == iOooO0OO && com.google.common.base.Oooo0.OooO00o(oooO0O1.f18960OooO0o0, v)) {
                    return false;
                }
                oooO0O1 = oooO0O1.f18760OooO0oO;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            Arrays.fill(this.f18767OooO0o0, (Object) null);
            this.f18766OooO0o = 0;
            for (OooO0o<K, V> oooO0oOooO00o = this.f18769OooO0oo; oooO0oOooO00o != this; oooO0oOooO00o = oooO0oOooO00o.OooO00o()) {
                OooO0O0 oooO0O0 = (OooO0O0) oooO0oOooO00o;
                OooO0O0<K, V> oooO0O1 = oooO0O0.f18762OooOO0;
                Objects.requireNonNull(oooO0O1);
                OooO0O0<K, V> oooO0O2 = oooO0O0.f18763OooOO0O;
                Objects.requireNonNull(oooO0O2);
                oooO0O1.f18763OooOO0O = oooO0O2;
                oooO0O2.f18762OooOO0 = oooO0O1;
            }
            this.f18769OooO0oo = this;
            this.f18764OooO = this;
            this.f18768OooO0oO++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            int iOooO0OO = o000OO0O.OooO0OO(obj);
            OooO0O0<K, V>[] oooO0O0Arr = this.f18767OooO0o0;
            OooO0O0<K, V> oooO0O0 = oooO0O0Arr[(oooO0O0Arr.length - 1) & iOooO0OO];
            while (true) {
                boolean z = false;
                if (oooO0O0 == null) {
                    return false;
                }
                if (oooO0O0.f18759OooO0o == iOooO0OO && com.google.common.base.Oooo0.OooO00o(oooO0O0.f18960OooO0o0, obj)) {
                    z = true;
                }
                if (z) {
                    return true;
                }
                oooO0O0 = oooO0O0.f18760OooO0oO;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<V> iterator() {
            return new OooO00o();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        public final boolean remove(@CheckForNull Object obj) {
            int iOooO0OO = o000OO0O.OooO0OO(obj);
            OooO0O0<K, V>[] oooO0O0Arr = this.f18767OooO0o0;
            int length = (oooO0O0Arr.length - 1) & iOooO0OO;
            OooO0O0<K, V> oooO0O0 = oooO0O0Arr[length];
            OooO0O0<K, V> oooO0O1 = null;
            while (true) {
                boolean z = false;
                if (oooO0O0 == null) {
                    return false;
                }
                if (oooO0O0.f18759OooO0o == iOooO0OO && com.google.common.base.Oooo0.OooO00o(oooO0O0.f18960OooO0o0, obj)) {
                    z = true;
                }
                if (z) {
                    if (oooO0O1 == null) {
                        this.f18767OooO0o0[length] = oooO0O0.f18760OooO0oO;
                    } else {
                        oooO0O1.f18760OooO0oO = oooO0O0.f18760OooO0oO;
                    }
                    OooO0o<K, V> oooO0oOooO0Oo = oooO0O0.OooO0Oo();
                    OooO0o<K, V> oooO0oOooO00o = oooO0O0.OooO00o();
                    oooO0oOooO0Oo.OooO0O0(oooO0oOooO00o);
                    oooO0oOooO00o.OooO0OO(oooO0oOooO0Oo);
                    OooO0O0<K, V> oooO0O2 = oooO0O0.f18762OooOO0;
                    Objects.requireNonNull(oooO0O2);
                    OooO0O0<K, V> oooO0O3 = oooO0O0.f18763OooOO0O;
                    Objects.requireNonNull(oooO0O3);
                    oooO0O2.f18763OooOO0O = oooO0O3;
                    oooO0O3.f18762OooOO0 = oooO0O2;
                    this.f18766OooO0o--;
                    this.f18768OooO0oO++;
                    return true;
                }
                oooO0O1 = oooO0O0;
                oooO0O0 = oooO0O0.f18760OooO0oO;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f18766OooO0o;
        }
    }

    public interface OooO0o<K, V> {
        OooO0o<K, V> OooO00o();

        void OooO0O0(OooO0o<K, V> oooO0o);

        void OooO0OO(OooO0o<K, V> oooO0o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        OooO0O0<K, V> oooO0O0 = new OooO0O0<>(null, null, 0, null);
        this.f18754OooOO0O = oooO0O0;
        oooO0O0.f18763OooOO0O = oooO0O0;
        oooO0O0.f18762OooOO0 = oooO0O0;
        this.f18753OooOO0 = 2;
        int i = objectInputStream.readInt();
        o000OOo o000ooo2 = new o000OOo(12);
        for (int i2 = 0; i2 < i; i2++) {
            Object object = objectInputStream.readObject();
            o000ooo2.put(object, OooOO0o(object));
        }
        int i3 = objectInputStream.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            Object object2 = objectInputStream.readObject();
            Object object3 = objectInputStream.readObject();
            Collection collection = (Collection) o000ooo2.get(object2);
            Objects.requireNonNull(collection);
            collection.add(object3);
        }
        OooOOo(o000ooo2);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(super.keySet().size());
        Iterator<K> it = super.keySet().iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
        objectOutputStream.writeInt(this.f18830OooO);
        for (Map.Entry<K, V> entry : super.OooO0oo()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.OooOO0, com.google.common.collect.OooOOO
    public final Iterator<Map.Entry<K, V>> OooO() {
        return new OooO00o();
    }

    @Override // com.google.common.collect.OooOo, com.google.common.collect.OooOO0, com.google.common.collect.OooOOO
    public final Collection OooO0oo() {
        return super.OooO0oo();
    }

    @Override // com.google.common.collect.OooOO0, com.google.common.collect.OooOOO
    public final Iterator<V> OooOO0() {
        return new o00OO00O(new OooO00o());
    }

    @Override // com.google.common.collect.OooOO0
    public final Collection OooOO0O() {
        return new o000000(this.f18753OooOO0);
    }

    @Override // com.google.common.collect.OooOO0
    public final Collection<V> OooOO0o(@ParametricNullness K k) {
        return new OooO0OO(k, this.f18753OooOO0);
    }

    @Override // com.google.common.collect.OooOO0
    public final Collection<V> OooOo00() {
        return super.OooOo00();
    }

    @Override // com.google.common.collect.OooOo
    /* JADX INFO: renamed from: OooOo0o */
    public final Set<Map.Entry<K, V>> OooO0oo() {
        return super.OooO0oo();
    }

    @Override // com.google.common.collect.OooOO0, com.google.common.collect.o00OO
    public final void clear() {
        super.clear();
        OooO0O0<K, V> oooO0O0 = this.f18754OooOO0O;
        oooO0O0.f18763OooOO0O = oooO0O0;
        oooO0O0.f18762OooOO0 = oooO0O0;
    }

    @Override // com.google.common.collect.OooOOO, com.google.common.collect.o00OO
    public final Set<K> keySet() {
        return super.keySet();
    }
}
