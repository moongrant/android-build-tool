package o000O00O;

import com.qiniu.android.collect.ReportItem;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.selects.SelectClause2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSimpleChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleChannelFlow.kt\nandroidx/paging/SimpleProducerScopeImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,99:1\n314#2,11:100\n*S KotlinDebug\n*F\n+ 1 SimpleChannelFlow.kt\nandroidx/paging/SimpleProducerScopeImpl\n*L\n90#1:100,11\n*E\n"})
public final class o0O0ooO<T> implements o00O0000<T>, CoroutineScope, SendChannel<T> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final SendChannel<T> f34648OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f34649OooO0o0;

    @DebugMetadata(c = "androidx.paging.SimpleProducerScopeImpl", f = "SimpleChannelFlow.kt", i = {0, 0}, l = {100}, m = "awaitClose", n = {ReportItem.LogTypeBlock, "job"}, s = {"L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Function0 f34650OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f34651OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Job f34652OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o0O0ooO<T> f34653OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f34654OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0O0ooO<T> o0o0ooo, Continuation<? super OooO00o> continuation) {
            super(continuation);
            this.f34653OooO0oO = o0o0ooo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34651OooO0o = obj;
            this.f34654OooO0oo |= Integer.MIN_VALUE;
            return this.f34653OooO0oO.OooO0OO(null, this);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<Unit> f34655OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(CancellableContinuationImpl cancellableContinuationImpl) {
            super(1);
            this.f34655OooO0Oo = cancellableContinuationImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            Unit unit = Unit.INSTANCE;
            this.f34655OooO0Oo.resumeWith(Result.m4213constructorimpl(unit));
            return unit;
        }
    }

    public o0O0ooO(@NotNull CoroutineScope scope, @NotNull Channel channel) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f34648OooO0Oo = channel;
        this.f34649OooO0o0 = scope;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o000O00O.o00O0000
    @Nullable
    public final Object OooO0OO(@NotNull Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f34654OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f34654OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(this, continuation);
            }
        } else {
            oooO00o = new OooO00o(this, continuation);
        }
        Object obj = oooO00o.f34651OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f34654OooO0oo;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext.Element element = getCoroutineContext().get(Job.INSTANCE);
                if (element == null) {
                    throw new IllegalStateException("Internal error, context should have a job.".toString());
                }
                Job job = (Job) element;
                oooO00o.f34650OooO0Oo = function0;
                oooO00o.f34652OooO0o0 = job;
                oooO00o.f34654OooO0oo = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(oooO00o), 1);
                cancellableContinuationImpl.initCancellability();
                job.invokeOnCompletion(new OooO0O0(cancellableContinuationImpl));
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(oooO00o);
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = oooO00o.f34650OooO0Oo;
                ResultKt.throwOnFailure(obj);
            }
            function0.invoke();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: close */
    public final boolean cancel(@Nullable Throwable th) {
        return this.f34648OooO0Oo.cancel(th);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public final CoroutineContext getCoroutineContext() {
        return this.f34649OooO0o0.getCoroutineContext();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @NotNull
    public final SelectClause2<T, SendChannel<T>> getOnSend() {
        return this.f34648OooO0Oo.getOnSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @ExperimentalCoroutinesApi
    public final void invokeOnClose(@NotNull Function1<? super Throwable, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f34648OooO0Oo.invokeOnClose(handler);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean isClosedForSend() {
        return this.f34648OooO0Oo.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public final boolean offer(T t) {
        return this.f34648OooO0Oo.offer(t);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Nullable
    public final Object send(T t, @NotNull Continuation<? super Unit> continuation) {
        return this.f34648OooO0Oo.send(t, continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @NotNull
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public final Object mo5731trySendJP2dKIU(T t) {
        return this.f34648OooO0Oo.mo5731trySendJP2dKIU(t);
    }
}
