package com.yalla.yalla.ui.vm.account;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import com.app.base.model.LoginInformation2;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.data.manager.AccountDataManager$userPasswordEdit$$inlined$callByOldModel$1;
import com.yalla.yalla.data.repository.AccountRepo;
import com.yalla.yalla.data.repository.AccountRepo$bindThirdAccount$$inlined$call$1;
import com.yalla.yalla.data.repository.AccountRepo$deleteAccount$$inlined$call$1;
import com.yalla.yalla.data.repository.AccountRepo$getAccountConfirmInfo$$inlined$call$1;
import com.yalla.yalla.data.repository.AccountRepo$loadAccountBindInfo$$inlined$call$1;
import com.yalla.yalla.data.repository.AccountRepo$untieAccountBind$$inlined$call$1;
import com.yalla.yalla.data.repository.AccountRepo$verifyThirdAccount$$inlined$call$1;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.model.AccountBindResult;
import com.yalla.yalla.model.AccountConfirmInfo;
import com.yalla.yalla.model.AccountPrivacy;
import com.yalla.yalla.model.DeleteAccountParamsModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o0ooOOo;
import p254o00ooO0O.o0000O0;
import p254o00ooO0O.o0000O0O;
import p495o0o00OOO.Oooo0;
import p516o0o0O000.o000oOoO;
import p518o0o0O00o.o000;
import p547o0o0o00O.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\f\u001a\u00020\u0007J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015J\"\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/ui/vm/account/AccountVM;", "Lo00OO/OooO00o;", "Lo0o00OOO/Oooo0;", "Lcom/yalla/yalla/model/AccountBindInfo;", "getAccountBindInfo", "", FirebaseMessagingService.EXTRA_TOKEN, "", "type", "twitterSecretOrInsUserId", "Lcom/yalla/yalla/model/AccountBindResult;", "thirdAccountBind", "bindType", "", "untieAccountBind", "verifyThirdAccount", "Lcom/yalla/yalla/model/AccountConfirmInfo;", "getAccountConfirmInfo", "Lcom/yalla/yalla/model/DeleteAccountParamsModel;", "deleteAccountParams", "deleteAccount", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/model/AccountPrivacy;", "getAccountPrivacy", "oldpwd", "newpwd", "Lcom/app/base/model/LoginInformation2;", "userPasswordEdit", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class AccountVM extends o00OO.OooO00o {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.AccountVM$thirdAccountBind$1$1", f = "AccountVM.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f25267Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Oooo0 f25268Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25269Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Oooo0<AccountBindResult> f25270Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f25271OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f25272OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Oooo0<AccountBindResult> oooo0, String str, int i, String str2, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f25270Oooo0oo = oooo0;
            this.f25267Oooo = str;
            this.f25272OoooO00 = i;
            this.f25271OoooO0 = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(this.f25270Oooo0oo, this.f25267Oooo, this.f25272OoooO00, this.f25271OoooO0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Oooo0 oooo0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25269Oooo0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0<AccountBindResult> oooo1 = this.f25270Oooo0oo;
                AccountRepo accountRepo = AccountRepo.f21408OooO00o;
                String str = this.f25267Oooo;
                int i2 = this.f25272OoooO00;
                String str2 = this.f25271OoooO0;
                this.f25268Oooo0o = oooo1;
                this.f25269Oooo0oO = 1;
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AccountRepo$bindThirdAccount$$inlined$call$1(accountRepo, null, i2, str, str2), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooo0 = oooo1;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooo0 = this.f25268Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            oooo0.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.AccountVM$deleteAccount$1$1", f = "AccountVM.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ DeleteAccountParamsModel f25273Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Oooo0 f25274Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25275Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Oooo0<String> f25276Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f25277OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Oooo0<String> oooo0, DeleteAccountParamsModel deleteAccountParamsModel, String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25276Oooo0oo = oooo0;
            this.f25273Oooo = deleteAccountParamsModel;
            this.f25277OoooO00 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f25276Oooo0oo, this.f25273Oooo, this.f25277OoooO00, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Oooo0 oooo0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25275Oooo0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0<String> oooo1 = this.f25276Oooo0oo;
                AccountRepo accountRepo = AccountRepo.f21408OooO00o;
                DeleteAccountParamsModel deleteAccountParamsModel = this.f25273Oooo;
                int reasonTypeOne = deleteAccountParamsModel != null ? deleteAccountParamsModel.getReasonTypeOne() : 0;
                DeleteAccountParamsModel deleteAccountParamsModel2 = this.f25273Oooo;
                Integer reasonTypeTwo = deleteAccountParamsModel2 != null ? deleteAccountParamsModel2.getReasonTypeTwo() : null;
                String str = this.f25277OoooO00;
                this.f25274Oooo0o = oooo1;
                this.f25275Oooo0oO = 1;
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AccountRepo$deleteAccount$$inlined$call$1(accountRepo, null, reasonTypeOne, reasonTypeTwo, str), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooo0 = oooo1;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooo0 = this.f25274Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            oooo0.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.AccountVM$getAccountBindInfo$1$1", f = "AccountVM.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Oooo0 f25278Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25279Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Oooo0<AccountBindInfo> f25280Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Oooo0<AccountBindInfo> oooo0, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f25280Oooo0oo = oooo0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f25280Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Oooo0 oooo0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25279Oooo0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0<AccountBindInfo> oooo1 = this.f25280Oooo0oo;
                AccountRepo accountRepo = AccountRepo.f21408OooO00o;
                this.f25278Oooo0o = oooo1;
                this.f25279Oooo0oO = 1;
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AccountRepo$loadAccountBindInfo$$inlined$call$1(accountRepo, null), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooo0 = oooo1;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooo0 = this.f25278Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            oooo0.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.AccountVM$getAccountConfirmInfo$1$1", f = "AccountVM.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Oooo0 f25281Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25282Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Oooo0<AccountConfirmInfo> f25283Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Oooo0<AccountConfirmInfo> oooo0, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f25283Oooo0oo = oooo0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f25283Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Oooo0 oooo0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25282Oooo0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0<AccountConfirmInfo> oooo1 = this.f25283Oooo0oo;
                AccountRepo accountRepo = AccountRepo.f21408OooO00o;
                this.f25281Oooo0o = oooo1;
                this.f25282Oooo0oO = 1;
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AccountRepo$getAccountConfirmInfo$$inlined$call$1(accountRepo, null), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooo0 = oooo1;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooo0 = this.f25281Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            oooo0.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.AccountVM$getAccountPrivacy$1", f = "AccountVM.kt", i = {}, l = {65, 65}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<AccountPrivacy>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25284Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25285Oooo0oO;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(continuation);
            oooO0o.f25285Oooo0oO = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<AccountPrivacy>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25284Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25285Oooo0oO;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25285Oooo0oO;
            o000 o000Var = o000.f42171OooO00o;
            this.f25285Oooo0oO = liveDataScope;
            this.f25284Oooo0o = 1;
            obj = o000Var.OooO00o(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25285Oooo0oO = null;
            this.f25284Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.AccountVM$untieAccountBind$1$1", f = "AccountVM.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f25286Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Oooo0 f25287Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25288Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Oooo0<Object> f25289Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(Oooo0<Object> oooo0, int i, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f25289Oooo0oo = oooo0;
            this.f25286Oooo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0(this.f25289Oooo0oo, this.f25286Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Oooo0<Object> oooo0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25288Oooo0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0<Object> oooo1 = this.f25289Oooo0oo;
                AccountRepo accountRepo = AccountRepo.f21408OooO00o;
                int i2 = this.f25286Oooo;
                this.f25287Oooo0o = oooo1;
                this.f25288Oooo0oO = 1;
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AccountRepo$untieAccountBind$$inlined$call$1(accountRepo, null, i2), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooo0 = oooo1;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooo0 = this.f25287Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            oooo0.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.AccountVM$userPasswordEdit$1", f = "AccountVM.kt", i = {}, l = {69, 69}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<LiveDataScope<ApiResult<LoginInformation2>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f25290Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25291Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25292Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f25293Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(String str, String str2, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f25293Oooo0oo = str;
            this.f25290Oooo = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0O oooOO0O = new OooOO0O(this.f25293Oooo0oo, this.f25290Oooo, continuation);
            oooOO0O.f25292Oooo0oO = obj;
            return oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<LoginInformation2>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25291Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25292Oooo0oO;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f25292Oooo0oO;
            o000 o000Var = o000.f42171OooO00o;
            String str = this.f25293Oooo0oo;
            String str2 = this.f25290Oooo;
            this.f25292Oooo0oO = liveDataScope;
            this.f25291Oooo0o = 1;
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            String str3 = o0ooOOo.f32254Oooo0OO;
            o00O000o o00o000oOooO0O0 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str3, "url", str3, 0);
            o00o000oOooO0O0.OooO0O0("oldpwd", o000oOoO.OooO00o(str));
            o00o000oOooO0O0.OooO0O0("newpwd", o000oOoO.OooO00o(str2));
            obj = o0000O0.OooO0OO(new AccountDataManager$userPasswordEdit$$inlined$callByOldModel$1(o00o000oOooO0O0, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25292Oooo0oO = null;
            this.f25291Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.AccountVM$verifyThirdAccount$1$1", f = "AccountVM.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f25294Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Oooo0 f25295Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25296Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Oooo0<String> f25297Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f25298OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f25299OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Oooo0<String> oooo0, int i, String str, String str2, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f25297Oooo0oo = oooo0;
            this.f25294Oooo = i;
            this.f25299OoooO00 = str;
            this.f25298OoooO0 = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO0(this.f25297Oooo0oo, this.f25294Oooo, this.f25299OoooO00, this.f25298OoooO0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Oooo0 oooo0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25296Oooo0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0<String> oooo1 = this.f25297Oooo0oo;
                AccountRepo accountRepo = AccountRepo.f21408OooO00o;
                int i2 = this.f25294Oooo;
                String str = this.f25299OoooO00;
                String str2 = this.f25298OoooO0;
                this.f25295Oooo0o = oooo1;
                this.f25296Oooo0oO = 1;
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AccountRepo$verifyThirdAccount$$inlined$call$1(accountRepo, null, i2, str, str2), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooo0 = oooo1;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooo0 = this.f25295Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            oooo0.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final Oooo0<String> deleteAccount(@Nullable DeleteAccountParamsModel deleteAccountParams) {
        Oooo0<String> oooo0 = new Oooo0<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(oooo0, deleteAccountParams, (deleteAccountParams == null || deleteAccountParams.getInputText() == null) ? null : o000oOoO.OooO0O0(deleteAccountParams.getInputText()), null), 3, null);
        return oooo0;
    }

    @NotNull
    public final Oooo0<AccountBindInfo> getAccountBindInfo() {
        Oooo0<AccountBindInfo> oooo0 = new Oooo0<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(oooo0, null), 3, null);
        return oooo0;
    }

    @NotNull
    public final Oooo0<AccountConfirmInfo> getAccountConfirmInfo() {
        Oooo0<AccountConfirmInfo> oooo0 = new Oooo0<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0OO(oooo0, null), 3, null);
        return oooo0;
    }

    @NotNull
    public final LiveData<ApiResult<AccountPrivacy>> getAccountPrivacy() {
        return o0000O0O.OooO00o(new OooO0o(null));
    }

    @NotNull
    public final Oooo0<AccountBindResult> thirdAccountBind(@NotNull String token, int type, @Nullable String twitterSecretOrInsUserId) {
        Intrinsics.checkNotNullParameter(token, "token");
        Oooo0<AccountBindResult> oooo0 = new Oooo0<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO(oooo0, token, type, twitterSecretOrInsUserId, null), 3, null);
        return oooo0;
    }

    @NotNull
    public final Oooo0<Object> untieAccountBind(int bindType) {
        Oooo0<Object> oooo0 = new Oooo0<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooOO0(oooo0, bindType, null), 3, null);
        return oooo0;
    }

    @NotNull
    public final LiveData<ApiResult<LoginInformation2>> userPasswordEdit(@NotNull String oldpwd, @NotNull String newpwd) {
        Intrinsics.checkNotNullParameter(oldpwd, "oldpwd");
        Intrinsics.checkNotNullParameter(newpwd, "newpwd");
        return o0000O0O.OooO00o(new OooOO0O(oldpwd, newpwd, null));
    }

    @NotNull
    public final Oooo0<String> verifyThirdAccount(int type, @NotNull String token, @Nullable String twitterSecretOrInsUserId) {
        Intrinsics.checkNotNullParameter(token, "token");
        Oooo0<String> oooo0 = new Oooo0<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooOOO0(oooo0, type, token, twitterSecretOrInsUserId, null), 3, null);
        return oooo0;
    }
}
