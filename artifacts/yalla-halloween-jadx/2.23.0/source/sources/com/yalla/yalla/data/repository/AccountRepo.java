package com.yalla.yalla.data.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.appsflyer.AppsFlyerProperties;
import com.code.android.util.OooOOO;
import com.code.android.util.o000O0;
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
import p375o0OOoOO.o00000O0;
import p376o0OOoOOO.o0O0ooO;
import p381o0OOoo0O.Oooo0;
import p382o0OOoo0o.oo000o;
import p385o0OOooOO.o00oOoo;
import p464o0Oooo.o000000O;
import p464o0Oooo.o0O00oO0;
import p579o0oOoo.oO0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAccountRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountRepo.kt\ncom/yalla/yalla/data/repository/AccountRepo\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ApiBaseRepository.kt\ncom/yalla/yalla/repository/ApiBaseRepository\n*L\n1#1,233:1\n62#2:234\n62#2:236\n62#2:237\n62#2:246\n62#2:247\n62#2:248\n62#2:249\n62#2:250\n62#2:251\n62#2:252\n62#2:253\n62#2:254\n62#2:255\n62#2:256\n62#2:257\n62#2:258\n62#2:259\n62#2:260\n1#3:235\n26#4:238\n47#4:239\n26#4:240\n47#4:241\n26#4:242\n47#4:243\n26#4:244\n47#4:245\n*S KotlinDebug\n*F\n+ 1 AccountRepo.kt\ncom/yalla/yalla/data/repository/AccountRepo\n*L\n43#1:234\n72#1:236\n101#1:237\n152#1:246\n156#1:247\n160#1:248\n165#1:249\n169#1:250\n179#1:251\n183#1:252\n187#1:253\n190#1:254\n194#1:255\n202#1:256\n206#1:257\n221#1:258\n226#1:259\n231#1:260\n105#1:238\n105#1:239\n115#1:240\n115#1:241\n121#1:242\n121#1:243\n131#1:244\n131#1:245\n*E\n"})
public final class AccountRepo extends o0O00oO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final AccountRepo f22858OooO00o = new AccountRepo();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.AccountRepo", f = "AccountRepo.kt", i = {}, l = {234}, m = "loadUserInfo", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f22859OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f22860OooO0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22859OooO0Oo = obj;
            this.f22860OooO0o |= Integer.MIN_VALUE;
            AccountRepo accountRepo = AccountRepo.f22858OooO00o;
            return AccountRepo.this.OooO0Oo(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.AccountRepo", f = "AccountRepo.kt", i = {1}, l = {56, 60}, m = "syncUserInfo", n = {ReportItem.QualityKeyResult}, s = {"L$0"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ApiResult f22862OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f22864OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f22865OooO0oO;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22864OooO0o0 = obj;
            this.f22865OooO0oO |= Integer.MIN_VALUE;
            return AccountRepo.this.OooO0o0(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.AccountRepo$syncUserInfo$3$1", f = "AccountRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MyUserInfoModel f22866OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MyUserInfoModel myUserInfoModel, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f22866OooO0Oo = myUserInfoModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f22866OooO0Oo, continuation);
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
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o000000O.OooOoo(false, this.f22866OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    @Nullable
    public static Object OooO0OO(@NotNull String str, @Nullable String str2, int i, @NotNull Continuation continuation) {
        String str3 = Oooo0.f44261OooOOO0;
        o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(str3, "url", str3, 1);
        LinkedHashMap linkedHashMap = o0o0oooOooO00o.f44062OooO0OO;
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
        o0o0oooOooO00o.OooO0O0(String.valueOf(i), AppsFlyerProperties.CHANNEL);
        o0o0oooOooO00o.OooO0O0(oo000o.OooO00o(), "uniqueid");
        return OooOOO.OooO0Oo(new AccountRepo$bindThirdAccount2$$inlined$call$1(o0o0oooOooO00o, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object OooO0Oo(Continuation<? super ApiResult<MyUserInfoModel>> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f22860OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f22860OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objOooO0Oo = oooO00o.f22859OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f22860OooO0o;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            String strOooO0O0 = oO0Oo0oo.OooO0O0(o000O0.OooO00o());
            String strOooO00o = oO0Oo0oo.OooO00o();
            String url = Oooo0.f44249OooO00o;
            Intrinsics.checkNotNullParameter(url, "url");
            o0O0ooO o0o0ooo = new o0O0ooO(url, 0);
            o0o0ooo.OooO0O0(strOooO0O0, "SimCountryCode");
            o0o0ooo.OooO0O0(strOooO00o, "DeviceCountryCode");
            AccountRepo$loadUserInfo$$inlined$call$1 accountRepo$loadUserInfo$$inlined$call$1 = new AccountRepo$loadUserInfo$$inlined$call$1(o0o0ooo, null);
            oooO00o.f22860OooO0o = 1;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0o0(@NotNull Continuation<? super MyUserInfoModel> continuation) {
        OooO0O0 oooO0O0;
        ApiResult apiResult;
        ApiResult apiResult2;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f22865OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f22865OooO0oO = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objOooO0Oo = oooO0O0.f22864OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f22865OooO0oO;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objOooO0Oo);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apiResult2 = oooO0O0.f22862OooO0Oo;
                ResultKt.throwOnFailure(objOooO0Oo);
            }
            apiResult = apiResult2;
            return apiResult.getData();
        }
        ResultKt.throwOnFailure(objOooO0Oo);
        oooO0O0.f22865OooO0oO = 1;
        objOooO0Oo = OooO0Oo(oooO0O0);
        if (objOooO0Oo == coroutine_suspended) {
            return coroutine_suspended;
        }
        apiResult = (ApiResult) objOooO0Oo;
        if (apiResult.isSuccess()) {
            MyUserInfoModel myUserInfoModel = (MyUserInfoModel) apiResult.getData();
            if (myUserInfoModel != null) {
                o0O.OooO0O0.OooO0Oo().OooO00o(myUserInfoModel.getTimesTamp());
            }
            MyUserInfoModel myUserInfoModel2 = (MyUserInfoModel) apiResult.getData();
            if (myUserInfoModel2 != null) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                OooO0OO oooO0OO = new OooO0OO(myUserInfoModel2, null);
                oooO0O0.f22862OooO0Oo = apiResult;
                oooO0O0.f22865OooO0oO = 2;
                if (BuildersKt.withContext(main, oooO0OO, oooO0O0) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                apiResult2 = apiResult;
                apiResult = apiResult2;
            }
        } else {
            ApiError error = apiResult.getError();
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
        }
        return apiResult.getData();
    }
}
