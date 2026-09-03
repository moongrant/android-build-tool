package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p028Oooo0o0.o00O0O00;
import p028Oooo0o0.o00O0OOO;
import p028Oooo0o0.o0O000O;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class ColumnScopeInstance implements o00O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ColumnScopeInstance f5743OooO00o = new ColumnScopeInstance();

    @Override // p028Oooo0o0.o00O0O00
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

    @Override // p028Oooo0o0.o00O0O00
    @Stable
    @NotNull
    public final o00OOOO0 OooO0O0(@NotNull o00OOOO0 o00oooo1, @NotNull o00OO0O0.OooO0O0 alignment) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return o00oooo1.OooOOoo(new o00O0OOO(alignment));
    }
}
