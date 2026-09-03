package Oooo000;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public abstract class o000O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f869OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final o000O0o f870OooO0O0 = new o000O0o(new o00O00OO(null, null, null, null, 15));

    public static final class OooO00o {
    }

    public o000O000() {
    }

    @NotNull
    public abstract o00O00OO OooO00o();

    @Stable
    @NotNull
    public final o000O000 OooO0O0(@NotNull o000O000 exit) {
        Intrinsics.checkNotNullParameter(exit, "exit");
        o00O00OO o00o00oo2 = ((o000O0o) this).f878OooO0OO;
        o000O00 o000o01 = o00o00oo2.f934OooO00o;
        if (o000o01 == null) {
            o000o01 = ((o000O0o) exit).f878OooO0OO.f934OooO00o;
        }
        o00oOoo o00oooo2 = o00o00oo2.f935OooO0O0;
        if (o00oooo2 == null) {
            o00oooo2 = ((o000O0o) exit).f878OooO0OO.f935OooO0O0;
        }
        o0Oo0oo o0oo0oo2 = o00o00oo2.f936OooO0OO;
        if (o0oo0oo2 == null) {
            o0oo0oo2 = ((o000O0o) exit).f878OooO0OO.f936OooO0OO;
        }
        o000O o000o = o00o00oo2.f937OooO0Oo;
        if (o000o == null) {
            o000o = ((o000O0o) exit).f878OooO0OO.f937OooO0Oo;
        }
        return new o000O0o(new o00O00OO(o000o01, o00oooo2, o0oo0oo2, o000o));
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof o000O000) && Intrinsics.areEqual(((o000O000) obj).OooO00o(), OooO00o());
    }

    public final int hashCode() {
        return OooO00o().hashCode();
    }

    public o000O000(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
