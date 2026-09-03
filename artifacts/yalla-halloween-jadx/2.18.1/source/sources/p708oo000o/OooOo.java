package p708oo000o;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p191o00o0O.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public abstract class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f53186OooO00o;

    public abstract void OooO00o(@NotNull o0Oo0oo o0oo0oo2);

    @Nullable
    public Function0<Unit> OooO0O0() {
        return this.f53186OooO00o;
    }

    public final void OooO0OO() {
        Function0<Unit> function0OooO0O0 = OooO0O0();
        if (function0OooO0O0 != null) {
            function0OooO0O0.invoke();
        }
    }

    public void OooO0Oo(@Nullable Function0<Unit> function0) {
        this.f53186OooO00o = function0;
    }
}
