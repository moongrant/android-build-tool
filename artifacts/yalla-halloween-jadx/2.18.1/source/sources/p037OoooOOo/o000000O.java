package p037OoooOOo;

import java.util.Collection;
import java.util.List;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import p042Ooooo0o.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public interface o000000O<E> extends List<E>, Collection, KMappedMarker {

    public static final class OooO00o<E> extends AbstractList<E> implements o000000O<E> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NotNull
        public final o000000O<E> f3685Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final int f3686Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f3687Oooo0oo;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(@NotNull o000000O<? extends E> source, int i, int i2) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f3685Oooo0o = source;
            this.f3686Oooo0oO = i;
            o000OO0O.OooO0OO(i, i2, source.size());
            this.f3687Oooo0oo = i2 - i;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final E get(int i) {
            o000OO0O.OooO00o(i, this.f3687Oooo0oo);
            return this.f3685Oooo0o.get(this.f3686Oooo0oO + i);
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        /* JADX INFO: renamed from: getSize */
        public final int get_size() {
            return this.f3687Oooo0oo;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public final List subList(int i, int i2) {
            o000OO0O.OooO0OO(i, i2, this.f3687Oooo0oo);
            o000000O<E> o000000o2 = this.f3685Oooo0o;
            int i3 = this.f3686Oooo0oO;
            return new OooO00o(o000000o2, i + i3, i3 + i2);
        }
    }
}
