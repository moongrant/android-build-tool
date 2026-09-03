package p025Oooo0O0;

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

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewModifier$onSizeChanged$1", f = "Scrollable.kt", i = {}, l = {578}, m = "invokeSuspend", n = {}, s = {})
public final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o00O0O.OooOO0O f1363Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f1364Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f1365Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o00O0O.OooOO0O f1366Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(OooOO0 oooOO1, o00O0O.OooOO0O oooOO0O, o00O0O.OooOO0O oooOO0O2, Continuation<? super OooOO0O> continuation) {
        super(2, continuation);
        this.f1365Oooo0oO = oooOO1;
        this.f1366Oooo0oo = oooOO0O;
        this.f1363Oooo = oooOO0O2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOO0O(this.f1365Oooo0oO, this.f1366Oooo0oo, this.f1363Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f1364Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooOO0 oooOO1 = this.f1365Oooo0oO;
            o00O0O.OooOO0O oooOO0O = this.f1366Oooo0oo;
            o00O0O.OooOO0O oooOO0O2 = this.f1363Oooo;
            this.f1364Oooo0o = 1;
            if (oooOO1.OooO0Oo(oooOO0O, oooOO0O2, this) == coroutine_suspended) {
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
