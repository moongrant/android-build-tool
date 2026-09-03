package p406o0Oo0Ooo;

import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.MessageIM;
import com.google.protobuf.InvalidProtocolBufferException;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.model.ImResult;
import java.util.List;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o0000O;
import p464o0Oooo.o000000O;
import p471o0Ooooo.o0O00OO;
import p542o0o0o00O.o000oOoO;
import p581o0oOoo00.o000OOo;
import p587o0oOooo.o0OO000;
import p591o0oo000O.OooO;
import p634o0ooO0oO.o00OOOO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendEmotionMessage$1$1", f = "ImMessageRepo.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
public final class oOOO0OO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f45017OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f45018OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f45019OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO0OO0(ChatMessage chatMessage, MutableLiveData<Boolean> mutableLiveData, Continuation<? super oOOO0OO0> continuation) {
        super(2, continuation);
        this.f45019OooO0o0 = chatMessage;
        this.f45018OooO0o = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oOOO0OO0(this.f45019OooO0o0, this.f45018OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oOOO0OO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws InvalidProtocolBufferException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45017OooO0Oo;
        MutableLiveData<Boolean> mutableLiveData = this.f45018OooO0o;
        ChatMessage chatMessage = this.f45019OooO0o0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (chatMessage.getEmoticonInfo() == null) {
                mutableLiveData.postValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            ChatMessage.EmoticonInfo emoticonInfo = chatMessage.getEmoticonInfo();
            Intrinsics.checkNotNull(emoticonInfo);
            long targetId = chatMessage.getTargetId();
            int emoticonType = emoticonInfo.getEmoticonType();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            String strValueOf = String.valueOf(o000000O.OooOOoo().getValue());
            String string = o000000O.OooO().toString();
            this.f45017OooO0Oo = 1;
            MessageIM.SendEmoticonRequest.Builder mRequestBuilder = MessageIM.SendEmoticonRequest.newBuilder();
            mRequestBuilder.setToId(targetId);
            mRequestBuilder.setType(emoticonType);
            mRequestBuilder.setNickname(strValueOf);
            mRequestBuilder.setHeadphoto(string);
            List<String> list = o0000O.f44074OooO00o;
            o00OOOO0 o00oooo1 = o000oOoO.f55784OooO00o;
            String str = o0000O.f44082OooOO0;
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
            MessageIM.SendEmoticonReply from = MessageIM.SendEmoticonReply.parseFrom(error.getBody());
            if (from != null) {
                o0OO000.OooO0O0("204011", MapsKt.mapOf(new Pair("region", String.valueOf(OooO.OooO0OO()))));
                ChatMessage.EmoticonInfo emoticonInfo2 = chatMessage.getEmoticonInfo();
                if (emoticonInfo2 != null) {
                    emoticonInfo2.setEmoticonValue(from.getNumber());
                }
                Intrinsics.checkNotNullParameter(chatMessage, "chatMessage");
                o000OOo.OooO00o().OooOOOo().OooO0oo(chatMessage);
                oOO0O000.OooO0oO(chatMessage);
                mutableLiveData.postValue(Boxing.boxBoolean(true));
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
