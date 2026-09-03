package com.yalla.yalla.data.repository;

import com.code.android.json.OooO00o;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.reflect.TypeToken;
import com.yalla.yalla.api.call.request.ParamsWrapper;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p140o00OOooo.OooOO0;
import p376o0OOoOOO.o00;
import p376o0OOoOOO.o000OO00;
import p376o0OOoOOO.o00O0000;
import p376o0OOoOOO.o0O0ooO;
import p378o0OOoOo0.Oooo0;
import p378o0OOoOo0.Oooo000;
import p378o0OOoOo0.o000oOoO;
import p592o0oo00O.OooOOO0;
import p634o0ooO0oO.o0O0o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u008a@¨\u0006\u0003"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/yalla/yalla/model/http/ApiResult;", "com/yalla/yalla/api/call/YLApi$CommonRequest$call$2", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.yalla.yalla.api.call.YLApi$CommonRequest$call$2", f = "YLApi.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nYLApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest$call$2\n+ 2 ApiCall.kt\ncom/yalla/yalla/http/ApiCallKt\n+ 3 ResponseBodyParseUtils.kt\ncom/yalla/yalla/api/call/ResponseBodyParseUtils\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 JsonUtil.kt\ncom/code/android/json/JsonUtil\n*L\n1#1,86:1\n18#2,2:87\n20#2,5:103\n25#2,10:109\n33#3,13:89\n1#4:102\n109#5:108\n*S KotlinDebug\n*F\n+ 1 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest$call$2\n*L\n64#1:87,2\n64#1:103,5\n64#1:109,10\n66#1:89,13\n64#1:108\n*E\n"})
public final class MomentRepository$momentCommentList$$inlined$call$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResult<List<MomentCommentDetailModel>>>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f23051OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0ooO f23052OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MomentRepository$momentCommentList$$inlined$call$1(o0O0ooO o0o0ooo, Continuation continuation) {
        super(2, continuation);
        this.f23052OooO0o0 = o0o0ooo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MomentRepository$momentCommentList$$inlined$call$1(this.f23052OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<List<MomentCommentDetailModel>>> continuation) {
        return ((MomentRepository$momentCommentList$$inlined$call$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f23051OooO0Oo;
        Object obj2 = null;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0O0ooO o0o0ooo = this.f23052OooO0o0;
                int i2 = o0o0ooo.f44061OooO0O0;
                ParamsWrapper paramsWrapper = new ParamsWrapper(o0o0ooo.f44062OooO0OO, null, o0o0ooo.f44063OooO0Oo);
                String url = o0o0ooo.f44060OooO00o;
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(paramsWrapper, "paramsWrapper");
                Oooo000 oooo0 = (i2 == 0 || i2 != 1) ? new Oooo0(url, paramsWrapper) : new o000oOoO(url, paramsWrapper);
                this.f23051OooO0Oo = 1;
                obj = oooo0.OooO00o(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            o000OO00 o000oo01 = o000OO00.f44059OooO00o;
            Type type = new TypeToken<ApiResult<List<MomentCommentDetailModel>>>() { // from class: com.yalla.yalla.data.repository.MomentRepository$momentCommentList$$inlined$call$1.1
            }.getType();
            o000oo01.getClass();
            String strOooO00o = o000OO00.OooO00o((o0O0o) obj);
            Intrinsics.checkNotNullExpressionValue(type, "type");
            ApiResult apiResult = (ApiResult) OooOO0.OooO0OO(strOooO00o, type);
            if (apiResult == null) {
                apiResult = new ApiResult();
                JSONObject jSONObject = new JSONObject(strOooO00o);
                apiResult.setCode(jSONObject.optInt("code", -1));
                String strOptString = jSONObject.optString(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "");
                Intrinsics.checkNotNullExpressionValue(strOptString, "jsonObject.optString(\"message\", \"\")");
                apiResult.setMessage(strOptString);
                apiResult.setDateSort(jSONObject.optLong("dateSort", 0L));
                Function2<? super String, ? super Throwable, Unit> function2 = OooO00o.f10146OooO00o;
                Type type2 = new TypeToken<List<MomentCommentDetailModel>>() { // from class: com.yalla.yalla.data.repository.MomentRepository$momentCommentList$$inlined$call$1.2
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "object : TypeToken<T>() {}.type");
                Object objOooO0Oo = OooO00o.OooO0Oo(strOooO00o, type2);
                if (TypeIntrinsics.isMutableList(objOooO0Oo)) {
                    obj2 = objOooO0Oo;
                }
                apiResult.setData((List) obj2);
            }
            apiResult.setUrl(apiResult.getUrl());
            return apiResult;
        } catch (IOException e) {
            String strOooO0oo = OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            OooOOO0.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
            String strOooO0oo3 = OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }
}
