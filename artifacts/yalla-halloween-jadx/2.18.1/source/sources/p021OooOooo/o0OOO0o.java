package p021OooOooo;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class OooO00o<T> implements Iterator<T>, KMappedMarker {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f422Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o0ooOOo<T> f423Oooo0oO;

        public OooO00o(o0ooOOo<T> o0ooooo2) {
            this.f423Oooo0oO = o0ooooo2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f422Oooo0o < this.f423Oooo0oO.OooOO0o();
        }

        @Override // java.util.Iterator
        public final T next() {
            o0ooOOo<T> o0ooooo2 = this.f423Oooo0oO;
            int i = this.f422Oooo0o;
            this.f422Oooo0o = i + 1;
            return o0ooooo2.OooOOO0(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @NotNull
    public static final <T> Iterator<T> OooO00o(@NotNull o0ooOOo<T> o0ooooo2) {
        Intrinsics.checkNotNullParameter(o0ooooo2, "<this>");
        return new OooO00o(o0ooooo2);
    }
}
