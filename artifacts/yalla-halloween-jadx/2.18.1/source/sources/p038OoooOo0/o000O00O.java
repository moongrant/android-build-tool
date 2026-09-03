package p038OoooOo0;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p037OoooOOo.o00000O0;
import p042Ooooo0o.o000O0O0;
import p042Ooooo0o.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00O<E> extends AbstractMutableList<E> implements o00000O0.OooO00o<E> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f3700Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public o00000O0<? extends E> f3701Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public Object[] f3702Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public Object[] f3703Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f3704OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public Object[] f3705OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public o000O0O0 f3706OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public Object[] f3707OoooO0O;

    public static final class OooO00o extends Lambda implements Function1<E, Boolean> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Collection<E> f3708Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Collection<? extends E> collection) {
            super(1);
            this.f3708Oooo0o = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.f3708Oooo0o.contains(obj));
        }
    }

    public o000O00O(@NotNull o00000O0<? extends E> vector, @Nullable Object[] objArr, @NotNull Object[] vectorTail, int i) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        Intrinsics.checkNotNullParameter(vectorTail, "vectorTail");
        this.f3701Oooo0o = vector;
        this.f3702Oooo0oO = objArr;
        this.f3703Oooo0oo = vectorTail;
        this.f3700Oooo = i;
        this.f3706OoooO00 = new o000O0O0();
        this.f3705OoooO0 = objArr;
        this.f3707OoooO0O = vectorTail;
        this.f3704OoooO = vector.size();
    }

    public final ListIterator<Object[]> OooO(int i) {
        if (this.f3705OoooO0 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        int iOooOooo = OooOooo() >> 5;
        o000OO0O.OooO0O0(i, iOooOooo);
        int i2 = this.f3700Oooo;
        if (i2 == 0) {
            Object[] objArr = this.f3705OoooO0;
            Intrinsics.checkNotNull(objArr);
            return new o000OO0O(objArr, i);
        }
        Object[] objArr2 = this.f3705OoooO0;
        Intrinsics.checkNotNull(objArr2);
        return new o000O(objArr2, i, iOooOooo, i2 / 5);
    }

    public final Object[] OooO00o(Object[] objArr, int i, Iterator<? extends Object> it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    public final int OooO0O0() {
        return ((AbstractList) this).modCount;
    }

    public final void OooO0OO(Collection<? extends E> collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f3705OoooO0 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        int i4 = i >> 5;
        ListIterator<Object[]> listIteratorOooO = OooO(OooOooo() >> 5);
        int i5 = i3;
        Object[] objArrOooOO0O = objArr2;
        while (((o000) listIteratorOooO).f3688Oooo0o - 1 != i4) {
            Object[] objArrPrevious = listIteratorOooO.previous();
            ArraysKt.copyInto(objArrPrevious, objArrOooOO0O, 0, 32 - i2, 32);
            objArrOooOO0O = OooOO0O(objArrPrevious, i2);
            i5--;
            objArr[i5] = objArrOooOO0O;
        }
        Object[] objArrPrevious2 = listIteratorOooO.previous();
        int iOooOooo = i3 - (((OooOooo() >> 5) - 1) - i4);
        if (iOooOooo < i3) {
            objArr2 = objArr[iOooOooo];
            Intrinsics.checkNotNull(objArr2);
        }
        Oooo00O(collection, i, objArrPrevious2, 32, objArr, iOooOooo, objArr2);
    }

    public final Object[] OooO0o0(Object[] objArr, int i, int i2, Object obj, o000Oo0 o000oo1) {
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            o000oo1.f3718OooO00o = objArr[31];
            Object[] objArrCopyInto = ArraysKt.copyInto(objArr, OooOO0(objArr), i3 + 1, i3, 31);
            objArrCopyInto[i3] = obj;
            return objArrCopyInto;
        }
        Object[] objArrOooOO0 = OooOO0(objArr);
        int i4 = i - 5;
        Object obj2 = objArrOooOO0[i3];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrOooOO0[i3] = OooO0o0((Object[]) obj2, i4, i2, obj, o000oo1);
        while (true) {
            i3++;
            if (i3 >= 32 || objArrOooOO0[i3] == null) {
                break;
            }
            Object obj3 = objArrOooOO0[i3];
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrOooOO0[i3] = OooO0o0((Object[]) obj3, i4, 0, o000oo1.f3718OooO00o, o000oo1);
        }
        return objArrOooOO0;
    }

    public final void OooO0oO(Object[] objArr, int i, E e) {
        int iOooo00o = Oooo00o();
        Object[] objArrOooOO0 = OooOO0(this.f3707OoooO0O);
        if (iOooo00o < 32) {
            ArraysKt.copyInto(this.f3707OoooO0O, objArrOooOO0, i + 1, i, iOooo00o);
            objArrOooOO0[i] = e;
            this.f3705OoooO0 = objArr;
            this.f3707OoooO0O = objArrOooOO0;
            this.f3704OoooO = size() + 1;
            return;
        }
        Object[] objArr2 = this.f3707OoooO0O;
        Object obj = objArr2[31];
        ArraysKt.copyInto(objArr2, objArrOooOO0, i + 1, i, 31);
        objArrOooOO0[i] = e;
        OooOo0(objArr, objArrOooOO0, OooOOO0(obj));
    }

    public final boolean OooO0oo(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f3706OoooO00;
    }

    public final Object[] OooOO0(Object[] objArr) {
        if (objArr == null) {
            return OooOO0o();
        }
        return OooO0oo(objArr) ? objArr : ArraysKt.OooO0o0(objArr, OooOO0o(), 0, 0, RangesKt.coerceAtMost(objArr.length, 32), 6);
    }

    public final Object[] OooOO0O(Object[] objArr, int i) {
        return OooO0oo(objArr) ? ArraysKt.copyInto(objArr, objArr, i, 0, 32 - i) : ArraysKt.copyInto(objArr, OooOO0o(), i, 0, 32 - i);
    }

    public final Object[] OooOO0o() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f3706OoooO00;
        return objArr;
    }

    public final Object[] OooOOO0(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f3706OoooO00;
        return objArr;
    }

    public final Object[] OooOOOO(Object[] objArr, int i, int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i2 == 0) {
            return objArr;
        }
        int i3 = (i >> i2) & 31;
        Object obj = objArr[i3];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objOooOOOO = OooOOOO((Object[]) obj, i, i2 - 5);
        if (i3 < 31) {
            int i4 = i3 + 1;
            if (objArr[i4] != null) {
                if (OooO0oo(objArr)) {
                    ArraysKt.fill(objArr, (Object) null, i4, 32);
                }
                objArr = ArraysKt.copyInto(objArr, OooOO0o(), 0, 0, i4);
            }
        }
        if (objOooOOOO == objArr[i3]) {
            return objArr;
        }
        Object[] objArrOooOO0 = OooOO0(objArr);
        objArrOooOO0[i3] = objOooOOOO;
        return objArrOooOO0;
    }

    public final Object[] OooOOOo(Object[] objArr, int i, int i2, o000Oo0 o000oo1) {
        Object[] objArrOooOOOo;
        int i3 = ((i2 - 1) >> i) & 31;
        if (i == 5) {
            o000oo1.f3718OooO00o = objArr[i3];
            objArrOooOOOo = null;
        } else {
            Object obj = objArr[i3];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrOooOOOo = OooOOOo((Object[]) obj, i - 5, i2, o000oo1);
        }
        if (objArrOooOOOo == null && i3 == 0) {
            return null;
        }
        Object[] objArrOooOO0 = OooOO0(objArr);
        objArrOooOO0[i3] = objArrOooOOOo;
        return objArrOooOO0;
    }

    public final void OooOOo0(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f3705OoooO0 = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f3707OoooO0O = objArr;
            this.f3704OoooO = i;
            this.f3700Oooo = i2;
            return;
        }
        o000Oo0 o000oo1 = new o000Oo0(null);
        Intrinsics.checkNotNull(objArr);
        Object[] objArrOooOOOo = OooOOOo(objArr, i2, i, o000oo1);
        Intrinsics.checkNotNull(objArrOooOOOo);
        Object obj = o000oo1.f3718OooO00o;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f3707OoooO0O = (Object[]) obj;
        this.f3704OoooO = i;
        if (objArrOooOOOo[1] == null) {
            this.f3705OoooO0 = (Object[]) objArrOooOOOo[0];
            this.f3700Oooo = i2 - 5;
        } else {
            this.f3705OoooO0 = objArrOooOOOo;
            this.f3700Oooo = i2;
        }
    }

    public final Object[] OooOOoo(Object[] objArr, int i, int i2, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(i2 >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i2 == 0) {
            return it.next();
        }
        Object[] objArrOooOO0 = OooOO0(objArr);
        int i3 = (i >> i2) & 31;
        int i4 = i2 - 5;
        objArrOooOO0[i3] = OooOOoo((Object[]) objArrOooOO0[i3], i, i4, it);
        while (true) {
            i3++;
            if (i3 >= 32 || !it.hasNext()) {
                break;
            }
            objArrOooOO0[i3] = OooOOoo((Object[]) objArrOooOO0[i3], 0, i4, it);
        }
        return objArrOooOO0;
    }

    public final int OooOo(Function1<? super E, Boolean> function1, Object[] objArr, int i, o000Oo0 o000oo1) {
        Object[] objArrOooOO0 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (function1.invoke(obj).booleanValue()) {
                if (!z) {
                    objArrOooOO0 = OooOO0(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrOooOO0[i2] = obj;
                i2++;
            }
        }
        o000oo1.f3718OooO00o = objArrOooOO0;
        return i2;
    }

    public final void OooOo0(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = size() >> 5;
        int i = this.f3700Oooo;
        if (size > (1 << i)) {
            this.f3705OoooO0 = OooOo0O(OooOOO0(objArr), objArr2, this.f3700Oooo + 5);
            this.f3707OoooO0O = objArr3;
            this.f3700Oooo += 5;
            this.f3704OoooO = size() + 1;
            return;
        }
        if (objArr == null) {
            this.f3705OoooO0 = objArr2;
            this.f3707OoooO0O = objArr3;
            this.f3704OoooO = size() + 1;
        } else {
            this.f3705OoooO0 = OooOo0O(objArr, objArr2, i);
            this.f3707OoooO0O = objArr3;
            this.f3704OoooO = size() + 1;
        }
    }

    public final Object[] OooOo00(Object[] objArr, int i, Object[][] objArr2) {
        Iterator<Object[]> it = ArrayIteratorKt.iterator(objArr2);
        int i2 = i >> 5;
        int i3 = this.f3700Oooo;
        Object[] objArrOooOOoo = i2 < (1 << i3) ? OooOOoo(objArr, i, i3, it) : OooOO0(objArr);
        while (it.hasNext()) {
            this.f3700Oooo += 5;
            objArrOooOOoo = OooOOO0(objArrOooOOoo);
            int i4 = this.f3700Oooo;
            OooOOoo(objArrOooOOoo, 1 << i4, i4, it);
        }
        return objArrOooOOoo;
    }

    public final Object[] OooOo0O(Object[] objArr, Object[] objArr2, int i) {
        int size = ((size() - 1) >> i) & 31;
        Object[] objArrOooOO0 = OooOO0(objArr);
        if (i == 5) {
            objArrOooOO0[size] = objArr2;
        } else {
            objArrOooOO0[size] = OooOo0O((Object[]) objArrOooOO0[size], objArr2, i - 5);
        }
        return objArrOooOO0;
    }

    public final int OooOo0o(Function1<? super E, Boolean> function1, Object[] objArr, int i, int i2, o000Oo0 o000oo1, List<Object[]> list, List<Object[]> list2) {
        if (OooO0oo(objArr)) {
            list.add(objArr);
        }
        Object obj = o000oo1.f3718OooO00o;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrRemove = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!function1.invoke(obj2).booleanValue()) {
                if (i2 == 32) {
                    objArrRemove = list.isEmpty() ^ true ? list.remove(list.size() - 1) : OooOO0o();
                    i2 = 0;
                }
                objArrRemove[i2] = obj2;
                i2++;
            }
        }
        o000oo1.f3718OooO00o = objArrRemove;
        if (objArr2 != objArrRemove) {
            list2.add(objArr2);
        }
        return i2;
    }

    public final int OooOoO0(Function1<? super E, Boolean> function1, int i, o000Oo0 o000oo1) {
        int iOooOo = OooOo(function1, this.f3707OoooO0O, i, o000oo1);
        if (iOooOo == i) {
            return i;
        }
        Object obj = o000oo1.f3718OooO00o;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        ArraysKt.fill(objArr, (Object) null, iOooOo, i);
        this.f3707OoooO0O = objArr;
        this.f3704OoooO = size() - (i - iOooOo);
        return iOooOo;
    }

    public final Object[] OooOoo(Object[] objArr, int i, int i2, o000Oo0 o000oo1) {
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            Object obj = objArr[i3];
            Object[] objArrCopyInto = ArraysKt.copyInto(objArr, OooOO0(objArr), i3, i3 + 1, 32);
            objArrCopyInto[31] = o000oo1.f3718OooO00o;
            o000oo1.f3718OooO00o = obj;
            return objArrCopyInto;
        }
        int iOooOooo = objArr[31] == null ? 31 & ((OooOooo() - 1) >> i) : 31;
        Object[] objArrOooOO0 = OooOO0(objArr);
        int i4 = i - 5;
        int i5 = i3 + 1;
        if (i5 <= iOooOooo) {
            while (true) {
                Object obj2 = objArrOooOO0[iOooOooo];
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrOooOO0[iOooOooo] = OooOoo((Object[]) obj2, i4, 0, o000oo1);
                if (iOooOooo == i5) {
                    break;
                }
                iOooOooo--;
            }
        }
        Object obj3 = objArrOooOO0[i3];
        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrOooOO0[i3] = OooOoo((Object[]) obj3, i4, i2, o000oo1);
        return objArrOooOO0;
    }

    public final boolean OooOoo0(@NotNull Function1<? super E, Boolean> predicate) {
        Object[] objArrOooOOoo;
        int i;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int iOooo00o = Oooo00o();
        Object[] objArrOooOOOO = null;
        o000Oo0 o000oo1 = new o000Oo0(null);
        boolean z = false;
        if (this.f3705OoooO0 != null) {
            ListIterator<Object[]> listIteratorOooO = OooO(0);
            int iOooOo = 32;
            while (iOooOo == 32 && ((o000) listIteratorOooO).hasNext()) {
                iOooOo = OooOo(predicate, listIteratorOooO.next(), 32, o000oo1);
            }
            if (iOooOo == 32) {
                int iOooOoO0 = OooOoO0(predicate, iOooo00o, o000oo1);
                if (iOooOoO0 == 0) {
                    OooOOo0(this.f3705OoooO0, size(), this.f3700Oooo);
                }
                if (iOooOoO0 != iOooo00o) {
                }
            } else {
                o000 o000Var = (o000) listIteratorOooO;
                int i2 = (o000Var.f3688Oooo0o - 1) << 5;
                ArrayList arrayList = new ArrayList();
                List<Object[]> arrayList2 = new ArrayList<>();
                int iOooOo0o = iOooOo;
                while (o000Var.hasNext()) {
                    iOooOo0o = OooOo0o(predicate, listIteratorOooO.next(), 32, iOooOo0o, o000oo1, arrayList2, arrayList);
                    i2 = i2;
                    o000Var = o000Var;
                }
                int i3 = i2;
                int iOooOo0o2 = OooOo0o(predicate, this.f3707OoooO0O, iOooo00o, iOooOo0o, o000oo1, arrayList2, arrayList);
                Object obj = o000oo1.f3718OooO00o;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                ArraysKt.fill(objArr, (Object) null, iOooOo0o2, 32);
                if (arrayList.isEmpty()) {
                    objArrOooOOoo = this.f3705OoooO0;
                    Intrinsics.checkNotNull(objArrOooOOoo);
                } else {
                    objArrOooOOoo = OooOOoo(this.f3705OoooO0, i3, this.f3700Oooo, arrayList.iterator());
                }
                int size = i3 + (arrayList.size() << 5);
                if (!((size & 31) == 0)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (size == 0) {
                    this.f3700Oooo = 0;
                } else {
                    int i4 = size - 1;
                    while (true) {
                        i = this.f3700Oooo;
                        if ((i4 >> i) != 0) {
                            break;
                        }
                        this.f3700Oooo = i - 5;
                        Object[] objArr2 = objArrOooOOoo[0];
                        Objects.requireNonNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrOooOOoo = objArr2;
                    }
                    objArrOooOOOO = OooOOOO(objArrOooOOoo, i4, i);
                }
                this.f3705OoooO0 = objArrOooOOOO;
                this.f3707OoooO0O = objArr;
                this.f3704OoooO = size + iOooOo0o2;
            }
            z = true;
        } else if (OooOoO0(predicate, iOooo00o, o000oo1) != iOooo00o) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object OooOooO(Object[] objArr, int i, int i2, int i3) {
        int size = size() - i;
        if (size == 1) {
            Object obj = this.f3707OoooO0O[0];
            OooOOo0(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.f3707OoooO0O;
        Object obj2 = objArr2[i3];
        Object[] objArrCopyInto = ArraysKt.copyInto(objArr2, OooOO0(objArr2), i3, i3 + 1, size);
        objArrCopyInto[size - 1] = null;
        this.f3705OoooO0 = objArr;
        this.f3707OoooO0O = objArrCopyInto;
        this.f3704OoooO = (i + size) - 1;
        this.f3700Oooo = i2;
        return obj2;
    }

    public final int OooOooo() {
        if (size() <= 32) {
            return 0;
        }
        return (size() - 1) & (-32);
    }

    public final Object[] Oooo000(Object[] objArr, int i, int i2, E e, o000Oo0 o000oo1) {
        int i3 = (i2 >> i) & 31;
        Object[] objArrOooOO0 = OooOO0(objArr);
        if (i != 0) {
            Object obj = objArrOooOO0[i3];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrOooOO0[i3] = Oooo000((Object[]) obj, i - 5, i2, e, o000oo1);
            return objArrOooOO0;
        }
        if (objArrOooOO0 != objArr) {
            ((AbstractList) this).modCount++;
        }
        o000oo1.f3718OooO00o = objArrOooOO0[i3];
        objArrOooOO0[i3] = e;
        return objArrOooOO0;
    }

    public final void Oooo00O(Collection<? extends E> collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrOooOO0o;
        if (!(i3 >= 1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Object[] objArrOooOO0 = OooOO0(objArr);
        objArr2[0] = objArrOooOO0;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            ArraysKt.copyInto(objArrOooOO0, objArr3, size + 1, i4, i2);
        } else {
            int i6 = (i5 - 32) + 1;
            if (i3 == 1) {
                objArrOooOO0o = objArrOooOO0;
            } else {
                objArrOooOO0o = OooOO0o();
                i3--;
                objArr2[i3] = objArrOooOO0o;
            }
            int i7 = i2 - i6;
            ArraysKt.copyInto(objArrOooOO0, objArr3, 0, i7, i2);
            ArraysKt.copyInto(objArrOooOO0, objArrOooOO0o, size + 1, i4, i7);
            objArr3 = objArrOooOO0o;
        }
        Iterator<? extends E> it = collection.iterator();
        OooO00o(objArrOooOO0, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrOooOO0o2 = OooOO0o();
            OooO00o(objArrOooOO0o2, 0, it);
            objArr2[i8] = objArrOooOO0o2;
        }
        OooO00o(objArr3, 0, it);
    }

    public final int Oooo00o() {
        int size = size();
        return size <= 32 ? size : size - ((size - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        ((AbstractList) this).modCount++;
        int iOooo00o = Oooo00o();
        if (iOooo00o < 32) {
            Object[] objArrOooOO0 = OooOO0(this.f3707OoooO0O);
            objArrOooOO0[iOooo00o] = e;
            this.f3707OoooO0O = objArrOooOO0;
            this.f3704OoooO = size() + 1;
        } else {
            OooOo0(this.f3705OoooO0, this.f3707OoooO0O, OooOOO0(e));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iOooo00o = Oooo00o();
        Iterator<? extends E> it = elements.iterator();
        if (32 - iOooo00o >= elements.size()) {
            Object[] objArrOooOO0 = OooOO0(this.f3707OoooO0O);
            OooO00o(objArrOooOO0, iOooo00o, it);
            this.f3707OoooO0O = objArrOooOO0;
            this.f3704OoooO = elements.size() + size();
        } else {
            int size = ((elements.size() + iOooo00o) - 1) / 32;
            Object[][] objArr = new Object[size][];
            Object[] objArrOooOO1 = OooOO0(this.f3707OoooO0O);
            OooO00o(objArrOooOO1, iOooo00o, it);
            objArr[0] = objArrOooOO1;
            for (int i = 1; i < size; i++) {
                Object[] objArrOooOO0o = OooOO0o();
                OooO00o(objArrOooOO0o, 0, it);
                objArr[i] = objArrOooOO0o;
            }
            this.f3705OoooO0 = OooOo00(this.f3705OoooO0, OooOooo(), objArr);
            Object[] objArrOooOO0o2 = OooOO0o();
            OooO00o(objArrOooOO0o2, 0, it);
            this.f3707OoooO0O = objArrOooOO0o2;
            this.f3704OoooO = elements.size() + size();
        }
        return true;
    }

    @Override // OoooOOo.o00000O0.OooO00o
    @NotNull
    public final o00000O0<E> build() {
        o000O00 o000o01;
        Object[] objArr = this.f3705OoooO0;
        if (objArr == this.f3702Oooo0oO && this.f3707OoooO0O == this.f3703Oooo0oo) {
            o000o01 = this.f3701Oooo0o;
        } else {
            this.f3706OoooO00 = new o000O0O0();
            this.f3702Oooo0oO = objArr;
            Object[] objArr2 = this.f3707OoooO0O;
            this.f3703Oooo0oo = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    o000O0O0.OooO00o oooO00o = o000O0O0.f3709Oooo0oO;
                    o000o01 = o000O0O0.f3710Oooo0oo;
                } else {
                    Object[] objArrCopyOf = Arrays.copyOf(this.f3707OoooO0O, size());
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                    o000o01 = new o000O0O0(objArrCopyOf);
                }
            } else {
                Object[] objArr3 = this.f3705OoooO0;
                Intrinsics.checkNotNull(objArr3);
                o000o01 = new o000O00(objArr3, this.f3707OoooO0O, size(), this.f3700Oooo);
            }
        }
        this.f3701Oooo0o = o000o01;
        return (o00000O0<E>) o000o01;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        Object[] objArr;
        o000OO0O.OooO00o(i, size());
        if (OooOooo() <= i) {
            objArr = this.f3707OoooO0O;
        } else {
            objArr = this.f3705OoooO0;
            Intrinsics.checkNotNull(objArr);
            for (int i2 = this.f3700Oooo; i2 > 0; i2 -= 5) {
                Object obj = objArr[(i >> i2) & 31];
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i & 31];
    }

    @Override // kotlin.collections.AbstractMutableList
    /* JADX INFO: renamed from: getSize */
    public final int getLength() {
        return this.f3704OoooO;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return OooOoo0(new OooO00o(elements));
    }

    @Override // kotlin.collections.AbstractMutableList
    public final E removeAt(int i) {
        o000OO0O.OooO00o(i, size());
        ((AbstractList) this).modCount++;
        int iOooOooo = OooOooo();
        if (i >= iOooOooo) {
            return (E) OooOooO(this.f3705OoooO0, iOooOooo, this.f3700Oooo, i - iOooOooo);
        }
        o000Oo0 o000oo1 = new o000Oo0(this.f3707OoooO0O[0]);
        Object[] objArr = this.f3705OoooO0;
        Intrinsics.checkNotNull(objArr);
        OooOooO(OooOoo(objArr, this.f3700Oooo, i, o000oo1), iOooOooo, this.f3700Oooo, 0);
        return (E) o000oo1.f3718OooO00o;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        o000OO0O.OooO00o(i, size());
        if (OooOooo() > i) {
            o000Oo0 o000oo1 = new o000Oo0(null);
            Object[] objArr = this.f3705OoooO0;
            Intrinsics.checkNotNull(objArr);
            this.f3705OoooO0 = Oooo000(objArr, this.f3700Oooo, i, e, o000oo1);
            return (E) o000oo1.f3718OooO00o;
        }
        Object[] objArrOooOO0 = OooOO0(this.f3707OoooO0O);
        if (objArrOooOO0 != this.f3707OoooO0O) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        E e2 = (E) objArrOooOO0[i2];
        objArrOooOO0[i2] = e;
        this.f3707OoooO0O = objArrOooOO0;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public final ListIterator<E> listIterator(int i) {
        o000OO0O.OooO0O0(i, size());
        return new o000O0Oo(this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        o000OO0O.OooO0O0(i, size());
        if (i == size()) {
            add(e);
            return;
        }
        ((AbstractList) this).modCount++;
        int iOooOooo = OooOooo();
        if (i >= iOooOooo) {
            OooO0oO(this.f3705OoooO0, i - iOooOooo, e);
            return;
        }
        o000Oo0 o000oo1 = new o000Oo0(null);
        Object[] objArr = this.f3705OoooO0;
        Intrinsics.checkNotNull(objArr);
        OooO0oO(OooO0o0(objArr, this.f3700Oooo, i, e, o000oo1), 0, o000oo1.f3718OooO00o);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, @NotNull Collection<? extends E> elements) {
        Object[] objArrCopyInto;
        Intrinsics.checkNotNullParameter(elements, "elements");
        o000OO0O.OooO0O0(i, size());
        if (i == size()) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((elements.size() + (size() - i2)) - 1) / 32;
        if (size == 0) {
            OooOooo();
            int i3 = i & 31;
            int size2 = ((elements.size() + i) - 1) & 31;
            Object[] objArr = this.f3707OoooO0O;
            Object[] objArrCopyInto2 = ArraysKt.copyInto(objArr, OooOO0(objArr), size2 + 1, i3, Oooo00o());
            OooO00o(objArrCopyInto2, i3, elements.iterator());
            this.f3707OoooO0O = objArrCopyInto2;
            this.f3704OoooO = elements.size() + size();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iOooo00o = Oooo00o();
        int size3 = elements.size() + size();
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= OooOooo()) {
            objArrCopyInto = OooOO0o();
            Oooo00O(elements, i, this.f3707OoooO0O, iOooo00o, objArr2, size, objArrCopyInto);
        } else if (size3 > iOooo00o) {
            int i4 = size3 - iOooo00o;
            objArrCopyInto = OooOO0O(this.f3707OoooO0O, i4);
            OooO0OO(elements, i, i4, objArr2, size, objArrCopyInto);
        } else {
            int i5 = iOooo00o - size3;
            objArrCopyInto = ArraysKt.copyInto(this.f3707OoooO0O, OooOO0o(), 0, i5, iOooo00o);
            int i6 = 32 - i5;
            Object[] objArrOooOO0O = OooOO0O(this.f3707OoooO0O, i6);
            int i7 = size - 1;
            objArr2[i7] = objArrOooOO0O;
            OooO0OO(elements, i, i6, objArr2, i7, objArrOooOO0O);
        }
        this.f3705OoooO0 = OooOo00(this.f3705OoooO0, i2, objArr2);
        this.f3707OoooO0O = objArrCopyInto;
        this.f3704OoooO = elements.size() + size();
        return true;
    }
}
