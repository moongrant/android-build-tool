package p038OoooOo0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0<T> extends o000<T> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final o000O<T> f3693Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final T[] f3694Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(@NotNull Object[] root, @NotNull T[] tail, int i, int i2, int i3) {
        super(i, i2);
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(tail, "tail");
        this.f3694Oooo0oo = tail;
        int i4 = (i2 - 1) & (-32);
        this.f3693Oooo = new o000O<>(root, RangesKt.coerceAtMost(i, i4), i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        OooO00o();
        if (this.f3693Oooo.hasNext()) {
            this.f3688Oooo0o++;
            return this.f3693Oooo.next();
        }
        T[] tArr = this.f3694Oooo0oo;
        int i = this.f3688Oooo0o;
        this.f3688Oooo0o = i + 1;
        return tArr[i - this.f3693Oooo.f3689Oooo0oO];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        OooO0O0();
        int i = this.f3688Oooo0o;
        o000O<T> o000o = this.f3693Oooo;
        int i2 = o000o.f3689Oooo0oO;
        if (i <= i2) {
            this.f3688Oooo0o = i - 1;
            return o000o.previous();
        }
        T[] tArr = this.f3694Oooo0oo;
        int i3 = i - 1;
        this.f3688Oooo0o = i3;
        return tArr[i3 - i2];
    }
}
