package com.yalla.yalla.ui.vm.account;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.qiniu.android.collect.ReportItem;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.data.repository.AccountRepo$bindingPhone$$inlined$call$1;
import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.model.LoginToken;
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
import p254o00ooO0O.o0000O0;
import p254o00ooO0O.o0000O0O;
import p487o0o000oO.o0Oo0oo;
import p516o0o0O000.o000oOoO;
import p520o0o0O0O0.o0000O;
import p547o0o0o00O.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ2\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fJ\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ*\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/ui/vm/account/PasswordVM;", "Lcom/yalla/yalla/ui/vm/account/LoginVM;", "()V", "phoneRegister", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/model/LoginListModel;", "phone", "", "password", "smsCode", "userBindingPhone", "", "code", "isOpenProtection", "", "userPhoneLogin", "account", "userResetPassword", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PasswordVM extends LoginVM {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.PasswordVM$phoneRegister$1", f = "PasswordVM.kt", i = {0, 1, 1}, l = {10, 12, 14}, m = "invokeSuspend", n = {"$this$liveDataAsync", "$this$liveDataAsync", ReportItem.QualityKeyResult}, s = {"L$0", "L$0", "L$1"})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<LoginListModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f25333Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public ApiResult f25334Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25335Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f25336Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f25337OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f25338OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ PasswordVM f25339OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, String str2, String str3, PasswordVM passwordVM, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25333Oooo = str;
            this.f25338OoooO00 = str2;
            this.f25337OoooO0 = str3;
            this.f25339OoooO0O = passwordVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f25333Oooo, this.f25338OoooO00, this.f25337OoooO0, this.f25339OoooO0O, continuation);
            oooO00o.f25336Oooo0oo = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<LoginListModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00ad A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            ApiResult apiResult;
            LiveDataScope liveDataScope2;
            ApiResult apiResult2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25335Oooo0oO;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25336Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    apiResult2 = this.f25334Oooo0o;
                    liveDataScope2 = (LiveDataScope) this.f25336Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                    apiResult = apiResult2;
                    liveDataScope = liveDataScope2;
                    this.f25336Oooo0oo = null;
                    this.f25334Oooo0o = null;
                    this.f25335Oooo0oO = 3;
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
            LiveDataScope liveDataScope3 = (LiveDataScope) this.f25336Oooo0oo;
            o0000O o0000o2 = o0000O.f42365OooO00o;
            String str = this.f25333Oooo;
            String str2 = this.f25338OoooO00;
            String str3 = this.f25337OoooO0;
            this.f25336Oooo0oo = liveDataScope3;
            this.f25335Oooo0oO = 1;
            Object objOooOO0o = o0000o2.OooOO0o(str, str2, str3, this);
            if (objOooOO0o == coroutine_suspended) {
                return coroutine_suspended;
            }
            liveDataScope = liveDataScope3;
            obj = objOooOO0o;
            apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                PasswordVM passwordVM = this.f25339OoooO0O;
                Object data = apiResult.getData();
                Intrinsics.checkNotNull(data);
                boolean isFirst = ((LoginListModel) data).getIsFirst();
                Object data2 = apiResult.getData();
                Intrinsics.checkNotNull(data2);
                List<UserInfoModel> data3 = ((LoginListModel) data2).getData();
                Intrinsics.checkNotNull(data3);
                UserInfoModel userInfoModel = data3.get(0);
                Object data4 = apiResult.getData();
                Intrinsics.checkNotNull(data4);
                LoginToken token = ((LoginListModel) data4).getToken();
                Intrinsics.checkNotNull(token);
                this.f25336Oooo0oo = liveDataScope;
                this.f25334Oooo0o = apiResult;
                this.f25335Oooo0oO = 2;
                if (passwordVM.onLoginSuccess(isFirst, userInfoModel, token, null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                liveDataScope2 = liveDataScope;
                apiResult2 = apiResult;
                apiResult = apiResult2;
                liveDataScope = liveDataScope2;
            }
            this.f25336Oooo0oo = null;
            this.f25334Oooo0o = null;
            this.f25335Oooo0oO = 3;
            if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.PasswordVM$userBindingPhone$1", f = "PasswordVM.kt", i = {}, l = {28, 28}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f25340Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25341Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25342Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f25343Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f25344OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f25345OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, String str2, String str3, int i, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f25343Oooo0oo = str;
            this.f25340Oooo = str2;
            this.f25345OoooO00 = str3;
            this.f25344OoooO0 = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f25343Oooo0oo, this.f25340Oooo, this.f25345OoooO00, this.f25344OoooO0, continuation);
            oooO0O0.f25342Oooo0oO = obj;
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
            int i = this.f25341Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25342Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25342Oooo0oO;
            String str = this.f25343Oooo0oo;
            String str2 = this.f25340Oooo;
            String str3 = this.f25345OoooO00;
            int i2 = this.f25344OoooO0;
            this.f25342Oooo0oO = liveDataScope;
            this.f25341Oooo0o = 1;
            p480o0o000.OooO0OO oooO0OO = p480o0o000.OooO0OO.f40754OooO00o;
            String url = p480o0o000.OooO0OO.f40764OooOO0o;
            Intrinsics.checkNotNullParameter(url, "url");
            o00O000o o00o000o2 = new o00O000o(url, 1);
            o00o000o2.OooO0O0("accounts", str);
            o00o000o2.OooO0O0("code", str3);
            o00o000o2.OooO0O0("password", o000oOoO.OooO00o(str2));
            o00o000o2.OooO0O0("channel", Boxing.boxInt(2));
            o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
            o00o000o2.OooO0O0("uniqueid", o0Oo0oo.OooO00o());
            o00o000o2.OooO0O0("isOpenProtection", Boxing.boxInt(i2));
            o00o000o2.OooO0O0("phoneBrand", o0Oo0oo.OooO0O0());
            o00o000o2.OooO0O0("phoneType", o0Oo0oo.OooO0OO());
            o00o000o2.OooO0O0("phoneVersion", o0Oo0oo.OooO0Oo());
            obj = o0000O0.OooO0OO(new AccountRepo$bindingPhone$$inlined$call$1(o00o000o2, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25342Oooo0oO = null;
            this.f25341Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.PasswordVM$userPhoneLogin$1", f = "PasswordVM.kt", i = {0, 1, 1}, l = {22, 23, 24}, m = "invokeSuspend", n = {"$this$liveDataAsync", "$this$liveDataAsync", ReportItem.QualityKeyResult}, s = {"L$0", "L$0", "L$1"})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<LoginListModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f25346Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public ApiResult f25347Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25348Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f25349Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ PasswordVM f25350OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f25351OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, String str2, PasswordVM passwordVM, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f25346Oooo = str;
            this.f25351OoooO00 = str2;
            this.f25350OoooO0 = passwordVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f25346Oooo, this.f25351OoooO00, this.f25350OoooO0, continuation);
            oooO0OO.f25349Oooo0oo = obj;
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
            int i = this.f25348Oooo0oO;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25349Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    apiResult2 = this.f25347Oooo0o;
                    liveDataScope2 = (LiveDataScope) this.f25349Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                    apiResult = apiResult2;
                    liveDataScope = liveDataScope2;
                    this.f25349Oooo0oo = null;
                    this.f25347Oooo0o = null;
                    this.f25348Oooo0oO = 3;
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
            LiveDataScope liveDataScope3 = (LiveDataScope) this.f25349Oooo0oo;
            o0000O o0000o2 = o0000O.f42365OooO00o;
            String str = this.f25346Oooo;
            String str2 = this.f25351OoooO00;
            this.f25349Oooo0oo = liveDataScope3;
            this.f25348Oooo0oO = 1;
            Object objOooO0o0 = o0000o2.OooO0o0(str, str2, this);
            if (objOooO0o0 == coroutine_suspended) {
                return coroutine_suspended;
            }
            liveDataScope = liveDataScope3;
            obj = objOooO0o0;
            apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                PasswordVM passwordVM = this.f25350OoooO0;
                Object data = apiResult.getData();
                Intrinsics.checkNotNull(data);
                boolean isFirst = ((LoginListModel) data).getIsFirst();
                Object data2 = apiResult.getData();
                Intrinsics.checkNotNull(data2);
                List<UserInfoModel> data3 = ((LoginListModel) data2).getData();
                Intrinsics.checkNotNull(data3);
                UserInfoModel userInfoModel = data3.get(0);
                Object data4 = apiResult.getData();
                Intrinsics.checkNotNull(data4);
                LoginToken token = ((LoginListModel) data4).getToken();
                Intrinsics.checkNotNull(token);
                this.f25349Oooo0oo = liveDataScope;
                this.f25347Oooo0o = apiResult;
                this.f25348Oooo0oO = 2;
                if (passwordVM.onLoginSuccess(isFirst, userInfoModel, token, null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                liveDataScope2 = liveDataScope;
                apiResult2 = apiResult;
                apiResult = apiResult2;
                liveDataScope = liveDataScope2;
            }
            this.f25349Oooo0oo = null;
            this.f25347Oooo0o = null;
            this.f25348Oooo0oO = 3;
            if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.PasswordVM$userResetPassword$1", f = "PasswordVM.kt", i = {}, l = {18, 18}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f25352Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25353Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25354Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f25355Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f25356OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(String str, String str2, String str3, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f25355Oooo0oo = str;
            this.f25352Oooo = str2;
            this.f25356OoooO00 = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f25355Oooo0oo, this.f25352Oooo, this.f25356OoooO00, continuation);
            oooO0o.f25354Oooo0oO = obj;
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
            int i = this.f25353Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25354Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25354Oooo0oO;
            o0000O o0000o2 = o0000O.f42365OooO00o;
            String str = this.f25355Oooo0oo;
            String str2 = this.f25352Oooo;
            String str3 = this.f25356OoooO00;
            this.f25354Oooo0oO = liveDataScope;
            this.f25353Oooo0o = 1;
            obj = o0000o2.OooOOO(str, str2, str3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25354Oooo0oO = null;
            this.f25353Oooo0o = 2;
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
        return o0000O0O.OooO00o(new OooO00o(phone, password, smsCode, this, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> userBindingPhone(@NotNull String phone, @NotNull String password, @NotNull String code2, int isOpenProtection) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(code2, "code");
        return o0000O0O.OooO00o(new OooO0O0(phone, password, code2, isOpenProtection, null));
    }

    @NotNull
    public final LiveData<ApiResult<LoginListModel>> userPhoneLogin(@NotNull String account, @NotNull String password) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(password, "password");
        return o0000O0O.OooO00o(new OooO0OO(account, password, this, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> userResetPassword(@NotNull String phone, @NotNull String password, @NotNull String code2) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(code2, "code");
        return o0000O0O.OooO00o(new OooO0o(phone, password, code2, null));
    }
}
