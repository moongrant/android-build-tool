package o00O0OO0;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Drawable f30551OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final coil.request.OooO00o f30552OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Throwable f30553OooO0OO;

    public OooO(@Nullable Drawable drawable, @NotNull coil.request.OooO00o request, @NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f30551OooO00o = drawable;
        this.f30552OooO0O0 = request;
        this.f30553OooO0OO = throwable;
    }

    @Override // o00O0OO0.OooOOO0
    @Nullable
    public final Drawable OooO00o() {
        return this.f30551OooO00o;
    }

    @Override // o00O0OO0.OooOOO0
    @NotNull
    public final coil.request.OooO00o OooO0O0() {
        return this.f30552OooO0O0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO)) {
            return false;
        }
        OooO oooO = (OooO) obj;
        return Intrinsics.areEqual(this.f30551OooO00o, oooO.f30551OooO00o) && Intrinsics.areEqual(this.f30552OooO0O0, oooO.f30552OooO0O0) && Intrinsics.areEqual(this.f30553OooO0OO, oooO.f30553OooO0OO);
    }

    public final int hashCode() {
        Drawable drawable = this.f30551OooO00o;
        return this.f30553OooO0OO.hashCode() + ((this.f30552OooO0O0.hashCode() + ((drawable == null ? 0 : drawable.hashCode()) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ErrorResult(drawable=");
        sbOooO0o0.append(this.f30551OooO00o);
        sbOooO0o0.append(", request=");
        sbOooO0o0.append(this.f30552OooO0O0);
        sbOooO0o0.append(", throwable=");
        sbOooO0o0.append(this.f30553OooO0OO);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
