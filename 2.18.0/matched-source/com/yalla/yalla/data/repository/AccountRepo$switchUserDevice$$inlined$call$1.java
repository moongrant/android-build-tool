package com.yalla.yalla.data.repository;

import com.android.billingclient.api.o0Oo0oo;
import com.app.base.app.appConfig.apiDataModela.OooO0O0;
import com.yalla.yalla.api.call.request.ParamsWrapper;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
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
import p390o0OOooO.o00000O0;
import p483o0o0000o.OooOo;
import p483o0o0000o.OooOo00;
import p483o0o0000o.Oooo000;
import p517o0o0O00.o00O00;
import p518o0o0O000.o0OOO0o;
import p549o0o0o00O.o00O000;
import p662o0ooo0o0.o00OO0OO;
import p662o0ooo0o0.o00Oo00;
import p676o0oooo0.o0oOO;
import p676o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u008a@¨\u0006\u0002"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "com/yalla/yalla/api/call/NewApiClient$CommonRequest$call$2", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.yalla.yalla.api.call.NewApiClient$CommonRequest$call$2", f = "NewApiClient.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
public final class AccountRepo$switchUserDevice$$inlined$call$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResult<String>>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f21482Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o00O000 f21483OoooO00;

    public static final class OooO00o extends o00000O0<ApiResult<String>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountRepo$switchUserDevice$$inlined$call$1(o00O000 o00o001, Continuation continuation) {
        super(2, continuation);
        this.f21483OoooO00 = o00o001;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AccountRepo$switchUserDevice$$inlined$call$1(this.f21483OoooO00, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<String>> continuation) {
        return ((AccountRepo$switchUserDevice$$inlined$call$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f21482Oooo;
        String str = "";
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00O000 o00o001 = this.f21483OoooO00;
                int i2 = o00o001.f44611OooO0O0;
                String url = o00o001.f44610OooO00o;
                ParamsWrapper paramsWrapper = new ParamsWrapper(o00o001.f44612OooO0OO, null, o00o001.f44613OooO0Oo);
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(paramsWrapper, "paramsWrapper");
                OooOo00 oooOo = (i2 == 0 || i2 != 1) ? new OooOo(url, paramsWrapper) : new Oooo000(url, paramsWrapper);
                this.f21482Oooo = 1;
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
            o00Oo00 responseBody = (o00Oo00) obj;
            Type type = new OooO00o().getType();
            Intrinsics.checkNotNullParameter(responseBody, "responseBody");
            Charset charset = Charset.forName("UTF-8");
            o0oOOo o0ooooOooO0oo = responseBody.OooO0oo();
            o0ooooOooO0oo.request(Long.MAX_VALUE);
            o0oOO o0oooOooO0o0 = o0ooooOooO0oo.OooO0o0();
            o00OO0OO o00oo0ooOooO0o = responseBody.OooO0o();
            if (o00oo0ooOooO0o != null) {
                charset = o00oo0ooOooO0o.OooO00o(charset);
            }
            o0oOO o0oooClone = o0oooOooO0o0.clone();
            Intrinsics.checkNotNullExpressionValue(charset, "charset");
            return o0Oo0oo.OooO0OO(o0oooClone.OooooO0(charset), type);
        } catch (IOException e) {
            ApiError apiErrorOooO00o = OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0O0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42139OooO00o;
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
            o0OOO0o o0ooo0o3 = o0OOO0o.f42139OooO00o;
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
            o0OOO0o o0ooo0o4 = o0OOO0o.f42139OooO00o;
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
