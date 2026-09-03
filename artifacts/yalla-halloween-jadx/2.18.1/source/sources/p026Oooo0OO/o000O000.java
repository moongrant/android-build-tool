package p026Oooo0OO;

import androidx.compose.runtime.Stable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class o000O000 implements o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<o0000O> f1721OooO00o = SharedFlowKt.MutableSharedFlow$default(0, 16, BufferOverflow.DROP_OLDEST, 1, null);

    @Override // p026Oooo0OO.o0000OO0
    public final Flow OooO00o() {
        return this.f1721OooO00o;
    }

    @Override // p026Oooo0OO.o000
    public final boolean OooO0O0(@NotNull o0000O interaction) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        return this.f1721OooO00o.tryEmit(interaction);
    }

    @Override // p026Oooo0OO.o000
    @Nullable
    public final Object OooO0OO(@NotNull o0000O o0000o2, @NotNull Continuation<? super Unit> continuation) {
        Object objEmit = this.f1721OooO00o.emit(o0000o2, continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }
}
