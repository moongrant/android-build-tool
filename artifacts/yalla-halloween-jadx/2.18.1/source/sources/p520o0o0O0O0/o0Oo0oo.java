package p520o0o0O0O0;

import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.MessageIM;
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
import kotlin.reflect.jvm.internal.impl.types.OooO00o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o0ooOOo;
import p491o0o00O00.OooO0OO;
import p498o0o00Oo0.OooOOO;
import p528o0o0OO0O.o000O;
import p528o0o0OO0O.o000OO00;
import p531o0o0OOO0.o00O000;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$deleteFriend$1$1", f = "ImMessageRepo.kt", i = {}, l = {632}, m = "invokeSuspend", n = {}, s = {})
public final class o0Oo0oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f42826Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f42827Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f42828Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(long j, MutableLiveData<Boolean> mutableLiveData, Continuation<? super o0Oo0oo> continuation) {
        super(2, continuation);
        this.f42827Oooo0oO = j;
        this.f42828Oooo0oo = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0Oo0oo(this.f42827Oooo0oO, this.f42828Oooo0oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0Oo0oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws BadPaddingException, IllegalBlockSizeException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f42826Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j = this.f42827Oooo0oO;
            this.f42826Oooo0o = 1;
            MessageIM.FriendDeleteRequest.Builder mRequestBuilder = MessageIM.FriendDeleteRequest.newBuilder();
            mRequestBuilder.setToId(j);
            o00O000 o00o001 = o00O000.f43398OooO00o;
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            String str = o0ooOOo.f32228OooOO0o;
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
        if (imResult.getBody() != null) {
            OooO0OO.OooO00o().OooOo00().OooOOO(((Number) OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue(), this.f42827Oooo0oO);
            this.f42828Oooo0oo.postValue(Boxing.boxBoolean(true));
        } else {
            o000O error = new o000O(imResult.getCode());
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000OO00(error, null), 3, null);
            this.f42828Oooo0oo.postValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }
}
