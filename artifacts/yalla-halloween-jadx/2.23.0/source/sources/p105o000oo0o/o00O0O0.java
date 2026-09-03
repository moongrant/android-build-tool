package p105o000oo0o;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O0 extends o00O0O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Drawable f35771OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f35772OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final DataSource f35773OooO0OO;

    public o00O0O0(@NotNull Drawable drawable, boolean z, @NotNull DataSource dataSource) {
        this.f35771OooO00o = drawable;
        this.f35772OooO0O0 = z;
        this.f35773OooO0OO = dataSource;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00O0O0) {
            o00O0O0 o00o0o0 = (o00O0O0) obj;
            if (Intrinsics.areEqual(this.f35771OooO00o, o00o0o0.f35771OooO00o) && this.f35772OooO0O0 == o00o0o0.f35772OooO0O0 && this.f35773OooO0OO == o00o0o0.f35773OooO0OO) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35773OooO0OO.hashCode() + (((this.f35771OooO00o.hashCode() * 31) + (this.f35772OooO0O0 ? 1231 : 1237)) * 31);
    }
}
