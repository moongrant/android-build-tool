package com.yalla.yalla.data.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.qiniu.android.collect.ReportItem;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.model.UserInfoSyncModel;
import io.agora.rtc.Constants;
import java.util.Collection;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o0o0000.OooOOOO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0;
import p498o0o00Oo0.OooOOO;
import p498o0o00Oo0.o00O00O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class AccountRepo extends o00O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final AccountRepo f21408OooO00o = new AccountRepo();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.AccountRepo", f = "AccountRepo.kt", i = {}, l = {Constants.ERR_PUBLISH_STREAM_CDN_ERROR}, m = "loadUserInfo", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f21409Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f21411Oooo0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21409Oooo0o = obj;
            this.f21411Oooo0oo |= Integer.MIN_VALUE;
            return AccountRepo.this.OooO0o0(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.AccountRepo", f = "AccountRepo.kt", i = {1}, l = {37, 41}, m = "syncUserInfo", n = {ReportItem.QualityKeyResult}, s = {"L$0"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f21412Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public ApiResult f21413Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21414Oooo0oO;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21414Oooo0oO = obj;
            this.f21412Oooo |= Integer.MIN_VALUE;
            return AccountRepo.this.OooO0o(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.AccountRepo$syncUserInfo$3$1", f = "AccountRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ UserInfoSyncModel f21416Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(UserInfoSyncModel userInfoSyncModel, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f21416Oooo0o = userInfoSyncModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f21416Oooo0o, continuation);
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
            OooOOO.f41216OooO00o.Oooo0(this.f21416Oooo0o, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0o(@NotNull Continuation<? super UserInfoModel> continuation) {
        OooO0O0 oooO0O0;
        ApiResult apiResult;
        ApiResult apiResult2;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f21412Oooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f21412Oooo = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objOooO0o0 = oooO0O0.f21414Oooo0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f21412Oooo;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objOooO0o0);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apiResult2 = oooO0O0.f21413Oooo0o;
                ResultKt.throwOnFailure(objOooO0o0);
            }
            apiResult = apiResult2;
            return apiResult.getData();
        }
        ResultKt.throwOnFailure(objOooO0o0);
        oooO0O0.f21412Oooo = 1;
        objOooO0o0 = OooO0o0(oooO0O0);
        if (objOooO0o0 == coroutine_suspended) {
            return coroutine_suspended;
        }
        apiResult = (ApiResult) objOooO0o0;
        if (apiResult.isSuccess()) {
            UserInfoSyncModel userInfoSyncModel = (UserInfoSyncModel) apiResult.getData();
            if (userInfoSyncModel != null) {
                oo0O.OooO00o.OooO00o().OooO00o(userInfoSyncModel.getTimesTamp());
            }
            UserInfoSyncModel userInfoSyncModel2 = (UserInfoSyncModel) apiResult.getData();
            if (userInfoSyncModel2 != null) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                OooO0OO oooO0OO = new OooO0OO(userInfoSyncModel2, null);
                oooO0O0.f21413Oooo0o = apiResult;
                oooO0O0.f21412Oooo = 2;
                if (BuildersKt.withContext(main, oooO0OO, oooO0O0) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                apiResult2 = apiResult;
                apiResult = apiResult2;
            }
        } else {
            ApiError error = apiResult.getError();
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
        }
        return apiResult.getData();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object OooO0o0(Continuation<? super ApiResult<UserInfoSyncModel>> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f21411Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f21411Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objOooO0OO = oooO00o.f21409Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f21411Oooo0oo;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0OO);
            p480o0o000.OooO0OO oooO0OO = p480o0o000.OooO0OO.f40754OooO00o;
            String str = p480o0o000.OooO0OO.f40755OooO0O0;
            AccountRepo$loadUserInfo$$inlined$call$1 accountRepo$loadUserInfo$$inlined$call$1 = new AccountRepo$loadUserInfo$$inlined$call$1(com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 0), null);
            oooO00o.f21411Oooo0oo = 1;
            objOooO0OO = o0000O0.OooO0OO(accountRepo$loadUserInfo$$inlined$call$1, oooO00o);
            if (objOooO0OO == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooO0OO);
        }
        ApiResult apiResult = (ApiResult) objOooO0OO;
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
                apiResult2.setData(list != null ? (UserInfoSyncModel) list.get(0) : null);
            }
        } else {
            apiResult2.setCode(apiResult.getCode());
        }
        return apiResult2;
    }
}
