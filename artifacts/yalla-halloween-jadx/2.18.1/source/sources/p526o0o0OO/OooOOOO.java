package p526o0o0OO;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.app.base.application.App;
import com.app.base.protobuf.MessageIM;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0O0;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.db.table.FriendRequestMessage;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.OooO00o;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO.o0000O;
import p168o00Ooo0.o0ooOOo;
import p254o00ooO0O.o000O0O0;
import p491o0o00O00.OooO0OO;
import p498o0o00Oo0.OooOOO;
import p520o0o0O0O0.oo0O;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.service.im.processor.IMFriendRequestMsgProcessor$parseFriendRequest$1", f = "IMFriendRequestMsgProcessor.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
public final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f43109Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f43110Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ MessageIM.Message2111 f43111Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ MessageIM.Message f43112Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(MessageIM.Message2111 message2111, MessageIM.Message message, OooOo00 oooOo00, Continuation<? super OooOOOO> continuation) {
        super(2, continuation);
        this.f43111Oooo0oO = message2111;
        this.f43112Oooo0oo = message;
        this.f43109Oooo = oooOo00;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOOOO(this.f43111Oooo0oO, this.f43112Oooo0oo, this.f43109Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f43110Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            oo0O oo0o = oo0O.f42896OooO00o;
            long fromId = this.f43111Oooo0oO.getFromId();
            this.f43110Oooo0o = 1;
            obj = oo0o.OooOO0O(fromId, this);
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
        message.setUid(((Number) OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue());
        message.setTargetUserId(this.f43111Oooo0oO.getFromId());
        message.setMid(this.f43112Oooo0oo.getMid());
        message.setMessage(this.f43111Oooo0oO.getMsg());
        message.setTime(this.f43112Oooo0oo.getTime());
        Intrinsics.checkNotNullParameter(message, "message");
        OooO0OO.OooO00o().OooOo0().OooO0oo(message);
        Activity activityOooO0O0 = OooO0O0.f20502OooO00o.OooO0O0();
        if (activityOooO0O0 == null) {
            return Unit.INSTANCE;
        }
        if (!this.f43109Oooo.OooO00o() && !(activityOooO0O0 instanceof FriendRequestMessageActivity) && !App.f11457Oooo0o) {
            String strOooO0OO = o000O0O0.OooO0OO(R.string.Notice_friend_request);
            String strOooO00o = OooOo.OooO00o(o000O0O0.OooO0OO(R.string.Notice_friend_request_tip), this.f43111Oooo0oO.getNickName());
            String msg = this.f43111Oooo0oO.getMsg();
            Context context = o0000O.f2657OooO00o;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                context = null;
            }
            o0ooOOo.OooO0OO("Yalla_Notice_FriendRequest", strOooO0OO, strOooO00o, msg, new Intent(context, (Class<?>) FriendRequestMessageActivity.class));
        }
        return Unit.INSTANCE;
    }
}
