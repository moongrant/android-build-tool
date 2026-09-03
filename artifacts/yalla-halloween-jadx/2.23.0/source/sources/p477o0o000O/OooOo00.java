package p477o0o000O;

import androidx.compose.runtime.MutableState;
import com.app.base.protobuf.room.Room;
import com.app.base.protobuf.room.RoomMike;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
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
import p464o0Oooo.o000000O;
import p475o0o000.o000000;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseApplyMicOpenMessage$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OooOo00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomMike.MicApplySwitchOpenReply f47613OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(RoomMike.MicApplySwitchOpenReply micApplySwitchOpenReply, Continuation<? super OooOo00> continuation) {
        super(2, continuation);
        this.f47613OooO0Oo = micApplySwitchOpenReply;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOo00(this.f47613OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOo00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o000000 o000000Var = OooO00o.f24979OooO0oO;
        RoomMike.MicApplySwitchOpenReply micApplySwitchOpenReply = this.f47613OooO0Oo;
        o000000Var.f47381OooOO0o.setValue(Boolean.valueOf(com.code.android.util.o000000.OooO00o(Boxing.boxInt(micApplySwitchOpenReply.getStatus()))));
        long userId = micApplySwitchOpenReply.getWho().getUserId();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        MutableState<Boolean> mutableState = o000000Var.f47384OooOOOO;
        if (l != null && userId == l.longValue()) {
            o000O00O.OooO0O0(o0000.OooO0OO(o000000Var.OooOO0() ? oO00OOo0.turned_on_apply_mic : oO00OOo0.apply_mic_is_turned_off));
        } else if (!o000000Var.OooOO0() && mutableState.getValue().booleanValue()) {
            o000000Var.f47387OooOOo0.setValue(Boxing.boxBoolean(true));
        }
        if (!o000000Var.OooOO0()) {
            mutableState.setValue(Boxing.boxBoolean(false));
            o000000Var.f47386OooOOo.clear();
            o000000Var.OooOOO(0);
            o000000Var.OooOOOO("");
            o000000Var.f47382OooOOO.setValue(Boolean.FALSE);
        }
        RoomUserInfoModel.Companion companion = RoomUserInfoModel.INSTANCE;
        Room.UserModel who = micApplySwitchOpenReply.getWho();
        Intrinsics.checkNotNullExpressionValue(who, "reply.who");
        RoomUserInfoModel userInfoModel = companion.of(who);
        boolean zOooOO0 = o000000Var.OooOO0();
        Intrinsics.checkNotNullParameter(userInfoModel, "userInfoModel");
        ChatModel chatModel = new ChatModel();
        chatModel.setType(32);
        chatModel.setApplyMicSwitchModel(new ChatModel.ApplyMicSwitchModel(userInfoModel, zOooOO0));
        MixedRoomDataSource.OooO0o0().OooO00o(chatModel);
        return Unit.INSTANCE;
    }
}
