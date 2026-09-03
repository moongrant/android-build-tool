package com.yalla.yalla.ui.vm.account;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.AccountRepo;
import com.yalla.yalla.data.repository.AccountRepo$checkAccountDeleteEnable$$inlined$call$1;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p382o0OOoo.OooOOO0;
import p391o0OOooo0.oo000o;
import p394o0Oo0.OooOO0;
import p424o0OoO0Oo.o00O;
import p424o0OoO0Oo.o00OO0O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/vm/account/DeleteAccountVM;", "Lo0Oo0/OooOO0;", "Lo0OoO0Oo/o00OO0O0;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "checkAccountDeleteEnable", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class DeleteAccountVM extends OooOO0 {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.DeleteAccountVM$checkAccountDeleteEnable$1", f = "DeleteAccountVM.kt", i = {}, l = {13}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<o00OO0O0<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31065OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31066OooO0o0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f31066OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<Object>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31065OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f31066OooO0o0;
                AccountRepo accountRepo = AccountRepo.f22385OooO00o;
                this.f31066OooO0o0 = o00oo0o2;
                this.f31065OooO0Oo = 1;
                accountRepo.getClass();
                String str = OooOOO0.f43297OooOO0O;
                Object objOooO0Oo = OooOOO.OooO0Oo(new AccountRepo$checkAccountDeleteEnable$$inlined$call$1(oo000o.OooO00o(str, "url", str, 1), null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f31066OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o00oo0o1.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final o00OO0O0<ApiResult<Object>> checkAccountDeleteEnable() {
        return o00O.OooO00o(this, new OooO00o(null));
    }
}
