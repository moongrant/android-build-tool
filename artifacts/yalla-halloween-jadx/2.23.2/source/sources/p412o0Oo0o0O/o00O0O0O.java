package p412o0Oo0o0O;

import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.MessageIM;
import com.google.protobuf.InvalidProtocolBufferException;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.model.ImResult;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
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
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p384o0OOoo0O.Oooo0;
import p391o0OOooo0.o0ooOOo;
import p479o0o0000o.o000O000;
import p480o0o000O.OooOO0;
import p595o0oo00O.OooOo00;
import p641o0ooOO0o.o0OoO00O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendTextMessage$1$1", f = "ImMessageRepo.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
public final class o00O0O0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f46096OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f46097OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f46098OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0O(ChatMessage chatMessage, MutableLiveData<Boolean> mutableLiveData, Continuation<? super o00O0O0O> continuation) {
        super(2, continuation);
        this.f46098OooO0o0 = chatMessage;
        this.f46097OooO0o = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O0O0O(this.f46098OooO0o0, this.f46097OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O0O0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws InvalidProtocolBufferException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46096OooO0Oo;
        ChatMessage chatMessage = this.f46098OooO0o0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long targetId = chatMessage.getTargetId();
            String mid = chatMessage.getMid();
            String message = chatMessage.getMessage();
            this.f46096OooO0Oo = 1;
            MessageIM.SayRequest.Builder builderNewBuilder = MessageIM.SayRequest.newBuilder();
            builderNewBuilder.setToId(targetId);
            builderNewBuilder.setMid(mid);
            builderNewBuilder.setMessage(message);
            o0OoO00O o0ooo00o2 = OooOO0.f48392OooO00o;
            String str = Oooo0.f43334OooO0O0;
            Intrinsics.checkNotNull(builderNewBuilder);
            obj = OooOO0.OooO0O0(str, builderNewBuilder, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ImResult error = (ImResult) obj;
        boolean zIsSuccess = error.isSuccess();
        MutableLiveData<Boolean> mutableLiveData = this.f46097OooO0o;
        if (zIsSuccess) {
            MessageIM.SayReply from = MessageIM.SayReply.parseFrom(error.getBody());
            if (from != null) {
                o0ooOOo.OooO00o().OooO00o(from.getTime());
                OooO00o.OooO0OO("204011", MapsKt.mapOf(new Pair("region", String.valueOf(OooOo00.OooO0OO()))));
                o000OO00.OooOO0(chatMessage.getMid(), true);
                mutableLiveData.postValue(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000O000(error, null), 3, null);
        }
        o000OO00.OooOO0(chatMessage.getMid(), false);
        mutableLiveData.postValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
