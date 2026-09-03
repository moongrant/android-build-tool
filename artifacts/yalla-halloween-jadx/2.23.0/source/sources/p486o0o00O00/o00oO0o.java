package p486o0o00O00;

import com.code.android.util.OooOOO;
import com.yalla.yalla.api.old.ApiAccount$blackList$$inlined$call$1;
import com.yalla.yalla.model.BlackUserModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
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
import p376o0OOoOOO.o0O0ooO;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p420o0OoO0OO.o0OO00O;
import p426o0OoOO.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.main.BlackListActivity$getBlackList$1", f = "BlackListActivity.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
public final class o00oO0o extends SuspendLambda implements Function2<o0OO00O<ApiResult<BlackUserModel>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f48332OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ BlackListActivity f48333OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f48334OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(BlackListActivity blackListActivity, Continuation<? super o00oO0o> continuation) {
        super(2, continuation);
        this.f48333OooO0o = blackListActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00oO0o o00oo0o2 = new o00oO0o(this.f48333OooO0o, continuation);
        o00oo0o2.f48334OooO0o0 = obj;
        return o00oo0o2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o0OO00O<ApiResult<BlackUserModel>> o0oo00o2, Continuation<? super Unit> continuation) {
        return ((o00oO0o) create(o0oo00o2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o0OO00O o0oo00o2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f48332OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0OO00O o0oo00o3 = (o0OO00O) this.f48334OooO0o0;
            o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
            String strOooO00o = o0OOO0o.OooO00o(this.f48333OooO0o.f25370OooOOo0);
            this.f48334OooO0o0 = o0oo00o3;
            this.f48332OooO0Oo = 1;
            String url = o000OOo0.OooO0OO(o0000O.f44174o00o0O);
            Intrinsics.checkNotNullParameter(url, "url");
            o0O0ooO o0o0ooo = new o0O0ooO(url, 0);
            o0o0ooo.OooO0O0(strOooO00o, "pageindex");
            o0o0ooo.OooO0O0("4", "type");
            Object objOooO0Oo = OooOOO.OooO0Oo(new ApiAccount$blackList$$inlined$call$1(o0o0ooo, null), this);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            o0oo00o2 = o0oo00o3;
            obj = objOooO0Oo;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o0oo00o2 = (o0OO00O) this.f48334OooO0o0;
            ResultKt.throwOnFailure(obj);
        }
        o0oo00o2.postValue(obj);
        return Unit.INSTANCE;
    }
}
