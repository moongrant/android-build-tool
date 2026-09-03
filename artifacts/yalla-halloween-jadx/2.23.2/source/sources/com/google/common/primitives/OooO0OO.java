package com.google.common.primitives;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.o0O0O00;
import com.google.common.base.o0OoOo0;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class OooO0OO extends OooO0o {

    @GwtCompatible
    public static class OooO00o extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int[] f19272OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f19273OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f19274OooO0o0;

        public OooO00o(int i, int i2, int[] iArr) {
            this.f19272OooO0Oo = iArr;
            this.f19274OooO0o0 = i;
            this.f19273OooO0o = i2;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN, SYNTHETIC] */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(@CheckForNull Object obj) {
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                int i = this.f19274OooO0o0;
                while (i < this.f19273OooO0o) {
                    if (this.f19272OooO0Oo[i] != iIntValue) {
                        i++;
                    } else if (i != -1) {
                        return true;
                    }
                }
                i = -1;
                if (i != -1) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return super.equals(obj);
            }
            OooO00o oooO00o = (OooO00o) obj;
            int i = this.f19273OooO0o;
            int i2 = this.f19274OooO0o0;
            int i3 = i - i2;
            if (oooO00o.f19273OooO0o - oooO00o.f19274OooO0o0 != i3) {
                return false;
            }
            for (int i4 = 0; i4 < i3; i4++) {
                if (this.f19272OooO0Oo[i2 + i4] != oooO00o.f19272OooO0Oo[oooO00o.f19274OooO0o0 + i4]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            int i2 = this.f19273OooO0o;
            int i3 = this.f19274OooO0o0;
            o0OoOo0.OooO0oo(i, i2 - i3);
            return Integer.valueOf(this.f19272OooO0Oo[i3 + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int i = 1;
            for (int i2 = this.f19274OooO0o0; i2 < this.f19273OooO0o; i2++) {
                i = (i * 31) + this.f19272OooO0Oo[i2];
            }
            return i;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001f  */
        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(@CheckForNull Object obj) {
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                int i = this.f19274OooO0o0;
                int i2 = i;
                while (i2 < this.f19273OooO0o) {
                    if (this.f19272OooO0Oo[i2] != iIntValue) {
                        i2++;
                    } else if (i2 >= 0) {
                        return i2 - i;
                    }
                }
                i2 = -1;
                if (i2 >= 0) {
                    return i2 - i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(@CheckForNull Object obj) {
            int i;
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                int i2 = this.f19273OooO0o - 1;
                while (true) {
                    i = this.f19274OooO0o0;
                    if (i2 < i) {
                        i2 = -1;
                        break;
                    }
                    if (this.f19272OooO0Oo[i2] == iIntValue) {
                        break;
                    }
                    i2--;
                }
                if (i2 >= 0) {
                    return i2 - i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i, Object obj) {
            Integer num = (Integer) obj;
            int i2 = this.f19273OooO0o;
            int i3 = this.f19274OooO0o0;
            o0OoOo0.OooO0oo(i, i2 - i3);
            int i4 = i3 + i;
            int[] iArr = this.f19272OooO0Oo;
            int i5 = iArr[i4];
            num.getClass();
            iArr[i4] = num.intValue();
            return Integer.valueOf(i5);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f19273OooO0o - this.f19274OooO0o0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Integer> subList(int i, int i2) {
            int i3 = this.f19273OooO0o;
            int i4 = this.f19274OooO0o0;
            o0OoOo0.OooOO0O(i, i2, i3 - i4);
            return i == i2 ? Collections.emptyList() : new OooO00o(i + i4, i4 + i2, this.f19272OooO0Oo);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            int i = this.f19273OooO0o;
            int i2 = this.f19274OooO0o0;
            StringBuilder sb = new StringBuilder((i - i2) * 5);
            sb.append('[');
            int[] iArr = this.f19272OooO0Oo;
            sb.append(iArr[i2]);
            while (true) {
                i2++;
                if (i2 >= i) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(iArr[i2]);
            }
        }
    }

    public static int OooO00o(long j) {
        int i = (int) j;
        o0OoOo0.OooO0O0(j, "Out of range: %s", ((long) i) == j);
        return i;
    }

    @Beta
    public static int OooO0O0(int i, int i2) {
        if (i2 <= 1073741823) {
            return Math.min(Math.max(i, i2), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
        }
        throw new IllegalArgumentException(o0O0O00.OooO00o("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i2), Integer.valueOf(LockFreeTaskQueueCore.MAX_CAPACITY_MASK)));
    }

    public static int OooO0OO(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int[] OooO0Oo(AbstractCollection abstractCollection) {
        if (abstractCollection instanceof OooO00o) {
            OooO00o oooO00o = (OooO00o) abstractCollection;
            return Arrays.copyOfRange(oooO00o.f19272OooO0Oo, oooO00o.f19274OooO0o0, oooO00o.f19273OooO0o);
        }
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
