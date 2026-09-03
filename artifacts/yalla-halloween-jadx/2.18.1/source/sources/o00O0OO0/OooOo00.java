package o00O0OO0;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 extends OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Drawable f30592OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final coil.request.OooO00o f30593OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooOOO0.OooO00o f30594OooO0OO;

    public OooOo00(@NotNull Drawable drawable, @NotNull coil.request.OooO00o request, @NotNull OooOOO0.OooO00o metadata) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f30592OooO00o = drawable;
        this.f30593OooO0O0 = request;
        this.f30594OooO0OO = metadata;
    }

    @Override // o00O0OO0.OooOOO0
    @NotNull
    public final Drawable OooO00o() {
        return this.f30592OooO00o;
    }

    @Override // o00O0OO0.OooOOO0
    @NotNull
    public final coil.request.OooO00o OooO0O0() {
        return this.f30593OooO0O0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOo00)) {
            return false;
        }
        OooOo00 oooOo00 = (OooOo00) obj;
        return Intrinsics.areEqual(this.f30592OooO00o, oooOo00.f30592OooO00o) && Intrinsics.areEqual(this.f30593OooO0O0, oooOo00.f30593OooO0O0) && Intrinsics.areEqual(this.f30594OooO0OO, oooOo00.f30594OooO0OO);
    }

    public final int hashCode() {
        return this.f30594OooO0OO.hashCode() + ((this.f30593OooO0O0.hashCode() + (this.f30592OooO00o.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("SuccessResult(drawable=");
        sbOooO0o0.append(this.f30592OooO00o);
        sbOooO0o0.append(", request=");
        sbOooO0o0.append(this.f30593OooO0O0);
        sbOooO0o0.append(", metadata=");
        sbOooO0o0.append(this.f30594OooO0OO);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
