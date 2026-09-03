package p520o0o0O0O0;

import androidx.lifecycle.MutableLiveData;
import com.google.protobuf.InvalidProtocolBufferException;
import com.yalla.yalla.common.db.table.ChatMessage;
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
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p522o0o0O0o.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendGiftMessage$1$1", f = "ImMessageRepo.kt", i = {}, l = {183, 185}, m = "invokeSuspend", n = {}, s = {})
public final class o000000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f42346Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public MutableLiveData f42347Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f42348Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f42349Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(ChatMessage chatMessage, MutableLiveData<Boolean> mutableLiveData, Continuation<? super o000000O> continuation) {
        super(2, continuation);
        this.f42349Oooo0oo = chatMessage;
        this.f42346Oooo = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000000O(this.f42349Oooo0oo, this.f42346Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000000O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws InvalidProtocolBufferException, BadPaddingException, IllegalBlockSizeException {
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f42348Oooo0oO;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ChatMessage.GiftInfo giftInfo = this.f42349Oooo0oo.getGiftInfo();
            MutableLiveData<Boolean> mutableLiveData3 = this.f42346Oooo;
            ChatMessage chatMessage = this.f42349Oooo0oo;
            if (giftInfo == null) {
                mutableLiveData3.postValue(Boxing.boxBoolean(false));
            } else if (oOO00O.OooO0OO(giftInfo.getIsGiftBlind())) {
                o0OOO0o o0ooo0o2 = o0OOO0o.f42810OooO00o;
                this.f42347Oooo0o = mutableLiveData3;
                this.f42348Oooo0oO = 1;
                obj = o0OOO0o.OooO0O0(o0ooo0o2, chatMessage, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData2 = mutableLiveData3;
                mutableLiveData2.postValue(obj);
            } else {
                o0OOO0o o0ooo0o3 = o0OOO0o.f42810OooO00o;
                Boolean isGiftCustomMade = giftInfo.getIsGiftCustomMade();
                this.f42347Oooo0o = mutableLiveData3;
                this.f42348Oooo0oO = 2;
                obj = o0OOO0o.OooO00o(o0ooo0o3, chatMessage, isGiftCustomMade, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = mutableLiveData3;
                mutableLiveData.postValue(obj);
            }
        } else if (i == 1) {
            mutableLiveData2 = this.f42347Oooo0o;
            ResultKt.throwOnFailure(obj);
            mutableLiveData2.postValue(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData = this.f42347Oooo0o;
            ResultKt.throwOnFailure(obj);
            mutableLiveData.postValue(obj);
        }
        return Unit.INSTANCE;
    }
}
