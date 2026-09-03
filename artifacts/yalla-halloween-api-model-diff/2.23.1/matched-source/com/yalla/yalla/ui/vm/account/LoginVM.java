package com.yalla.yalla.ui.vm.account;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import com.code.android.util.OooOOO;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.code.android.util.o00oO0o;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.qiniu.android.collect.ReportItem;
import com.yalla.yalla.api.old.ApiEvent;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.data.repository.AccountRepo;
import com.yalla.yalla.data.repository.AccountRepo$activeAccount$$inlined$call$1;
import com.yalla.yalla.manager.RoomState;
import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.model.LoginModel;
import com.yalla.yalla.model.LoginToken;
import com.yalla.yalla.model.MomentSelectMedia;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.MyUserInfoModel;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.main.StartActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p382o0OOoOo.o0ooOOo;
import p384o0OOoo.OooOOO0;
import p386o0OOoo0O.oo0o0Oo;
import p392o0OOooo.o00000;
import p396o0Oo0.OooOO0;
import p410o0Oo0Oo0.o00O0O;
import p414o0Oo0o0O.o00O;
import p416o0Oo0oO.oO00O0o;
import p416o0Oo0oO.oO00OOO;
import p416o0Oo0oO.oO0OOo0o;
import p417o0Oo0oO0.o00Oo0;
import p428o0OoO0o0.OooOOOO;
import p431o0OoOO.o0Oo0oo;
import p474o0OoooOO.oo0oO0;
import p476o0Ooooo.o0O0o000;
import p478o0OooooO.oOO0O0O;
import p565o0oOo000.o000OOo;
import p587o0oOooO.oO000;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J \u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001a\u0010\u0014\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0002J,\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00040\u0018J5\u0010\u001c\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/yalla/yalla/ui/vm/account/LoginVM;", "Lo0Oo0/OooOO0;", "", "accessToken", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/LoginListModel;", "yallaChatLoginCovert", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "regionChange", "", "changeLanguageAndRoom", "isFirst", "Lcom/yalla/yalla/model/LoginToken;", "token", "Lcom/yalla/yalla/model/user/MyUserInfoModel;", "userInfoModel", "saveAccountData", "Lcom/yalla/yalla/open_auth/OpenAuthManager$AuthType;", "type", "logSuccessEvent", "saveDataToSp", "insertWelcomeMessage", "twitterSecretOrInsUserId", "Landroidx/lifecycle/LiveData;", "thirdLogin", "Lcom/yalla/yalla/model/LoginModel;", "activeAccount", "onLoginSuccess", "(ZLcom/yalla/yalla/model/user/MyUserInfoModel;Lcom/yalla/yalla/model/LoginToken;Lcom/yalla/yalla/open_auth/OpenAuthManager$AuthType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLoginVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginVM.kt\ncom/yalla/yalla/ui/vm/account/LoginVM\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,276:1\n1#2:277\n*E\n"})
public class LoginVM extends OooOO0 {
    public static final int $stable = 8;

    @NotNull
    private final SimpleDateFormat dateFormat;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.LoginVM", f = "LoginVM.kt", i = {}, l = {88}, m = "yallaChatLoginCovert", n = {}, s = {})
    public static final class OooO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f31108OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f31109OooO0o;

        public OooO(Continuation<? super OooO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31108OooO0Oo = obj;
            this.f31109OooO0o |= Integer.MIN_VALUE;
            return LoginVM.this.yallaChatLoginCovert(null, this);
        }
    }

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OpenAuthManager.AuthType.values().length];
            try {
                iArr[OpenAuthManager.AuthType.WeChat.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OpenAuthManager.AuthType.Facebook.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OpenAuthManager.AuthType.Twitter.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OpenAuthManager.AuthType.YallaChat.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OpenAuthManager.AuthType.Instagram.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.LoginVM$activeAccount$1", f = "LoginVM.kt", i = {0, 1, 1}, l = {104, 105, 111}, m = "invokeSuspend", n = {"$this$liveDataAsync", "$this$liveDataAsync", ReportItem.QualityKeyResult}, s = {"L$0", "L$0", "L$1"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<LoginModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ApiResult f31111OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f31112OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f31113OooO0o0;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = LoginVM.this.new OooO0O0(continuation);
            oooO0O0.f31112OooO0o = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<LoginModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00b7 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            ApiResult apiResult;
            LiveDataScope liveDataScope2;
            ApiResult apiResult2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31113OooO0o0;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31112OooO0o;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    apiResult2 = this.f31111OooO0Oo;
                    liveDataScope2 = (LiveDataScope) this.f31112OooO0o;
                    ResultKt.throwOnFailure(obj);
                    apiResult = apiResult2;
                    liveDataScope = liveDataScope2;
                    this.f31112OooO0o = null;
                    this.f31111OooO0Oo = null;
                    this.f31113OooO0o0 = 3;
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
            LiveDataScope liveDataScope3 = (LiveDataScope) this.f31112OooO0o;
            AccountRepo accountRepo = AccountRepo.f22392OooO00o;
            this.f31112OooO0o = liveDataScope3;
            this.f31113OooO0o0 = 1;
            accountRepo.getClass();
            String url = OooOOO0.f43291OooO0Oo;
            Intrinsics.checkNotNullParameter(url, "url");
            o0ooOOo o0ooooo = new o0ooOOo(url, 1);
            o0ooooo.OooO00o();
            Object objOooO0Oo = OooOOO.OooO0Oo(new AccountRepo$activeAccount$$inlined$call$1(o0ooooo, null), this);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            liveDataScope = liveDataScope3;
            obj = objOooO0Oo;
            apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                LoginVM loginVM = LoginVM.this;
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
                this.f31112OooO0o = liveDataScope;
                this.f31111OooO0Oo = apiResult;
                this.f31113OooO0o0 = 2;
                if (loginVM.onLoginSuccess(isFirst, data3, token, null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                liveDataScope2 = liveDataScope;
                apiResult2 = apiResult;
                apiResult = apiResult2;
                liveDataScope = liveDataScope2;
            }
            this.f31112OooO0o = null;
            this.f31111OooO0Oo = null;
            this.f31113OooO0o0 = 3;
            if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.LoginVM$onLoginSuccess$2", f = "LoginVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LoginToken f31116OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f31117OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MyUserInfoModel f31118OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ OpenAuthManager.AuthType f31119OooO0oo;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.LoginVM$onLoginSuccess$2$1", f = "LoginVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
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
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                List<MomentSelectMedia> list = p539o0o0Oo00.OooO.f54305OooO00o;
                if (list != null) {
                    list.clear();
                }
                p539o0o0Oo00.OooO.f54305OooO00o = null;
                oO00O0o oo00o0oOooOO0 = o00Oo0.OooOO0();
                oo00o0oOooOO0.OooOO0o("");
                oo00o0oOooOO0.OooOOO0("");
                oo00o0oOooOO0.OooOO0O("");
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, MyUserInfoModel myUserInfoModel, LoginToken loginToken, OpenAuthManager.AuthType authType, Continuation continuation) {
            super(2, continuation);
            this.f31117OooO0o0 = z;
            this.f31116OooO0o = loginToken;
            this.f31118OooO0oO = myUserInfoModel;
            this.f31119OooO0oo = authType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LoginVM.this.new OooO0OO(this.f31117OooO0o0, this.f31118OooO0oO, this.f31116OooO0o, this.f31119OooO0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws JSONException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            Integer num = (Integer) oo0oO0.OooOOO0().getValue();
            LoginVM loginVM = LoginVM.this;
            boolean z = this.f31117OooO0o0;
            LoginToken loginToken = this.f31116OooO0o;
            MyUserInfoModel myUserInfoModel = this.f31118OooO0oO;
            loginVM.saveAccountData(z, loginToken, myUserInfoModel);
            loginVM.saveDataToSp(z, myUserInfoModel);
            loginVM.insertWelcomeMessage(z);
            loginVM.logSuccessEvent(z, this.f31119OooO0oo);
            o0O0o000.OooO00o();
            oo0oO0.OooOo0O().setValue(Boxing.boxBoolean(true));
            LiveEventBus.get("LOGIN_RESULT").post(Boxing.boxBoolean(true));
            loginVM.changeLanguageAndRoom(!Intrinsics.areEqual(num, oo0oO0.OooOOO0().getValue()));
            oO000.OooO0O0(true);
            return OooOOO.OooO0O0(CoroutineScopeKt.MainScope(), new OooO00o(null));
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.LoginVM$thirdLogin$1", f = "LoginVM.kt", i = {0, 1, 2, 3, 4, 5, 5}, l = {63, 68, 69, 70, 72, 77, 84}, m = "invokeSuspend", n = {"$this$liveDataAsync", "$this$liveDataAsync", "$this$liveDataAsync", "$this$liveDataAsync", "$this$liveDataAsync", "$this$liveDataAsync", ReportItem.QualityKeyResult}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$1"})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<LoginListModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ String f31120OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ApiResult f31121OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f31122OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f31123OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ OpenAuthManager.AuthType f31124OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f31125OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ LoginVM f31126OooOO0;

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OpenAuthManager.AuthType.values().length];
                try {
                    iArr[OpenAuthManager.AuthType.Twitter.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OpenAuthManager.AuthType.Facebook.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OpenAuthManager.AuthType.WeChat.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[OpenAuthManager.AuthType.YallaChat.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[OpenAuthManager.AuthType.Instagram.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(OpenAuthManager.AuthType authType, String str, String str2, LoginVM loginVM, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f31124OooO0oO = authType;
            this.f31125OooO0oo = str;
            this.f31120OooO = str2;
            this.f31126OooOO0 = loginVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f31124OooO0oO, this.f31125OooO0oo, this.f31120OooO, this.f31126OooOO0, continuation);
            oooO0o.f31122OooO0o = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<LoginListModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:50:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:59:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:62:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:65:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:67:0x0101  */
        /* JADX WARN: Code duplicated, block: B:69:0x0147 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:70:0x0148  */
        /* JADX WARN: Code duplicated, block: B:74:0x0157 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            ApiResult apiResult;
            ApiResult apiResult2;
            LiveDataScope liveDataScope2;
            LoginListModel loginListModel;
            List<MyUserInfoModel> data;
            boolean z;
            LoginListModel loginListModel2;
            LoginToken token;
            LoginVM loginVM;
            boolean isFirst;
            MyUserInfoModel myUserInfoModel;
            LoginToken token2;
            OpenAuthManager.AuthType authType;
            LiveDataScope liveDataScope3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.f31123OooO0o0) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    liveDataScope = (LiveDataScope) this.f31122OooO0o;
                    int i = OooO00o.$EnumSwitchMapping$0[this.f31124OooO0oO.ordinal()];
                    o00O o00o2 = o00O.f46023OooO00o;
                    String str = this.f31120OooO;
                    String str2 = this.f31125OooO0oo;
                    if (i == 1) {
                        Intrinsics.checkNotNull(str);
                        this.f31122OooO0o = liveDataScope;
                        this.f31123OooO0o0 = 1;
                        obj = o00o2.OooO0oO(str2, str, this);
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
                                    loginVM = this.f31126OooOO0;
                                    Object data2 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data2);
                                    isFirst = ((LoginListModel) data2).getIsFirst();
                                    Object data3 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data3);
                                    List<MyUserInfoModel> data4 = ((LoginListModel) data3).getData();
                                    Intrinsics.checkNotNull(data4);
                                    myUserInfoModel = data4.get(0);
                                    Object data5 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data5);
                                    token2 = ((LoginListModel) data5).getToken();
                                    Intrinsics.checkNotNull(token2);
                                    authType = this.f31124OooO0oO;
                                    this.f31122OooO0o = liveDataScope2;
                                    this.f31121OooO0Oo = apiResult2;
                                    this.f31123OooO0o0 = 6;
                                    if (loginVM.onLoginSuccess(isFirst, myUserInfoModel, token2, authType, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    liveDataScope3 = liveDataScope2;
                                    liveDataScope2 = liveDataScope3;
                                }
                            }
                        }
                        this.f31122OooO0o = null;
                        this.f31121OooO0Oo = null;
                        this.f31123OooO0o0 = 7;
                        if (liveDataScope2.emit(apiResult2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i == 2) {
                        this.f31122OooO0o = liveDataScope;
                        this.f31123OooO0o0 = 2;
                        obj = o00o2.OooO0OO(str2, this);
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
                                    loginVM = this.f31126OooOO0;
                                    Object data6 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data6);
                                    isFirst = ((LoginListModel) data6).getIsFirst();
                                    Object data7 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data7);
                                    List<MyUserInfoModel> data8 = ((LoginListModel) data7).getData();
                                    Intrinsics.checkNotNull(data8);
                                    myUserInfoModel = data8.get(0);
                                    Object data9 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data9);
                                    token2 = ((LoginListModel) data9).getToken();
                                    Intrinsics.checkNotNull(token2);
                                    authType = this.f31124OooO0oO;
                                    this.f31122OooO0o = liveDataScope2;
                                    this.f31121OooO0Oo = apiResult2;
                                    this.f31123OooO0o0 = 6;
                                    if (loginVM.onLoginSuccess(isFirst, myUserInfoModel, token2, authType, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    liveDataScope3 = liveDataScope2;
                                    liveDataScope2 = liveDataScope3;
                                }
                            }
                        }
                        this.f31122OooO0o = null;
                        this.f31121OooO0Oo = null;
                        this.f31123OooO0o0 = 7;
                        if (liveDataScope2.emit(apiResult2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i == 3) {
                        this.f31122OooO0o = liveDataScope;
                        this.f31123OooO0o0 = 3;
                        obj = o00o2.OooO0oo(str2, this);
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
                                    loginVM = this.f31126OooOO0;
                                    Object data10 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data10);
                                    isFirst = ((LoginListModel) data10).getIsFirst();
                                    Object data11 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data11);
                                    List<MyUserInfoModel> data12 = ((LoginListModel) data11).getData();
                                    Intrinsics.checkNotNull(data12);
                                    myUserInfoModel = data12.get(0);
                                    Object data13 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data13);
                                    token2 = ((LoginListModel) data13).getToken();
                                    Intrinsics.checkNotNull(token2);
                                    authType = this.f31124OooO0oO;
                                    this.f31122OooO0o = liveDataScope2;
                                    this.f31121OooO0Oo = apiResult2;
                                    this.f31123OooO0o0 = 6;
                                    if (loginVM.onLoginSuccess(isFirst, myUserInfoModel, token2, authType, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    liveDataScope3 = liveDataScope2;
                                    liveDataScope2 = liveDataScope3;
                                }
                            }
                        }
                        this.f31122OooO0o = null;
                        this.f31121OooO0Oo = null;
                        this.f31123OooO0o0 = 7;
                        if (liveDataScope2.emit(apiResult2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i == 4) {
                        this.f31122OooO0o = liveDataScope;
                        this.f31123OooO0o0 = 4;
                        obj = this.f31126OooOO0.yallaChatLoginCovert(str2, this);
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
                                    loginVM = this.f31126OooOO0;
                                    Object data14 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data14);
                                    isFirst = ((LoginListModel) data14).getIsFirst();
                                    Object data15 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data15);
                                    List<MyUserInfoModel> data16 = ((LoginListModel) data15).getData();
                                    Intrinsics.checkNotNull(data16);
                                    myUserInfoModel = data16.get(0);
                                    Object data17 = apiResult2.getData();
                                    Intrinsics.checkNotNull(data17);
                                    token2 = ((LoginListModel) data17).getToken();
                                    Intrinsics.checkNotNull(token2);
                                    authType = this.f31124OooO0oO;
                                    this.f31122OooO0o = liveDataScope2;
                                    this.f31121OooO0Oo = apiResult2;
                                    this.f31123OooO0o0 = 6;
                                    if (loginVM.onLoginSuccess(isFirst, myUserInfoModel, token2, authType, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    liveDataScope3 = liveDataScope2;
                                    liveDataScope2 = liveDataScope3;
                                }
                            }
                        }
                        this.f31122OooO0o = null;
                        this.f31121OooO0Oo = null;
                        this.f31123OooO0o0 = 7;
                        if (liveDataScope2.emit(apiResult2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String strValueOf = String.valueOf(str);
                    this.f31122OooO0o = liveDataScope;
                    this.f31123OooO0o0 = 5;
                    obj = o00o2.OooO0Oo(str2, strValueOf, this);
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
                                loginVM = this.f31126OooOO0;
                                Object data18 = apiResult2.getData();
                                Intrinsics.checkNotNull(data18);
                                isFirst = ((LoginListModel) data18).getIsFirst();
                                Object data19 = apiResult2.getData();
                                Intrinsics.checkNotNull(data19);
                                List<MyUserInfoModel> data110 = ((LoginListModel) data19).getData();
                                Intrinsics.checkNotNull(data110);
                                myUserInfoModel = data110.get(0);
                                Object data111 = apiResult2.getData();
                                Intrinsics.checkNotNull(data111);
                                token2 = ((LoginListModel) data111).getToken();
                                Intrinsics.checkNotNull(token2);
                                authType = this.f31124OooO0oO;
                                this.f31122OooO0o = liveDataScope2;
                                this.f31121OooO0Oo = apiResult2;
                                this.f31123OooO0o0 = 6;
                                if (loginVM.onLoginSuccess(isFirst, myUserInfoModel, token2, authType, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                liveDataScope3 = liveDataScope2;
                                liveDataScope2 = liveDataScope3;
                            }
                        }
                    }
                    this.f31122OooO0o = null;
                    this.f31121OooO0Oo = null;
                    this.f31123OooO0o0 = 7;
                    if (liveDataScope2.emit(apiResult2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 1:
                    liveDataScope = (LiveDataScope) this.f31122OooO0o;
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
                                loginVM = this.f31126OooOO0;
                                Object data112 = apiResult2.getData();
                                Intrinsics.checkNotNull(data112);
                                isFirst = ((LoginListModel) data112).getIsFirst();
                                Object data113 = apiResult2.getData();
                                Intrinsics.checkNotNull(data113);
                                List<MyUserInfoModel> data114 = ((LoginListModel) data113).getData();
                                Intrinsics.checkNotNull(data114);
                                myUserInfoModel = data114.get(0);
                                Object data115 = apiResult2.getData();
                                Intrinsics.checkNotNull(data115);
                                token2 = ((LoginListModel) data115).getToken();
                                Intrinsics.checkNotNull(token2);
                                authType = this.f31124OooO0oO;
                                this.f31122OooO0o = liveDataScope2;
                                this.f31121OooO0Oo = apiResult2;
                                this.f31123OooO0o0 = 6;
                                if (loginVM.onLoginSuccess(isFirst, myUserInfoModel, token2, authType, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                liveDataScope3 = liveDataScope2;
                                liveDataScope2 = liveDataScope3;
                            }
                        }
                    }
                    this.f31122OooO0o = null;
                    this.f31121OooO0Oo = null;
                    this.f31123OooO0o0 = 7;
                    if (liveDataScope2.emit(apiResult2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 2:
                    liveDataScope = (LiveDataScope) this.f31122OooO0o;
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
                                loginVM = this.f31126OooOO0;
                                Object data116 = apiResult2.getData();
                                Intrinsics.checkNotNull(data116);
                                isFirst = ((LoginListModel) data116).getIsFirst();
                                Object data117 = apiResult2.getData();
                                Intrinsics.checkNotNull(data117);
                                List<MyUserInfoModel> data118 = ((LoginListModel) data117).getData();
                                Intrinsics.checkNotNull(data118);
                                myUserInfoModel = data118.get(0);
                                Object data119 = apiResult2.getData();
                                Intrinsics.checkNotNull(data119);
                                token2 = ((LoginListModel) data119).getToken();
                                Intrinsics.checkNotNull(token2);
                                authType = this.f31124OooO0oO;
                                this.f31122OooO0o = liveDataScope2;
                                this.f31121OooO0Oo = apiResult2;
                                this.f31123OooO0o0 = 6;
                                if (loginVM.onLoginSuccess(isFirst, myUserInfoModel, token2, authType, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                liveDataScope3 = liveDataScope2;
                                liveDataScope2 = liveDataScope3;
                            }
                        }
                    }
                    this.f31122OooO0o = null;
                    this.f31121OooO0Oo = null;
                    this.f31123OooO0o0 = 7;
                    if (liveDataScope2.emit(apiResult2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 3:
                    liveDataScope = (LiveDataScope) this.f31122OooO0o;
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
                                loginVM = this.f31126OooOO0;
                                Object data1110 = apiResult2.getData();
                                Intrinsics.checkNotNull(data1110);
                                isFirst = ((LoginListModel) data1110).getIsFirst();
                                Object data1111 = apiResult2.getData();
                                Intrinsics.checkNotNull(data1111);
                                List<MyUserInfoModel> data1112 = ((LoginListModel) data1111).getData();
                                Intrinsics.checkNotNull(data1112);
                                myUserInfoModel = data1112.get(0);
                                Object data1113 = apiResult2.getData();
                                Intrinsics.checkNotNull(data1113);
                                token2 = ((LoginListModel) data1113).getToken();
                                Intrinsics.checkNotNull(token2);
                                authType = this.f31124OooO0oO;
                                this.f31122OooO0o = liveDataScope2;
                                this.f31121OooO0Oo = apiResult2;
                                this.f31123OooO0o0 = 6;
                                if (loginVM.onLoginSuccess(isFirst, myUserInfoModel, token2, authType, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                liveDataScope3 = liveDataScope2;
                                liveDataScope2 = liveDataScope3;
                            }
                        }
                    }
                    this.f31122OooO0o = null;
                    this.f31121OooO0Oo = null;
                    this.f31123OooO0o0 = 7;
                    if (liveDataScope2.emit(apiResult2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 4:
                    liveDataScope = (LiveDataScope) this.f31122OooO0o;
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
                                loginVM = this.f31126OooOO0;
                                Object data1114 = apiResult2.getData();
                                Intrinsics.checkNotNull(data1114);
                                isFirst = ((LoginListModel) data1114).getIsFirst();
                                Object data1115 = apiResult2.getData();
                                Intrinsics.checkNotNull(data1115);
                                List<MyUserInfoModel> data1116 = ((LoginListModel) data1115).getData();
                                Intrinsics.checkNotNull(data1116);
                                myUserInfoModel = data1116.get(0);
                                Object data1117 = apiResult2.getData();
                                Intrinsics.checkNotNull(data1117);
                                token2 = ((LoginListModel) data1117).getToken();
                                Intrinsics.checkNotNull(token2);
                                authType = this.f31124OooO0oO;
                                this.f31122OooO0o = liveDataScope2;
                                this.f31121OooO0Oo = apiResult2;
                                this.f31123OooO0o0 = 6;
                                if (loginVM.onLoginSuccess(isFirst, myUserInfoModel, token2, authType, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                liveDataScope3 = liveDataScope2;
                                liveDataScope2 = liveDataScope3;
                            }
                        }
                    }
                    this.f31122OooO0o = null;
                    this.f31121OooO0Oo = null;
                    this.f31123OooO0o0 = 7;
                    if (liveDataScope2.emit(apiResult2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 5:
                    liveDataScope = (LiveDataScope) this.f31122OooO0o;
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
                                loginVM = this.f31126OooOO0;
                                Object data1118 = apiResult2.getData();
                                Intrinsics.checkNotNull(data1118);
                                isFirst = ((LoginListModel) data1118).getIsFirst();
                                Object data1119 = apiResult2.getData();
                                Intrinsics.checkNotNull(data1119);
                                List<MyUserInfoModel> data11110 = ((LoginListModel) data1119).getData();
                                Intrinsics.checkNotNull(data11110);
                                myUserInfoModel = data11110.get(0);
                                Object data11111 = apiResult2.getData();
                                Intrinsics.checkNotNull(data11111);
                                token2 = ((LoginListModel) data11111).getToken();
                                Intrinsics.checkNotNull(token2);
                                authType = this.f31124OooO0oO;
                                this.f31122OooO0o = liveDataScope2;
                                this.f31121OooO0Oo = apiResult2;
                                this.f31123OooO0o0 = 6;
                                if (loginVM.onLoginSuccess(isFirst, myUserInfoModel, token2, authType, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                liveDataScope3 = liveDataScope2;
                                liveDataScope2 = liveDataScope3;
                            }
                        }
                    }
                    this.f31122OooO0o = null;
                    this.f31121OooO0Oo = null;
                    this.f31123OooO0o0 = 7;
                    if (liveDataScope2.emit(apiResult2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 6:
                    apiResult2 = this.f31121OooO0Oo;
                    liveDataScope3 = (LiveDataScope) this.f31122OooO0o;
                    ResultKt.throwOnFailure(obj);
                    liveDataScope2 = liveDataScope3;
                    this.f31122OooO0o = null;
                    this.f31121OooO0Oo = null;
                    this.f31123OooO0o0 = 7;
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
        if (!regionChange) {
            MutableState mutableState = o0Oo0oo.f46817OooO00o;
            if (o0Oo0oo.OooO0oO() != RoomState.InRoom) {
                return;
            }
        }
        if (!regionChange) {
            MutableState mutableState2 = o0Oo0oo.f46817OooO00o;
            if (o0Oo0oo.OooO0oO() == RoomState.InRoom) {
                LiveEventBus.get("LOGIN_REENTER_ROOM").post(Boolean.TRUE);
                return;
            }
        }
        if (!regionChange) {
            MutableState mutableState3 = o0Oo0oo.f46817OooO00o;
            if (o0Oo0oo.OooO0oO() == RoomState.Hook) {
                o0Oo0oo.OooO00o();
                return;
            }
        }
        if (regionChange) {
            MutableState mutableState4 = o0Oo0oo.f46817OooO00o;
            if (o0Oo0oo.OooO0oO() != RoomState.InRoom) {
                Context context = o000O00O.f13430OooO00o;
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = StartActivity.f25082OooO0o0;
                    StartActivity.OooO00o.OooO0O0(activityOooO0O0);
                    return;
                }
                return;
            }
        }
        if (regionChange) {
            MutableState mutableState5 = o0Oo0oo.f46817OooO00o;
            if (o0Oo0oo.OooO0oO() == RoomState.InRoom) {
                String strOooO0OO = o0000.OooO0OO(o000OOo.reenter_room);
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                    }
                }
                o0Oo0oo.OooO00o();
                Context context2 = o000O00O.f13430OooO00o;
                Activity activityOooO0O1 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O1 != null) {
                    int i2 = StartActivity.f25082OooO0o0;
                    StartActivity.OooO00o.OooO0O0(activityOooO0O1);
                    return;
                }
                return;
            }
        }
        if (regionChange) {
            MutableState mutableState6 = o0Oo0oo.f46817OooO00o;
            if (o0Oo0oo.OooO0oO() == RoomState.Hook) {
                o0Oo0oo.OooO00o();
                Context context3 = o000O00O.f13430OooO00o;
                Activity activityOooO0O2 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O2 != null) {
                    int i3 = StartActivity.f25082OooO0o0;
                    StartActivity.OooO00o.OooO0O0(activityOooO0O2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertWelcomeMessage(boolean isFirst) {
        if (isFirst) {
            YallaTeamMessage message = new YallaTeamMessage();
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            message.setUid(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
            message.setMid(oOO0O0O.f48350OooO00o.OooO00o(null));
            message.setType(6);
            message.setTime(System.currentTimeMillis());
            Intrinsics.checkNotNullParameter(message, "message");
            o00O0O.OooO00o().Oooo0O0().OooO0oO(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logSuccessEvent(boolean isFirst, OpenAuthManager.AuthType type) {
        int i = type == null ? -1 : OooO00o.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            p386o0OOoo0O.o0ooOOo o0ooooo = oo0o0Oo.f43479OooO00o;
            LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
            linkedHashMapOooO00o.put("eventType", FeedbackType.Others);
            linkedHashMapOooO00o.put("step", "70");
            ApiEvent.OooO0O0(linkedHashMapOooO00o);
        } else if (i == 2) {
            p386o0OOoo0O.o0ooOOo o0ooooo2 = oo0o0Oo.f43479OooO00o;
            LinkedHashMap linkedHashMapOooO00o2 = OooOOOO.OooO00o();
            linkedHashMapOooO00o2.put("eventType", FeedbackType.Suggestions);
            linkedHashMapOooO00o2.put("step", "70");
            ApiEvent.OooO0O0(linkedHashMapOooO00o2);
        } else if (i == 3) {
            p386o0OOoo0O.o0ooOOo o0ooooo3 = oo0o0Oo.f43479OooO00o;
            LinkedHashMap linkedHashMapOooO00o3 = OooOOOO.OooO00o();
            linkedHashMapOooO00o3.put("eventType", FeedbackType.Recharge);
            linkedHashMapOooO00o3.put("step", "70");
            ApiEvent.OooO0O0(linkedHashMapOooO00o3);
        } else if (i != 4) {
            p386o0OOoo0O.o0ooOOo o0ooooo4 = oo0o0Oo.f43479OooO00o;
            ApiEvent.OooO00o(70);
        } else {
            p386o0OOoo0O.o0ooOOo o0ooooo5 = oo0o0Oo.f43479OooO00o;
            LinkedHashMap linkedHashMapOooO00o4 = OooOOOO.OooO00o();
            linkedHashMapOooO00o4.put("eventType", FeedbackType.Others);
            linkedHashMapOooO00o4.put("step", "70");
            ApiEvent.OooO0O0(linkedHashMapOooO00o4);
        }
        if (isFirst) {
            o00000.OooO00o("AFEventLogin", null);
        }
        int i2 = type != null ? OooO00o.$EnumSwitchMapping$0[type.ordinal()] : -1;
        if (i2 == 2) {
            h0.OooO0O0("201034");
        } else if (i2 == 3) {
            h0.OooO0O0("201036");
        } else {
            if (i2 != 5) {
                return;
            }
            h0.OooO0O0("201038");
        }
    }

    public static /* synthetic */ Object onLoginSuccess$suspendImpl(LoginVM loginVM, boolean z, MyUserInfoModel myUserInfoModel, LoginToken loginToken, OpenAuthManager.AuthType authType, Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), loginVM.new OooO0OO(z, myUserInfoModel, loginToken, authType, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveAccountData(boolean isFirst, LoginToken token, MyUserInfoModel userInfoModel) {
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        oo0oO0.OooOoo(false, userInfoModel);
        oo0oO0.OooOoo0(token.getToken(), token.getTokenActivity(), token.getTokenChat(), token.getTokenRoom());
        oo0oO0.f47970OooO0Oo = isFirst;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveDataToSp(boolean isFirst, MyUserInfoModel userInfoModel) {
        if (isFirst) {
            if (userInfoModel.getIsNewUser()) {
                oO00OOO oo00oooOooOO0o = o00Oo0.OooOO0o();
                String str = this.dateFormat.format(new Date());
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                oo00oooOooOO0o.OooOOOo(str);
            }
            oO0OOo0o oo0ooo0oOooO0o0 = o00Oo0.OooO0o0();
            oo0ooo0oOooO0o0.getClass();
            oo0ooo0oOooO0o0.OooO0o("room" + oo0oO0.OooOOo0().getValue(), true);
            oO0OOo0o oo0ooo0oOooO0o1 = o00Oo0.OooO0o0();
            oo0ooo0oOooO0o1.getClass();
            oo0ooo0oOooO0o1.OooO0o("roomChat" + oo0oO0.OooOOo0().getValue(), true);
            oO0OOo0o oo0ooo0oOooO0o2 = o00Oo0.OooO0o0();
            oo0ooo0oOooO0o2.getClass();
            oo0ooo0oOooO0o2.OooO0o("roomGift" + oo0oO0.OooOOo0().getValue(), true);
            oO0OOo0o oo0ooo0oOooO0o3 = o00Oo0.OooO0o0();
            oo0ooo0oOooO0o3.getClass();
            oo0ooo0oOooO0o3.OooO0o("roomHook" + oo0oO0.OooOOo0().getValue(), true);
            o00Oo0.OooO0o0().OooOOO(true);
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            ((MutableLiveData) oo0oO0.f47969OooO0OO.getValue()).postValue(Boolean.TRUE);
            oO0OOo0o oo0ooo0oOooO0o4 = o00Oo0.OooO0o0();
            oo0ooo0oOooO0o4.getClass();
            oo0ooo0oOooO0o4.OooO0o("messageDot" + oo0oO0.OooOOo0().getValue(), true);
            oO0OOo0o oo0ooo0oOooO0o5 = o00Oo0.OooO0o0();
            oo0ooo0oOooO0o5.getClass();
            o0000O0O.OooO0OO.OooO0OO("language", oo0oO0.OooOOo0().getValue(), oo0ooo0oOooO0o5, true);
            SharedMainMessageManager sharedMainMessageManager = SharedMainMessageManager.INSTANCE;
            MutableLiveData<Boolean> premiumMomentEditRedDot = sharedMainMessageManager.getPremiumMomentEditRedDot();
            Boolean bool = Boolean.FALSE;
            premiumMomentEditRedDot.postValue(bool);
            sharedMainMessageManager.getVipRedDot_CustomRoomTheme().postValue(bool);
            sharedMainMessageManager.getVipRedDot_ExclusiveBubble().postValue(bool);
            sharedMainMessageManager.getVipRedDot_IncognitoAccess().postValue(bool);
            sharedMainMessageManager.getVipRedDot_ExclusiveBackpackGift().postValue(bool);
            sharedMainMessageManager.getVipRedDot_ExclusiveGiftRunway().postValue(bool);
            sharedMainMessageManager.getUniqueMessageDot().postValue(bool);
            sharedMainMessageManager.getUserVehicleMessageDot().postValue(bool);
            sharedMainMessageManager.getStoreBubbleDot().postValue(bool);
        } else {
            o00Oo0.OooO0o0().OooO0o("main", false);
        }
        o00Oo0.OooOO0O().OooOOOo(GiftPropTypeUser.Backpack.getValue(), false);
        o00Oo0.OooOO0O().OooOOO0(VipLevel.Vip6.level());
        oO0OOo0o oo0ooo0oOooO0o6 = o00Oo0.OooO0o0();
        oo0ooo0oOooO0o6.getClass();
        oo0ooo0oOooO0o6.OooO0o("giftBackpackFirstReminderTips" + oo0oO0.OooOOo0().getValue(), true);
        oO0OOo0o oo0ooo0oOooO0o7 = o00Oo0.OooO0o0();
        oo0ooo0oOooO0o7.getClass();
        oo0ooo0oOooO0o7.OooO0o("isConveneMembersRead" + oo0oO0.OooOOo0().getValue(), false);
        o00Oo0.OooO0o0().OooOOOo();
        oO0OOo0o oo0ooo0oOooO0o8 = o00Oo0.OooO0o0();
        oo0ooo0oOooO0o8.getClass();
        oo0ooo0oOooO0o8.OooO0o("showRoomApplyMicSettingDot" + oo0oO0.OooOOo0().getValue(), false);
        o00Oo0.OooO0o0().OooOOo0();
        oO0OOo0o oo0ooo0oOooO0o9 = o00Oo0.OooO0o0();
        oo0ooo0oOooO0o9.getClass();
        oo0ooo0oOooO0o9.OooO0o("roomSettingActionRecord" + oo0oO0.OooOOo0().getValue(), false);
        o00Oo0.OooO0o0().OooOOO0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yallaChatLoginCovert(String str, Continuation<? super ApiResult<LoginListModel>> continuation) {
        OooO oooO;
        LoginToken token;
        MyUserInfoModel data;
        if (continuation instanceof OooO) {
            oooO = (OooO) continuation;
            int i = oooO.f31109OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO.f31109OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(continuation);
            }
        } else {
            oooO = new OooO(continuation);
        }
        Object objOooO = oooO.f31108OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO.f31109OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO);
            o00O o00o2 = o00O.f46023OooO00o;
            oooO.f31109OooO0o = 1;
            objOooO = o00o2.OooO(str, oooO);
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
        loginListModel.setFirst(loginModel3 != null && loginModel3.getIsFirst());
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        MutableLiveData mutableLiveData = (MutableLiveData) oo0oO0.f48014OoooOOo.getValue();
        LoginModel loginModel4 = (LoginModel) apiResult.getData();
        mutableLiveData.postValue(Boxing.boxBoolean(loginModel4 != null && loginModel4.getIsBindRemind()));
        ApiResult apiResult2 = new ApiResult();
        apiResult2.setCode(apiResult.getCode());
        apiResult2.setMessage(apiResult.getMessage());
        apiResult2.setData(loginListModel);
        return apiResult2;
    }

    @NotNull
    public final LiveData<ApiResult<LoginModel>> activeAccount() {
        return o00oO0o.OooO00o(new OooO0O0(null));
    }

    @Nullable
    public Object onLoginSuccess(boolean z, @NotNull MyUserInfoModel myUserInfoModel, @NotNull LoginToken loginToken, @Nullable OpenAuthManager.AuthType authType, @NotNull Continuation<? super Unit> continuation) {
        return onLoginSuccess$suspendImpl(this, z, myUserInfoModel, loginToken, authType, continuation);
    }

    @NotNull
    public final LiveData<ApiResult<LoginListModel>> thirdLogin(@NotNull String accessToken, @NotNull OpenAuthManager.AuthType type, @Nullable String twitterSecretOrInsUserId) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(type, "type");
        return o00oO0o.OooO00o(new OooO0o(type, accessToken, twitterSecretOrInsUserId, this, null));
    }
}
