package oo0o0O0;

import coil.size.Size;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements OooO0o {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Size f53345OooO0OO;

    public OooO0O0(@NotNull Size size) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.f53345OooO0OO = size;
    }

    @Override // oo0o0O0.OooO0o
    @Nullable
    public final Object OooO0O0(@NotNull Continuation<? super Size> continuation) {
        return this.f53345OooO0OO;
    }

    public final boolean equals(@Nullable Object obj) {
        return this == obj || ((obj instanceof OooO0O0) && Intrinsics.areEqual(this.f53345OooO0OO, ((OooO0O0) obj).f53345OooO0OO));
    }

    public final int hashCode() {
        return this.f53345OooO0OO.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("RealSizeResolver(size=");
        sbOooO0o0.append(this.f53345OooO0OO);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
