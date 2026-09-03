package p406o0Oo0Ooo;

import androidx.compose.ui.graphics.colorspace.OooO0OO;
import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.MessageIM;
import com.yalla.yalla.model.ImResult;
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
import p403o0Oo0OOo.o0O00;
import p464o0Oooo.o000000O;
import p471o0Ooooo.o0O00OO;
import p542o0o0o00O.o000oOoO;
import p581o0oOoo00.o000OOo;
import p634o0ooO0oO.o00OOOO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$deleteFriend$1$1", f = "ImMessageRepo.kt", i = {}, l = {730}, m = "invokeSuspend", n = {}, s = {})
public final class oOOO00o0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f45013OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f45014OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f45015OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO00o0(long j, MutableLiveData<Boolean> mutableLiveData, Continuation<? super oOOO00o0> continuation) {
        super(2, continuation);
        this.f45015OooO0o0 = j;
        this.f45014OooO0o = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oOOO00o0(this.f45015OooO0o0, this.f45014OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oOOO00o0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45013OooO0Oo;
        long j = this.f45015OooO0o0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f45013OooO0Oo = 1;
            MessageIM.FriendDeleteRequest.Builder mRequestBuilder = MessageIM.FriendDeleteRequest.newBuilder();
            mRequestBuilder.setToId(j);
            o00OOOO0 o00oooo1 = o000oOoO.f55784OooO00o;
            String str = o0000O.f44084OooOO0o;
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
        boolean zIsSuccess = error.isSuccess();
        MutableLiveData<Boolean> mutableLiveData = this.f45014OooO0o;
        if (zIsSuccess) {
            o0O00 o0o00OooOOo = o000OOo.OooO00o().OooOOo();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o0o00OooOOo.OooOOOO(((Number) OooO0OO.OooO0O0()).longValue(), j);
            mutableLiveData.postValue(Boxing.boxBoolean(true));
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O00OO(error, null), 3, null);
            mutableLiveData.postValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }
}
