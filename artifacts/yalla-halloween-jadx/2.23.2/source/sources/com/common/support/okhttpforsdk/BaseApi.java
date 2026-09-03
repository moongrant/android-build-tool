package com.common.support.okhttpforsdk;

import androidx.lifecycle.MutableLiveData;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o00OOO00;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0OoO00O;
import p641o0ooOO0o.o0oO0Ooo;
import p653o0ooo00O.o0000O0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\u0006\u00105\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b;\u0010<JC\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0004¢\u0006\u0004\b\b\u0010\tJC\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022*\u0010\n\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H\u0004¢\u0006\u0004\b\u000b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0004JW\u0010\u001a\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u001e\b\u0002\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00122\u0019\u0010\u0019\u001a\u0015\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00150\u0017¢\u0006\u0002\b\u0018J(\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0\u001b\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010JE\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u001e\b\u0002\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ<\u0010\"\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u000e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u001e\b\u0002\u0010!\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012H\u0014R\u001a\u0010$\u001a\u00020#8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010)\u001a\u00020(8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R$\u0010.\u001a\u0004\u0018\u00010-8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u00105\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u00028\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/common/support/okhttpforsdk/BaseApi;", "", "", "path", "", "Lkotlin/Pair;", "queryParams", "Lo0ooOO0o/o0O00O0o;", "get", "(Ljava/lang/String;[Lkotlin/Pair;)Lo0ooOO0o/o0O00O0o;", "bodies", "post", "Lo0ooOO0o/o0oO0Ooo;", "requestBody", "T", "request", "Ljava/lang/reflect/Type;", "respType", "Lkotlin/Function2;", "", "", "", "httpFailAction", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "httpSuccessAction", "async", "Landroidx/lifecycle/MutableLiveData;", "Lcom/common/support/okhttpforsdk/HttpResponse;", "asyncByLiveData", "sync", "(Lo0ooOO0o/o0O00O0o;Ljava/lang/reflect/Type;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "httpResp", "httpFailedAction", "handleHttpError", "Lo0ooOO0o/o0OoO00O;", "okHttpClient", "Lo0ooOO0o/o0OoO00O;", "getOkHttpClient", "()Lo0ooOO0o/o0OoO00O;", "Lcom/common/support/okhttpforsdk/ResponseDataConvertor;", "dataConvertor", "Lcom/common/support/okhttpforsdk/ResponseDataConvertor;", "getDataConvertor", "()Lcom/common/support/okhttpforsdk/ResponseDataConvertor;", "Lcom/common/support/okhttpforsdk/HttpErrorHandler;", "httpErrorHandler", "Lcom/common/support/okhttpforsdk/HttpErrorHandler;", "getHttpErrorHandler", "()Lcom/common/support/okhttpforsdk/HttpErrorHandler;", "setHttpErrorHandler", "(Lcom/common/support/okhttpforsdk/HttpErrorHandler;)V", "<set-?>", "baseUrl", "Ljava/lang/String;", "getBaseUrl", "()Ljava/lang/String;", "setBaseUrl", "(Ljava/lang/String;)V", "<init>", "(Lo0ooOO0o/o0OoO00O;Ljava/lang/String;Lcom/common/support/okhttpforsdk/ResponseDataConvertor;Lcom/common/support/okhttpforsdk/HttpErrorHandler;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseApi {

    @NotNull
    private String baseUrl;

    @NotNull
    private final ResponseDataConvertor dataConvertor;

    @Nullable
    private HttpErrorHandler httpErrorHandler;

    @NotNull
    private final o0OoO00O okHttpClient;

    public BaseApi(@NotNull o0OoO00O okHttpClient, @NotNull String baseUrl, @NotNull ResponseDataConvertor dataConvertor, @Nullable HttpErrorHandler httpErrorHandler) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(dataConvertor, "dataConvertor");
        this.okHttpClient = okHttpClient;
        this.dataConvertor = dataConvertor;
        this.httpErrorHandler = httpErrorHandler;
        this.baseUrl = baseUrl;
        Intrinsics.checkNotNullParameter(baseUrl, "<this>");
        o0O000O.OooO00o oooO00o = new o0O000O.OooO00o();
        oooO00o.OooO0oO(null, baseUrl);
        if (!Intrinsics.areEqual(CollectionsKt.last((List) oooO00o.OooO0OO().OooO0OO()), "")) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("Default base url must end in /: ", baseUrl));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void async$default(BaseApi baseApi, o0O00O0o o0o00o0o, Type type, Function2 function2, Function1 function1, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: async");
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        baseApi.async(o0o00o0o, type, function2, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleHttpError$default(BaseApi baseApi, HttpResponse httpResponse, Function2 function2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleHttpError");
        }
        if ((i & 2) != 0) {
            function2 = null;
        }
        baseApi.handleHttpError(httpResponse, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object sync$default(BaseApi baseApi, o0O00O0o o0o00o0o, Type type, Function2 function2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sync");
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        return baseApi.sync(o0o00o0o, type, function2);
    }

    public final <T> void async(@NotNull o0O00O0o request, @NotNull final Type respType, @Nullable final Function2<? super Integer, ? super Throwable, Unit> httpFailAction, @NotNull final Function1<? super T, Unit> httpSuccessAction) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(respType, "respType");
        Intrinsics.checkNotNullParameter(httpSuccessAction, "httpSuccessAction");
        FirebasePerfOkHttpClient.enqueue(this.okHttpClient.OooO0O0(request), new o00OOO00() { // from class: com.common.support.okhttpforsdk.BaseApi.async.1
            @Override // p641o0ooOO0o.o00OOO00
            public void onFailure(@NotNull o00OO call, @NotNull IOException e) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e, "e");
                BaseApi.this.handleHttpError(RequestUtilKt.toHttpResponse(e), httpFailAction);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // p641o0ooOO0o.o00OOO00
            public void onResponse(@NotNull o00OO call, @NotNull o0O00o00 response) {
                HttpResponse httpResponse;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    httpResponse = RequestUtilKt.toHttpResponse(response, call, BaseApi.this.getDataConvertor(), respType);
                } catch (Throwable th) {
                    httpResponse = RequestUtilKt.toHttpResponse(th);
                }
                if (httpResponse.isSuccessful()) {
                    httpSuccessAction.invoke((T) httpResponse.getData());
                } else {
                    BaseApi.this.handleHttpError(httpResponse, httpFailAction);
                }
            }
        });
    }

    @NotNull
    public final <T> MutableLiveData<HttpResponse<T>> asyncByLiveData(@NotNull o0O00O0o request, @NotNull final Type respType) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(respType, "respType");
        o0000O0 o0000o0OooO0O0 = this.okHttpClient.OooO0O0(request);
        final MutableLiveData<HttpResponse<T>> mutableLiveData = new MutableLiveData<>();
        FirebasePerfOkHttpClient.enqueue(o0000o0OooO0O0, new o00OOO00() { // from class: com.common.support.okhttpforsdk.BaseApi.asyncByLiveData.1
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // p641o0ooOO0o.o00OOO00
            public void onFailure(@NotNull o00OO call, @NotNull IOException e) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e, "e");
                mutableLiveData.postValue((HttpResponse<T>) RequestUtilKt.toHttpResponse(e));
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // p641o0ooOO0o.o00OOO00
            public void onResponse(@NotNull o00OO call, @NotNull o0O00o00 response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    mutableLiveData.postValue((HttpResponse<T>) RequestUtilKt.toHttpResponse(response, call, this.getDataConvertor(), respType));
                } catch (Throwable th) {
                    mutableLiveData.postValue((HttpResponse<T>) RequestUtilKt.toHttpResponse(th));
                }
            }
        });
        return mutableLiveData;
    }

    @NotNull
    public final o0O00O0o get(@NotNull String path, @NotNull Pair<String, ? extends Object>... queryParams) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(queryParams, "queryParams");
        return RequestUtil.INSTANCE.createGetRequest(this.baseUrl, path, (Pair[]) Arrays.copyOf(queryParams, queryParams.length));
    }

    @NotNull
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    @NotNull
    public final ResponseDataConvertor getDataConvertor() {
        return this.dataConvertor;
    }

    @Nullable
    public final HttpErrorHandler getHttpErrorHandler() {
        return this.httpErrorHandler;
    }

    @NotNull
    public final o0OoO00O getOkHttpClient() {
        return this.okHttpClient;
    }

    public <T> void handleHttpError(@NotNull HttpResponse<T> httpResp, @Nullable Function2<? super Integer, ? super Throwable, Unit> httpFailedAction) {
        Unit unit;
        HttpErrorHandler httpErrorHandler;
        Intrinsics.checkNotNullParameter(httpResp, "httpResp");
        if (httpFailedAction == null) {
            unit = null;
        } else {
            httpFailedAction.invoke(Integer.valueOf(httpResp.getCode()), httpResp.getThrowable());
            unit = Unit.INSTANCE;
        }
        if (unit != null || (httpErrorHandler = this.httpErrorHandler) == null) {
            return;
        }
        httpErrorHandler.handle(httpResp.getCode(), httpResp.getThrowable());
    }

    @NotNull
    public final o0O00O0o post(@NotNull String path, @NotNull Pair<String, String>... bodies) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(bodies, "bodies");
        return post(path, RequestUtil.INSTANCE.createFormBody((Pair[]) Arrays.copyOf(bodies, bodies.length)));
    }

    public final void setBaseUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.baseUrl = str;
    }

    public final void setHttpErrorHandler(@Nullable HttpErrorHandler httpErrorHandler) {
        this.httpErrorHandler = httpErrorHandler;
    }

    @Nullable
    public final <T> T sync(@NotNull o0O00O0o request, @NotNull Type respType, @Nullable Function2<? super Integer, ? super Throwable, Unit> httpFailAction) {
        HttpResponse<T> httpResponse;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(respType, "respType");
        o0000O0 o0000o0OooO0O0 = this.okHttpClient.OooO0O0(request);
        try {
            httpResponse = RequestUtilKt.toHttpResponse(FirebasePerfOkHttpClient.execute(o0000o0OooO0O0), o0000o0OooO0O0, this.dataConvertor, respType);
        } catch (Throwable th) {
            httpResponse = RequestUtilKt.toHttpResponse(th);
        }
        if (httpResponse.isSuccessful()) {
            return httpResponse.getData();
        }
        handleHttpError(httpResponse, httpFailAction);
        return null;
    }

    @NotNull
    public final o0O00O0o post(@NotNull String path, @NotNull o0oO0Ooo requestBody) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        return RequestUtil.INSTANCE.createPostRequest(this.baseUrl, path, requestBody);
    }

    public /* synthetic */ BaseApi(o0OoO00O o0ooo00o2, String str, ResponseDataConvertor responseDataConvertor, HttpErrorHandler httpErrorHandler, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HttpService.INSTANCE.getDefaultClient() : o0ooo00o2, str, responseDataConvertor, (i & 8) != 0 ? null : httpErrorHandler);
    }
}
