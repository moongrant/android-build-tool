package p412o0Oo0o0O;

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
import o0oo0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p384o0OOoo0O.Oooo0;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;
import p479o0o0000o.o000O000;
import p480o0o000O.OooOO0;
import p595o0oo00O.OooOo00;
import p641o0ooOO0o.o0OoO00O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendEmotionMessage$1$1", f = "ImMessageRepo.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
public final class o00O0000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f46065OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f46066OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f46067OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0000(ChatMessage chatMessage, MutableLiveData<Boolean> mutableLiveData, Continuation<? super o00O0000> continuation) {
        super(2, continuation);
        this.f46067OooO0o0 = chatMessage;
        this.f46066OooO0o = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O0000(this.f46067OooO0o0, this.f46066OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O0000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws InvalidProtocolBufferException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46065OooO0Oo;
        MutableLiveData<Boolean> mutableLiveData = this.f46066OooO0o;
        ChatMessage chatMessage = this.f46067OooO0o0;
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
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            String strValueOf = String.valueOf(o0O00oO0.OooOOoo().getValue());
            String string = o0O00oO0.OooO().toString();
            this.f46065OooO0Oo = 1;
            MessageIM.SendEmoticonRequest.Builder builderNewBuilder = MessageIM.SendEmoticonRequest.newBuilder();
            builderNewBuilder.setToId(targetId);
            builderNewBuilder.setType(emoticonType);
            builderNewBuilder.setNickname(strValueOf);
            builderNewBuilder.setHeadphoto(string);
            List<String> list = Oooo0.f43333OooO00o;
            o0OoO00O o0ooo00o2 = OooOO0.f48392OooO00o;
            String str = Oooo0.f43341OooOO0;
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
        if (error.isSuccess()) {
            MessageIM.SendEmoticonReply from = MessageIM.SendEmoticonReply.parseFrom(error.getBody());
            if (from != null) {
                OooO00o.OooO0OO("204011", MapsKt.mapOf(new Pair("region", String.valueOf(OooOo00.OooO0OO()))));
                ChatMessage.EmoticonInfo emoticonInfo2 = chatMessage.getEmoticonInfo();
                if (emoticonInfo2 != null) {
                    emoticonInfo2.setEmoticonValue(from.getNumber());
                }
                Intrinsics.checkNotNullParameter(chatMessage, "chatMessage");
                o00Oo0.OooO00o().OooOOo0().OooO0oo(chatMessage);
                o000OO.OooO0oO(chatMessage);
                mutableLiveData.postValue(Boxing.boxBoolean(true));
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
