package p273o00ooooO;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p272o00oooo0.o0O0o000;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "com.common.support.apm.uploader.XLogFileUploader$startPeriodUpload$1", f = "XLogFileUploader.kt", i = {0}, l = {36}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class b0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f34973Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f34974Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ e0 f34975Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(e0 e0Var, Continuation<? super b0> continuation) {
        super(2, continuation);
        this.f34975Oooo0oo = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        b0 b0Var = new b0(this.f34975Oooo0oo, continuation);
        b0Var.f34974Oooo0oO = obj;
        return b0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f34973Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.f34974Oooo0oO;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.f34974Oooo0oO;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (CancellationException unused) {
                o0O0o000.f34968OooO00o.OooO0O0("upload task cancelled");
            }
        }
        while (CoroutineScopeKt.isActive(coroutineScope)) {
            e0 e0Var = this.f34975Oooo0oo;
            Objects.requireNonNull(e0Var);
            CoroutineScope coroutineScopeMainScope = CoroutineScopeKt.MainScope();
            Dispatchers dispatchers = Dispatchers.INSTANCE;
            BuildersKt__Builders_commonKt.launch$default(coroutineScopeMainScope, Dispatchers.getIO(), null, new c0(e0Var, null), 2, null);
            long j = this.f34975Oooo0oo.f34992OooO0o0;
            this.f34974Oooo0oO = coroutineScope;
            this.f34973Oooo0o = 1;
            if (DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
