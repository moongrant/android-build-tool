package p124o00O0o00;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Drawable f36535OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f36536OooO0O0;

    public OooOOO0(@NotNull Drawable drawable, boolean z) {
        this.f36535OooO00o = drawable;
        this.f36536OooO0O0 = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooOOO0) {
            OooOOO0 oooOOO0 = (OooOOO0) obj;
            if (Intrinsics.areEqual(this.f36535OooO00o, oooOOO0.f36535OooO00o) && this.f36536OooO0O0 == oooOOO0.f36536OooO0O0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f36535OooO00o.hashCode() * 31) + (this.f36536OooO0O0 ? 1231 : 1237);
    }
}
