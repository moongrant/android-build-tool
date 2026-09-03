package p406o0Oo0Ooo;

import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.MessageIM;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.model.ImResult;
import io.agora.rtc.Constants;
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
import p377o0OOoOo.o0000O;
import p464o0Oooo.o000000O;
import p471o0Ooooo.o0O00OO;
import p542o0o0o00O.o000oOoO;
import p579o0oOoo.oOo000o0;
import p634o0ooO0oO.o00OOOO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendGIFMessage$1$1", f = "ImMessageRepo.kt", i = {}, l = {Constants.ERR_PUBLISH_STREAM_NOT_AUTHORIZED}, m = "invokeSuspend", n = {}, s = {})
public final class oOOO0OOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f45020OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f45021OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f45022OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO0OOO(ChatMessage chatMessage, MutableLiveData<Boolean> mutableLiveData, Continuation<? super oOOO0OOO> continuation) {
        super(2, continuation);
        this.f45022OooO0o0 = chatMessage;
        this.f45021OooO0o = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oOOO0OOO(this.f45022OooO0o0, this.f45021OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oOOO0OOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        long jLongValue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45020OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ChatMessage.GifInfo gifInfo = this.f45022OooO0o0.getGifInfo();
            if (gifInfo == null) {
                return Unit.INSTANCE;
            }
            long targetId = this.f45022OooO0o0.getTargetId();
            int gifId = gifInfo.getGifId();
            String gifUrl = gifInfo.getGifUrl();
            this.f45020OooO0Oo = 1;
            MessageIM.GifEmoticonIn.Builder mRequestBuilder = MessageIM.GifEmoticonIn.newBuilder();
            mRequestBuilder.setToId(targetId);
            synchronized (oOo000o0.f56701OooO00o) {
                o000000O o000000o2 = o000000O.f46674OooO00o;
                Long l = (Long) o000000O.OooOOo0().getValue();
                jLongValue = l == null ? 0L : l.longValue();
            }
            mRequestBuilder.setFromId(jLongValue);
            mRequestBuilder.setGifid(gifId);
            mRequestBuilder.setGifurl(gifUrl);
            o00OOOO0 o00oooo1 = o000oOoO.f55784OooO00o;
            String str = o0000O.f44089OooOOo;
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
        oOOO00Oo.OooOO0(this.f45022OooO0o0.getMid(), error.isSuccess());
        if (!error.isSuccess()) {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O00OO(error, null), 3, null);
        }
        this.f45021OooO0o.postValue(Boxing.boxBoolean(error.isSuccess()));
        return Unit.INSTANCE;
    }
}
