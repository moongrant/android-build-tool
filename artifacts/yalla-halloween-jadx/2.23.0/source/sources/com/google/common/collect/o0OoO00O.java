package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;
import kotlin.UByte;
import kotlin.UShort;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public final class o0OoO00O<K, V> extends ImmutableMap<K, V> {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final o0OoO00O f19626OooOO0 = new o0OoO00O(new Object[0], 0, null);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final transient int f19627OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @CheckForNull
    public final transient Object f19628OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @VisibleForTesting
    public final transient Object[] f19629OooO0oo;

    public static class OooO00o<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final transient int f19630OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final transient ImmutableMap<K, V> f19631OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final transient Object[] f19632OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final transient int f19633OooOO0;

        /* JADX INFO: renamed from: com.google.common.collect.o0OoO00O$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0235OooO00o extends ImmutableList<Map.Entry<K, V>> {
            public C0235OooO00o() {
            }

            @Override // com.google.common.collect.ImmutableCollection
            public final boolean OooO0o() {
                return true;
            }

            @Override // java.util.List
            public final Object get(int i) {
                OooO00o oooO00o = OooO00o.this;
                com.google.common.base.o000oOoO.OooO0oo(i, oooO00o.f19633OooOO0);
                int i2 = i * 2;
                int i3 = oooO00o.f19630OooO;
                Object[] objArr = oooO00o.f19632OooO0oo;
                Object obj = objArr[i3 + i2];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i2 + (i3 ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return OooO00o.this.f19633OooOO0;
            }
        }

        public OooO00o(ImmutableMap<K, V> immutableMap, Object[] objArr, int i, int i2) {
            this.f19631OooO0oO = immutableMap;
            this.f19632OooO0oo = objArr;
            this.f19630OooO = i;
            this.f19633OooOO0 = i2;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int OooO0O0(int i, Object[] objArr) {
            return OooO00o().OooO0O0(i, objArr);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean OooO0o() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: OooO0oo */
        public final o0OO0<Map.Entry<K, V>> iterator() {
            return OooO00o().listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableSet
        public final ImmutableList<Map.Entry<K, V>> OooOOO0() {
            return new C0235OooO00o();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f19631OooO0oO.get(key));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f19633OooOO0;
        }
    }

    public static final class OooO0O0<K> extends ImmutableSet<K> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final transient ImmutableMap<K, ?> f19635OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final transient ImmutableList<K> f19636OooO0oo;

        public OooO0O0(ImmutableMap immutableMap, OooO0OO oooO0OO) {
            this.f19635OooO0oO = immutableMap;
            this.f19636OooO0oo = oooO0OO;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public final ImmutableList<K> OooO00o() {
            return this.f19636OooO0oo;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int OooO0O0(int i, Object[] objArr) {
            return this.f19636OooO0oo.OooO0O0(i, objArr);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean OooO0o() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* JADX INFO: renamed from: OooO0oo */
        public final o0OO0<K> iterator() {
            return this.f19636OooO0oo.listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            return this.f19635OooO0oO.get(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f19635OooO0oO.size();
        }
    }

    public static final class OooO0OO extends ImmutableList<Object> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final transient Object[] f19637OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final transient int f19638OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final transient int f19639OooO0oo;

        public OooO0OO(Object[] objArr, int i, int i2) {
            this.f19637OooO0o = objArr;
            this.f19638OooO0oO = i;
            this.f19639OooO0oo = i2;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean OooO0o() {
            return true;
        }

        @Override // java.util.List
        public final Object get(int i) {
            com.google.common.base.o000oOoO.OooO0oo(i, this.f19639OooO0oo);
            Object obj = this.f19637OooO0o[(i * 2) + this.f19638OooO0oO];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f19639OooO0oo;
        }
    }

    public o0OoO00O(Object[] objArr, int i, @CheckForNull Object obj) {
        this.f19628OooO0oO = obj;
        this.f19629OooO0oo = objArr;
        this.f19627OooO = i;
    }

    public static <K, V> o0OoO00O<K, V> OooOO0O(int i, Object[] objArr, ImmutableMap.OooO00o<K, V> oooO00o) {
        if (i == 0) {
            return f19626OooOO0;
        }
        if (i == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new o0OoO00O<>(objArr, 1, null);
        }
        com.google.common.base.o000oOoO.OooOO0(i, objArr.length >> 1);
        Object objOooOO0o = OooOO0o(objArr, i, ImmutableSet.OooO(i), 0);
        if (objOooOO0o instanceof Object[]) {
            Object[] objArr2 = (Object[]) objOooOO0o;
            ImmutableMap.OooO00o.C0229OooO00o c0229OooO00o = (ImmutableMap.OooO00o.C0229OooO00o) objArr2[2];
            if (oooO00o == null) {
                throw c0229OooO00o.OooO00o();
            }
            oooO00o.f19169OooO0OO = c0229OooO00o;
            Object obj = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objOooOO0o = obj;
            i = iIntValue;
        }
        return new o0OoO00O<>(objArr, i, objOooOO0o);
    }

    @CheckForNull
    public static Object OooOO0o(Object[] objArr, int i, int i2, int i3) {
        ImmutableMap.OooO00o.C0229OooO00o c0229OooO00o = null;
        if (i == 1) {
            Objects.requireNonNull(objArr[i3]);
            Objects.requireNonNull(objArr[i3 ^ 1]);
            return null;
        }
        int i4 = i2 - 1;
        int i5 = -1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                int i8 = (i7 * 2) + i3;
                int i9 = (i6 * 2) + i3;
                Object obj = objArr[i8];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i8 ^ 1];
                Objects.requireNonNull(obj2);
                int iOooO0O0 = o000OO0O.OooO0O0(obj.hashCode());
                while (true) {
                    int i10 = iOooO0O0 & i4;
                    int i11 = bArr[i10] & UByte.MAX_VALUE;
                    if (i11 == 255) {
                        bArr[i10] = (byte) i9;
                        if (i6 < i7) {
                            objArr[i9] = obj;
                            objArr[i9 ^ 1] = obj2;
                        }
                        i6++;
                        break;
                    }
                    if (obj.equals(objArr[i11])) {
                        int i12 = i11 ^ 1;
                        Object obj3 = objArr[i12];
                        Objects.requireNonNull(obj3);
                        c0229OooO00o = new ImmutableMap.OooO00o.C0229OooO00o(obj, obj2, obj3);
                        objArr[i12] = obj2;
                        break;
                    }
                    iOooO0O0 = i10 + 1;
                }
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), c0229OooO00o};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < i; i14++) {
                int i15 = (i14 * 2) + i3;
                int i16 = (i13 * 2) + i3;
                Object obj4 = objArr[i15];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i15 ^ 1];
                Objects.requireNonNull(obj5);
                int iOooO0O1 = o000OO0O.OooO0O0(obj4.hashCode());
                while (true) {
                    int i17 = iOooO0O1 & i4;
                    int i18 = sArr[i17] & UShort.MAX_VALUE;
                    if (i18 == 65535) {
                        sArr[i17] = (short) i16;
                        if (i13 < i14) {
                            objArr[i16] = obj4;
                            objArr[i16 ^ 1] = obj5;
                        }
                        i13++;
                        break;
                    }
                    if (obj4.equals(objArr[i18])) {
                        int i19 = i18 ^ 1;
                        Object obj6 = objArr[i19];
                        Objects.requireNonNull(obj6);
                        c0229OooO00o = new ImmutableMap.OooO00o.C0229OooO00o(obj4, obj5, obj6);
                        objArr[i19] = obj5;
                        break;
                    }
                    iOooO0O1 = i17 + 1;
                }
            }
            return i13 == i ? sArr : new Object[]{sArr, Integer.valueOf(i13), c0229OooO00o};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i20 = 0;
        int i21 = 0;
        while (i20 < i) {
            int i22 = (i20 * 2) + i3;
            int i23 = (i21 * 2) + i3;
            Object obj7 = objArr[i22];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i22 ^ 1];
            Objects.requireNonNull(obj8);
            int iOooO0O2 = o000OO0O.OooO0O0(obj7.hashCode());
            while (true) {
                int i24 = iOooO0O2 & i4;
                int i25 = iArr[i24];
                if (i25 == i5) {
                    iArr[i24] = i23;
                    if (i21 < i20) {
                        objArr[i23] = obj7;
                        objArr[i23 ^ 1] = obj8;
                    }
                    i21++;
                    break;
                }
                if (obj7.equals(objArr[i25])) {
                    int i26 = i25 ^ 1;
                    Object obj9 = objArr[i26];
                    Objects.requireNonNull(obj9);
                    c0229OooO00o = new ImmutableMap.OooO00o.C0229OooO00o(obj7, obj8, obj9);
                    objArr[i26] = obj8;
                    break;
                }
                iOooO0O2 = i24 + 1;
                i5 = -1;
            }
            i20++;
            i5 = -1;
        }
        return i21 == i ? iArr : new Object[]{iArr, Integer.valueOf(i21), c0229OooO00o};
    }

    @CheckForNull
    public static Object OooOOO0(Object[] objArr, int i, int i2, @CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iOooO0O0 = o000OO0O.OooO0O0(obj2.hashCode());
            while (true) {
                int i3 = iOooO0O0 & length;
                int i4 = bArr[i3] & UByte.MAX_VALUE;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iOooO0O0 = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iOooO0O1 = o000OO0O.OooO0O0(obj2.hashCode());
            while (true) {
                int i5 = iOooO0O1 & length2;
                int i6 = sArr[i5] & UShort.MAX_VALUE;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                iOooO0O1 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iOooO0O2 = o000OO0O.OooO0O0(obj2.hashCode());
            while (true) {
                int i7 = iOooO0O2 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                iOooO0O2 = i7 + 1;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<Map.Entry<K, V>> OooO0OO() {
        return new OooO00o(this, this.f19629OooO0oo, 0, this.f19627OooO);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<K> OooO0Oo() {
        return new OooO0O0(this, new OooO0OO(this.f19629OooO0oo, 0, this.f19627OooO));
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection<V> OooO0o0() {
        return new OooO0OO(this.f19629OooO0oo, 1, this.f19627OooO);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean OooO0oO() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @CheckForNull
    public final V get(@CheckForNull Object obj) {
        V v = (V) OooOOO0(this.f19629OooO0oo, this.f19627OooO, 0, this.f19628OooO0oO, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f19627OooO;
    }
}
