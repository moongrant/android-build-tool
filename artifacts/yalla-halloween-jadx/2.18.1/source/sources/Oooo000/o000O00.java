package Oooo000;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f867OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final p023Oooo00O.o0000O0O<Float> f868OooO0O0;

    public o000O00(float f, @NotNull p023Oooo00O.o0000O0O<Float> animationSpec) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.f867OooO00o = f;
        this.f868OooO0O0 = animationSpec;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000O00)) {
            return false;
        }
        o000O00 o000o01 = (o000O00) obj;
        return Intrinsics.areEqual((Object) Float.valueOf(this.f867OooO00o), (Object) Float.valueOf(o000o01.f867OooO00o)) && Intrinsics.areEqual(this.f868OooO0O0, o000o01.f868OooO0O0);
    }

    public final int hashCode() {
        return this.f868OooO0O0.hashCode() + (Float.floatToIntBits(this.f867OooO00o) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Fade(alpha=");
        sbOooO0o0.append(this.f867OooO00o);
        sbOooO0o0.append(", animationSpec=");
        sbOooO0o0.append(this.f868OooO0O0);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
