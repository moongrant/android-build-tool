package com.yalla.yalla.ui.vm.account;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import com.qiniu.android.collect.ReportItem;
import com.umeng.analytics.pro.ak;
import com.yalla.yalla.common.manager.GeetCodeManager;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.data.repository.AccountRepo$postAddTrustDevice$$inlined$call$1;
import com.yalla.yalla.model.GeetCodeModel;
import com.yalla.yalla.model.LoginModel;
import com.yalla.yalla.model.LoginToken;
import com.yalla.yalla.model.SmsCodeModel;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0;
import p254o00ooO0O.o0000O0O;
import p487o0o000oO.o0Oo0oo;
import p520o0o0O0O0.o0000O;
import p520o0o0O0O0.o00Oo0;
import p547o0o0o00O.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006JN\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000626\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\f0\u0010J\"\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00050\u00042\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tJ\"\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006J*\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00050\u00042\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0006JD\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00050\u00042\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\tJ*\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00050\u00042\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0006¨\u0006%"}, d2 = {"Lcom/yalla/yalla/ui/vm/account/SmsCodeVM;", "Lcom/yalla/yalla/ui/vm/account/LoginVM;", "()V", "checkVerCodeSendType", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "", ak.aT, "msgRandomNum", "", "apiType", "getGeetCode", "", "phoneNum", "scenes", "callBack", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "isOpen", "code", "phoneChange", "", "phone", "postAddTrustDevice", "type", "protectionLoginByPhone", "Lcom/yalla/yalla/model/LoginModel;", "isActivate", "sendPhoneCode", "Lcom/yalla/yalla/model/SmsCodeModel;", "countryCode", "channel", "sendType", "geetinfo", "verCode", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SmsCodeVM extends LoginVM {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.SmsCodeVM$protectionLoginByPhone$1", f = "SmsCodeVM.kt", i = {0, 1, 1}, l = {26, 28, 30}, m = "invokeSuspend", n = {"$this$liveDataAsync", "$this$liveDataAsync", ReportItem.QualityKeyResult}, s = {"L$0", "L$0", "L$1"})
    public static final class OooO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<LoginModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f25366Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public ApiResult f25367Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25368Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f25369Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f25370OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f25371OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ SmsCodeVM f25372OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(String str, String str2, int i, SmsCodeVM smsCodeVM, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f25366Oooo = str;
            this.f25371OoooO00 = str2;
            this.f25370OoooO0 = i;
            this.f25372OoooO0O = smsCodeVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f25366Oooo, this.f25371OoooO00, this.f25370OoooO0, this.f25372OoooO0O, continuation);
            oooO.f25369Oooo0oo = obj;
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
            int i = this.f25368Oooo0oO;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25369Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    apiResult2 = this.f25367Oooo0o;
                    liveDataScope2 = (LiveDataScope) this.f25369Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                    apiResult = apiResult2;
                    liveDataScope = liveDataScope2;
                    this.f25369Oooo0oo = null;
                    this.f25367Oooo0o = null;
                    this.f25368Oooo0oO = 3;
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
            LiveDataScope liveDataScope3 = (LiveDataScope) this.f25369Oooo0oo;
            o0000O o0000o2 = o0000O.f42365OooO00o;
            String str = this.f25366Oooo;
            String str2 = this.f25371OoooO00;
            int i2 = this.f25370OoooO0;
            this.f25369Oooo0oo = liveDataScope3;
            this.f25368Oooo0oO = 1;
            Object objOooOO0O = o0000o2.OooOO0O(str, str2, i2, this);
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
                        SmsCodeVM smsCodeVM = this.f25372OoooO0O;
                        Object data = apiResult.getData();
                        Intrinsics.checkNotNull(data);
                        boolean isFirst = ((LoginModel) data).getIsFirst();
                        Object data2 = apiResult.getData();
                        Intrinsics.checkNotNull(data2);
                        UserInfoModel data3 = ((LoginModel) data2).getData();
                        Intrinsics.checkNotNull(data3);
                        Object data4 = apiResult.getData();
                        Intrinsics.checkNotNull(data4);
                        LoginToken token = ((LoginModel) data4).getToken();
                        Intrinsics.checkNotNull(token);
                        this.f25369Oooo0oo = liveDataScope;
                        this.f25367Oooo0o = apiResult;
                        this.f25368Oooo0oO = 2;
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
            this.f25369Oooo0oo = null;
            this.f25367Oooo0o = null;
            this.f25368Oooo0oO = 3;
            if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.SmsCodeVM$checkVerCodeSendType$1", f = "SmsCodeVM.kt", i = {0}, l = {34, 35, 35}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Integer>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f25373Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25374Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25375Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f25376Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f25377OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, String str, int i2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25376Oooo0oo = i;
            this.f25373Oooo = str;
            this.f25377OoooO00 = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f25376Oooo0oo, this.f25373Oooo, this.f25377OoooO00, continuation);
            oooO00o.f25375Oooo0oO = obj;
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
            int i = this.f25374Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25375Oooo0oO;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    liveDataScope = (LiveDataScope) this.f25375Oooo0oO;
                    ResultKt.throwOnFailure(obj);
                    this.f25375Oooo0oO = null;
                    this.f25374Oooo0o = 3;
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
            LiveDataScope liveDataScope2 = (LiveDataScope) this.f25375Oooo0oO;
            long j = this.f25376Oooo0oo;
            this.f25375Oooo0oO = liveDataScope2;
            this.f25374Oooo0o = 1;
            if (DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            liveDataScope = liveDataScope2;
            o0000O o0000o2 = o0000O.f42365OooO00o;
            String str = this.f25373Oooo;
            int i2 = this.f25377OoooO00;
            this.f25375Oooo0oO = liveDataScope;
            this.f25374Oooo0o = 2;
            obj = o0000o2.OooO0O0(str, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25375Oooo0oO = null;
            this.f25374Oooo0o = 3;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.SmsCodeVM$getGeetCode$1", f = "SmsCodeVM.kt", i = {}, l = {45, 48, 52}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function2<Boolean, String, Unit> f25378Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25379Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f25380Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f25381Oooo0oo;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.SmsCodeVM$getGeetCode$1$1", f = "SmsCodeVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function2<Boolean, String, Unit> f25382Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ ApiResult<GeetCodeModel> f25383Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(Function2<? super Boolean, ? super String, Unit> function2, ApiResult<GeetCodeModel> apiResult, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f25382Oooo0o = function2;
                this.f25383Oooo0oO = apiResult;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f25382Oooo0o, this.f25383Oooo0oO, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                String geetCode;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                Function2<Boolean, String, Unit> function2 = this.f25382Oooo0o;
                GeetCodeModel data = this.f25383Oooo0oO.getData();
                Boolean boolBoxBoolean = Boxing.boxBoolean(data != null ? data.getIsOpen() : true);
                GeetCodeModel data2 = this.f25383Oooo0oO.getData();
                if (data2 == null || (geetCode = data2.getCaptchaId()) == null) {
                    geetCode = GeetCodeManager.INSTANCE.getGeetCode();
                }
                function2.invoke(boolBoxBoolean, geetCode);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.account.SmsCodeVM$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.SmsCodeVM$getGeetCode$1$2", f = "SmsCodeVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0263OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function2<Boolean, String, Unit> f25384Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0263OooO0O0(Function2<? super Boolean, ? super String, Unit> function2, Continuation<? super C0263OooO0O0> continuation) {
                super(2, continuation);
                this.f25384Oooo0o = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0263OooO0O0(this.f25384Oooo0o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0263OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                this.f25384Oooo0o.invoke(Boxing.boxBoolean(true), GeetCodeManager.INSTANCE.getGeetCode());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(String str, int i, Function2<? super Boolean, ? super String, Unit> function2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f25380Oooo0oO = str;
            this.f25381Oooo0oo = i;
            this.f25378Oooo = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f25380Oooo0oO, this.f25381Oooo0oo, this.f25378Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25379Oooo0o;
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
            o00Oo0 o00oo1 = o00Oo0.f42743OooO00o;
            String str = this.f25380Oooo0oO;
            Integer numBoxInt = Boxing.boxInt(this.f25381Oooo0oo);
            this.f25379Oooo0o = 1;
            obj = o00oo1.OooO00o(str, numBoxInt, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                GeetCodeManager.INSTANCE.updateGeetCode((GeetCodeModel) apiResult.getData());
                OooO00o oooO00o = new OooO00o(this.f25378Oooo, apiResult, null);
                this.f25379Oooo0o = 2;
                if (o0000O0.OooO0Oo(oooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                C0263OooO0O0 c0263OooO0O0 = new C0263OooO0O0(this.f25378Oooo, null);
                this.f25379Oooo0o = 3;
                if (o0000O0.OooO0Oo(c0263OooO0O0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.SmsCodeVM$phoneChange$1", f = "SmsCodeVM.kt", i = {}, l = {19, 19}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f25385Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25386Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25387Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f25388Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, String str2, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f25388Oooo0oo = str;
            this.f25385Oooo = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f25388Oooo0oo, this.f25385Oooo, continuation);
            oooO0OO.f25387Oooo0oO = obj;
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
            int i = this.f25386Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25387Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25387Oooo0oO;
            o0000O o0000o2 = o0000O.f42365OooO00o;
            String str = this.f25388Oooo0oo;
            String str2 = this.f25385Oooo;
            this.f25387Oooo0oO = liveDataScope;
            this.f25386Oooo0o = 1;
            obj = o0000o2.OooOO0(str, str2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25387Oooo0oO = null;
            this.f25386Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.SmsCodeVM$postAddTrustDevice$1", f = "SmsCodeVM.kt", i = {}, l = {23, 23}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f25389Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25390Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25391Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f25392Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i, int i2, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f25392Oooo0oo = i;
            this.f25389Oooo = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f25392Oooo0oo, this.f25389Oooo, continuation);
            oooO0o.f25391Oooo0oO = obj;
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
            int i = this.f25390Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25391Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25391Oooo0oO;
            int i2 = this.f25392Oooo0oo;
            int i3 = this.f25389Oooo;
            this.f25391Oooo0oO = liveDataScope;
            this.f25390Oooo0o = 1;
            p480o0o000.OooO0OO oooO0OO = p480o0o000.OooO0OO.f40754OooO00o;
            String str = p480o0o000.OooO0OO.f40760OooO0oO;
            o00O000o o00o000oOooO0O0 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 1);
            o00o000oOooO0O0.OooO0O0("code", Boxing.boxInt(i2));
            o00o000oOooO0O0.OooO0O0("type", Boxing.boxInt(i3));
            o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
            o00o000oOooO0O0.OooO0O0("phoneBrand", o0Oo0oo.OooO0O0());
            o00o000oOooO0O0.OooO0O0("phoneType", o0Oo0oo.OooO0OO());
            o00o000oOooO0O0.OooO0O0("phoneVersion", o0Oo0oo.OooO0Oo());
            obj = o0000O0.OooO0OO(new AccountRepo$postAddTrustDevice$$inlined$call$1(o00o000oOooO0O0, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25391Oooo0oO = null;
            this.f25390Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.SmsCodeVM$sendPhoneCode$1", f = "SmsCodeVM.kt", i = {}, l = {16, 16}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<SmsCodeModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f25393Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25394Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25395Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f25396Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ String f25397OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f25398OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f25399OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ int f25400OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(String str, String str2, int i, int i2, int i3, String str3, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f25396Oooo0oo = str;
            this.f25393Oooo = str2;
            this.f25399OoooO00 = i;
            this.f25398OoooO0 = i2;
            this.f25400OoooO0O = i3;
            this.f25397OoooO = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0 oooOO1 = new OooOO0(this.f25396Oooo0oo, this.f25393Oooo, this.f25399OoooO00, this.f25398OoooO0, this.f25400OoooO0O, this.f25397OoooO, continuation);
            oooOO1.f25395Oooo0oO = obj;
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
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25394Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25395Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25395Oooo0oO;
            o0000O o0000o2 = o0000O.f42365OooO00o;
            String str = this.f25396Oooo0oo;
            String str2 = this.f25393Oooo;
            int i2 = this.f25399OoooO00;
            int i3 = this.f25398OoooO0;
            int i4 = this.f25400OoooO0O;
            String str3 = this.f25397OoooO;
            this.f25395Oooo0oO = liveDataScope;
            this.f25394Oooo0o = 1;
            obj = o0000o2.OooOOO0(str, str2, i2, i3, i4, str3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25395Oooo0oO = null;
            this.f25394Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.SmsCodeVM$verCode$1", f = "SmsCodeVM.kt", i = {}, l = {21, 21}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f25401Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25402Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25403Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f25404Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f25405OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(String str, String str2, int i, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f25404Oooo0oo = str;
            this.f25401Oooo = str2;
            this.f25405OoooO00 = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0O oooOO0O = new OooOO0O(this.f25404Oooo0oo, this.f25401Oooo, this.f25405OoooO00, continuation);
            oooOO0O.f25403Oooo0oO = obj;
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
            int i = this.f25402Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25403Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25403Oooo0oO;
            o0000O o0000o2 = o0000O.f42365OooO00o;
            String str = this.f25404Oooo0oo;
            String str2 = this.f25401Oooo;
            int i2 = this.f25405OoooO00;
            this.f25403Oooo0oO = liveDataScope;
            this.f25402Oooo0o = 1;
            obj = o0000o2.OooOOOo(str, str2, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25403Oooo0oO = null;
            this.f25402Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final LiveData<ApiResult<Integer>> checkVerCodeSendType(int interval, @NotNull String msgRandomNum, int apiType) {
        Intrinsics.checkNotNullParameter(msgRandomNum, "msgRandomNum");
        return o0000O0O.OooO00o(new OooO00o(interval, msgRandomNum, apiType, null));
    }

    public final void getGeetCode(@NotNull String phoneNum, int scenes, @NotNull Function2<? super Boolean, ? super String, Unit> callBack) {
        Intrinsics.checkNotNullParameter(phoneNum, "phoneNum");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        Log.d("SmsCodeVM", "getGeetCode:  " + scenes);
        o0000O0.OooO00o(ViewModelKt.getViewModelScope(this), new OooO0O0(phoneNum, scenes, callBack, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> phoneChange(@NotNull String phone, @NotNull String code2) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(code2, "code");
        return o0000O0O.OooO00o(new OooO0OO(phone, code2, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> postAddTrustDevice(int code2, int type) {
        return o0000O0O.OooO00o(new OooO0o(code2, type, null));
    }

    @NotNull
    public final LiveData<ApiResult<LoginModel>> protectionLoginByPhone(@NotNull String phone, @NotNull String code2, int isActivate) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(code2, "code");
        return o0000O0O.OooO00o(new OooO(phone, code2, isActivate, this, null));
    }

    @NotNull
    public final LiveData<ApiResult<SmsCodeModel>> sendPhoneCode(@NotNull String phone, @NotNull String countryCode, int type, int channel, int sendType, @Nullable String geetinfo) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return o0000O0O.OooO00o(new OooOO0(phone, countryCode, type, channel, sendType, geetinfo, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> verCode(@NotNull String phone, @NotNull String code2, int type) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(code2, "code");
        return o0000O0O.OooO00o(new OooOO0O(phone, code2, type, null));
    }
}
