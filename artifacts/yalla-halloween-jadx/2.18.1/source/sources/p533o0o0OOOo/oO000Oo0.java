package p533o0o0OOOo;

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
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00oOoo;
import p498o0o00Oo0.OooOOO;
import p530o0o0OOO.o00O;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.processor.RoomMicMsgProcessor$parseInviteUpMicMessage$1", f = "RoomMicMsgProcessor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oO000Oo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Room.MicInviteFromApplyReply f43480Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000Oo0(Room.MicInviteFromApplyReply micInviteFromApplyReply, Continuation<? super oO000Oo0> continuation) {
        super(2, continuation);
        this.f43480Oooo0o = micInviteFromApplyReply;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO000Oo0(this.f43480Oooo0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO000Oo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        long userId = this.f43480Oooo0o.getInviter().getUserId();
        Long value = OooOOO.f41216OooO00o.OooOo().getValue();
        if (value == null || userId != value.longValue()) {
            o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
            RoomUserInfoModel.Companion companion = RoomUserInfoModel.INSTANCE;
            Room.UserModel inviter = this.f43480Oooo0o.getInviter();
            Intrinsics.checkNotNullExpressionValue(inviter, "reply.inviter");
            o00O.OooO0o.f43219OooO0Oo.setValue(companion.of(inviter));
            o00O.OooO0o.f43221OooO0o0.setValue(Boolean.valueOf(this.f43480Oooo0o.getFromApplyMicList()));
            o00O.OooO0o.f43218OooO0OO.setValue(Boxing.boxBoolean(true));
            OooOo.OooO0O0("202025");
        } else if (this.f43480Oooo0o.getTargetRole() == 2 || this.f43480Oooo0o.getTargetRole() == 0) {
            o00oOoo.OooO0O0(o000O0O0.OooO0OO(R.string.Invitation_has_been_sent));
        }
        return Unit.INSTANCE;
    }
}
