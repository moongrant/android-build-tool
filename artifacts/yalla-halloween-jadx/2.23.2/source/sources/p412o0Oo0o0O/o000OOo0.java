package p412o0Oo0o0O;

import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.MessageIM;
import com.yalla.yalla.common.manager.OooO00o;
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
import p384o0OOoo0O.Oooo0;
import p407o0Oo0Oo.o000;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;
import p479o0o0000o.o000O000;
import p480o0o000O.OooOO0;
import p641o0ooOO0o.o0OoO00O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$deleteFriend$1$1", f = "ImMessageRepo.kt", i = {}, l = {730}, m = "invokeSuspend", n = {}, s = {})
public final class o000OOo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f46044OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableLiveData<Boolean> f46045OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f46046OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(long j, MutableLiveData<Boolean> mutableLiveData, Continuation<? super o000OOo0> continuation) {
        super(2, continuation);
        this.f46046OooO0o0 = j;
        this.f46045OooO0o = mutableLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000OOo0(this.f46046OooO0o0, this.f46045OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000OOo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46044OooO0Oo;
        long j = this.f46046OooO0o0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f46044OooO0Oo = 1;
            MessageIM.FriendDeleteRequest.Builder builderNewBuilder = MessageIM.FriendDeleteRequest.newBuilder();
            builderNewBuilder.setToId(j);
            o0OoO00O o0ooo00o2 = OooOO0.f48392OooO00o;
            String str = Oooo0.f43343OooOO0o;
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
        boolean zIsSuccess = error.isSuccess();
        MutableLiveData<Boolean> mutableLiveData = this.f46045OooO0o;
        if (zIsSuccess) {
            o000 o000VarOooOOoo = o00Oo0.OooO00o().OooOOoo();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o000VarOooOOoo.OooOOOO(((Number) OooO00o.OooO00o()).longValue(), j);
            mutableLiveData.postValue(Boxing.boxBoolean(true));
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000O000(error, null), 3, null);
            mutableLiveData.postValue(Boxing.boxBoolean(false));
        }
        return Unit.INSTANCE;
    }
}
