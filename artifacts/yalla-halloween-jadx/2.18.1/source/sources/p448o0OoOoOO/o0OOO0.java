package p448o0OoOoOO;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import o0O000O.OooO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f40283OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f40284OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Job f40285OooO0OO;

    @DebugMetadata(c = "com.common.support.longlink.pulse.PulseTimeoutMonitor$start$1", f = "Pulse.kt", i = {}, l = {212}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f40286Oooo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o0OOO0.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f40286Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = o0OOO0.this.f40283OooO00o;
                this.f40286Oooo0o = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            o0OOO0.this.f40284OooO0O0.invoke();
            return Unit.INSTANCE;
        }
    }

    public o0OOO0(long j, @NotNull Function0<Unit> onPulseTimeout) {
        Intrinsics.checkNotNullParameter(onPulseTimeout, "onPulseTimeout");
        this.f40283OooO00o = j;
        this.f40284OooO0O0 = onPulseTimeout;
    }

    public final void OooO00o() {
        this.f40285OooO0OO = BuildersKt__Builders_commonKt.launch$default(OooO0o.OooO00o(), null, null, new OooO00o(null), 3, null);
    }
}
