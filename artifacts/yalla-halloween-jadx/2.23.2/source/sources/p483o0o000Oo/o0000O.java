package p483o0o000Oo;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "优先使用RoomStateFlowReset")
public final class o0000O<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableState<T> f48491OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Function0<T> f48492OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public o0000O(@NotNull MutableState<T> state, @NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f48491OooO00o = state;
        this.f48492OooO0O0 = initializer;
    }
}
