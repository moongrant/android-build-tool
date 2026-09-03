package o0OOOOO;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import o0OOOO0o.OooOOOO;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public final class OooO0OO {

    @GwtCompatible
    public static class OooO00o extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final int[] f38250Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final int f38251Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final int f38252Oooo0oo;

        public OooO00o(int[] iArr, int i, int i2) {
            this.f38250Oooo0o = iArr;
            this.f38251Oooo0oO = i;
            this.f38252Oooo0oo = i2;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001e A[RETURN, SYNTHETIC] */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f38250Oooo0o;
                int iIntValue = ((Integer) obj).intValue();
                int i = this.f38251Oooo0oO;
                int i2 = this.f38252Oooo0oo;
                while (i < i2) {
                    if (iArr[i] != iIntValue) {
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
        public final boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return super.equals(obj);
            }
            OooO00o oooO00o = (OooO00o) obj;
            int i = this.f38252Oooo0oo - this.f38251Oooo0oO;
            if (oooO00o.f38252Oooo0oo - oooO00o.f38251Oooo0oO != i) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f38250Oooo0o[this.f38251Oooo0oO + i2] != oooO00o.f38250Oooo0o[oooO00o.f38251Oooo0oO + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            OooOOOO.OooO(i, this.f38252Oooo0oo - this.f38251Oooo0oO);
            return Integer.valueOf(this.f38250Oooo0o[this.f38251Oooo0oO + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int i = 1;
            for (int i2 = this.f38251Oooo0oO; i2 < this.f38252Oooo0oo; i2++) {
                i = (i * 31) + this.f38250Oooo0o[i2];
            }
            return i;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x001e  */
        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f38250Oooo0o;
                int iIntValue = ((Integer) obj).intValue();
                int i = this.f38251Oooo0oO;
                int i2 = this.f38252Oooo0oo;
                while (i < i2) {
                    if (iArr[i] != iIntValue) {
                        i++;
                    } else if (i >= 0) {
                        return i - this.f38251Oooo0oO;
                    }
                }
                i = -1;
                if (i >= 0) {
                    return i - this.f38251Oooo0oO;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x001f  */
        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                int[] iArr = this.f38250Oooo0o;
                int iIntValue = ((Integer) obj).intValue();
                int i = this.f38251Oooo0oO;
                int i2 = this.f38252Oooo0oo - 1;
                while (i2 >= i) {
                    if (iArr[i2] != iIntValue) {
                        i2--;
                    } else if (i2 >= 0) {
                        return i2 - this.f38251Oooo0oO;
                    }
                }
                i2 = -1;
                if (i2 >= 0) {
                    return i2 - this.f38251Oooo0oO;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i, Object obj) {
            Integer num = (Integer) obj;
            OooOOOO.OooO(i, this.f38252Oooo0oo - this.f38251Oooo0oO);
            int[] iArr = this.f38250Oooo0o;
            int i2 = this.f38251Oooo0oO + i;
            int i3 = iArr[i2];
            Objects.requireNonNull(num);
            iArr[i2] = num.intValue();
            return Integer.valueOf(i3);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f38252Oooo0oo - this.f38251Oooo0oO;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Integer> subList(int i, int i2) {
            OooOOOO.OooOO0o(i, i2, this.f38252Oooo0oo - this.f38251Oooo0oO);
            if (i == i2) {
                return Collections.emptyList();
            }
            int[] iArr = this.f38250Oooo0o;
            int i3 = this.f38251Oooo0oO;
            return new OooO00o(iArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            StringBuilder sb = new StringBuilder((this.f38252Oooo0oo - this.f38251Oooo0oO) * 5);
            sb.append('[');
            sb.append(this.f38250Oooo0o[this.f38251Oooo0oO]);
            int i = this.f38251Oooo0oO;
            while (true) {
                i++;
                if (i >= this.f38252Oooo0oo) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append(this.f38250Oooo0o[i]);
            }
        }
    }

    public static int OooO00o(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static int[] OooO0O0(Collection<? extends Number> collection) {
        if (collection instanceof OooO00o) {
            OooO00o oooO00o = (OooO00o) collection;
            return Arrays.copyOfRange(oooO00o.f38250Oooo0o, oooO00o.f38251Oooo0oO, oooO00o.f38252Oooo0oo);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            Objects.requireNonNull(obj);
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
