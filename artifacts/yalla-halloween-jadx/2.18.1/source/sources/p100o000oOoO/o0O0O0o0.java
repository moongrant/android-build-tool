package p100o000oOoO;

import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Stable
public abstract class o0O0O0o0<T> extends o00OO00O<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0o0(@NotNull Function0<? extends T> defaultFactory) {
        super(defaultFactory, null);
        Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
    }

    @NotNull
    public final o0O0OO0<T> OooO0O0(T t) {
        return new o0O0OO0<>(this, t, true);
    }
}
