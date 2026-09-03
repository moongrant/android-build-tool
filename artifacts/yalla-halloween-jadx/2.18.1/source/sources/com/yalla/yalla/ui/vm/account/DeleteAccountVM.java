package com.yalla.yalla.ui.vm.account;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.data.repository.AccountRepo$checkAccountDeleteEnable$$inlined$call$1;
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
import p254o00ooO0O.o0000O0;
import p480o0o000.OooO0OO;
import p484o0o000OO.OooOOO0;
import p484o0o000OO.OooOOOO;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/vm/account/DeleteAccountVM;", "Lo00OO/OooO00o;", "Lo0o000OO/OooOOOO;", "Lcom/yalla/yalla/common/model/ApiResult;", "", "checkAccountDeleteEnable", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class DeleteAccountVM extends o00OO.OooO00o {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.DeleteAccountVM$checkAccountDeleteEnable$1", f = "DeleteAccountVM.kt", i = {}, l = {13}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<OooOOOO<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25306Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25307Oooo0oO;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f25307Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OooOOOO<ApiResult<Object>> oooOOOO, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(oooOOOO, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OooOOOO oooOOOO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25306Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooOOOO oooOOOO2 = (OooOOOO) this.f25307Oooo0oO;
                this.f25307Oooo0oO = oooOOOO2;
                this.f25306Oooo0o = 1;
                OooO0OO oooO0OO = OooO0OO.f40754OooO00o;
                String str = OooO0OO.f40762OooOO0;
                Object objOooO0OO = o0000O0.OooO0OO(new AccountRepo$checkAccountDeleteEnable$$inlined$call$1(com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 1), null), this);
                if (objOooO0OO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOOOO = oooOOOO2;
                obj = objOooO0OO;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooOOOO = (OooOOOO) this.f25307Oooo0oO;
                ResultKt.throwOnFailure(obj);
            }
            oooOOOO.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final OooOOOO<ApiResult<Object>> checkAccountDeleteEnable() {
        return OooOOO0.OooO00o(this, new OooO00o(null));
    }
}
