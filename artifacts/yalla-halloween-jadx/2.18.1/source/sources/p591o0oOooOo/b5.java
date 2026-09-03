package p591o0oOooOo;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.SquareEventRoomModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p490o0o00O0.o0OOO0o;
import p491o0o00O00.OooO0OO;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.screen.event.EventRoomPreviewScreen$updateSquareEventRoom$1", f = "EventRoomPreviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class b5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SquareEventRoomModel f47199Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(SquareEventRoomModel squareEventRoomModel, Continuation<? super b5> continuation) {
        super(2, continuation);
        this.f47199Oooo0o = squareEventRoomModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b5(this.f47199Oooo0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        long userId = this.f47199Oooo0o.getUserId();
        long roomId = this.f47199Oooo0o.getRoomId();
        long eventCreateTime = this.f47199Oooo0o.getEventCreateTime();
        o0OOO0o o0ooo0oOooOo = OooO0OO.OooO00o().OooOo();
        Intrinsics.checkNotNullExpressionValue(o0ooo0oOooOo, "DB.squareEventRoomDao");
        Long value = OooOOO.f41216OooO00o.OooOo().getValue();
        o0ooo0oOooOo.OooO0OO(value == null ? 0L : value.longValue(), userId, roomId, eventCreateTime);
        LiveEventBus.get("UPDATE_SQUARE_EVENT_ROOM").post(Boxing.boxLong(this.f47199Oooo0o.getRoomId()));
        return Unit.INSTANCE;
    }
}
