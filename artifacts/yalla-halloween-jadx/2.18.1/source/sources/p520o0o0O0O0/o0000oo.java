package p520o0o0O0O0;

import OooO00o.OooO00o;
import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.MessageIM;
import com.google.protobuf.InvalidProtocolBufferException;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.common.model.ImResult;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o0ooOOo;
import p168o00Ooo0.oo000o;
import p391o0OOooOo.o0O00000;
import p515o0o0O00.o00O00;
import p528o0o0OO0O.o000O;
import p528o0o0OO0O.o000OO00;
import p531o0o0OOO0.o00O000;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendTextMessage$1$1", f = "ImMessageRepo.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
public final class o0000oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f42438Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f42439Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f42440Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000oo(ChatMessage chatMessage, MutableLiveData<Boolean> mutableLiveData, Continuation<? super o0000oo> continuation) {
        super(2, continuation);
        this.f42439Oooo0oO = chatMessage;
        this.f42440Oooo0oo = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0000oo(this.f42439Oooo0oO, this.f42440Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0000oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws InvalidProtocolBufferException, BadPaddingException, IllegalBlockSizeException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f42438Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00O00.OooO0OO("sendTextMessage", "send mid = " + this.f42439Oooo0oO.getMid() + " msg = " + this.f42439Oooo0oO);
            long targetId = this.f42439Oooo0oO.getTargetId();
            String mid = this.f42439Oooo0oO.getMid();
            String message = this.f42439Oooo0oO.getMessage();
            this.f42438Oooo0o = 1;
            MessageIM.SayRequest.Builder mRequestBuilder = MessageIM.SayRequest.newBuilder();
            mRequestBuilder.setToId(targetId);
            mRequestBuilder.setMid(mid);
            mRequestBuilder.setMessage(message);
            o00O000 o00o001 = o00O000.f43398OooO00o;
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            String str = o0ooOOo.f32220OooO0OO;
            Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
            obj = o00o001.OooO0O0(str, mRequestBuilder, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ImResult imResult = (ImResult) obj;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("receive mid = ");
        sbOooO0o0.append(this.f42439Oooo0oO.getMid());
        sbOooO0o0.append(" body = ");
        sbOooO0o0.append(imResult.getBody() != null);
        sbOooO0o0.append(" code = ");
        sbOooO0o0.append(imResult.getCode());
        sbOooO0o0.append(" msg = ");
        sbOooO0o0.append(this.f42439Oooo0oO);
        o00O00.OooO0OO("sendTextMessage", sbOooO0o0.toString());
        if (imResult.getBody() != null) {
            MessageIM.SayReply from = MessageIM.SayReply.parseFrom(imResult.getBody());
            if (from != null) {
                ChatMessage chatMessage = this.f42439Oooo0oO;
                MutableLiveData<Boolean> mutableLiveData = this.f42440Oooo0oo;
                oo0O.OooO00o.OooO00o().OooO00o(from.getTime());
                o0O00000.OooO0o0("Message_send_success", String.valueOf(oo000o.OooO0O0()));
                o0OOO0o.f42810OooO00o.OooO0oO(chatMessage.getMid(), true);
                mutableLiveData.postValue(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
        } else {
            o000O error = new o000O(imResult.getCode());
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000OO00(error, null), 3, null);
        }
        o0OOO0o.f42810OooO00o.OooO0oO(this.f42439Oooo0oO.getMid(), false);
        this.f42440Oooo0oo.postValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
