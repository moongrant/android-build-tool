package o0O00O0;

import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "com.common.support.utils.LoopTask$run$loopJob$1", f = "LoopTask.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
public final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f35112Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f35113Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(OooO0O0 oooO0O0, Continuation<? super OooO00o> continuation) {
        super(2, continuation);
        this.f35113Oooo0oO = oooO0O0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooO00o(this.f35113Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        OooO00o oooO00o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f35112Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable unused) {
                oooO00o = this;
                Objects.requireNonNull(oooO00o.f35113Oooo0oO);
            }
        }
        oooO00o = this;
        while (true) {
            Job job = oooO00o.f35113Oooo0oO.f35115Oooo0oO;
            boolean z = false;
            if (job != null && job.isActive()) {
                z = true;
            }
            if (!z) {
                return Unit.INSTANCE;
            }
            try {
                Objects.requireNonNull(oooO00o.f35113Oooo0oO);
                oooO00o.f35113Oooo0oO.OooO0O0();
                Objects.requireNonNull(oooO00o.f35113Oooo0oO);
                long jOooO00o = oooO00o.f35113Oooo0oO.OooO00o();
                oooO00o.f35112Oooo0o = 1;
                if (DelayKt.delay(jOooO00o, oooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable unused2) {
                Objects.requireNonNull(oooO00o.f35113Oooo0oO);
            }
        }
    }
}
