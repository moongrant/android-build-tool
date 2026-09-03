package com.yalla.yalla.ui.vm.account;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.qiniu.android.collect.ReportItem;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.common.repository.AppConfigRepo;
import com.yalla.yalla.model.LoginModel;
import com.yalla.yalla.model.LoginToken;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0O;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;
import p520o0o0O0O0.o0000O;
import p522o0o0O0o.oOO00O;
import p543o0o0OoO0.ooOOOOoo;
import p617o0oo0o.o00Ooo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/ui/vm/account/LoginTouristVM;", "Lo00OO/OooO00o;", "Landroid/content/Context;", d.R, "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/model/LoginModel;", "loginByTourists", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class LoginTouristVM extends o00OO.OooO00o {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.LoginTouristVM$loginByTourists$1", f = "LoginTouristVM.kt", i = {0, 1, 1}, l = {29, 30, 45}, m = "invokeSuspend", n = {"$this$liveDataAsync", "$this$liveDataAsync", ReportItem.QualityKeyResult}, s = {"L$0", "L$0", "L$1"})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<LoginModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Context f25308Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public ApiResult f25309Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25310Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f25311Oooo0oo;

        /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.account.LoginTouristVM$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.LoginTouristVM$loginByTourists$1$1", f = "LoginTouristVM.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0262OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f25312Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ ApiResult<LoginModel> f25313Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0262OooO00o(ApiResult<LoginModel> apiResult, Continuation<? super C0262OooO00o> continuation) {
                super(2, continuation);
                this.f25313Oooo0oO = apiResult;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0262OooO00o(this.f25313Oooo0oO, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0262OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f25312Oooo0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.f25313Oooo0oO.isSuccess()) {
                        LoginModel data = this.f25313Oooo0oO.getData();
                        boolean z = false;
                        if ((data != null ? data.getData() : null) != null) {
                            LoginModel data2 = this.f25313Oooo0oO.getData();
                            Intrinsics.checkNotNull(data2);
                            UserInfoModel data3 = data2.getData();
                            Intrinsics.checkNotNull(data3);
                            LoginModel data4 = this.f25313Oooo0oO.getData();
                            Intrinsics.checkNotNull(data4);
                            LoginToken token = data4.getToken();
                            OooOOO oooOOO = OooOOO.f41216OooO00o;
                            oooOOO.Oooo0(data3, true);
                            OooOOO.Oooo00o(oooOOO, token != null ? token.getToken() : null, token != null ? token.getTokenRoom() : null, 6);
                            LoginModel data5 = this.f25313Oooo0oO.getData();
                            OooOOO.f41218OooO0OO = oOO00O.OooO0OO(data5 != null ? Boxing.boxBoolean(data5.getIsFirst()) : null);
                            LoginModel data6 = this.f25313Oooo0oO.getData();
                            if (data6 != null && data6.getIsFirst()) {
                                z = true;
                            }
                            if (z) {
                                OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
                                OooOOO0.OooO0o0().OooOoO(true);
                            }
                            LiveEventBus.get("LOGIN_TOURIST_SUSCCESS").post(Boxing.boxBoolean(true));
                            AppConfigRepo appConfigRepo = AppConfigRepo.f20679OooO00o;
                            this.f25312Oooo0o = 1;
                            if (appConfigRepo.OooO0o0(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ooOOOOoo.OooO00o();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25308Oooo = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f25308Oooo, continuation);
            oooO00o.f25311Oooo0oo = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<LoginModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x007c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            LiveDataScope liveDataScope2;
            ApiResult apiResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25310Oooo0oO;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25311Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    apiResult = this.f25309Oooo0o;
                    liveDataScope2 = (LiveDataScope) this.f25311Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                    this.f25311Oooo0oo = null;
                    this.f25309Oooo0o = null;
                    this.f25310Oooo0oO = 3;
                    if (liveDataScope2.emit(apiResult, this) == coroutine_suspended) {
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
            LiveDataScope liveDataScope3 = (LiveDataScope) this.f25311Oooo0oo;
            String countryCode = new o00Ooo(this.f25308Oooo).OooO0O0().getCountryCode();
            o0000O o0000o2 = o0000O.f42365OooO00o;
            this.f25311Oooo0oo = liveDataScope3;
            this.f25310Oooo0oO = 1;
            Object objOooO0o = o0000o2.OooO0o(countryCode, this);
            if (objOooO0o == coroutine_suspended) {
                return coroutine_suspended;
            }
            liveDataScope = liveDataScope3;
            obj = objOooO0o;
            ApiResult apiResult2 = (ApiResult) obj;
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C0262OooO00o c0262OooO00o = new C0262OooO00o(apiResult2, null);
            this.f25311Oooo0oo = liveDataScope;
            this.f25309Oooo0o = apiResult2;
            this.f25310Oooo0oO = 2;
            if (BuildersKt.withContext(main, c0262OooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            liveDataScope2 = liveDataScope;
            apiResult = apiResult2;
            this.f25311Oooo0oo = null;
            this.f25309Oooo0o = null;
            this.f25310Oooo0oO = 3;
            if (liveDataScope2.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final LiveData<ApiResult<LoginModel>> loginByTourists(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return o0000O0O.OooO00o(new OooO00o(context, null));
    }
}
