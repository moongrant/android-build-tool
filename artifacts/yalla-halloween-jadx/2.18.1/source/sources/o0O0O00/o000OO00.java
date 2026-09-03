package o0O0O00;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface o000OO00 {

    @StabilityInferred(parameters = 0)
    public static final class OooO00o implements Collection<Object>, KMappedMarker {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NotNull
        public final Set<Object> f35286Oooo0o;

        public OooO00o() {
            LinkedHashSet set = new LinkedHashSet();
            Intrinsics.checkNotNullParameter(set, "set");
            this.f35286Oooo0o = set;
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            return this.f35286Oooo0o.add(obj);
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f35286Oooo0o.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(@Nullable Object obj) {
            return this.f35286Oooo0o.contains(obj);
        }

        @Override // java.util.Collection
        public final boolean containsAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f35286Oooo0o.containsAll(elements);
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.f35286Oooo0o.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        @NotNull
        public final Iterator<Object> iterator() {
            return this.f35286Oooo0o.iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(@Nullable Object obj) {
            return this.f35286Oooo0o.remove(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(@NotNull Collection<? extends Object> slotIds) {
            Intrinsics.checkNotNullParameter(slotIds, "slotIds");
            return this.f35286Oooo0o.remove(slotIds);
        }

        @Override // java.util.Collection
        public final boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(@NotNull Collection<? extends Object> slotIds) {
            Intrinsics.checkNotNullParameter(slotIds, "slotIds");
            return this.f35286Oooo0o.retainAll(slotIds);
        }

        @Override // java.util.Collection
        public final int size() {
            return this.f35286Oooo0o.size();
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
    }

    void OooO00o(@NotNull OooO00o oooO00o);

    boolean OooO0O0(@Nullable Object obj, @Nullable Object obj2);
}
