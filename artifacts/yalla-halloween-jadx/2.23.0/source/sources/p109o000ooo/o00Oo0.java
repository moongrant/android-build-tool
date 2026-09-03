package p109o000ooo;

import android.graphics.drawable.Drawable;
import coil.request.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 extends o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Drawable f35846OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO00o f35847OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Throwable f35848OooO0OO;

    public o00Oo0(@Nullable Drawable drawable, @NotNull OooO00o oooO00o, @NotNull Throwable th) {
        this.f35846OooO00o = drawable;
        this.f35847OooO0O0 = oooO00o;
        this.f35848OooO0OO = th;
    }

    @Override // p109o000ooo.o00oO0o
    @Nullable
    public final Drawable OooO00o() {
        return this.f35846OooO00o;
    }

    @Override // p109o000ooo.o00oO0o
    @NotNull
    public final OooO00o OooO0O0() {
        return this.f35847OooO0O0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00Oo0) {
            o00Oo0 o00oo1 = (o00Oo0) obj;
            if (Intrinsics.areEqual(this.f35846OooO00o, o00oo1.f35846OooO00o)) {
                if (Intrinsics.areEqual(this.f35847OooO0O0, o00oo1.f35847OooO0O0) && Intrinsics.areEqual(this.f35848OooO0OO, o00oo1.f35848OooO0OO)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.f35846OooO00o;
        return this.f35848OooO0OO.hashCode() + ((this.f35847OooO0O0.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
