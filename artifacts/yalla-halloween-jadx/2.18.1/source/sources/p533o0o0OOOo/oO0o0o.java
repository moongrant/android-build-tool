package p533o0o0OOOo;

import com.app.base.protobuf.room.Room;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.List;
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
import p047Oooooo0.o00OO0OO;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseApplyMicListMessage$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oO0o0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ List<Long> f43508Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Room.MicApplyListReply f43509Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0o0o(List<Long> list, Room.MicApplyListReply micApplyListReply, Continuation<? super oO0o0o> continuation) {
        super(2, continuation);
        this.f43508Oooo0o = list;
        this.f43509Oooo0oO = micApplyListReply;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO0o0o(this.f43508Oooo0o, this.f43509Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO0o0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String userHeader;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
        o00OO0OO<Long> o00oo0oo = o00O.OooO0o.f43226OooOO0o;
        o00oo0oo.clear();
        o00oo0oo.addAll(this.f43508Oooo0o);
        if (this.f43509Oooo0oO.getListEmpty()) {
            oooO0o.OooO0oO(0);
        } else {
            oooO0o.OooO0oO(this.f43509Oooo0oO.getUsersCount());
            o00O o00o2 = o00O.f43140OooO00o;
            List<Long> list = this.f43508Oooo0o;
            RoomUserInfoModel roomUserInfoModelOooOO0 = o00o2.OooOO0(list.get(list.size() - 1).longValue());
            if (roomUserInfoModelOooOO0 == null || (userHeader = roomUserInfoModelOooOO0.getUserHeader()) == null) {
                userHeader = "";
            }
            oooO0o.OooO0oo(userHeader);
        }
        LiveEventBus.get("REFRESH_APPLY_MIC_LIST").post(Boxing.boxBoolean(true));
        return Unit.INSTANCE;
    }
}
