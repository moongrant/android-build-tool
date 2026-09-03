package p485o0o000oO;

import com.app.base.protobuf.room.Room;
import com.app.base.protobuf.room.RoomMike;
import com.code.android.util.o0000;
import com.code.android.util.o000O00;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import kotlin.Pair;
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
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseInviteUpMicMessage$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o000OO00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomMike.MicInviteFromApplyReply f48678OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(RoomMike.MicInviteFromApplyReply micInviteFromApplyReply, Continuation<? super o000OO00> continuation) {
        super(2, continuation);
        this.f48678OooO0Oo = micInviteFromApplyReply;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000OO00(this.f48678OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000OO00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        RoomMike.MicInviteFromApplyReply micInviteFromApplyReply = this.f48678OooO0Oo;
        long userId = micInviteFromApplyReply.getInviter().getUserId();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        if (l == null || userId != l.longValue()) {
            o0000oo o0000ooVar = OooO00o.f24517OooO0oO;
            RoomUserInfoModel.Companion companion = RoomUserInfoModel.INSTANCE;
            Room.UserModel inviter = micInviteFromApplyReply.getInviter();
            Intrinsics.checkNotNullExpressionValue(inviter, "getInviter(...)");
            o0000ooVar.f48580OooO0o.setValue(new Pair(companion.of(inviter), Boxing.boxBoolean(micInviteFromApplyReply.getFromApplyMicList())));
            o0000ooVar.f48581OooO0o0.setValue(Boxing.boxBoolean(true));
            o0oo0000.OooO00o.OooO0O0("202025");
        } else if (micInviteFromApplyReply.getTargetRole() == 2 || micInviteFromApplyReply.getTargetRole() == 0) {
            o000O00.OooO0O0(o0000.OooO0OO(o000000.Invitation_has_been_sent));
        }
        return Unit.INSTANCE;
    }
}
