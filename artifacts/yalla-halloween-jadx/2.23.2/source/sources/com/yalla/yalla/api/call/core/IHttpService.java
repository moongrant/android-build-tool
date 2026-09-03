package com.yalla.yalla.api.call.core;

import com.facebook.internal.NativeProtocol;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o0O00oO0;
import p641o0ooOO0o.o0oO0Ooo;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Url;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J3\u0010\u0007\u001a\u00020\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\t\u001a\u00020\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0003H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJN\u0010\f\u001a\u00020\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\u0019\b\u0001\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\n0\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0010\u001a\u00020\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0013\u001a\u00020\u00062\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/api/call/core/IHttpService;", "", "", "", "headers", "url", "Lo0ooOO0o/o0O00oO0;", "getAsync", "(Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAsync", "Lkotlin/jvm/JvmSuppressWildcards;", "data", "postFormAsync", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lo0ooOO0o/o0oO0Ooo;", "body", "postBodyAsync", "(Ljava/util/Map;Ljava/lang/String;Lo0ooOO0o/o0oO0Ooo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", NativeProtocol.WEB_DIALOG_PARAMS, "postJsonAsync", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public interface IHttpService {
    @GET
    @Nullable
    Object getAsync(@HeaderMap @NotNull Map<String, String> map, @Url @NotNull String str, @NotNull Continuation<? super o0O00oO0> continuation);

    @POST
    @Nullable
    Object postAsync(@HeaderMap @NotNull Map<String, String> map, @Url @NotNull String str, @NotNull Continuation<? super o0O00oO0> continuation);

    @POST
    @Nullable
    Object postBodyAsync(@HeaderMap @NotNull Map<String, String> map, @Url @NotNull String str, @Body @NotNull o0oO0Ooo o0oo0ooo2, @NotNull Continuation<? super o0O00oO0> continuation);

    @FormUrlEncoded
    @POST
    @Nullable
    Object postFormAsync(@HeaderMap @NotNull Map<String, String> map, @Url @NotNull String str, @FieldMap @NotNull Map<String, Object> map2, @NotNull Continuation<? super o0O00oO0> continuation);

    @POST
    @Nullable
    Object postJsonAsync(@HeaderMap @NotNull Map<String, String> map, @Url @NotNull String str, @Body @NotNull Object obj, @NotNull Continuation<? super o0O00oO0> continuation);
}
