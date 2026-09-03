package p125o00O0o0O;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o extends o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Drawable f36629OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f36630OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final DataSource f36631OooO0OO;

    public oo000o(@NotNull Drawable drawable, boolean z, @NotNull DataSource dataSource) {
        this.f36629OooO00o = drawable;
        this.f36630OooO0O0 = z;
        this.f36631OooO0OO = dataSource;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oo000o) {
            oo000o oo000oVar = (oo000o) obj;
            if (Intrinsics.areEqual(this.f36629OooO00o, oo000oVar.f36629OooO00o) && this.f36630OooO0O0 == oo000oVar.f36630OooO0O0 && this.f36631OooO0OO == oo000oVar.f36631OooO0OO) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f36631OooO0OO.hashCode() + (((this.f36629OooO00o.hashCode() * 31) + (this.f36630OooO0O0 ? 1231 : 1237)) * 31);
    }
}
