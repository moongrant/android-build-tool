package p101o000oo;

import androidx.paging.Oooo000;
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

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.paging.MulticastedPagingData$asPagingData$2", f = "CachedPagingData.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
public final class o0000O extends SuspendLambda implements Function3<FlowCollector<? super Oooo000<Object>>, Throwable, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000OO0<Object> f35422OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(o0000OO0<Object> o0000oo1, Continuation<? super o0000O> continuation) {
        super(3, continuation);
        this.f35422OooO0Oo = o0000oo1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Oooo000<Object>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return new o0000O(this.f35422OooO0Oo, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f35422OooO0Oo.getClass();
        return Unit.INSTANCE;
    }
}
