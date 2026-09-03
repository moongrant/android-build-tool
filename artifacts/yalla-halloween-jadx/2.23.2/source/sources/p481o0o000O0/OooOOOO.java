package p481o0o000O0;

import android.app.Activity;
import android.content.Intent;
import com.app.base.protobuf.MessageIM;
import com.code.android.util.OooO0O0;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00O;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.common.manager.OooO00o;
import com.yalla.yalla.data.db.table.FriendRequestMessage;
import com.yalla.yalla.data.repository.UserInfoRepo;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p590o0oOooo0.g0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.im.processor.IMFriendRequestMsgProcessor$parseFriendRequest$1", f = "IMFriendRequestMsgProcessor.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
public final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f48418OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MessageIM.Message f48419OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MessageIM.Message2111 f48420OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f48421OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(MessageIM.Message2111 message2111, MessageIM.Message message, OooOo00 oooOo00, Continuation<? super OooOOOO> continuation) {
        super(2, continuation);
        this.f48420OooO0o0 = message2111;
        this.f48419OooO0o = message;
        this.f48421OooO0oO = oooOo00;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOOOO(this.f48420OooO0o0, this.f48419OooO0o, this.f48421OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f48418OooO0Oo;
        MessageIM.Message2111 message2111 = this.f48420OooO0o0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UserInfoRepo userInfoRepo = UserInfoRepo.f22735OooO00o;
            long fromId = message2111.getFromId();
            this.f48418OooO0Oo = 1;
            obj = userInfoRepo.OooO0oo(fromId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ApiResult apiResult = (ApiResult) obj;
        if (apiResult.getCode() == 1057 || apiResult.getCode() == 1058) {
            return Unit.INSTANCE;
        }
        FriendRequestMessage message = new FriendRequestMessage();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        message.setUid(((Number) OooO00o.OooO00o()).longValue());
        message.setTargetUserId(message2111.getFromId());
        MessageIM.Message message2 = this.f48419OooO0o;
        message.setMid(message2.getMid());
        message.setMessage(message2111.getMsg());
        message.setTime(message2.getTime());
        Intrinsics.checkNotNullParameter(message, "message");
        o00Oo0.OooO00o().OooOo00().OooOO0(message);
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 == null) {
            return Unit.INSTANCE;
        }
        this.f48421OooO0oO.getClass();
        if (!OooOo.OooO00o() && !(activityOooO0O0 instanceof FriendRequestMessageActivity) && !App.f22233OooO0o0) {
            g0.OooO0O0("Yalla_Notice_FriendRequest", o0000.OooO0OO(o000000.Friend_Request), o0000O.OooO00o(o0000.OooO0OO(o000000.Notice_friend_request_tip), message2111.getNickName()), message2111.getMsg(), new Intent(o000O00O.OooO00o(), (Class<?>) FriendRequestMessageActivity.class));
        }
        return Unit.INSTANCE;
    }
}
