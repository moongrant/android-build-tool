package p038OoooOo0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.AbstractList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p037OoooOOo.o000000O;
import p037OoooOOo.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o000O000<E> extends AbstractList<E> implements o00000O0<E> {

    public static final class OooO00o extends Lambda implements Function1<E, Boolean> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Collection<E> f3699Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Collection<? extends E> collection) {
            super(1);
            this.f3699Oooo0o = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.f3699Oooo0o.contains(obj));
        }
    }

    @Override // java.util.Collection, java.util.List, p037OoooOOo.o00000O0
    @NotNull
    public o00000O0<E> addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        o00000O0.OooO00o<E> oooO00oOooO0o = OooO0o();
        oooO00oOooO0o.addAll(elements);
        return oooO00oOooO0o.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @NotNull
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, p037OoooOOo.o00000O0
    @NotNull
    public final o00000O0<E> remove(E e) {
        int iIndexOf = indexOf(e);
        return iIndexOf != -1 ? OoooO0(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, p037OoooOOo.o00000O0
    @NotNull
    public final o00000O0<E> removeAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return OoooOoO(new OooO00o(elements));
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        return new o000000O.OooO00o(this, i, i2);
    }
}
