package p190o00o0O;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class OooOo<K, V> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public static Object[] f38563OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public static Object[] f38564OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static int f38565OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static int f38566OooOO0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int[] f38567OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f38568OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object[] f38569OooO0o0;

    public OooOo() {
        this.f38567OooO0Oo = OooOOO0.f38555OooO00o;
        this.f38569OooO0o0 = OooOOO0.f38557OooO0OO;
        this.f38568OooO0o = 0;
    }

    private void OooO00o(int i) {
        if (i == 8) {
            synchronized (OooOo.class) {
                Object[] objArr = f38563OooO;
                if (objArr != null) {
                    this.f38569OooO0o0 = objArr;
                    f38563OooO = (Object[]) objArr[0];
                    this.f38567OooO0Oo = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f38566OooOO0--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (OooOo.class) {
                Object[] objArr2 = f38564OooO0oO;
                if (objArr2 != null) {
                    this.f38569OooO0o0 = objArr2;
                    f38564OooO0oO = (Object[]) objArr2[0];
                    this.f38567OooO0Oo = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f38565OooO0oo--;
                    return;
                }
            }
        }
        this.f38567OooO0Oo = new int[i];
        this.f38569OooO0o0 = new Object[i << 1];
    }

    public static void OooO0OO(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (OooOo.class) {
                if (f38566OooOO0 < 10) {
                    objArr[0] = f38563OooO;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f38563OooO = objArr;
                    f38566OooOO0++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (OooOo.class) {
                if (f38565OooO0oo < 10) {
                    objArr[0] = f38564OooO0oO;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f38564OooO0oO = objArr;
                    f38565OooO0oo++;
                }
            }
        }
    }

    public void OooO(@NonNull OooO oooO) {
        int i = oooO.f38568OooO0o;
        OooO0O0(this.f38568OooO0o + i);
        if (this.f38568OooO0o != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(oooO.OooO0oo(i2), oooO.OooOO0o(i2));
            }
        } else if (i > 0) {
            System.arraycopy(oooO.f38567OooO0Oo, 0, this.f38567OooO0Oo, 0, i);
            System.arraycopy(oooO.f38569OooO0o0, 0, this.f38569OooO0o0, 0, i << 1);
            this.f38568OooO0o = i;
        }
    }

    public final void OooO0O0(int i) {
        int i2 = this.f38568OooO0o;
        int[] iArr = this.f38567OooO0Oo;
        if (iArr.length < i) {
            Object[] objArr = this.f38569OooO0o0;
            OooO00o(i);
            if (this.f38568OooO0o > 0) {
                System.arraycopy(iArr, 0, this.f38567OooO0Oo, 0, i2);
                System.arraycopy(objArr, 0, this.f38569OooO0o0, 0, i2 << 1);
            }
            OooO0OO(iArr, objArr, i2);
        }
        if (this.f38568OooO0o != i2) {
            throw new ConcurrentModificationException();
        }
    }

    final int OooO0Oo(Object obj, int i) {
        int i2 = this.f38568OooO0o;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iOooO00o = OooOOO0.OooO00o(i2, i, this.f38567OooO0Oo);
            if (iOooO00o < 0 || obj.equals(this.f38569OooO0o0[iOooO00o << 1])) {
                return iOooO00o;
            }
            int i3 = iOooO00o + 1;
            while (i3 < i2 && this.f38567OooO0Oo[i3] == i) {
                if (obj.equals(this.f38569OooO0o0[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iOooO00o - 1; i4 >= 0 && this.f38567OooO0Oo[i4] == i; i4--) {
                if (obj.equals(this.f38569OooO0o0[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int OooO0o() {
        int i = this.f38568OooO0o;
        if (i == 0) {
            return -1;
        }
        try {
            int iOooO00o = OooOOO0.OooO00o(i, 0, this.f38567OooO0Oo);
            if (iOooO00o < 0 || this.f38569OooO0o0[iOooO00o << 1] == null) {
                return iOooO00o;
            }
            int i2 = iOooO00o + 1;
            while (i2 < i && this.f38567OooO0Oo[i2] == 0) {
                if (this.f38569OooO0o0[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iOooO00o - 1; i3 >= 0 && this.f38567OooO0Oo[i3] == 0; i3--) {
                if (this.f38569OooO0o0[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int OooO0o0(@Nullable Object obj) {
        return obj == null ? OooO0o() : OooO0Oo(obj, obj.hashCode());
    }

    final int OooO0oO(Object obj) {
        int i = this.f38568OooO0o * 2;
        Object[] objArr = this.f38569OooO0o0;
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

    public final K OooO0oo(int i) {
        return (K) this.f38569OooO0o0[i << 1];
    }

    public V OooOO0(int i) {
        Object[] objArr = this.f38569OooO0o0;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f38568OooO0o;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.f38567OooO0Oo;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i4) {
                    int i5 = i + 1;
                    int i6 = i4 - i;
                    System.arraycopy(iArr, i5, iArr, i, i6);
                    Object[] objArr2 = this.f38569OooO0o0;
                    System.arraycopy(objArr2, i5 << 1, objArr2, i2, i6 << 1);
                }
                Object[] objArr3 = this.f38569OooO0o0;
                int i7 = i4 << 1;
                objArr3[i7] = null;
                objArr3[i7 + 1] = null;
            } else {
                OooO00o(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f38568OooO0o) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f38567OooO0Oo, 0, i);
                    System.arraycopy(objArr, 0, this.f38569OooO0o0, 0, i2);
                }
                if (i < i4) {
                    int i8 = i + 1;
                    int i9 = i4 - i;
                    System.arraycopy(iArr, i8, this.f38567OooO0Oo, i, i9);
                    System.arraycopy(objArr, i8 << 1, this.f38569OooO0o0, i2, i9 << 1);
                }
            }
            if (i3 != this.f38568OooO0o) {
                throw new ConcurrentModificationException();
            }
            this.f38568OooO0o = i4;
        }
        return v;
    }

    public V OooOO0O(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f38569OooO0o0;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public final V OooOO0o(int i) {
        return (V) this.f38569OooO0o0[(i << 1) + 1];
    }

    public void clear() {
        int i = this.f38568OooO0o;
        if (i > 0) {
            int[] iArr = this.f38567OooO0Oo;
            Object[] objArr = this.f38569OooO0o0;
            this.f38567OooO0Oo = OooOOO0.f38555OooO00o;
            this.f38569OooO0o0 = OooOOO0.f38557OooO0OO;
            this.f38568OooO0o = 0;
            OooO0OO(iArr, objArr, i);
        }
        if (this.f38568OooO0o > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(@Nullable Object obj) {
        return OooO0o0(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return OooO0oO(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof OooOo) {
                OooOo oooOo = (OooOo) obj;
                if (this.f38568OooO0o != oooOo.f38568OooO0o) {
                    return false;
                }
                for (int i = 0; i < this.f38568OooO0o; i++) {
                    K kOooO0oo = OooO0oo(i);
                    V vOooOO0o = OooOO0o(i);
                    Object orDefault = oooOo.getOrDefault(kOooO0oo, null);
                    if (vOooOO0o == null) {
                        if (orDefault != null || !oooOo.containsKey(kOooO0oo)) {
                            return false;
                        }
                    } else if (!vOooOO0o.equals(orDefault)) {
                        return false;
                    }
                }
                return true;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f38568OooO0o != map.size()) {
                    return false;
                }
                for (int i2 = 0; i2 < this.f38568OooO0o; i2++) {
                    K kOooO0oo2 = OooO0oo(i2);
                    V vOooOO0o2 = OooOO0o(i2);
                    Object obj2 = map.get(kOooO0oo2);
                    if (vOooOO0o2 == null) {
                        if (obj2 != null || !map.containsKey(kOooO0oo2)) {
                            return false;
                        }
                    } else if (!vOooOO0o2.equals(obj2)) {
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
        return iOooO0o0 >= 0 ? (V) this.f38569OooO0o0[(iOooO0o0 << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.f38567OooO0Oo;
        Object[] objArr = this.f38569OooO0o0;
        int i = this.f38568OooO0o;
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
        return this.f38568OooO0o <= 0;
    }

    @Nullable
    public V put(K k, V v) {
        int i;
        int iOooO0Oo;
        int i2 = this.f38568OooO0o;
        if (k == null) {
            iOooO0Oo = OooO0o();
            i = 0;
        } else {
            int iHashCode = k.hashCode();
            i = iHashCode;
            iOooO0Oo = OooO0Oo(k, iHashCode);
        }
        if (iOooO0Oo >= 0) {
            int i3 = (iOooO0Oo << 1) + 1;
            Object[] objArr = this.f38569OooO0o0;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~iOooO0Oo;
        int[] iArr = this.f38567OooO0Oo;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.f38569OooO0o0;
            OooO00o(i5);
            if (i2 != this.f38568OooO0o) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f38567OooO0Oo;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f38569OooO0o0, 0, objArr2.length);
            }
            OooO0OO(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f38567OooO0Oo;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f38569OooO0o0;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f38568OooO0o - i4) << 1);
        }
        int i7 = this.f38568OooO0o;
        if (i2 == i7) {
            int[] iArr4 = this.f38567OooO0Oo;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f38569OooO0o0;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f38568OooO0o = i7 + 1;
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
            return OooOO0(iOooO0o0);
        }
        return null;
    }

    @Nullable
    public final V replace(K k, V v) {
        int iOooO0o0 = OooO0o0(k);
        if (iOooO0o0 >= 0) {
            return OooOO0O(iOooO0o0, v);
        }
        return null;
    }

    public final int size() {
        return this.f38568OooO0o;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f38568OooO0o * 28);
        sb.append('{');
        for (int i = 0; i < this.f38568OooO0o; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K kOooO0oo = OooO0oo(i);
            if (kOooO0oo != this) {
                sb.append(kOooO0oo);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vOooOO0o = OooOO0o(i);
            if (vOooOO0o != this) {
                sb.append(vOooOO0o);
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
        V vOooOO0o = OooOO0o(iOooO0o0);
        if (obj2 != vOooOO0o && (obj2 == null || !obj2.equals(vOooOO0o))) {
            return false;
        }
        OooOO0(iOooO0o0);
        return true;
    }

    public final boolean replace(K k, V v, V v2) {
        int iOooO0o0 = OooO0o0(k);
        if (iOooO0o0 < 0) {
            return false;
        }
        V vOooOO0o = OooOO0o(iOooO0o0);
        if (vOooOO0o != v && (v == null || !v.equals(vOooOO0o))) {
            return false;
        }
        OooOO0O(iOooO0o0, v2);
        return true;
    }

    public OooOo(int i) {
        if (i == 0) {
            this.f38567OooO0Oo = OooOOO0.f38555OooO00o;
            this.f38569OooO0o0 = OooOOO0.f38557OooO0OO;
        } else {
            OooO00o(i);
        }
        this.f38568OooO0o = 0;
    }
}
