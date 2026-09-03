package p485o0o000Oo;

import androidx.compose.runtime.MutableState;
import com.app.base.protobuf.room.Room;
import com.app.base.protobuf.room.RoomMike;
import com.code.android.util.o0000;
import com.code.android.util.o000000;
import com.code.android.util.o000O00;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
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
import p474o0OoooOO.oo0oO0;
import p482o0o000O.o00oO0o;
import p565o0oOo000.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseApplyMicOpenMessage$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oo000o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomMike.MicApplySwitchOpenReply f48663OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(RoomMike.MicApplySwitchOpenReply micApplySwitchOpenReply, Continuation<? super oo000o> continuation) {
        super(2, continuation);
        this.f48663OooO0Oo = micApplySwitchOpenReply;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oo000o(this.f48663OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oo000o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o00oO0o o00oo0o2 = OooO00o.f24525OooO0oO;
        RoomMike.MicApplySwitchOpenReply micApplySwitchOpenReply = this.f48663OooO0Oo;
        o00oo0o2.f48537OooOO0o.setValue(Boolean.valueOf(o000000.OooO00o(Boxing.boxInt(micApplySwitchOpenReply.getStatus()))));
        long userId = micApplySwitchOpenReply.getWho().getUserId();
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        Long l = (Long) oo0oO0.OooOOo0().getValue();
        MutableState<Boolean> mutableState = o00oo0o2.f48540OooOOOO;
        if (l != null && userId == l.longValue()) {
            o000O00.OooO0O0(o0000.OooO0OO(o00oo0o2.OooOO0() ? o000OOo.turned_on_apply_mic : o000OOo.apply_mic_is_turned_off));
        } else if (!o00oo0o2.OooOO0() && mutableState.getValue().booleanValue()) {
            o00oo0o2.f48543OooOOo0.setValue(Boxing.boxBoolean(true));
        }
        if (!o00oo0o2.OooOO0()) {
            mutableState.setValue(Boxing.boxBoolean(false));
            o00oo0o2.f48542OooOOo.clear();
            o00oo0o2.OooOOO(0);
            o00oo0o2.OooOOOO("");
            o00oo0o2.f48538OooOOO.setValue(Boolean.FALSE);
        }
        RoomUserInfoModel.Companion companion = RoomUserInfoModel.INSTANCE;
        Room.UserModel who = micApplySwitchOpenReply.getWho();
        Intrinsics.checkNotNullExpressionValue(who, "getWho(...)");
        RoomUserInfoModel userInfoModel = companion.of(who);
        boolean zOooOO0 = o00oo0o2.OooOO0();
        Intrinsics.checkNotNullParameter(userInfoModel, "userInfoModel");
        ChatModel chatModel = new ChatModel();
        chatModel.setType(32);
        chatModel.setApplyMicSwitchModel(new ChatModel.ApplyMicSwitchModel(userInfoModel, zOooOO0));
        MixedRoomDataSource.OooO0o0().OooO00o(chatModel);
        return Unit.INSTANCE;
    }
}
