package p038OoooOo0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p037OoooOOo.o000000O;
import p037OoooOOo.o00000O0;
import p042Ooooo0o.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0O0<E> extends o000O000<E> implements o000000O<E> {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f3709Oooo0oO = new OooO00o();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public static final o000O0O0 f3710Oooo0oo = new o000O0O0(new Object[0]);

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Object[] f3711Oooo0o;

    public static final class OooO00o {
    }

    public o000O0O0(@NotNull Object[] buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f3711Oooo0o = buffer;
        int length = buffer.length;
    }

    @Override // p037OoooOOo.o00000O0
    @NotNull
    public final o00000O0.OooO00o<E> OooO0o() {
        return new o000O00O(this, null, this.f3711Oooo0o, 0);
    }

    @Override // p037OoooOOo.o00000O0
    @NotNull
    public final o00000O0<E> OoooO0(int i) {
        o000OO0O.OooO00o(i, size());
        if (size() == 1) {
            return f3710Oooo0oo;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f3711Oooo0o, size() - 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        ArraysKt.copyInto(this.f3711Oooo0o, objArrCopyOf, i, i + 1, size());
        return new o000O0O0(objArrCopyOf);
    }

    @Override // p037OoooOOo.o00000O0
    @NotNull
    public final o00000O0<E> OoooOoO(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArrCopyOf = this.f3711Oooo0o;
        int size = size();
        int size2 = size();
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            Object obj = this.f3711Oooo0o[i];
            if (((Boolean) ((o000O000.OooO00o) predicate).invoke(obj)).booleanValue()) {
                if (!z) {
                    Object[] objArr = this.f3711Oooo0o;
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArrCopyOf[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        return size == 0 ? f3710Oooo0oo : new o000O0O0(ArraysKt.copyOfRange(objArrCopyOf, 0, size));
    }

    @Override // java.util.Collection, java.util.List, p037OoooOOo.o00000O0
    @NotNull
    public final o00000O0<E> add(E e) {
        if (size() >= 32) {
            return new o000O00(this.f3711Oooo0o, o000OO00.OooO00o(e), size() + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f3711Oooo0o, size() + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[size()] = e;
        return new o000O0O0(objArrCopyOf);
    }

    @Override // p038OoooOo0.o000O000, java.util.Collection, java.util.List, p037OoooOOo.o00000O0
    @NotNull
    public final o00000O0<E> addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.size() + size() > 32) {
            o000O00O o000o00o2 = (o000O00O) OooO0o();
            o000o00o2.addAll(elements);
            return o000o00o2.build();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f3711Oooo0o, elements.size() + size());
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        int size = size();
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new o000O0O0(objArrCopyOf);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final E get(int i) {
        o000OO0O.OooO00o(i, size());
        return (E) this.f3711Oooo0o[i];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.f3711Oooo0o.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        return ArraysKt.indexOf(this.f3711Oooo0o, obj);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        return ArraysKt.lastIndexOf(this.f3711Oooo0o, obj);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    public final ListIterator<E> listIterator(int i) {
        o000OO0O.OooO0O0(i, size());
        return new o000O0o(this.f3711Oooo0o, i, size());
    }

    @Override // kotlin.collections.AbstractList, java.util.List, p037OoooOOo.o00000O0
    @NotNull
    public final o00000O0<E> set(int i, E e) {
        o000OO0O.OooO00o(i, size());
        Object[] objArr = this.f3711Oooo0o;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i] = e;
        return new o000O0O0(objArrCopyOf);
    }

    @Override // java.util.List, p037OoooOOo.o00000O0
    @NotNull
    public final o00000O0<E> add(int i, E e) {
        o000OO0O.OooO0O0(i, size());
        if (i == size()) {
            return add((Object) e);
        }
        if (size() < 32) {
            Object[] objArr = new Object[size() + 1];
            ArraysKt.OooO0o0(this.f3711Oooo0o, objArr, 0, 0, i, 6);
            ArraysKt.copyInto(this.f3711Oooo0o, objArr, i + 1, i, size());
            objArr[i] = e;
            return new o000O0O0(objArr);
        }
        Object[] objArr2 = this.f3711Oooo0o;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        ArraysKt.copyInto(this.f3711Oooo0o, objArrCopyOf, i + 1, i, size() - 1);
        objArrCopyOf[i] = e;
        return new o000O00(objArrCopyOf, o000OO00.OooO00o(this.f3711Oooo0o[31]), size() + 1, 0);
    }
}
