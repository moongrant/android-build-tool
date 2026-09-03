package p485o0o000oO;

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
import p475o0Ooooo0.o0O00oO0;
import p483o0o000Oo.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseApplyMicOpenMessage$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o000O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomMike.MicApplySwitchOpenReply f48667OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(RoomMike.MicApplySwitchOpenReply micApplySwitchOpenReply, Continuation<? super o000O0> continuation) {
        super(2, continuation);
        this.f48667OooO0Oo = micApplySwitchOpenReply;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O0(this.f48667OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o0000oo o0000ooVar = OooO00o.f24517OooO0oO;
        RoomMike.MicApplySwitchOpenReply micApplySwitchOpenReply = this.f48667OooO0Oo;
        o0000ooVar.f48586OooOO0o.setValue(Boolean.valueOf(o000000.OooO00o(Boxing.boxInt(micApplySwitchOpenReply.getStatus()))));
        long userId = micApplySwitchOpenReply.getWho().getUserId();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        MutableState<Boolean> mutableState = o0000ooVar.f48589OooOOOO;
        if (l != null && userId == l.longValue()) {
            o000O00.OooO0O0(o0000.OooO0OO(o0000ooVar.OooOO0() ? p562o0oOo000.o000000.turned_on_apply_mic : p562o0oOo000.o000000.apply_mic_is_turned_off));
        } else if (!o0000ooVar.OooOO0() && mutableState.getValue().booleanValue()) {
            o0000ooVar.f48592OooOOo0.setValue(Boxing.boxBoolean(true));
        }
        if (!o0000ooVar.OooOO0()) {
            mutableState.setValue(Boxing.boxBoolean(false));
            o0000ooVar.f48591OooOOo.clear();
            o0000ooVar.OooOOO(0);
            o0000ooVar.OooOOOO("");
            o0000ooVar.f48587OooOOO.setValue(Boolean.FALSE);
        }
        RoomUserInfoModel.Companion companion = RoomUserInfoModel.INSTANCE;
        Room.UserModel who = micApplySwitchOpenReply.getWho();
        Intrinsics.checkNotNullExpressionValue(who, "getWho(...)");
        RoomUserInfoModel userInfoModel = companion.of(who);
        boolean zOooOO0 = o0000ooVar.OooOO0();
        Intrinsics.checkNotNullParameter(userInfoModel, "userInfoModel");
        ChatModel chatModel = new ChatModel();
        chatModel.setType(32);
        chatModel.setApplyMicSwitchModel(new ChatModel.ApplyMicSwitchModel(userInfoModel, zOooOO0));
        MixedRoomDataSource.OooO0o0().OooO00o(chatModel);
        return Unit.INSTANCE;
    }
}
