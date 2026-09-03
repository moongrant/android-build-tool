package p131o00O0oo0;

import android.graphics.drawable.Drawable;
import coil.request.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o extends o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Drawable f36834OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO00o f36835OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Throwable f36836OooO0OO;

    public o00oO0o(@Nullable Drawable drawable, @NotNull OooO00o oooO00o, @NotNull Throwable th) {
        this.f36834OooO00o = drawable;
        this.f36835OooO0O0 = oooO00o;
        this.f36836OooO0OO = th;
    }

    @Override // p131o00O0oo0.o0Oo0oo
    @Nullable
    public final Drawable OooO00o() {
        return this.f36834OooO00o;
    }

    @Override // p131o00O0oo0.o0Oo0oo
    @NotNull
    public final OooO00o OooO0O0() {
        return this.f36835OooO0O0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00oO0o) {
            o00oO0o o00oo0o2 = (o00oO0o) obj;
            if (Intrinsics.areEqual(this.f36834OooO00o, o00oo0o2.f36834OooO00o)) {
                if (Intrinsics.areEqual(this.f36835OooO0O0, o00oo0o2.f36835OooO0O0) && Intrinsics.areEqual(this.f36836OooO0OO, o00oo0o2.f36836OooO0OO)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.f36834OooO00o;
        return this.f36836OooO0OO.hashCode() + ((this.f36835OooO0O0.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
