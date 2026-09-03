package p089o000o000;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00<T> implements FlowCollector<T> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final SendChannel<T> f28687Oooo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public OooOo00(@NotNull SendChannel<? super T> channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f28687Oooo0o = channel;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public final Object emit(T t, @NotNull Continuation<? super Unit> continuation) {
        Object objSend = this.f28687Oooo0o.send(t, continuation);
        return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : Unit.INSTANCE;
    }
}
