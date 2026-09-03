package p089o000o000;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042Ooooo0o.o000O0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final int[] f28897OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<T> f28898OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f28899OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final List<Integer> f28900OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f28896OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final o00O<Object> f28895OooO0o = new o00O<>(0, CollectionsKt.emptyList());

    public static final class OooO00o {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o00O(int i, @NotNull List<? extends T> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        int[] originalPageOffsets = {i};
        Intrinsics.checkNotNullParameter(originalPageOffsets, "originalPageOffsets");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f28897OooO00o = originalPageOffsets;
        this.f28898OooO0O0 = data;
        this.f28899OooO0OO = i;
        this.f28900OooO0Oo = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(o00O.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.paging.TransformablePage<*>");
        o00O o00o2 = (o00O) obj;
        return Arrays.equals(this.f28897OooO00o, o00o2.f28897OooO00o) && Intrinsics.areEqual(this.f28898OooO0O0, o00o2.f28898OooO0O0) && this.f28899OooO0OO == o00o2.f28899OooO0OO && Intrinsics.areEqual(this.f28900OooO0Oo, o00o2.f28900OooO0Oo);
    }

    public final int hashCode() {
        int iHashCode = (((this.f28898OooO0O0.hashCode() + (Arrays.hashCode(this.f28897OooO00o) * 31)) * 31) + this.f28899OooO0OO) * 31;
        List<Integer> list = this.f28900OooO0Oo;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("TransformablePage(originalPageOffsets=");
        sbOooO0o0.append(Arrays.toString(this.f28897OooO00o));
        sbOooO0o0.append(", data=");
        sbOooO0o0.append(this.f28898OooO0O0);
        sbOooO0o0.append(", hintOriginalPageOffset=");
        sbOooO0o0.append(this.f28899OooO0OO);
        sbOooO0o0.append(", hintOriginalIndices=");
        return o000O0Oo.OooO00o(sbOooO0o0, this.f28900OooO0Oo, ')');
    }
}
