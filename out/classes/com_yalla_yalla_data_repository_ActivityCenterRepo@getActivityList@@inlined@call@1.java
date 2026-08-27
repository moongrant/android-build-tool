package com.yalla.yalla.data.repository;

import androidx.exifinterface.media.ExifInterface;
import com.code.android.json.JsonUtil;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.reflect.TypeToken;
import com.yalla.yalla.api.call.request.ParamsWrapper;
import com.yalla.yalla.api.result.ApiError;
import com.yalla.yalla.api.result.ApiResult;
import com.yalla.yalla.model.ActivityListModel;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import p442o0OoOoo.o00;
import p442o0OoOoo.o000OOo0;
import p442o0OoOoo.o00O0000;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\f\b\u0000\u0010\u0002\u0018\u0001*\u0004\u0018\u00010\u0003*\u00020\u0004H\n¨\u0006\u0005"}, d2 = {"<anonymous>", "Lcom/yalla/yalla/api/result/ApiResult;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/CoroutineScope;", "com/yalla/yalla/api/call/YLApi$CommonRequest$call$apiResult$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.yalla.yalla.api.call.YLApi$CommonRequest$call$apiResult$1", f = "YLApi.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nYLApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest$call$apiResult$1\n+ 2 ApiCall.kt\ncom/yalla/yalla/http/ApiCallKt\n+ 3 ResponseBodyParseUtils.kt\ncom/yalla/yalla/api/call/ResponseBodyParseUtils\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 JsonUtil.kt\ncom/code/android/json/JsonUtil\n*L\n1#1,124:1\n12#2,2:125\n14#2,6:141\n20#2,12:148\n32#3,13:127\n1#4:140\n189#5:147\n*S KotlinDebug\n*F\n+ 1 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest$call$apiResult$1\n*L\n94#1:125,2\n94#1:141,6\n94#1:148,12\n96#1:127,13\n94#1:147\n*E\n"})
public final class ActivityCenterRepo$getActivityList$$inlined$call$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResult<List<ActivityListModel>>>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ com.yalla.yalla.api.call.OooO f46019OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public com.yalla.yalla.api.call.OooO f46020OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f46021OooO0oo;

    public static final class OooO00o implements Function0<String> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Exception f46022OooO0oO;

        public OooO00o(Exception exc) {
            this.f46022OooO0oO = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Exception exc = this.f46022OooO0oO;
            String message = exc.getMessage();
            return message == null ? exc.getClass().getName() : message;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityCenterRepo$getActivityList$$inlined$call$1(com.yalla.yalla.api.call.OooO oooO, Continuation continuation) {
        super(2, continuation);
        this.f46019OooO = oooO;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivityCenterRepo$getActivityList$$inlined$call$1(this.f46019OooO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<List<ActivityListModel>>> continuation) {
        return ((ActivityCenterRepo$getActivityList$$inlined$call$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objOooO00o;
        com.yalla.yalla.api.call.OooO oooO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f46021OooO0oo;
        Object obj2 = null;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                com.yalla.yalla.api.call.OooO oooO2 = this.f46019OooO;
                int i2 = oooO2.f44948OooO0O0;
                String url = oooO2.f44947OooO00o;
                LinkedHashMap linkedHashMap = oooO2.f44949OooO0OO;
                JSONObject jSONObject = oooO2.f44951OooO0o0;
                ParamsWrapper paramsWrapper = new ParamsWrapper(linkedHashMap, jSONObject != null ? jSONObject.toString() : null, oooO2.f44950OooO0Oo);
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(paramsWrapper, "paramsWrapper");
                o000OOo0 o00Var = (i2 == 0 || i2 != 1) ? new o00(url, paramsWrapper) : new o00O0000(url, paramsWrapper);
                this.f46020OooO0oO = oooO2;
                this.f46021OooO0oo = 1;
                objOooO00o = o00Var.OooO00o(this);
                if (objOooO00o == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooO = oooO2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooO = this.f46020OooO0oO;
                ResultKt.throwOnFailure(obj);
                objOooO00o = obj;
            }
            com.yalla.yalla.api.call.OooO0OO oooO0OO = com.yalla.yalla.api.call.OooO0OO.f44954OooO00o;
            Type type = new TypeToken<ApiResult<List<ActivityListModel>>>() { // from class: com.yalla.yalla.data.repository.ActivityCenterRepo$getActivityList$$inlined$call$1.1
            }.getType();
            oooO0OO.getClass();
            String strOooO00o = com.yalla.yalla.api.call.OooO0OO.OooO00o((ResponseBody) objOooO00o);
            Intrinsics.checkNotNull(type);
            ApiResult apiResult = (ApiResult) p247o00oo0oO.o000OO0O.OooO0O0(strOooO00o, type);
            if (apiResult == null) {
                apiResult = new ApiResult();
                JSONObject jSONObject2 = new JSONObject(strOooO00o);
                apiResult.setCode(jSONObject2.optInt("code", -1));
                apiResult.setMessage(jSONObject2.optString(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, ""));
                apiResult.setDateSort(jSONObject2.optLong("dateSort", 0L));
                JsonUtil jsonUtil = JsonUtil.f27146OooO00o;
                Type type2 = new TypeToken<List<ActivityListModel>>() { // from class: com.yalla.yalla.data.repository.ActivityCenterRepo$getActivityList$$inlined$call$1.2
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                jsonUtil.getClass();
                Object objOooO0o0 = JsonUtil.OooO0o0(strOooO00o, type2);
                if (TypeIntrinsics.isMutableList(objOooO0o0)) {
                    obj2 = objOooO0o0;
                }
                apiResult.setData((List) obj2);
            }
            apiResult.setUrl(oooO.f44947OooO00o);
            return apiResult;
        } catch (IOException e) {
            com.yalla.yalla.util.log.OooOO0.OooO0oO("WebAPIException", e, com.yalla.yalla.http.OooO00o.f49666OooO0oO, 2);
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooOo00(String.valueOf(e.getMessage()));
            String strOooO0O0 = com.yalla.yalla.api.old.o000oOoO.OooO0O0(JsonUtil.f27146OooO00o, new ApiError(1, "time out", null, null, 12, null));
            Object objOooO0Oo = JsonUtil.OooO0Oo(ApiResult.class, strOooO0O0 != null ? strOooO0O0 : "");
            Intrinsics.checkNotNull(objOooO0Oo);
            return objOooO0Oo;
        } catch (CancellationException e2) {
            com.yalla.yalla.api.old.o0OoOo0.OooO00o(e2, com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o);
            com.yalla.yalla.util.log.OooOO0.OooO0oO("WebAPIException", e2, com.yalla.yalla.http.OooO0O0.f49667OooO0oO, 2);
            String strOooO0O1 = com.yalla.yalla.api.old.o000oOoO.OooO0O0(JsonUtil.f27146OooO00o, new ApiError(3, "canceled", null, null, 12, null));
            Object objOooO0Oo2 = JsonUtil.OooO0Oo(ApiResult.class, strOooO0O1 != null ? strOooO0O1 : "");
            Intrinsics.checkNotNull(objOooO0Oo2);
            return objOooO0Oo2;
        } catch (Exception e3) {
            com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooOo00(String.valueOf(e3.getMessage()));
            com.yalla.yalla.util.log.OooOO0.OooO0oO("WebAPIException", e3, new OooO00o(e3), 2);
            String message = e3.getMessage();
            if (message == null) {
                message = e3.getClass().getName();
            }
            String str = message;
            Intrinsics.checkNotNull(str);
            String strOooO0O2 = com.yalla.yalla.api.old.o000oOoO.OooO0O0(JsonUtil.f27146OooO00o, new ApiError(2, str, null, null, 12, null));
            Object objOooO0Oo3 = JsonUtil.OooO0Oo(ApiResult.class, strOooO0O2 != null ? strOooO0O2 : "");
            Intrinsics.checkNotNull(objOooO0Oo3);
            return objOooO0Oo3;
        }
    }
}
