package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
public final class o0O00000<K, V> extends ImmutableMap<K, V> {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final ImmutableMap<Object, Object> f18579OoooO0O = new o0O00000(null, new Object[0], 0);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final transient int[] f18580Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final transient int f18581OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @VisibleForTesting
    public final transient Object[] f18582OoooO00;

    public static class OooO00o<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final transient ImmutableMap<K, V> f18583Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final transient int f18584OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final transient Object[] f18585OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final transient int f18586OoooO0O;

        /* JADX INFO: renamed from: com.google.common.collect.o0O00000$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0125OooO00o extends ImmutableList<Map.Entry<K, V>> {
            public C0125OooO00o() {
            }

            @Override // com.google.common.collect.ImmutableCollection
            public final boolean OooO0oo() {
                return true;
            }

            @Override // java.util.List
            public final Object get(int i) {
                o0OOOO0o.OooOOOO.OooO(i, OooO00o.this.f18586OoooO0O);
                OooO00o oooO00o = OooO00o.this;
                Object[] objArr = oooO00o.f18585OoooO00;
                int i2 = i * 2;
                int i3 = oooO00o.f18584OoooO0;
                return new AbstractMap.SimpleImmutableEntry(objArr[i2 + i3], objArr[i2 + (i3 ^ 1)]);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return OooO00o.this.f18586OoooO0O;
            }
        }

        public OooO00o(ImmutableMap<K, V> immutableMap, Object[] objArr, int i, int i2) {
            this.f18583Oooo = immutableMap;
            this.f18585OoooO00 = objArr;
            this.f18584OoooO0 = i;
            this.f18586OoooO0O = i2;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: OooO */
        public final o0O0o000<Map.Entry<K, V>> iterator() {
            return OooO00o().listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int OooO0O0(Object[] objArr) {
            return OooO00o().OooO0O0(objArr);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean OooO0oo() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet
        public final ImmutableList<Map.Entry<K, V>> OooOOO0() {
            return new C0125OooO00o();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f18583Oooo.get(key));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f18586OoooO0O;
        }
    }

    public static final class OooO0O0<K> extends ImmutableSet<K> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final transient ImmutableMap<K, ?> f18588Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final transient ImmutableList<K> f18589OoooO00;

        public OooO0O0(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.f18588Oooo = immutableMap;
            this.f18589OoooO00 = immutableList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: OooO */
        public final o0O0o000<K> iterator() {
            return this.f18589OoooO00.listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public final ImmutableList<K> OooO00o() {
            return this.f18589OoooO00;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int OooO0O0(Object[] objArr) {
            return this.f18589OoooO00.OooO0O0(objArr);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean OooO0oo() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@NullableDecl Object obj) {
            return this.f18588Oooo.get(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f18588Oooo.size();
        }
    }

    public static final class OooO0OO extends ImmutableList<Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final transient int f18590Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final transient Object[] f18591Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final transient int f18592OoooO00;

        public OooO0OO(Object[] objArr, int i, int i2) {
            this.f18591Oooo0oo = objArr;
            this.f18590Oooo = i;
            this.f18592OoooO00 = i2;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean OooO0oo() {
            return true;
        }

        @Override // java.util.List
        public final Object get(int i) {
            o0OOOO0o.OooOOOO.OooO(i, this.f18592OoooO00);
            return this.f18591Oooo0oo[(i * 2) + this.f18590Oooo];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f18592OoooO00;
        }
    }

    public o0O00000(int[] iArr, Object[] objArr, int i) {
        this.f18580Oooo = iArr;
        this.f18582OoooO00 = objArr;
        this.f18581OoooO0 = i;
    }

    public static <K, V> o0O00000<K, V> OooOO0o(int i, Object[] objArr) {
        if (i == 0) {
            return (o0O00000<K, V>) f18579OoooO0O;
        }
        if (i == 1) {
            oo000o.OooO00o(objArr[0], objArr[1]);
            return new o0O00000<>(null, objArr, 1);
        }
        o0OOOO0o.OooOOOO.OooOO0O(i, objArr.length >> 1);
        return new o0O00000<>(OooOOO0(objArr, i, ImmutableSet.OooOO0(i), 0), objArr, i);
    }

    public static Object OooOOO(@NullableDecl int[] iArr, @NullableDecl Object[] objArr, int i, int i2, @NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[i2].equals(obj)) {
                return objArr[i2 ^ 1];
            }
            return null;
        }
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        int iOooO0O0 = o000O0Oo.OooO0O0(obj.hashCode());
        while (true) {
            int i3 = iOooO0O0 & length;
            int i4 = iArr[i3];
            if (i4 == -1) {
                return null;
            }
            if (objArr[i4].equals(obj)) {
                return objArr[i4 ^ 1];
            }
            iOooO0O0 = i3 + 1;
        }
    }

    public static int[] OooOOO0(Object[] objArr, int i, int i2, int i3) {
        int i4;
        if (i == 1) {
            oo000o.OooO00o(objArr[i3], objArr[i3 ^ 1]);
            return null;
        }
        int i5 = i2 - 1;
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        for (int i6 = 0; i6 < i; i6++) {
            int i7 = i6 * 2;
            int i8 = i7 + i3;
            Object obj = objArr[i8];
            Object obj2 = objArr[i7 + (i3 ^ 1)];
            oo000o.OooO00o(obj, obj2);
            int iOooO0O0 = o000O0Oo.OooO0O0(obj.hashCode());
            while (true) {
                i4 = iOooO0O0 & i5;
                int i9 = iArr[i4];
                if (i9 == -1) {
                    break;
                }
                if (objArr[i9].equals(obj)) {
                    throw new IllegalArgumentException("Multiple entries with same key: " + obj + "=" + obj2 + " and " + objArr[i9] + "=" + objArr[i9 ^ 1]);
                }
                iOooO0O0 = i4 + 1;
            }
            iArr[i4] = i8;
        }
        return iArr;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<Map.Entry<K, V>> OooO0OO() {
        return new OooO00o(this, this.f18582OoooO00, 0, this.f18581OoooO0);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<K> OooO0Oo() {
        return new OooO0O0(this, new OooO0OO(this.f18582OoooO00, 0, this.f18581OoooO0));
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection<V> OooO0o0() {
        return new OooO0OO(this.f18582OoooO00, 1, this.f18581OoooO0);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean OooO0oo() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        return (V) OooOOO(this.f18580Oooo, this.f18582OoooO00, this.f18581OoooO0, 0, obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f18581OoooO0;
    }
}
