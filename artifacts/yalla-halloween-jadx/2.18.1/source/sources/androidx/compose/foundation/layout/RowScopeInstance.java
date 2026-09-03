package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p028Oooo0o0.o0O000O;
import p028Oooo0o0.o0O0O0O;
import p028Oooo0o0.o0O0o0;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class RowScopeInstance implements o0O0O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final RowScopeInstance f5758OooO00o = new RowScopeInstance();

    @Override // p028Oooo0o0.o0O0O0O
    @Stable
    @NotNull
    public final o00OOOO0 OooO00o(@NotNull o00OOOO0 o00oooo1, boolean z) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        if (!(((double) 1.0f) > 0.0d)) {
            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
        }
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return o00oooo1.OooOOoo(new o0O000O(z));
    }

    @Override // p028Oooo0o0.o0O0O0O
    @Stable
    @NotNull
    public final o00OOOO0 OooO0O0(@NotNull o00OOOO0 o00oooo1, @NotNull o00OO0O0.OooO0OO alignment) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return o00oooo1.OooOOoo(new o0O0o0(alignment));
    }
}
