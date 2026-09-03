package p579o0oOoOoO;

import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.AccountRepo;
import com.yalla.yalla.data.repository.AccountRepo$getLogOutFBPopConfig$$inlined$call$1;
import com.yalla.yalla.model.LogOutFBPopConfig;
import com.yalla.yalla.model.http.ApiResult;
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
import p424o0OoO0Oo.o00OO0O0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SettingVM$logOutFBPopConfig$1", f = "SettingVM.kt", i = {0}, l = {59}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
public final class oOO0O0O0 extends SuspendLambda implements Function2<o00OO0O0<ApiResult<LogOutFBPopConfig>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56536OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f56537OooO0o0;

    public oOO0O0O0(Continuation<? super oOO0O0O0> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        oOO0O0O0 ooo0o0o0 = new oOO0O0O0(continuation);
        ooo0o0o0.f56537OooO0o0 = obj;
        return ooo0o0o0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o00OO0O0<ApiResult<LogOutFBPopConfig>> o00oo0o1, Continuation<? super Unit> continuation) {
        return ((oOO0O0O0) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o00OO0O0 o00oo0o1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f56536OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o00OO0O0 o00oo0o2 = (o00OO0O0) this.f56537OooO0o0;
            AccountRepo accountRepo = AccountRepo.f22385OooO00o;
            this.f56537OooO0o0 = o00oo0o2;
            this.f56536OooO0Oo = 1;
            accountRepo.getClass();
            String url = oo000o.OooO0OO("/Webservers/User/GetLogOutFBPopConfig");
            Intrinsics.checkNotNullParameter(url, "url");
            Object objOooO0Oo = OooOOO.OooO0Oo(new AccountRepo$getLogOutFBPopConfig$$inlined$call$1(new o0ooOOo(url, 0), null), this);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            o00oo0o1 = o00oo0o2;
            obj = objOooO0Oo;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o00oo0o1 = (o00OO0O0) this.f56537OooO0o0;
            ResultKt.throwOnFailure(obj);
        }
        o00oo0o1.postValue((ApiResult) obj);
        return Unit.INSTANCE;
    }
}
