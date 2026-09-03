package o000O00O;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.paging.MulticastedPagingData$asPagingData$2", f = "CachedPagingData.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
public final class o000OOo extends SuspendLambda implements Function3<FlowCollector<? super androidx.paging.Oooo000<Object>>, Throwable, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000000<Object> f34562OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(o000000<Object> o000000Var, Continuation<? super o000OOo> continuation) {
        super(3, continuation);
        this.f34562OooO0Oo = o000000Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super androidx.paging.Oooo000<Object>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return new o000OOo(this.f34562OooO0Oo, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f34562OooO0Oo.getClass();
        return Unit.INSTANCE;
    }
}
