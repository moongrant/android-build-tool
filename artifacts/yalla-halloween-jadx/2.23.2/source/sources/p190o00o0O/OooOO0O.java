package p190o00o0O;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O<E> implements Collection<E>, Set<E> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public static Object[] f38542OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public static Object[] f38543OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static int f38544OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static int f38545OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Object f38546OooOO0O = new Object();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final Object f38547OooOO0o = new Object();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int[] f38548OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f38549OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object[] f38550OooO0o0;

    public class OooO00o extends OooOOO<E> {
        public OooO00o() {
            super(OooOO0O.this.f38549OooO0o);
        }

        @Override // p190o00o0O.OooOOO
        public final E OooO00o(int i) {
            return (E) OooOO0O.this.f38550OooO0o0[i];
        }

        @Override // p190o00o0O.OooOOO
        public final void OooO0O0(int i) {
            OooOO0O.this.OooO0o0(i);
        }
    }

    public OooOO0O() {
        this(0);
    }

    public static void OooO0O0(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (f38547OooOO0o) {
                if (f38545OooOO0 < 10) {
                    objArr[0] = f38542OooO;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f38542OooO = objArr;
                    f38545OooOO0++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (f38546OooOO0O) {
                if (f38544OooO0oo < 10) {
                    objArr[0] = f38543OooO0oO;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f38543OooO0oO = objArr;
                    f38544OooO0oo++;
                }
            }
        }
    }

    public final void OooO00o(int i) {
        if (i == 8) {
            synchronized (f38547OooOO0o) {
                Object[] objArr = f38542OooO;
                if (objArr != null) {
                    try {
                        this.f38550OooO0o0 = objArr;
                        f38542OooO = (Object[]) objArr[0];
                        int[] iArr = (int[]) objArr[1];
                        this.f38548OooO0Oo = iArr;
                        if (iArr != null) {
                            objArr[1] = null;
                            objArr[0] = null;
                            f38545OooOO0--;
                            return;
                        }
                    } catch (ClassCastException unused) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                    f38542OooO = null;
                    f38545OooOO0 = 0;
                }
            }
        } else if (i == 4) {
            synchronized (f38546OooOO0O) {
                Object[] objArr2 = f38543OooO0oO;
                if (objArr2 != null) {
                    try {
                        this.f38550OooO0o0 = objArr2;
                        f38543OooO0oO = (Object[]) objArr2[0];
                        int[] iArr2 = (int[]) objArr2[1];
                        this.f38548OooO0Oo = iArr2;
                        if (iArr2 != null) {
                            objArr2[1] = null;
                            objArr2[0] = null;
                            f38544OooO0oo--;
                            return;
                        }
                    } catch (ClassCastException unused2) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                    f38543OooO0oO = null;
                    f38544OooO0oo = 0;
                }
            }
        }
        this.f38548OooO0Oo = new int[i];
        this.f38550OooO0o0 = new Object[i];
    }

    public final int OooO0OO(Object obj, int i) {
        int i2 = this.f38549OooO0o;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iOooO00o = OooOOO0.OooO00o(i2, i, this.f38548OooO0Oo);
            if (iOooO00o < 0 || obj.equals(this.f38550OooO0o0[iOooO00o])) {
                return iOooO00o;
            }
            int i3 = iOooO00o + 1;
            while (i3 < i2 && this.f38548OooO0Oo[i3] == i) {
                if (obj.equals(this.f38550OooO0o0[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iOooO00o - 1; i4 >= 0 && this.f38548OooO0Oo[i4] == i; i4--) {
                if (obj.equals(this.f38550OooO0o0[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int OooO0Oo() {
        int i = this.f38549OooO0o;
        if (i == 0) {
            return -1;
        }
        try {
            int iOooO00o = OooOOO0.OooO00o(i, 0, this.f38548OooO0Oo);
            if (iOooO00o < 0 || this.f38550OooO0o0[iOooO00o] == null) {
                return iOooO00o;
            }
            int i2 = iOooO00o + 1;
            while (i2 < i && this.f38548OooO0Oo[i2] == 0) {
                if (this.f38550OooO0o0[i2] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iOooO00o - 1; i3 >= 0 && this.f38548OooO0Oo[i3] == 0; i3--) {
                if (this.f38550OooO0o0[i3] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void OooO0o0(int i) {
        int i2 = this.f38549OooO0o;
        Object[] objArr = this.f38550OooO0o0;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f38548OooO0Oo;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                int i5 = i3 - i;
                System.arraycopy(iArr, i4, iArr, i, i5);
                Object[] objArr2 = this.f38550OooO0o0;
                System.arraycopy(objArr2, i4, objArr2, i, i5);
            }
            this.f38550OooO0o0[i3] = null;
        } else {
            OooO00o(i2 > 8 ? i2 + (i2 >> 1) : 8);
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f38548OooO0Oo, 0, i);
                System.arraycopy(objArr, 0, this.f38550OooO0o0, 0, i);
            }
            if (i < i3) {
                int i6 = i + 1;
                int i7 = i3 - i;
                System.arraycopy(iArr, i6, this.f38548OooO0Oo, i, i7);
                System.arraycopy(objArr, i6, this.f38550OooO0o0, i, i7);
            }
        }
        if (i2 != this.f38549OooO0o) {
            throw new ConcurrentModificationException();
        }
        this.f38549OooO0o = i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(@Nullable E e) {
        int i;
        int iOooO0OO;
        int i2 = this.f38549OooO0o;
        if (e == null) {
            iOooO0OO = OooO0Oo();
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iOooO0OO = OooO0OO(e, iHashCode);
        }
        if (iOooO0OO >= 0) {
            return false;
        }
        int i3 = ~iOooO0OO;
        int[] iArr = this.f38548OooO0Oo;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f38550OooO0o0;
            OooO00o(i4);
            if (i2 != this.f38549OooO0o) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f38548OooO0Oo;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f38550OooO0o0, 0, objArr.length);
            }
            OooO0O0(iArr, objArr, i2);
        }
        if (i3 < i2) {
            int[] iArr3 = this.f38548OooO0Oo;
            int i5 = i3 + 1;
            int i6 = i2 - i3;
            System.arraycopy(iArr3, i3, iArr3, i5, i6);
            Object[] objArr2 = this.f38550OooO0o0;
            System.arraycopy(objArr2, i3, objArr2, i5, i6);
        }
        int i7 = this.f38549OooO0o;
        if (i2 == i7) {
            int[] iArr4 = this.f38548OooO0Oo;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f38550OooO0o0[i3] = e;
                this.f38549OooO0o = i7 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(@NonNull Collection<? extends E> collection) {
        int size = collection.size() + this.f38549OooO0o;
        int i = this.f38549OooO0o;
        int[] iArr = this.f38548OooO0Oo;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f38550OooO0o0;
            OooO00o(size);
            int i2 = this.f38549OooO0o;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f38548OooO0Oo, 0, i2);
                System.arraycopy(objArr, 0, this.f38550OooO0o0, 0, this.f38549OooO0o);
            }
            OooO0O0(iArr, objArr, this.f38549OooO0o);
        }
        if (this.f38549OooO0o != i) {
            throw new ConcurrentModificationException();
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f38549OooO0o;
        if (i != 0) {
            int[] iArr = this.f38548OooO0Oo;
            Object[] objArr = this.f38550OooO0o0;
            this.f38548OooO0Oo = OooOOO0.f38555OooO00o;
            this.f38550OooO0o0 = OooOOO0.f38557OooO0OO;
            this.f38549OooO0o = 0;
            OooO0O0(iArr, objArr, i);
        }
        if (this.f38549OooO0o != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(@Nullable Object obj) {
        return (obj == null ? OooO0Oo() : OooO0OO(obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f38549OooO0o != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f38549OooO0o; i++) {
                try {
                    if (!set.contains(this.f38550OooO0o0[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f38548OooO0Oo;
        int i = this.f38549OooO0o;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f38549OooO0o <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    @NonNull
    public final Iterator<E> iterator() {
        return new OooO00o();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(@Nullable Object obj) {
        int iOooO0Oo = obj == null ? OooO0Oo() : OooO0OO(obj, obj.hashCode());
        if (iOooO0Oo < 0) {
            return false;
        }
        OooO0o0(iOooO0Oo);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(@NonNull Collection<?> collection) {
        boolean z = false;
        for (int i = this.f38549OooO0o - 1; i >= 0; i--) {
            if (!collection.contains(this.f38550OooO0o0[i])) {
                OooO0o0(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f38549OooO0o;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public final Object[] toArray() {
        int i = this.f38549OooO0o;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f38550OooO0o0, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f38549OooO0o * 14);
        sb.append('{');
        for (int i = 0; i < this.f38549OooO0o; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f38550OooO0o0[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public OooOO0O(int i) {
        if (i == 0) {
            this.f38548OooO0Oo = OooOOO0.f38555OooO00o;
            this.f38550OooO0o0 = OooOOO0.f38557OooO0OO;
        } else {
            OooO00o(i);
        }
        this.f38549OooO0o = 0;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public final <T> T[] toArray(@NonNull T[] tArr) {
        if (tArr.length < this.f38549OooO0o) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f38549OooO0o));
        }
        System.arraycopy(this.f38550OooO0o0, 0, tArr, 0, this.f38549OooO0o);
        int length = tArr.length;
        int i = this.f38549OooO0o;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
