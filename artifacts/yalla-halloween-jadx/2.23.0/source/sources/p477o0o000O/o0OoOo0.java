package p477o0o000O;

import com.app.base.protobuf.room.Room;
import com.app.base.protobuf.room.RoomMike;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
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
import p464o0Oooo.o000000O;
import p475o0o000.o000000;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseInviteUpMicMessage$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o0OoOo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomMike.MicInviteFromApplyReply f47625OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(RoomMike.MicInviteFromApplyReply micInviteFromApplyReply, Continuation<? super o0OoOo0> continuation) {
        super(2, continuation);
        this.f47625OooO0Oo = micInviteFromApplyReply;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0OoOo0(this.f47625OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0OoOo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        RoomMike.MicInviteFromApplyReply micInviteFromApplyReply = this.f47625OooO0Oo;
        long userId = micInviteFromApplyReply.getInviter().getUserId();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        if (l == null || userId != l.longValue()) {
            o000000 o000000Var = OooO00o.f24979OooO0oO;
            RoomUserInfoModel.Companion companion = RoomUserInfoModel.INSTANCE;
            Room.UserModel inviter = micInviteFromApplyReply.getInviter();
            Intrinsics.checkNotNullExpressionValue(inviter, "reply.inviter");
            o000000Var.f47375OooO0o.setValue(new Pair(companion.of(inviter), Boxing.boxBoolean(micInviteFromApplyReply.getFromApplyMicList())));
            o000000Var.f47376OooO0o0.setValue(Boxing.boxBoolean(true));
            o0OO000.OooO00o("202025");
        } else if (micInviteFromApplyReply.getTargetRole() == 2 || micInviteFromApplyReply.getTargetRole() == 0) {
            o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.Invitation_has_been_sent));
        }
        return Unit.INSTANCE;
    }
}
