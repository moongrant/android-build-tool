package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
public class oo0o0Oo<E> extends AbstractSet<E> implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public transient float f18689Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient int[] f18690Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient long[] f18691Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Object[] f18692Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public transient int f18693OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public transient int f18694OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public transient int f18695OoooO0O;

    public class OooO00o implements Iterator<E> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f18697Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f18698Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f18699Oooo0oo = -1;

        public OooO00o() {
            this.f18697Oooo0o = oo0o0Oo.this.f18694OoooO00;
            this.f18698Oooo0oO = oo0o0Oo.this.OooO0O0();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18698Oooo0oO >= 0;
        }

        @Override // java.util.Iterator
        public final E next() {
            if (oo0o0Oo.this.f18694OoooO00 != this.f18697Oooo0o) {
                throw new ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.f18698Oooo0oO;
            this.f18699Oooo0oo = i;
            oo0o0Oo oo0o0oo = oo0o0Oo.this;
            E e = (E) oo0o0oo.f18692Oooo0oo[i];
            this.f18698Oooo0oO = oo0o0oo.OooO0OO(i);
            return e;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (oo0o0Oo.this.f18694OoooO00 != this.f18697Oooo0o) {
                throw new ConcurrentModificationException();
            }
            oo000o.OooO0Oo(this.f18699Oooo0oo >= 0);
            this.f18697Oooo0o++;
            oo0o0Oo oo0o0oo = oo0o0Oo.this;
            Object[] objArr = oo0o0oo.f18692Oooo0oo;
            int i = this.f18699Oooo0oo;
            oo0o0oo.OooO(objArr[i], (int) (oo0o0oo.f18691Oooo0oO[i] >>> 32));
            this.f18698Oooo0oO = oo0o0Oo.this.OooO00o(this.f18698Oooo0oO, this.f18699Oooo0oo);
            this.f18699Oooo0oo = -1;
        }
    }

    public oo0o0Oo() {
        OooO0o0(3);
    }

    public static long OooOO0O(long j, int i) {
        return (j & (-4294967296L)) | (((long) i) & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        OooO0o0(3);
        int i = objectInputStream.readInt();
        while (true) {
            i--;
            if (i < 0) {
                return;
            } else {
                add(objectInputStream.readObject());
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f18695OoooO0O);
        OooO00o oooO00o = new OooO00o();
        while (oooO00o.hasNext()) {
            objectOutputStream.writeObject(oooO00o.next());
        }
    }

    @CanIgnoreReturnValue
    public final boolean OooO(Object obj, int i) {
        int[] iArr = this.f18690Oooo0o;
        int length = (iArr.length - 1) & i;
        int i2 = iArr[length];
        if (i2 == -1) {
            return false;
        }
        int i3 = -1;
        while (true) {
            if (((int) (this.f18691Oooo0oO[i2] >>> 32)) == i && o0OOOO0o.OooOOO.OooO00o(obj, this.f18692Oooo0oo[i2])) {
                if (i3 == -1) {
                    this.f18690Oooo0o[length] = (int) this.f18691Oooo0oO[i2];
                } else {
                    long[] jArr = this.f18691Oooo0oO;
                    jArr[i3] = OooOO0O(jArr[i3], (int) jArr[i2]);
                }
                OooO0oo(i2);
                this.f18695OoooO0O--;
                this.f18694OoooO00++;
                return true;
            }
            int i4 = (int) this.f18691Oooo0oO[i2];
            if (i4 == -1) {
                return false;
            }
            i3 = i2;
            i2 = i4;
        }
    }

    public int OooO00o(int i, int i2) {
        return i - 1;
    }

    public int OooO0O0() {
        return isEmpty() ? -1 : 0;
    }

    public int OooO0OO(int i) {
        int i2 = i + 1;
        if (i2 < this.f18695OoooO0O) {
            return i2;
        }
        return -1;
    }

    public void OooO0o0(int i) {
        o0OOOO0o.OooOOOO.OooO0Oo(i >= 0, "Initial capacity must be non-negative");
        int iOooO00o = o000O0Oo.OooO00o(i, 1.0f);
        int[] iArr = new int[iOooO00o];
        Arrays.fill(iArr, -1);
        this.f18690Oooo0o = iArr;
        this.f18689Oooo = 1.0f;
        this.f18692Oooo0oo = new Object[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.f18691Oooo0oO = jArr;
        this.f18693OoooO0 = Math.max(1, (int) (iOooO00o * 1.0f));
    }

    public void OooO0oO(int i, E e, int i2) {
        this.f18691Oooo0oO[i] = (((long) i2) << 32) | 4294967295L;
        this.f18692Oooo0oo[i] = e;
    }

    public void OooO0oo(int i) {
        int i2 = this.f18695OoooO0O - 1;
        if (i >= i2) {
            this.f18692Oooo0oo[i] = null;
            this.f18691Oooo0oO[i] = -1;
            return;
        }
        Object[] objArr = this.f18692Oooo0oo;
        objArr[i] = objArr[i2];
        objArr[i2] = null;
        long[] jArr = this.f18691Oooo0oO;
        long j = jArr[i2];
        jArr[i] = j;
        jArr[i2] = -1;
        int[] iArr = this.f18690Oooo0o;
        int length = ((int) (j >>> 32)) & (iArr.length - 1);
        int i3 = iArr[length];
        if (i3 == i2) {
            iArr[length] = i;
            return;
        }
        while (true) {
            long[] jArr2 = this.f18691Oooo0oO;
            long j2 = jArr2[i3];
            int i4 = (int) j2;
            if (i4 == i2) {
                jArr2[i3] = OooOO0O(j2, i);
                return;
            }
            i3 = i4;
        }
    }

    public void OooOO0(int i) {
        this.f18692Oooo0oo = Arrays.copyOf(this.f18692Oooo0oo, i);
        long[] jArr = this.f18691Oooo0oO;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.f18691Oooo0oO = jArrCopyOf;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public final boolean add(@NullableDecl E e) {
        long[] jArr = this.f18691Oooo0oO;
        Object[] objArr = this.f18692Oooo0oo;
        int iOooO0OO = o000O0Oo.OooO0OO(e);
        int[] iArr = this.f18690Oooo0o;
        int length = (iArr.length - 1) & iOooO0OO;
        int i = this.f18695OoooO0O;
        int i2 = iArr[length];
        if (i2 == -1) {
            iArr[length] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (((int) (j >>> 32)) == iOooO0OO && o0OOOO0o.OooOOO.OooO00o(e, objArr[i2])) {
                    return false;
                }
                int i3 = (int) j;
                if (i3 == -1) {
                    jArr[i2] = OooOO0O(j, i);
                    break;
                }
                i2 = i3;
            }
        }
        if (i == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i4 = i + 1;
        int length2 = this.f18691Oooo0oO.length;
        if (i4 > length2) {
            int iMax = Math.max(1, length2 >>> 1) + length2;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length2) {
                OooOO0(iMax);
            }
        }
        OooO0oO(i, e, iOooO0OO);
        this.f18695OoooO0O = i4;
        if (i >= this.f18693OoooO0) {
            int[] iArr2 = this.f18690Oooo0o;
            int length3 = iArr2.length * 2;
            if (iArr2.length >= 1073741824) {
                this.f18693OoooO0 = Integer.MAX_VALUE;
            } else {
                int i5 = ((int) (length3 * this.f18689Oooo)) + 1;
                int[] iArr3 = new int[length3];
                Arrays.fill(iArr3, -1);
                long[] jArr2 = this.f18691Oooo0oO;
                int i6 = length3 - 1;
                for (int i7 = 0; i7 < this.f18695OoooO0O; i7++) {
                    int i8 = (int) (jArr2[i7] >>> 32);
                    int i9 = i8 & i6;
                    int i10 = iArr3[i9];
                    iArr3[i9] = i7;
                    jArr2[i7] = (((long) i10) & 4294967295L) | (((long) i8) << 32);
                }
                this.f18693OoooO0 = i5;
                this.f18690Oooo0o = iArr3;
            }
        }
        this.f18694OoooO00++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f18694OoooO00++;
        Arrays.fill(this.f18692Oooo0oo, 0, this.f18695OoooO0O, (Object) null);
        Arrays.fill(this.f18690Oooo0o, -1);
        Arrays.fill(this.f18691Oooo0oO, -1L);
        this.f18695OoooO0O = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        int iOooO0OO = o000O0Oo.OooO0OO(obj);
        int[] iArr = this.f18690Oooo0o;
        int i = iArr[(iArr.length - 1) & iOooO0OO];
        while (i != -1) {
            long j = this.f18691Oooo0oO[i];
            if (((int) (j >>> 32)) == iOooO0OO && o0OOOO0o.OooOOO.OooO00o(obj, this.f18692Oooo0oo[i])) {
                return true;
            }
            i = (int) j;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f18695OoooO0O == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new OooO00o();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public final boolean remove(@NullableDecl Object obj) {
        return OooO(obj, o000O0Oo.OooO0OO(obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f18695OoooO0O;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return Arrays.copyOf(this.f18692Oooo0oo, this.f18695OoooO0O);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        Object[] objArr = this.f18692Oooo0oo;
        int i = this.f18695OoooO0O;
        o0OOOO0o.OooOOOO.OooOO0o(0, 0 + i, objArr.length);
        if (tArr.length < i) {
            tArr = (T[]) o00OOOO0.OooO0Oo(tArr, i);
        } else if (tArr.length > i) {
            tArr[i] = null;
        }
        System.arraycopy(objArr, 0, tArr, 0, i);
        return tArr;
    }

    public oo0o0Oo(int i) {
        OooO0o0(i);
    }
}
