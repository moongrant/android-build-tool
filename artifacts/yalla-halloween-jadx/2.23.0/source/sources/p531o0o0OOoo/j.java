package p531o0o0OOoo;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p577o0oOoOoO.oOO00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.screen.room.RoomUserActionRecordScreenKt$RoomUserActionRecordScreenContent$1$1$1", f = "RoomUserActionRecordScreen.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
public final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f54512OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oOO00 f54513OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(oOO00 ooo00, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f54513OooO0o0 = ooo00;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new j(this.f54513OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f54512OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f54512OooO0Oo = 1;
            if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        oOO00 ooo00 = this.f54513OooO0o0;
        ooo00.f56344OooO0o0.OooO00o();
        ooo00.f56343OooO0o.OooO00o();
        ooo00.f56345OooO0oO.OooO00o();
        return Unit.INSTANCE;
    }
}
