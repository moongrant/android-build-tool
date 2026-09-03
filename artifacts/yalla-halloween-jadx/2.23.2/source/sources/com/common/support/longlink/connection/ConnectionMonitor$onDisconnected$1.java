package com.common.support.longlink.connection;

import com.common.support.longlink.log.LoggerKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"IN", "Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@DebugMetadata(c = "com.common.support.longlink.connection.ConnectionMonitor$onDisconnected$1", f = "ConnectionMonitor.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
public final class ConnectionMonitor$onDisconnected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Connection $connection;
    int label;
    final /* synthetic */ ConnectionMonitor<IN> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionMonitor$onDisconnected$1(ConnectionMonitor<IN> connectionMonitor, Connection connection, Continuation<? super ConnectionMonitor$onDisconnected$1> continuation) {
        super(2, continuation);
        this.this$0 = connectionMonitor;
        this.$connection = connection;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ConnectionMonitor$onDisconnected$1(this.this$0, this.$connection, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LoggerKt.logD(((ConnectionMonitor) this.this$0).longLink.getLogTag(), "Reconnect if needed on disconnected");
            ConnectionMonitor<IN> connectionMonitor = this.this$0;
            Connection connection = this.$connection;
            this.label = 1;
            if (connectionMonitor.reconnectIfNeeded(connection, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ConnectionMonitor$onDisconnected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
