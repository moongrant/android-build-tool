package p021OooOooo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class o00oO0o<K, V> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public static Object[] f415Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public static Object[] f416OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static int f417OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static int f418OoooO0O;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int[] f419Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Object[] f420Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f421Oooo0oo;

    public o00oO0o() {
        this.f419Oooo0o = o00O0O.f404OooO00o;
        this.f420Oooo0oO = o00O0O.f406OooO0OO;
        this.f421Oooo0oo = 0;
    }

    private void OooO00o(int i) {
        if (i == 8) {
            synchronized (o00oO0o.class) {
                Object[] objArr = f416OoooO0;
                if (objArr != null) {
                    this.f420Oooo0oO = objArr;
                    f416OoooO0 = (Object[]) objArr[0];
                    this.f419Oooo0o = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f418OoooO0O--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (o00oO0o.class) {
                Object[] objArr2 = f415Oooo;
                if (objArr2 != null) {
                    this.f420Oooo0oO = objArr2;
                    f415Oooo = (Object[]) objArr2[0];
                    this.f419Oooo0o = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f417OoooO00--;
                    return;
                }
            }
        }
        this.f419Oooo0o = new int[i];
        this.f420Oooo0oO = new Object[i << 1];
    }

    public static void OooO0OO(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (o00oO0o.class) {
                if (f418OoooO0O < 10) {
                    objArr[0] = f416OoooO0;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f416OoooO0 = objArr;
                    f418OoooO0O++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (o00oO0o.class) {
                if (f417OoooO00 < 10) {
                    objArr[0] = f415Oooo;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f415Oooo = objArr;
                    f417OoooO00++;
                }
            }
        }
    }

    public final K OooO(int i) {
        return (K) this.f420Oooo0oO[i << 1];
    }

    public final void OooO0O0(int i) {
        int i2 = this.f421Oooo0oo;
        int[] iArr = this.f419Oooo0o;
        if (iArr.length < i) {
            Object[] objArr = this.f420Oooo0oO;
            OooO00o(i);
            if (this.f421Oooo0oo > 0) {
                System.arraycopy(iArr, 0, this.f419Oooo0o, 0, i2);
                System.arraycopy(objArr, 0, this.f420Oooo0oO, 0, i2 << 1);
            }
            OooO0OO(iArr, objArr, i2);
        }
        if (this.f421Oooo0oo != i2) {
            throw new ConcurrentModificationException();
        }
    }

    final int OooO0Oo(Object obj, int i) {
        int i2 = this.f421Oooo0oo;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iOooO0O0 = o00O0O.OooO0O0(this.f419Oooo0o, i2, i);
            if (iOooO0O0 < 0 || obj.equals(this.f420Oooo0oO[iOooO0O0 << 1])) {
                return iOooO0O0;
            }
            int i3 = iOooO0O0 + 1;
            while (i3 < i2 && this.f419Oooo0o[i3] == i) {
                if (obj.equals(this.f420Oooo0oO[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iOooO0O0 - 1; i4 >= 0 && this.f419Oooo0o[i4] == i; i4--) {
                if (obj.equals(this.f420Oooo0oO[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int OooO0o0(@Nullable Object obj) {
        return obj == null ? OooO0oO() : OooO0Oo(obj, obj.hashCode());
    }

    public final int OooO0oO() {
        int i = this.f421Oooo0oo;
        if (i == 0) {
            return -1;
        }
        try {
            int iOooO0O0 = o00O0O.OooO0O0(this.f419Oooo0o, i, 0);
            if (iOooO0O0 < 0 || this.f420Oooo0oO[iOooO0O0 << 1] == null) {
                return iOooO0O0;
            }
            int i2 = iOooO0O0 + 1;
            while (i2 < i && this.f419Oooo0o[i2] == 0) {
                if (this.f420Oooo0oO[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iOooO0O0 - 1; i3 >= 0 && this.f419Oooo0o[i3] == 0; i3--) {
                if (this.f420Oooo0oO[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    final int OooO0oo(Object obj) {
        int i = this.f421Oooo0oo * 2;
        Object[] objArr = this.f420Oooo0oO;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public void OooOO0(@NonNull o00oO0o<? extends K, ? extends V> o00oo0o2) {
        int i = o00oo0o2.f421Oooo0oo;
        OooO0O0(this.f421Oooo0oo + i);
        if (this.f421Oooo0oo != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(o00oo0o2.OooO(i2), o00oo0o2.OooOOO0(i2));
            }
        } else if (i > 0) {
            System.arraycopy(o00oo0o2.f419Oooo0o, 0, this.f419Oooo0o, 0, i);
            System.arraycopy(o00oo0o2.f420Oooo0oO, 0, this.f420Oooo0oO, 0, i << 1);
            this.f421Oooo0oo = i;
        }
    }

    public V OooOO0O(int i) {
        Object[] objArr = this.f420Oooo0oO;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f421Oooo0oo;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.f419Oooo0o;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i4) {
                    int i5 = i + 1;
                    int i6 = i4 - i;
                    System.arraycopy(iArr, i5, iArr, i, i6);
                    Object[] objArr2 = this.f420Oooo0oO;
                    System.arraycopy(objArr2, i5 << 1, objArr2, i2, i6 << 1);
                }
                Object[] objArr3 = this.f420Oooo0oO;
                int i7 = i4 << 1;
                objArr3[i7] = null;
                objArr3[i7 + 1] = null;
            } else {
                OooO00o(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f421Oooo0oo) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f419Oooo0o, 0, i);
                    System.arraycopy(objArr, 0, this.f420Oooo0oO, 0, i2);
                }
                if (i < i4) {
                    int i8 = i + 1;
                    int i9 = i4 - i;
                    System.arraycopy(iArr, i8, this.f419Oooo0o, i, i9);
                    System.arraycopy(objArr, i8 << 1, this.f420Oooo0oO, i2, i9 << 1);
                }
            }
            if (i3 != this.f421Oooo0oo) {
                throw new ConcurrentModificationException();
            }
            this.f421Oooo0oo = i4;
        }
        return v;
    }

    public V OooOO0o(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f420Oooo0oO;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public final V OooOOO0(int i) {
        return (V) this.f420Oooo0oO[(i << 1) + 1];
    }

    public void clear() {
        int i = this.f421Oooo0oo;
        if (i > 0) {
            int[] iArr = this.f419Oooo0o;
            Object[] objArr = this.f420Oooo0oO;
            this.f419Oooo0o = o00O0O.f404OooO00o;
            this.f420Oooo0oO = o00O0O.f406OooO0OO;
            this.f421Oooo0oo = 0;
            OooO0OO(iArr, objArr, i);
        }
        if (this.f421Oooo0oo > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(@Nullable Object obj) {
        return OooO0o0(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return OooO0oo(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof o00oO0o) {
                o00oO0o o00oo0o2 = (o00oO0o) obj;
                if (this.f421Oooo0oo != o00oo0o2.f421Oooo0oo) {
                    return false;
                }
                for (int i = 0; i < this.f421Oooo0oo; i++) {
                    K kOooO = OooO(i);
                    V vOooOOO0 = OooOOO0(i);
                    Object orDefault = o00oo0o2.getOrDefault(kOooO, null);
                    if (vOooOOO0 == null) {
                        if (orDefault != null || !o00oo0o2.containsKey(kOooO)) {
                            return false;
                        }
                    } else if (!vOooOOO0.equals(orDefault)) {
                        return false;
                    }
                }
                return true;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f421Oooo0oo != map.size()) {
                    return false;
                }
                for (int i2 = 0; i2 < this.f421Oooo0oo; i2++) {
                    K kOooO2 = OooO(i2);
                    V vOooOOO1 = OooOOO0(i2);
                    Object obj2 = map.get(kOooO2);
                    if (vOooOOO1 == null) {
                        if (obj2 != null || !map.containsKey(kOooO2)) {
                            return false;
                        }
                    } else if (!vOooOOO1.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
        }
    }

    @Nullable
    public final V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final V getOrDefault(Object obj, V v) {
        int iOooO0o0 = OooO0o0(obj);
        return iOooO0o0 >= 0 ? (V) this.f420Oooo0oO[(iOooO0o0 << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.f419Oooo0o;
        Object[] objArr = this.f420Oooo0oO;
        int i = this.f421Oooo0oo;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.f421Oooo0oo <= 0;
    }

    @Nullable
    public V put(K k, V v) {
        int i;
        int iOooO0Oo;
        int i2 = this.f421Oooo0oo;
        if (k == null) {
            iOooO0Oo = OooO0oO();
            i = 0;
        } else {
            int iHashCode = k.hashCode();
            i = iHashCode;
            iOooO0Oo = OooO0Oo(k, iHashCode);
        }
        if (iOooO0Oo >= 0) {
            int i3 = (iOooO0Oo << 1) + 1;
            Object[] objArr = this.f420Oooo0oO;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~iOooO0Oo;
        int[] iArr = this.f419Oooo0o;
        if (i2 >= iArr.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.f420Oooo0oO;
            OooO00o(i5);
            if (i2 != this.f421Oooo0oo) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f419Oooo0o;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f420Oooo0oO, 0, objArr2.length);
            }
            OooO0OO(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f419Oooo0o;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f420Oooo0oO;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f421Oooo0oo - i4) << 1);
        }
        int i7 = this.f421Oooo0oo;
        if (i2 == i7) {
            int[] iArr4 = this.f419Oooo0o;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f420Oooo0oO;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f421Oooo0oo = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Nullable
    public final V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, null);
        return orDefault == null ? put(k, v) : orDefault;
    }

    @Nullable
    public final V remove(Object obj) {
        int iOooO0o0 = OooO0o0(obj);
        if (iOooO0o0 >= 0) {
            return OooOO0O(iOooO0o0);
        }
        return null;
    }

    @Nullable
    public final V replace(K k, V v) {
        int iOooO0o0 = OooO0o0(k);
        if (iOooO0o0 >= 0) {
            return OooOO0o(iOooO0o0, v);
        }
        return null;
    }

    public final int size() {
        return this.f421Oooo0oo;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f421Oooo0oo * 28);
        sb.append('{');
        for (int i = 0; i < this.f421Oooo0oo; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K kOooO = OooO(i);
            if (kOooO != this) {
                sb.append(kOooO);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vOooOOO0 = OooOOO0(i);
            if (vOooOOO0 != this) {
                sb.append(vOooOOO0);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int iOooO0o0 = OooO0o0(obj);
        if (iOooO0o0 < 0) {
            return false;
        }
        V vOooOOO0 = OooOOO0(iOooO0o0);
        if (obj2 != vOooOOO0 && (obj2 == null || !obj2.equals(vOooOOO0))) {
            return false;
        }
        OooOO0O(iOooO0o0);
        return true;
    }

    public final boolean replace(K k, V v, V v2) {
        int iOooO0o0 = OooO0o0(k);
        if (iOooO0o0 < 0) {
            return false;
        }
        V vOooOOO0 = OooOOO0(iOooO0o0);
        if (vOooOOO0 != v && (v == null || !v.equals(vOooOOO0))) {
            return false;
        }
        OooOO0o(iOooO0o0, v2);
        return true;
    }

    public o00oO0o(int i) {
        if (i == 0) {
            this.f419Oooo0o = o00O0O.f404OooO00o;
            this.f420Oooo0oO = o00O0O.f406OooO0OO;
        } else {
            OooO00o(i);
        }
        this.f421Oooo0oo = 0;
    }
}
