package p475o0o000;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00000O0<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<T> f47421OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Function0<T> f47422OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public o00000O0(@NotNull MutableStateFlow<T> state, @NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f47421OooO00o = state;
        this.f47422OooO0O0 = initializer;
    }
}
