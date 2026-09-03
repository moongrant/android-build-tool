package p533o0o0OOOo;

import com.app.base.model.ChatModel;
import com.app.base.protobuf.room.Room;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.RoomUserInfoModel;
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
import p159o00OoOO.o000O00O;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000Oo0;
import p254o00ooO0O.o00oOoo;
import p498o0o00Oo0.OooOOO;
import p530o0o0OOO.o00O;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseApplyMicOpenMessage$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oO0OoOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Room.MicApplySwitchOpenReply f43505Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oO000o00 f43506Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OoOO0(Room.MicApplySwitchOpenReply micApplySwitchOpenReply, oO000o00 oo000o00, Continuation<? super oO0OoOO0> continuation) {
        super(2, continuation);
        this.f43505Oooo0o = micApplySwitchOpenReply;
        this.f43506Oooo0oO = oo000o00;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO0OoOO0(this.f43505Oooo0o, this.f43506Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO0OoOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
        o00O.OooO0o.f43220OooO0o.setValue(Boolean.valueOf(o000Oo0.OooO00o(Boxing.boxInt(this.f43505Oooo0o.getStatus()))));
        long userId = this.f43505Oooo0o.getWho().getUserId();
        Long value = OooOOO.f41216OooO00o.OooOo().getValue();
        if (value != null && userId == value.longValue()) {
            o00oOoo.OooO0O0(o000O0O0.OooO0OO(oooO0o.OooO0Oo() ? R.string.turned_on_apply_mic : R.string.apply_mic_is_turned_off));
        } else if (!oooO0o.OooO0Oo() && o00O.OooO0o.f43215OooO.getValue().booleanValue()) {
            o00O.OooO0o.f43225OooOO0O.setValue(Boxing.boxBoolean(true));
        }
        if (!oooO0o.OooO0Oo()) {
            o00O.OooO0o.f43215OooO.setValue(Boxing.boxBoolean(false));
            o00O.OooO0o.f43226OooOO0o.clear();
            oooO0o.OooO0oO(0);
            oooO0o.OooO0oo("");
            oooO0o.OooO(false);
        }
        if (this.f43506Oooo0oO.f43481OooO00o != null) {
            RoomUserInfoModel.Companion companion = RoomUserInfoModel.INSTANCE;
            Room.UserModel who = this.f43505Oooo0o.getWho();
            Intrinsics.checkNotNullExpressionValue(who, "reply.who");
            RoomUserInfoModel userInfoModel = companion.of(who);
            boolean zOooO0Oo = oooO0o.OooO0Oo();
            Intrinsics.checkNotNullParameter(userInfoModel, "userInfoModel");
            ChatModel chatModel = new ChatModel();
            chatModel.type = 32;
            chatModel.applyMicSwitchModel = new ChatModel.ApplyMicSwitchModel(userInfoModel, zOooO0Oo);
            o000O00O.OooO().OooO00o(chatModel);
        }
        return Unit.INSTANCE;
    }
}
