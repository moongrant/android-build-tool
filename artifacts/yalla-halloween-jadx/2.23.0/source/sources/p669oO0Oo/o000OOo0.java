package p669oO0Oo;

import com.yalla.yalla.model.room.RoomMemberTaskInfoModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o000O0.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p577o0oOoOoO.oOO000o;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskDialog$OnDialog$2$2$3$1", f = "LiveRoomMemberTaskDialog.kt", i = {}, l = {208}, m = "invokeSuspend", n = {}, s = {})
public final class o000OOo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f60511OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<RoomMemberTaskInfoModel> f60512OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oOO000o f60513OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(oOO000o ooo000o, OooO0O0<RoomMemberTaskInfoModel> oooO0O0, Continuation<? super o000OOo0> continuation) {
        super(2, continuation);
        this.f60513OooO0o0 = ooo000o;
        this.f60512OooO0o = oooO0O0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000OOo0(this.f60513OooO0o0, this.f60512OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000OOo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f60511OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f60513OooO0o0.f56381OooOOO0.f37663OooO0Oo.size() > 0) {
                this.f60511OooO0Oo = 1;
                if (DelayKt.delay(500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.f60512OooO0o.OooO0Oo();
        return Unit.INSTANCE;
    }
}
