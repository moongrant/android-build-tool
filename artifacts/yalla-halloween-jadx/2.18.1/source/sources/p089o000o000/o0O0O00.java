package p089o000o000;

import androidx.annotation.IntRange;
import androidx.appcompat.widget.o00000O0;
import java.util.List;
import kotlin.ULong;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00<T> extends AbstractList<T> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f29061Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f29062Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final List<T> f29063Oooo0oo;

    /* JADX WARN: Multi-variable type inference failed */
    public o0O0O00(@IntRange(from = ULong.MIN_VALUE) int i, @IntRange(from = ULong.MIN_VALUE) int i2, @NotNull List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f29061Oooo0o = i;
        this.f29062Oooo0oO = i2;
        this.f29063Oooo0oo = items;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @Nullable
    public final T get(int i) {
        if (i >= 0 && i < this.f29061Oooo0o) {
            return null;
        }
        int i2 = this.f29061Oooo0o;
        if (i < this.f29063Oooo0oo.size() + i2 && i2 <= i) {
            return this.f29063Oooo0oo.get(i - this.f29061Oooo0o);
        }
        if (i < size() && this.f29063Oooo0oo.size() + this.f29061Oooo0o <= i) {
            return null;
        }
        StringBuilder sbOooO00o = o00000O0.OooO00o("Illegal attempt to access index ", i, " in ItemSnapshotList of size ");
        sbOooO00o.append(size());
        throw new IndexOutOfBoundsException(sbOooO00o.toString());
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public final int get_size() {
        return this.f29063Oooo0oo.size() + this.f29061Oooo0o + this.f29062Oooo0oO;
    }
}
