package p477o0o000O;

import com.app.base.protobuf.room.RoomMike;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.service.room.OooO00o;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p475o0o000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseAllowManagerOpenApplyMicMessage$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomMike.AllowAdminOpenMicApplyReply f47607OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(RoomMike.AllowAdminOpenMicApplyReply allowAdminOpenMicApplyReply, Continuation<? super OooOOO> continuation) {
        super(2, continuation);
        this.f47607OooO0Oo = allowAdminOpenMicApplyReply;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOOO(this.f47607OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o000000 o000000Var = OooO00o.f24979OooO0oO;
        RoomMike.AllowAdminOpenMicApplyReply allowAdminOpenMicApplyReply = this.f47607OooO0Oo;
        o000000Var.f47383OooOOO0.setValue(Boolean.valueOf(com.code.android.util.o000000.OooO00o(Boxing.boxInt(allowAdminOpenMicApplyReply.getStatus()))));
        LiveEventBus.get("ALLOW_ROOM_MANAGER_OPEN_APPLY_MIC").post(Boxing.boxBoolean(com.code.android.util.o000000.OooO00o(Boxing.boxInt(allowAdminOpenMicApplyReply.getStatus()))));
        return Unit.INSTANCE;
    }
}
