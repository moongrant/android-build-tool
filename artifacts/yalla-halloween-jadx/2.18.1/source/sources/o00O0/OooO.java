package o00O0;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Drawable f30067OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f30068OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final DataSource f30069OooO0OO;

    public OooO(@NotNull Drawable drawable, boolean z, @NotNull DataSource dataSource) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f30067OooO00o = drawable;
        this.f30068OooO0O0 = z;
        this.f30069OooO0OO = dataSource;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO)) {
            return false;
        }
        OooO oooO = (OooO) obj;
        return Intrinsics.areEqual(this.f30067OooO00o, oooO.f30067OooO00o) && this.f30068OooO0O0 == oooO.f30068OooO0O0 && this.f30069OooO0OO == oooO.f30069OooO0OO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final int hashCode() {
        int iHashCode = this.f30067OooO00o.hashCode() * 31;
        boolean z = this.f30068OooO0O0;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return this.f30069OooO0OO.hashCode() + ((iHashCode + r1) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("DrawableResult(drawable=");
        sbOooO0o0.append(this.f30067OooO00o);
        sbOooO0o0.append(", isSampled=");
        sbOooO0o0.append(this.f30068OooO0O0);
        sbOooO0o0.append(", dataSource=");
        sbOooO0o0.append(this.f30069OooO0OO);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
