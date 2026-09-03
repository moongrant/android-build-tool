package p089o000o000;

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
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.selects.SelectClause2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0O0<T> implements o00O0OO0<T>, CoroutineScope, SendChannel<T> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final SendChannel<T> f29100Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f29101Oooo0oO;

    @DebugMetadata(c = "androidx.paging.SimpleProducerScopeImpl", f = "SimpleChannelFlow.kt", i = {0, 0}, l = {100}, m = "awaitClose", n = {ReportItem.LogTypeBlock, "job"}, s = {"L$0", "L$1"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ oo0o0O0<T> f29102Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Function0 f29103Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Job f29104Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f29105Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f29106OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(oo0o0O0<T> oo0o0o0, Continuation<? super OooO00o> continuation) {
            super(continuation);
            this.f29102Oooo = oo0o0o0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29105Oooo0oo = obj;
            this.f29106OoooO00 |= Integer.MIN_VALUE;
            return this.f29102Oooo.OooO00o(null, this);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<Unit> f29107Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(CancellableContinuation<? super Unit> cancellableContinuation) {
            super(1);
            this.f29107Oooo0o = cancellableContinuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            CancellableContinuation<Unit> cancellableContinuation = this.f29107Oooo0o;
            Result.Companion companion = Result.INSTANCE;
            Unit unit = Unit.INSTANCE;
            cancellableContinuation.resumeWith(Result.m502constructorimpl(unit));
            return unit;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oo0o0O0(@NotNull CoroutineScope scope, @NotNull SendChannel<? super T> channel) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f29100Oooo0o = channel;
        this.f29101Oooo0oO = scope;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p089o000o000.o00O0OO0
    @Nullable
    public final Object OooO00o(@NotNull Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f29106OoooO00;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f29106OoooO00 = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(this, continuation);
            }
        } else {
            oooO00o = new OooO00o(this, continuation);
        }
        Object obj = oooO00o.f29105Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f29106OoooO00;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext.Element element = getCoroutineContext().get(Job.INSTANCE);
                if (element == null) {
                    throw new IllegalStateException("Internal error, context should have a job.".toString());
                }
                Job job = (Job) element;
                oooO00o.f29103Oooo0o = function0;
                oooO00o.f29104Oooo0oO = job;
                oooO00o.f29106OoooO00 = 1;
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
                function0 = oooO00o.f29103Oooo0o;
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
        return this.f29100Oooo0o.cancel(th);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public final CoroutineContext getCoroutineContext() {
        return this.f29101Oooo0oO.getCoroutineContext();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @NotNull
    public final SelectClause2<T, SendChannel<T>> getOnSend() {
        return this.f29100Oooo0o.getOnSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @ExperimentalCoroutinesApi
    public final void invokeOnClose(@NotNull Function1<? super Throwable, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f29100Oooo0o.invokeOnClose(handler);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean isClosedForSend() {
        return this.f29100Oooo0o.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public final boolean offer(T t) {
        return this.f29100Oooo0o.offer(t);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Nullable
    public final Object send(T t, @NotNull Continuation<? super Unit> continuation) {
        return this.f29100Oooo0o.send(t, continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @NotNull
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public final Object mo2017trySendJP2dKIU(T t) {
        return this.f29100Oooo0o.mo2017trySendJP2dKIU(t);
    }
}
