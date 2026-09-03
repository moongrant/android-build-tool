package p115o00O00oO;

import OooO00o.OooO00o;
import Oooo000.Oooo0;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Drawable f30335OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f30336OooO0O0;

    public OooOo(@NotNull Drawable drawable, boolean z) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f30335OooO00o = drawable;
        this.f30336OooO0O0 = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOo)) {
            return false;
        }
        OooOo oooOo = (OooOo) obj;
        return Intrinsics.areEqual(this.f30335OooO00o, oooOo.f30335OooO00o) && this.f30336OooO0O0 == oooOo.f30336OooO0O0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f30335OooO00o.hashCode() * 31;
        boolean z = this.f30336OooO0O0;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("DecodeResult(drawable=");
        sbOooO0o0.append(this.f30335OooO00o);
        sbOooO0o0.append(", isSampled=");
        return Oooo0.OooO0O0(sbOooO0o0, this.f30336OooO0O0, ')');
    }
}
