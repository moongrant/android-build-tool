package p533o0o0OOOo;

import com.app.base.protobuf.room.Room;
import com.jeremyliao.liveeventbus.LiveEventBus;
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
import p254o00ooO0O.o000Oo0;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseAllowManagerOpenApplyMicMessage$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oO0Ooooo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Room.AllowAdminOpenMicApplyReply f43507Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Ooooo(Room.AllowAdminOpenMicApplyReply allowAdminOpenMicApplyReply, Continuation<? super oO0Ooooo> continuation) {
        super(2, continuation);
        this.f43507Oooo0o = allowAdminOpenMicApplyReply;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO0Ooooo(this.f43507Oooo0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO0Ooooo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
        o00O.OooO0o.f43222OooO0oO.setValue(Boolean.valueOf(o000Oo0.OooO00o(Boxing.boxInt(this.f43507Oooo0o.getStatus()))));
        LiveEventBus.get("ALLOW_ROOM_MANAGER_OPEN_APPLY_MIC").post(Boxing.boxBoolean(o000Oo0.OooO00o(Boxing.boxInt(this.f43507Oooo0o.getStatus()))));
        return Unit.INSTANCE;
    }
}
