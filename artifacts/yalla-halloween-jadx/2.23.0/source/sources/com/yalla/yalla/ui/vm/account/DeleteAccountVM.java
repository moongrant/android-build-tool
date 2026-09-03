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
import p381o0OOoo0O.Oooo0;
import p385o0OOooOO.o00oOoo;
import p394o0Oo00oO.o0O0O00;
import p420o0OoO0OO.o0OO00O;
import p420o0OoO0OO.o0ooOOo;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/vm/account/DeleteAccountVM;", "Lo0Oo00oO/o0O0O00;", "Lo0OoO0OO/o0OO00O;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "checkAccountDeleteEnable", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class DeleteAccountVM extends o0O0O00 {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.DeleteAccountVM$checkAccountDeleteEnable$1", f = "DeleteAccountVM.kt", i = {}, l = {13}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<o0OO00O<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31607OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31608OooO0o0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f31608OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0OO00O<ApiResult<Object>> o0oo00o2, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o0oo00o2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OO00O o0oo00o2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31607OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0OO00O o0oo00o3 = (o0OO00O) this.f31608OooO0o0;
                AccountRepo accountRepo = AccountRepo.f22858OooO00o;
                this.f31608OooO0o0 = o0oo00o3;
                this.f31607OooO0Oo = 1;
                accountRepo.getClass();
                String str = Oooo0.f44258OooOO0O;
                Object objOooO0Oo = OooOOO.OooO0Oo(new AccountRepo$checkAccountDeleteEnable$$inlined$call$1(o00oOoo.OooO00o(str, "url", str, 1), null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o0oo00o2 = o0oo00o3;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0oo00o2 = (o0OO00O) this.f31608OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o0oo00o2.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final o0OO00O<ApiResult<Object>> checkAccountDeleteEnable() {
        return o0ooOOo.OooO00o(this, new OooO00o(null));
    }
}
