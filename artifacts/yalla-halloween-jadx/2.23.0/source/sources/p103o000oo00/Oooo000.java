package p103o000oo00;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Drawable f35665OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f35666OooO0O0;

    public Oooo000(@NotNull Drawable drawable, boolean z) {
        this.f35665OooO00o = drawable;
        this.f35666OooO0O0 = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Oooo000) {
            Oooo000 oooo000 = (Oooo000) obj;
            if (Intrinsics.areEqual(this.f35665OooO00o, oooo000.f35665OooO00o) && this.f35666OooO0O0 == oooo000.f35666OooO0O0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f35665OooO00o.hashCode() * 31) + (this.f35666OooO0O0 ? 1231 : 1237);
    }
}
