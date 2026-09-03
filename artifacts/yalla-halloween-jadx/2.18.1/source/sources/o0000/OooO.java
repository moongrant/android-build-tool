package o0000;

import androidx.compose.runtime.Immutable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042Ooooo0o.o000O0Oo;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class OooO implements Collection<OooO0o>, KMappedMarker {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f26563Oooo0oo = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final List<OooO0o> f26564Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f26565Oooo0oO;

    public static final class OooO00o {
    }

    public OooO(@NotNull List<OooO0o> localeList) {
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        this.f26564Oooo0o = localeList;
        this.f26565Oooo0oO = localeList.size();
    }

    @NotNull
    public final OooO0o OooO00o() {
        return this.f26564Oooo0o.get(0);
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(OooO0o oooO0o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends OooO0o> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        OooO0o element = (OooO0o) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f26564Oooo0o.contains(element);
    }

    @Override // java.util.Collection
    public final boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f26564Oooo0o.containsAll(elements);
    }

    @Override // java.util.Collection
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OooO) && Intrinsics.areEqual(this.f26564Oooo0o, ((OooO) obj).f26564Oooo0o);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f26564Oooo0o.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f26564Oooo0o.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<OooO0o> iterator() {
        return this.f26564Oooo0o.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate<? super OooO0o> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f26565Oooo0oO;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }

    @NotNull
    public final String toString() {
        return o000O0Oo.OooO00o(OooO00o.OooO00o.OooO0o0("LocaleList(localeList="), this.f26564Oooo0o, ')');
    }
}
