package p479o0o00;

import Oooo0.o0oOOo;
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
import p023Oooo00O.oo000o;
import p025Oooo0O0.o000OO;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.common.compose.ScrollableTabData$onLaidOut$1$1", f = "ScrollableTabRow.kt", i = {}, l = {262}, m = "invokeSuspend", n = {}, s = {})
public final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f40695Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooO0o f40696Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f40697Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(OooO0o oooO0o, int i, Continuation<? super OooO0OO> continuation) {
        super(2, continuation);
        this.f40696Oooo0oO = oooO0o;
        this.f40697Oooo0oo = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooO0OO(this.f40696Oooo0oO, this.f40697Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f40695Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0oOOo o0oooo2 = this.f40696Oooo0oO.f40698OooO00o;
            int i2 = this.f40697Oooo0oo;
            oo000o<Float> oo000oVar = OooO.f40674OooO00o;
            this.f40695Oooo0o = 1;
            Object objOooO00o = o000OO.OooO00o(o0oooo2, i2 - o0oooo2.OooO0o0(), oo000oVar, this);
            if (objOooO00o != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objOooO00o = Unit.INSTANCE;
            }
            if (objOooO00o == coroutine_suspended) {
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
