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
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
public final class LinkedHashMultimap<K, V> extends o00O0O00<K, V> {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @VisibleForTesting
    public transient int f18237OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public transient OooO0O0<K, V> f18238OoooO0O;

    public class OooO00o implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public OooO0O0<K, V> f18239Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @NullableDecl
        public OooO0O0<K, V> f18240Oooo0oO;

        public OooO00o() {
            this.f18239Oooo0o = LinkedHashMultimap.this.f18238OoooO0O.f18244OoooO;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18239Oooo0o != LinkedHashMultimap.this.f18238OoooO0O;
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            OooO0O0<K, V> oooO0O0 = this.f18239Oooo0o;
            this.f18240Oooo0oO = oooO0O0;
            this.f18239Oooo0o = oooO0O0.f18244OoooO;
            return oooO0O0;
        }

        @Override // java.util.Iterator
        public final void remove() {
            oo000o.OooO0Oo(this.f18240Oooo0oO != null);
            LinkedHashMultimap linkedHashMultimap = LinkedHashMultimap.this;
            OooO0O0<K, V> oooO0O0 = this.f18240Oooo0oO;
            linkedHashMultimap.remove(oooO0O0.f18454Oooo0o, oooO0O0.f18455Oooo0oO);
            this.f18240Oooo0oO = null;
        }
    }

    @VisibleForTesting
    public static final class OooO0O0<K, V> extends o000OO0O<K, V> implements OooO0o<K, V> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        @NullableDecl
        public OooO0O0<K, V> f18242Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final int f18243Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        @NullableDecl
        public OooO0O0<K, V> f18244OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        @NullableDecl
        public OooO0o<K, V> f18245OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        @NullableDecl
        public OooO0o<K, V> f18246OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        @NullableDecl
        public OooO0O0<K, V> f18247OoooO0O;

        public OooO0O0(@NullableDecl K k, @NullableDecl V v, int i, @NullableDecl OooO0O0<K, V> oooO0O0) {
            super(k, v);
            this.f18243Oooo0oo = i;
            this.f18242Oooo = oooO0O0;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.OooO0o
        public final void OooO00o(OooO0o<K, V> oooO0o) {
            this.f18245OoooO0 = oooO0o;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.OooO0o
        public final OooO0o<K, V> OooO0O0() {
            return this.f18245OoooO0;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.OooO0o
        public final void OooO0OO(OooO0o<K, V> oooO0o) {
            this.f18246OoooO00 = oooO0o;
        }

        public final OooO0o<K, V> OooO0Oo() {
            return this.f18246OoooO00;
        }

        public final boolean OooO0o0(@NullableDecl Object obj, int i) {
            return this.f18243Oooo0oo == i && o0OOOO0o.OooOOO.OooO00o(this.f18455Oooo0oO, obj);
        }
    }

    @VisibleForTesting
    public final class OooO0OO extends o0O00O0o.OooO00o<V> implements OooO0o<K, V> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final K f18249Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @VisibleForTesting
        public OooO0O0<K, V>[] f18250Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f18251Oooo0oo = 0;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f18248Oooo = 0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public OooO0o<K, V> f18253OoooO00 = this;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public OooO0o<K, V> f18252OoooO0 = this;

        public class OooO00o implements Iterator<V> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public OooO0o<K, V> f18256Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            @NullableDecl
            public OooO0O0<K, V> f18257Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public int f18258Oooo0oo;

            public OooO00o() {
                this.f18256Oooo0o = OooO0OO.this.f18253OoooO00;
                this.f18258Oooo0oo = OooO0OO.this.f18248Oooo;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                OooO0OO oooO0OO = OooO0OO.this;
                if (oooO0OO.f18248Oooo == this.f18258Oooo0oo) {
                    return this.f18256Oooo0o != oooO0OO;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public final V next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                OooO0O0<K, V> oooO0O0 = (OooO0O0) this.f18256Oooo0o;
                V v = oooO0O0.f18455Oooo0oO;
                this.f18257Oooo0oO = oooO0O0;
                this.f18256Oooo0o = oooO0O0.f18245OoooO0;
                return v;
            }

            @Override // java.util.Iterator
            public final void remove() {
                if (OooO0OO.this.f18248Oooo != this.f18258Oooo0oo) {
                    throw new ConcurrentModificationException();
                }
                oo000o.OooO0Oo(this.f18257Oooo0oO != null);
                OooO0OO.this.remove(this.f18257Oooo0oO.f18455Oooo0oO);
                this.f18258Oooo0oo = OooO0OO.this.f18248Oooo;
                this.f18257Oooo0oO = null;
            }
        }

        public OooO0OO(K k, int i) {
            this.f18249Oooo0o = k;
            this.f18250Oooo0oO = new OooO0O0[o000O0Oo.OooO00o(i, 1.0d)];
        }

        @Override // com.google.common.collect.LinkedHashMultimap.OooO0o
        public final void OooO00o(OooO0o<K, V> oooO0o) {
            this.f18253OoooO00 = oooO0o;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.OooO0o
        public final OooO0o<K, V> OooO0O0() {
            return this.f18253OoooO00;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.OooO0o
        public final void OooO0OO(OooO0o<K, V> oooO0o) {
            this.f18252OoooO0 = oooO0o;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(@NullableDecl V v) {
            int iOooO0OO = o000O0Oo.OooO0OO(v);
            OooO0O0<K, V>[] oooO0O0Arr = this.f18250Oooo0oO;
            int length = (oooO0O0Arr.length - 1) & iOooO0OO;
            OooO0O0<K, V> oooO0O0 = oooO0O0Arr[length];
            OooO0O0<K, V> oooO0O1 = oooO0O0;
            while (true) {
                boolean z = false;
                if (oooO0O1 == null) {
                    OooO0O0<K, V> oooO0O2 = new OooO0O0<>(this.f18249Oooo0o, v, iOooO0OO, oooO0O0);
                    LinkedHashMultimap.OooOOoo(this.f18252OoooO0, oooO0O2);
                    oooO0O2.OooO00o(this);
                    OooO0OO(oooO0O2);
                    OooO0O0<K, V> oooO0O3 = LinkedHashMultimap.this.f18238OoooO0O;
                    OooO0O0<K, V> oooO0O4 = oooO0O3.f18247OoooO0O;
                    oooO0O4.f18244OoooO = oooO0O2;
                    oooO0O2.f18247OoooO0O = oooO0O4;
                    oooO0O2.f18244OoooO = oooO0O3;
                    oooO0O3.f18247OoooO0O = oooO0O2;
                    OooO0O0<K, V>[] oooO0O0Arr2 = this.f18250Oooo0oO;
                    oooO0O0Arr2[length] = oooO0O2;
                    int i = this.f18251Oooo0oo + 1;
                    this.f18251Oooo0oo = i;
                    this.f18248Oooo++;
                    int length2 = oooO0O0Arr2.length;
                    if (i > ((double) length2) * 1.0d && length2 < 1073741824) {
                        z = true;
                    }
                    if (z) {
                        int length3 = oooO0O0Arr2.length * 2;
                        OooO0O0<K, V>[] oooO0O0Arr3 = new OooO0O0[length3];
                        this.f18250Oooo0oO = oooO0O0Arr3;
                        int i2 = length3 - 1;
                        for (OooO0o<K, V> oooO0oOooO0O0 = this.f18253OoooO00; oooO0oOooO0O0 != this; oooO0oOooO0O0 = oooO0oOooO0O0.OooO0O0()) {
                            OooO0O0<K, V> oooO0O5 = (OooO0O0) oooO0oOooO0O0;
                            int i3 = oooO0O5.f18243Oooo0oo & i2;
                            oooO0O5.f18242Oooo = oooO0O0Arr3[i3];
                            oooO0O0Arr3[i3] = oooO0O5;
                        }
                    }
                    return true;
                }
                if (oooO0O1.OooO0o0(v, iOooO0OO)) {
                    return false;
                }
                oooO0O1 = oooO0O1.f18242Oooo;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            Arrays.fill(this.f18250Oooo0oO, (Object) null);
            this.f18251Oooo0oo = 0;
            for (OooO0o<K, V> oooO0oOooO0O0 = this.f18253OoooO00; oooO0oOooO0O0 != this; oooO0oOooO0O0 = oooO0oOooO0O0.OooO0O0()) {
                OooO0O0 oooO0O0 = (OooO0O0) oooO0oOooO0O0;
                OooO0O0<K, V> oooO0O1 = oooO0O0.f18247OoooO0O;
                OooO0O0<K, V> oooO0O2 = oooO0O0.f18244OoooO;
                oooO0O1.f18244OoooO = oooO0O2;
                oooO0O2.f18247OoooO0O = oooO0O1;
            }
            OooO00o(this);
            OooO0OO(this);
            this.f18248Oooo++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@NullableDecl Object obj) {
            int iOooO0OO = o000O0Oo.OooO0OO(obj);
            OooO0O0<K, V>[] oooO0O0Arr = this.f18250Oooo0oO;
            for (OooO0O0<K, V> oooO0O0 = oooO0O0Arr[(oooO0O0Arr.length - 1) & iOooO0OO]; oooO0O0 != null; oooO0O0 = oooO0O0.f18242Oooo) {
                if (oooO0O0.OooO0o0(obj, iOooO0OO)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<V> iterator() {
            return new OooO00o();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        public final boolean remove(@NullableDecl Object obj) {
            int iOooO0OO = o000O0Oo.OooO0OO(obj);
            OooO0O0<K, V>[] oooO0O0Arr = this.f18250Oooo0oO;
            int length = (oooO0O0Arr.length - 1) & iOooO0OO;
            OooO0O0<K, V> oooO0O0 = null;
            OooO0O0<K, V> oooO0O1 = oooO0O0Arr[length];
            while (true) {
                OooO0O0<K, V> oooO0O2 = oooO0O0;
                oooO0O0 = oooO0O1;
                if (oooO0O0 == null) {
                    return false;
                }
                if (oooO0O0.OooO0o0(obj, iOooO0OO)) {
                    if (oooO0O2 == null) {
                        this.f18250Oooo0oO[length] = oooO0O0.f18242Oooo;
                    } else {
                        oooO0O2.f18242Oooo = oooO0O0.f18242Oooo;
                    }
                    OooO0o<K, V> oooO0oOooO0Oo = oooO0O0.OooO0Oo();
                    OooO0o<K, V> oooO0oOooO0O0 = oooO0O0.OooO0O0();
                    oooO0oOooO0Oo.OooO00o(oooO0oOooO0O0);
                    oooO0oOooO0O0.OooO0OO(oooO0oOooO0Oo);
                    OooO0O0<K, V> oooO0O3 = oooO0O0.f18247OoooO0O;
                    OooO0O0<K, V> oooO0O4 = oooO0O0.f18244OoooO;
                    oooO0O3.f18244OoooO = oooO0O4;
                    oooO0O4.f18247OoooO0O = oooO0O3;
                    this.f18251Oooo0oo--;
                    this.f18248Oooo++;
                    return true;
                }
                oooO0O1 = oooO0O0.f18242Oooo;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f18251Oooo0oo;
        }
    }

    public interface OooO0o<K, V> {
        void OooO00o(OooO0o<K, V> oooO0o);

        OooO0o<K, V> OooO0O0();

        void OooO0OO(OooO0o<K, V> oooO0o);
    }

    public static void OooOOoo(OooO0o oooO0o, OooO0o oooO0o2) {
        oooO0o.OooO00o(oooO0o2);
        ((OooO0O0) oooO0o2).f18246OoooO00 = oooO0o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        OooO0O0<K, V> oooO0O0 = new OooO0O0<>(null, null, 0, null);
        this.f18238OoooO0O = oooO0O0;
        oooO0O0.f18244OoooO = oooO0O0;
        oooO0O0.f18247OoooO0O = oooO0O0;
        this.f18237OoooO0 = 2;
        int i = objectInputStream.readInt();
        o0O0O00 o0o0o00 = new o0O0O00(12);
        for (int i2 = 0; i2 < i; i2++) {
            Object object = objectInputStream.readObject();
            o0o0o00.put(object, new OooO0OO(object, this.f18237OoooO0));
        }
        int i3 = objectInputStream.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            Object object2 = objectInputStream.readObject();
            ((Collection) o0o0o00.get(object2)).add(objectInputStream.readObject());
        }
        OooOOO0(o0o0o00);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(super.keySet().size());
        Iterator<K> it = super.keySet().iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
        objectOutputStream.writeInt(this.f18315OoooO00);
        Collection<Map.Entry<K, V>> collectionOooOO0O = this.f18357Oooo0o;
        if (collectionOooOO0O == null) {
            collectionOooOO0O = OooOO0O();
            this.f18357Oooo0o = collectionOooOO0O;
        }
        for (Map.Entry entry : (Set) collectionOooOO0O) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // com.google.common.collect.OooOO0
    public final Collection OooO() {
        return new o000OOo(this.f18237OoooO0);
    }

    @Override // com.google.common.collect.OooOO0, com.google.common.collect.OooOOO
    public final Iterator<Map.Entry<K, V>> OooO0o() {
        return new OooO00o();
    }

    @Override // com.google.common.collect.OooOO0
    public final Collection<V> OooOO0(K k) {
        return new OooO0OO(k, this.f18237OoooO0);
    }

    @Override // com.google.common.collect.OooOO0, com.google.common.collect.o00OO0O0
    public final void clear() {
        super.clear();
        OooO0O0<K, V> oooO0O0 = this.f18238OoooO0O;
        oooO0O0.f18244OoooO = oooO0O0;
        oooO0O0.f18247OoooO0O = oooO0O0;
    }

    @Override // com.google.common.collect.OooOOO, com.google.common.collect.o00OO0O0
    public final Set<K> keySet() {
        return super.keySet();
    }
}
