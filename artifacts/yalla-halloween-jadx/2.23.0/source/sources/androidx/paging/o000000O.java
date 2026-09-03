package androidx.paging;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o000000O<T> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final o000000O<Object> f7282OooO0o0 = new o000000O<>(0, CollectionsKt.emptyList());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final int[] f7283OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<T> f7284OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f7285OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final List<Integer> f7286OooO0Oo;

    /* JADX WARN: Multi-variable type inference failed */
    public o000000O(@NotNull int[] originalPageOffsets, @NotNull List<? extends T> data, int i, @Nullable List<Integer> list) {
        Intrinsics.checkNotNullParameter(originalPageOffsets, "originalPageOffsets");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f7283OooO00o = originalPageOffsets;
        this.f7284OooO0O0 = data;
        this.f7285OooO0OO = i;
        this.f7286OooO0Oo = list;
        if (!(!(originalPageOffsets.length == 0))) {
            throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage".toString());
        }
        if (list == null || list.size() == data.size()) {
            return;
        }
        StringBuilder sb = new StringBuilder("If originalIndices (size = ");
        Intrinsics.checkNotNull(list);
        sb.append(list.size());
        sb.append(") is provided, it must be same length as data (size = ");
        sb.append(data.size());
        sb.append(')');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(o000000O.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.paging.TransformablePage<*>");
        o000000O o000000o2 = (o000000O) obj;
        return Arrays.equals(this.f7283OooO00o, o000000o2.f7283OooO00o) && Intrinsics.areEqual(this.f7284OooO0O0, o000000o2.f7284OooO0O0) && this.f7285OooO0OO == o000000o2.f7285OooO0OO && Intrinsics.areEqual(this.f7286OooO0Oo, o000000o2.f7286OooO0Oo);
    }

    public final int hashCode() {
        int iHashCode = (((this.f7284OooO0O0.hashCode() + (Arrays.hashCode(this.f7283OooO00o) * 31)) * 31) + this.f7285OooO0OO) * 31;
        List<Integer> list = this.f7286OooO0Oo;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.f7283OooO00o) + ", data=" + this.f7284OooO0O0 + ", hintOriginalPageOffset=" + this.f7285OooO0OO + ", hintOriginalIndices=" + this.f7286OooO0Oo + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o000000O(int i, @NotNull List<? extends T> data) {
        this(new int[]{i}, data, i, null);
        Intrinsics.checkNotNullParameter(data, "data");
    }
}
