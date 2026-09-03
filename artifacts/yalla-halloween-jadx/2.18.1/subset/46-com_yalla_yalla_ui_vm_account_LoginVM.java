package com.yalla.yalla.ui.vm.account;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import com.app.base.http.ApiEvent;
import com.code.android.util.ToastUtil;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.qiniu.android.collect.ReportItem;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.YallaTeamMessage;
import com.yalla.yalla.common.manager.RoomState;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.manager.data.SharedMainMessageManager;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.data.repository.AccountRepo$activeAccount$$inlined$call$1;
import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.model.LoginModel;
import com.yalla.yalla.model.LoginToken;
import com.yalla.yalla.open_auth.OpenAuthManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p254o00ooO0O.o0000O0;
import p254o00ooO0O.o0000O0O;
import p391o0OOooOo.o0O00000;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;
import p520o0o0O0O0.o0000O;
import p527o0o0OO0.o0OoOo0;
import p543o0o0OoO0.ooOOOOoo;
import p547o0o0o00O.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J \u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001a\u0010\u0014\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0016\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J,\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00040\u0018J5\u0010\u001c\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/yalla/yalla/ui/vm/account/LoginVM;", "Lo00OO/OooO00o;", "", "accessToken", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/model/LoginListModel;", "yallaChatLoginCovert", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "regionChange", "", "changeLanguageAndRoom", "isFirst", "Lcom/yalla/yalla/model/LoginToken;", FirebaseMessagingService.EXTRA_TOKEN, "Lcom/yalla/yalla/common/model/UserInfoModel;", "userInfoModel", "saveAccountData", "Lcom/yalla/yalla/open_auth/OpenAuthManager$AuthType;", "type", "logEvent", "saveDataToSp", "insertWelcomeMessage", "twitterSecretOrInsUserId", "Landroidx/lifecycle/LiveData;", "thirdLogin", "Lcom/yalla/yalla/model/LoginModel;", "activeAccount", "onLoginSuccess", "(ZLcom/yalla/yalla/common/model/UserInfoModel;Lcom/yalla/yalla/model/LoginToken;Lcom/yalla/yalla/open_auth/OpenAuthManager$AuthType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public class LoginVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    @NotNull
    private final SimpleDateFormat dateFormat;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.LoginVM", f = "LoginVM.kt", i = {}, l = {65}, m = "yallaChatLoginCovert", n = {}, s = {})
    public static final class OooO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f25314Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f25316Oooo0oo;

        public OooO(Continuation<? super OooO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25314Oooo0o = obj;
            this.f25316Oooo0oo |= Integer.MIN_VALUE;
            return LoginVM.this.yallaChatLoginCovert(null, this);
        }
    }

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OpenAuthManager.AuthType.values().length];
            iArr[OpenAuthManager.AuthType.Twitter.ordinal()] = 1;
            iArr[OpenAuthManager.AuthType.Instagram.ordinal()] = 2;
            iArr[OpenAuthManager.AuthType.Facebook.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.LoginVM$activeAccount$1", f = "LoginVM.kt", i = {0, 1, 1}, l = {81, 82, 83}, m = "invokeSuspend", n = {"$this$liveDataAsync", "$this$liveDataAsync", ReportItem.QualityKeyResult}, s = {"L$0", "L$0", "L$1"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<LoginModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public ApiResult f25318Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25319Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f25320Oooo0oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = LoginVM.this.new OooO0O0(continuation);
            oooO0O0.f25320Oooo0oo = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<LoginModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00b3 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            ApiResult apiResult;
            LiveDataScope liveDataScope2;
            ApiResult apiResult2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25319Oooo0oO;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25320Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    apiResult2 = this.f25318Oooo0o;
                    liveDataScope2 = (LiveDataScope) this.f25320Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                    apiResult = apiResult2;
                    liveDataScope = liveDataScope2;
                    this.f25320Oooo0oo = null;
                    this.f25318Oooo0o = null;
                    this.f25319Oooo0oO = 3;
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
            LiveDataScope liveDataScope3 = (LiveDataScope) this.f25320Oooo0oo;
            this.f25320Oooo0oo = liveDataScope3;
            this.f25319Oooo0oO = 1;
            p480o0o000.OooO0OO oooO0OO = p480o0o000.OooO0OO.f40754OooO00o;
            String url = p480o0o000.OooO0OO.f40756OooO0OO;
            Intrinsics.checkNotNullParameter(url, "url");
            o00O000o o00o000o2 = new o00O000o(url, 1);
            o00o000o2.OooO00o();
            Object objOooO0OO = o0000O0.OooO0OO(new AccountRepo$activeAccount$$inlined$call$1(o00o000o2, null), this);
            if (objOooO0OO == coroutine_suspended) {
                return coroutine_suspended;
            }
            liveDataScope = liveDataScope3;
            obj = objOooO0OO;
            apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                LoginVM loginVM = LoginVM.this;
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
                this.f25320Oooo0oo = liveDataScope;
                this.f25318Oooo0o = apiResult;
                this.f25319Oooo0oO = 2;
                if (loginVM.onLoginSuccess(isFirst, data3, token, null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                liveDataScope2 = liveDataScope;
                apiResult2 = apiResult;
                apiResult = apiResult2;
                liveDataScope = liveDataScope2;
            }
            this.f25320Oooo0oo = null;
            this.f25318Oooo0o = null;
            this.f25319Oooo0oO = 3;
            if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.LoginVM$onLoginSuccess$2", f = "LoginVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ UserInfoModel f25321Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f25323Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ LoginToken f25324Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ OpenAuthManager.AuthType f25325OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, LoginToken loginToken, UserInfoModel userInfoModel, OpenAuthManager.AuthType authType, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f25323Oooo0oO = z;
            this.f25324Oooo0oo = loginToken;
            this.f25321Oooo = userInfoModel;
            this.f25325OoooO00 = authType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginVM.this.new OooO0OO(this.f25323Oooo0oO, this.f25324Oooo0oo, this.f25321Oooo, this.f25325OoooO00, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            Integer value = oooOOO.OooOOO().getValue();
            LoginVM.this.saveAccountData(this.f25323Oooo0oO, this.f25324Oooo0oo, this.f25321Oooo);
            LoginVM.this.saveDataToSp(this.f25323Oooo0oO, this.f25321Oooo);
            LoginVM.this.insertWelcomeMessage(this.f25323Oooo0oO, this.f25321Oooo);
            LoginVM.this.logEvent(this.f25323Oooo0oO, this.f25325OoooO00);
            ooOOOOoo.OooO00o();
            oooOOO.OooOooO().setValue(Boxing.boxBoolean(true));
            LiveEventBus.get("LOGIN_RESULT").post(Boxing.boxBoolean(true));
            LoginVM.this.changeLanguageAndRoom(!Intrinsics.areEqual(value, oooOOO.OooOOO().getValue()));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.LoginVM$thirdLogin$1", f = "LoginVM.kt", i = {0, 1, 2, 3, 4, 5, 5}, l = {49, 50, 51, 52, 54, 59, 61}, m = "invokeSuspend", n = {"$this$liveDataAsync", "$this$liveDataAsync", "$this$liveDataAsync", "$this$liveDataAsync", "$this$liveDataAsync", "$this$liveDataAsync", ReportItem.QualityKeyResult}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$1"})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<LoginListModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ OpenAuthManager.AuthType f25326Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public ApiResult f25327Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25328Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f25329Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f25330OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f25331OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ LoginVM f25332OoooO0O;

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OpenAuthManager.AuthType.values().length];
                iArr[OpenAuthManager.AuthType.Twitter.ordinal()] = 1;
                iArr[OpenAuthManager.AuthType.Facebook.ordinal()] = 2;
                iArr[OpenAuthManager.AuthType.WeChat.ordinal()] = 3;
                iArr[OpenAuthManager.AuthType.YallaChat.ordinal()] = 4;
                iArr[OpenAuthManager.AuthType.Instagram.ordinal()] = 5;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(OpenAuthManager.AuthType authType, String str, String str2, LoginVM loginVM, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f25326Oooo = authType;
            this.f25331OoooO00 = str;
            this.f25330OoooO0 = str2;
            this.f25332OoooO0O = loginVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f25326Oooo, this.f25331OoooO00, this.f25330OoooO0, this.f25332OoooO0O, continuation);
            oooO0o.f25329Oooo0oo = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<LoginListModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:47:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:49:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:50:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:53:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:57:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:59:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:61:0x0106  */
        /* JADX WARN: Code duplicated, block: B:62:0x010b  */
        /* JADX WARN: Code duplicated, block: B:65:0x010f  */
        /* JADX WARN: Code duplicated, block: B:67:0x0112  */
        /* JADX WARN: Code duplicated, block: B:69:0x0158 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:70:0x0159  */
        /* JADX WARN: Code duplicated, block: B:74:0x0168 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            ApiResult apiResult;
            ApiResult apiResult2;
            LiveDataScope liveDataScope2;
            LoginListModel loginListModel;
            List<UserInfoModel> data;
            boolean z;
            LoginListModel loginListModel2;
            LoginToken token;
            LoginVM loginVM;
            boolean isFirst;
            UserInfoModel userInfoModel;
            LoginToken token2;
            OpenAuthManager.AuthType authType;
            LiveDataScope liveDataScope3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.f25328Oooo0oO) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    liveDataScope = (LiveDataScope) this.f25329Oooo0oo;
                    int i = OooO00o.$EnumSwitchMapping$0[this.f25326Oooo.ordinal()];
                    if (i == 1) {
                        o0000O o0000o2 = o0000O.f42365OooO00o;
                        String str = this.f25331OoooO00;
                        String str2 = this.f25330OoooO0;
                        Intrinsics.checkNotNull(str2);
                        this.f25329Oooo0oo = liveDataScope;
                        this.f25328Oooo0oO = 1;
                        obj = o0000o2.OooO0oO(str, str2, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        apiResult = (ApiResult) obj;
                        LiveDataScope liveDataScope4 = liveDataScope;
                        apiResult2 = apiResult;
                        liveDataScope2 = liveDataScope4;
                        if (apiResult2.isSuccess()) {
                            loginListModel = (LoginListModel) apiResult2.getData();
                            if (loginListModel != null) {
                                data = loginListModel.getData();
                            } else {
                                data = null;
                            }
                            if (data != null) {
                                z = true;
                            } else {
                                z = true;
                            }
                            if (!z) {
                                loginListModel2 = (LoginListModel) apiResult2.getData();
                                if (loginListModel2 != null) {
                                    token = loginListModel2.getToken();
                                } else {
                                    token = null;
                                }
                                if (token != null) {
                                    loginVM = this.f25332OoooO0O;
                                    Object data2 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data2);
                                    isFirst = ((LoginListModel) data2).getIsFirst();
                                    Object data3 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data3);
                                    List<UserInfoModel> data4 = ((LoginListModel) data3).getData();
                                    Intrinsics.checkNotNull(data4);
                                    userInfoModel = data4.get(0);
                                    Object data5 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data5);
                                    token2 = ((LoginListModel) data5).getToken();
                                    Intrinsics.checkNotNull(token2);
                                    authType = this.f25326Oooo;
                                    this.f25329Oooo0oo = liveDataScope2;
                                    this.f25327Oooo0o = apiResult2;
                                    this.f25328Oooo0oO = 6;
                                    if (loginVM.onLoginSuccess(isFirst, userInfoModel, token2, authType, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    liveDataScope3 = liveDataScope2;
                                    liveDataScope2 = liveDataScope3;
                                }
                            }
                        }
                        this.f25329Oooo0oo = null;
                        this.f25327Oooo0o = null;
                        this.f25328Oooo0oO = 7;
                        if (liveDataScope2.emit(apiResult2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i == 2) {
                        o0000O o0000o3 = o0000O.f42365OooO00o;
                        String str3 = this.f25331OoooO00;
                        this.f25329Oooo0oo = liveDataScope;
                        this.f25328Oooo0oO = 2;
                        obj = o0000o3.OooO0OO(str3, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        apiResult = (ApiResult) obj;
                        LiveDataScope liveDataScope5 = liveDataScope;
                        apiResult2 = apiResult;
                        liveDataScope2 = liveDataScope5;
                        if (apiResult2.isSuccess()) {
                            loginListModel = (LoginListModel) apiResult2.getData();
                            if (loginListModel != null) {
                                data = loginListModel.getData();
                            } else {
                                data = null;
                            }
                            if (data != null) {
                                z = true;
                            } else {
                                z = true;
                            }
                            if (!z) {
                                loginListModel2 = (LoginListModel) apiResult2.getData();
                                if (loginListModel2 != null) {
                                    token = loginListModel2.getToken();
                                } else {
                                    token = null;
                                }
                                if (token != null) {
                                    loginVM = this.f25332OoooO0O;
                                    Object data6 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data6);
                                    isFirst = ((LoginListModel) data6).getIsFirst();
                                    Object data7 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data7);
                                    List<UserInfoModel> data8 = ((LoginListModel) data7).getData();
                                    Intrinsics.checkNotNull(data8);
                                    userInfoModel = data8.get(0);
                                    Object data9 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data9);
                                    token2 = ((LoginListModel) data9).getToken();
                                    Intrinsics.checkNotNull(token2);
                                    authType = this.f25326Oooo;
                                    this.f25329Oooo0oo = liveDataScope2;
                                    this.f25327Oooo0o = apiResult2;
                                    this.f25328Oooo0oO = 6;
                                    if (loginVM.onLoginSuccess(isFirst, userInfoModel, token2, authType, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    liveDataScope3 = liveDataScope2;
                                    liveDataScope2 = liveDataScope3;
                                }
                            }
                        }
                        this.f25329Oooo0oo = null;
                        this.f25327Oooo0o = null;
                        this.f25328Oooo0oO = 7;
                        if (liveDataScope2.emit(apiResult2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i == 3) {
                        o0000O o0000o4 = o0000O.f42365OooO00o;
                        String str4 = this.f25331OoooO00;
                        this.f25329Oooo0oo = liveDataScope;
                        this.f25328Oooo0oO = 3;
                        obj = o0000o4.OooO0oo(str4, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        apiResult = (ApiResult) obj;
                        LiveDataScope liveDataScope6 = liveDataScope;
                        apiResult2 = apiResult;
                        liveDataScope2 = liveDataScope6;
                        if (apiResult2.isSuccess()) {
                            loginListModel = (LoginListModel) apiResult2.getData();
                            if (loginListModel != null) {
                                data = loginListModel.getData();
                            } else {
                                data = null;
                            }
                            if (data != null) {
                                z = true;
                            } else {
                                z = true;
                            }
                            if (!z) {
                                loginListModel2 = (LoginListModel) apiResult2.getData();
                                if (loginListModel2 != null) {
                                    token = loginListModel2.getToken();
                                } else {
                                    token = null;
                                }
                                if (token != null) {
                                    loginVM = this.f25332OoooO0O;
                                    Object data10 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data10);
                                    isFirst = ((LoginListModel) data10).getIsFirst();
                                    Object data11 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data11);
                                    List<UserInfoModel> data12 = ((LoginListModel) data11).getData();
                                    Intrinsics.checkNotNull(data12);
                                    userInfoModel = data12.get(0);
                                    Object data13 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data13);
                                    token2 = ((LoginListModel) data13).getToken();
                                    Intrinsics.checkNotNull(token2);
                                    authType = this.f25326Oooo;
                                    this.f25329Oooo0oo = liveDataScope2;
                                    this.f25327Oooo0o = apiResult2;
                                    this.f25328Oooo0oO = 6;
                                    if (loginVM.onLoginSuccess(isFirst, userInfoModel, token2, authType, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    liveDataScope3 = liveDataScope2;
                                    liveDataScope2 = liveDataScope3;
                                }
                            }
                        }
                        this.f25329Oooo0oo = null;
                        this.f25327Oooo0o = null;
                        this.f25328Oooo0oO = 7;
                        if (liveDataScope2.emit(apiResult2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i == 4) {
                        LoginVM loginVM2 = this.f25332OoooO0O;
                        String str5 = this.f25331OoooO00;
                        this.f25329Oooo0oo = liveDataScope;
                        this.f25328Oooo0oO = 4;
                        obj = loginVM2.yallaChatLoginCovert(str5, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        apiResult = (ApiResult) obj;
                        LiveDataScope liveDataScope7 = liveDataScope;
                        apiResult2 = apiResult;
                        liveDataScope2 = liveDataScope7;
                        if (apiResult2.isSuccess()) {
                            loginListModel = (LoginListModel) apiResult2.getData();
                            if (loginListModel != null) {
                                data = loginListModel.getData();
                            } else {
                                data = null;
                            }
                            if (data != null) {
                                z = true;
                            } else {
                                z = true;
                            }
                            if (!z) {
                                loginListModel2 = (LoginListModel) apiResult2.getData();
                                if (loginListModel2 != null) {
                                    token = loginListModel2.getToken();
                                } else {
                                    token = null;
                                }
                                if (token != null) {
                                    loginVM = this.f25332OoooO0O;
                                    Object data14 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data14);
                                    isFirst = ((LoginListModel) data14).getIsFirst();
                                    Object data15 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data15);
                                    List<UserInfoModel> data16 = ((LoginListModel) data15).getData();
                                    Intrinsics.checkNotNull(data16);
                                    userInfoModel = data16.get(0);
                                    Object data17 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data17);
                                    token2 = ((LoginListModel) data17).getToken();
                                    Intrinsics.checkNotNull(token2);
                                    authType = this.f25326Oooo;
                                    this.f25329Oooo0oo = liveDataScope2;
                                    this.f25327Oooo0o = apiResult2;
                                    this.f25328Oooo0oO = 6;
                                    if (loginVM.onLoginSuccess(isFirst, userInfoModel, token2, authType, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    liveDataScope3 = liveDataScope2;
                                    liveDataScope2 = liveDataScope3;
                                }
                            }
                        }
                        this.f25329Oooo0oo = null;
                        this.f25327Oooo0o = null;
                        this.f25328Oooo0oO = 7;
                        if (liveDataScope2.emit(apiResult2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    o0000O o0000o5 = o0000O.f42365OooO00o;
                    String str6 = this.f25331OoooO00;
                    String strValueOf = String.valueOf(this.f25330OoooO0);
                    this.f25329Oooo0oo = liveDataScope;
                    this.f25328Oooo0oO = 5;
                    obj = o0000o5.OooO0Oo(str6, strValueOf, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    apiResult = (ApiResult) obj;
                    LiveDataScope liveDataScope8 = liveDataScope;
                    apiResult2 = apiResult;
                    liveDataScope2 = liveDataScope8;
                    if (apiResult2.isSuccess()) {
                        loginListModel = (LoginListModel) apiResult2.getData();
                        if (loginListModel != null) {
                            data = loginListModel.getData();
                        } else {
                            data = null;
                        }
                        if (data != null || data.isEmpty()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            loginListModel2 = (LoginListModel) apiResult2.getData();
                            if (loginListModel2 != null) {
                                token = loginListModel2.getToken();
                            } else {
                                token = null;
                            }
                            if (token != null) {
                                loginVM = this.f25332OoooO0O;
                                Object data18 = apiResult2.getData();
                                Intrinsics.checkNotNull(data18);
                                isFirst = ((LoginListModel) data18).getIsFirst();
                                Object data19 = apiResult2.getData();
                                Intrinsics.checkNotNull(data19);
                                List<UserInfoModel> data110 = ((LoginListModel) data19).getData();
                                Intrinsics.checkNotNull(data110);
                                userInfoModel = data110.get(0);
                                Object data111 = apiResult2.getData();
                                Intrinsics.checkNotNull(data111);
                                token2 = ((LoginListModel) data111).getToken();
                                Intrinsics.checkNotNull(token2);
                                authType = this.f25326Oooo;
                                this.f25329Oooo0oo = liveDataScope2;
                                this.f25327Oooo0o = apiResult2;
                                this.f25328Oooo0oO = 6;
                                if (loginVM.onLoginSuccess(isFirst, userInfoModel, token2, authType, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                liveDataScope3 = liveDataScope2;
                                liveDataScope2 = liveDataScope3;
                            }
                        }
                    }
                    this.f25329Oooo0oo = null;
                    this.f25327Oooo0o = null;
                    this.f25328Oooo0oO = 7;
                    if (liveDataScope2.emit(apiResult2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 1:
                    liveDataScope = (LiveDataScope) this.f25329Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    LiveDataScope liveDataScope9 = liveDataScope;
                    apiResult2 = apiResult;
                    liveDataScope2 = liveDataScope9;
                    if (apiResult2.isSuccess()) {
                        loginListModel = (LoginListModel) apiResult2.getData();
                        if (loginListModel != null) {
                            data = loginListModel.getData();
                        } else {
                            data = null;
                        }
                        if (data != null) {
                            z = true;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            loginListModel2 = (LoginListModel) apiResult2.getData();
                            if (loginListModel2 != null) {
                                token = loginListModel2.getToken();
                            } else {
                                token = null;
                            }
                            if (token != null) {
                                loginVM = this.f25332OoooO0O;
                                Object data112 = apiResult2.getData();
                                Intrinsics.checkNotNull(data112);
                                isFirst = ((LoginListModel) data112).getIsFirst();
                                Object data113 = apiResult2.getData();
                                Intrinsics.checkNotNull(data113);
                                List<UserInfoModel> data114 = ((LoginListModel) data113).getData();
                                Intrinsics.checkNotNull(data114);
                                userInfoModel = data114.get(0);
                                Object data115 = apiResult2.getData();
                                Intrinsics.checkNotNull(data115);
                                token2 = ((LoginListModel) data115).getToken();
                                Intrinsics.checkNotNull(token2);
                                authType = this.f25326Oooo;
                                this.f25329Oooo0oo = liveDataScope2;
                                this.f25327Oooo0o = apiResult2;
                                this.f25328Oooo0oO = 6;
                                if (loginVM.onLoginSuccess(isFirst, userInfoModel, token2, authType, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                liveDataScope3 = liveDataScope2;
                                liveDataScope2 = liveDataScope3;
                            }
                        }
                    }
                    this.f25329Oooo0oo = null;
                    this.f25327Oooo0o = null;
                    this.f25328Oooo0oO = 7;
                    if (liveDataScope2.emit(apiResult2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 2:
                    liveDataScope = (LiveDataScope) this.f25329Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    LiveDataScope liveDataScope10 = liveDataScope;
                    apiResult2 = apiResult;
                    liveDataScope2 = liveDataScope10;
                    if (apiResult2.isSuccess()) {
                        loginListModel = (LoginListModel) apiResult2.getData();
                        if (loginListModel != null) {
                            data = loginListModel.getData();
                        } else {
                            data = null;
                        }
                        if (data != null) {
                            z = true;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            loginListModel2 = (LoginListModel) apiResult2.getData();
                            if (loginListModel2 != null) {
                                token = loginListModel2.getToken();
                            } else {
                                token = null;
                            }
                            if (token != null) {
                                loginVM = this.f25332OoooO0O;
                                Object data116 = apiResult2.getData();
                                Intrinsics.checkNotNull(data116);
                                isFirst = ((LoginListModel) data116).getIsFirst();
                                Object data117 = apiResult2.getData();
                                Intrinsics.checkNotNull(data117);
                                List<UserInfoModel> data118 = ((LoginListModel) data117).getData();
                                Intrinsics.checkNotNull(data118);
                                userInfoModel = data118.get(0);
                                Object data119 = apiResult2.getData();
                                Intrinsics.checkNotNull(data119);
                                token2 = ((LoginListModel) data119).getToken();
                                Intrinsics.checkNotNull(token2);
                                authType = this.f25326Oooo;
                                this.f25329Oooo0oo = liveDataScope2;
                                this.f25327Oooo0o = apiResult2;
                                this.f25328Oooo0oO = 6;
                                if (loginVM.onLoginSuccess(isFirst, userInfoModel, token2, authType, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                liveDataScope3 = liveDataScope2;
                                liveDataScope2 = liveDataScope3;
                            }
                        }
                    }
                    this.f25329Oooo0oo = null;
                    this.f25327Oooo0o = null;
                    this.f25328Oooo0oO = 7;
                    if (liveDataScope2.emit(apiResult2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 3:
                    liveDataScope = (LiveDataScope) this.f25329Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    LiveDataScope liveDataScope11 = liveDataScope;
                    apiResult2 = apiResult;
                    liveDataScope2 = liveDataScope11;
                    if (apiResult2.isSuccess()) {
                        loginListModel = (LoginListModel) apiResult2.getData();
                        if (loginListModel != null) {
                            data = loginListModel.getData();
                        } else {
                            data = null;
                        }
                        if (data != null) {
                            z = true;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            loginListModel2 = (LoginListModel) apiResult2.getData();
                            if (loginListModel2 != null) {
                                token = loginListModel2.getToken();
                            } else {
                                token = null;
                            }
                            if (token != null) {
                                loginVM = this.f25332OoooO0O;
                                Object data1110 = apiResult2.getData();
                                Intrinsics.checkNotNull(data1110);
                                isFirst = ((LoginListModel) data1110).getIsFirst();
                                Object data1111 = apiResult2.getData();
                                Intrinsics.checkNotNull(data1111);
                                List<UserInfoModel> data1112 = ((LoginListModel) data1111).getData();
                                Intrinsics.checkNotNull(data1112);
                                userInfoModel = data1112.get(0);
                                Object data1113 = apiResult2.getData();
                                Intrinsics.checkNotNull(data1113);
                                token2 = ((LoginListModel) data1113).getToken();
                                Intrinsics.checkNotNull(token2);
                                authType = this.f25326Oooo;
                                this.f25329Oooo0oo = liveDataScope2;
                                this.f25327Oooo0o = apiResult2;
                                this.f25328Oooo0oO = 6;
                                if (loginVM.onLoginSuccess(isFirst, userInfoModel, token2, authType, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                liveDataScope3 = liveDataScope2;
                                liveDataScope2 = liveDataScope3;
                            }
                        }
                    }
                    this.f25329Oooo0oo = null;
                    this.f25327Oooo0o = null;
                    this.f25328Oooo0oO = 7;
                    if (liveDataScope2.emit(apiResult2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 4:
                    liveDataScope = (LiveDataScope) this.f25329Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    LiveDataScope liveDataScope12 = liveDataScope;
                    apiResult2 = apiResult;
                    liveDataScope2 = liveDataScope12;
                    if (apiResult2.isSuccess()) {
                        loginListModel = (LoginListModel) apiResult2.getData();
                        if (loginListModel != null) {
                            data = loginListModel.getData();
                        } else {
                            data = null;
                        }
                        if (data != null) {
                            z = true;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            loginListModel2 = (LoginListModel) apiResult2.getData();
                            if (loginListModel2 != null) {
                                token = loginListModel2.getToken();
                            } else {
                                token = null;
                            }
                            if (token != null) {
                                loginVM = this.f25332OoooO0O;
                                Object data1114 = apiResult2.getData();
                                Intrinsics.checkNotNull(data1114);
                                isFirst = ((LoginListModel) data1114).getIsFirst();
                                Object data1115 = apiResult2.getData();
                                Intrinsics.checkNotNull(data1115);
                                List<UserInfoModel> data1116 = ((LoginListModel) data1115).getData();
                                Intrinsics.checkNotNull(data1116);
                                userInfoModel = data1116.get(0);
                                Object data1117 = apiResult2.getData();
                                Intrinsics.checkNotNull(data1117);
                                token2 = ((LoginListModel) data1117).getToken();
                                Intrinsics.checkNotNull(token2);
                                authType = this.f25326Oooo;
                                this.f25329Oooo0oo = liveDataScope2;
                                this.f25327Oooo0o = apiResult2;
                                this.f25328Oooo0oO = 6;
                                if (loginVM.onLoginSuccess(isFirst, userInfoModel, token2, authType, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                liveDataScope3 = liveDataScope2;
                                liveDataScope2 = liveDataScope3;
                            }
                        }
                    }
                    this.f25329Oooo0oo = null;
                    this.f25327Oooo0o = null;
                    this.f25328Oooo0oO = 7;
                    if (liveDataScope2.emit(apiResult2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 5:
                    liveDataScope = (LiveDataScope) this.f25329Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    LiveDataScope liveDataScope13 = liveDataScope;
                    apiResult2 = apiResult;
                    liveDataScope2 = liveDataScope13;
                    if (apiResult2.isSuccess()) {
                        loginListModel = (LoginListModel) apiResult2.getData();
                        if (loginListModel != null) {
                            data = loginListModel.getData();
                        } else {
                            data = null;
                        }
                        if (data != null) {
                            z = true;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            loginListModel2 = (LoginListModel) apiResult2.getData();
                            if (loginListModel2 != null) {
                                token = loginListModel2.getToken();
                            } else {
                                token = null;
                            }
                            if (token != null) {
                                loginVM = this.f25332OoooO0O;
                                Object data1118 = apiResult2.getData();
                                Intrinsics.checkNotNull(data1118);
                                isFirst = ((LoginListModel) data1118).getIsFirst();
                                Object data1119 = apiResult2.getData();
                                Intrinsics.checkNotNull(data1119);
                                List<UserInfoModel> data11110 = ((LoginListModel) data1119).getData();
                                Intrinsics.checkNotNull(data11110);
                                userInfoModel = data11110.get(0);
                                Object data11111 = apiResult2.getData();
                                Intrinsics.checkNotNull(data11111);
                                token2 = ((LoginListModel) data11111).getToken();
                                Intrinsics.checkNotNull(token2);
                                authType = this.f25326Oooo;
                                this.f25329Oooo0oo = liveDataScope2;
                                this.f25327Oooo0o = apiResult2;
                                this.f25328Oooo0oO = 6;
                                if (loginVM.onLoginSuccess(isFirst, userInfoModel, token2, authType, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                liveDataScope3 = liveDataScope2;
                                liveDataScope2 = liveDataScope3;
                            }
                        }
                    }
                    this.f25329Oooo0oo = null;
                    this.f25327Oooo0o = null;
                    this.f25328Oooo0oO = 7;
                    if (liveDataScope2.emit(apiResult2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 6:
                    apiResult2 = this.f25327Oooo0o;
                    liveDataScope3 = (LiveDataScope) this.f25329Oooo0oo;
                    ResultKt.throwOnFailure(obj);
                    liveDataScope2 = liveDataScope3;
                    this.f25329Oooo0oo = null;
                    this.f25327Oooo0o = null;
                    this.f25328Oooo0oO = 7;
                    if (liveDataScope2.emit(apiResult2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 7:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public LoginVM() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+02"));
        this.dateFormat = simpleDateFormat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeLanguageAndRoom(boolean regionChange) {
        if (regionChange || RoomStateManager.INSTANCE.getRoomState() == RoomState.InRoom) {
            if (!regionChange && RoomStateManager.INSTANCE.getRoomState() == RoomState.InRoom) {
                LiveEventBus.get("LOGIN_REENTER_ROOM").post(Boolean.TRUE);
                return;
            }
            if (!regionChange) {
                RoomStateManager roomStateManager = RoomStateManager.INSTANCE;
                if (roomStateManager.getRoomState() == RoomState.Hook) {
                    roomStateManager.closeRoom();
                    return;
                }
            }
            if (regionChange && RoomStateManager.INSTANCE.getRoomState() != RoomState.InRoom) {
                LiveEventBus.get("RECREATE").post(Boolean.TRUE);
                return;
            }
            if (regionChange) {
                RoomStateManager roomStateManager2 = RoomStateManager.INSTANCE;
                if (roomStateManager2.getRoomState() == RoomState.InRoom) {
                    ToastUtil.f12567OooO00o.OooO00o(R.string.reenter_room);
                    roomStateManager2.closeRoom();
                    LiveEventBus.get("RECREATE").post(Boolean.TRUE);
                    return;
                }
            }
            if (regionChange) {
                RoomStateManager roomStateManager3 = RoomStateManager.INSTANCE;
                if (roomStateManager3.getRoomState() == RoomState.Hook) {
                    roomStateManager3.closeRoom();
                    LiveEventBus.get("RECREATE").post(Boolean.TRUE);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertWelcomeMessage(boolean isFirst, UserInfoModel userInfoModel) {
        if (isFirst) {
            YallaTeamMessage message = new YallaTeamMessage();
            message.setUid(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue());
            message.setMid(o0OoOo0.f43133OooO00o.OooO00o(null));
            message.setType(6);
            message.setTime(System.currentTimeMillis());
            Intrinsics.checkNotNullParameter(message, "message");
            p491o0o00O00.OooO0OO.OooO00o().Oooo0OO().OooO0o(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logEvent(boolean isFirst, OpenAuthManager.AuthType type) {
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        new ApiEvent().OooO00o(70);
        if (isFirst) {
            p141o00OOoo.OooO.OooO00o("AFEventLogin", null);
        }
        int i = type == null ? -1 : OooO00o.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            o0O00000.OooO0OO("Twitter_success");
        } else if (i == 2) {
            o0O00000.OooO0OO("Instagram_success");
        } else {
            if (i != 3) {
                return;
            }
            o0O00000.OooO0OO("Facebook_success");
        }
    }

    public static /* synthetic */ Object onLoginSuccess$suspendImpl(LoginVM loginVM, boolean z, UserInfoModel userInfoModel, LoginToken loginToken, OpenAuthManager.AuthType authType, Continuation continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), loginVM.new OooO0OO(z, loginToken, userInfoModel, authType, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveAccountData(boolean isFirst, LoginToken token, UserInfoModel userInfoModel) {
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        oooOOO.Oooo0(userInfoModel, false);
        oooOOO.Oooo00O(token.getToken(), token.getTokenActivity(), token.getTokenChat(), token.getTokenRoom());
        OooOOO.f41218OooO0OO = isFirst;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveDataToSp(boolean isFirst, UserInfoModel userInfoModel) {
        if (isFirst) {
            if (userInfoModel.getIsNewUser()) {
                OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
                p499o0o00OoO.o00000OO o00000ooOooOOO0 = OooOOO0.OooOOO0();
                String str = this.dateFormat.format(new Date());
                Intrinsics.checkNotNullExpressionValue(str, "dateFormat.format(Date())");
                o00000ooOooOOO0.OooOOOO(str);
            }
            OooOOO0 oooOOO1 = OooOOO0.f41180OooO00o;
            OooOOO0.OooO0o0().OooOOo(true);
            OooOOO0.OooO0o0().OooOOoo(true);
            OooOOO0.OooO0o0().OooOo00(true);
            OooOOO0.OooO0o0().OooOo0(true);
            OooOOO0.OooO0o0().OooOOo0(true);
            OooOOO0.OooO0o0().OooOoo0(true);
            OooOOO0.OooO0o0().OooOOOO(true);
            OooOOO0.OooO0o0().OooOOOo(true);
            SharedMainMessageManager sharedMainMessageManager = SharedMainMessageManager.INSTANCE;
            MutableLiveData<Boolean> premiumMomentEditRedDot = sharedMainMessageManager.getPremiumMomentEditRedDot();
            Boolean bool = Boolean.FALSE;
            premiumMomentEditRedDot.postValue(bool);
            sharedMainMessageManager.getVipRedDot_CustomRoomTheme().postValue(bool);
            sharedMainMessageManager.getVipRedDot_ExclusiveBubble().postValue(bool);
            sharedMainMessageManager.getVipRedDot_IncognitoAccess().postValue(bool);
            sharedMainMessageManager.getUniqueMessageDot().postValue(bool);
            sharedMainMessageManager.getUserVehicleMessageDot().postValue(bool);
            sharedMainMessageManager.getStoreBubbleDot().postValue(bool);
        } else {
            OooOOO0 oooOOO2 = OooOOO0.f41180OooO00o;
            OooOOO0.OooO0o0().OooO0o("main", false);
        }
        OooOOO0 oooOOO3 = OooOOO0.f41180OooO00o;
        OooOOO0.OooO0o0().OooOOO0();
        OooOOO0.OooO0o0().OooOo0o();
        OooOOO0.OooO0o0().OooOo();
        OooOOO0.OooO0o0().OooOoO0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yallaChatLoginCovert(String str, Continuation<? super ApiResult<LoginListModel>> continuation) {
        OooO oooO;
        LoginToken token;
        UserInfoModel data;
        if (continuation instanceof OooO) {
            oooO = (OooO) continuation;
            int i = oooO.f25316Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO.f25316Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(continuation);
            }
        } else {
            oooO = new OooO(continuation);
        }
        Object objOooO = oooO.f25314Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO.f25316Oooo0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO);
            o0000O o0000o2 = o0000O.f42365OooO00o;
            oooO.f25316Oooo0oo = 1;
            objOooO = o0000o2.OooO(str, oooO);
            if (objOooO == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooO);
        }
        ApiResult apiResult = (ApiResult) objOooO;
        LoginListModel loginListModel = new LoginListModel();
        ArrayList arrayList = new ArrayList();
        LoginModel loginModel = (LoginModel) apiResult.getData();
        if (loginModel != null && (data = loginModel.getData()) != null) {
            Boxing.boxBoolean(arrayList.add(data));
        }
        LoginModel loginModel2 = (LoginModel) apiResult.getData();
        if (loginModel2 != null && (token = loginModel2.getToken()) != null) {
            loginListModel.setToken(token);
        }
        loginListModel.setData(arrayList);
        LoginModel loginModel3 = (LoginModel) apiResult.getData();
        loginListModel.setFirst(loginModel3 != null ? loginModel3.getIsFirst() : false);
        MutableLiveData<Boolean> mutableLiveDataOooOOo0 = OooOOO.f41216OooO00o.OooOOo0();
        LoginModel loginModel4 = (LoginModel) apiResult.getData();
        mutableLiveDataOooOOo0.postValue(Boxing.boxBoolean(loginModel4 != null ? loginModel4.getIsBindRemind() : false));
        ApiResult apiResult2 = new ApiResult();
        apiResult2.setCode(apiResult.getCode());
        apiResult2.setMessage(apiResult.getMessage());
        apiResult2.setData(loginListModel);
        return apiResult2;
    }

    @NotNull
    public final LiveData<ApiResult<LoginModel>> activeAccount() {
        return o0000O0O.OooO00o(new OooO0O0(null));
    }

    @Nullable
    public Object onLoginSuccess(boolean z, @NotNull UserInfoModel userInfoModel, @NotNull LoginToken loginToken, @Nullable OpenAuthManager.AuthType authType, @NotNull Continuation<? super Unit> continuation) {
        return onLoginSuccess$suspendImpl(this, z, userInfoModel, loginToken, authType, continuation);
    }

    @NotNull
    public final LiveData<ApiResult<LoginListModel>> thirdLogin(@NotNull String accessToken, @NotNull OpenAuthManager.AuthType type, @Nullable String twitterSecretOrInsUserId) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(type, "type");
        return o0000O0O.OooO00o(new OooO0o(type, accessToken, twitterSecretOrInsUserId, this, null));
    }
}
