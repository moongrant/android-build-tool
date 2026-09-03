package p406o0Oo0Ooo;

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
import o0O.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o0000O;
import p471o0Ooooo.o0O00OO;
import p542o0o0o00O.o000oOoO;
import p587o0oOooo.o0OO000;
import p591o0oo000O.OooO;
import p634o0ooO0oO.o00OOOO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendVoiceMessage$1$1", f = "ImMessageRepo.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
public final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f44748OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f44749OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f44750OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ChatMessage chatMessage, MutableLiveData<Boolean> mutableLiveData, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f44750OooO0o0 = chatMessage;
        this.f44749OooO0o = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new c(this.f44750OooO0o0, this.f44749OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws InvalidProtocolBufferException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f44748OooO0Oo;
        MutableLiveData<Boolean> mutableLiveData = this.f44749OooO0o;
        ChatMessage chatMessage = this.f44750OooO0o0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (chatMessage.getVoiceInfo() == null) {
                mutableLiveData.postValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            ChatMessage.VoiceInfo voiceInfo = chatMessage.getVoiceInfo();
            Intrinsics.checkNotNull(voiceInfo);
            long targetId = chatMessage.getTargetId();
            String mid = chatMessage.getMid();
            String voiceUrl = voiceInfo.getVoiceUrl();
            long voiceDuration = voiceInfo.getVoiceDuration();
            this.f44748OooO0Oo = 1;
            MessageIM.SendVoiceRequest.Builder mRequestBuilder = MessageIM.SendVoiceRequest.newBuilder();
            mRequestBuilder.setToId(targetId);
            mRequestBuilder.setUrl(voiceUrl);
            mRequestBuilder.setMid(mid);
            mRequestBuilder.setDuration((int) voiceDuration);
            o00OOOO0 o00oooo1 = o000oOoO.f55784OooO00o;
            String str = o0000O.f44073OooO;
            Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
            obj = o000oOoO.OooO0O0(str, mRequestBuilder, this);
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
        if (error.isSuccess()) {
            MessageIM.SendVoiceReply from = MessageIM.SendVoiceReply.parseFrom(error.getBody());
            if (from != null) {
                OooO0O0.OooO0Oo().OooO00o(from.getTime());
                o0OO000.OooO0O0("204011", MapsKt.mapOf(new Pair("region", String.valueOf(OooO.OooO0OO()))));
                oOOO00Oo.OooOO0(chatMessage.getMid(), true);
                mutableLiveData.postValue(Boxing.boxBoolean(true));
                return Unit.INSTANCE;
            }
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O00OO(error, null), 3, null);
        }
        oOOO00Oo.OooOO0(chatMessage.getMid(), false);
        mutableLiveData.postValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
