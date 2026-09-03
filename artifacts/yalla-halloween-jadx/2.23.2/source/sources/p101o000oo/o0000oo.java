package p101o000oo;

import androidx.annotation.IntRange;
import androidx.appcompat.widget.o0000O0;
import java.util.ArrayList;
import java.util.List;
import kotlin.ULong;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000oo<T> extends AbstractList<T> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f35432OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final List<T> f35433OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f35434OooO0o0;

    public o0000oo(@NotNull ArrayList items, @IntRange(from = ULong.MIN_VALUE) int i, @IntRange(from = ULong.MIN_VALUE) int i2) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f35432OooO0Oo = i;
        this.f35434OooO0o0 = i2;
        this.f35433OooO0o = items;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    @Nullable
    public final T get(int i) {
        int i2 = this.f35432OooO0Oo;
        if (i >= 0 && i < i2) {
            return null;
        }
        List<T> list = this.f35433OooO0o;
        if (i < list.size() + i2 && i2 <= i) {
            return list.get(i - i2);
        }
        if (i < size() && list.size() + i2 <= i) {
            return null;
        }
        StringBuilder sbOooO0O0 = o0000O0.OooO0O0("Illegal attempt to access index ", i, " in ItemSnapshotList of size ");
        sbOooO0O0.append(size());
        throw new IndexOutOfBoundsException(sbOooO0O0.toString());
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public final int get_size() {
        return this.f35433OooO0o.size() + this.f35432OooO0Oo + this.f35434OooO0o0;
    }
}
