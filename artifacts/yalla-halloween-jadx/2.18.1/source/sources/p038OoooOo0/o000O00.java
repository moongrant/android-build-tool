package p038OoooOo0;

import OooO00o.OooO00o;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import p037OoooOOo.o00000O0;
import p042Ooooo0o.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00<E> extends o000O000<E> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f3695Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Object[] f3696Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Object[] f3697Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f3698Oooo0oo;

    public o000O00(@NotNull Object[] root, @NotNull Object[] tail, int i, int i2) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(tail, "tail");
        this.f3696Oooo0o = root;
        this.f3697Oooo0oO = tail;
        this.f3698Oooo0oo = i;
        this.f3695Oooo = i2;
        if (!(size() > 32)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Trie-based persistent vector should have at least 33 elements, got ");
            sbOooO0o0.append(size());
            throw new IllegalArgumentException(sbOooO0o0.toString().toString());
        }
        size();
        size();
        RangesKt.coerceAtMost(tail.length, 32);
    }

    public final o00000O0<E> OooO(Object[] objArr, int i, int i2, int i3) {
        o000O00 o000o01;
        int size = size() - i;
        if (size != 1) {
            Object[] objArrCopyOf = Arrays.copyOf(this.f3697Oooo0oO, 32);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            int i4 = size - 1;
            if (i3 < i4) {
                ArraysKt.copyInto(this.f3697Oooo0oO, objArrCopyOf, i3, i3 + 1, size);
            }
            objArrCopyOf[i4] = null;
            return new o000O00(objArr, objArrCopyOf, (i + size) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
            }
            return new o000O0O0(objArr);
        }
        o000Oo0 o000oo1 = new o000Oo0(null);
        Object[] objArrOooO0OO = OooO0OO(objArr, i2, i - 1, o000oo1);
        Intrinsics.checkNotNull(objArrOooO0OO);
        Object obj = o000oo1.f3718OooO00o;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        if (objArrOooO0OO[1] == null) {
            Object obj2 = objArrOooO0OO[0];
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            o000o01 = new o000O00((Object[]) obj2, objArr2, i, i2 - 5);
        } else {
            o000o01 = new o000O00(objArrOooO0OO, objArr2, i, i2);
        }
        return o000o01;
    }

    public final Object[] OooO00o(Object[] objArr, int i, int i2, Object obj, o000Oo0 o000oo1) {
        Object[] objArr2;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            if (i3 == 0) {
                objArr2 = new Object[32];
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                objArr2 = objArrCopyOf;
            }
            ArraysKt.copyInto(objArr, objArr2, i3 + 1, i3, 31);
            o000oo1.f3718OooO00o = objArr[31];
            objArr2[i3] = obj;
            return objArr2;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(this, newSize)");
        int i4 = i - 5;
        Object obj2 = objArr[i3];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[i3] = OooO00o((Object[]) obj2, i4, i2, obj, o000oo1);
        while (true) {
            i3++;
            if (i3 >= 32 || objArrCopyOf2[i3] == null) {
                break;
            }
            Object obj3 = objArr[i3];
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[i3] = OooO00o((Object[]) obj3, i4, 0, o000oo1.f3718OooO00o, o000oo1);
        }
        return objArrCopyOf2;
    }

    public final o000O00<E> OooO0O0(Object[] objArr, int i, Object obj) {
        int size = size() - OooOO0();
        Object[] objArrCopyOf = Arrays.copyOf(this.f3697Oooo0oO, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        if (size < 32) {
            ArraysKt.copyInto(this.f3697Oooo0oO, objArrCopyOf, i + 1, i, size);
            objArrCopyOf[i] = obj;
            return new o000O00<>(objArr, objArrCopyOf, size() + 1, this.f3695Oooo);
        }
        Object[] objArr2 = this.f3697Oooo0oO;
        Object obj2 = objArr2[31];
        ArraysKt.copyInto(objArr2, objArrCopyOf, i + 1, i, size - 1);
        objArrCopyOf[i] = obj;
        return OooO0o0(objArr, objArrCopyOf, o000OO00.OooO00o(obj2));
    }

    public final Object[] OooO0OO(Object[] objArr, int i, int i2, o000Oo0 o000oo1) {
        Object[] objArrOooO0OO;
        int i3 = (i2 >> i) & 31;
        if (i == 5) {
            o000oo1.f3718OooO00o = objArr[i3];
            objArrOooO0OO = null;
        } else {
            Object obj = objArr[i3];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrOooO0OO = OooO0OO((Object[]) obj, i - 5, i2, o000oo1);
        }
        if (objArrOooO0OO == null && i3 == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[i3] = objArrOooO0OO;
        return objArrCopyOf;
    }

    @Override // p037OoooOOo.o00000O0
    public final o00000O0.OooO00o OooO0o() {
        return new o000O00O(this, this.f3696Oooo0o, this.f3697Oooo0oO, this.f3695Oooo);
    }

    public final o000O00<E> OooO0o0(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.f3695Oooo;
        if (size <= (1 << i)) {
            return new o000O00<>(OooO0oO(objArr, i, objArr2), objArr3, size() + 1, this.f3695Oooo);
        }
        Object[] objArrOooO00o = o000OO00.OooO00o(objArr);
        int i2 = this.f3695Oooo + 5;
        return new o000O00<>(OooO0oO(objArrOooO00o, i2, objArr2), objArr3, size() + 1, i2);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0018  */
    public final Object[] OooO0oO(Object[] objArr, int i, Object[] objArr2) {
        Object[] objArrCopyOf;
        int size = ((size() - 1) >> i) & 31;
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            if (objArrCopyOf == null) {
                objArrCopyOf = new Object[32];
            }
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i == 5) {
            objArrCopyOf[size] = objArr2;
        } else {
            objArrCopyOf[size] = OooO0oO((Object[]) objArrCopyOf[size], i - 5, objArr2);
        }
        return objArrCopyOf;
    }

    public final Object[] OooO0oo(Object[] objArr, int i, int i2, o000Oo0 o000oo1) {
        Object[] objArrCopyOf;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            if (i3 == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            }
            ArraysKt.copyInto(objArr, objArrCopyOf, i3, i3 + 1, 32);
            objArrCopyOf[31] = o000oo1.f3718OooO00o;
            o000oo1.f3718OooO00o = objArr[i3];
            return objArrCopyOf;
        }
        int iOooOO0 = objArr[31] == null ? 31 & ((OooOO0() - 1) >> i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(this, newSize)");
        int i4 = i - 5;
        int i5 = i3 + 1;
        if (i5 <= iOooOO0) {
            while (true) {
                Object obj = objArrCopyOf2[iOooOO0];
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iOooOO0] = OooO0oo((Object[]) obj, i4, 0, o000oo1);
                if (iOooOO0 == i5) {
                    break;
                }
                iOooOO0--;
            }
        }
        Object obj2 = objArrCopyOf2[i3];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[i3] = OooO0oo((Object[]) obj2, i4, i2, o000oo1);
        return objArrCopyOf2;
    }

    public final int OooOO0() {
        return (size() - 1) & (-32);
    }

    public final Object[] OooOO0O(Object[] objArr, int i, int i2, Object obj) {
        int i3 = (i2 >> i) & 31;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        if (i == 0) {
            objArrCopyOf[i3] = obj;
        } else {
            Object obj2 = objArrCopyOf[i3];
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf[i3] = OooOO0O((Object[]) obj2, i - 5, i2, obj);
        }
        return objArrCopyOf;
    }

    @Override // p037OoooOOo.o00000O0
    @NotNull
    public final o00000O0<E> OoooO0(int i) {
        o000OO0O.OooO00o(i, size());
        int iOooOO0 = OooOO0();
        return i >= iOooOO0 ? OooO(this.f3696Oooo0o, iOooOO0, this.f3695Oooo, i - iOooOO0) : OooO(OooO0oo(this.f3696Oooo0o, this.f3695Oooo, i, new o000Oo0(this.f3697Oooo0oO[0])), iOooOO0, this.f3695Oooo, 0);
    }

    @Override // p037OoooOOo.o00000O0
    @NotNull
    public final o00000O0<E> OoooOoO(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        o000O00O o000o00o2 = new o000O00O(this, this.f3696Oooo0o, this.f3697Oooo0oO, this.f3695Oooo);
        o000o00o2.OooOoo0(predicate);
        return o000o00o2.build();
    }

    @Override // java.util.Collection, java.util.List, p037OoooOOo.o00000O0
    @NotNull
    public final o00000O0<E> add(E e) {
        int size = size() - OooOO0();
        if (size >= 32) {
            return OooO0o0(this.f3696Oooo0o, this.f3697Oooo0oO, o000OO00.OooO00o(e));
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f3697Oooo0oO, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size] = e;
        return new o000O00(this.f3696Oooo0o, objArrCopyOf, size() + 1, this.f3695Oooo);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final E get(int i) {
        Object[] objArr;
        o000OO0O.OooO00o(i, size());
        if (OooOO0() <= i) {
            objArr = this.f3697Oooo0oO;
        } else {
            objArr = this.f3696Oooo0o;
            for (int i2 = this.f3695Oooo; i2 > 0; i2 -= 5) {
                Object obj = objArr[(i >> i2) & 31];
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i & 31];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.f3698Oooo0oo;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    public final ListIterator<E> listIterator(int i) {
        o000OO0O.OooO0O0(i, size());
        return new o000O0(this.f3696Oooo0o, this.f3697Oooo0oO, i, size(), (this.f3695Oooo / 5) + 1);
    }

    @Override // kotlin.collections.AbstractList, java.util.List, p037OoooOOo.o00000O0
    @NotNull
    public final o00000O0<E> set(int i, E e) {
        o000OO0O.OooO00o(i, size());
        if (OooOO0() > i) {
            return new o000O00(OooOO0O(this.f3696Oooo0o, this.f3695Oooo, i, e), this.f3697Oooo0oO, size(), this.f3695Oooo);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f3697Oooo0oO, 32);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[i & 31] = e;
        return new o000O00(this.f3696Oooo0o, objArrCopyOf, size(), this.f3695Oooo);
    }

    @Override // java.util.List, p037OoooOOo.o00000O0
    @NotNull
    public final o00000O0<E> add(int i, E e) {
        o000OO0O.OooO0O0(i, size());
        if (i == size()) {
            return add((Object) e);
        }
        int iOooOO0 = OooOO0();
        if (i >= iOooOO0) {
            return OooO0O0(this.f3696Oooo0o, i - iOooOO0, e);
        }
        o000Oo0 o000oo1 = new o000Oo0(null);
        return OooO0O0(OooO00o(this.f3696Oooo0o, this.f3695Oooo, i, e, o000oo1), 0, o000oo1.f3718OooO00o);
    }
}
