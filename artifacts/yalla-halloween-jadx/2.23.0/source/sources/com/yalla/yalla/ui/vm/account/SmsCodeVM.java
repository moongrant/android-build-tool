package com.yalla.yalla.ui.vm.account;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.StringKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import com.appsflyer.AppsFlyerProperties;
import com.code.android.util.OooOOO;
import com.code.android.util.o000O0;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.qiniu.android.collect.ReportItem;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.data.repository.AccountRepo;
import com.yalla.yalla.data.repository.AccountRepo$postAddTrustDevice$$inlined$call$1;
import com.yalla.yalla.model.GeetCodeModel;
import com.yalla.yalla.model.LoginModel;
import com.yalla.yalla.model.LoginToken;
import com.yalla.yalla.model.SmsCodeModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.MyUserInfoModel;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p063o0000oO.o00oO0o;
import p376o0OOoOOO.o0O0ooO;
import p381o0OOoo0O.Oooo0;
import p382o0OOoo0o.oo000o;
import p385o0OOooOO.o00oOoo;
import p406o0Oo0Ooo.e;
import p406o0Oo0Ooo.oOO0OO;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bJN\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\b26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000e0\u0012J\"\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00070\u00062\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bJ\"\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00070\u00062\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\bJ*\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00070\u00062\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\bJP\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00070\u00062\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010'\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004J*\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00070\u00062\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/yalla/yalla/ui/vm/account/SmsCodeVM;", "Lcom/yalla/yalla/ui/vm/account/LoginVM;", "()V", "mType", "Lcom/yalla/yalla/data/constant/ClientCodeType;", "checkVerCodeSendType", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "interval", "msgRandomNum", "", "apiType", "getGeetCode", "", "phoneNum", "scenes", "callBack", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "isOpen", "code", "phoneChange", "", "phone", "postAddTrustDevice", "type", "protectionLoginByPhone", "Lcom/yalla/yalla/model/LoginModel;", "isActivate", "sendPhoneCode", "Lcom/yalla/yalla/model/SmsCodeModel;", RemoteConfigConstants$RequestFieldKey.COUNTRY_CODE, AppsFlyerProperties.CHANNEL, "sendType", "geetinfo", "isoCode", "setClientType", "verCode", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SmsCodeVM extends LoginVM {
    public static final int $stable = 8;

    @Nullable
    private ClientCodeType mType;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.SmsCodeVM$protectionLoginByPhone$1", f = "SmsCodeVM.kt", i = {0, 1, 1}, l = {35, 37, 39}, m = "invokeSuspend", n = {"$this$liveDataAsync", "$this$liveDataAsync", ReportItem.QualityKeyResult}, s = {"L$0", "L$0", "L$1"})
    public static final class OooO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<LoginModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f31698OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ApiResult f31699OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f31700OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f31701OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f31702OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f31703OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ SmsCodeVM f31704OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(String str, String str2, int i, SmsCodeVM smsCodeVM, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f31702OooO0oO = str;
            this.f31703OooO0oo = str2;
            this.f31698OooO = i;
            this.f31704OooOO0 = smsCodeVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f31702OooO0oO, this.f31703OooO0oo, this.f31698OooO, this.f31704OooOO0, continuation);
            oooO.f31700OooO0o = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<LoginModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00cb A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            ApiResult apiResult;
            LiveDataScope liveDataScope2;
            ApiResult apiResult2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31701OooO0o0;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31700OooO0o;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    apiResult2 = this.f31699OooO0Oo;
                    liveDataScope2 = (LiveDataScope) this.f31700OooO0o;
                    ResultKt.throwOnFailure(obj);
                    apiResult = apiResult2;
                    liveDataScope = liveDataScope2;
                    this.f31700OooO0o = null;
                    this.f31699OooO0Oo = null;
                    this.f31701OooO0o0 = 3;
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
            LiveDataScope liveDataScope3 = (LiveDataScope) this.f31700OooO0o;
            e eVar = e.f44768OooO00o;
            this.f31700OooO0o = liveDataScope3;
            this.f31701OooO0o0 = 1;
            Object objOooOO0O = eVar.OooOO0O(this.f31702OooO0oO, this.f31703OooO0oo, this.f31698OooO, this);
            if (objOooOO0O == coroutine_suspended) {
                return coroutine_suspended;
            }
            liveDataScope = liveDataScope3;
            obj = objOooOO0O;
            apiResult = (ApiResult) obj;
            if (apiResult.isSuccess() && apiResult.getData() != null) {
                LoginModel loginModel = (LoginModel) apiResult.getData();
                if ((loginModel != null ? loginModel.getData() : null) != null) {
                    LoginModel loginModel2 = (LoginModel) apiResult.getData();
                    if ((loginModel2 != null ? loginModel2.getToken() : null) != null) {
                        SmsCodeVM smsCodeVM = this.f31704OooOO0;
                        Object data = apiResult.getData();
                        Intrinsics.checkNotNull(data);
                        boolean isFirst = ((LoginModel) data).getIsFirst();
                        Object data2 = apiResult.getData();
                        Intrinsics.checkNotNull(data2);
                        MyUserInfoModel data3 = ((LoginModel) data2).getData();
                        Intrinsics.checkNotNull(data3);
                        Object data4 = apiResult.getData();
                        Intrinsics.checkNotNull(data4);
                        LoginToken token = ((LoginModel) data4).getToken();
                        Intrinsics.checkNotNull(token);
                        this.f31700OooO0o = liveDataScope;
                        this.f31699OooO0Oo = apiResult;
                        this.f31701OooO0o0 = 2;
                        if (smsCodeVM.onLoginSuccess(isFirst, data3, token, null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        liveDataScope2 = liveDataScope;
                        apiResult2 = apiResult;
                        apiResult = apiResult2;
                        liveDataScope = liveDataScope2;
                    }
                }
            }
            this.f31700OooO0o = null;
            this.f31699OooO0Oo = null;
            this.f31701OooO0o0 = 3;
            if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.SmsCodeVM$checkVerCodeSendType$1", f = "SmsCodeVM.kt", i = {0}, l = {43, 44, 44}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Integer>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31705OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f31706OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31707OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f31708OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f31709OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, String str, int i2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f31706OooO0o = i;
            this.f31708OooO0oO = str;
            this.f31709OooO0oo = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f31706OooO0o, this.f31708OooO0oO, this.f31709OooO0oo, continuation);
            oooO00o.f31707OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Integer>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x005f A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31705OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31707OooO0o0;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    liveDataScope = (LiveDataScope) this.f31707OooO0o0;
                    ResultKt.throwOnFailure(obj);
                    this.f31707OooO0o0 = null;
                    this.f31705OooO0Oo = 3;
                    if (liveDataScope.emit(obj, this) == coroutine_suspended) {
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
            LiveDataScope liveDataScope2 = (LiveDataScope) this.f31707OooO0o0;
            long j = this.f31706OooO0o;
            this.f31707OooO0o0 = liveDataScope2;
            this.f31705OooO0Oo = 1;
            if (DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            liveDataScope = liveDataScope2;
            e eVar = e.f44768OooO00o;
            this.f31707OooO0o0 = liveDataScope;
            this.f31705OooO0Oo = 2;
            obj = eVar.OooO0O0(this.f31709OooO0oo, this.f31708OooO0oO, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31707OooO0o0 = null;
            this.f31705OooO0Oo = 3;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.SmsCodeVM$getGeetCode$1", f = "SmsCodeVM.kt", i = {}, l = {52, 55, 59}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31710OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f31711OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f31712OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function2<Boolean, String, Unit> f31713OooO0oO;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.SmsCodeVM$getGeetCode$1$1", f = "SmsCodeVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function2<Boolean, String, Unit> f31714OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ ApiResult<GeetCodeModel> f31715OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(Function2<? super Boolean, ? super String, Unit> function2, ApiResult<GeetCodeModel> apiResult, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f31714OooO0Oo = function2;
                this.f31715OooO0o0 = apiResult;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f31714OooO0Oo, this.f31715OooO0o0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                String string;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                ApiResult<GeetCodeModel> apiResult = this.f31715OooO0o0;
                GeetCodeModel data = apiResult.getData();
                Boolean boolBoxBoolean = Boxing.boxBoolean(data == null || data.getIsOpen());
                GeetCodeModel data2 = apiResult.getData();
                if ((data2 == null || (string = data2.getCaptchaId()) == null) && (string = o000O0.OooO00o().getSharedPreferences("SP_NAME_GEET_CODE", 0).getString("GEET_CODE_KEY", "")) == null) {
                    string = "";
                }
                this.f31714OooO0Oo.invoke(boolBoxBoolean, string);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.account.SmsCodeVM$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.SmsCodeVM$getGeetCode$1$2", f = "SmsCodeVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0353OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function2<Boolean, String, Unit> f31716OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0353OooO0O0(Function2<? super Boolean, ? super String, Unit> function2, Continuation<? super C0353OooO0O0> continuation) {
                super(2, continuation);
                this.f31716OooO0Oo = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0353OooO0O0(this.f31716OooO0Oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0353OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                String string = o000O0.OooO00o().getSharedPreferences("SP_NAME_GEET_CODE", 0).getString("GEET_CODE_KEY", "");
                this.f31716OooO0Oo.invoke(boolBoxBoolean, string != null ? string : "");
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(String str, int i, Function2<? super Boolean, ? super String, Unit> function2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f31712OooO0o0 = str;
            this.f31711OooO0o = i;
            this.f31713OooO0oO = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f31712OooO0o0, this.f31711OooO0o, this.f31713OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31710OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            oOO0OO ooo0oo = oOO0OO.f44964OooO00o;
            Integer numBoxInt = Boxing.boxInt(this.f31711OooO0o);
            this.f31710OooO0Oo = 1;
            obj = ooo0oo.OooO00o(this.f31712OooO0o0, numBoxInt, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            boolean zIsSuccess = apiResult.isSuccess();
            Function2<Boolean, String, Unit> function2 = this.f31713OooO0oO;
            if (zIsSuccess) {
                GeetCodeModel geetCodeModel = (GeetCodeModel) apiResult.getData();
                if (geetCodeModel != null || TextUtils.isEmpty(null)) {
                    SharedPreferences.Editor editorEdit = o000O0.OooO00o().getSharedPreferences("SP_NAME_GEET_CODE", 0).edit();
                    Intrinsics.checkNotNull(geetCodeModel);
                    editorEdit.putString("GEET_CODE_KEY", geetCodeModel.getCaptchaId()).commit();
                }
                OooO00o oooO00o = new OooO00o(function2, apiResult, null);
                this.f31710OooO0Oo = 2;
                if (OooOOO.OooO0o0(oooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                C0353OooO0O0 c0353OooO0O0 = new C0353OooO0O0(function2, null);
                this.f31710OooO0Oo = 3;
                if (OooOOO.OooO0o0(c0353OooO0O0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.SmsCodeVM$phoneChange$1", f = "SmsCodeVM.kt", i = {}, l = {28, 28}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31717OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31718OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31719OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f31720OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, String str2, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f31718OooO0o = str;
            this.f31720OooO0oO = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f31718OooO0o, this.f31720OooO0oO, continuation);
            oooO0OO.f31719OooO0o0 = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31717OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31719OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31719OooO0o0;
            e eVar = e.f44768OooO00o;
            this.f31719OooO0o0 = liveDataScope;
            this.f31717OooO0Oo = 1;
            obj = eVar.OooOO0(this.f31718OooO0o, this.f31720OooO0oO, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31719OooO0o0 = null;
            this.f31717OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.SmsCodeVM$postAddTrustDevice$1", f = "SmsCodeVM.kt", i = {}, l = {32, 32}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31721OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f31722OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31723OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f31724OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i, int i2, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f31722OooO0o = i;
            this.f31724OooO0oO = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f31722OooO0o, this.f31724OooO0oO, continuation);
            oooO0o.f31723OooO0o0 = obj;
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
            int i = this.f31721OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31723OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31723OooO0o0;
            AccountRepo accountRepo = AccountRepo.f22858OooO00o;
            this.f31723OooO0o0 = liveDataScope;
            this.f31721OooO0Oo = 1;
            accountRepo.getClass();
            String str = Oooo0.f44256OooO0oo;
            o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(str, "url", str, 1);
            o0o0oooOooO00o.OooO0O0(Boxing.boxInt(this.f31722OooO0o), "code");
            o0o0oooOooO00o.OooO0O0(Boxing.boxInt(this.f31724OooO0oO), "type");
            o0o0oooOooO00o.OooO0O0(oo000o.OooO0O0(), "phoneBrand");
            o0o0oooOooO00o.OooO0O0(oo000o.OooO0OO(), "phoneType");
            o0o0oooOooO00o.OooO0O0(oo000o.OooO0Oo(), "phoneVersion");
            obj = OooOOO.OooO0Oo(new AccountRepo$postAddTrustDevice$$inlined$call$1(o0o0oooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31723OooO0o0 = null;
            this.f31721OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.SmsCodeVM$sendPhoneCode$1", f = "SmsCodeVM.kt", i = {}, l = {25, 25}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<SmsCodeModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f31725OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31726OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31728OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f31729OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f31730OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ int f31731OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f31732OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ String f31733OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ String f31734OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(String str, String str2, int i, int i2, int i3, String str3, String str4, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f31729OooO0oO = str;
            this.f31730OooO0oo = str2;
            this.f31725OooO = i;
            this.f31731OooOO0 = i2;
            this.f31732OooOO0O = i3;
            this.f31733OooOO0o = str3;
            this.f31734OooOOO0 = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0 oooOO1 = SmsCodeVM.this.new OooOO0(this.f31729OooO0oO, this.f31730OooO0oo, this.f31725OooO, this.f31731OooOO0, this.f31732OooOO0O, this.f31733OooOO0o, this.f31734OooOOO0, continuation);
            oooOO1.f31728OooO0o0 = obj;
            return oooOO1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<SmsCodeModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object objOooOOO0;
            ClientCodeType clientCodeType;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31726OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    LiveDataScope liveDataScope2 = (LiveDataScope) this.f31728OooO0o0;
                    ResultKt.throwOnFailure(obj);
                    liveDataScope = liveDataScope2;
                    objOooOOO0 = obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            liveDataScope = (LiveDataScope) this.f31728OooO0o0;
            int source = 0;
            List listListOf = CollectionsKt.listOf((Object[]) new ClientCodeType[]{ClientCodeType.Register, ClientCodeType.BingingPhone, ClientCodeType.Change});
            SmsCodeVM smsCodeVM = SmsCodeVM.this;
            if (CollectionsKt.contains(listListOf, smsCodeVM.mType) && (clientCodeType = smsCodeVM.mType) != null) {
                source = clientCodeType.getSource();
            }
            int i2 = source;
            e eVar = e.f44768OooO00o;
            String str = this.f31729OooO0oO;
            String str2 = this.f31730OooO0oo;
            int i3 = this.f31725OooO;
            int i4 = this.f31731OooOO0;
            int i5 = this.f31732OooOO0O;
            String str3 = this.f31733OooOO0o;
            String str4 = this.f31734OooOOO0;
            this.f31728OooO0o0 = liveDataScope;
            this.f31726OooO0Oo = 1;
            objOooOOO0 = eVar.OooOOO0(str, str2, i3, i4, i5, str3, str4, i2, this);
            if (objOooOOO0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31728OooO0o0 = null;
            this.f31726OooO0Oo = 2;
            if (liveDataScope.emit(objOooOOO0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.SmsCodeVM$verCode$1", f = "SmsCodeVM.kt", i = {}, l = {30, 30}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31735OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31736OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31737OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f31738OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f31739OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(String str, String str2, int i, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f31736OooO0o = str;
            this.f31738OooO0oO = str2;
            this.f31739OooO0oo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0O oooOO0O = new OooOO0O(this.f31736OooO0o, this.f31738OooO0oO, this.f31739OooO0oo, continuation);
            oooOO0O.f31737OooO0o0 = obj;
            return oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31735OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31737OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31737OooO0o0;
            e eVar = e.f44768OooO00o;
            this.f31737OooO0o0 = liveDataScope;
            this.f31735OooO0Oo = 1;
            obj = eVar.OooOOOo(this.f31736OooO0o, this.f31738OooO0oO, this.f31739OooO0oo, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31737OooO0o0 = null;
            this.f31735OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static LiveData sendPhoneCode$default(SmsCodeVM smsCodeVM, String str, String str2, int i, int i2, int i3, String str3, String str4, int i4, Object obj) {
        String str5;
        if ((i4 & 64) != 0) {
            androidx.core.os.OooO00o OooO00o2 = o00oO0o.OooO00o(Resources.getSystem().getConfiguration());
            Intrinsics.checkNotNullExpressionValue(OooO00o2, "getLocales(Resources.getSystem().configuration)");
            String upperCase = null;
            if (!OooO00o2.OooO0Oo()) {
                Locale localeOooO0OO = OooO00o2.OooO0OO(0);
                String country = localeOooO0OO != null ? localeOooO0OO.getCountry() : null;
                if (!(country == null || country.length() == 0)) {
                    upperCase = StringKt.toUpperCase(country, androidx.compose.ui.text.intl.Locale.INSTANCE.getCurrent());
                }
            }
            str5 = upperCase;
        } else {
            str5 = str4;
        }
        return smsCodeVM.sendPhoneCode(str, str2, i, i2, i3, str3, str5);
    }

    @NotNull
    public final LiveData<ApiResult<Integer>> checkVerCodeSendType(int interval, @NotNull String msgRandomNum, int apiType) {
        Intrinsics.checkNotNullParameter(msgRandomNum, "msgRandomNum");
        return com.code.android.util.o00oO0o.OooO00o(new OooO00o(interval, msgRandomNum, apiType, null));
    }

    public final void getGeetCode(@NotNull String phoneNum, int scenes, @NotNull Function2<? super Boolean, ? super String, Unit> callBack) {
        Intrinsics.checkNotNullParameter(phoneNum, "phoneNum");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        OooOOO.OooO0O0(ViewModelKt.getViewModelScope(this), new OooO0O0(phoneNum, scenes, callBack, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> phoneChange(@NotNull String phone, @NotNull String code) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(code, "code");
        return com.code.android.util.o00oO0o.OooO00o(new OooO0OO(phone, code, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> postAddTrustDevice(int code, int type) {
        return com.code.android.util.o00oO0o.OooO00o(new OooO0o(code, type, null));
    }

    @NotNull
    public final LiveData<ApiResult<LoginModel>> protectionLoginByPhone(@NotNull String phone, @NotNull String code, int isActivate) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(code, "code");
        return com.code.android.util.o00oO0o.OooO00o(new OooO(phone, code, isActivate, this, null));
    }

    @NotNull
    public final LiveData<ApiResult<SmsCodeModel>> sendPhoneCode(@NotNull String phone, @NotNull String countryCode, int type, int channel, int sendType, @Nullable String geetinfo, @Nullable String isoCode) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return com.code.android.util.o00oO0o.OooO00o(new OooOO0(phone, countryCode, type, channel, sendType, geetinfo, isoCode, null));
    }

    public final void setClientType(@Nullable ClientCodeType type) {
        this.mType = type;
    }

    @NotNull
    public final LiveData<ApiResult<Object>> verCode(@NotNull String phone, @NotNull String code, int type) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(code, "code");
        return com.code.android.util.o00oO0o.OooO00o(new OooOO0O(phone, code, type, null));
    }
}
