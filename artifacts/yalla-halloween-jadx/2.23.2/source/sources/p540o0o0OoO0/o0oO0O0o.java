package p540o0o0OoO0;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p107o000ooO0.OooOOOO;
import p581o0oOoo.o0000O0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskDialog$OnDialog$2$2$3$1", f = "LiveRoomMemberTaskDialog.kt", i = {}, l = {208}, m = "invokeSuspend", n = {}, s = {})
public final class o0oO0O0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f54875OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<RoomMemberTaskInfoModel> f54876OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0000O0 f54877OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0O0o(o0000O0 o0000o1, OooOOOO<RoomMemberTaskInfoModel> oooOOOO, Continuation<? super o0oO0O0o> continuation) {
        super(2, continuation);
        this.f54877OooO0o0 = o0000o1;
        this.f54876OooO0o = oooOOOO;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0oO0O0o(this.f54877OooO0o0, this.f54876OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0oO0O0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f54875OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f54877OooO0o0.f56585OooOOO0.f38497OooO0Oo.size() > 0) {
                this.f54875OooO0Oo = 1;
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
        this.f54876OooO0o.OooO0Oo();
        return Unit.INSTANCE;
    }
}
