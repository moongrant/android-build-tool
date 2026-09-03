package p487o0o00O;

import androidx.compose.foundation.layout.oo000o;
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
import p380o0OOoOo.o0ooOOo;
import p384o0OOoo0O.Oooo0;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p424o0OoO0Oo.o00OO0O0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.main.BlackListActivity$getBlackList$1", f = "BlackListActivity.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
public final class o0Oo0oo extends SuspendLambda implements Function2<o00OO0O0<ApiResult<BlackUserModel>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f48891OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ BlackListActivity f48892OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f48893OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(BlackListActivity blackListActivity, Continuation<? super o0Oo0oo> continuation) {
        super(2, continuation);
        this.f48892OooO0o = blackListActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0Oo0oo o0oo0oo2 = new o0Oo0oo(this.f48892OooO0o, continuation);
        o0oo0oo2.f48893OooO0o0 = obj;
        return o0oo0oo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o00OO0O0<ApiResult<BlackUserModel>> o00oo0o1, Continuation<? super Unit> continuation) {
        return ((o0Oo0oo) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o00OO0O0 o00oo0o1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f48891OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00OO0O0 o00oo0o2 = (o00OO0O0) this.f48893OooO0o0;
            o00oO0o o00oo0o3 = o0OO00O.f43462OooO00o;
            String strOooO00o = oo000o.OooO00o(this.f48892OooO0o.f24916OooOOo0);
            this.f48893OooO0o0 = o00oo0o2;
            this.f48891OooO0Oo = 1;
            String url = p380o0OOoOo.oo000o.OooO0OO(Oooo0.f43433o00o0O);
            Intrinsics.checkNotNullParameter(url, "url");
            o0ooOOo o0ooooo = new o0ooOOo(url, 0);
            o0ooooo.OooO0O0(strOooO00o, "pageindex");
            o0ooooo.OooO0O0("4", "type");
            Object objOooO0Oo = OooOOO.OooO0Oo(new ApiAccount$blackList$$inlined$call$1(o0ooooo, null), this);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            o00oo0o1 = o00oo0o2;
            obj = objOooO0Oo;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o00oo0o1 = (o00OO0O0) this.f48893OooO0o0;
            ResultKt.throwOnFailure(obj);
        }
        o00oo0o1.postValue(obj);
        return Unit.INSTANCE;
    }
}
