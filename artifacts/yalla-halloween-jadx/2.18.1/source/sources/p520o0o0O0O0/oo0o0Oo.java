package p520o0o0O0O0;

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
import p491o0o00O00.OooO0OO;
import p498o0o00Oo0.OooOOO;
import p528o0o0OO0O.o000O;
import p528o0o0OO0O.o000OO00;
import p531o0o0OOO0.o00O000;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendEmotionMessage$1$1", f = "ImMessageRepo.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
public final class oo0o0Oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f42929Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f42930Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f42931Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(ChatMessage chatMessage, MutableLiveData<Boolean> mutableLiveData, Continuation<? super oo0o0Oo> continuation) {
        super(2, continuation);
        this.f42930Oooo0oO = chatMessage;
        this.f42931Oooo0oo = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oo0o0Oo(this.f42930Oooo0oO, this.f42931Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oo0o0Oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws InvalidProtocolBufferException, BadPaddingException, IllegalBlockSizeException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f42929Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f42930Oooo0oO.getEmoticonInfo() == null) {
                this.f42931Oooo0oo.postValue(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }
            ChatMessage.EmoticonInfo emoticonInfo = this.f42930Oooo0oO.getEmoticonInfo();
            Intrinsics.checkNotNull(emoticonInfo);
            long targetId = this.f42930Oooo0oO.getTargetId();
            int emoticonType = emoticonInfo.getEmoticonType();
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            String strValueOf = String.valueOf(oooOOO.OooOoO().getValue());
            String string = oooOOO.OooO0oo().toString();
            this.f42929Oooo0o = 1;
            MessageIM.SendEmoticonRequest.Builder mRequestBuilder = MessageIM.SendEmoticonRequest.newBuilder();
            mRequestBuilder.setToId(targetId);
            mRequestBuilder.setType(emoticonType);
            mRequestBuilder.setNickname(strValueOf);
            mRequestBuilder.setHeadphoto(string);
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            String str = o0ooOOo.f32233OooOOo;
            o00O000 o00o001 = o00O000.f43398OooO00o;
            String str2 = o0ooOOo.f32226OooOO0;
            Intrinsics.checkNotNullExpressionValue(mRequestBuilder, "mRequestBuilder");
            obj = o00o001.OooO0O0(str2, mRequestBuilder, this);
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
        if (imResult.getBody() != null) {
            MessageIM.SendEmoticonReply from = MessageIM.SendEmoticonReply.parseFrom(imResult.getBody());
            if (from != null) {
                ChatMessage chatMessage = this.f42930Oooo0oO;
                MutableLiveData<Boolean> mutableLiveData = this.f42931Oooo0oo;
                o0O00000.OooO0o0("Message_send_success", String.valueOf(oo000o.OooO0O0()));
                ChatMessage.EmoticonInfo emoticonInfo2 = chatMessage.getEmoticonInfo();
                if (emoticonInfo2 != null) {
                    emoticonInfo2.setEmoticonValue(from.getNumber());
                }
                OooOOO oooOOO2 = OooOOO.f42227OooO00o;
                Intrinsics.checkNotNullParameter(chatMessage, "chatMessage");
                OooO0OO.OooO00o().OooOOo().OooOO0(chatMessage);
                oooOOO2.OooO0oO(chatMessage);
                mutableLiveData.postValue(Boxing.boxBoolean(true));
            }
        } else {
            o000O error = new o000O(imResult.getCode());
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000OO00(error, null), 3, null);
        }
        o0OOO0o.f42810OooO00o.OooO0oO(this.f42930Oooo0oO.getMid(), false);
        this.f42931Oooo0oo.postValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
