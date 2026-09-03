package p021OooOooo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0<E> implements Collection<E>, Set<E> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public static Object[] f424Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public static Object[] f426OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static int f427OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static int f428OoooO0O;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int[] f430Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Object[] f431Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f432Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public static final Object f425OoooO = new Object();

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public static final Object f429OoooOO0 = new Object();

    public class OooO00o extends o00Oo0<E> {
        public OooO00o() {
            super(o0OoOo0.this.f432Oooo0oo);
        }

        @Override // p021OooOooo.o00Oo0
        public final E OooO00o(int i) {
            return (E) o0OoOo0.this.f431Oooo0oO[i];
        }

        @Override // p021OooOooo.o00Oo0
        public final void OooO0O0(int i) {
            o0OoOo0.this.OooO0oO(i);
        }
    }

    public o0OoOo0(int i) {
        if (i == 0) {
            this.f430Oooo0o = o00O0O.f404OooO00o;
            this.f431Oooo0oO = o00O0O.f406OooO0OO;
        } else {
            OooO00o(i);
        }
        this.f432Oooo0oo = 0;
    }

    public static void OooO0O0(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (f429OoooOO0) {
                if (f428OoooO0O < 10) {
                    objArr[0] = f426OoooO0;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f426OoooO0 = objArr;
                    f428OoooO0O++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (f425OoooO) {
                if (f427OoooO00 < 10) {
                    objArr[0] = f424Oooo;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f424Oooo = objArr;
                    f427OoooO00++;
                }
            }
        }
    }

    public final void OooO00o(int i) {
        if (i == 8) {
            synchronized (f429OoooOO0) {
                Object[] objArr = f426OoooO0;
                if (objArr != null) {
                    try {
                        this.f431Oooo0oO = objArr;
                        f426OoooO0 = (Object[]) objArr[0];
                        int[] iArr = (int[]) objArr[1];
                        this.f430Oooo0o = iArr;
                        if (iArr != null) {
                            objArr[1] = null;
                            objArr[0] = null;
                            f428OoooO0O--;
                            return;
                        }
                    } catch (ClassCastException unused) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                    f426OoooO0 = null;
                    f428OoooO0O = 0;
                }
            }
        } else if (i == 4) {
            synchronized (f425OoooO) {
                Object[] objArr2 = f424Oooo;
                if (objArr2 != null) {
                    try {
                        this.f431Oooo0oO = objArr2;
                        f424Oooo = (Object[]) objArr2[0];
                        int[] iArr2 = (int[]) objArr2[1];
                        this.f430Oooo0o = iArr2;
                        if (iArr2 != null) {
                            objArr2[1] = null;
                            objArr2[0] = null;
                            f427OoooO00--;
                            return;
                        }
                    } catch (ClassCastException unused2) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                    f424Oooo = null;
                    f427OoooO00 = 0;
                }
            }
        }
        this.f430Oooo0o = new int[i];
        this.f431Oooo0oO = new Object[i];
    }

    public final int OooO0OO(Object obj, int i) {
        int i2 = this.f432Oooo0oo;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iOooO0O0 = o00O0O.OooO0O0(this.f430Oooo0o, i2, i);
            if (iOooO0O0 < 0 || obj.equals(this.f431Oooo0oO[iOooO0O0])) {
                return iOooO0O0;
            }
            int i3 = iOooO0O0 + 1;
            while (i3 < i2 && this.f430Oooo0o[i3] == i) {
                if (obj.equals(this.f431Oooo0oO[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iOooO0O0 - 1; i4 >= 0 && this.f430Oooo0o[i4] == i; i4--) {
                if (obj.equals(this.f431Oooo0oO[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int OooO0o0() {
        int i = this.f432Oooo0oo;
        if (i == 0) {
            return -1;
        }
        try {
            int iOooO0O0 = o00O0O.OooO0O0(this.f430Oooo0o, i, 0);
            if (iOooO0O0 < 0 || this.f431Oooo0oO[iOooO0O0] == null) {
                return iOooO0O0;
            }
            int i2 = iOooO0O0 + 1;
            while (i2 < i && this.f430Oooo0o[i2] == 0) {
                if (this.f431Oooo0oO[i2] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iOooO0O0 - 1; i3 >= 0 && this.f430Oooo0o[i3] == 0; i3--) {
                if (this.f431Oooo0oO[i3] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final E OooO0oO(int i) {
        int i2 = this.f432Oooo0oo;
        Object[] objArr = this.f431Oooo0oO;
        E e = (E) objArr[i];
        if (i2 <= 1) {
            clear();
        } else {
            int i3 = i2 - 1;
            int[] iArr = this.f430Oooo0o;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                if (i < i3) {
                    int i4 = i + 1;
                    int i5 = i3 - i;
                    System.arraycopy(iArr, i4, iArr, i, i5);
                    Object[] objArr2 = this.f431Oooo0oO;
                    System.arraycopy(objArr2, i4, objArr2, i, i5);
                }
                this.f431Oooo0oO[i3] = null;
            } else {
                OooO00o(i2 > 8 ? i2 + (i2 >> 1) : 8);
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f430Oooo0o, 0, i);
                    System.arraycopy(objArr, 0, this.f431Oooo0oO, 0, i);
                }
                if (i < i3) {
                    int i6 = i + 1;
                    int i7 = i3 - i;
                    System.arraycopy(iArr, i6, this.f430Oooo0o, i, i7);
                    System.arraycopy(objArr, i6, this.f431Oooo0oO, i, i7);
                }
            }
            if (i2 != this.f432Oooo0oo) {
                throw new ConcurrentModificationException();
            }
            this.f432Oooo0oo = i3;
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(@Nullable E e) {
        int i;
        int iOooO0OO;
        int i2 = this.f432Oooo0oo;
        if (e == null) {
            iOooO0OO = OooO0o0();
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
        int[] iArr = this.f430Oooo0o;
        if (i2 >= iArr.length) {
            int i4 = 4;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i4 = 8;
            }
            Object[] objArr = this.f431Oooo0oO;
            OooO00o(i4);
            if (i2 != this.f432Oooo0oo) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f430Oooo0o;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f431Oooo0oO, 0, objArr.length);
            }
            OooO0O0(iArr, objArr, i2);
        }
        if (i3 < i2) {
            int[] iArr3 = this.f430Oooo0o;
            int i5 = i3 + 1;
            int i6 = i2 - i3;
            System.arraycopy(iArr3, i3, iArr3, i5, i6);
            Object[] objArr2 = this.f431Oooo0oO;
            System.arraycopy(objArr2, i3, objArr2, i5, i6);
        }
        int i7 = this.f432Oooo0oo;
        if (i2 == i7) {
            int[] iArr4 = this.f430Oooo0o;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f431Oooo0oO[i3] = e;
                this.f432Oooo0oo = i7 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(@NonNull Collection<? extends E> collection) {
        int size = collection.size() + this.f432Oooo0oo;
        int i = this.f432Oooo0oo;
        int[] iArr = this.f430Oooo0o;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f431Oooo0oO;
            OooO00o(size);
            int i2 = this.f432Oooo0oo;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f430Oooo0o, 0, i2);
                System.arraycopy(objArr, 0, this.f431Oooo0oO, 0, this.f432Oooo0oo);
            }
            OooO0O0(iArr, objArr, this.f432Oooo0oo);
        }
        if (this.f432Oooo0oo != i) {
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
        int i = this.f432Oooo0oo;
        if (i != 0) {
            int[] iArr = this.f430Oooo0o;
            Object[] objArr = this.f431Oooo0oO;
            this.f430Oooo0o = o00O0O.f404OooO00o;
            this.f431Oooo0oO = o00O0O.f406OooO0OO;
            this.f432Oooo0oo = 0;
            OooO0O0(iArr, objArr, i);
        }
        if (this.f432Oooo0oo != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(@Nullable Object obj) {
        return (obj == null ? OooO0o0() : OooO0OO(obj, obj.hashCode())) >= 0;
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
            if (this.f432Oooo0oo != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f432Oooo0oo; i++) {
                try {
                    if (!set.contains(this.f431Oooo0oO[i])) {
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
        int[] iArr = this.f430Oooo0o;
        int i = this.f432Oooo0oo;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f432Oooo0oo <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    @NonNull
    public final Iterator<E> iterator() {
        return new OooO00o();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(@Nullable Object obj) {
        int iOooO0o0 = obj == null ? OooO0o0() : OooO0OO(obj, obj.hashCode());
        if (iOooO0o0 < 0) {
            return false;
        }
        OooO0oO(iOooO0o0);
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
        for (int i = this.f432Oooo0oo - 1; i >= 0; i--) {
            if (!collection.contains(this.f431Oooo0oO[i])) {
                OooO0oO(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f432Oooo0oo;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public final Object[] toArray() {
        int i = this.f432Oooo0oo;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f431Oooo0oO, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f432Oooo0oo * 14);
        sb.append('{');
        for (int i = 0; i < this.f432Oooo0oo; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f431Oooo0oO[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public final <T> T[] toArray(@NonNull T[] tArr) {
        if (tArr.length < this.f432Oooo0oo) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f432Oooo0oo));
        }
        System.arraycopy(this.f431Oooo0oO, 0, tArr, 0, this.f432Oooo0oo);
        int length = tArr.length;
        int i = this.f432Oooo0oo;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
