package p101o000oo;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O<T> implements FlowCollector<T> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final SendChannel<T> f35568OooO0Oo;

    public o0OO00O(@NotNull o00O0O0O channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f35568OooO0Oo = channel;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
        Object objSend = this.f35568OooO0Oo.send(t, continuation);
        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
    }
}
