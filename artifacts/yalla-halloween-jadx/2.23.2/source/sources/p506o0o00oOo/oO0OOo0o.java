package p506o0o00oOo;

import com.code.android.util.OooOOO;
import com.yalla.yalla.api.old.ApiAccount$fansList$$inlined$call$1;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.model.FollowedModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import io.agora.rtc.Constants;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p384o0OOoo0O.Oooo0;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p424o0OoO0Oo.o00OO0O0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.user.FollowerActivity$load$1", f = "FollowerActivity.kt", i = {}, l = {Constants.ERR_MODULE_NOT_FOUND}, m = "invokeSuspend", n = {}, s = {})
public final class oO0OOo0o extends SuspendLambda implements Function2<o00OO0O0<ApiResult<FollowedModel>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f50498OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ FollowerActivity f50499OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f50500OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OOo0o(FollowerActivity followerActivity, Continuation<? super oO0OOo0o> continuation) {
        super(2, continuation);
        this.f50499OooO0o = followerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        oO0OOo0o oo0ooo0o = new oO0OOo0o(this.f50499OooO0o, continuation);
        oo0ooo0o.f50500OooO0o0 = obj;
        return oo0ooo0o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o00OO0O0<ApiResult<FollowedModel>> o00oo0o1, Continuation<? super Unit> continuation) {
        return ((oO0OOo0o) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o00OO0O0 o00oo0o1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f50498OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00OO0O0 o00oo0o2 = (o00OO0O0) this.f50500OooO0o0;
            o00oO0o o00oo0o3 = o0OO00O.f43462OooO00o;
            FollowerActivity followerActivity = this.f50499OooO0o;
            String str = followerActivity.f26641OooOOoo;
            int i2 = followerActivity.f26644OooOo0O;
            String strValueOf = String.valueOf(followerActivity.f26643OooOo00);
            this.f50500OooO0o0 = o00oo0o2;
            this.f50498OooO0Oo = 1;
            String url = oo000o.OooO0OO(Oooo0.f43433o00o0O);
            Intrinsics.checkNotNullParameter(url, "url");
            o0ooOOo o0ooooo = new o0ooOOo(url, 0);
            o0ooooo.OooO0O0(str, "dtsort");
            o0ooooo.OooO0O0(strValueOf, "pageindex");
            o0ooooo.OooO0O0(String.valueOf(i2), "num");
            o0ooooo.OooO0O0(FeedbackType.Recharge, "type");
            Object objOooO0Oo = OooOOO.OooO0Oo(new ApiAccount$fansList$$inlined$call$1(o0ooooo, null), this);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            o00oo0o1 = o00oo0o2;
            obj = objOooO0Oo;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o00oo0o1 = (o00OO0O0) this.f50500OooO0o0;
            ResultKt.throwOnFailure(obj);
        }
        o00oo0o1.postValue(obj);
        return Unit.INSTANCE;
    }
}
