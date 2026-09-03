package p038OoooOo0;

import java.util.ConcurrentModificationException;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0Oo<T> extends o000<T> implements KMutableListIterator {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f3712Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final o000O00O<T> f3713Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f3714OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public o000O<? extends T> f3715OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(@NotNull o000O00O<T> builder, int i) {
        super(i, builder.size());
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f3713Oooo0oo = builder;
        this.f3712Oooo = builder.OooO0O0();
        this.f3714OoooO0 = -1;
        OooO0o0();
    }

    public final void OooO0OO() {
        if (this.f3712Oooo != this.f3713Oooo0oo.OooO0O0()) {
            throw new ConcurrentModificationException();
        }
    }

    public final void OooO0Oo() {
        this.f3689Oooo0oO = this.f3713Oooo0oo.size();
        this.f3712Oooo = this.f3713Oooo0oo.OooO0O0();
        this.f3714OoooO0 = -1;
        OooO0o0();
    }

    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void OooO0o0() {
        o000O00O<T> o000o00o2 = this.f3713Oooo0oo;
        Object[] root = o000o00o2.f3705OoooO0;
        if (root == null) {
            this.f3715OoooO00 = null;
            return;
        }
        int size = (o000o00o2.size() - 1) & (-32);
        int iCoerceAtMost = RangesKt.coerceAtMost(this.f3688Oooo0o, size);
        int i = (this.f3713Oooo0oo.f3700Oooo / 5) + 1;
        o000O<? extends T> o000o = this.f3715OoooO00;
        if (o000o == null) {
            this.f3715OoooO00 = new o000O<>(root, iCoerceAtMost, size, i);
            return;
        }
        Intrinsics.checkNotNull(o000o);
        Objects.requireNonNull(o000o);
        Intrinsics.checkNotNullParameter(root, "root");
        o000o.f3688Oooo0o = iCoerceAtMost;
        o000o.f3689Oooo0oO = size;
        o000o.f3691Oooo0oo = i;
        if (o000o.f3690Oooo.length < i) {
            o000o.f3690Oooo = new Object[i];
        }
        o000o.f3690Oooo[0] = root;
        ?? r6 = iCoerceAtMost == size ? 1 : 0;
        o000o.f3692OoooO00 = r6;
        o000o.OooO0Oo(iCoerceAtMost - r6, 1);
    }

    @Override // p038OoooOo0.o000, java.util.ListIterator
    public final void add(T t) {
        OooO0OO();
        this.f3713Oooo0oo.add(this.f3688Oooo0o, t);
        this.f3688Oooo0o++;
        OooO0Oo();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        OooO0OO();
        OooO00o();
        int i = this.f3688Oooo0o;
        this.f3714OoooO0 = i;
        o000O<? extends T> o000o = this.f3715OoooO00;
        if (o000o == null) {
            Object[] objArr = this.f3713Oooo0oo.f3707OoooO0O;
            this.f3688Oooo0o = i + 1;
            return (T) objArr[i];
        }
        if (o000o.hasNext()) {
            this.f3688Oooo0o++;
            return o000o.next();
        }
        Object[] objArr2 = this.f3713Oooo0oo.f3707OoooO0O;
        int i2 = this.f3688Oooo0o;
        this.f3688Oooo0o = i2 + 1;
        return (T) objArr2[i2 - o000o.f3689Oooo0oO];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        OooO0OO();
        OooO0O0();
        int i = this.f3688Oooo0o;
        this.f3714OoooO0 = i - 1;
        o000O<? extends T> o000o = this.f3715OoooO00;
        if (o000o == null) {
            Object[] objArr = this.f3713Oooo0oo.f3707OoooO0O;
            int i2 = i - 1;
            this.f3688Oooo0o = i2;
            return (T) objArr[i2];
        }
        int i3 = o000o.f3689Oooo0oO;
        if (i <= i3) {
            this.f3688Oooo0o = i - 1;
            return o000o.previous();
        }
        Object[] objArr2 = this.f3713Oooo0oo.f3707OoooO0O;
        int i4 = i - 1;
        this.f3688Oooo0o = i4;
        return (T) objArr2[i4 - i3];
    }

    @Override // p038OoooOo0.o000, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        OooO0OO();
        int i = this.f3714OoooO0;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f3713Oooo0oo.remove(i);
        int i2 = this.f3714OoooO0;
        if (i2 < this.f3688Oooo0o) {
            this.f3688Oooo0o = i2;
        }
        OooO0Oo();
    }

    @Override // p038OoooOo0.o000, java.util.ListIterator
    public final void set(T t) {
        OooO0OO();
        int i = this.f3714OoooO0;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f3713Oooo0oo.set(i, t);
        this.f3712Oooo = this.f3713Oooo0oo.OooO0O0();
        OooO0o0();
    }
}
