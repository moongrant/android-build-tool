package p530o0o0OOO;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00OO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0O00OO<T> f43310OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Function0<T> f43311OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public o00OO(@NotNull o0O00OO<T> state, @NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f43310OooO00o = state;
        this.f43311OooO0O0 = initializer;
    }
}
