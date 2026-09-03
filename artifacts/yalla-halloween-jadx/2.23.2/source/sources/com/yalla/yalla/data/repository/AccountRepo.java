package com.yalla.yalla.data.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.appsflyer.AppsFlyerProperties;
import com.code.android.util.OooOOO;
import com.code.android.util.o000O00O;
import com.qiniu.android.collect.ReportItem;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.MyUserInfoModel;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o0ooOOo;
import p381o0OOoOo0.Oooo000;
import p382o0OOoo.OooOOO0;
import p386o0OOooO.o000000;
import p391o0OOooo0.oo000o;
import p475o0Ooooo0.o0O00oO0;
import p475o0Ooooo0.oO0O000o;
import p590o0oOooo0.oOO0O0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAccountRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountRepo.kt\ncom/yalla/yalla/data/repository/AccountRepo\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ApiBaseRepository.kt\ncom/yalla/yalla/repository/ApiBaseRepository\n*L\n1#1,247:1\n62#2:248\n62#2:250\n62#2:251\n62#2:260\n62#2:261\n62#2:262\n62#2:263\n62#2:264\n62#2:265\n62#2:266\n62#2:267\n62#2:268\n62#2:269\n62#2:270\n62#2:271\n62#2:272\n62#2:273\n62#2:274\n62#2:275\n1#3:249\n26#4:252\n47#4:253\n26#4:254\n47#4:255\n26#4:256\n47#4:257\n26#4:258\n47#4:259\n*S KotlinDebug\n*F\n+ 1 AccountRepo.kt\ncom/yalla/yalla/data/repository/AccountRepo\n*L\n45#1:248\n80#1:250\n110#1:251\n161#1:260\n165#1:261\n169#1:262\n174#1:263\n178#1:264\n188#1:265\n192#1:266\n196#1:267\n199#1:268\n203#1:269\n211#1:270\n215#1:271\n230#1:272\n235#1:273\n240#1:274\n245#1:275\n114#1:252\n114#1:253\n124#1:254\n124#1:255\n130#1:256\n130#1:257\n140#1:258\n140#1:259\n*E\n"})
public final class AccountRepo extends oO0O000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final AccountRepo f22385OooO00o = new AccountRepo();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.AccountRepo", f = "AccountRepo.kt", i = {}, l = {248}, m = "loadUserInfo", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f22386OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f22387OooO0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22386OooO0Oo = obj;
            this.f22387OooO0o |= Integer.MIN_VALUE;
            AccountRepo accountRepo = AccountRepo.f22385OooO00o;
            return AccountRepo.this.OooO0o0(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.AccountRepo", f = "AccountRepo.kt", i = {1}, l = {58, 62}, m = "syncUserInfo", n = {ReportItem.QualityKeyResult}, s = {"L$0"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ApiResult f22389OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f22391OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f22392OooO0oO;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22391OooO0o0 = obj;
            this.f22392OooO0oO |= Integer.MIN_VALUE;
            return AccountRepo.this.OooO0o(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.AccountRepo$syncUserInfo$3$1", f = "AccountRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MyUserInfoModel f22393OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MyUserInfoModel myUserInfoModel, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f22393OooO0Oo = myUserInfoModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f22393OooO0Oo, continuation);
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
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o0O00oO0.OooOoo0(false, this.f22393OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    @Nullable
    public static Object OooO0OO(@NotNull String str, @Nullable String str2, int i, @NotNull Continuation continuation) {
        String str3 = OooOOO0.f43300OooOOO0;
        o0ooOOo o0oooooOooO00o = oo000o.OooO00o(str3, "url", str3, 1);
        LinkedHashMap linkedHashMap = o0oooooOooO00o.f43257OooO0OO;
        if (i == 4) {
            linkedHashMap.put("accesstoken", str);
        } else if (i == 5) {
            linkedHashMap.put("wxcode", str);
        } else if (i == 7) {
            linkedHashMap.put("accesstoken", str);
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("insUserid", str2);
        } else if (i == 9) {
            linkedHashMap.put("authtoken", str);
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("authtokensecret", str2);
        } else if (i == 12) {
            linkedHashMap.put("wxcode", str);
        }
        o0oooooOooO00o.OooO0O0(String.valueOf(i), AppsFlyerProperties.CHANNEL);
        o0oooooOooO00o.OooO0O0(o000000.OooO00o(), "uniqueid");
        return OooOOO.OooO0Oo(new AccountRepo$bindThirdAccount2$$inlined$call$1(o0oooooOooO00o, null), continuation);
    }

    @Nullable
    public static Object OooO0Oo(@NotNull Continuation continuation) {
        String strOooO0O0 = oOO0O0O.OooO0O0(o000O00O.OooO00o());
        String strOooO00o = oOO0O0O.OooO00o();
        String url = OooOOO0.f43294OooO0oO;
        Intrinsics.checkNotNullParameter(url, "url");
        o0ooOOo o0ooooo = new o0ooOOo(url, 0);
        o0ooooo.OooO0O0(strOooO0O0, "SimCountryCode");
        o0ooooo.OooO0O0(strOooO00o, "DeviceCountryCode");
        return OooOOO.OooO0Oo(new AccountRepo$loadAccountBindInfo$$inlined$call$1(o0ooooo, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0o(@NotNull Continuation<? super MyUserInfoModel> continuation) {
        OooO0O0 oooO0O0;
        ApiResult apiResult;
        ApiResult apiResult2;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f22392OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f22392OooO0oO = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objOooO0o0 = oooO0O0.f22391OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f22392OooO0oO;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objOooO0o0);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apiResult2 = oooO0O0.f22389OooO0Oo;
                ResultKt.throwOnFailure(objOooO0o0);
            }
            apiResult = apiResult2;
            return apiResult.getData();
        }
        ResultKt.throwOnFailure(objOooO0o0);
        oooO0O0.f22392OooO0oO = 1;
        objOooO0o0 = OooO0o0(oooO0O0);
        if (objOooO0o0 == coroutine_suspended) {
            return coroutine_suspended;
        }
        apiResult = (ApiResult) objOooO0o0;
        if (apiResult.isSuccess()) {
            MyUserInfoModel myUserInfoModel = (MyUserInfoModel) apiResult.getData();
            if (myUserInfoModel != null) {
                p391o0OOooo0.o0ooOOo.OooO00o().OooO00o(myUserInfoModel.getTimesTamp());
            }
            MyUserInfoModel myUserInfoModel2 = (MyUserInfoModel) apiResult.getData();
            if (myUserInfoModel2 != null) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                OooO0OO oooO0OO = new OooO0OO(myUserInfoModel2, null);
                oooO0O0.f22389OooO0Oo = apiResult;
                oooO0O0.f22392OooO0oO = 2;
                if (BuildersKt.withContext(main, oooO0OO, oooO0O0) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                apiResult2 = apiResult;
                apiResult = apiResult2;
            }
        } else {
            ApiError error = apiResult.getError();
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
        }
        return apiResult.getData();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object OooO0o0(Continuation<? super ApiResult<MyUserInfoModel>> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f22387OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f22387OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objOooO0Oo = oooO00o.f22386OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f22387OooO0o;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            String strOooO0O0 = oOO0O0O.OooO0O0(o000O00O.OooO00o());
            String strOooO00o = oOO0O0O.OooO00o();
            String url = OooOOO0.f43288OooO00o;
            Intrinsics.checkNotNullParameter(url, "url");
            o0ooOOo o0ooooo = new o0ooOOo(url, 0);
            o0ooooo.OooO0O0(strOooO0O0, "SimCountryCode");
            o0ooooo.OooO0O0(strOooO00o, "DeviceCountryCode");
            AccountRepo$loadUserInfo$$inlined$call$1 accountRepo$loadUserInfo$$inlined$call$1 = new AccountRepo$loadUserInfo$$inlined$call$1(o0ooooo, null);
            oooO00o.f22387OooO0o = 1;
            objOooO0Oo = OooOOO.OooO0Oo(accountRepo$loadUserInfo$$inlined$call$1, oooO00o);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        ApiResult apiResult2 = new ApiResult();
        apiResult2.setMessage(apiResult.getMessage());
        if (apiResult.isSuccess()) {
            Collection collection = (Collection) apiResult.getData();
            if (collection != null && !collection.isEmpty()) {
                z = false;
            }
            if (z) {
                apiResult2.setCode(apiResult.getCode());
            } else {
                apiResult2.setCode(1000);
                List list = (List) apiResult.getData();
                apiResult2.setData(list != null ? (MyUserInfoModel) list.get(0) : null);
            }
        } else {
            apiResult2.setCode(apiResult.getCode());
        }
        return apiResult2;
    }
}
