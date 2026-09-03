package com.yalla.yalla.ui.vm.account;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.appsflyer.AppsFlyerProperties;
import com.code.android.util.OooOOO;
import com.code.android.util.o00oO0o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.qiniu.android.collect.ReportItem;
import com.yalla.yalla.data.repository.AccountRepo;
import com.yalla.yalla.data.repository.AccountRepo$bindingPhone$$inlined$call$1;
import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.model.LoginToken;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.MyUserInfoModel;
import java.util.List;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o0ooOOo;
import p382o0OOoo.OooOOO0;
import p386o0OOooO.o000000;
import p391o0OOooo0.oo000o;
import p412o0Oo0o0O.o00O0OO;
import p414o0Oo0oO.oO000O0;
import p415o0Oo0oO0.o00Ooo;
import p423o0OoO0OO.o00O00OO;
import p590o0oOooo0.oOO0OOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ2\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fJ\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ*\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/ui/vm/account/PasswordVM;", "Lcom/yalla/yalla/ui/vm/account/LoginVM;", "()V", "phoneRegister", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/LoginListModel;", "phone", "", "password", "smsCode", "userBindingPhone", "", "code", "isOpenProtection", "", "userPhoneLogin", "account", "userResetPassword", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PasswordVM extends LoginVM {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.PasswordVM$phoneRegister$1", f = "PasswordVM.kt", i = {0, 1, 1}, l = {12, 14, 27}, m = "invokeSuspend", n = {"$this$liveDataAsync", "$this$liveDataAsync", ReportItem.QualityKeyResult}, s = {"L$0", "L$0", "L$1"})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<LoginListModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ String f31121OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ApiResult f31122OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f31123OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f31124OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f31125OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f31126OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ PasswordVM f31127OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, String str2, String str3, PasswordVM passwordVM, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f31125OooO0oO = str;
            this.f31126OooO0oo = str2;
            this.f31121OooO = str3;
            this.f31127OooOO0 = passwordVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f31125OooO0oO, this.f31126OooO0oo, this.f31121OooO, this.f31127OooOO0, continuation);
            oooO00o.f31123OooO0o = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<LoginListModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:27:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:31:0x00fa A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            ApiResult apiResult;
            LiveDataScope liveDataScope2;
            ApiResult apiResult2;
            int iOooO0OO;
            String value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31124OooO0o0;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31123OooO0o;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    apiResult2 = this.f31122OooO0Oo;
                    liveDataScope2 = (LiveDataScope) this.f31123OooO0o;
                    ResultKt.throwOnFailure(obj);
                    iOooO0OO = o00Ooo.OooO00o().OooO0OO("signCountryId", 0);
                    value = o00Ooo.OooO00o().OooO0o0("signInNumber", "");
                    if (iOooO0OO != 0) {
                        o00Ooo.OooO00o().OooO0oO(iOooO0OO, "loginCountryId");
                        o00Ooo.OooO00o().OooO0oO(0, "signCountryId");
                    }
                    if (o00O00OO.OooO0o(value)) {
                        oO000O0 oo000o0OooO00o = o00Ooo.OooO00o();
                        oo000o0OooO00o.getClass();
                        Intrinsics.checkNotNullParameter(value, "value");
                        oo000o0OooO00o.OooO("loginPhoneNumber", value);
                        oO000O0 oo000o0OooO00o2 = o00Ooo.OooO00o();
                        oo000o0OooO00o2.getClass();
                        Intrinsics.checkNotNullParameter("", AppMeasurementSdk.ConditionalUserProperty.VALUE);
                        oo000o0OooO00o2.OooO("signInNumber", "");
                    }
                    apiResult = apiResult2;
                    liveDataScope = liveDataScope2;
                    this.f31123OooO0o = null;
                    this.f31122OooO0Oo = null;
                    this.f31124OooO0o0 = 3;
                    if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            LiveDataScope liveDataScope3 = (LiveDataScope) this.f31123OooO0o;
            o00O0OO o00o0oo2 = o00O0OO.f46099OooO00o;
            this.f31123OooO0o = liveDataScope3;
            this.f31124OooO0o0 = 1;
            Object objOooOO0o = o00o0oo2.OooOO0o(this.f31125OooO0oO, this.f31126OooO0oo, this.f31121OooO, this);
            if (objOooOO0o == coroutine_suspended) {
                return coroutine_suspended;
            }
            liveDataScope = liveDataScope3;
            obj = objOooOO0o;
            apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                PasswordVM passwordVM = this.f31127OooOO0;
                Object data = apiResult.getData();
                Intrinsics.checkNotNull(data);
                boolean isFirst = ((LoginListModel) data).getIsFirst();
                Object data2 = apiResult.getData();
                Intrinsics.checkNotNull(data2);
                List<MyUserInfoModel> data3 = ((LoginListModel) data2).getData();
                Intrinsics.checkNotNull(data3);
                MyUserInfoModel myUserInfoModel = data3.get(0);
                Object data4 = apiResult.getData();
                Intrinsics.checkNotNull(data4);
                LoginToken token = ((LoginListModel) data4).getToken();
                Intrinsics.checkNotNull(token);
                this.f31123OooO0o = liveDataScope;
                this.f31122OooO0Oo = apiResult;
                this.f31124OooO0o0 = 2;
                if (passwordVM.onLoginSuccess(isFirst, myUserInfoModel, token, null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                liveDataScope2 = liveDataScope;
                apiResult2 = apiResult;
                iOooO0OO = o00Ooo.OooO00o().OooO0OO("signCountryId", 0);
                value = o00Ooo.OooO00o().OooO0o0("signInNumber", "");
                if (iOooO0OO != 0) {
                    o00Ooo.OooO00o().OooO0oO(iOooO0OO, "loginCountryId");
                    o00Ooo.OooO00o().OooO0oO(0, "signCountryId");
                }
                if (o00O00OO.OooO0o(value)) {
                    oO000O0 oo000o0OooO00o3 = o00Ooo.OooO00o();
                    oo000o0OooO00o3.getClass();
                    Intrinsics.checkNotNullParameter(value, "value");
                    oo000o0OooO00o3.OooO("loginPhoneNumber", value);
                    oO000O0 oo000o0OooO00o4 = o00Ooo.OooO00o();
                    oo000o0OooO00o4.getClass();
                    Intrinsics.checkNotNullParameter("", AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    oo000o0OooO00o4.OooO("signInNumber", "");
                }
                apiResult = apiResult2;
                liveDataScope = liveDataScope2;
            }
            this.f31123OooO0o = null;
            this.f31122OooO0Oo = null;
            this.f31124OooO0o0 = 3;
            if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.PasswordVM$userBindingPhone$1", f = "PasswordVM.kt", i = {}, l = {41, 41}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f31128OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31129OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31130OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31131OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f31132OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f31133OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, String str2, String str3, int i, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f31130OooO0o = str;
            this.f31132OooO0oO = str2;
            this.f31133OooO0oo = str3;
            this.f31128OooO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f31130OooO0o, this.f31132OooO0oO, this.f31133OooO0oo, this.f31128OooO, continuation);
            oooO0O0.f31131OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31129OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31131OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31131OooO0o0;
            AccountRepo accountRepo = AccountRepo.f22385OooO00o;
            this.f31131OooO0o0 = liveDataScope;
            this.f31129OooO0Oo = 1;
            accountRepo.getClass();
            String str = OooOOO0.f43300OooOOO0;
            o0ooOOo o0oooooOooO00o = oo000o.OooO00o(str, "url", str, 1);
            o0oooooOooO00o.OooO0O0(this.f31130OooO0o, "accounts");
            o0oooooOooO00o.OooO0O0(this.f31133OooO0oo, "code");
            o0oooooOooO00o.OooO0O0(oOO0OOO.OooO00o(this.f31132OooO0oO), "password");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(2), AppsFlyerProperties.CHANNEL);
            o0oooooOooO00o.OooO0O0(o000000.OooO00o(), "uniqueid");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(this.f31128OooO), "isOpenProtection");
            o0oooooOooO00o.OooO0O0(o000000.OooO0O0(), "phoneBrand");
            o0oooooOooO00o.OooO0O0(o000000.OooO0OO(), "phoneType");
            o0oooooOooO00o.OooO0O0(o000000.OooO0Oo(), "phoneVersion");
            obj = OooOOO.OooO0Oo(new AccountRepo$bindingPhone$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31131OooO0o0 = null;
            this.f31129OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.PasswordVM$userPhoneLogin$1", f = "PasswordVM.kt", i = {0, 1, 1}, l = {35, 36, 37}, m = "invokeSuspend", n = {"$this$liveDataAsync", "$this$liveDataAsync", ReportItem.QualityKeyResult}, s = {"L$0", "L$0", "L$1"})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<LoginListModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ PasswordVM f31134OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ApiResult f31135OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f31136OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f31137OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f31138OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f31139OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, String str2, PasswordVM passwordVM, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f31138OooO0oO = str;
            this.f31139OooO0oo = str2;
            this.f31134OooO = passwordVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f31138OooO0oO, this.f31139OooO0oo, this.f31134OooO, continuation);
            oooO0OO.f31136OooO0o = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<LoginListModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00ab A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            ApiResult apiResult;
            LiveDataScope liveDataScope2;
            ApiResult apiResult2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31137OooO0o0;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31136OooO0o;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    apiResult2 = this.f31135OooO0Oo;
                    liveDataScope2 = (LiveDataScope) this.f31136OooO0o;
                    ResultKt.throwOnFailure(obj);
                    apiResult = apiResult2;
                    liveDataScope = liveDataScope2;
                    this.f31136OooO0o = null;
                    this.f31135OooO0Oo = null;
                    this.f31137OooO0o0 = 3;
                    if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            LiveDataScope liveDataScope3 = (LiveDataScope) this.f31136OooO0o;
            o00O0OO o00o0oo2 = o00O0OO.f46099OooO00o;
            this.f31136OooO0o = liveDataScope3;
            this.f31137OooO0o0 = 1;
            Object objOooO0o0 = o00o0oo2.OooO0o0(this.f31138OooO0oO, this.f31139OooO0oo, this);
            if (objOooO0o0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            liveDataScope = liveDataScope3;
            obj = objOooO0o0;
            apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                PasswordVM passwordVM = this.f31134OooO;
                Object data = apiResult.getData();
                Intrinsics.checkNotNull(data);
                boolean isFirst = ((LoginListModel) data).getIsFirst();
                Object data2 = apiResult.getData();
                Intrinsics.checkNotNull(data2);
                List<MyUserInfoModel> data3 = ((LoginListModel) data2).getData();
                Intrinsics.checkNotNull(data3);
                MyUserInfoModel myUserInfoModel = data3.get(0);
                Object data4 = apiResult.getData();
                Intrinsics.checkNotNull(data4);
                LoginToken token = ((LoginListModel) data4).getToken();
                Intrinsics.checkNotNull(token);
                this.f31136OooO0o = liveDataScope;
                this.f31135OooO0Oo = apiResult;
                this.f31137OooO0o0 = 2;
                if (passwordVM.onLoginSuccess(isFirst, myUserInfoModel, token, null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                liveDataScope2 = liveDataScope;
                apiResult2 = apiResult;
                apiResult = apiResult2;
                liveDataScope = liveDataScope2;
            }
            this.f31136OooO0o = null;
            this.f31135OooO0Oo = null;
            this.f31137OooO0o0 = 3;
            if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.PasswordVM$userResetPassword$1", f = "PasswordVM.kt", i = {}, l = {31, 31}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31140OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31141OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31142OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f31143OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f31144OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(String str, String str2, String str3, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f31141OooO0o = str;
            this.f31143OooO0oO = str2;
            this.f31144OooO0oo = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f31141OooO0o, this.f31143OooO0oO, this.f31144OooO0oo, continuation);
            oooO0o.f31142OooO0o0 = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31140OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31142OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31142OooO0o0;
            o00O0OO o00o0oo2 = o00O0OO.f46099OooO00o;
            this.f31142OooO0o0 = liveDataScope;
            this.f31140OooO0Oo = 1;
            obj = o00o0oo2.OooOOO(this.f31141OooO0o, this.f31143OooO0oO, this.f31144OooO0oo, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31142OooO0o0 = null;
            this.f31140OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final LiveData<ApiResult<LoginListModel>> phoneRegister(@NotNull String phone, @NotNull String password, @NotNull String smsCode) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(smsCode, "smsCode");
        return o00oO0o.OooO00o(new OooO00o(phone, password, smsCode, this, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> userBindingPhone(@NotNull String phone, @NotNull String password, @NotNull String code, int isOpenProtection) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(code, "code");
        return o00oO0o.OooO00o(new OooO0O0(phone, password, code, isOpenProtection, null));
    }

    @NotNull
    public final LiveData<ApiResult<LoginListModel>> userPhoneLogin(@NotNull String account, @NotNull String password) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(password, "password");
        return o00oO0o.OooO00o(new OooO0OO(account, password, this, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> userResetPassword(@NotNull String phone, @NotNull String password, @NotNull String code) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(code, "code");
        return o00oO0o.OooO00o(new OooO0o(phone, password, code, null));
    }
}
