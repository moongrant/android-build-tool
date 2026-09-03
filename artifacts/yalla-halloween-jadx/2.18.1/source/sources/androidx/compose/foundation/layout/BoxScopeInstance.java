package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p028Oooo0o0.o00O00O;
import p028Oooo0o0.o00O00o0;
import p048OoooooO.o00OO0O0;
import p048OoooooO.o00OO0OO;
import p048OoooooO.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class BoxScopeInstance implements o00O00o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final BoxScopeInstance f5741OooO00o = new BoxScopeInstance();

    @Override // p028Oooo0o0.o00O00o0
    @Stable
    @NotNull
    public final o00OOOO0 OooO00o(@NotNull o00OOOO0 o00oooo1, @NotNull o00OO0O0 alignment) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        return o00oooo1.OooOOoo(new o00O00O(alignment, false));
    }

    @Stable
    @NotNull
    public final o00OOOO0 OooO0O0() {
        Intrinsics.checkNotNullParameter(o00OOOO0.OooO00o.f4198Oooo0o, "<this>");
        o00OO0OO o00oo0oo = o00OO0O0.OooO00o.f4175OooO0o;
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        Function1<o00O000o, Unit> function2 = o00oOoo.f6560OooO00o;
        o00O00O other = new o00O00O(o00oo0oo, true);
        Intrinsics.checkNotNullParameter(other, "other");
        return other;
    }
}
