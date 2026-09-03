package o00000O;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooOOOO f26781OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f26782OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f26783OooO0OO;

    public OooOOO(@NotNull OooOOOO intrinsics, int i, int i2) {
        Intrinsics.checkNotNullParameter(intrinsics, "intrinsics");
        this.f26781OooO00o = intrinsics;
        this.f26782OooO0O0 = i;
        this.f26783OooO0OO = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOO)) {
            return false;
        }
        OooOOO oooOOO = (OooOOO) obj;
        return Intrinsics.areEqual(this.f26781OooO00o, oooOOO.f26781OooO00o) && this.f26782OooO0O0 == oooOOO.f26782OooO0O0 && this.f26783OooO0OO == oooOOO.f26783OooO0OO;
    }

    public final int hashCode() {
        return (((this.f26781OooO00o.hashCode() * 31) + this.f26782OooO0O0) * 31) + this.f26783OooO0OO;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ParagraphIntrinsicInfo(intrinsics=");
        sbOooO0o0.append(this.f26781OooO00o);
        sbOooO0o0.append(", startIndex=");
        sbOooO0o0.append(this.f26782OooO0O0);
        sbOooO0o0.append(", endIndex=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.f26783OooO0OO, ')');
    }
}
