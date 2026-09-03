package com.yalla.yalla.ui.vm.account;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.data.repository.AccountRepo$deleteUserTrustDevice$$inlined$call$1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0;
import p480o0o000.OooO0OO;
import p547o0o0o00O.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R%\u0010\t\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/ui/vm/account/ProtectionDetailVM;", "Lo00OO/OooO00o;", "", "id", "", "deleteUserTrustDevice", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "isOperatingSuccess", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ProtectionDetailVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    @NotNull
    private final MutableLiveData<Boolean> isOperatingSuccess = new MutableLiveData<>(Boolean.FALSE);

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.ProtectionDetailVM$deleteUserTrustDevice$1", f = "ProtectionDetailVM.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25363Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ long f25364Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ ProtectionDetailVM f25365Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, ProtectionDetailVM protectionDetailVM, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25364Oooo0oO = j;
            this.f25365Oooo0oo = protectionDetailVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f25364Oooo0oO, this.f25365Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25363Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.f25364Oooo0oO;
                this.f25363Oooo0o = 1;
                OooO0OO oooO0OO = OooO0OO.f40754OooO00o;
                String str = OooO0OO.f40761OooO0oo;
                o00O000o o00o000oOooO0O0 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 0);
                o00o000oOooO0O0.OooO0O0("id", Boxing.boxLong(j));
                obj = o0000O0.OooO0OO(new AccountRepo$deleteUserTrustDevice$$inlined$call$1(o00o000oOooO0O0, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ProtectionDetailVM protectionDetailVM = this.f25365Oooo0oo;
            if (((ApiResult) obj).isSuccess()) {
                protectionDetailVM.isOperatingSuccess().postValue(Boxing.boxBoolean(true));
            }
            return Unit.INSTANCE;
        }
    }

    public final void deleteUserTrustDevice(long id) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO00o(id, this, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> isOperatingSuccess() {
        return this.isOperatingSuccess;
    }
}
