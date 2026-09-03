package com.yalla.yalla.ui.vm.account;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import com.appsflyer.AppsFlyerProperties;
import com.code.android.util.OooOOO;
import com.code.android.util.o000O00O;
import com.code.android.util.o00oO0o;
import com.yalla.yalla.data.repository.AccountRepo;
import com.yalla.yalla.data.repository.AccountRepo$deleteAccount$$inlined$call$1;
import com.yalla.yalla.data.repository.AccountRepo$getAccountConfirmInfo$$inlined$call$1;
import com.yalla.yalla.data.repository.AccountRepo$loadAccountBindInfo$$inlined$call$1;
import com.yalla.yalla.data.repository.AccountRepo$unbindAccount$$inlined$call$1;
import com.yalla.yalla.data.repository.AccountRepo$untieAccountBind$$inlined$call$1;
import com.yalla.yalla.data.repository.AccountRepo$userPasswordEdit$$inlined$call$1;
import com.yalla.yalla.data.repository.AccountRepo$verifyThirdAccount$$inlined$call$1;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.model.AccountBindResult;
import com.yalla.yalla.model.AccountConfirmInfo;
import com.yalla.yalla.model.DeleteAccountParamsModel;
import com.yalla.yalla.model.LoginInformation2;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.open_auth.OpenAuthManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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
import p382o0OOoOo.o0ooOOo;
import p386o0OOoo0O.o000oOoO;
import p426o0OoO0Oo.o00O;
import p426o0OoO0Oo.o00OO00O;
import p426o0OoO0Oo.oo0oOO0;
import p587o0oOooO.oO000o00;
import p587o0oOooO.oO00O0oO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002J,\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\bJ,\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00030\u00132\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000eJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019J\"\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00030\u00022\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006¨\u0006\""}, d2 = {"Lcom/yalla/yalla/ui/vm/account/AccountVM;", "Lo0Oo0/OooOO0;", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/AccountBindInfo;", "getAccountBindInfo", "", "token", "", "type", "twitterSecretOrInsUserId", "Lcom/yalla/yalla/model/AccountBindResult;", "thirdAccountBind", "bindType", "Lo0OoO0Oo/o00O;", "", "untieAccountBind", "Lcom/yalla/yalla/open_auth/OpenAuthManager$AuthType;", "secret", "Lo0OoO0Oo/o00OO00O;", "", "unbindAccount", "verifyThirdAccount", "Lcom/yalla/yalla/model/AccountConfirmInfo;", "getAccountConfirmInfo", "Lcom/yalla/yalla/model/DeleteAccountParamsModel;", "deleteAccountParams", "deleteAccount", "oldpwd", "newpwd", "Lcom/yalla/yalla/model/LoginInformation2;", "userPasswordEdit", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class AccountVM extends p396o0Oo0.OooOO0 {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.AccountVM$unbindAccount$1", f = "AccountVM.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<o00OO00O<ApiResult<Boolean>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31031OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ OpenAuthManager.AuthType f31032OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31033OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f31034OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f31035OooO0oo;

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OpenAuthManager.AuthType.values().length];
                try {
                    iArr[OpenAuthManager.AuthType.Facebook.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OpenAuthManager.AuthType.Twitter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OpenAuthManager.AuthType.YallaChat.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(OpenAuthManager.AuthType authType, String str, String str2, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f31032OooO0o = authType;
            this.f31034OooO0oO = str;
            this.f31035OooO0oo = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f31032OooO0o, this.f31034OooO0oO, this.f31035OooO0oo, continuation);
            oooO.f31033OooO0o0 = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO00O<ApiResult<Boolean>> o00oo00o, Continuation<? super Unit> continuation) {
            return ((OooO) create(o00oo00o, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int i;
            o00OO00O o00oo00o;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f31031OooO0Oo;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO00O o00oo00o2 = (o00OO00O) this.f31033OooO0o0;
                String strOooO0O0 = oO000o00.OooO0O0(o000O00O.OooO00o());
                String strOooO00o = oO000o00.OooO00o();
                int i3 = OooO00o.$EnumSwitchMapping$0[this.f31032OooO0o.ordinal()];
                if (i3 == 1) {
                    i = 4;
                } else if (i3 != 2) {
                    i = i3 != 3 ? 0 : 12;
                } else {
                    i = 9;
                }
                AccountRepo accountRepo = AccountRepo.f22392OooO00o;
                this.f31033OooO0o0 = o00oo00o2;
                this.f31031OooO0Oo = 1;
                accountRepo.getClass();
                String str = p384o0OOoo.OooOOO0.f43301OooOOOO;
                o0ooOOo o0oooooOooO00o = com.common.support.apm.netdetector.OooO00o.OooO00o(str, "url", str, 1);
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(i), AppsFlyerProperties.CHANNEL);
                o0oooooOooO00o.OooO0O0(this.f31034OooO0oO, "authToken");
                o0oooooOooO00o.OooO0O0(this.f31035OooO0oo, "authTokenSecret");
                o0oooooOooO00o.OooO0O0(strOooO0O0, "simCountryCode");
                o0oooooOooO00o.OooO0O0(strOooO00o, "deviceCountryCode");
                Object objOooO0Oo = OooOOO.OooO0Oo(new AccountRepo$unbindAccount$$inlined$call$1(o0oooooOooO00o, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo00o = o00oo00o2;
                obj = objOooO0Oo;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo00o = (o00OO00O) this.f31033OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o00oo00o.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.AccountVM$deleteAccount$1$1", f = "AccountVM.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00O f31036OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o00O<String> f31037OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f31038OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ DeleteAccountParamsModel f31039OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f31040OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00O<String> o00o2, DeleteAccountParamsModel deleteAccountParamsModel, String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f31037OooO0o = o00o2;
            this.f31039OooO0oO = deleteAccountParamsModel;
            this.f31040OooO0oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f31037OooO0o, this.f31039OooO0oO, this.f31040OooO0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            o00O o00o2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31038OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountRepo accountRepo = AccountRepo.f22392OooO00o;
                DeleteAccountParamsModel deleteAccountParamsModel = this.f31039OooO0oO;
                int reasonTypeOne = deleteAccountParamsModel != null ? deleteAccountParamsModel.getReasonTypeOne() : 0;
                Integer reasonTypeTwo = deleteAccountParamsModel != null ? deleteAccountParamsModel.getReasonTypeTwo() : null;
                o00O<String> o00o3 = this.f31037OooO0o;
                this.f31036OooO0Oo = o00o3;
                this.f31038OooO0o0 = 1;
                String str = this.f31040OooO0oo;
                accountRepo.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AccountRepo$deleteAccount$$inlined$call$1(accountRepo, null, reasonTypeOne, reasonTypeTwo, str), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00o2 = o00o3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00o2 = this.f31036OooO0Oo;
                ResultKt.throwOnFailure(obj);
            }
            o00o2.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.AccountVM$getAccountBindInfo$1", f = "AccountVM.kt", i = {}, l = {18, 18}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<AccountBindInfo>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31041OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31042OooO0o0;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(continuation);
            oooO0O0.f31042OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<AccountBindInfo>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31041OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31042OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31042OooO0o0;
            AccountRepo accountRepo = AccountRepo.f22392OooO00o;
            this.f31042OooO0o0 = liveDataScope;
            this.f31041OooO0Oo = 1;
            accountRepo.getClass();
            String str = p384o0OOoo.OooOOO0.f43294OooO0oO;
            obj = OooOOO.OooO0Oo(new AccountRepo$loadAccountBindInfo$$inlined$call$1(com.common.support.apm.netdetector.OooO00o.OooO00o(str, "url", str, 0), null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31042OooO0o0 = null;
            this.f31041OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.AccountVM$getAccountConfirmInfo$1$1", f = "AccountVM.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00O f31043OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o00O<AccountConfirmInfo> f31044OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f31045OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o00O<AccountConfirmInfo> o00o2, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f31044OooO0o = o00o2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f31044OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            o00O o00o2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31045OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountRepo accountRepo = AccountRepo.f22392OooO00o;
                o00O<AccountConfirmInfo> o00o3 = this.f31044OooO0o;
                this.f31043OooO0Oo = o00o3;
                this.f31045OooO0o0 = 1;
                accountRepo.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AccountRepo$getAccountConfirmInfo$$inlined$call$1(accountRepo, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00o2 = o00o3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00o2 = this.f31043OooO0Oo;
                ResultKt.throwOnFailure(obj);
            }
            o00o2.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.AccountVM$thirdAccountBind$1", f = "AccountVM.kt", i = {}, l = {22, 22}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<AccountBindResult>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31046OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31047OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31048OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f31049OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f31050OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(String str, String str2, int i, Continuation continuation) {
            super(2, continuation);
            this.f31047OooO0o = str;
            this.f31049OooO0oO = i;
            this.f31050OooO0oo = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            int i = this.f31049OooO0oO;
            OooO0o oooO0o = new OooO0o(this.f31047OooO0o, this.f31050OooO0oo, i, continuation);
            oooO0o.f31048OooO0o0 = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<AccountBindResult>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31046OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31048OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31048OooO0o0;
            AccountRepo accountRepo = AccountRepo.f22392OooO00o;
            this.f31048OooO0o0 = liveDataScope;
            this.f31046OooO0Oo = 1;
            accountRepo.getClass();
            obj = AccountRepo.OooO0OO(this.f31047OooO0o, this.f31050OooO0oo, this.f31049OooO0oO, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31048OooO0o0 = null;
            this.f31046OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.AccountVM$untieAccountBind$1$1", f = "AccountVM.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00O f31051OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o00O<Object> f31052OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f31053OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f31054OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o00O<Object> o00o2, int i, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f31052OooO0o = o00o2;
            this.f31054OooO0oO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0(this.f31052OooO0o, this.f31054OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            o00O<Object> o00o2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31053OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountRepo accountRepo = AccountRepo.f22392OooO00o;
                o00O<Object> o00o3 = this.f31052OooO0o;
                this.f31051OooO0Oo = o00o3;
                this.f31053OooO0o0 = 1;
                accountRepo.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AccountRepo$untieAccountBind$$inlined$call$1(accountRepo, null, this.f31054OooO0oO), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00o2 = o00o3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00o2 = this.f31051OooO0Oo;
                ResultKt.throwOnFailure(obj);
            }
            o00o2.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.AccountVM$userPasswordEdit$1", f = "AccountVM.kt", i = {}, l = {74, 74}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<LiveDataScope<ApiResult<LoginInformation2>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31055OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31056OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31057OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f31058OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(String str, String str2, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f31056OooO0o = str;
            this.f31058OooO0oO = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0O oooOO0O = new OooOO0O(this.f31056OooO0o, this.f31058OooO0oO, continuation);
            oooOO0O.f31057OooO0o0 = obj;
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
            int i = this.f31055OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31057OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31057OooO0o0;
            AccountRepo accountRepo = AccountRepo.f22392OooO00o;
            this.f31057OooO0o0 = liveDataScope;
            this.f31055OooO0Oo = 1;
            accountRepo.getClass();
            String str = o000oOoO.f43369Oooo0OO;
            o0ooOOo o0oooooOooO00o = com.common.support.apm.netdetector.OooO00o.OooO00o(str, "url", str, 0);
            o0oooooOooO00o.OooO0O0(oO00O0oO.OooO00o(this.f31056OooO0o), "oldpwd");
            o0oooooOooO00o.OooO0O0(oO00O0oO.OooO00o(this.f31058OooO0oO), "newpwd");
            o0oooooOooO00o.OooO00o();
            obj = OooOOO.OooO0Oo(new AccountRepo$userPasswordEdit$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31057OooO0o0 = null;
            this.f31055OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.AccountVM$verifyThirdAccount$1$1", f = "AccountVM.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ String f31059OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o00O f31060OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o00O<String> f31061OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f31062OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f31063OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f31064OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(o00O<String> o00o2, int i, String str, String str2, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f31061OooO0o = o00o2;
            this.f31063OooO0oO = i;
            this.f31064OooO0oo = str;
            this.f31059OooO = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO0(this.f31061OooO0o, this.f31063OooO0oO, this.f31064OooO0oo, this.f31059OooO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            o00O o00o2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31062OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountRepo accountRepo = AccountRepo.f22392OooO00o;
                o00O<String> o00o3 = this.f31061OooO0o;
                this.f31060OooO0Oo = o00o3;
                this.f31062OooO0o0 = 1;
                String str = this.f31064OooO0oo;
                String str2 = this.f31059OooO;
                int i2 = this.f31063OooO0oO;
                accountRepo.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new AccountRepo$verifyThirdAccount$$inlined$call$1(accountRepo, null, i2, str, str2), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00o2 = o00o3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00o2 = this.f31060OooO0Oo;
                ResultKt.throwOnFailure(obj);
            }
            o00o2.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final o00O<String> deleteAccount(@Nullable DeleteAccountParamsModel deleteAccountParams) {
        o00O<String> o00o2 = new o00O<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(o00o2, deleteAccountParams, (deleteAccountParams == null || deleteAccountParams.getInputText() == null) ? null : oO00O0oO.OooO0O0(deleteAccountParams.getInputText()), null), 3, null);
        return o00o2;
    }

    @NotNull
    public final LiveData<ApiResult<AccountBindInfo>> getAccountBindInfo() {
        return o00oO0o.OooO00o(new OooO0O0(null));
    }

    @NotNull
    public final o00O<AccountConfirmInfo> getAccountConfirmInfo() {
        o00O<AccountConfirmInfo> o00o2 = new o00O<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0OO(o00o2, null), 3, null);
        return o00o2;
    }

    @NotNull
    public final LiveData<ApiResult<AccountBindResult>> thirdAccountBind(@NotNull String token, int type, @Nullable String twitterSecretOrInsUserId) {
        Intrinsics.checkNotNullParameter(token, "token");
        return o00oO0o.OooO00o(new OooO0o(token, twitterSecretOrInsUserId, type, null));
    }

    @NotNull
    public final o00OO00O<ApiResult<Boolean>> unbindAccount(@NotNull OpenAuthManager.AuthType type, @NotNull String token, @Nullable String secret) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(token, "token");
        return oo0oOO0.OooO00o(this, new OooO(type, token, secret, null));
    }

    @NotNull
    public final o00O<Object> untieAccountBind(int bindType) {
        o00O<Object> o00o2 = new o00O<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooOO0(o00o2, bindType, null), 3, null);
        return o00o2;
    }

    @NotNull
    public final LiveData<ApiResult<LoginInformation2>> userPasswordEdit(@NotNull String oldpwd, @NotNull String newpwd) {
        Intrinsics.checkNotNullParameter(oldpwd, "oldpwd");
        Intrinsics.checkNotNullParameter(newpwd, "newpwd");
        return o00oO0o.OooO00o(new OooOO0O(oldpwd, newpwd, null));
    }

    @NotNull
    public final o00O<String> verifyThirdAccount(int type, @NotNull String token, @Nullable String twitterSecretOrInsUserId) {
        Intrinsics.checkNotNullParameter(token, "token");
        o00O<String> o00o2 = new o00O<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooOOO0(o00o2, type, token, twitterSecretOrInsUserId, null), 3, null);
        return o00o2;
    }
}
