package p520o0o0O0O0;

import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.MessageIM;
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
import p498o0o00Oo0.OooOOO;
import p528o0o0OO0O.o000O;
import p528o0o0OO0O.o000OO00;
import p531o0o0OOO0.o00O000;
import p617o0oo0o.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendGIFMessage$1$1", f = "ImMessageRepo.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
public final class o0O0O00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f42802Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f42803Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f42804Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(ChatMessage chatMessage, MutableLiveData<Boolean> mutableLiveData, Continuation<? super o0O0O00> continuation) {
        super(2, continuation);
        this.f42803Oooo0oO = chatMessage;
        this.f42804Oooo0oo = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O0O00(this.f42803Oooo0oO, this.f42804Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O0O00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws BadPaddingException, IllegalBlockSizeException {
        long jLongValue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f42802Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ChatMessage.GifInfo gifInfo = this.f42803Oooo0oO.getGifInfo();
            if (gifInfo == null) {
                return Unit.INSTANCE;
            }
            long targetId = this.f42803Oooo0oO.getTargetId();
            int gifId = gifInfo.getGifId();
            String gifUrl = gifInfo.getGifUrl();
            this.f42802Oooo0o = 1;
            MessageIM.GifEmoticonIn.Builder mRequestBuilder = MessageIM.GifEmoticonIn.newBuilder();
            mRequestBuilder.setToId(targetId);
            synchronized (o0000O00.f48482OooO00o) {
                Long value = OooOOO.f41216OooO00o.OooOo().getValue();
                jLongValue = value == null ? 0L : value.longValue();
            }
            mRequestBuilder.setFromId(jLongValue);
            mRequestBuilder.setGifid(gifId);
            mRequestBuilder.setGifurl(gifUrl);
            o00O000 o00o001 = o00O000.f43398OooO00o;
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            String str = o0ooOOo.f32233OooOOo;
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
        boolean z = imResult.getBody() != null;
        o0OOO0o.f42810OooO00o.OooO0oO(this.f42803Oooo0oO.getMid(), z);
        if (imResult.getBody() == null) {
            o000O error = new o000O(imResult.getCode());
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000OO00(error, null), 3, null);
        }
        this.f42804Oooo0oo.postValue(Boxing.boxBoolean(z));
        return Unit.INSTANCE;
    }
}
