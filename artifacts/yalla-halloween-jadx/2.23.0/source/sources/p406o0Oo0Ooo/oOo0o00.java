package p406o0Oo0Ooo;

import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0OoOo0;
import com.google.protobuf.InvalidProtocolBufferException;
import com.yalla.yalla.data.db.table.ChatMessage;
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

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$sendGiftMessage$1$1", f = "ImMessageRepo.kt", i = {}, l = {174, 177, 180, 183}, m = "invokeSuspend", n = {}, s = {})
public final class oOo0o00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public MutableLiveData f45039OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f45040OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f45041OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f45042OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0o00(ChatMessage chatMessage, MutableLiveData<Boolean> mutableLiveData, Continuation<? super oOo0o00> continuation) {
        super(2, continuation);
        this.f45040OooO0o = chatMessage;
        this.f45042OooO0oO = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oOo0o00(this.f45040OooO0o, this.f45042OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oOo0o00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws InvalidProtocolBufferException {
        MutableLiveData<Boolean> mutableLiveData;
        boolean zBooleanValue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45041OooO0o0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ChatMessage chatMessage = this.f45040OooO0o;
            ChatMessage.GiftInfo giftInfo = chatMessage.getGiftInfo();
            MutableLiveData<Boolean> mutableLiveData2 = this.f45042OooO0oO;
            if (giftInfo == null) {
                mutableLiveData2.postValue(Boxing.boxBoolean(false));
            } else {
                boolean zOooO00o = o0OoOo0.OooO00o(giftInfo.getIsGiftBlind());
                oOOO00Oo oooo00oo = oOOO00Oo.f44992OooO00o;
                if (zOooO00o) {
                    this.f45039OooO0Oo = mutableLiveData2;
                    this.f45041OooO0o0 = 1;
                    obj = oOOO00Oo.OooO0OO(oooo00oo, chatMessage, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData = mutableLiveData2;
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    mutableLiveData.postValue(Boxing.boxBoolean(zBooleanValue));
                } else if (o0OoOo0.OooO00o(giftInfo.getIsGiftCustomMade())) {
                    this.f45039OooO0Oo = mutableLiveData2;
                    this.f45041OooO0o0 = 2;
                    obj = oOOO00Oo.OooO0Oo(oooo00oo, chatMessage, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData = mutableLiveData2;
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    mutableLiveData.postValue(Boxing.boxBoolean(zBooleanValue));
                } else if (o0OoOo0.OooO00o(giftInfo.getIsGiftBackpack())) {
                    this.f45039OooO0Oo = mutableLiveData2;
                    this.f45041OooO0o0 = 3;
                    obj = oOOO00Oo.OooO0O0(oooo00oo, chatMessage, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData = mutableLiveData2;
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    mutableLiveData.postValue(Boxing.boxBoolean(zBooleanValue));
                } else {
                    this.f45039OooO0Oo = mutableLiveData2;
                    this.f45041OooO0o0 = 4;
                    obj = oOOO00Oo.OooO00o(oooo00oo, chatMessage, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableLiveData = mutableLiveData2;
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    mutableLiveData.postValue(Boxing.boxBoolean(zBooleanValue));
                }
            }
        } else if (i == 1) {
            mutableLiveData = this.f45039OooO0Oo;
            ResultKt.throwOnFailure(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
            mutableLiveData.postValue(Boxing.boxBoolean(zBooleanValue));
        } else if (i == 2) {
            mutableLiveData = this.f45039OooO0Oo;
            ResultKt.throwOnFailure(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
            mutableLiveData.postValue(Boxing.boxBoolean(zBooleanValue));
        } else if (i == 3) {
            mutableLiveData = this.f45039OooO0Oo;
            ResultKt.throwOnFailure(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
            mutableLiveData.postValue(Boxing.boxBoolean(zBooleanValue));
        } else {
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableLiveData = this.f45039OooO0Oo;
            ResultKt.throwOnFailure(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
            mutableLiveData.postValue(Boxing.boxBoolean(zBooleanValue));
        }
        return Unit.INSTANCE;
    }
}
