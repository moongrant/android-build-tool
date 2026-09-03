package p037OoooOOo;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface o00000O0<E> extends o000000O<E>, Collection, KMappedMarker {

    public interface OooO00o<E> extends List<E>, Collection, KMutableCollection, KMutableList {
        @NotNull
        o00000O0<E> build();
    }

    @NotNull
    OooO00o<E> OooO0o();

    @NotNull
    o00000O0<E> OoooO0(int i);

    @NotNull
    o00000O0<E> OoooOoO(@NotNull Function1<? super E, Boolean> function1);

    @Override // java.util.List
    @NotNull
    o00000O0<E> add(int i, E e);

    @Override // java.util.List, java.util.Collection
    @NotNull
    o00000O0<E> add(E e);

    @Override // java.util.List, java.util.Collection
    @NotNull
    o00000O0<E> addAll(@NotNull Collection<? extends E> collection);

    @Override // java.util.List, java.util.Collection
    @NotNull
    o00000O0<E> remove(E e);

    @Override // java.util.List, java.util.Collection
    @NotNull
    o00000O0<E> removeAll(@NotNull Collection<? extends E> collection);

    @Override // java.util.List
    @NotNull
    o00000O0<E> set(int i, E e);
}
