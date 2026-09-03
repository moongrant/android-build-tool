package p485o0o000oO;

import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.model.InOutRoomModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomIntoMsgProcessor$parseInOrOutRoomMessage$1", f = "RoomIntoMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o000Oo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ InOutRoomModel f48681OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(InOutRoomModel inOutRoomModel, Continuation<? super o000Oo0> continuation) {
        super(2, continuation);
        this.f48681OooO0Oo = inOutRoomModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000Oo0(this.f48681OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000Oo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        RoomUserInfoModel newUser;
        MutableStateFlow<Long> userId;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InOutRoomModel inOutRoomModel = this.f48681OooO0Oo;
        Long value = (inOutRoomModel == null || (newUser = inOutRoomModel.getNewUser()) == null || (userId = newUser.getUserId()) == null) ? null : userId.getValue();
        ArrayList arrayList = OooO00o.f24511OooO00o;
        RoomUserInfoModel roomUserInfoModelOooO0o0 = OooO00o.OooO0o0(value);
        if ((inOutRoomModel != null && inOutRoomModel.getKind() == 0) && roomUserInfoModelOooO0o0 != null) {
            MixedRoomDataSource.OooO0o0().OooOOOO(33002, roomUserInfoModelOooO0o0);
        }
        return Unit.INSTANCE;
    }
}
