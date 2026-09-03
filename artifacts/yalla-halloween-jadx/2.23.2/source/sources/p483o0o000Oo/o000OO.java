package p483o0o000Oo;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000OO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<T> f48617OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Function0<T> f48618OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public o000OO(@NotNull MutableStateFlow<T> state, @NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f48617OooO00o = state;
        this.f48618OooO0O0 = initializer;
    }
}
