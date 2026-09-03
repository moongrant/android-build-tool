package p509o0o0O0;

import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.composable.moment.TempAtVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.composable.moment.MomentInputCoverReplyKt$MomentInputCoverReply$1$1$1$1", f = "MomentInputCoverReply.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
public final class o00O00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f50731OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ UserInfo f50732OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TempAtVM f50733OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f50734OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00(TempAtVM tempAtVM, UserInfo userInfo, MomentVideoVM momentVideoVM, Continuation<? super o00O00> continuation) {
        super(2, continuation);
        this.f50733OooO0o0 = tempAtVM;
        this.f50732OooO0o = userInfo;
        this.f50734OooO0oO = momentVideoVM;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O00(this.f50733OooO0o0, this.f50732OooO0o, this.f50734OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f50731OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f50731OooO0Oo = 1;
            if (DelayKt.delay(100L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.f50733OooO0o0.setTempAtUser(this.f50732OooO0o);
        this.f50734OooO0oO.getShowFastInputPanel().setValue(Boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }
}
