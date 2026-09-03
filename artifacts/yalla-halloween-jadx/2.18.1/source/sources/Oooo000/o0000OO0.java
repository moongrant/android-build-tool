package Oooo000;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public abstract class o0000OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f856OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final o000 f857OooO0O0 = new o000(new o00O00OO(null, null, null, null, 15));

    public static final class OooO00o {
    }

    public o0000OO0() {
    }

    @NotNull
    public abstract o00O00OO OooO00o();

    @Stable
    @NotNull
    public final o0000OO0 OooO0O0(@NotNull o0000OO0 enter) {
        Intrinsics.checkNotNullParameter(enter, "enter");
        o00O00OO o00o00oo2 = ((o000) this).f830OooO0OO;
        o000O00 o000o01 = o00o00oo2.f934OooO00o;
        if (o000o01 == null) {
            o000o01 = ((o000) enter).f830OooO0OO.f934OooO00o;
        }
        o00oOoo o00oooo2 = o00o00oo2.f935OooO0O0;
        if (o00oooo2 == null) {
            o00oooo2 = ((o000) enter).f830OooO0OO.f935OooO0O0;
        }
        o0Oo0oo o0oo0oo2 = o00o00oo2.f936OooO0OO;
        if (o0oo0oo2 == null) {
            o0oo0oo2 = ((o000) enter).f830OooO0OO.f936OooO0OO;
        }
        o000O o000o = o00o00oo2.f937OooO0Oo;
        if (o000o == null) {
            o000o = ((o000) enter).f830OooO0OO.f937OooO0Oo;
        }
        return new o000(new o00O00OO(o000o01, o00oooo2, o0oo0oo2, o000o));
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof o0000OO0) && Intrinsics.areEqual(((o0000OO0) obj).OooO00o(), OooO00o());
    }

    public final int hashCode() {
        return OooO00o().hashCode();
    }

    public o0000OO0(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
