package p031OoooO;

import Oooo000.OooO0O0;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooO;
import o000OO.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@ExperimentalMaterialApi
public final class o0ooOOo implements o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f2903OooO00o = 0.5f;

    @Override // p031OoooO.o000O
    public final float OooO00o(@NotNull OooO oooO, float f, float f2) {
        Intrinsics.checkNotNullParameter(oooO, "<this>");
        return OooO00o.OooO00o(f, f2, this.f2903OooO00o);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0ooOOo) && Intrinsics.areEqual((Object) Float.valueOf(this.f2903OooO00o), (Object) Float.valueOf(((o0ooOOo) obj).f2903OooO00o));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f2903OooO00o);
    }

    @NotNull
    public final String toString() {
        return OooO0O0.OooO00o(OooO00o.OooO00o.OooO0o0("FractionalThreshold(fraction="), this.f2903OooO00o, ')');
    }
}
