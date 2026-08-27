package com.yalla.yalla.api.call.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.old.OooOOO;
import com.yalla.yalla.domain.DomainType;
import com.yalla.yalla.domain.OooOo00;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Retrofit;
import retrofit2.http.HeaderMap;

/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\t\u001a\u00020\b2\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000b\u001a\u00020\b2\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u000b\u0010\nJB\u0010\r\u001a\u00020\b2\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0086@¢\u0006\u0004\b\r\u0010\u000eJ6\u0010\u000f\u001a\u00020\b2\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0013\u001a\u00020\b2\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/api/call/core/HttpCoreRequest;", "", "<init>", "()V", "", "", "headers", "url", "Lokhttp3/ResponseBody;", "get", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "post", "paras", "postForm", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postJson", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/RequestBody;", "body", "postBody", "(Ljava/util/Map;Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Common_YallaRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpCoreRequest {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final HttpCoreRequest f44958OooO00o = new HttpCoreRequest();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static Retrofit f44959OooO0O0;

    public static IHttpService OooO00o() {
        if (f44959OooO0O0 == null) {
            Retrofit.Builder builderClient = new Retrofit.Builder().client((OkHttpClient) OooOOO.f45025OooO00o.getValue());
            Lazy lazy = OooOo00.f49344OooO00o;
            f44959OooO0O0 = builderClient.baseUrl(OooOo00.OooO0Oo(DomainType.Main)).build();
        }
        Retrofit retrofit = f44959OooO0O0;
        Intrinsics.checkNotNull(retrofit);
        Object objCreate = retrofit.create(IHttpService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        return (IHttpService) objCreate;
    }

    @Nullable
    public final Object get(@HeaderMap @NotNull Map<String, String> map, @NotNull String str, @NotNull Continuation<? super ResponseBody> continuation) {
        return OooO00o().getAsync(map, str, continuation);
    }

    @Nullable
    public final Object post(@HeaderMap @NotNull Map<String, String> map, @NotNull String str, @NotNull Continuation<? super ResponseBody> continuation) {
        return OooO00o().postAsync(map, str, continuation);
    }

    @Nullable
    public final Object postBody(@HeaderMap @NotNull Map<String, String> map, @NotNull String str, @NotNull RequestBody requestBody, @NotNull Continuation<? super ResponseBody> continuation) {
        return OooO00o().postBodyAsync(map, str, requestBody, continuation);
    }

    @Nullable
    public final Object postForm(@HeaderMap @NotNull Map<String, String> map, @NotNull String str, @NotNull Map<String, ? extends Object> map2, @NotNull Continuation<? super ResponseBody> continuation) {
        return OooO00o().postFormAsync(map, str, map2, continuation);
    }

    @Nullable
    public final Object postJson(@HeaderMap @NotNull Map<String, String> map, @NotNull String str, @NotNull Object obj, @NotNull Continuation<? super ResponseBody> continuation) {
        return OooO00o().postJsonAsync(map, str, obj, continuation);
    }
}
