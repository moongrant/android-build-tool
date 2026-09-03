package com.yalla.yalla.ui.vm.user;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.AccountRepo;
import com.yalla.yalla.data.repository.AccountRepo$getFirstRechargeInfo$$inlined$call$1;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.UserFirstRechargeModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p381o0OOoo0O.Oooo0;
import p385o0OOooOO.o00oOoo;
import p394o0Oo00oO.o0O0O00;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o0OOO0o;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"Lcom/yalla/yalla/ui/vm/user/MyUserInfoVM;", "Lo0Oo00oO/o0O0O00;", "", "loadUserFirstRechargeModel", "syncUserInfo", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class MyUserInfoVM extends o0O0O00 {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.MyUserInfoVM$loadUserFirstRechargeModel$1", f = "MyUserInfoVM.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32690OooO0Oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            UserFirstRechargeModel userFirstRechargeModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32690OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountRepo accountRepo = AccountRepo.f22858OooO00o;
                this.f32690OooO0Oo = 1;
                accountRepo.getClass();
                String str = Oooo0.f44257OooOO0;
                obj = OooOOO.OooO0Oo(new AccountRepo$getFirstRechargeInfo$$inlined$call$1(o00oOoo.OooO00o(str, "url", str, 0), null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess() && (userFirstRechargeModel = (UserFirstRechargeModel) apiResult.getData()) != null) {
                o00Oo0.OooO0OO().OooOO0O(userFirstRechargeModel.getFirstRechargeCompleted());
                o0OOO0o o0ooo0oOooO0OO = o00Oo0.OooO0OO();
                boolean monthlyFirstRechargeCompleted = userFirstRechargeModel.getMonthlyFirstRechargeCompleted();
                o0ooo0oOooO0OO.getClass();
                o0ooo0oOooO0OO.OooO0o("isFirstChargeMonthlyShow" + o000000O.OooOOo0().getValue(), monthlyFirstRechargeCompleted);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.MyUserInfoVM$syncUserInfo$1", f = "MyUserInfoVM.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32691OooO0Oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO0O0(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32691OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountRepo accountRepo = AccountRepo.f22858OooO00o;
                this.f32691OooO0Oo = 1;
                if (accountRepo.OooO0o0(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public MyUserInfoVM() {
        loadUserFirstRechargeModel();
    }

    private final void loadUserFirstRechargeModel() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(null), 3, null);
    }

    public final void syncUserInfo() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0O0(null), 2, null);
    }
}
