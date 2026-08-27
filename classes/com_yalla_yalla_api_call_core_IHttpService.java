package com.yalla.yalla.api.call.core;

import com.facebook.internal.NativeProtocol;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\bJ.\u0010\t\u001a\u00020\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\bJI\u0010\n\u001a\u00020\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u0019\b\u0001\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\f0\u0005H§@¢\u0006\u0002\u0010\rJ8\u0010\u000e\u001a\u00020\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0010H§@¢\u0006\u0002\u0010\u0011J8\u0010\u0012\u001a\u00020\u00032\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0001H§@¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/api/call/core/IHttpService;", "", "getAsync", "Lokhttp3/ResponseBody;", "headers", "", "", "url", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAsync", "postFormAsync", "data", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postBodyAsync", "body", "Lokhttp3/RequestBody;", "(Ljava/util/Map;Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postJsonAsync", NativeProtocol.WEB_DIALOG_PARAMS, "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Common_YallaRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IHttpService {
    @GET
    @Nullable
    Object getAsync(@HeaderMap @NotNull Map<String, String> map, @Url @NotNull String str, @NotNull Continuation<? super ResponseBody> continuation);

    @POST
    @Nullable
    Object postAsync(@HeaderMap @NotNull Map<String, String> map, @Url @NotNull String str, @NotNull Continuation<? super ResponseBody> continuation);

    @POST
    @Nullable
    Object postBodyAsync(@HeaderMap @NotNull Map<String, String> map, @Url @NotNull String str, @Body @NotNull RequestBody requestBody, @NotNull Continuation<? super ResponseBody> continuation);

    @FormUrlEncoded
    @POST
    @Nullable
    Object postFormAsync(@HeaderMap @NotNull Map<String, String> map, @Url @NotNull String str, @FieldMap @NotNull Map<String, Object> map2, @NotNull Continuation<? super ResponseBody> continuation);

    @POST
    @Nullable
    Object postJsonAsync(@HeaderMap @NotNull Map<String, String> map, @Url @NotNull String str, @Body @NotNull Object obj, @NotNull Continuation<? super ResponseBody> continuation);
}
