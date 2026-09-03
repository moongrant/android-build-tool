package com.yalla.yalla.api.call;

import com.app.base.app.appConfig.apiDataModela.OooO0O0;
import com.yalla.yalla.api.call.request.ParamsWrapper;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.OldApiResult;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
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
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p388o0OOooO.o00000O0;
import p481o0o0000o.OooOo;
import p481o0o0000o.OooOo00;
import p481o0o0000o.Oooo000;
import p515o0o0O00.o00O00;
import p516o0o0O000.o0OOO0o;
import p547o0o0o00O.o00O000o;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OOOOo;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/yalla/yalla/common/model/ApiResult;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.yalla.yalla.api.call.NewApiClient$CommonRequest$callByOldModel$2", f = "NewApiClient.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
public final class NewApiClient$CommonRequest$callByOldModel$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResult<Object>>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f20560Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00O000o f20561Oooo0oO;

    public static final class OooO00o extends o00000O0<Object> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewApiClient$CommonRequest$callByOldModel$2(o00O000o o00o000o2, Continuation<? super NewApiClient$CommonRequest$callByOldModel$2> continuation) {
        super(2, continuation);
        this.f20561Oooo0oO = o00o000o2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new NewApiClient$CommonRequest$callByOldModel$2(this.f20561Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<Object>> continuation) {
        return ((NewApiClient$CommonRequest$callByOldModel$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String message;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f20560Oooo0o;
        String str = "";
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00O000o o00o000o2 = this.f20561Oooo0oO;
                int i2 = o00o000o2.f44596OooO0O0;
                String url = o00o000o2.f44595OooO00o;
                ParamsWrapper paramsWrapper = new ParamsWrapper(o00o000o2.f44597OooO0OO, null, o00o000o2.f44598OooO0Oo);
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(paramsWrapper, "paramsWrapper");
                OooOo00 oooOo = (i2 == 0 || i2 != 1) ? new OooOo(url, paramsWrapper) : new Oooo000(url, paramsWrapper);
                this.f20560Oooo0o = 1;
                obj = oooOo.OooO00o(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            o00OOOOo responseBody = (o00OOOOo) obj;
            Intrinsics.needClassReification();
            Type type = new OooO00o().getType();
            Intrinsics.checkNotNullParameter(responseBody, "responseBody");
            Charset charset = Charset.forName("UTF-8");
            o0oOOo o0ooooOooO0oo = responseBody.OooO0oo();
            o0ooooOooO0oo.request(Long.MAX_VALUE);
            o0oOO o0oooOooO0o0 = o0ooooOooO0oo.OooO0o0();
            o00OO0O0 o00oo0o0OooO0o = responseBody.OooO0o();
            if (o00oo0o0OooO0o != null) {
                charset = o00oo0o0OooO0o.OooO00o(charset);
            }
            o0oOO o0oooClone = o0oooOooO0o0.clone();
            Intrinsics.checkNotNullExpressionValue(charset, "charset");
            String strOooooO0 = o0oooClone.OooooO0(charset);
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            OldApiResult oldApiResult = (OldApiResult) o0OOO0o.OooO0O0(strOooooO0, OldApiResult.class);
            Intrinsics.checkNotNullExpressionValue(type, "type");
            Object objOooO0OO = o0OOO0o.OooO0OO(strOooooO0, type);
            Intrinsics.reifiedOperationMarker(2, "T");
            ApiResult apiResult = new ApiResult();
            apiResult.setCode(oldApiResult != null ? oldApiResult.getCode() : -1);
            if (oldApiResult == null || (message = oldApiResult.getMessage()) == null) {
                message = "";
            }
            apiResult.setMessage(message);
            apiResult.setDateSort(oldApiResult != null ? oldApiResult.getDateSort() : 0L);
            apiResult.setData(objOooO0OO);
            return apiResult;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
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
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
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
            String message2 = e2.getMessage();
            if (message2 == null) {
                message2 = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message2, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message2);
            o0OOO0o o0ooo0o5 = o0OOO0o.f42120OooO00o;
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
