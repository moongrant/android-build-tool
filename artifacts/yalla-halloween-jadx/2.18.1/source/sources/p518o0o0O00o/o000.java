package p518o0o0O00o;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.app.base.app.appConfig.apiDataModela.OooO0O0;
import com.yalla.yalla.api.service.MainApiService;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.AccountPrivacy;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p515o0o0O00.o00O00;
import p516o0o0O000.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000 f42171OooO00o = new o000();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Pair<Boolean, Boolean>> f42172OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Boolean> f42173OooO0OO;

    @DebugMetadata(c = "com.yalla.yalla.data.manager.AccountDataManager", f = "AccountDataManager.kt", i = {}, l = {26}, m = "getAccountPrivacy", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42174Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42176Oooo0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42174Oooo0o = obj;
            this.f42176Oooo0oo |= Integer.MIN_VALUE;
            return o000.this.OooO00o(this);
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f42172OooO0O0 = new MutableLiveData<>(new Pair(bool, bool));
        f42173OooO0OO = new MutableLiveData<>(bool);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super ApiResult<AccountPrivacy>> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f42176Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f42176Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objUserPrivacySlt = oooO00o.f42174Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f42176Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUserPrivacySlt);
                o0o0000.OooO00o oooO00o2 = o0o0000.OooO00o.f40768OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                oooO00o.f42176Oooo0oo = 1;
                objUserPrivacySlt = mainApiServiceOooO0OO.userPrivacySlt(oooO00o);
                if (objUserPrivacySlt == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUserPrivacySlt);
            }
            ApiResult apiResult = (ApiResult) objUserPrivacySlt;
            if (!apiResult.isSuccess()) {
                return objUserPrivacySlt;
            }
            MutableLiveData<Pair<Boolean, Boolean>> mutableLiveData = f42172OooO0O0;
            AccountPrivacy accountPrivacy = (AccountPrivacy) apiResult.getData();
            mutableLiveData.postValue(new Pair<>(Boxing.boxBoolean(accountPrivacy != null ? accountPrivacy.getIsOpenProtection() : false), Boxing.boxBoolean(true)));
            MutableLiveData<Boolean> mutableLiveData2 = f42173OooO0OO;
            AccountPrivacy accountPrivacy2 = (AccountPrivacy) apiResult.getData();
            mutableLiveData2.postValue(Boxing.boxBoolean(accountPrivacy2 != null ? accountPrivacy2.getIsShowProtection() : false));
            return objUserPrivacySlt;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }
}
