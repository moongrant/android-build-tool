package p231o00oOoO;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.google.accompanist.web.WebViewNavigator$navigateBack$1", f = "WebView.kt", i = {}, l = {454}, m = "invokeSuspend", n = {}, s = {})
public final class o0000oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f39894OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0000O00 f39895OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000oo(o0000O00 o0000o00, Continuation<? super o0000oo> continuation) {
        super(2, continuation);
        this.f39895OooO0o0 = o0000o00;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0000oo(this.f39895OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0000oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f39894OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<o0000O00.OooO00o> mutableSharedFlow = this.f39895OooO0o0.f39874OooO0O0;
            o0000O00.OooO00o.C0439OooO00o c0439OooO00o = o0000O00.OooO00o.C0439OooO00o.f39877OooO00o;
            this.f39894OooO0Oo = 1;
            if (mutableSharedFlow.emit(c0439OooO00o, this) == coroutine_suspended) {
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
}
