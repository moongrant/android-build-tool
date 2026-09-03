package p496o0o00o;

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
import p376o0OOoOOO.o000OOo0;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p420o0OoO0OO.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.user.FollowerActivity$load$1", f = "FollowerActivity.kt", i = {}, l = {Constants.ERR_MODULE_NOT_FOUND}, m = "invokeSuspend", n = {}, s = {})
public final class o0O0ooO extends SuspendLambda implements Function2<o0OO00O<ApiResult<FollowedModel>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f49086OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ FollowerActivity f49087OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f49088OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0ooO(FollowerActivity followerActivity, Continuation<? super o0O0ooO> continuation) {
        super(2, continuation);
        this.f49087OooO0o = followerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0O0ooO o0o0ooo = new o0O0ooO(this.f49087OooO0o, continuation);
        o0o0ooo.f49088OooO0o0 = obj;
        return o0o0ooo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o0OO00O<ApiResult<FollowedModel>> o0oo00o2, Continuation<? super Unit> continuation) {
        return ((o0O0ooO) create(o0oo00o2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o0OO00O o0oo00o2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f49086OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0OO00O o0oo00o3 = (o0OO00O) this.f49088OooO0o0;
            o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
            FollowerActivity followerActivity = this.f49087OooO0o;
            String str = followerActivity.f27108OooOOoo;
            int i2 = followerActivity.f27111OooOo0O;
            String strValueOf = String.valueOf(followerActivity.f27110OooOo00);
            this.f49088OooO0o0 = o0oo00o3;
            this.f49086OooO0Oo = 1;
            String url = o000OOo0.OooO0OO(o0000O.f44174o00o0O);
            Intrinsics.checkNotNullParameter(url, "url");
            p376o0OOoOOO.o0O0ooO o0o0ooo = new p376o0OOoOOO.o0O0ooO(url, 0);
            o0o0ooo.OooO0O0(str, "dtsort");
            o0o0ooo.OooO0O0(strValueOf, "pageindex");
            o0o0ooo.OooO0O0(String.valueOf(i2), "num");
            o0o0ooo.OooO0O0(FeedbackType.Recharge, "type");
            Object objOooO0Oo = OooOOO.OooO0Oo(new ApiAccount$fansList$$inlined$call$1(o0o0ooo, null), this);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            o0oo00o2 = o0oo00o3;
            obj = objOooO0Oo;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o0oo00o2 = (o0OO00O) this.f49088OooO0o0;
            ResultKt.throwOnFailure(obj);
        }
        o0oo00o2.postValue(obj);
        return Unit.INSTANCE;
    }
}
